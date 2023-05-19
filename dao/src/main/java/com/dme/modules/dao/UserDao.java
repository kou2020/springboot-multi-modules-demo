package com.dme.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dme.modules.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author shang
 * @date 2023-05-19-21:09
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    List<User>  selectDME();
}
