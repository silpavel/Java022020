package ru.pasha.first;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class Test {
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
class Reader{
    //methods
    void takeBook(int i){
        out.println(name+" have "+i+" book(s)");
    }
    void takeBook(String...books){
        out.println(name+" have books: "+Arrays.toString(books));
    }

    void returnBook(){}
    // private
    private String name;
    private int ticket;
    private String faculty;
    private String birthday;
    private String phone;
}
class Books{
    private String name;
    private String autor;
}
class Student{
    protected String name, group;
    protected double averageRating;
    int getScholarship(){
        return averageRating==5 ? 100 : 80;
    }
    public Student(String name, String group, double averageRating) {
        this.name = name;
        this.group = group;
        this.averageRating = averageRating;
    }
}
class Aspirant extends Student{
    private String scientificWork;
    @Override
    int getScholarship() {
        return averageRating==5 ? 200 : 180;
    }
    public Aspirant(String name, String group,
                    double averageRating, String scientificWork) {
        super(name, group, averageRating);
        this.scientificWork = scientificWork;
    }
}
// let's image one package
class Car{
    String make;
    String level;
    int weight;
    Driver driver;
    Engine engine;
    void start(){out.println("start");}
    void stop(){out.println("stop");}
    void turnRight(){out.println("turn right");}
    void turnLeft(){out.println("turn left");}
    void printInfo(){
        out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", level='" + level + '\'' +
                ", weight=" + weight +
                ", driver=" + driver.toString() +
                ", engine=" + engine.toString() +
                '}';
    }
}
class Engine{
    String vender;
    int power;
    @Override
    public String toString() {
        return "Engine{" +
                "vender='" + vender + '\'' +
                ", power=" + power +
                '}';
    }
}
class Driver{
    String name;
    int drivingExperience;
    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
class Lorry extends Car{
    int bearingCapacity;
}
class SportCar extends Car{
    int limitSpeed;
}
// other block
abstract class Animal{
    String name, food, location;
    abstract void makeNoise();
    abstract void eat();
    void sleep(){};
    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }
}
class Dog extends Animal{
    int i;
    @Override
    void makeNoise(){}
    @Override
    void eat(){}
    public Dog(String name, String food, String location, int i) {
        super(name, food, location);
        this.i = i;
    }
}
class Cat extends Animal{
    double d;
    @Override
    void makeNoise(){}
    @Override
    void eat(){}
    public Cat(String name, String food, String location, double d) {
        super(name, food, location);
        this.d = d;
    }
}
class Horse extends Animal{
    float f;
    @Override
    void makeNoise(){}
    @Override
    void eat(){}
    public Horse(String name, String food, String location, float f) {
        super(name, food, location);
        this.f = f;
    }
}
class DrDulittle{
    static void treatAnimal(Animal animal){
        out.println("animal= "+ animal.getClass().getSimpleName()+ ", food= "+animal.food+"," +
                " location= "+animal.location);
    }
}
class StrArr{
    private String[] str;
    public StrArr(int length) {
        this.str = new String[length];
    }
    String getStringAt(int i){
        if(i<0 || i>=str.length) return "";
        return new String(str[i]);
    }
    void setString(String s, int index){
        if(index<0 || index>=str.length) return;
        str[index]=new String(s);
    }
    public StrArr append(StrArr sar){
        if(sar==null) return this;
        StrArr resault=new StrArr(str.length+sar.str.length);
        for(int i=0;i<str.length;i++)
            resault.str[i]=str[i];
        for (int i = 0; i <sar.str.length ; i++) {
            resault.str[i+str.length]=sar.str[i];
        }
        return resault;
    }
    @Override
    public String toString() {
        return "StrArr{" +
                "str=" + Arrays.toString(str) +
                '}';
    }
    public void uniq(){
        /*
        String[] buf=new String[str.length];
        int position=-1;
        for(int i=0;i<str.length;i++){
            boolean isUniq=true;
            for(int j=0;j<=position && isUniq;j++){
                if(str[i].equals(buf[j])) isUniq=false;
            }
            if(isUniq) buf[++position]=str[i];
        }
        str=Arrays.copyOfRange(buf,0,position+1);
        */
        Set<String> set=new HashSet(Arrays.asList(str));
        set.toArray( str= new String[set.size()] );

    }
}
class Polinom{
    private int[] ks;
    public Polinom(int...ks) { this.ks = ks; }
    int calc(int x){
        int sum=0;
        for (int i =0;i< ks.length; i++) {
            sum+=ks[i]*Math.pow(x,i);
        }
        return sum;
    }
    Polinom sum(Polinom plm){return exe(plm,'s');}
    Polinom def(Polinom plm){return exe(plm,'d');}
    private Polinom exe(Polinom plm, char c){
        if(plm==null) return this;
        int a=ks.length;
        int b=plm.ks.length;
        int[] res=new int[(a<b)?b:a];
        for(int i=0;i<res.length;i++){
            int aa= (i<a ? ks[i] : 0);
            int bb= (i<b ? plm.ks[i] : 0);
            res[i]= (c=='s') ? aa+bb : aa-bb;
        }
        return new Polinom(res);
    }
    @Override
    public String toString() {
        return "Polinom{" +
                "ks=" + Arrays.toString(ks) +
                '}';
    }
}
// interfaces
interface Printable{void print();}
class Book implements Printable{
    @Override
    public void print() {out.println(this.getClass().getSimpleName());}
    static void printBooks(Printable[] printable){
        for (Printable prt:printable) {
            if(prt instanceof Book) out.println(prt.toString());
        }
    }
}
class Magazine implements Printable{
    @Override
    public void print() {out.println(this.getClass().getSimpleName());}
    static void printMagazines(Printable[] printable){
        for (Printable prt:printable) {
            if(prt instanceof Magazine) out.println(prt.toString());
        }
    }
}







