public class Ll1 {

    // Insert at end of a linked list
    // Defining head
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

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

    // displaying the linked list
    void displayNode()
    {
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }


    public static void main(String[] args) {
        Ll1 ilist = new Ll1();

        ilist.insertDATA(2);
        ilist.insertDATA(4);
        ilist.insertDATA(8);
        ilist.insertDATA(10);
        ilist.insertDATA(15);

        System.out.println("Linked List after successful insertion of all the nodes:");
        ilist.displayNode();
        System.out.println();

    }
}
