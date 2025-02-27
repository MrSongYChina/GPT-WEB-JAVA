package com.chat.java.model.res;


import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetFunctionState {

    @ApiModelProperty("是否开启sd 0未开启 1开启")
    private Integer isOpenSd;

    @ApiModelProperty("是否开启bing 0未开启 1开启")
    private Integer isOpenBing;
}
