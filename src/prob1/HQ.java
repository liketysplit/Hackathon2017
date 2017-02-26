package prob1;

import java.awt.Event;
import java.util.ArrayList;

public class HQ {

	ArrayList<Team> teams = new ArrayList<Team>();
	static ArrayList<Events> allEvents = new ArrayList<Events>();
	ArrayList<Events> openEvents = new ArrayList<Events>();
	ArrayList<Events> closedEvents = new ArrayList<Events>();



	public HQ(){

	}



	public HQ(ArrayList<Team> teams, ArrayList<Events> allEvents, ArrayList<Events> openEvents,
			ArrayList<Events> closedEvents) {
		super();
		this.teams = teams;
		this.allEvents = allEvents;
		this.openEvents = openEvents;
		this.closedEvents = closedEvents;
	}

	public void addTeam(Team tm){
		boolean bool = false;

		for(int i = 0; i < teams.size(); i++){
			if(tm.getTeamId() == teams.get(i).getTeamId()){
				bool = true;
			}
		}

		if(bool == false){
			teams.add(tm);
		}
	}

	public void addEvents(Events ev){
		
			allEvents.add(ev);
			openEvents.add(ev);
		



	}

	public Team getTeamWithId(int id){
		int index = 0;
		boolean bool = false;

		for(int i = 0; i < teams.size();i++){
			if(teams.get(i).getTeamId() == id){
				bool = true;
				index = i;
			}
		}
		if(bool == true) {
			return teams.get(index);
		}
		return null;
	}


	public String getTeamLocation(int id){
		Team tm = new Team(id);
		int index = 0;

		if(teams.indexOf(tm) == -1){
			return null;
		}

		index = teams.indexOf(tm);
		String str = teams.get(index).getLocation();

		return str;

	}

	public void eventCloser(int id){

		for(int i = 0; i < openEvents.size(); i++){
			if(openEvents.get(i).getEventID() == id){
				openEvents.get(i).setOpen(false);
				closedEvents.add(openEvents.get(i));
				openEvents.remove(openEvents.get(i));
			}
		}

	}

	public String printAllTeams(){
		StringBuilder str = new StringBuilder();

		for(int i = 0; i < teams.size(); i++){
			str.append(i+1 + ". Team ID = " + teams.get(i).getTeamId() + "\t" + teams.get(i).getLocation() + "\n");

		}
		return str.toString();
	}

	public String getByECode(int code){
		StringBuilder str = new StringBuilder();

		for(int i = 0; i < allEvents.size(); i++){
			if(allEvents.get(i).getCode() == code){
				str.append(allEvents.get(i).toString() + "\n");
			}
		}
		return str.toString();

	}

	public String getAllTeamEvents(int id){
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < allEvents.size(); i++){
			if(allEvents.get(i).getTeamID() == id){
				str.append(allEvents.get(i).toString() + "\n");
			}
		}

		
				
			
		return str.toString();
	}

	public String getAllEvents(){
		StringBuilder str = new StringBuilder();

		for(int i = 0; i < allEvents.size(); i++){

				str.append(allEvents.get(i).toString() + "\n");

		}
		return str.toString();
	}

	public String getEventById(int id){

		for(int i = 0; i < allEvents.size(); i++){
			if(allEvents.get(i).getEventID() == id){
				return allEvents.get(i).toString();
			}
		}
		return null;
	}

	public String getOpenEvents(){
		StringBuilder str = new StringBuilder();

		for(int i = 0; i < openEvents.size(); i++){

				str.append(openEvents.get(i).toString() + "\n");

		}
		return str.toString();

	}

	public String getClosedEvents(){
		StringBuilder str = new StringBuilder();

		for(int i = 0; i < closedEvents.size(); i++){

				str.append(closedEvents.get(i).toString() + "\n");

		}
		return str.toString();

	}

	public void setStatus(int id, String str){

		for(int i = 0; i < allEvents.size(); i++){
			if(allEvents.get(i).getEventID() == id){
				allEvents.get(i).setStatus(str);
			}
		}
	}



















	public int getNumOpenEvents(){
		return openEvents.size();
	}

	public static int getNumAllEvents(){
		return allEvents.size();
	}

	public int getNumClosedEvents(){
		return closedEvents.size();
	}

	public int getNumTeams(){
		return teams.size();
	}













}
