package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj.XboxController;

@SuppressWarnings("unused")
public class Climber extends SubsystemBase {
    private final SparkMax climberMotor;

    public Climber() {
        climberMotor = new SparkMax(Constants.ClimberConstants.climberMotor, MotorType.kBrushless); // CAN ID 13
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void climb(double speed) {
        climberMotor.set(speed); // Set motor to full speed up
    }


    public void stopClimb() {
        climberMotor.stopMotor(); // Stop the motor
    }
}