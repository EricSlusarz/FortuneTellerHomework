package fridayhomework;
import java.util.Scanner;

public class part1 {

	public static void main(String[] args) {

//Multi-string constructors consider revising		
		Scanner scanner = new Scanner (System.in);
		Scanner scansiblings = new Scanner (System.in);
		Scanner scanage = new Scanner(System.in);
		Scanner scanfirstname = new Scanner(System.in);
		Scanner scanlastname = new Scanner(System.in);
     
		String startover;
	    int retirementage;
	    String vacationhome;
	    String modeoftransportation = "Pogo Stick";  
	    int moneyinthebank;


do {	
//First name input
	
	System.out.println("What is your first name: ");	

	while(!scanfirstname.hasNext("[A-Za-z]+")){
		System.out.println("Please enter letters (e.g. I,i,k,q,Y): ");
		scanfirstname.next();
		
	}
//Scanner initialize string value & firstname's first letter parsed and capitalized to due to being a proper noun by definition	
			String firstname = scanfirstname.next();
			String firstnamecap = firstname.substring (0,1).toUpperCase() + firstname.substring(1);
			
// Last name input
			
	System.out.println("What is your last name: ");	
	
	while(!scanlastname.hasNext("[A-Za-z]+")){
		System.out.println("Please enter letters (e.g. I,i,k,q,Y): ");
		scanlastname.next();
	}
//As in the firstname we make a string variable with the scanned input and capitalize the first letter
	
			String lastname = scanlastname.next();	
			String lastnamecap = lastname.substring (0,1).toUpperCase() + lastname.substring(1);

//Combine both first and last name with first letter's capitalized into it's own string variable 			
	        String fullname = firstnamecap + lastnamecap;	
	        
	        
	        
//	int fullnamelength = fullname.length();
	
	System.out.println("Hello " + firstnamecap + " " + lastnamecap +", nice to meet you!\n");	
	//System.out.println ("Fullname output is : "+ fullname);
	/*System.out.println (fullnamelength);

	String arrayforfullname[] = new String [fullnamelength];
	for(int i = 0; i < fullnamelength ; i++ ){
		
		System.out.println("Count is " + i);
		
		System.out.println(i + "position in your full name is " + fullname.substring(i, i+1) );
		arrayforfullname[i]=(info.getProduct(fullname.substring(i,i+1)));
		
	  // String name = fullname.substring(i,i+1);
	//   arrayforfullname[] = name;
	}
*/	

// Age input
	
	System.out.println("How old are you " + firstnamecap + " " + lastnamecap +": ");
	
			while (!scanage.hasNextInt()){
				System.out.println("Please enter a whole number as your age (e.g. 27,12,45): ");
			scanage.next();
			}
//Making the age variable and adding the scanned integer into it & using modulus operation to parse even and odd numbers 			
	
			int age = scanage.nextInt();  
			age = age % 2;
	
// Birth Month Input & Capitalizing the first letter of that month because all months are proper nouns
	 
	System.out.println("What is your birth month "+ firstnamecap + " " + lastnamecap +": ");
	String birthmonth = scanner.next();
	String birthmonthcap = birthmonth.substring (0,1).toUpperCase() + birthmonth.substring(1);

// Checking to see if any of the words do not equal the regular months of the year or the word help
	
	while (birthmonthcap.equalsIgnoreCase("Help") || !birthmonthcap.equalsIgnoreCase("January") && !birthmonthcap.equalsIgnoreCase("Febuary")  
			&& !birthmonthcap.equalsIgnoreCase("March")     && !birthmonthcap.equalsIgnoreCase("April")   && !birthmonthcap.equalsIgnoreCase("May")  
			&& !birthmonthcap.equalsIgnoreCase("June")      && !birthmonthcap.equalsIgnoreCase("July")    && !birthmonthcap.equalsIgnoreCase("August") 
			&& !birthmonthcap.equalsIgnoreCase("September") && !birthmonthcap.equals("equalsIgnoreCase") && !birthmonthcap.equalsIgnoreCase("November")
			&& !birthmonthcap.equalsIgnoreCase("December"))
	{   
		System.out.println("\nIncorrect input, please type a month of the year: \n\nMonths of the year include: "
				+ "\nJanuary\nFeburary\nMarch\nApril\nMay\nJune\n"
				+ "July\nAugust\nSeptemer\nOctober\nNovember\nDecember\n");

		System.out.println("What is your birth month: ");
		 birthmonth = scanner.next();
		 birthmonthcap = birthmonth.substring (0,1).toUpperCase() + birthmonth.substring(1);
	}
	
//Separating the 1st,2nd and 3rd letters out of month inputed to use latter on
	
	String substring1stletter = birthmonthcap.substring(0, 1);
	String substring2ndletter = birthmonthcap.substring(1, 2);
	String substring3rdletter = birthmonthcap.substring(2, 3);
	
	System.out.println("\nYou were born in the month of " + birthmonthcap + ". What a great month to be born!\n");
// Checking to see that each letter was parsed correctly	
//	System.out.println("The first letter of that month is " + substring1stletter);
//	System.out.println("The sedcond letter of that month is " + substring2ndletter);
//	System.out.println("The third letter of that month is " + substring3rdletter);


//Color Input	
	System.out.println("What is your favorite ROYGBIV color (type the first letter of your"
		            	+ " favorite color or \"help\" for more details): ");
	String color = scanner.next();
	color = color.toUpperCase();
				
				
	while (color.equalsIgnoreCase("help") || !color.equals("R") && !color.equals("O")  && !color.equals("Y")  && !color.equals("G")  
			&& !color.equals("B")  && !color.equals("I")  && !color.equals("V")){   
	System.out.println("Help Menu: \n\nPlease type one of these letters R,O,Y,G,B,I,V,r,o,y,g,b,i,v."
			+ "\n\nR or r = Red\nO or o = Orange\nY or y = Yellow\nG or g = Green\nB or b = Blue\nI or"
			+ " i = Indigo\nV or v = Violet\n");

    color = scanner.next();
	color = color.toUpperCase();
	
     
	 }
	
//Siblings input
	System.out.println("How many siblings do you have: ");

	
	while (!scansiblings.hasNextInt()){
		System.out.println("Please enter a whole number for the amount of sibilings you have (e.g. 5,2,1): ");

	 scansiblings.next();
	}
	int siblings = scansiblings.nextInt();
	
    
    
// Output for age 
    if (age == 1){
    
    System.out.println("Since you had an odd age you wil retire in 15 years");
    retirementage = 15;
    } else  {
    System.out.println("Since you had an even age you wil retire in 20 years");
    retirementage = 20;
    }
   
// Output for siblings    
      if(siblings == 0){
   System.out.println("You will live in Ohio.");
   vacationhome = "Ohio";
    } else if (siblings == 1){
    System.out.println("You will live in the Bahamas.");
    vacationhome = "Bahamas";
    } else if (siblings == 2){
    System.out.println("You will live in New York.");
    vacationhome = " New York";
    } else if (siblings == 3){
    System.out.println("You will live in London.");	
    vacationhome = "London";
    } else {
    System.out.println("You will live on a Tahiti.");   	
    vacationhome = "Tahiti";
    }
    
// Out put for color 
    switch (color) {
    case "R":
    System.out.println("You will drive a boat");
    modeoftransportation = "boat";  

    }    switch (color) {
    case "O":
    System.out.println("You will drive a car");
    modeoftransportation = "car";  

    }    switch (color) {
    case "Y":
    System.out.println("You will drive a spaceship");
    modeoftransportation = "spaceship";  

    }    switch (color) {
    case "G":
    System.out.println("You will drive a waverunner");
    modeoftransportation = "waverunner";  

    }    switch (color) {
    case "B":
    System.out.println("You will drive a helicopter");
    modeoftransportation = "helicopter";  

    }    switch (color) {
    case "I":
    System.out.println("You will drive a tank");
    modeoftransportation = "tank";  

    }    switch (color) {
    case "V":
    System.out.println("You will drive a submarine");
    modeoftransportation = "submarine";  

    }
    
    
//Output for First and Last name comparison to birth month    
    if (fullname.toLowerCase().contains(substring3rdletter.toLowerCase())){
        System.out.println("You will have $33,000 dollars in the bank");
        moneyinthebank = 33000;
        }
    
    
    else if (fullname.toLowerCase().contains(substring2ndletter.toLowerCase())){
        System.out.println("You will have $22,000 dollars in the bank");
        moneyinthebank = 22000;
        }
        
    
    else if (fullname.toLowerCase().contains(substring1stletter.toLowerCase())){
        System.out.println("You will have $11,000 dollars in the bank");
        moneyinthebank = 11000;
        }

    else {
        System.out.println("You will have $44,000 dollars in the bank");
        moneyinthebank = 44000;
        };
    
        
 //Final output line       
        System.out.println(firstnamecap + " " + lastnamecap + " will retire in " + retirementage +
        	            " years with $" + moneyinthebank +" in the bank, a vacation home in " +
        		        vacationhome + " and a " + modeoftransportation + ".\n");    
    
        
        
        System.out.println("Do you want another fortune (\"yes\"/\"no\")?");
     
		startover = scanner.next();
		while (!startover.equalsIgnoreCase("yes") && !startover.equalsIgnoreCase("no")){   
			System.out.println("Please type \"yes\" or \"no\": ");
			 startover = scanner.next();
		}

	
		
} while(startover.equalsIgnoreCase("yes"));

//Final message & closing scanners
System.out.println("Farewell, I hope you enjoyed your fortune!");

scanner.close();	
scansiblings.close();
scanage.close();
scanfirstname.close();
scanlastname.close();
	}
	


}