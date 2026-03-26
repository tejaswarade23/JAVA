package Employee;

public class LinkedList {
    Node start;
    Node end;
    Node current;
    int maxCount;

    public void add(Object data) {
        Node tmpNode = new Node(data);

        if (start == null)
            start = end = current = tmpNode;
        else {
            end.next = tmpNode;
            tmpNode.previous = end;
            end = tmpNode;
        }
        maxCount++;
    }

    public Object getFirst() {
        if (start == null) 
        	return null;
        current = start;
        return current.data;
    }

    public Object getLast() {
        if (start == null) 
        	return null;
        current = end;
        return current.data;
    }

    public Object getNext() {
        if (current == null || current.next == null)
            return null;
        current = current.next;
        return current.data;
    }

    public Object getPrevious() {
        if (current == null || current.previous == null)
        	return null;
        current = current.previous;
        return current.data;
    }
    
    public Object[] toArray() {
        Object[] arr = new Object[maxCount];

        Node temp = start;
        int i = 0;

        while (temp != null) {
            arr[i++] = temp.data;
            temp = temp.next;
        }

        return arr;
    }
}