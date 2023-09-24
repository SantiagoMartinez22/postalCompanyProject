package com.workshop.postal.exceptions;


    public class BusinessException extends RuntimeException {

        public BusinessException(String message) {
            super(message);
        }

        public BusinessException(String message, Throwable cause) {
            super(message, cause);
        }
    }


