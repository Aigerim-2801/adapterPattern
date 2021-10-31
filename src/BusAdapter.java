public class BusAdapter implements ToyBus{
    Bus bus;
    public BusAdapter(Bus bus) {
        this.bus = bus;
    }
    @Override
    public void runNoWay() {
        bus.run();
    }
}
