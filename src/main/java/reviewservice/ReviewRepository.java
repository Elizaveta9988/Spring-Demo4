package reviewservice;


    public interface ReviewRepository extends JpaRepository<Review, Long> {
        // Здесь могут быть определены дополнительные методы, если требуется специфичное поведение.
}
