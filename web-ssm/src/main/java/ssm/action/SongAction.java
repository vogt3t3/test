package ssm.action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Singer;
import ssm.pojo.Song;
import ssm.service.SongService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Controller
@RequestMapping("song")
public class SongAction {
    @Resource(name="songService")
    private SongService songService;
    @RequestMapping(value="addsong.do",method= RequestMethod.POST)
    public String addSong(Song song, HttpSession session){
        boolean rs=songService.addSong(song);
        session.setAttribute("id",song.getSingerid());
        return "redirect:findallsong.do";
    }
    @RequestMapping(value="updatesong.do",method= RequestMethod.POST)
    public String updateSong(Song song,HttpSession session){
        boolean rs=songService.updateSong(song);
        session.setAttribute("id",song.getSingerid());
        return "redirect:findallsong.do";
    }
    @RequestMapping(value="deletesong.do",method= RequestMethod.GET)
    public String deleteSong(int songid,HttpSession session){
        boolean rs=songService.deleteSong(songid);
        return "redirect:findallsong.do";
    }
    @RequestMapping(value="findallsong.do",method = RequestMethod.GET)
    public String findAllSong(HttpSession session){
        int singerid= (int) session.getAttribute("id");
        List<Song> list=songService.fingAllSong(singerid);
        session.setAttribute("songs",list);
        return "song_details.jsp";
    }
    @RequestMapping(value="findsong.do",method = RequestMethod.GET)
    public String findSong(String songname,HttpSession session){
        Song song1 =new Song();
        song1.setSongname(songname);
        Song song=songService.findsong(song1);
        List<Song> list=new ArrayList<Song>();
        list.add(song);
        session.setAttribute("songs",list);
        return "song_details.jsp";
    }
    @RequestMapping(value="findsongbyid.do",method = RequestMethod.GET)
    @ResponseBody
    public String findSongById( String songid){
        int id=Integer.parseInt(songid);
        Song song =songService.findSongById(id);
        ObjectMapper om=new ObjectMapper();
        String songjson=null;
        try {
            songjson=om.writeValueAsString(song);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return songjson;
    }
}
