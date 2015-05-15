/*************************************************************************
 *  Compilation:  javac Birthday.java
 *  Execution:    java Birthday D
 *  
 *  Computes the number of people (by simulation) that must enter a room
 *  until two of them share a birthday. Assumes birthdays a uniform
 *  and independent from 0 to D-1.
 *  
 *  % java Birthday 365
 *  25
 *
 *  % java Birthday 365
 *  22
 *
 *************************************************************************/


public class Birthday { 

    public static void main(String[] args) { 
        int D = Integer.parseInt(args[0]);         // number of days
        int attempts = Integer.parseInt(args[1]); 
        int people = 0;                            // total number of people
        int sum = 0;
        

        //  days[d] = true if someone born on day d; false otherwise
        //  auto-initialized to false
        boolean[] days = new boolean[D];

	for(int i = 1; i <= attempts; i++){
           while (true) {
	        people++;
            	int d = (int) (D * Math.random());    // integer between 0 and D-1
            	if (days[d]) break;                   // two people with the same birthday, so break out of loop
            	days[d] = true;                       // update days[d]
           }
           sum += people;
	   System.out.println("Attempt " + i + " : " + people);
	}
        System.out.println("Average people in " + attempts + " attempts is: " + sum/attempts);
        
    }
}
