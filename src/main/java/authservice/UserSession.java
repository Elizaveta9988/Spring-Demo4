package authservice;

@Entity
@Data
public class UserSession  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String username;
    private String password;

    public void setLoggedInAt(LocalDateTime now) {
    }
}