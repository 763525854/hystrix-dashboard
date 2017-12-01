package hystixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "hystixdashboard")
public class HystixDashboard {
	public static void main(String[] args) {
		SpringApplication.run(HystixDashboard.class, args);
	}
}
