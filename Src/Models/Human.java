package Models;

public class Human {

    private int id;
    public static int counter;
    public static final int NUM;

    static {
        counter = 1;
        NUM = 5;
        System.out.println("static load");
    }

    public Human(){
        id = counter++;
        System.out.println("constructor load");
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
