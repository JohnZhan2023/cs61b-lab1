public class exercise1b{
	public static void drawTriangle(int N){
		int i=0;
		int j=0;
		while(i<N){
			j=0;
			while(j<=i){
				System.out.print("*");
				j=j+1;
			}
			System.out.println(" ");
			i=i+1;
		}
	}
	public static void main(String[] args){
		drawTriangle(10);
	}
}