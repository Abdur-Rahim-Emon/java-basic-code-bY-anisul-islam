class P{
    int a,b; double c; String s;
    P(int x,double d, String s1 ){
        System.out.println(x+" "+d+" "+s1);
    }
    P(double d,int x){
        a=x;
        c=d;
    }
    void show(){
        System.out.println(a+" "+c);
    }
    
}



public class L4DefaultConstractor {
    public static void main(String[] args) {
        P ref1=new P(10,34.34,"Abdur Rahim Emon ");
        P ref2=new P(33.3,23);
        ref2.show();

    }
    

    
}
