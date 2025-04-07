package kr.co.greenuniv.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Slf4j
@Controller
public class WriteController {

    @GetMapping("/community/CommunityWrite")
    public String write() {
        return "/community/CommunityWrite";
    }

}
