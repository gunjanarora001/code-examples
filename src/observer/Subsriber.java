package observer;

public class Subsriber implements Observer{

    private String name;
    public Subsriber(String name){
        this.name = name;
    }

 @Override
    public void update(){
            System.out.println("Your Subject has posted something");
    }

    public String getName(){
        return this.name;
    }
    
}
