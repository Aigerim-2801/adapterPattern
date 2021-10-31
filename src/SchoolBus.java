public class SchoolBus implements Bus {

    @Override
    public void fill() {
        System.out.print("Filling with gas, ");
    }

    @Override
    public void run() {
       System.out.println("Running!");
    }
}
