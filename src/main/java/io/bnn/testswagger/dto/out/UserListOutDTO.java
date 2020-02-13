package io.bnn.testswagger.dto.out;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户列表DTO")
public class UserListOutDTO {
    @ApiModelProperty(value = "用户id",example = "1")
    private Integer userId;
    @ApiModelProperty(value = "姓名",example = "暴豪康")
    private String name;
    @ApiModelProperty(value = "年龄",example = "22")
    private Integer age;

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
}
