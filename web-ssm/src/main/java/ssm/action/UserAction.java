package ssm.action;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ssm.pojo.User;
import ssm.service.UserService;
import ssm.utils.Encode;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/20 0020.
 */
@Controller
@RequestMapping("user")
public class UserAction {
    @Resource(name="userService")
    private UserService userService;
    @RequestMapping(value="finduser.do",method= RequestMethod.GET)
    public String findUser(String username,String password,HttpSession session) throws Exception {
        Map map1=new HashMap();
        map1.put("username",username);
        String password1= Encode.EncoderByMD5(password);
        map1.put("password",password1);
        User u=userService.findUser(map1);
        if(u!=null){
            return "redirect:/singer/findallsinger.do";
        }
        session.setAttribute("error","用户名或密码不正确，请重新登录");
        return "redirect:/index.jsp";
    }
    @RequestMapping(value="saveuser.do",method=RequestMethod.POST)
    public String saveUser(String username, String password) throws Exception {
        password=Encode.EncoderByMD5(password);
        User user=new User();
        user.setPassword(password);
        user.setUsername(username);
        boolean rs=userService.saveUser(user);
        return "redirect:/index.jsp";
    }
}
