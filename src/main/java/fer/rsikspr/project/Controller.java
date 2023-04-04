package fer.rsikspr.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    // http://localhost:8080/health

    @GetMapping("/health")
    public ResponseEntity<String> getOk() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("OK");
    }

}
