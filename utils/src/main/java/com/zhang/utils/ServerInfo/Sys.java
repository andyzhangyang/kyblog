package com.zhang.utils.ServerInfo;/*
  @Desc
  @Author 张阳
  @date
*/

import lombok.Data;

@Data
public class Sys{
/**
 * 系统相关信息
 *
 * @author ruoyi
 */
    /**
     * 服务器名称
     */
    private String computerName;

    /**
     * 服务器Ip
     */
    private String computerIp;

    /**
     * 项目路径
     */
    private String userDir;

    /**
     * 操作系统
     */
    private String osName;

    /**
     * 系统架构
     */
    private String osArch;

}
