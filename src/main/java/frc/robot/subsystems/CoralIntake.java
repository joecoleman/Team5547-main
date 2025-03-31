package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;

public class CoralIntake extends SubsystemBase {
    private final SparkMax intakeMotor;

    public CoralIntake() {
        intakeMotor = new SparkMax(Constants.CoralIntakeConstants.intakeMotor, MotorType.kBrushless); // CAN ID 15
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void intake(double speed) {
        intakeMotor.set(speed); // Set motor to intake
    }

    public void eject(double speed) {
        intakeMotor.set(-.5); // Set motor to eject
    }

    public void stop() {
        intakeMotor.stopMotor(); // Stop the motor
    }

    
}