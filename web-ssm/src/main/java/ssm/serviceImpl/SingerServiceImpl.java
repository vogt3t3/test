package ssm.serviceImpl;

import org.springframework.stereotype.Service;
import ssm.dao.SingerDao;
import ssm.pojo.Singer;
import ssm.pojo.Song;
import ssm.service.SingerService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Service("singerService")
public class SingerServiceImpl implements SingerService {
    @Resource(name="singerDao")
    private SingerDao singerDao;
    @Override
    public List<Singer> findAllSinger() {
        return singerDao.findAllSinger();
    }

    @Override
    public boolean addSinger(Singer singer) {
        return singerDao.addSinger(singer);
    }

    @Override
    public boolean updateSinger(Singer singer) {
        return singerDao.updateSinger(singer);
    }

    @Override
    public boolean deleteSinger(int singerid) {
        return singerDao.deleteSinger(singerid);
    }

    @Override
    public Singer findSinger(String region) {
        return singerDao.findSinger(region);
    }

    @Override
    public List<Song> findAllSong(int singerid) {
        return singerDao.findAllSong(singerid);
    }

    @Override
    public Singer findSingerById(int singerid) {
        return singerDao.findSingerById(singerid);
    }
}
