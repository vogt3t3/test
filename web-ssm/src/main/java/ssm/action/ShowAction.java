package ssm.action;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.pojo.Show;
import ssm.service.ShowService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21 0021.
 */
@Controller
@RequestMapping("show")
public class ShowAction {
    @Resource(name="showService")
    private ShowService showService;
    @RequestMapping(value="findshow.do",method= RequestMethod.GET)
    @ResponseBody
    public String findAllShow(){
        List<Show> list=null;
        String json=null;
        try {
            list=showService.findAllShow();
            ObjectMapper om=new ObjectMapper();
            json=om.writeValueAsString(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
