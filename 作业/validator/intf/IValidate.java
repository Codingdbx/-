package com.cesgroup.zw.componentscan.validator.intf;

import com.cesgroup.zw.componentscan.validator.ValidateType;

/**
 * @Description:
 * @Author: YJK
 * @CreateDate: 2018/10/25$ 13:28$
 * @UpdateUser: yc
 * @UpdateDate: 2018/10/25$ 13:28$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface IValidate {
    /**
     * 接口信息
     * @return
     */
    String resultMessage();
    /**
     * 验证内容结果返回
     * @param content
     * @return
     */
    boolean resultContent(String content);

    ValidateType getValidateType();
}
