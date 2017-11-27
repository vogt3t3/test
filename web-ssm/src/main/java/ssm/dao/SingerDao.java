package ssm.dao;

import org.springframework.stereotype.Repository;
import ssm.pojo.Singer;
import ssm.pojo.Song;

import java.util.List;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Repository("singerDao")
public interface SingerDao {
    //查看所有歌手
    public List<Singer> findAllSinger();
    //添加歌手
    public boolean addSinger(Singer singer);
    //修改歌手
    public boolean updateSinger(Singer singer);
    //删除歌手
    public boolean deleteSinger(int singerid);
    //根据编号查询歌手
    public Singer findSingerById(int singerid);
    //根据地区查询歌手
    public Singer findSinger(String region);
    //查询所属的歌曲
    public List<Song> findAllSong(int singerid);

}
