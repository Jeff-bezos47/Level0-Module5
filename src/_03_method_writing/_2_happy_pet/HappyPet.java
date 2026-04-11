package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 1. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 20;

	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pettywap = JOptionPane.showInputDialog("what pet do ya want (you can only choose fih or dog)");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while (true) {

			// 4. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "its 17:38 watch wanna do", "Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "BELLY WUBS", "NHAP", "FEHTCH" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task == 0) {
				bellyWubs(pettywap);
			}
			if (task == 1) {
				nhap(pettywap);

			}
			if (task == 2) {
				fehtch(pettywap);
			}
			// 7. If you determine the happiness level is large enough, tell the
			// user that he loves his pet and use break; to exit for loop.
			if(happinessLevel<0) {
				JOptionPane.showMessageDialog(null,"your pet is tooh sad to come out :(");
				break;
			}
			if(happinessLevel>100) {
				JOptionPane.showMessageDialog(null, "your pet is happy and satified");
				break;
			}
		}
	}

	private static void bellyWubs(String pettywap) {
		// TODO Auto-generated method stub
		if (pettywap.equals("fih")) {
			JOptionPane.showMessageDialog(null,
					"fih doesn't like it becuase he is a fih and fih don't need belly wubs \n"
							+ "so fih is a little sad becuase he thought you knew that fih is fih \n"
							+ "and fih don't need belly wubs becuase fih is fih, so fih hides from you, \n"
							+ "but since fih  is fih, fih needs whater to survive so fih is in a fih tank, \n"
							+ "and all fih has is a lil log in his fih tank so like I already said \n"
							+ "fih doesn't have a place for fih to hide.");
			happinessLevel = happinessLevel - 10;
		} else if (pettywap.equals("dog")) {
			JOptionPane.showMessageDialog(null,
					"dog is very happy but you get shed all over so you are kind of sad becuase you don't \n"
							+ "have a lint roller but you have a white dog and you are wearing a black shirt, \n"
							+ " so you get dog hair all over you, but at least your dog is happy so you are still happy \n"
							+ " and you dog is smiling and you are smiling so everybody is smiling and you dog wants more \n"
							+ " so you give him more and the whole process repeats all ever agian.");
			happinessLevel = happinessLevel + 67;
		}
	}

	// 5. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	static void nhap(String pettywap) {
		if (pettywap.equals("fih")) {
			JOptionPane.showMessageDialog(null, "fih is happy and wested");
			happinessLevel = happinessLevel + 10;
		}

		else if (pettywap.equals("dog")) {
			JOptionPane.showMessageDialog(null,
					"dog already took a nap you didn't know about and he doesn't want to nap, he wants to play");
happinessLevel = happinessLevel - 15;
		}
	}

	static void fehtch(String pettywap) {
		if (pettywap.equals("fih")) {
		JOptionPane.showMessageDialog(null, "fih is very happy and has a jolly old time running around although \n"
				+ "fih don have legs so, fih is nuetral even tho he had a fu time he doesnt have legs so fih is nure=ntrual");
		happinessLevel = happinessLevel + 8;
		}
		
		else if(pettywap.equals("dog")) {
			JOptionPane.showMessageDialog(null, "dog is a dog so dog is a happy pappy becuase since dog is dog dog is liking fhetch \n"
					+ " so dog is very happy and pleased with you providing his happiness pappiness needs");
			happinessLevel = happinessLevel + 12;
		}
	}
}