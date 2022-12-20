package data;

import java.util.Scanner;

public class Studentdetail {

		private String FirstName;
		private String lastName;
		private String gradeYear;
		private String studentID;
		private String courses ="";
		private int tutionBalance=0;
		private static int costOfcourse= 600;
		private static int id =1001;
		
		
		//  1.  CONSTRUCTOR : enter the student name and the year using year..
		
		    Studentdetail( ) {
		    	
			Scanner cc  = new Scanner (System.in);
			
			System.out.println(" Enter the first name " ) ;
			this.FirstName = cc.next();
			
			System.out.println(" Enter the last name " ) ;
			this.lastName = cc.next();
			
			System.out.println(" Enter the class level " ) ;
			this.gradeYear = cc.next();
			
			GenerateId();
			
			
			System.out.println(FirstName + lastName + "   " +  gradeYear  +  "  " + GenerateId());

		}
		
		// 2.  generate ID
		    
		    public String  GenerateId() {
		    	id++;
		    return 	studentID = gradeYear+""+id;   ////GREDELEVEL + ID
		    
		    	
		    }
		// 3.   Enroll in courses
		    
		    public  void enroll() {
		    	
		    	do {
		    		
		    	
		    	System.out.println(" Enter the course");
		    	Scanner cc = new Scanner(System.in);
		    		String subCourse = cc.nextLine();
		    		
		    		if (!subCourse.equals("Q") ){
		    			
		    			courses =  courses + subCourse;
		    			tutionBalance = tutionBalance + costOfcourse;
		    			
		    			 
		    		}
		    		else {
		    			System.out.println(" break ! ");
		    		}
		    		 
		    		  
		    	}	 while (1 == 0); {
		  
		    System.out.println(" Enrolled in " + courses);
    		System.out.println(" Tution fee  of enrolledCourse is " + tutionBalance); }
    		
		    	
		    	
		    	}

		    
		    public void viewbalance() {     // viewbalance
		    	
		    	System.out.println(" enter the balance of the course " + tutionBalance);
		    }
		    
		// 5.  pay tution
		    
		    public void payTution( int payment ) {
		    	
		    	tutionBalance = tutionBalance - payment;
		    	
		    	System.out.println(" Thanku for the making the payment $ :  " + payment);
		    	
		    	//viewbalance();
		    }
		// 6.   show status  

			@Override
			public String toString() {
				return "Studentdetail [FirstName=" + FirstName + ", lastName=" + lastName + ", gradeYear=" + gradeYear
						+ ", studentID=" + studentID + ", courses=" + courses + ", tutionBalance=" + tutionBalance
						+ "]";
			}
	          
	        	  
	          }
		
		
		
		
		
		
		
		   

	

