package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.subsystems.TestSubsystem;

public class TestDriveCommand extends CommandBase {

    private final TestSubsystem m_testSubsystem;

    private final GamepadEx gamepad;
    /**
     * Command to set the test motor to run forwards at specified speed in <code>Constants.java</code>.
     *
     * @param testSubsystem Parent subsystem - Currently TestSubsystem
     *
     * @see org.firstinspires.ftc.teamcode.Constants
     */
    public TestDriveCommand(TestSubsystem testSubsystem, GamepadEx gamepad) {
        this.gamepad = gamepad;
        this.m_testSubsystem = testSubsystem;
        addRequirements(m_testSubsystem);
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        m_testSubsystem.drive(gamepad.getLeftY());
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
