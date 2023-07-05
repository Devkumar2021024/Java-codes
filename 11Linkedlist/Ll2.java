public class Ll2 {
    // insertion in ll at begining
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

    // displaying the linked list
    void displayNode() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
    }

    public static void main(String[] args) {
        Ll2 ilist = new Ll2();

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

    }
}
