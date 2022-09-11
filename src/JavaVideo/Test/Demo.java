package JavaVideo.Test;

public class Demo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.method(j);

        jo.method(new Jumpping() {
            @Override
            public void jumpping() {
                System.out.println("i am interface");
            }
        });
    }
}
