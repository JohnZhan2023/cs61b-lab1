public class IntList{
	public int value;
	/**使用了recursion来创建类*/
	public IntList rest;
	public static void main(String[] args){
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);
		System.out.println(L.get(1));
		System.out.println(size(L));
		System.out.println(iterativeSize(L));
	}
	public IntList(int value_,IntList rest_){
		value=value_;
		rest=rest_;
	}
	/**使用递归来实现size*/
	public static int size(IntList l){
		if(l.rest==null){
			return 1;
		}else{
			return 1+size(l.rest);
		}
	}
	/**使用迭代来实现size*/
	public static int iterativeSize(IntList l){
		IntList tempL=l;
		int sum=1;
		while(tempL.rest!=null){
			tempL=tempL.rest;
			sum=sum+1;
		}
		return sum;
	}
	/**使用迭代来实现get*/
	public int get(int i){
		if(i==0){
			return this.value;
		}else{
			return this.rest.get(i-1);
		}
	}
}