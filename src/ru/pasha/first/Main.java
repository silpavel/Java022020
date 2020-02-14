package ru.pasha.first;
import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	    try {
            A a=new A(10);
	        B b1=new B(a,"Paul");
	        B b2=b1.clone();
	        //out.println(b1.getA().getData());
	        b2.getA().setData(20);
	        b2.setName("Victor");
            out.println(b1.getA().getData());
            out.println(b1.getName());

        }catch (CloneNotSupportedException cnse){err.println(cnse.toString());}

    }
}
class A{
    //methods
    @Override
    protected A clone() throws CloneNotSupportedException {
        return new A(data);
    }
    // constructors
    public A(int data) {this.data = data;}
    // private data, getters, setters
    private  int data;
        public int getData() {return data;}
        public void setData(int data) {this.data = data;}
    // private methods
}
class B{
    //methods
    @Override
    protected B clone() throws CloneNotSupportedException {
        return new B(new A(a.getData()), name);
    }
    // constructors
    public B(A a, String name) {
        this.a = a;
        this.name=name;
    }
    // private data, getters, setters
    private A a;
        public A getA() {return a;}
        public void setA(A a) {this.a = a;}
    private String name;
        public String getName() {return name;}
        public void setName(String name) {this.name = name;}
    // private methods
}
