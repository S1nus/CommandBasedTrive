
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
/**
 *
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive driveTrain;
    public DriveTrain() {
        driveTrain = new RobotDrive(RobotMap.fRightMotor, RobotMap.rRightMotor, RobotMap.fLeftMotor, RobotMap.rLeftMotor);
    }
    
    public void driveWithSticks(Joystick leftStick, Joystick rightStick) {
        driveTrain.tankDrive(leftStick, rightStick);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}