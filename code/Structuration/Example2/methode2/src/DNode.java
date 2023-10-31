public class DNode {
    private Object data; 
    private DNode next; 
    private DNode prev; 

    public DNode(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    
    public Object getData() {
        return data;
    }

    public DNode getNext() {
        return next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}
