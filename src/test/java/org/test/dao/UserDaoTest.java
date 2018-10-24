package org.test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserDao userDao;

    @Test
    public void findAll() {
        logger.warn("错误信息");
        System.out.println(userDao.findAll().get(0).getUserRole().get(0).getRole());
    }

    @Test
    public void findByUsername() {
        System.out.println(userDao.findByUsername("admin"));
    }

    @Test
    public void findTest() {
     System.out.println(userDao.findTest("admin"));
    }
}