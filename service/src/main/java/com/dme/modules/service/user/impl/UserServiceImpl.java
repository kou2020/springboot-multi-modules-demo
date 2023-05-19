package com.dme.modules.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dme.modules.dao.UserDao;
import com.dme.modules.entity.User;
import com.dme.modules.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.TestUtils;

import java.util.List;

/**
 * @author shang
 * @date 2023-05-19-21:11
 */
@Service
public class UserServiceImpl implements UserService {
    //@Autowired
    private UserDao userDao;
@Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void testServiceFunction() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> users = userDao.selectList(wrapper);
        List<User> users1 = userDao.selectDME();
        /**
         * service的业务逻辑
         */
        System.out.println("我是service中的方法，我处理的业务逻辑....................");
        /**
         * 调用共同方法
         */
        TestUtils.testUtils();
    }
}
