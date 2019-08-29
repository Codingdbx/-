package com.cesgroup.zw.componentscan.myValidate.dao;

/**
 * Created by 未来人类 on 2018/10/23.
 */
public interface IValidate {
    /**
     *  获取接口描述信息
     * @return
     */
    String getValidateMessage();
    /**
     *  返回接口验证结果
     */
    boolean verifyContent(String content);
}
