package co.edu.uptc.utilities;

public class Node {
    private Integer info;
    private Node next;
    private Node back;
    
    public Integer getInfo() {
        return info;
    }
    public void setInfo(Integer info) {
        this.info = info;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getBack() {
        return back;
    }
    public void setBack(Node back) {
        this.back = back;
    }
}

