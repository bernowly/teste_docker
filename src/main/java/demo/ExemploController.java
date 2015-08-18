package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author bernowly
 *
 */
@RestController
public class ExemploController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET, value="/")
	public String hello() {
		return "Hello Bernowly";
	}

}
