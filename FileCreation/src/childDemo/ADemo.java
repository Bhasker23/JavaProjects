package childDemo;

public class ADemo {

    long z = 1234567894567896L;
    public void add(int a , int b){
        System.out.println(a+b);
    }

    public void add(long a , long b){
        System.out.println(a+b+" hello");
    }

    public static void main(String[] args) {

        ADemo a = new ADemo();
        a.add(12210222110L,131234555);
    }
}
