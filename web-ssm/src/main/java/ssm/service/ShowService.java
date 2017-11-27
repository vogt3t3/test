package ssm.service;

import ssm.pojo.Show;

import java.util.List;

/**
 * Created by Administrator on 2017/11/21 0021.
 */
public interface ShowService {
    public List<Show> findAllShow() throws  Exception;
}
