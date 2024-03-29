package com.ydl.sms.dto;

import com.ydl.sms.entity.BlackListEntity;
import io.swagger.annotations.ApiModel;
import lombok.Data;


/**
 * 黑名单
 *
 * @author wtx
 *
 */
@Data
@ApiModel(description = "黑名单")
public class BlackListDTO extends BlackListEntity {

}
