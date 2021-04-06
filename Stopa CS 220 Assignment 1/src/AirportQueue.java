
public interface AirportQueue<InLinePeople > {
	
	public void enqueue(InLinePeople per); //adds regular people to the back of the line, and puts special cases at the front
	
	public void dequeue(); //removes people
		
	public int size(); //checks the size of the line
	
	public String getFront(); //gets the person at the front of the line
	
	public String getBack(); //gets the person at the back of the line
	


}
