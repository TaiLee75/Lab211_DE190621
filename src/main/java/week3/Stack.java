
package week3;


public class Stack {
    class Node {

        int data;
        Node next;

        public Node(int x, Node next) {
            this.data = x;
            this.next = null;
        }

        public Node(int x) {
            this(x, null);
        }

    }

    Node head;
    
    
    boolean isEmpty(){
        return head == null;
    }
    
    
    void push(int x){
        Node newNode = new Node(x);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    
    void traverse(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }else{
            Node current = head;
            while(current != null){
                System.out.println(current.data + "  ");
                current = current.next;
            }
        }
    }
    
    Node pop(){
        if(isEmpty()){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            return temp;
        }
    }
    
    
    Node get(){
        if(isEmpty()){
            return null;
        }else{
            return head;
        }
    }
    
}
