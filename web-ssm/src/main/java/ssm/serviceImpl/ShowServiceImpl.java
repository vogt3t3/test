package ssm.serviceImpl;

import org.springframework.stereotype.Service;
import ssm.dao.ShowDao;
import ssm.pojo.Show;
import ssm.service.ShowService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21 0021.
 */
@Service("showService")
public class ShowServiceImpl implements ShowService {
    @Resource(name="showDao")
    private ShowDao showDao;
    @Override
    public List<Show> findAllShow() throws Exception {
        return showDao.findAllShow();
    }
}
