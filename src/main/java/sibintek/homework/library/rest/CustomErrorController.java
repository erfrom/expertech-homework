package sibintek.homework.library.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements ErrorController {
	
	private static final String PATH = "/error";
	
	@RequestMapping("/error")
	@ResponseBody
	public String handleError(HttpServletRequest request) {
		return "Wrong request format";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

}
