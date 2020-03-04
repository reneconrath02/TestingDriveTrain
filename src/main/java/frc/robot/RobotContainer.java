/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.ArmCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.subsystems.ArmSubsystem;
import frc.robot.subsystems.DriveSub;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.IntakeSub;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  //backL is actually intake
  //frontL is actually climb
  //intake2 is actually left side
  //intake1 is actually right side

  public static VictorSPX intake = new VictorSPX(1);
  public static VictorSPX climb = new VictorSPX(3);
  public static VictorSPX arm = new VictorSPX(5);

  public static WPI_TalonSRX right1 = new WPI_TalonSRX(1);
  public static WPI_TalonSRX left1 = new WPI_TalonSRX(2);
  public static VictorSPX left2 = new VictorSPX(0);
  public static VictorSPX right2 = new VictorSPX(4);

  // public static SpeedController left = new SpeedControllerGroup(right1, left1);
  // public static SpeedController right = new SpeedControllerGroup(left2, right2);

  // public static DifferentialDrive arcDrive = new DifferentialDrive(left, right);

  // public static VictorSPX intake = new VictorSPX(1);

  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  public static DriveSub driveSub = new DriveSub();
  public static IntakeSub intakeSub = new IntakeSub();
  public static ArmSubsystem armSub = new ArmSubsystem();

  public static Joystick joystick = new Joystick(0);
  public static JoystickButton da = new JoystickButton(joystick, 1);
  public static JoystickButton db = new JoystickButton(joystick, 2);
  public static JoystickButton dx = new JoystickButton(joystick, 3);
  public static JoystickButton dy = new JoystickButton(joystick, 4);
  public static JoystickButton dbumperLeft = new JoystickButton(joystick, 5);
  public static JoystickButton dbumperRight = new JoystickButton(joystick, 6);
  public static JoystickButton dback = new JoystickButton(joystick, 7);
  public static JoystickButton dstart = new JoystickButton(joystick, 8);
  public static JoystickButton dterribleLeft = new JoystickButton(joystick, 9);
  public static JoystickButton dterribleRight = new JoystickButton(joystick, 10);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {

    driveSub.setDefaultCommand(new DriveCommand());
    intakeSub.setDefaultCommand(new IntakeCommand());
    armSub.setDefaultCommand(new ArmCommand());
    // drive.setDefaultCommand(new RunCommand(() -> DriveTrain.driveTrain(joystick.getRawAxis(0), joystick.getRawAxis(4)), drive));

    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
