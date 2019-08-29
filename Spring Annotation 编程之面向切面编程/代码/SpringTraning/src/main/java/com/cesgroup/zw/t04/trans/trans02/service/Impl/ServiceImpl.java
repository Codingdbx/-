package com.cesgroup.zw.t04.trans.trans02.service.Impl;

import com.cesgroup.zw.t04.trans.trans02.service.LogService;
import com.cesgroup.zw.t04.trans.trans02.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by dbx on 2019/4/28
 */
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class ServiceImpl implements Service {

    @Autowired
    private LogService logService;

    @Override
    public void write() {
        System.out.println("write hello..");
        logService.info();
    }
}
