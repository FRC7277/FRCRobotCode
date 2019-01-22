/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

// Import Robot superclass
import edu.wpi.first.wpilibj.TimedRobot;

// Import command and schedular classes
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

// Import subsystems
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.ElevatorLift;
import frc.robot.subsystems.HatchPlacer;
import frc.robot.subsystems.Intake;

// Import utils
import frc.robot.utils.GripPipeline;
import frc.robot.utils.VisionThread;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

    // Create subsystems used by buttons (need to be created before OI)
    public static HatchPlacer hatcher = new HatchPlacer();
    public static Intake intake = new Intake();

    // Create OI object
    public static OI m_oi = new OI();

    // Create subsystem that use buttons/joysticks (need to be created after OI)
    public static DriveTrain m_drivetrain = new DriveTrain();
    public static ElevatorLift elevator = new ElevatorLift();
    
    //Create GripPipeline Object
    public static GripPipeline pipeline = new GripPipeline();

    // Create VisionThread
    public static VisionThread visionProcess = new VisionThread();

    //Creating the syncronizing object
    public static final Object imgLock = new Object();


    /**
     * This function is run when the robot is first started up and should be used
     * for any initialization code.
     */
    @Override
    public void robotInit() {

        // Create thread for processing camera vision (asynchrous)
        visionProcess.start();
    }

    /**
     * This function is called every robot packet, no matter the mode. Use this for
     * items like diagnostics that you want ran during disabled, autonomous,
     * teleoperated and test.
     *
     * <p>
     * This runs after the mode specific periodic functions, but before LiveWindow
     * and SmartDashboard integrated updating.
     */
    @Override
    public void robotPeriodic() {
    }

    /**
     * This function is called once each time the robot enters Disabled mode. You
     * can use it to reset any subsystem information you want to clear when the
     * robot is disabled.
     */
    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This autonomous (along with the chooser code above) shows how to select
     * between different autonomous modes using the dashboard. The sendable chooser
     * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
     * remove all of the chooser code and uncomment the getString code to get the
     * auto name from the text box below the Gyro
     *
     * <p>
     * You can add additional auto modes by adding additional commands to the
     * chooser code above (like the commented example) or additional comparisons to
     * the switch structure below with additional strings & commands.
     */
    @Override
    public void autonomousInit() {

    }

    /**
     * This function is called periodically during autonomous.
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        //Remember to cancel an autonomous command if we run one
    }

    /**
     * This function is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during test mode.
     */
    @Override
    public void testPeriodic() {
    }
}
