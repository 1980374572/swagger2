package io.bnn.testswagger.dto.in;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户修改DTO")
public class UserUpdateInDTO {
    @ApiModelProperty(value = "用户id",example = "1")
    private Integer userId;
    @ApiModelProperty(value = "姓名",example = "暴豪康")
    private String name;
    @ApiModelProperty(value = "密码",example = "123")
    private String password;
    @ApiModelProperty(value = "年龄",example = "22")
    private Integer age;
    @ApiModelProperty(value = "生日时间戳",example = "16561354532")
    private Long birthdayTimestamp;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getBirthdayTimestamp() {
        return birthdayTimestamp;
    }

    public void setBirthdayTimestamp(Long birthdayTimestamp) {
        this.birthdayTimestamp = birthdayTimestamp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
