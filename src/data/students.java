package data;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Studentdetail obj = new Studentdetail();
 	  obj.GenerateId();
		
  	obj.enroll();
		
		obj.viewbalance();
		
		obj.payTution(100);
		
		System.out.println(  obj.toString());
		 
	}
	

}
