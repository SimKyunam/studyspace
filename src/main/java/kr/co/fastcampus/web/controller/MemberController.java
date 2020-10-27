package kr.co.fastcampus.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mileNote on 2020-10-28
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Controller
public class MemberController {
    @RequestMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("hello world");
    }

    memberService.insert(username, password);

    memberService.print();
}
