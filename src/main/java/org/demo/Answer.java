package org.demo;

import lombok.Data;

import javax.crypto.Mac;
import javax.persistence.*;

@Entity
@Data
public class Answer {
    @Id
    private int answer_id;
    private String answer;

   @ManyToOne
    private Question question;
}
