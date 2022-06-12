package com.example.schedulerdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.*;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EbloEventHandler{

    @EventListener(ContextRefreshedEvent.class)
    public void onContextRefreshedEvent(ContextRefreshedEvent event) {
        log.info("@@@ onContextRefreshedEvent !!!");
    }

    @EventListener(ContextStartedEvent.class)
    public void onContextStartedEvent(ContextStartedEvent event) {
        log.info("@@@ onContextStartedEvent !!!");
    }

    @EventListener(ContextStoppedEvent.class)
    public void onContextStoppedEvent(ContextStoppedEvent event) {
        log.info("@@@ onContextStoppedEvent !!!");
    }

    @EventListener(ContextClosedEvent.class)
    public void onContextClosedEvent(ContextClosedEvent event) {
        log.info("@@@ onContextClosedEvent !!!");
    }

    @EventListener(ApplicationContextInitializedEvent.class)
    public void onApplicationContextInitializedEvent(ApplicationContextInitializedEvent event) {
        log.info("@@@ onApplicationContextInitializedEvent !!!");
    }

    @EventListener(ApplicationEnvironmentPreparedEvent.class)
    public void onApplicationEnvironmentPreparedEvent(ApplicationEnvironmentPreparedEvent event) {
        log.info("@@@ onApplicationEnvironmentPreparedEvent !!!");
    }

    @EventListener(ApplicationPreparedEvent.class)
    public void onApplicationPreparedEvent(ApplicationPreparedEvent event) {
        log.info("@@@ onApplicationPreparedEvent !!!");
    }

    @EventListener(ApplicationStartedEvent.class)
    public void onApplicationStartedEvent(ApplicationStartedEvent event) {
        log.info("@@@ onApplicationStartedEvent !!!");
    }

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReadyEvent(ApplicationReadyEvent event) {
        log.info("@@@ onApplicationReadyEvent !!!");
    }

    @EventListener(ApplicationFailedEvent.class)
    public void onApplicationFailedEvent(ApplicationFailedEvent event) {
        log.info("@@@ onApplicationFailedEvent !!!");
    }

    @EventListener(ApplicationStartingEvent.class)
    public void onApplicationStartingEvent(ApplicationStartingEvent event) {
        log.info("@@@ onApplicationStartingEvent !!!");
    }

}