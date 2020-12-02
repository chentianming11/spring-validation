package com.github.chentianming11.spring.validation.controller;

import com.github.chentianming11.spring.validation.base.Result;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * @author 陈添明
 */
@RestController
@RequestMapping("/api/person")
@Validated
public class PersonController {


    @Data
    public static class SavePerson {

        private Long id;

        @NotNull
        @Size(min = 2, max = 10)
        private String name;

        @NotNull
        @Max(200)
        private Integer age;

        @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
        private String email;

    }

    @PostMapping("savePerson")
    public Result savePerson(@RequestBody @Valid SavePerson savePerson) {
        return Result.ok(savePerson);
    }


    @Data
    public static class UpdatePerson {

        @NotNull
        @Min(1000)
        @Max(10000000)
        private Long id;

        @Size(min = 2, max = 10)
        private String name;

        @Max(200)
        private Integer age;

        @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
        private String email;

    }

    @PostMapping("updatePerson")
    public Result savePerson(@RequestBody @Valid UpdatePerson updatePerson) {
        return Result.ok(updatePerson);
    }



    @GetMapping("queryPerson")
    public Result queryPerson(@ApiParam(name = "用户id", example = "10") @NotNull @Min(1000) @Max(10000000) Long id,
                              @ApiParam(name = "姓名", example = "哈哈") @NotNull @Size(min = 2, max = 10) String name,
                              @Max(200) Integer age,
                              @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$") String email) {


        return Result.ok();
    }



}
