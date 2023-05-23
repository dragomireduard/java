package part5.ex5;

public class Program {
    public static void main(String[] args) {
        Counter x = new Counter(4);
        x.increase();
        System.out.println(x.value());
        x.increase(2);
        System.out.println(x.value());
        x.increase(-3);
        System.out.println(x.value());
        x.decrease();
        x.decrease(3);
        System.out.println(x.value());
    }
}
