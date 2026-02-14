package _01_algorithms._2_fibonacci;

public class Fibonaccï {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number1 = 0;
int number2 = 1;
int sum = 1 ;

System.out.println(number1);
System.out.println(number2);

while(sum<100) {
	sum = number1 + number2; 
	System.out.println(sum);
	number1 = number2;
	number2 = sum;
}

	}

}
