package _02_nested_loops._3_for_loop_gauntlet;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int numbers = 0; numbers < 101; numbers++) {
			// System.out.println(numbers);
		}
		for (int loops = 100; loops >= 0; loops--) {
			// System.out.println(loops);
		}
		for (int mouse = 2; mouse < 101; mouse += 2) {
			// System.out.println(mouse);
		}
		for (int chair = 1; chair < 100; chair += 2) {
			// System.out.println(chair);
		}
		for (int eye = 1; eye < 501; eye++) {
			if (eye % 2 == 0) {
				// System.out.println(eye +" is even");
			} else {
				// System.out.println(eye +" is odd");
			}
		}
		for (int bee = 0; bee < 778; bee += 7) {
			// System.out.println(bee);
		}

		for (int jay = 2013; jay < 2027; jay++) {
			// System.out.println("in " + jay +" i was at some point " + (jay-2013) +" years
			// old" );
		}

		for (int nest = 0; nest < 3; nest++) {
			for (int x = 0; x < 3; x++) {
				// System.out.println(nest + " " + x);

			}

		}
		for(int l = 0; l<3; l++){
			
			for(int m = 1; m<4; m++) {
			//	System.out.print(l*3 + m);
			}//System.out.println();
		}
		for(int t = 0; t<10; t++) {
			for(int g = 1; g<11; g++) {
				//System.out.print(t*10 + g + " ");
				
			}//System.out.println();
		}
		
		for(int c = 1; c<7; c++) {
			for(int r = 0; r<c; r++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int supa = 1; supa<7; supa++) {
			for(int qwerty = 6; qwerty>supa; qwerty--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int sahur = 0; sahur<101; sahur++) {
			System.out.println(  100- sahur);
		}
	}
}
