/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

//Comment

package frc.robot.commands.elevator;

import frc.robot.Robot;
import frc.robot.RobotMap;


public class AlignElevator extends BaseElevator {

  private double power;
  private double timeout;

  /**
   * Moves the elevator in the direction until it reaches a switch
   */
  public AlignElevator(double direction, double timeout) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    super();

    this.power = direction;
    this.timeout = timeout;
  }

  public AlignElevator(double direction) {
    this(direction, RobotMap.elevatorTimeout);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    Robot.elevator.setSpeed(this.power);
    setTimeout(this.timeout);

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    super.execute();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return isTimedOut() || (getPosition() != -1);
  }

  
  // Called once after isFinished returns true
  @Override
  protected void end() {
    super.end();
    Robot.lastEP = getPosition();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    super.end();
    Robot.lastEP = -1;
  }

}
