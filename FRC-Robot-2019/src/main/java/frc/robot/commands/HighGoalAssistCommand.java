package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.RotateArmToAngleCommand;

public class HighGoalAssistCommand extends CommandGroup {
    public HighGoalAssistCommand() {
        addSequential(new RotateArmToAngleCommand(60));
        addSequential(new ExtendArmToPositionCommand(12));
    }
}