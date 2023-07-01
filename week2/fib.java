public class fib{
	public static void main(String[] args){
		int i=0;
		while(i<10){
			i=i+1;
			System.out.println(fib(i));
		}
	}

	public static int fib(int n){
		int last=0;
		int now=1;
		int i=2;
		if(n==1)
			return last;
		if(n==2)
			return now;
		while(i<n){
			i=i+1;
			int temp;
			temp=now;
			now=now+last;
			last=temp;
		}
		return now;
	}
}