/* UC9- Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
        - Search LinkedList to find node with key value 40
        - Delete the node
        - Implement size() and show the Linked List size is 3
        - Final Sequence: 56->30->70 */

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

    // to delete Last Node from Linked List sequence
    public void popLast() {
        if (head == null) {
            System.out.println("Linked List sequence is Empty");
        } else {
            Node second_Last = head;
            while (second_Last.next.next != null)
                second_Last = second_Last.next;
            second_Last.next = null;
        }
    }

    // searching the particular given Node in Linked List sequence
    public void searchNode(int data) {
        int nodeLocationFound = 1;

        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {

            Node temp = head;
            while (temp != null) {
                if (temp.data == data) {
                    System.out.println("Node found at Location : " + nodeLocationFound);
                }
                nodeLocationFound++;
                temp = temp.next;
            }
        }
    }

    // insert a given Node at a particular Location
    public void insertAtLocation(int data, int nthData) {
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

    // Deleting a given Node from Linked List
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            if (data == head.data) {
                head = head.next;
            } else {
                Node prevNode = head;
                Node temp = head.next;
                while (prevNode != null) {
                    if (temp.data == data) {
                        prevNode.next = temp.next;
                    }
                    prevNode = prevNode.next;
                    temp = temp.next;
                }
            }
        }
    }
}