public class Ll4 {
    // insertion at any part
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // insertion at end
    public void insertDATA(int newData) {
        Node newNODE = new Node(newData);

        // Check linked list is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }
        // If linked list is not empty
        newNODE.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNODE;
        return;
    }
    // insertion at begining of linked list

    public void insertAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    // insertion at any part of the node
    public void insertatRandom(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The previous node cannot contain the null values");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // displaying the linked list
    void displayNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
    }

    // void delete linkedlist
    public void deleteNodeLL(int position) {
        // If ll is empty
        if (head == null)
            return;

        Node temp = head;
        // deletion at begining
        if (position == 0) {
            head = temp.next;
            return;
        }

        // deleteion at any part
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if(temp == null && temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Ll4 ilist = new Ll4();

        ilist.insertDATA(2);
        ilist.insertDATA(4);
        ilist.insertDATA(8);

        System.out.println("Initial linked list at end insertions:");
        ilist.displayNode();
        System.out.println();

        ilist.insertAtBeginning(12);
        ilist.insertAtBeginning(122);
        ilist.insertAtBeginning(133);
        System.out.println("Linked list after forward insertions:");
        ilist.displayNode();
        System.out.println();

        ilist.insertatRandom(ilist.head.next.next.next, 13);
        ilist.displayNode();
        System.out.println();

        ilist.deleteNodeLL(3);
        System.out.println("Linked List after deletion of the node:");
        ilist.displayNode();
        System.out.println();
    }
}
