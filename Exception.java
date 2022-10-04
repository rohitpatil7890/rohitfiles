
public  class Exception {

	
	public static Exception a=new Exception();
	
	public static Exception a1;
	
	public void demo() {
		System.out.println("message");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		a.demo();
		a1.demo();
		}
		catch (Exception e){
			System.out.println(e);
		}
	
}
}
