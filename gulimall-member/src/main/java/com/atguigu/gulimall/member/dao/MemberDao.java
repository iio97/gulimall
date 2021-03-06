package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zlq
 * @email 632728133@qq.com
 * @date 2020-09-19 22:32:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
