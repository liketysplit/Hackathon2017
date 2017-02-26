package prob1;

import java.util.ArrayList;

public class Team {
	
	protected ArrayList<Events> teamEvents = new ArrayList<>();
	protected int teamId;
	protected String location = "null";
	
	public Team (int teamId, String location){
		this.teamId = teamId;
		this.location = location;
	}
	
	public Team (int teamId){
		this.teamId = teamId;
	}
	
	public boolean addEvents(Events e){
		teamEvents.add(e);
		return true;
	}
	
	//toString
	@Override
	public String toString(){
		String header = String.format("teamId = %d, location = %s \n", teamId, location);
		StringBuilder sb = new StringBuilder();
		for (Events e : teamEvents)
		{
			sb.append(e);
			sb.append("\n");
		}
		
		return header + sb.toString();
	}
	//getters and setters
	
	public int getTeamId(){
		return teamId;
	}
	
	public void setId(int id){
		this.teamId = id;
	}
	
	
	public void setLocation(String msg){
		this.location = msg;
	}
	
	public String getLocation(){
		return location;
	}
	
	
}
