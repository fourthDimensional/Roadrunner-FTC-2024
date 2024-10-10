package org.firstinspires.ftc.teamcode.subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.arcrobotics.ftclib.geometry.Translation2d;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class BasicMecanumDrive extends SubsystemBase {
    private final DcMotor frontLeft;
    private final DcMotor frontRight;
    private final DcMotor backLeft;
    private final DcMotor backRight;

    /**
     * Example of a basic mecanum drive system.
     *
     * @param frontLeft  Front Left Motor
     * @param frontRight Front Right Motor
     * @param backLeft   Back Left Motor
     * @param backRight  Back Right Motor
     */
    public BasicMecanumDrive(
            DcMotor frontLeft, DcMotor frontRight,
            DcMotor backLeft, DcMotor backRight) {

        // Set the motor objects
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;

        //Initialize direction
        frontLeft.setDirection(DcMotor.Direction.REVERSE);
        backLeft.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void periodic() {

    }

    public void mecanumDrive(GamepadEx gamepad) {

        // Setting the powers
        double x = gamepad.getLeftX();
        double y = gamepad.getLeftY();
        double t = gamepad.getRightX();

        frontLeft.setPower(y + x + t);
        frontRight.setPower(y - x + t);
        backLeft.setPower(y - x - t);
        backRight.setPower(y + x - t);
    }
}