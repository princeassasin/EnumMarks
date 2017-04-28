package com.example.EnumMarks.java;


enum Marks{
	Mark1(20),Mark2(20),
	Mark3(19); 
	private int mm;
	Marks(int m){
		mm =m;
	}
	int getMarks(){
		return mm;
	}
} 
				
public class EnumExampleMarks1 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marks marks = Marks.Mark1 ;
		Marks marks1 = Marks.Mark2 ;
		Marks marks2 = Marks.Mark3 ;
		System.out.println("Test list\t"+marks.getMarks());
		System.out.println("Test list\t"+marks1.getMarks());
		System.out.println("Test list\t"+marks2.getMarks());
	
		

	}

}
