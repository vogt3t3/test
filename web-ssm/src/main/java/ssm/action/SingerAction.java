package ssm.action;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Singer;
import ssm.pojo.Song;
import ssm.service.SingerService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Controller
@RequestMapping("singer")
public class SingerAction {
        @Resource(name="singerService")
        private SingerService singerService;
    @RequestMapping(value="findallsinger.do",method= RequestMethod.GET)
    public String findAllSinger(Map<String,Object> map){
        List<Singer> singers=singerService.findAllSinger();
        map.put("singers",singers);
        return "singer_details.jsp";
    }
    @RequestMapping(value="addsinger.do",method= RequestMethod.POST)
    public String addSinger(Singer singer){
        boolean rs=singerService.addSinger(singer);
            return "redirect:findallsinger.do";
    }
    @RequestMapping(value="updatesinger.do",method= RequestMethod.POST)
    public String updateSinger(Singer singer){
        boolean rs=singerService.updateSinger(singer);
        return "redirect:findallsinger.do";
    }
    @RequestMapping(value="deletesinger.do",method= RequestMethod.GET)
    public String deleteSinger(int singerid){
        boolean rs=singerService.deleteSinger(singerid);
        return "redirect:findallsinger.do";
    }
    @RequestMapping(value="findsingerbyid.do",method=RequestMethod.GET)
    @ResponseBody
    public String findSingerById(String singerid){
        int id=Integer.parseInt(singerid);
        Singer singer=singerService.findSingerById(id);
        ObjectMapper om=new ObjectMapper();
        System.out.println(singer);
        String singerjson=null;
        try {
            singerjson=om.writeValueAsString(singer);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return singerjson;
    }
    @RequestMapping(value="findsinger.do",method=RequestMethod.GET)
    public String findSinger(String region,Map<String,Object> map){
        Singer singer=singerService.findSinger(region);
        List<Singer> singers=new ArrayList<Singer>();
        singers.add(singer);
        map.put("singers",singers);
        return "singer_details.jsp";
    }
    @RequestMapping(value="findsongs.do",method=RequestMethod.GET)
    public String findSongs(int singerid,HttpSession session){
        List<Song> list=singerService.findAllSong(singerid);
        session.setAttribute("songs",list);
        session.setAttribute("id",singerid);
        return "song_details.jsp";
    }
}
