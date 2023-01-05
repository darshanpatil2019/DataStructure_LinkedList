import java.util.Scanner;

public class MyLinkedList {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList Data Structure Problem using Java Generics");
        Scanner sc = new Scanner((System.in));
        LinkedList linkedList = new LinkedList();

        int choice;

        do {
            System.out.println("Choices for a simple linked list");
            System.out.println("1.Insert First \n2.Insert Last \n3.Insert at Nth position \n4.Display LinkedList  \n5.pop \n6.pop last \n7.Search Node \n8.Exit \nEnter the Choices: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to insert at First Node: ");
                    int dataFirst = sc.nextInt();
                    linkedList.insertFirst(dataFirst);
                    break;
                case 2:
                    System.out.println("Enter Data to insert at Last Node: ");
                    int dataLast = sc.nextInt();
                    linkedList.insertLast(dataLast);
                    break;
                case 3:
                    System.out.println("Enter the Data After which to Insert New Data : ");
                    int nthData = sc.nextInt();
                    System.out.println("Enter the Data : ");
                    int data = sc.nextInt();
                    linkedList.insertNthPosition(data, nthData);
                    break;
                case 4:
                    linkedList.showLinkedList();
                    break;
                case 5:
                    linkedList.pop();
                    break;
                case 6:
                    linkedList.popLast();
                    break;
                case 7:
                    System.out.println("Enter the Data to Search in the Linked List sequence: ");
                    linkedList.searchNode(sc.nextInt());
                    break;
            }
        }
        while (choice != 8);
    }
}