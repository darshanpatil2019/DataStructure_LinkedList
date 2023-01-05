/* UC2- Ability to create Linked List by adding 30 and 56 to 70
        - Node with data 70 is First Created
        - Next 30 is added to 70
        - Finally 56 is added to 30
        - LinkedList Sequence: 56->30->70*/

public class Node {
    public int data;
    public Node next;

    //created a Node constructor for creating a new Node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    // now inserting data in new Node
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        //Adding Data in Node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Display Node in Linked List
    public void showLinkedList() {
        if (head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}