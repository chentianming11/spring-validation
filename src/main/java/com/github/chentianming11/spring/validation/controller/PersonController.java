package com.github.chentianming11.spring.validation.controller;

import com.github.chentianming11.spring.validation.base.Result;
import com.github.chentianming11.spring.validation.pojo.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈添明
 */
@RestController
@RequestMapping("/api/person")
@Validated
@Api(tags = "Person管理")
public class PersonController {



    @ApiOperation("保存Person")
    @PostMapping("savePerson")
    public Result<Person> savePerson(@RequestBody @Valid Person person) {
        return Result.ok(person);
    }



    @ApiOperation("查询person")
    @GetMapping("queryPerson")
    public Result<List<Person>> queryPerson(@ApiParam(name = "用户id") @NotNull @Min(1000) @Max(10000000) Long id,
                              @ApiParam(name = "姓名") @NotNull @Size(min = 2, max = 10) String name,
                              @Max(200) Integer age,
                              @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$") String email) {
        List<Person> list = new ArrayList<>();
        list.add(new Person().setAge(10).setEmail("xxxxx").setId(1L).setName("哈哈"));

        return Result.ok(list);
    }



}
