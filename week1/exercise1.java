public class exercise1{
	public static void main(String[] args){
		int i=0;
		int j=0;
		while(i<5){
			j=0;
			while(j<=i){
				System.out.print("*");
				j=j+1;
			}
			System.out.println(" ");
			i=i+1;
		}
	}
}