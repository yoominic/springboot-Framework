package com.main.java.service.impl;

import com.main.java.pojo.User;
import com.main.java.mapper.UserMapper;
import com.main.java.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yoominic
 * @since 2022-07-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
