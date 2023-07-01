public class fib2{
	public static void main(String[] args){
		int i=0;
		while(i<10){
			i=i+1;
			System.out.println(fib2(i,0,0,1));
		}
	}
	public static int fib2(int n,int k,int f0,int f1){
		if(n==1)
			return f0;
		else if(n==2)
			return f1;
		else if(n>2)
			return fib2(n-2,k,f0+f1,f0+f1+f1);
		return 0;
	}
}