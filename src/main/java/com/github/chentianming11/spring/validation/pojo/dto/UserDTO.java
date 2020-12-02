package com.github.chentianming11.spring.validation.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author 陈添明
 */
@Data
@ApiModel("用户实体类")
public class UserDTO {

    @ApiModelProperty("用户id")
    @Min(value = 10000000000000000L, groups = Update.class)
    private Long userId;

    @ApiModelProperty("用户名")
    @NotNull(groups = {Save.class, Update.class})
    @Length(min = 2, max = 10, groups = {Save.class, Update.class})
    private String userName;

    @ApiModelProperty("账号")
    @NotNull(groups = {Save.class, Update.class})
    @Length(min = 6, max = 20, groups = {Save.class, Update.class})
    private String account;

    @ApiModelProperty("密码")
    @NotNull(groups = {Save.class, Update.class})
    @Length(min = 6, max = 20, groups = {Save.class, Update.class})
    private String password;

    @ApiModelProperty("工作")
    @NotNull(groups = {Save.class, Update.class})
    @Valid
    private Job job;

    @Data
    @ApiModel("工作实体类")
    public static class Job {

        @ApiModelProperty("工作id")
        @Min(value = 1, groups = Update.class)
        private Long jobId;

        @ApiModelProperty("工作名称")
        @NotNull(groups = {Save.class, Update.class})
        @Length(min = 2, max = 10, groups = {Save.class, Update.class})
        private String jobName;

        @ApiModelProperty("岗位")
        @NotNull(groups = {Save.class, Update.class})
        @Length(min = 2, max = 10, groups = {Save.class, Update.class})
        private String position;
    }

    /**
     * 保存的时候校验分组
     */
    public interface Save {
    }

    /**
     * 更新的时候校验分组
     */
    public interface Update {
    }
}
