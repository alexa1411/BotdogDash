package org.usfirst.frc.team4645.robot.subsystems;

import org.usfirst.frc.team4645.robot.RobotMap;
import org.usfirst.frc.team4645.robot.commands.Turn;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Motor extends Subsystem {

	private WPI_TalonSRX motor = new WPI_TalonSRX(RobotMap.motor1);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public void setMotor(double spd) {
		motor.set(spd);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Turn());
    }
}

