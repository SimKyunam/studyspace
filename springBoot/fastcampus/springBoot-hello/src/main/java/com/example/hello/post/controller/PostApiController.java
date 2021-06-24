package com.example.hello.post.controller;

import com.example.hello.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/postApi")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestDto){
        System.out.println(requestDto);
    }
}