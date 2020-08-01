package com.github.chentianming11.spring.validation.pojo.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @author 陈添明
 */
@Data
public class UserDTO {

    @Min(value = 10000000000000000L, groups = Update.class)
    private Long userId;

    @NotEmpty(groups = {Save.class, Update.class})
    private String userName;

    @Length(min = 8, groups = {Save.class, Update.class})
    private String account;

    @Length(min = 8, groups = {Save.class, Update.class})
    private String password;

    /**
     * 保存的时候校验分组
     */
    public interface Save{}

    /**
     * 更新的时候校验分组
     */
    public interface Update{}
}
