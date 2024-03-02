package productservice;

public class Product {
    @Entity
    @Data
    public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private double price;

    }
