package com.library.domain;

import lombok.Data;
import javax.persistence.*;

@Data
public class Books {
  @Id
  @Column(name="BOOK_ID")
  private String id;
  private String title;
  private String summary; //추가
  private String author;
  private String stock;
}