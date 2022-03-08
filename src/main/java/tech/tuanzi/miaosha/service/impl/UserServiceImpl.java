package tech.tuanzi.miaosha.service.impl;

import tech.tuanzi.miaosha.entity.User;
import tech.tuanzi.miaosha.mapper.UserMapper;
import tech.tuanzi.miaosha.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户服务实现类
 * </p>
 *
 * @author Patrick Ji
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
