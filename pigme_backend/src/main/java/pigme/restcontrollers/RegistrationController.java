package pigme.restcontrollers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pigme.pojo.User;

@RestController
@RequestMapping("/register")
public class RegistrationController {
	
	@PostMapping(consumes="application/json")
    public ResponseEntity<String> register(HttpServletRequest request, @RequestBody User user) {
		
		//service calls to register user details
        return new ResponseEntity<String>("Registered successfully!", HttpStatus.OK);
    }
	
	@GetMapping(value="validatePhone/{phone}", consumes="application/json")
	public ResponseEntity<String> validatePhone(HttpServletRequest request, @PathVariable("phone") long phone) {
		
		//service calls to register user details
        return new ResponseEntity<String>("Phone validated successfully!", HttpStatus.OK);
		
	}
	
	@GetMapping(value="validateEmail/{email}", consumes="application/json")
	public ResponseEntity<String> validateEMail(HttpServletRequest request, @PathVariable("email") String email) {
		
		//service calls to register user details
        return new ResponseEntity<String>("Email validated successfully!", HttpStatus.OK);
	}
}