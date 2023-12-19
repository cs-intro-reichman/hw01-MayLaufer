public class Triangle {
	public static void main(String[] args) {
		
		int length1 = Integer.parseInt(args[0]);
		int length2 = Integer.parseInt(args[1]);
		int length3 = Integer.parseInt(args[2]);
	
		boolean isTriangle = true;
		
		if (length1 + length2 > length3) {
			if (length1 + length3 > length2) {
				if (length2 + length3 > length1) {
					isTriangle = true;
				}
			}
		} else {
			isTriangle = false;
		}
		
		System.out.println("Is it triangle? " + isTriangle);
				
	}
}