package com.tutorial.temp;

import com.tutorial.temp.Class.User;
import com.tutorial.temp.Repository.UserRepository;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TempApplicationTests {
    @Autowired
    private UserRepository userrepo;

    @After
    public void cleanup(){
        userrepo.deleteAll();
    }

    @Test
    public void contextLoads() {
        LocalDateTime now = LocalDateTime.now();
        userrepo.save(User.builder()
                .user_id("test")
                .user_nm("test")
                .user_pwd("test")
                .build());

        List<User> userList = userrepo.findAll();

        User user = userList.get(0);
        Assert.assertThat(user.getUser_nm(), Matchers.is("test"));
        Assert.assertThat(user.getUser_id(), Matchers.is("test"));
        Assert.assertTrue(user.getCreatedDate().isAfter(now));
        Assert.assertTrue(user.getModifiedDate().isAfter(now));
    }

}
