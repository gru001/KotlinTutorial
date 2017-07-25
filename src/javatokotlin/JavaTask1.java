package javatokotlin;

/**
 * Created by pranit on 25/7/17.
 */
public class JavaTask1 {

    public void doSomethingWithThread(){
        new Thread(() -> {
            System.out.println("do something");
        }).start();
    }

    public void doSomethingWithInterface(){
        Doable doable = new Doable() {
            @Override
            public void task1() {

            }

            @Override
            public void task2(String str1, String str2, Integer int1) {

            }
        };
    }
}
