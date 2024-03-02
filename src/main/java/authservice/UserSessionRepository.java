package authservice;

public interface UserSessionRepository extends JpaRepository<UserSession, Long> {

    void deleteByUserId(Long userId);
}