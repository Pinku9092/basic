package com.pinku.interview;

class Gartner{
	
	public static void main(String[] args) {
		String s1 = "Pinku";

        String s2 = "Kumar";
        
        String s3 = s1.concat(s2);
	}

	private static Gartner single = null;
	
	private Gartner(){
	
	}
	
	
	
	public static Gartner getAnimal(){
	
			synchronized(Gartner.class) {
			if( single == null){
			
				single = new Gartner();
			}
			}
			return single;
	
	}



	
	
	

}
