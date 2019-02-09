package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class RotateArmToAngleCommand extends Command {
    private double angle;

    public RotateArmToAngleCommand(double angle) {
        this.angle = angle;
        requires(Robot.arm);
    }

    @Override
    protected void execute() {
        Robot.arm.rotateToPosition(angle);
    }

    protected boolean isFinished() {
        return Math.abs(Robot.arm.getAngle() - angle) < 1;
    }
}