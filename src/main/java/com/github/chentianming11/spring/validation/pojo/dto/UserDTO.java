package com.github.chentianming11.spring.validation.pojo.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

/**
 * @author 陈添明
 */
@Data
public class UserDTO {

    private Long userId;

    @NotEmpty
    private String userName;

    @Length(min = 8)
    private String account;

    @Length(min = 8)
    private String password;
}
