
public class MyQueue {
    
    String[]q;
    int depan,belakang,tengah;
    int max;
    
    public MyQueue(int size){
        depan = 0;
        belakang = 0;
        max = size;
        q = new String[max];
    }
    
    public void insert(String q){
        if(belakang==max){
            System.out.println("Antrian sudah penuh");
            System.out.println(q+"tidak masuk dalam antrian");
        }else{
            this.q[belakang]=q;
            belakang++; 
        }
        
    }
    public String infoBelakang(){
        return"Paling belakang: " +q[belakang-1];
    }
    public String infoDepan(){
        return "Paling depan: " + q[depan];
    }
    public String remove(){
        String a =q[depan];
        q[depan]=null;
        depan++;
        return a;
    }
    public String reomove(){
        String b=q[tengah];
        q[tengah]=null;
        tengah++;
        return b;
    }
    
            
    public void info(){
        for(int i=0;i<q.length;i++){
            System.out.println(i + 1 + q[i]);
        }
    }
    
   
}
