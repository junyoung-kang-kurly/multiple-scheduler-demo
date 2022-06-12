package com.example.schedulerdemo;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@ToString
@Entity
@NoArgsConstructor
@Table(name = "application_metas")
public class ApplicationMetaData {

  @Id
  @Column(unique = true)
  private String hostname;

  private LocalDateTime lastAccessedAt;

  public ApplicationMetaData(String hostname) {
    this.hostname = hostname;
    this.lastAccessedAt = LocalDateTime.now();
  }

  public void updateLastAccessedAt(LocalDateTime time) {
    this.lastAccessedAt = time;
  }
}
