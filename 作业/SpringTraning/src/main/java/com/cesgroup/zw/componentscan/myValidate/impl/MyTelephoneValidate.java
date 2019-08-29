package com.cesgroup.zw.componentscan.myValidate.impl;

import com.cesgroup.zw.componentscan.myValidate.dao.IValidate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 未来人类 on 2018/10/23.
 */
public class MyTelephoneValidate implements IValidate{

    public String getValidateMessage(){
        return "this validate is used for verifing if the telephone you transfer meets the specifications,there is two kinds of conditions:" +
                "the telephone includes the area code or not";
    }

    public boolean verifyContent(final String content){
        Pattern p1 = null, p2 = null;
        Matcher m = null;
        boolean b = false;
        p1 = Pattern.compile("^[0][1-9]{2,3}-[0-9]{5,10}$");  // 验证带区号的
        p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$");         // 验证没有区号的
        if (content.length() > 9) {
            m = p1.matcher(content);
            b = m.matches();
        } else {
            m = p2.matcher(content);
            b = m.matches();
        }
        return b;
    }
}
