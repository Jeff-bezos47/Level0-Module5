package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

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
static void circle(Robot job) {
	for(int batapim = 0; batapim<60; batapim++) {
		job.move(10);
		job.turn(6);
	}
}
static void drawCharacter(Robot gob) {
    // Draw HEAD (circle)
    gob.penDown();
    for (int i = 0; i < 36; i++) {  // smoother circle with 10° turns
        gob.move(5);
        gob.turn(10);
    }
    gob.penUp();

    // Move down to BODY start (from bottom of head)
    gob.turn(90);
    gob.move(30);
    gob.turn(-90);

    // Draw BODY (rectangle)
    gob.penDown();
    gob.move(80);
    gob.turn(90);
    gob.move(40);
    gob.turn(90);
    gob.move(80);
    gob.turn(90);
    gob.move(40);
    gob.turn(90);
    gob.penUp();

    // Move to LEFT ARM start
    gob.move(10);
    gob.turn(90);
    gob.move(10);
    gob.turn(-90);

    // Draw LEFT ARM
    gob.penDown();
    gob.turn(-40);
    gob.move(50);
    gob.penUp();

    // Return to BODY edge
    gob.turn(180);
    gob.move(50);
    gob.turn(40);

    // Move to RIGHT ARM start
    gob.move(40);

    // Draw RIGHT ARM
    gob.penDown();
    gob.turn(40);
    gob.move(50);
    gob.penUp();

    // Return to BODY bottom center
    gob.turn(180);
    gob.move(50);
    gob.turn(-40);
    gob.turn(-90);
    gob.move(80);
    gob.turn(90);

    // Draw LEFT LEG
    gob.penDown();
    gob.turn(-20);
    gob.move(60);
    gob.penUp();

    // Return to BODY bottom center
    gob.turn(180);
    gob.move(60);
    gob.turn(20);

    // Move to RIGHT LEG start
    gob.move(30);

    // Draw RIGHT LEG
    gob.penDown();
    gob.turn(20);
    gob.move(60);
    gob.penUp();

    // Return to BODY bottom center and reset direction
    gob.turn(180);
    gob.move(60);
    gob.turn(-20);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robby = new Robot();
		robby.penDown();
		robby.setSpeed(50);

		robby.turn(-90);
		String brobot = JOptionPane.showInputDialog("what shape do you want");
		if(brobot.equals("square")) {
			square(robby);
		}
		if(brobot.equals("triangle")) {
			triangle(robby);
		}
		if(brobot.equals("circle")) {
			circle(robby);
		}
		if(brobot.equals("all of em")) {
			square(robby);
			triangle(robby);
			circle(robby);
		}
		if(brobot.equals("")) {
			drawCharacter(robby);
			robby.hide();
	}
	}
}
