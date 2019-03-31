package com.whu.cs.nuclear.platform.service;

/**
 * @author: pele
 * @time: 2019/3/29 14:08
 * @project: nuclear-security-info-platform
 * @description:名称转换服务，将特定名称编码转换成实际中文释义
 */
public interface NameConvertService {
    String  getPlantNameByPlantCode(String plantCode);
}
