public class GenThree {
	public static void main(String[] args) {
		
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		
		int num1 = (int)(Math.random() * (b - a) + a);
		int num2 = (int)(Math.random() * (b - a) + a);
		int num3 = (int)(Math.random() * (b - a) + a);
		
		System.out.println("Three random numbers are: " + num1 + ", " + num2 + ", " + num3);
		
		int minNum = 0;
		
		minNum = Math.min(num1, num2);
		minNum = Math.min(minNum, num3);

		System.out.println("The minimun number is: " + minNum);
		
		
	}
}