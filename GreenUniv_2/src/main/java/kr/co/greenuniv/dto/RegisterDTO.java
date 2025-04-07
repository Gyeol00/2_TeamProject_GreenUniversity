package kr.co.greenuniv.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RegisterDTO {

    private String stdNo;
    private String lecNo;
    private String proNo;
    private int regAttenScore;
    private int regMidScore;
    private int regFinalScore;
    private int regEtcScore;
    private int regTotal;
    private String regGrade;

}
