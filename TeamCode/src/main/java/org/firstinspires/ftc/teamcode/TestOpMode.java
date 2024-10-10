package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.subsystems.ExampleArmSubsystem;
import org.firstinspires.ftc.teamcode.subsystems.TestSubsystem;
import org.firstinspires.ftc.teamcode.commands.*;

@TeleOp(name= "TestOpMode", group="Test")
public class TestOpMode extends CommandOpMode {
    private TestSubsystem m_testSubsystem;

    @Override
    public void initialize() {
        final GamepadEx driver = new GamepadEx(gamepad1);

        // This is for the subsystem requirements
        m_testSubsystem = new TestSubsystem(hardwareMap.get(DcMotor.class, "testMotor"));
        

        // This will make the default for the test subsystems.
        m_testSubsystem.setDefaultCommand(new TestDriveCommand(m_testSubsystem, driver));
    }
}
