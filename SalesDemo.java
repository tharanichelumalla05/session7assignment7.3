import methodoverloading.Sales;//import keyword is used to import built-in and user defined package into our java source file. 
                        //So that our class can refer a class that is in another package by directly 

public class SalesDemo {//Here public is a access modifier which defines who can access this method
	//created class as sales
    //classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
     Sales Sales1 =new Sales(1);//here we are instantiating three object of sales class
     //taking new sales1 value
     Sales Sales2 =new Sales(123);//taking new sales2 value
     Sales Sales3 =new Sales(1234, 7500.00);//taking new sales3 value
                                           //displays above three values
     
            Sales1.display(); //displays object of class
            //displays sales1 value    
            Sales2.display();//displays sales2 value 
            Sales3.display();//displays sales3 value 
            
	}

}