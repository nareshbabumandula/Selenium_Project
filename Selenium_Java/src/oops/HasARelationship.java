package oops;

public class HasARelationship {
    public static  void main(String args[]){
        // Creating engine object
        Engine engine = new Engine();

        // Ford
        System.out.println("Ford car specification..!");
        Ford ford = new Ford();
        ford.setEngine(engine);
        ford.startEngine();
    }

}
