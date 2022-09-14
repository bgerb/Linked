public class Node {
    private Node previous;
    private Node next;
    private int data;
    public Node(Node forprev, Node fornext, int fordata) { // sets a node
        previous = forprev;
        next = fornext;
        data = fordata;

    }
    public Node prev(){ // returns previous node
        return previous;
    }
    public Node getNext(){ // returns next node
        return next;
    }
    public void setnext(Node _next){
        next = _next;
    }
    public void setPrevious(Node _previous) { previous = _previous;}
    public int returncontent(){return data;}
    public String returnnode(){
        return("data "  + data);
    }
}
