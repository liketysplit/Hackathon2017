package prob1;

import java.util.Date;
import java.util.Scanner;

public class SelectionMenu {

	public static void main(String[] args) {
//		HQ hq = new HQ();
//		Team team1 = new Team(001);
//		Team team2 = new Team(002);
//		Events tornado = new Events(001, 4, "There is a tornado!");
//		Events fire = new Events(001, 3, "There is a fire!");
//		hq.addTeam(team1); hq.addTeam(team2);
//		hq.addEvents(tornado); hq.addEvents(fire);
		//HQ hq1 = new HQ();
		readData();
	}

    private static Date dateCreated;
    //private static int navigator;
    private static int temp;
    //private static HQ hq1 = new HQ();
    private static boolean determine = false;
    private static HQ hq1 = new HQ();
	public static void readData(){
		//int x = 0;
		//HQ hq1 = new HQ();
		if (!determine){
			determine = true;
			//HQ hq1 = new HQ();
			Team team1 = new Team(001, "Zone 1");
			Team team2 = new Team(002, "Zone 2");
			Events tornado = new Events(001, 4, "There is a tornado!");
			hq1.addEvents(tornado);
			Events fire = new Events(001, 3, "There is a fire!");
			hq1.addEvents(fire);
			hq1.addTeam(team1); hq1.addTeam(team2);
			//hq1.addEvents(tornado); hq1.addEvents(fire);
			//x = 100;
		}
		
		
		
		
		int navigator = 99;
		int temp2;
		//int temp;
		//HQ hq1 = new HQ();
        Scanner scan = new Scanner (System.in);
	    System.out.print ("\nOptions: \n 1. Create Team \n 2. View Teams \n 3. Create Event \n 4. View Events \n 5. Update Event");
	     	navigator = scan.nextInt();
	     	
	     	if (navigator == 0)
	     		readData();
	     	//Option 1
	     	if ( navigator == 1){
		    	 System.out.println("\nCreating a new team: \n Enter a teamID: \t");
		    	 temp = scan.nextInt();
		    	 if (temp == 0)
		    		 readData();
		    	 System.out.println("\nEnter a location: \t");
		    	 String tempDescription = scan.next();
		    	 Team newTeam = createTeam(temp, tempDescription);
		    	 hq1.addTeam(newTeam);
		    	 System.out.print("\nNew Team Information : \n" + hq1.getTeamWithId(temp).toString());
		    	 navigator = scan.nextInt();
		    	 if (navigator == 0)
			     		readData();
	     	}

	     	//Option 2
	    	if ( navigator == 2){
	    		System.out.println("All teams: \n " + hq1.printAllTeams() + "\nEnter Team ID");
	    	 	temp2 = scan.nextInt();
	    	 	if (temp2 == 0)
	    	 		readData();
	    	 	if (temp2 == hq1.getTeamWithId(temp2).getTeamId()){
	    	 		System.out.println("\n1.View Team Events \n2.Create New Team Events ");
	    	 		navigator = scan.nextInt();
	    	 		if(navigator == 0)
	    	 			readData();
	    	 	}
	    	 		if ( navigator == 1){
	   		    	 System.out.println("\nTeam Events : \n " + hq1.getAllTeamEvents(temp2));
	   		    	 navigator = scan.nextInt();
	   		    	 if (navigator == 0)
	   		    		 readData();
	    	 		}
	    	 		if ( navigator == 2)
	    	 			System.out.println("\nCreating a new Event: \nteamID is: \t" + temp2);
    			 			temp = temp2;
			 			System.out.println("\nEnter a Event code: \t");
			 				int tempCode = scan.nextInt();
			 				if (tempCode == 0)
			 					readData();
		 				System.out.println("Enter a Event Description: \t ");
		 					String tempDescription = scan.next();
	 					Events newEvents = createEvent(temp, tempCode, tempDescription);
	 					hq1.addEvents(newEvents);
	 					System.out.println("\nNew Event Information: \n" + newEvents.toString());
	 					navigator = scan.nextInt();
	 					if (navigator == 0)
	 						readData();

	    		}

    	 	//Option 3
    		if ( navigator == 3){
    			 System.out.println("\nCreating a new Event: \nEnter teamID: \t");
    			 	temp = scan.nextInt();
    			 	if (temp == 0)
    			 		readData();
    			 System.out.println("\nEnter a Event code: \t");
    			 	int tempCode = scan.nextInt();
    			 	if (tempCode == 0)
    			 		readData();
    			 System.out.println("Enter a Event Description: \t ");
    			 	String tempDescription = scan.next();
    			 Events newEvents = createEvent(temp, tempCode, tempDescription);
    			 hq1.addEvents(newEvents);
    			 System.out.println("\nNew Event Information: \n" + newEvents.toString());
    			 navigator = scan.nextInt();
    			 if (navigator == 0)
    				 readData();
    		}

    		//Option 4
			if ( navigator == 4){
				System.out.println("\n1. All Events \n2. Open Events \n3. Closed Events \n4. Event by Team \n5. Event by EventID");
				navigator = scan.nextInt();
				if ( navigator == 1){
					System.out.println("\n All Events: \n" + hq1.getAllEvents());
					navigator = scan.nextInt();
					if (navigator == 0)
						readData();
				}
				if ( navigator == 2){
					System.out.println("\n Open Events: \n" + hq1.getOpenEvents());
					navigator = scan.nextInt();
					if (navigator == 0)
						readData();
				}
				if ( navigator == 3){
					System.out.println("\n Closed Events: \n" + hq1.getClosedEvents());
					navigator = scan.nextInt();
					if (navigator == 0)
						readData();
				}
				if ( navigator == 4){
					System.out.println("\nEnter a teamID: \t");
					temp = scan.nextInt();
					if (temp == 0)
						readData();
					if (temp == hq1.getTeamWithId(temp).getTeamId())
						System.out.print(hq1.getAllTeamEvents(temp));
					navigator = scan.nextInt();
					if (navigator == 0)
						readData();
				}
				if ( navigator == 5){
					System.out.println("\nEnter a specific EventID: \t");
					temp = scan.nextInt();
					if (temp == 0)
						readData();
					if(hq1.getEventById(temp) == null)
						System.out.println("\nNot an eventID, try again");
					else
						System.out.println("\nEvent details: \t\n" + hq1.getEventById(temp));
					navigator = scan.nextInt();
					if (navigator == 0)
						readData();
				
					}
				}
			if (navigator == 5)
				System.out.println("\nEnter EventID: \t");
					temp = scan.nextInt();
					if(temp == 0)
						readData();
				System.out.println("\nDelete this Event? Enter 1 to c, 0 to return to the top \n" + hq1.getEventById(temp));
				navigator = scan.nextInt();
				if (navigator == 0)
					readData();
				if(navigator == 1)
					hq1.eventCloser(temp);
					hq1.setStatus(temp, "Task completed!");
				navigator = scan.nextInt();
				if (navigator == 0)
					readData();
					
					

	     //name = scan.nextLine();
	     dateCreated = new Date();

     } //end of readData
	
	public static Team createTeam(int id, String location){
		Team temp = new Team(id, location);
		return temp;
	}
	
	public static Events createEvent(int teamID, int code, String problem){
		Events temp = new Events(teamID, code, problem);
		return temp;
	}
}//end of class