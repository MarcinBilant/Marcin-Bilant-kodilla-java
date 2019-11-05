package com.kodilla.kodillapatterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processorOrder(..))")
    public void logEventBefore() {
        LOGGER.info("Method processorOrder is in use");
    }

    @Around("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFacade.processorOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            result = proceedingJoinPoint.proceed();
            LOGGER.info("Method processorOrder is successful");
        } catch (Throwable throwable) {
            LOGGER.error("Method processorOrder is terminated with an error " + throwable.getMessage());
            throw throwable;
        }
        return result;
    }

}
