package kr.co.fastcampus.cli.service;

import kr.co.fastcampus.cli.validation.PersonForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Locale;
import java.util.Set;

/**
 * Created by mileNote on 2020-10-18
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Service
@Slf4j
public class MyService {

    @Autowired
    private Validator validator;
    
    public void check(){
        Locale.setDefault(Locale.ENGLISH);
        PersonForm personForm = new PersonForm("   ", 120);
        Set<ConstraintViolation<PersonForm>> results = validator.validate(personForm);
        if(results.isEmpty()){
            log.info("성공");      
        }else{
            log.error("실패");
            results.forEach(x -> {
                log.error(">> error Message" + x.getMessage());
            });
        }
    }
}