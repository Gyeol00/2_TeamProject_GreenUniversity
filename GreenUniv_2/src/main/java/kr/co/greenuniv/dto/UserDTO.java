package kr.co.greenuniv.dto;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class UserDTO {

    private String uid;
    private String pass;
    private String name;
    private String email;
    private String hp;
    private String role;
    private String zip;
    private String addr1;
    private String addr2;

    // 추가 필드
    private String regip;

    @CreatedDate
    private LocalDateTime regDate;

    @CreatedDate
    private LocalDateTime leaveDate;
    private String proNo;
    private int depNo;

}
