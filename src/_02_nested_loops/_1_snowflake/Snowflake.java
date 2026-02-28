package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
		Robot rob = new Robot();

		// #2. Set your robot’s position to x=300 and y=300
		rob.moveTo(300, 300);

		// #3. Put the robot's pen down
		rob.penDown();

		// #4. Set the robot’s speed to 5
		rob.setSpeed(50);

		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
		for(int brobot = 0; brobot<6; brobot++) {
			
			// #6. Set the pen color to black
			rob.setPenColor(0, 0, 0);
			
			// #7. move the robot by 50
			rob.move(50);
			
			// #8. turn the robot to the right by 60
			rob.turn(60);
			
			// #12. set the pen color to blue for even numbers of i
			if(brobot%2 == 0) {
			rob.setPenColor( new Color( 29, 55, 250, 255));
			}
			// #13. set the pen color to red for all odd numbers of i
			else {
				rob.setPenColor(235, 19, 15);
			}
			
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			for(int snow = 0; snow<6; snow++) {
			
					// #10. turn the robot to the left by 60
					rob.turn(-60);
					
					// #11. move the robot by 50 (play the start button)
					rob.move(50);
				
			}
			// #14. set the pen color to black
			rob.setPenColor(0,0,0);
		}	
		
	}

}
