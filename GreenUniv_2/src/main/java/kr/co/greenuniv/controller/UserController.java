package kr.co.greenuniv.controller;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.greenuniv.dto.UserDTO;
import kr.co.greenuniv.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/user")
@Controller
public class UserController {

    private UserService userService;

    // 로그인 페이지
    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }

    @PostMapping("/login")
    public String login(UserDTO userDTO) {

        //userService.findById;

        return "redirect:/index";
    }

    // 회원가입 페이지
    @GetMapping("/register")
    public String register() {
        return "/user/register";
    }

    @PostMapping("/user/register")
    public String register(HttpServletRequest req, UserDTO userDTO) {

        String regip = req.getRemoteAddr();
        userDTO.setRegip(regip);

        userService.register(userDTO);

        return "redirect:/user/login";
    }

    // 약관 페이지
    @GetMapping("/terms")
    public String getTerms() {

        return "/user/terms";
    }

    // 이메일 중복 체크
    @GetMapping("/email")
    public String checkEmail() {
        return "/user/email";
    }

}