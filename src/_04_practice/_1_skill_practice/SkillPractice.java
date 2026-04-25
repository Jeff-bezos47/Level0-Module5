package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
         //  skills.skill1();
         //  skills.skill2();
          // skills.skill3();
          // skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have




// Tell them how many cents they have (hint multiply by 10)




// Ask the user how tall they are (inches)
	String skill = JOptionPane.showInputDialog("How tall are you");



// If they are shorter than 36 inches, tell them to eat their Wheaties
	int supa = Integer.parseInt(skill);
if(supa<36) {
	JOptionPane.showMessageDialog(null, "go eat your wheaties");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console
for(int loopus = 1; loopus<31; loopus+=3) {
	System.out.println(loopus);
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console
Random ran = new Random();
int brobot = ran.nextInt(20);

// Get another random number that is less than 10 and print it to the console
int brotato = ran.nextInt(10);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
int brochacho = brobot-brotato;
JOptionPane.showMessageDialog(null, "the diffrence between " + brobot+" and " + brotato+" is "+ brochacho);


}

void skill4() { // In a pop-up, ask the user for the city they live in
	String skool = JOptionPane.showInputDialog("what city do you live in");


// If they answered "San Diego", tell them they live in America's Finest City
if(skool.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in americas finest city (which is pretty rad)");
}


// Otherwise, tell them to move to San Diego
else {
	JOptionPane.showMessageDialog(null, "go move to San Diego");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int cars = 2;
if(cars==0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation");
}

// If there is 1 car, use a pop-up to display the make/model of the car
else if(cars==1) {
JOptionPane.showMessageDialog(null, "car");
}

// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.
else JOptionPane.showMessageDialog(null, "8 wheels");


}

void skill5() { // In a pop-up, ask the user for the name of their school
	String school = JOptionPane.showInputDialog("what school do you go to");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
	JOptionPane.showMessageDialog(null, school+" is a fantastic school, definitly better than black mountain");


}
}
