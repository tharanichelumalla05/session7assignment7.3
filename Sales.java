/*program for implementing methodoverloading using "this" keyword*/
//method overloading allows a class to have more than one method having the same name,if thier arguments are different
//"this"keyword is a reference variable that refers to the current object
//it initiate current class constructor,and passed as an argument in the method
package methodoverloading;//created package as methodoverloading

public class Sales {//created class as sales
	                //classes are the basics of opps(object oriented programming)
	private int SalesID ;//private is a keyword which declares member is only visible
	                     //intilaizing SalesID
    private double SalesAmt;//taking Sales Amt by using double keyword
    
  public Sales() {////Here public is a access modifier which defines who can access this method
	  SalesID =0;//taking salesid value as 0
	  SalesAmt=0;//taking salesAmt value as 0
  }
	public Sales (int sID){//Here public is a access modifier which defines who can access this method
		this.SalesID =sID;//taking sID
	}	
	public Sales (int sID ,double sAmt){//Here public is a access modifier which defines who can access this method
		this. SalesID =sID;//salesId equal to sID
		this.SalesAmt=sAmt;//salesAmt equal to sAmt
		}	

		public void display(){//Here public is a access modifier which defines who can access this method
			//void is used to define return type of the method,void means method wont return any value
			System.out.println("sales ID:" +SalesID); //system is used to return code
	           //out is a static member
	         	//Println is used to print text int to byte and gives output of salesID
			System.out.println("sales Amt:" +SalesAmt); //system is used to return code
	           //out is a static member
	         	//Println is used to print text int to byte and gives output of salesAmt
			
		}
		
}