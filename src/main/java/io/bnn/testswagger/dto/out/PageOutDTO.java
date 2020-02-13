package io.bnn.testswagger.dto.out;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "分页DTO")
public class PageOutDTO<T> {
    @ApiModelProperty(value = "总条数",example = "100")
    private Integer total;
    @ApiModelProperty(value = "当前页",example = "1")
    private Integer pageNum;
    @ApiModelProperty(value = "单页条数",example = "10")
    private Integer pageSize;
    @ApiModelProperty(value = "列表数据")
    private List<T> list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
