
public class Roop {
	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		
		for(int i = 1; i <= a; i++) {
			if(i == 1 || i == a) {
				for(int j = 1; j <= b; j++) {
					if(j < b) {
						System.out.print("*");
					}else {
						System.out.println("*");
					}
				}
			} else{
				System.out.print("*");
				int c = b - 1;
                for(int d = 1; d <= c; d++) {
					if(d == c) {
						System.out.println("*");
					}else {
						System.out.print(" ");
					}
			    }
			}
			
		}
		
	}

}
