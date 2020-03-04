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

public class ArmSubsystem extends SubsystemBase {
  /**
   * Creates a new ArmSubsystem.
   */
  public ArmSubsystem() {

  }
  public void arm(){
    if(RobotContainer.da.get()){
      RobotContainer.arm.set(ControlMode.PercentOutput, -0.4);
    }else if (RobotContainer.db.get()){
      RobotContainer.arm.set(ControlMode.PercentOutput, 0.25);
    } else {
      RobotContainer.arm.set(ControlMode.PercentOutput, 0);
    }
  } 

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
