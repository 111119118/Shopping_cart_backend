package com.cart.exception;

public class CartNotFoundException extends RuntimeException {

	public CartNotFoundException() {
		super();

	}

	public CartNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public CartNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public CartNotFoundException(String message) {
		super(message);

	}

	public CartNotFoundException(Throwable cause) {
		super(cause);

	}

}
