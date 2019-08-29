package com.cesgroup.zw.componentscan.validator.vali;

import com.cesgroup.zw.componentscan.validator.ValidateType;
import com.cesgroup.zw.componentscan.validator.intf.IValidate;

/**
 * @Description:
 * @Author: YJK
 * @CreateDate: 2018/10/25$ 13:42$
 * @UpdateUser: yc
 * @UpdateDate: 2018/10/25$ 13:42$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class isChinese implements IValidate{
    public String resultMessage() {
        return "This check is used to check if you entered Chinese characters.";
    }

    //校验是否为汉字
    public boolean resultContent(String content) {
        char[] chars=content.toCharArray();
        boolean isGB2312=false;
        for(int i=0;i<chars.length;i++){
            byte[] bytes=(""+chars[i]).getBytes();
            if(bytes.length==2){
                int[] ints=new int[2];
                ints[0]=bytes[0]& 0xff;
                ints[1]=bytes[1]& 0xff;

                if(ints[0]>=0x81 && ints[0]<=0xFE &&
                        ints[1]>=0x40 && ints[1]<=0xFE){
                    isGB2312=true;
                    break;
                }
            }
        }
        return isGB2312;
    }

    public ValidateType getValidateType() {
        return ValidateType.Chinese;
    }
}
