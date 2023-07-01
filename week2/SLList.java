public class SLList{

	public static void main(String[] args){
		SLList L = new SLList(15);
        L.addnode(10);
        System.out.println(L.size());
        System.out.println(L.fast_size());

	}

	private class IntList{
		int item;
		IntList next;
		public IntList(int x,IntList next_){
			item=x;
			next=next_;
		}
	}

	private IntList list;
	private static int size;

	public SLList(int x){
		list=new IntList(x,null);
		size=size+1;
	}


	public void addnode(int x){
		list=new IntList(x,list);
		size=size+1;
	}

	public void addLast(int x){
		IntList p=list;
		while(p.next!=null){
			p=p.next;
		}
		p.next=new IntList(x,null);
		size=size+1;
	}

	public int size(){
		int sum=0;
		IntList p=list;
		while(p!=null){
			sum=sum+1;
			p=p.next;
		}
		return sum;
	}
	private static int size(IntList p){
		if(p==null)
			return 0;
		else return size(p.next)+1;
	}
	public int sizerec(){
		return size(list);
	}
	public int fast_size(){
		return size;
	}


	
}