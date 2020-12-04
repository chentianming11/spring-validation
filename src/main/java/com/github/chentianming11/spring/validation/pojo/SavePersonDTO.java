package com.github.chentianming11.spring.validation.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @author 陈添明
 */
@Data
@Accessors(chain = true)
@ApiModel("保存用户DTO类")
public class SavePersonDTO {

    @ApiModelProperty("姓名")
    @NotNull
    @Size(min = 2, max = 10)
    private String name;

    @ApiModelProperty("年龄")
    @NotNull
    @Max(200)
    private Integer age;

    @ApiModelProperty("邮箱")
    @Pattern(regexp = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$")
    private String email;
}
