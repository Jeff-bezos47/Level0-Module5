package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class lil_methods {
	static void square(Robot rob) {
		
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
	}
static void triangle(Robot bob) {
	bob.move(100);
	bob.turn(120);
	bob.move(100);
	bob.turn(120);
	bob.move(100);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robby = new Robot();
		robby.penDown();
		robby.setSpeed(5);

		square(robby);
		triangle(robby);
	}

}
