package antifraud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

    @PostMapping("/api/antifraud/transaction")
    public ResponseEntity<Object> transaction(@RequestBody AmountBody amount) {
        long requestedAmount = amount.getAmount();
        ResultBody result = new ResultBody();

        if (requestedAmount <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else if (requestedAmount <= 200) {
            result.setResult("ALLOWED");
            return ResponseEntity.ok().body(result);
        } else if (requestedAmount <= 1500) {
            result.setResult("MANUAL_PROCESSING");
            return ResponseEntity.ok().body(result);
        } else {
            result.setResult("PROHIBITED");
            return ResponseEntity.ok().body(result);
        }
    }
}
