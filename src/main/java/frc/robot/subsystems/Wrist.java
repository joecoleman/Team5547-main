package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

public class Wrist extends SubsystemBase {

    private final SparkMax wristMotor;

    public Wrist() {

        wristMotor = new SparkMax(16, MotorType.kBrushless); // CAN ID 16

        // Set the secondary motor to hold its position when not moving
        wristMotor.configure(new SparkMaxConfig().idleMode(IdleMode.kBrake), ResetMode.kNoResetSafeParameters,
                PersistMode.kPersistParameters);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    public void moveUp(double speed) {
        wristMotor.set(speed); // Set motor to speed up
    }

    public void moveDown(double speed) {
        wristMotor.set(-.2); // Set motor to speed down
    }

    public void stop() {
        wristMotor.set(0); // Stop the motor
    }

    public void hold() {
        wristMotor.setVoltage(0.5);
    }
}