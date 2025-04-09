// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class BasicDriveAutonLeft extends Command {
  private final DriveSubsystem m_drive;
  private final double distance;
  private double encoderSetpoint;


  /** Creates a new BasicDriveAuton. */
  public BasicDriveAutonLeft(DriveSubsystem drive, double distance) {
    this.m_drive = drive;
    this.distance = distance;
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
      encoderSetpoint = m_drive.getPose().getX() + distance;}
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drive.drive(.0, .10, 0, true);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drive.drive(0, 0, 0, true);
  }

  // Returns true when the command should end.
@Override
public boolean isFinished() {
  if (m_drive.getPose().getX() >= encoderSetpoint)
    return true;
  else
    return false;
}
}
