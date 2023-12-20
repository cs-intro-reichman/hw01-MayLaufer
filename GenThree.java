public class GenThree {
	public static void main(String[] args) {
		
		int userArg1 = Integer.parseInt(args[0]);
		int userArg2 = Integer.parseInt(args[1]);
		
		int a = Math.min(userArg1, userArg2); 
		int b = Math.max(userArg1, userArg2);
		
		int num1 = (int)(Math.random() * (b - a) + a);
		int num2 = (int)(Math.random() * (b - a) + a);
		int num3 = (int)(Math.random() * (b - a) + a);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		int minNum = 0;
		
		minNum = Math.min(num1, num2);
		minNum = Math.min(minNum, num3);

		System.out.println("The minimal generated number was: " + minNum);
		
		
	}
}