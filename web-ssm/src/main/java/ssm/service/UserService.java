package ssm.service;

import ssm.pojo.User;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
public interface UserService {
    public User findUser(Map map);
    public boolean saveUser(User u);
}
