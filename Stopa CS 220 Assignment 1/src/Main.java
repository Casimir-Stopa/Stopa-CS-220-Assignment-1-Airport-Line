// You are in charge of making the lines at airport security run smoothly. 
// Every day thousands of people pass through security. There are 3 main types of people who go through 
// this line: economy class passengers, VIP passengers, and flight staff.
// There is one line but some people have the ability to cut through.
// The system should allow VIPs and flight staff go straight to the scanners.
// They are rare occurrences and only appear 1 in every 100 people.
	//Having these cases appear that rarely is impractical when we aren't supposed to make a test class
	//The calls in main I have made should still test the needed features

public class Main {

	public static void main(String[] args)  {
		
		//
		AirportQueue<InLinePeople> l = new AirportLine<InLinePeople>(); // makes the line
		
		
		//some people to put through the line
		//a name and a title. having a VIP or flight staff titles puts it at the front of the list
		//any title besides those two puts it at the end
		InLinePeople p1 = new InLinePeople("David", "regular passenger");
		InLinePeople p2 = new InLinePeople("Adam", "economy class");
		InLinePeople p3 = new InLinePeople("Sara", "VIP");
		InLinePeople p4 = new InLinePeople("Alexis", "flight staff");
		
		//checks if an empty line works as designed
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		//checks if people can be added
		l.enqueue(p1);
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		//checks multiple people in line works
		l.enqueue(p2);
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		//checks that the same person can't be in the line more than once
		l.enqueue(p1);
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		//checks that VIPs go to the front
		l.enqueue(p3);
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		//checks dequeue
		l.dequeue();
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		//checks enqueue works after a dequeue, and that flight staff go to the front
		l.enqueue(p4);
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		//checks that the remaining people in line can dequeue until empty
		for(int i = 0; i < 3; ++i ) {
		
		l.dequeue();
		System.out.println("The size of the line is " + l.size());
		System.out.println("The front of the line's name and title: " + l.getFront());
		System.out.println("The back of the line's name and title: " + l.getBack());
		System.out.println();
		
		}
		
		
		
		
		
	
			
			
			}
	}

	


