package com.three.supplier.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户现金流水表
 * </p>
 *
 * @author qinxi
 * @since 2023-08-01
 */
@TableName("cash_flow")
@ApiModel(value = "CashFlow对象", description = "用户现金流水表")
public class CashFlow implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("部门ID")
    private Long deptId;

    @ApiModelProperty("现金持有人ID")
    private Long cashHolderId;

    @ApiModelProperty("进出现金")
    private Long cashAmount;

    @ApiModelProperty("流入发生的日期")
    private LocalDate flowDate;

    @ApiModelProperty("流水类型：0 盈亏清0，1 转入 2 转出")
    private Byte flowType;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getCashHolderId() {
        return cashHolderId;
    }

    public void setCashHolderId(Long cashHolderId) {
        this.cashHolderId = cashHolderId;
    }

    public Long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public LocalDate getFlowDate() {
        return flowDate;
    }

    public void setFlowDate(LocalDate flowDate) {
        this.flowDate = flowDate;
    }

    public Byte getFlowType() {
        return flowType;
    }

    public void setFlowType(Byte flowType) {
        this.flowType = flowType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "CashFlow{" +
            "id = " + id +
            ", deptId = " + deptId +
            ", cashHolderId = " + cashHolderId +
            ", cashAmount = " + cashAmount +
            ", flowDate = " + flowDate +
            ", flowType = " + flowType +
            ", remark = " + remark +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
