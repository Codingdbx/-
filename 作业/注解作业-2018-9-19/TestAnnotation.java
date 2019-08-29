package com.dbx.myblog.web;

import com.dbx.myblog.annotation.RequestAndResponseAnnotation;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DBC-PC on 2018/9/18
 */
@Controller
public class TestAnnotation {

    @RequestAndResponseAnnotation(request = "/test.shtml")
    public Map<String,Object> test(){
        Map<String, Object> map = new HashMap<>();
        System.out.println("hello world!");
        map.put("msg","成功");
        return map;
    }
}
