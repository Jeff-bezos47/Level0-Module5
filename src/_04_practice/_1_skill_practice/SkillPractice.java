package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkillPractice skills = new SkillPractice();
		skills.skill1();
		System.out.println(skills.skill1());
	}

	int skill1() {
		String uno = JOptionPane.showInputDialog("How many dimes do you have");
		int one = Integer.parseInt(uno);
		 return multiply(one, 10);
		 
		
	}

	int multiply(int m, int j) {
		return m * j;
	}
}