//write a progra,m where return  the nth node from the last node in a lined list;
public class program1 {
    public static class node{
        int data ;
        node next;
        node(int data){
            this.data =data;

        }

    }
    public static class linkedlist{
        node head =null;
        node tail =null;
        int size(){
            node temp =head;
            int count =0;
            while(temp!=null){
                count++;
                temp=temp.next;

            }
            return count;
        }
        void insertAtEnd(int data){
            node temp =new node(data);
            if(head == null){
                head =temp;
            
            }
            else{
                tail.next =temp;
            }
            tail =temp;
        }
        void display(){
            node temp =head;
            while(temp !=null){
                System.out.println(temp.data);
                temp =temp.next;
            }
        }
        node returnNode(int n){
            node temp =head;
            int m =(size())-n+1;

            for(int i =1;i<=m-1;i++){
                temp =temp.next;
            }
            return temp;
        }


    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(9);
        ll.display();
        System.out.println("now you have to enter the nth node that you want to print");
        node nodes = ll.returnNode(3);
        System.out.println("the data of the node is ");
        System.out.println(nodes.data);
    }
    
}
