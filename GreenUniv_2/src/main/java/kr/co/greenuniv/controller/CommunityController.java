package kr.co.greenuniv.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class CommunityController {

    @GetMapping("/community/CommunityInfo")
    public String CommunityInfo() {
        return "/community/CommunityInfo";
    }

    @GetMapping("/community/Einformation")
    public String Einformation(){

        return "/community/Einformation";
    }

    @GetMapping("/community/Fboard")
    public String Fboard(){

        return "/community/Fboard";
    }

    @GetMapping("/community/news")
    public String news(){
        return "/community/news";
    }

    @GetMapping("/community/qna")
    public String qna(){

        return "/community/qna";
    }

    @GetMapping("/community/reference")
    public String reference(){

        return "/community/reference";

    }

    @GetMapping("/community/newsEdit")
    public String newsEdit() {
        return "/community/newsEdit";
    }

}

