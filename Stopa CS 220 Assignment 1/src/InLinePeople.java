
public class InLinePeople {
	
	public String name;
	//title only matters if they are a VIP or flight staff
	public String title;
	
	
	
	public InLinePeople(String name, String title) { //constructor
		this.name = name;
		this.title = title;
		
	}
	
public String toString() {
	
	return "Name: " + name + " Title: " + title;
	
}
	

}
