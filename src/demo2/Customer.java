package demo2;

public class Customer {
    int id = 10;
    String name;
    int age;
    String address;

    public Customer() { // Constructor: khong co kieu du lieu tra ve && tu dong chay khi khoi tao doi tuong
        System.out.println("Create 1 object Customer!");

    }

    // method do not have static
    void buyCart() {

    }

    void sayHello(String msg){
        System.out.println( "Hello" + msg);
    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    //getter - setter: phuong thuc tham chieu vao thuoc tinh
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
