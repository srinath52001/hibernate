package org.demo;

import lombok.Data;
import org.demo.Answer;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Question {

    @Id
    private int question_id;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

}
