package accessSpecifiers2;

public class accessSpecifiers2 {

	 
	   private void display() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    } 
	 

	

		public static void main(String[] args) {
			//private
			
			accessSpecifiers2  obj = new accessSpecifiers2(); 
	        //trying to access private method of another class 
	        obj.display();

		}
	


	}


