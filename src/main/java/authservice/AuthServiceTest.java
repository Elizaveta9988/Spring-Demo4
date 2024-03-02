package authservice;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserSessionRepository userSessionRepository;

    @InjectMocks
    private AuthServiceImpl authService;

    @BeforeEach
    public void setup() {
        // Настройка mock объектов, если необходимо
    }

    @Test
    public void testRegister() {
        User user = new User();
        authService.register(user);
        verify(userRepository).save(user);
    }

    @Test
    public void testLogin() {
        String username = "testUser";
        String password = "testPassword";
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        // Мокируем возвращаемое значение при вызове метода findByUsername() UserRepository
        when(userRepository.findByUsername(username)).thenReturn(user);

        // Вызываем метод login() нашего сервиса
        authService.login(username, password);

        // Проверяем, вызывается ли метод save() с UserSession
        verify(userSessionRepository).save(any(UserSession.class));
    }


    @Test
    public void testLogout() {
        Long userId = 1L;

        // Предположим, что при выходе из системы будет удаляться сессия
        authService.logout(userId);

        verify(userSessionRepository).deleteByUserId(userId);
    }
}