package kr.co.fastcampus.cli.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

/**
 * Created by mileNote on 2020-10-18
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
@Getter
@Setter
@AllArgsConstructor
public class PersonForm {
    @NotBlank
    @Size(max=3)
    private String name;

    @Min(0)
    @Max(110)
    private int age;
}