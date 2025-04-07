package kr.co.greenuniv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "User")
public class User {

    @Id
    private String uid;
    private String pass;
    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String hp;

    private String role = "Student";

    private String zip;
    private String addr1;
    private String addr2;

    @CreatedDate
    private LocalDateTime regDate;

    @CreatedDate
    private LocalDateTime leaveDate;
    private String proNo;
    private int depNo;

}
