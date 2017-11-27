package ssm.dao;

import org.springframework.stereotype.Repository;
import ssm.pojo.Song;

import java.util.List;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Repository("songDao")
public interface SongDao {
    public boolean addSong(Song song);
    public boolean updateSong(Song song);
    public boolean deleteSong(int songid);
    public Song findSong(Song song);
    public List<Song> findAllSong(int singerid);
    public Song findSongById(int songid);


}
