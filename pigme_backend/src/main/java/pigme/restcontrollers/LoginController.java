package pigme.restcontrollers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pigme.pojo.User;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@PostMapping(consumes="application/json")
    public ResponseEntity<User> login(HttpServletRequest request, @RequestBody User user) {
		
		//authenticate and authorize user
		return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}