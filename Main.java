
public class Main {
    
    public static void main(String[]args){
        MyQueue queue1 = new MyQueue(3);
        queue1.insert("A");
        queue1.insert("B");
        queue1.insert("C");
        queue1.insert("F");
        queue1.info();
        
        queue1.infoBelakang();
        System.out.println(queue1.infoBelakang());
        
        queue1.infoDepan();
        System.out.println(queue1.infoDepan());
        
        queue1.remove();
        queue1.info();
        
        queue1.infoBelakang();
        System.out.println(queue1.infoBelakang());
        
        queue1.infoDepan();
        System.out.println(queue1.infoDepan());
        
        queue1.remove();
        queue1.info();
        
        queue1.infoBelakang();
        System.out.println(queue1.infoBelakang());
        
        queue1.infoDepan();
        System.out.println(queue1.infoDepan());
    }
     
}

        
       
           