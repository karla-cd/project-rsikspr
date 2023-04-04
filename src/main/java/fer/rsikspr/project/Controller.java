package fer.rsikspr.project;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health")
    public ResponseEntity<String> getOk() {
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }

}
