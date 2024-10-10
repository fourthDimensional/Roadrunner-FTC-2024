package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import org.firstinspires.ftc.teamcode.subsystems.BasicMecanumDrive;

public class TestMecanumDrive extends CommandBase {
    private final BasicMecanumDrive m_basicMecanumDrive;
    private final GamepadEx gamepad;

    /**
     * Command to set the drive motors in Mecanum drive
     *
     * @param basicMecanumDrive The subsystem to pull from
     * @param gamepad The gamepad to complete the command
     */
    public TestMecanumDrive(BasicMecanumDrive basicMecanumDrive, GamepadEx gamepad){
        this.m_basicMecanumDrive = basicMecanumDrive;
        this.gamepad = gamepad;

        addRequirements(m_basicMecanumDrive);
    }

    @Override
    public void initialize(){
        m_basicMecanumDrive.mecanumDrive(gamepad);
    }

    @Override
    public void execute(){

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
