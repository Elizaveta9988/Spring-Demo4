package myspringactuatorproject;

@RestController
public class MyController {

    private final MyMetrics myMetrics;

    @Autowired
    public MyController(MyMetrics myMetrics) {
        this.myMetrics = myMetrics;
    }

    @GetMapping("/hello")
    public String hello() {
        myMetrics.incrementHelloCounter(); // Увеличиваем счётчик
        return "Hello World!";
    }
}