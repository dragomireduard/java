package part8.ex10;

public class Program {
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();

        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);
        mattsIOU.setSum("Michael", 92);
        mattsIOU.printValues();
    }
}
