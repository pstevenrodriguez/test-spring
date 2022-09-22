import com.test.adapter.RestControllerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(
        basePackageClasses = {
                RestControllerAdapter.class
        }
)
public class Application {


    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
