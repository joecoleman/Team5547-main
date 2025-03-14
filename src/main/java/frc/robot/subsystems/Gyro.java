// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADIS16470_IMU;
import edu.wpi.first.wpilibj.ADIS16470_IMU.IMUAxis;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class Gyro extends SubsystemBase {
  private final ADIS16470_IMU m_gyro = new ADIS16470_IMU();

  /** Creates a new Gyro. */
  public Gyro() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public double getAngle() {
    return m_gyro.getAngle(IMUAxis.kZ);
  }

  public void reset() {
    m_gyro.reset();
  }

  public double getTurnRate() {
    return m_gyro.getRate(IMUAxis.kZ) * (DriveConstants.kGyroReversed ? -1.0 : 1.0);
  }
}
