package com.ym.utils;

/**
 * Created by ym on 2018/9/3 0003.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * 详情Dto
 * @param <T>
 */
@ApiModel(description = "详情DTO")
public class CommonDTO <T>{
    @ApiModelProperty(value = "提示信息")
    private String msg;

    @ApiModelProperty(value = "0 代表无错误 1代表有错误")
    private Integer status;

    @ApiModelProperty(value = "总记录")
    private Integer total;

    @ApiModelProperty(value = "业务数据")
    private T data;

    @ApiModelProperty(value = "200 代表无错误 400代表有错误--->加入这个字段是原生需求")
    private Integer code;


    @ApiModelProperty(value = "当前页码")
    private Integer pageNo = 1;

    @ApiModelProperty(value = "当前页码，默认：10")
    private Integer pageSize = Integer.valueOf(10); // 页面大小，设置为“-1”表示不进行分页（分页无效）

    @ApiModelProperty(value = "总记录数")
    private long totalSize;// 总记录数，设置为“-1”表示不查询总数



    private Map<String,Object> DataMap;

    public CommonDTO(Integer status) {
        if (status == 0){
            this.status = status;
            this.code = 200;
            this.msg = "操作成功";
        }
        this.data = null;
    }
    public CommonDTO(Integer status, Integer total) {
        if (status == 0){
            this.status = status;
            this.code = 200;
            this.msg = "操作成功";
        }
        this.data = null;
        this.total = total;
    }

    public Map<String, Object> getDataMap() {
        return DataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        DataMap = dataMap;
    }

    public Integer getCode() {return code;}

    public void setCode(Integer code) {this.code = code;}

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public Integer getPageNo() {
        return (pageNo!=null&&pageNo>0)?pageNo:-1;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return (pageSize!=null&&pageSize>0)?pageSize:10;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * 获取设置总数
     * @return
     */
    public long getTotalSize() {
        return totalSize;
    }

    /**
     * 设置数据总数
     * @param count
     */
    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
        if (pageSize >= totalSize){
            pageNo = 1;
        }
    }


    @Override
    public String toString() {
        return "CommonDTO{" +
                "msg='" + msg + '\'' +
                ", status=" + status +
                ", total=" + total +
                ", data=" + data +
                '}';
    }

}
