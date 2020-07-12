package com.zhang;/*
  @Desc
  @Author 张阳
  @date
*/

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhang.mapper.SuperMapper;
import com.zhang.service.SuperService;

public class serviceImpl<M extends SuperMapper<T>,T> extends ServiceImpl<M,T> implements SuperService<T> {

}
