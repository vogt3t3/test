package ssm.serviceImpl;

import org.springframework.stereotype.Service;
import ssm.dao.SongDao;
import ssm.pojo.Song;
import ssm.service.SongService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Service("songService")
public class SongServiceImpl implements SongService{
    @Resource(name="songDao")
    private SongDao songDao;
    @Override
    public boolean addSong(Song song) {
        return songDao.addSong(song);
    }

    @Override
    public boolean updateSong(Song song) {
        return songDao.updateSong(song);
    }

    @Override
    public boolean deleteSong(int songid) {
        return songDao.deleteSong(songid);
    }

    @Override
    public Song findsong(Song song) {
        return songDao.findSong(song);
    }

    @Override
    public List<Song> fingAllSong(int singerid) {
        return songDao.findAllSong(singerid);
    }

    @Override
    public Song findSongById(int songid) {
        return songDao.findSongById(songid);
    }
}
