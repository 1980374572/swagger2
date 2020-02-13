package io.bnn.testswagger.controller;

import io.bnn.testswagger.dto.in.UserCreateInDTO;
import io.bnn.testswagger.dto.in.UserUpdateInDTO;
import io.bnn.testswagger.dto.out.PageOutDTO;
import io.bnn.testswagger.dto.out.UserListOutDTO;
import io.bnn.testswagger.dto.out.UserShowOutDTO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"user crud"})
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "用户列表页查询接口", notes = "备注", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "名称", required = false, paramType = "String", example = "暴豪康"),
            @ApiImplicitParam(name = "age",value = "年龄", required = false, paramType = "Integer", example = "22"),
            @ApiImplicitParam(name = "pageNum",value = "当前页", required = false, paramType = "Integer",defaultValue = "1", example = "1")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 400, message = "客户端错误"),
            @ApiResponse(code = 500, message = "服务器错误")
    })
    @GetMapping("/search")
    public PageOutDTO<UserListOutDTO> search(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false, defaultValue = "1") Integer pageNum
    ){
        return null;
    }


    @ApiOperation(value = "根据id查询一条用户接口", notes = "备注", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId",value = "用户id",paramType = "Integer",example = "1")
    })
    @GetMapping("/getById")
    public UserShowOutDTO getById(
            @RequestParam Integer userId
    ){
        return null;
    }

    @ApiOperation(value = "添加用户",notes = "备注",produces = "application/json")
    @PostMapping("/create")
    public Integer create(
            @RequestBody UserCreateInDTO userCreateInDTO
    ){
        return null;
    }
    @ApiOperation(value = "修改用户",notes = "备注",produces = "application/json")
    @PostMapping("/update")
    public void update(
            @RequestBody UserUpdateInDTO userUpdateInDTO
    ){

    }
    @ApiOperation(value = "删除用户",notes = "备注")
    @PostMapping("/delete")
    public void delete(
            @RequestBody Integer userId
    ){

    }
    @ApiOperation(value = "批量删除用户",notes = "备注")
    @PostMapping("/batchDelete")
    public void batchDelete(
            @RequestBody List<Integer> userIds
    ){

    }
}
