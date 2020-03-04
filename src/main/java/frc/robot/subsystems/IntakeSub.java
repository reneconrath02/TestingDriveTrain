/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class IntakeSub extends SubsystemBase {
  /**
   * Creates a new IntakeSub.
   */
  public IntakeSub() {

  }

  public void intake(){
    if(RobotContainer.joystick.getRawAxis(2) > 0.1){
      RobotContainer.intake.set(ControlMode.PercentOutput, RobotContainer.joystick.getRawAxis(2));
    }else if(RobotContainer.joystick.getRawAxis(3) > 0.1){
      RobotContainer.intake.set(ControlMode.PercentOutput, -RobotContainer.joystick.getRawAxis(3));
    }else{
      RobotContainer.intake.set(ControlMode.PercentOutput, 0);
    }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
