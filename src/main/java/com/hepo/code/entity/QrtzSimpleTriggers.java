package com.hepo.code.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author linhaibo
 * @since 2022-07-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="QrtzSimpleTriggers对象", description="")
public class QrtzSimpleTriggers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHED_NAME", type = IdType.AUTO)
    private String schedName;

    @TableField("TRIGGER_NAME")
    private String triggerName;

    @TableField("TRIGGER_GROUP")
    private String triggerGroup;

    @TableField("REPEAT_COUNT")
    private Long repeatCount;

    @TableField("REPEAT_INTERVAL")
    private Long repeatInterval;

    @TableField("TIMES_TRIGGERED")
    private Long timesTriggered;


}
