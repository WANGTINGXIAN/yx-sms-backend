package com.ydl.sms.dto;

import com.ydl.sms.entity.ManualProcessEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 人工处理任务表
 *
 * @author wtx
 */
@Data
@ApiModel(description = "人工处理任务表")
public class ManualProcessDTO extends ManualProcessEntity {

}
