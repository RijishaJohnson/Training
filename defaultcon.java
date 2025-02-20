import java.util.*;
class Main {
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
    }
}
class Car{
    String model;

Car(){
    model="unknown";
    System.out.println("Default Constructor called");
}

void display()
{
    System.out.print("Model="+model);
}

}