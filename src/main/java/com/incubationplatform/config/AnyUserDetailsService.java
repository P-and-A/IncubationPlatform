package com.incubationplatform.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.incubationplatform.pojo.Student;
import com.incubationplatform.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liaochaofan
 * @date 2019/3/9 21:24
 */
@Service
public class AnyUserDetailsService implements UserDetailsService {

    private final IStudentService iStudentService;

    @Autowired
    AnyUserDetailsService(IStudentService iStudentService){
        this.iStudentService = iStudentService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student = iStudentService.getOne(new QueryWrapper<Student>().eq("name",username));
        if (student == null){
            throw new UsernameNotFoundException("用户不存在！");
        }
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = createAuthorities("ROLE_USER");
        return new User(student.getName(), student.getPassword(), simpleGrantedAuthorities);
    }
    private List<SimpleGrantedAuthority> createAuthorities(String roleStr){
        String[] roles = roleStr.split(",");
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        for (String role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return simpleGrantedAuthorities;
    }
}
