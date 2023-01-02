public class Main {
    public static void main(String[] args) {

//        LinkedList myList = new LinkedList(8);
//        myList.append(4);
//        myList.append(2);
//        myList.append(1);
//       // System.out.println(myList.removeLast().getValue());
//        //myList.prepend(10);
//       System.out.println("Removed first value: " + myList.removeFirst().getValue());
//        System.out.println("Removed first value: " + myList.removeFirst().getValue());
//        myList.printList();
//        myList.getHead();
//        myList.getTail();
//        myList.getLength();
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().getValue());
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().getValue());
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());

    }
}