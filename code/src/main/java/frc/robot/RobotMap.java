/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    

    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;

    // Drive train motors (CAN)
    public static final int leftBack = 2;
    public static final int leftFront = 4;
    public static final int rightBack = 1;
    public static final int rightFront = 3;

    // Drive joy modifiers
    public static final double zMod = 0.6;
    
    // Joystick number
    public static final int joystick = 0;
    public static final int controller = 1;

    // Elevator lift motors (CAN)
    public static final int elevatorMotor = 5;

    // Intake motors
    public static final int rightIntake = 7;
    public static final int leftIntake = 8;

    // Hab lift motor
    public static final int habLift = 6; //TODO find the mapping for this and all the CAN motors
    // Time to lifting in seconds
    public static final double habTime = 0.1; // TODO determine actual time
    public static final double habModifier = 1;

    // Elevator speed constant
    public static final double elevatorModifier = 1;
    public static final double elevatorTimeout = 10.0;
    public static final double elevatorPassive = 0.0; //TODO test this out
    public static final double elevatorTimePerInch = 0.01;

    // Pneumatic
    public static final int pcm = 7; // CAN bus number
    public static final int solenoid = 0;
    public static final double solenoidTime = 0.75;

    // Controller button mappings
    public static final int aButton = 1; 
    public static final int bButton = 2; //B button
    public static final int xButton = 3;
    public static final int yButton = 4;

    public static final int lbButton = 5;
    public static final int rbButton = 6;

    //Joystick button mappings
    public static final int joystickSideButton = 1;

    // Limit switch references (Bottom to Top)
    public static final int[] switches = {2};

    // Auto align timeout
    public static final double alignTimeout = 2;
    
}
