package pigme.restcontrollers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pigme.pojo.Payment;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@GetMapping("/{id}")
	public ResponseEntity<Payment> pyamentDtl(HttpServletRequest request, @PathVariable("id") String id) {
		
		//logic to get details for the payment id
		return new ResponseEntity<Payment>(new Payment(), HttpStatus.OK);
	}

	@PostMapping(consumes = "application/json")
	public ResponseEntity<String> pay(HttpServletRequest request, @RequestBody Payment payment) {

		// service call to process payment
		return new ResponseEntity<String>("Transaction successful!", HttpStatus.OK);
	}

	@GetMapping("/history/{account}")
	public ResponseEntity<Map<String, Payment>> history(HttpServletRequest request,
			@PathVariable("account") String account) {

		Map<String, Payment> history = new HashMap<>();
		// calls to get payment history
		return new ResponseEntity<Map<String, Payment>>(history, HttpStatus.OK);
	}
}