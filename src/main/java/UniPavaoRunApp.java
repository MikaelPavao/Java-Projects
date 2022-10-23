import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "br.com")
@EntityScan(basePackages = "br.com.entity")
@EnableJpaRepositories(basePackages = "br.com.repository")
public class UniPavaoRunApp {
    public static void main(String[] args) {
        SpringApplication.run(UniPavaoRunApp.class);
    }
}
