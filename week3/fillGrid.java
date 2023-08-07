public class fillGrid{
	public static void fillGrid(int[] LL,int[] UR,int [][] S){
		int N=S.length;
		int kL,kR;
		kL=kR=0;
		for(int i=0;i<N;i+=1){
			for(int j=0;j<N;j+=1){
				if(i>j){
					S[i][j]=LL[kL];
					kL+=1;
				}
				if(i<j){
					S[i][j]=UR[kR];
					kR+=1;
				}

			}

		}
	}
	public static void main(String[] args){
		int[] LL = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0 };
		int[] UR = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[][] S = {
			{ 0, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0}
			};
		fillGrid(LL,UR,S);
		for(int i=0;i<5;i+=1){
			for(int j=0;j<5;j+=1)
				System.out.print(S[i][j]+" ");
			System.out.println(" ");
		}
		System.out.println(S.length);


	}
}