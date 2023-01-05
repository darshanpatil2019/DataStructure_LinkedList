/* UC5-Ability to delete the first element in the LinkedList of sequence 56->30->70 - Write pop method
        - Note there is new head
        - Final Sequence: 30->70 */

class Node {
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
    int location = 0;

    // now inserting data in new Node from first node
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
        location++;
        System.out.println("Location:" + location);
    }

    // data insertion from last node
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        location++;
        System.out.println("Location:" + location);
    }

    // insert a new Node after(between) given Node at nth position
    public void insertNthPosition(int data, int nthData) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            Node nextNode;
            while (temp != null) {
                nextNode = temp.next;
                if (temp.data == nthData) {
                    temp.next = newNode;
                    newNode.next = nextNode;
                }
                temp = temp.next;
            }
        }
    }

    // displaying Node in Linked List
    public void showLinkedList() {
        if (head == null) {
            System.out.println("Linked List Sequence is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    //delete First Node from Linked List sequence
    public void pop() {
        if (head == null) {
            System.out.println("Linked List sequence is Empty");
        } else {
            head = head.next;
        }
    }
}