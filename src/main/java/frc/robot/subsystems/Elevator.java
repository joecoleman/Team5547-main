package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;


public class Elevator extends SubsystemBase {
    private final SparkMax elevatorMotor;

    public Elevator() {
        elevatorMotor = new SparkMax(14, MotorType.kBrushless); // CAN ID 14
    }

    @Override
    public void periodic() {
    }

    public void move(double speed) {
        elevatorMotor.set(speed); // Set motor to speed up
    }


    public void stop() {
        elevatorMotor.set(0); // Stop the motor
    }

    public void hold () {
        elevatorMotor.setVoltage(.2); // hold output to set number
    }
}