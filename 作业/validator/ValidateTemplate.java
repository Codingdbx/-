package com.cesgroup.zw.componentscan.validator;

import com.cesgroup.zw.componentscan.validator.intf.IValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @Description:
 * @Author: YJK
 * @CreateDate: 2018/10/25$ 15:04$
 * @UpdateUser: yc
 * @UpdateDate: 2018/10/25$ 15:04$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Component
public class ValidateTemplate {
    private Map<ValidateType,IValidate> container = new ConcurrentHashMap<ValidateType, IValidate>() ;


    public ValidateTemplate(@Autowired  List<IValidate> validates) {
       for(IValidate validate :validates){
           container.put(validate.getValidateType(),validate);
       }
    }

    public boolean validate(ValidateType type,String content) {
        return container.get(type).resultContent(content);
    }
}
