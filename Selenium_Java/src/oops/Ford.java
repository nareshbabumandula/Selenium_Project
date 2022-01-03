package oops;

public class Ford {

    public Engine engine;

    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine=engine;
    }

    public void startEngine(){
        engine.startsWithDieselEngine();
    }

}
