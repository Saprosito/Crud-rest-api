package com.example.parcial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.HandlerMethod;

import com.example.parcial.models.ErrorDTO;


@RestControllerAdvice
public class ControllerException {
    public ControllerException(){
    }
    @ExceptionHandler({TransactionException.class})
    public ResponseEntity<ErrorDTO>transaccioNoExitosaOErrorTecnicoAtrapado(Exception e, HandlerMethod handlerMethod){
        HttpStatus codigoHttp=HttpStatus.BAD_REQUEST;
        return new ResponseEntity(new ErrorDTO(codigoHttp.value(),e.getMessage(),"error",(String)null,false), codigoHttp);
    }
    @ExceptionHandler({DataNotFoundException.class})
    public ResponseEntity<ErrorDTO> dataNotFound(DataNotFoundException e, HandlerMethod handlerMethod){
        HttpStatus codigoHttp=HttpStatus.NOT_FOUND;
        return new ResponseEntity(new ErrorDTO(codigoHttp.value(),e.getMessage(),"error",(String)null,false),codigoHttp);
    }
}
