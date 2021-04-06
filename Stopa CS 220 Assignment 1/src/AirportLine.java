
public class AirportLine<InLinePeople> implements AirportQueue< InLinePeople> {
	
	Node head;
	private class Node {
		InLinePeople value;
		Node next;

		public Node(InLinePeople value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	public AirportLine() {  //constructor to create empty list
		head = null;
	}
	
	
	@Override
	public void enqueue(InLinePeople per) {
		
				Node newNode = new Node(per, null);
		
				if(head == null) {  //adding to an empty list
					head = new Node(per, null);
					return;
				}
		
				Node curr = head;
				
				if(newNode.value.toString().equals(curr.value.toString())) { //prevents duplicates from being added to the list if the duplicate is the head
					return;
				}
				
				if(newNode.value.toString().contains("VIP") == true || newNode.value.toString().contains("flight staff") == true) { //puts special cases to the front of the line		
		            Node temp = head;        
		            head = newNode;           
		            head.next = temp;
		            return;
				}

				while(curr.next != null) {  //goes until curr is last person in line
					if(curr.value.toString().equals(curr.next.value.toString())) { //prevents duplicates from being added to the list everywhere besides the head
						return;
					}
					curr = curr.next;
					
				}
				curr.next = newNode; //puts the new person at the end of the line
				
			}

	@Override
	public void dequeue() {
		if(head == null)  //special case: empty list
			return;
	
			head = head.next;
	}

	@Override
	public int size() {
		int count = 0;
		Node curr = head;
		while(curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}

	@Override
	public String getFront() {
		if (head == null) { //when the line is empty
			return "Line is currently empty";	
		}
		Node curr = head;
		
		return curr.value.toString();
	}


	@Override
	public String getBack() {
		if (head == null) { //when the line is empty
			return "Line is currently empty";	
		}
		Node curr = head;
		while(curr.next != null) {  //go until curr is last Node in the list
			curr = curr.next;
		}
		return curr.value.toString();
	}
	
	
	}
	
