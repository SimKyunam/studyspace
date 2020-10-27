package kr.co.fastcampus.web.controller;

import kr.co.fastcampus.web.entity.Member;
import kr.co.fastcampus.web.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by mileNote on 2020-10-28
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        List<Member> list = memberService.list();
        mv.addObject("members", list);
        return mv;
    }

    @RequestMapping("/create")
    public void create(){
        memberService.insert("simkyunam", "password");
    }
}
