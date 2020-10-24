package kr.co.fastcampus.cli.aop;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by mileNote on 2020-10-24
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
public class Service {
    public void log(){
        log.error(">>> AOP log");
    }
}
