package myspringactuatorproject;

@Component
public class MyMetrics {

    private final Counter helloCounter;

    @Autowired
    public MyMetrics(MeterRegistry meterRegistry) {
        this.helloCounter = meterRegistry.counter("myapp.hello.requests");
    }

    public void incrementHelloCounter() {
        helloCounter.increment();
    }
}