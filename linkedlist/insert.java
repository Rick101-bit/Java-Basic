public class insert {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data =data;
        }
    }
    public static class linkedList{
        node head =null;
        node tail =null;
         void insertAtIdx(int idx ,int data){
            node temp =head;
            node t =new node(data);
            if(idx==size()){
                insertAtEnd(data);
            }
            else if(idx==0){
                insertAtHead(data);

            }
            else if(idx<0 || idx>size()){
                System.out.println("the wrong index is given ");
            }
            for(int i =1;i<=idx-1;i++){
                temp =temp.next;
            }
              t.next =temp.next;
              temp.next =t;  
         }

        void insertAtEnd(int data){
            node temp =new node(data);
            if(head == null){
                head =temp;
            }
            else{
                tail.next=temp;
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
        void insertAtHead(int data){
            node temp =new node(data);
            if(head ==null){
                head =tail =temp;

            }
            else{
                temp.next =head;
                head =temp;
            }
        }
        int size(){
            node temp =head;
            int count =0;
            while(temp !=null){
                count++;
                temp =temp.next;

            }
            return count;
        }
        int getElement(int idx){
            node temp =head;
            if(idx <0 || idx>size()){
                System.out.println("wrong credentials");
            }
            else{
                for(int i =1;i<= idx;i++){
                    temp =temp.next;
                }
               

            }
            return temp.data;
        }
        void deleteAtIndex(int idx){
            node temp =head;
           for(int i =1;i<=idx-1;i++){
            temp =temp.next;
           }
           temp.next = temp.next.next;
        }

    }
    public static void main(String[] args) {
        linkedList ll =new linkedList();
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
    
        ll.insertAtIdx(3, 5);
        ll.display();
        int ele =ll.getElement(3);
        System.out.println("the element odf the index is "+ele);
        ll.deleteAtIndex(2);
        ll.display();
    }
    
}
