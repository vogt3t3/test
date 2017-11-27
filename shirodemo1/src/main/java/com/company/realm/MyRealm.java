package com.company.realm;

import com.company.model.User;
import com.company.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by Teacher XU on 2017/11/22 0022.
 */
public class MyRealm extends AuthorizingRealm{

    private UserService userService;

    public MyRealm() {
        this.userService = new  UserService();
    }

    /**
     * 为当前登录的用户赋予角色roles和权限permissions
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username=(String)principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.getRoles(username));
        authorizationInfo.setStringPermissions(userService.getPermissions(username));
        return authorizationInfo;
    }

    /**
     * 验证当前登录的用户 AuthenticationInfo
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        String username=(String)token.getPrincipal();
        User user=userService.getByUsername(username);
        if(user!=null){
            AuthenticationInfo authcInfo=
                    new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());
            return authcInfo;
        }else{
            return null;
        }
    }
}