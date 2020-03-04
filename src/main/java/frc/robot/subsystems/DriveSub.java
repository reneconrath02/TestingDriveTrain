/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class DriveSub extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  public DriveSub() {

  }

  public static void teleDrive(){
    RobotContainer.right1.set(RobotContainer.joystick.getRawAxis(5));
    RobotContainer.right2.set(ControlMode.PercentOutput, RobotContainer.joystick.getRawAxis(5));

    RobotContainer.left1.set(-RobotContainer.joystick.getRawAxis(1));
    RobotContainer.left2.set(ControlMode.PercentOutput, -RobotContainer.joystick.getRawAxis(1));

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
