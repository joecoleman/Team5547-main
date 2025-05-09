// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Wrist;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class MoveWristToSetpoint extends Command {
  private Wrist m_wrist;
  private double targetRotations;
  /** Creates a new MoveWristToSetpoint. */
  public MoveWristToSetpoint(Wrist wrist, double targetRotations) {
    this.m_wrist = wrist;
    this.targetRotations = targetRotations;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_wrist.moveUp(.15);
  }

  

  // Returns true when the command should end.
  @Override
  public boolean isFinished(){
    return m_wrist.getRotations() > targetRotations;}

  @Override
  public void end(boolean interrupted) {
      m_wrist.hold();
    }}
   
   

