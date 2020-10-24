package kr.co.fastcampus.cli.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * Created by mileNote on 2020-10-24
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Slf4j
public class AopBean {
    public void aroundLog(ProceedingJoinPoint pjp){
        log.error(">>>before aop Log");
        try {
            pjp.proceed();
            log.error(">>>returning aop Log");
        } catch (Throwable throwable) {
            log.error(">>>throwing aop Log");
        }
        log.error(">>>after aop Log");
    }
}
