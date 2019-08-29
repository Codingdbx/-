package com.cesgroup.zw.t04.trans.trans02.service.Impl;

import com.cesgroup.zw.t04.trans.trans02.service.LogService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by dbx on 2019/4/28
 */
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRES_NEW)
public class LogServiceImpl implements LogService {

    @Override
    public void info() {
        System.out.println("log info..");
    }
}
