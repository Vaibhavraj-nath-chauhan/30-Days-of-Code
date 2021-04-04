import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    Student(String firstName,String lastName,int idNumber,int [] score){
        super(firstName,lastName,idNumber);
        this.testScores = score;
    }
    String calculate(){
        int data =0;
        int len = this.testScores.length;
        for(int i=0;i<len;i++){
            data +=this.testScores[i];
        }
        data = data/len;
        
        if(data>=90){
            return "O";
        }
        else if(data >=80  && data<90){
            return "E";
        }
        else if(data >=70  && data<80){
            return "A";
        }
        else if(data >=55  && data<70){
            return "P";
        }
        else if(data >=40  && data<55){
            return "D";
        }
        else{
            return "T";
        }
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}