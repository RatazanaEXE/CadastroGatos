package gato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public final class Main {

  // google-java-format off
  private Main() {
  }
  // google-java-format on


  /**
   * Starts the Spring Boot application.
   *
   * @param args application arguments
   */
  public static void main(final String[] args) {
    SpringApplication.run(Main.class);
  }
}
