package cinema.cotroller;

import cinema.exeption.BusinessException;
import cinema.exeption.NotAuthorizedException;
import cinema.model.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler()
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ErrorResponse errorHandler(BusinessException exception) {
        log.info("exception {}", exception.getMessage());
        return new ErrorResponse(exception.getMessage());
    }

    @ExceptionHandler()
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    ErrorResponse errorHandler(NotAuthorizedException exception) {
        log.info("exception {}", exception.getMessage());
        return new ErrorResponse(exception.getMessage());
    }
}
