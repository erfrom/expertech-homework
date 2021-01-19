package sibintek.homework.library.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javassist.tools.rmi.ObjectNotFoundException;

@ControllerAdvice
public class ExceptionController {
	
	 @ExceptionHandler(value = ObjectNotFoundException.class)
	 public ResponseEntity<Object> handlingNotFoundException(ObjectNotFoundException exception) {
		 return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	 }
	 
	 @ExceptionHandler(value = NumberFormatException.class)
	 public ResponseEntity<Object> handlingNumberFormatException(NumberFormatException exception) {
		 return new ResponseEntity<>("Wrong ISBN parameter format - must be of type long", HttpStatus.NOT_FOUND);
	 }
}
