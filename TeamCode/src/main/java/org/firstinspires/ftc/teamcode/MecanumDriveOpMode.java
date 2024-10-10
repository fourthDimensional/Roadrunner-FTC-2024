package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.commands.TestMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.BasicMecanumDrive;

@TeleOp(name= "MecanumDriveOpMode", group="Test")
public class MecanumDriveOpMode extends CommandOpMode {
    private BasicMecanumDrive m_basicMecanumDrive;

    @Override
    public void initialize() {
        final GamepadEx driver = new GamepadEx(gamepad1);

        m_basicMecanumDrive = new BasicMecanumDrive(
                hardwareMap.get(DcMotor.class, "frontLeft"),
                hardwareMap.get(DcMotor.class, "frontRight"),
                hardwareMap.get(DcMotor.class, "backLeft"),
                hardwareMap.get(DcMotor.class, "backRight"));

        m_basicMecanumDrive.setDefaultCommand(new TestMecanumDrive(m_basicMecanumDrive, driver));
    }
}
