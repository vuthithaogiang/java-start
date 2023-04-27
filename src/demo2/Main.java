package demo2;

public class Main {

    public static void main(String[] args){
        int x = 10; // local variable

        Customer c = new Customer(); // c is Object: Customer
        Customer k = new Customer();

        c.setId(100);
        k.setId(99);
        c.buyCart();
        k.buyCart();
        c.sayHello("aa");
        c.printInfo(); //this: c: doi tuong ngam dinh - doi tuong tao ra tu lop Customer
    }
}
