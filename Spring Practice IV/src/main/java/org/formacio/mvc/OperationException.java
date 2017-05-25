package org.formacio.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="id no hi trobat")
public class OperationException extends RuntimeException {
	private static final long serialVersionUID = 01L;
}
