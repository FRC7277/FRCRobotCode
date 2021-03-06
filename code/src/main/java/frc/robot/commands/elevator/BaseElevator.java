/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.elevator;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.DigitalInput;

import frc.robot.Robot;

public class BaseElevator extends Command {

  private DigitalInput[] switches;

  public BaseElevator() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.elevator);

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.elevator.setSpeed(0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    this.end();
  }

  /**
   * 
   * @return The index in RobotMap.switches of the DI the elevator is on
   */
  public int getPosition() {

    // Iterate through each DigitalInput
    for (int x = 0; x < Robot.elevator.getSwitches().length; x++) {

      // Check if the switch is pressed and return if it is
      if (Robot.elevator.getSwitches()[x].get()) {
        return x;
      }

    }
    // -1 signal to represent no switches pressed
    return -1;

  }

  public DigitalInput[] getSwitches() {
    return switches;
  }

}
