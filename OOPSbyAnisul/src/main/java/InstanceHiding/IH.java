
package InstanceHiding;

public class IH {
    double d,w,l;
    IH(double d,double w,double l){
        //d=d;
        w=w;// d,w,l is local in method local>instanc proroity
        l=l;//it is called instance hiding for remove it 
        // use this.d=d this,w=w,this.l=l
        // it will intitialize instance variable 
         this.d=d;
       /* this.w=w;
        this.l=l;
        */
        
    }
    void show(){
        System.out.println(d+" "+ w + " " + l);
    }
    public static void main(String[] args) {
        IH r= new IH(10,10,10);
        r.show();
    }
}
