package prob1;

public class Events {
	int teamID;
	int eventID;
	String status = "Not Yet Addressed";
	boolean isOpen = true;
	String problem;
	int eCode;
	String openOrClosed;


	public Events(int teamID, int code, String problem){

		this.teamID = teamID;
		this.eCode = code;
		this.problem = problem;

		this.eventID = HQ.getNumAllEvents() + 1;

	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setProblem(String problem){
		this.problem = problem;
	}

	public String getProblem(){
		return problem;
	}

	public void setEventID(int eventID){
		this.eventID = eventID;
	}

	public int getEventID(){
		return eventID;
	}

	public void setCode(int eCode){
		this.eCode = eCode;
	}

	public int getCode(){
		return eCode;
	}

	public void setTeamID(int teamID){

	}

	public int getTeamID(){
		return teamID;
	}

	public void setOpen(boolean solved){
		this.isOpen = solved;
	}

	public boolean getOpen(){
		return isOpen;
	}

	public String toString(){
		
		if(isOpen)
			openOrClosed = "Open";
		
		if(!isOpen)
			openOrClosed = "Closed";
		
			

		return String.format("\n Case Number: %d Work Order Status: %s Team: %d Code: %s Details: %s Status: %s", eventID, openOrClosed, teamID, eCode, problem, status);

	}

}
