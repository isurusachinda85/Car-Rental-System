package lk.ijse.carRentSystem.advisor;

import lk.ijse.carRentSystem.util.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) // status code
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handleExceptions(RuntimeException e){
        System.out.println(e.getMessage());
        return new ResponseUtil("Error",e.getMessage(),null);
    }
}
