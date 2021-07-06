package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shenpengfei
 * @email shenpengfei@atguigu.com
 * @date 2021-06-26 21:02:24
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {
	
}
