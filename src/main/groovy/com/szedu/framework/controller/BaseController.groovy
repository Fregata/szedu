package com.szedu.framework.controller

import javax.servlet.http.HttpServletRequest
import javax.validation.ConstraintViolationException

import org.apache.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

import com.szedu.framework.exception.InputException
import com.szedu.framework.service.AppManageService
import com.szedu.framework.service.UserManageService

class BaseController {

    final Logger log = Logger.getLogger(this.class)

    @Autowired
    AppManageService appService
	
    @RequestMapping("/")
    String index(HttpServletRequest request) {
        log.debug("root request: ${request.requestURI}")
        "index"
    }

    @ExceptionHandler(org.springframework.validation.BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody Map handleBindException(org.springframework.validation.BindException ex) {

        if(ex.fieldError )
            return [ message: ex.fieldError.defaultMessage ]
        log.debug("BIND EXCEPTION: ${ex.message}")
        [ message: ex.message ]
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody Map handleError(HttpServletRequest req, Exception exception) {

        exception = exception.cause ? exception.cause : exception

        if(exception instanceof InputException) {
            return [ message: exception.message ]
        }

        if(exception instanceof ConstraintViolationException) {
            ConstraintViolationException cve = exception
            return [ message: "Error: database constraint violation"]
        }

        log.error("Request: " + req.getRequestURL() + " raised " + exception);

        [message:  "Sever Error: " + exception.message ]

    }

}
