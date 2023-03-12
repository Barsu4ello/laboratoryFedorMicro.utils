package com.cvetkov.fedor.laboratoryworkmicro.utils.exception;


import feign.FeignException;

public class ExceptionResponseStatusChecker {

    public static void check404StatusAndExceptionFeignType(String entityName, Throwable e) {
        if (e.getCause() instanceof FeignException && ((FeignException) e.getCause()).status() == 404) {
            FeignException feignException = (FeignException) e.getCause();
            String[] urlElements = feignException.request().url().split("/");
            long id = Long.parseLong(urlElements[urlElements.length - 1]);
            throw new ObjectNotFoundException(entityName + " with id " + id + " not found");
        }
    }
}
