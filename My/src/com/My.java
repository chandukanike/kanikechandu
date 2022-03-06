package com;



	class My extends Exception 
	{ 
	    public My(String s) 
	    { 
	        super(s); 
	    } 
	 
	 
	 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new My("temp"); 
	        } 
	        catch (My ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    
	


	}

}
