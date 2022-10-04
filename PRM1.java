
public class PRM1 {
	void A(){
		System.out.println("one");
	}
	
	void B(int x){
		System.out.println(x);
		return ;
	}	
	void c(int a ,double w) {
	//	System.out.println("x");
		System.out.println();
	}
	
	//public static void main(String[] args) {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PRM1 obj=new PRM1();
		obj.A();
		obj.B(3);
		obj.c(4, 12.22);
		
		//PRM1 b=new PRM1(3,"");
	}

}
