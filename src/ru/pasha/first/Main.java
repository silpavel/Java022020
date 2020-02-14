package ru.pasha.first;
import java.util.Arrays;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Matrix m1=new Matrix(2,2);
        m1.matrix=new double[][]{{1,2},{3,4}};
        Matrix m2=new Matrix(2,2);
        m2.matrix=new double[][]{{2,1},{4,3}};
        out.println(m1);
        out.println(m2);
        out.println(m1.sum(m2));
        out.println(m1.muxN(2));

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
class Phone{
    private String number;
    private String model;
    private int weight;
    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public int getWeight() {
        return weight;
    }
    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this(number,model,0);
        this.number = number;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    //methods
    void sendMessage(int...number){
        out.println(Arrays.toString(number));
    }

}
class Person{
    private String fullName;
    private int age;
    //methods
    void talk(){out.println(fullName+" talk");}
    void move(){out.println(fullName+" speak");}
    //constructors
    public Person() {
        fullName="Jonh Smith";
        age=18;
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
class Matrix{
    double[][] matrix;
    int row,col;
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix=new double[row][col];
    }
    Matrix sum(Matrix mx){
         if(mx==null || col!=mx.col || row!=mx.row)
            return null;
         Matrix m=new Matrix(row, col);
         for(int y=0;y<m.row;y++){
             for(int x=0;x<m.col;x++){
                 m.matrix[y][x]=matrix[y][x]+mx.matrix[y][x];
             }
         }
         return m;
    }
    Matrix muxN(double d){
        Matrix m=new Matrix(row, col);
        for(int y=0;y<m.row;y++){
            for(int x=0;x<m.col;x++){
                m.matrix[y][x]=matrix[y][x]*d;
            }
        }
        return m;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.deepToString(matrix) +
                ", row=" + row +
                ", col=" + col +
                '}';
    }
}

