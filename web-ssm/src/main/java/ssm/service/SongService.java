package ssm.service;

import ssm.pojo.Song;

import java.util.List;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
public interface SongService {
    public boolean addSong(Song song);
    public boolean updateSong(Song song);
    public boolean deleteSong(int songid);
    public Song findsong(Song song);
    public List<Song> fingAllSong(int singerid);
    public Song findSongById(int songid);
}
