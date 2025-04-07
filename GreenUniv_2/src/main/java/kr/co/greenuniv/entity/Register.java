package kr.co.greenuniv.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "Register")
public class Register {

    @Id
    private String stdNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecNo")
    private Lecture lecture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "proNo")
    private Professor professor;

    private int regAttenScore;
    private int regMidScore;
    private int regFinalScore;
    private int regEtcScore;
    private int regTotal;
    private String regGrade;

}
