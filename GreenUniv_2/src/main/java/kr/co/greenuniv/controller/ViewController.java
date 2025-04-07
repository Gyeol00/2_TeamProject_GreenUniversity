package kr.co.greenuniv.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Slf4j
@Controller
public class ViewController {

    @GetMapping("/community/CommunityView")
    public String view() {
        return "/community/CommunityView";
    }


}
