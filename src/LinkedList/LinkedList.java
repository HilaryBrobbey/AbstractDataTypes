package LinkedList;

/**
 *
 * @author Hilary Brobbey
 * @param <T>
 */
public class LinkedList<T extends Comparable<T>> {

    Node head = null;
    int length;

    public LinkedList(T _data) {
        head = new Node<>(_data);
        length = 1;
    }

    public LinkedList() {
        this(null);
        length = 0;
    }

    public void add(T _data) {
        Node n = new Node<>(_data);
        if (head == null) {
            head = n;
            length++;
        } else {
            Node tmp = head;
            while (head.next != null) {
                head = head.next;
            }
            head.next = n;
            head = tmp;
            length++;
        }
    }

    public boolean delete(T _data) {
        if (head == null) {
            return false;
        }
        if (head.data.compareTo(_data) == 0) {
            head = head.next;
            length--;
            return true;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data.compareTo(_data) == 0) {
                curr.next = curr.next.next;
                length--;
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        StringBuilder strLinkedList = new StringBuilder();
        Node n = head;
        strLinkedList.append(n.data);
        while (n.next != null) {
            n = n.next;
            strLinkedList.append(" -> ").append(n.data);
        }
        return strLinkedList.toString();
    }

    class Node<T extends Comparable<T>> {

        T data;
        Node next;

        public Node(T _data) {
            data = _data;
        }
    }
}
