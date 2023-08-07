/**zjh@not tested
 */
public class IntList {
	public int first;
 	public IntList rest;
 	public IntList (int f, IntList r) {
 		this.first = f;
 		this.rest = r;
    }

 	public static void evenOdd(IntList lst) {
 		if(lst==null||lst.rest==null){
 			return;
 		}
 		IntList tempFront=lst;
 		IntList tempBack=lst.rest;
 		while(tempBack.rest!=null){
 			tempFront.rest=tempBack.rest;
 			tempBack.rest=lst.rest;
 			lst.rest=tempBack;
 			tempBack=tempFront.rest;

 		}
 	}

}