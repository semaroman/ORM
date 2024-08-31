import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class Runner implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Runner.class);
        application.run(args);
    }

    @Override
    @Transactional
    public void run(String... args) {
    }
}