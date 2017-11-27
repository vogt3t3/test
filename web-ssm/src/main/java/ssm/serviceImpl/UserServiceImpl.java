package ssm.serviceImpl;

import org.springframework.stereotype.Service;
import ssm.dao.UserDao;
import ssm.pojo.User;
import ssm.service.UserService;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;
    @Override
    public User findUser(Map map) {
        return userDao.findUser(map);
    }

    @Override
    public boolean saveUser(User u) {
        return userDao.saveUser(u);
    }
}
