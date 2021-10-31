public class Main {
    public static void main(String[] args) {
        SchoolBus schoolBus = new SchoolBus();
        ToyBus toyBus = new PlasticToyBus();
        ToyBus busAdapter = new BusAdapter(schoolBus);

        System.out.print("School Bus: ");
        schoolBus.fill();
        schoolBus.run();

        System.out.print("ToyBus: ");
        toyBus.runNoWay();

        System.out.print("BusAdapter: ");
        busAdapter.runNoWay();
    }
}
//2-way
//    public static void main(String[] args) {
//    SchoolBus schoolBus = new SchoolBus();
//    ToyBus busAdapter = new BusAdapter(schoolBus);
//    Tester(busAdapter);}
//    private static void Tester(ToyBus busAdapter) {
//        busAdapter.runNoWay();
//    }

