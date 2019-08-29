package com.cesgroup.zw.componentscan.validator.vali;

import com.cesgroup.zw.componentscan.validator.ValidateType;
import com.cesgroup.zw.componentscan.validator.intf.IValidate;

/**
 * @Description:
 * @Author: YJK
 * @CreateDate: 2018/10/25$ 13:48$
 * @UpdateUser: yc
 * @UpdateDate: 2018/10/25$ 13:48$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class isLetterDigit implements IValidate {
    public String resultMessage() {
        return "Check if it is a number";
    }

    //检验是否为数字
    public boolean resultContent(String content) {
        for(int i=content.length();--i>=0;){
            int chr=content.charAt(i);
            if(chr<48 || chr>57)
                return false; }
        return true;
    }

    public ValidateType getValidateType() {
        return ValidateType.LetterDigit;
    }
}
