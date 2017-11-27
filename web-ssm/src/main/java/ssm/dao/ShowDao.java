package ssm.dao;

import org.springframework.stereotype.Repository;
import ssm.pojo.Show;

import java.util.List;

/**
 * Created by Administrator on 2017/11/21 0021.
 */
@Repository("showDao")
public interface ShowDao {
    public List<Show> findAllShow() throws  Exception;
}
