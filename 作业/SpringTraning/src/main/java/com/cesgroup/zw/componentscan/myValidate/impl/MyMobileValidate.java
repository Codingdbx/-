package com.cesgroup.zw.componentscan.myValidate.impl;

import com.cesgroup.zw.componentscan.myValidate.dao.IValidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 未来人类 on 2018/10/23.
 */
public class MyMobileValidate implements IValidate{

    public String getValidateMessage(){
        return "this validate is used for verifing if the mobile you transfer meets the specifications";
    }

    public boolean verifyContent(final String content){
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(content);
        b = m.matches();
        return b;

    }
}
