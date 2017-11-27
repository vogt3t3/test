package ssm.dao;

import org.springframework.stereotype.Repository;
import ssm.pojo.User;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Repository("userDao")
public interface UserDao {
    public User findUser(Map map);
    public boolean saveUser(User u);
}
