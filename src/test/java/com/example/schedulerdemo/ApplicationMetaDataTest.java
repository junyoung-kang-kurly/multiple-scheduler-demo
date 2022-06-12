package com.example.schedulerdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@Slf4j
@SpringBootTest
@Rollback(false)
class ApplicationMetaDataTest {

    @Value("${hostname}")
    private String hostname;

    @Autowired
    private ApplicationMetaDataRepository repository;

    @Test
    public void hello() {
        repository.save(new ApplicationMetaData(hostname));
        repository.save(new ApplicationMetaData(hostname));
        repository.save(new ApplicationMetaData(hostname));
        List<ApplicationMetaData> all = repository.findAll();
        log.info("all : {} ",all);
    }

}