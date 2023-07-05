package observer;

public class Main {
  public static void main(String[] args) {
    Subject telusko = new Subject();

    Observer sam = new Subsriber("Samson1");
    Observer kant = new Subsriber("JOhn");
    telusko.addObserver(sam);
    telusko.addObserver(kant);
    telusko.removeObserver(sam);

    telusko.notifyObservers();
  }  
}
