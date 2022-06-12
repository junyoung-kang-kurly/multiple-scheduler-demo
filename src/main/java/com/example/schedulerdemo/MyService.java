package com.example.schedulerdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDateTime;

@EnableScheduling
@Service
@Slf4j
public class MyService {

  private final ApplicationMetaDataRepository repository;
  private final String hostname;

  public MyService(
      ApplicationMetaDataRepository repository,
      @Value("${hostname}") String hostname) {
    this.repository = repository;
    this.hostname = hostname;
  }

//  @PostConstruct
//  public ApplicationMetaData create() {
//    log.info("create metadata");
//    return repository.save(new ApplicationMetaData(hostname));
//  }

  @Scheduled(fixedDelay = 5000, initialDelay = 5000)
  public void update() {
    log.info("update metadata");
    ApplicationMetaData metaData = new ApplicationMetaData(hostname);
    repository.save(metaData);
  }

  @PreDestroy
  public void shutdown() {
    log.info("remove metadata");
    repository.findById(hostname).ifPresent(repository::delete);
  }
}
