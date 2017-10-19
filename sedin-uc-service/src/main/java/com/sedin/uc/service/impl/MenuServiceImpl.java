package com.sedin.uc.service.impl;

import com.sedin.type.MResType;
import com.sedin.util.constant.RedisKey;
import com.sedin.util.DateUtil;
import com.sedin.util.redis.RedisUtil;
import com.sedin.model.MRes;
import com.sedin.uc.service.MenuService;
import com.sedin.uc.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 系统菜单服务类，初始化放入redis
 */
@Component("menuService")
public class MenuServiceImpl implements MenuService  {

//    @Autowired
//    ResService resService;
//
//    @Autowired
//    RedisUtil redisUtil;
//
//    private List<MRes> loadList() {
//        return resService.getAllResByType(MResType.menu.getType());
//    }
//
//    private void loadMenuTree(List<MRes> res , int level  , List<MRes> old , long id  , long outId ) {
//        for (MRes r : old) {
//            if (r.getId() == outId) {
//                continue;
//            }
//
//            if (r.getParentId() == id) {
//                String pre = getPreByLevel(level);
//                r.setName(pre + r.getName());
//                res.add(r);
//                loadMenuTree(  res ,   level+1  ,   old , r.getId() , outId );
//            }
//        }
//        return ;
//    }
//
//    private String getPreByLevel(int level) {
//        String str = "|--";
//        for (int i = 0; i < level ;i++) {
//            str += "--";
//        }
//        return str;
//    }
//
//    @Override
//    public void delAll() {
////        redisUtil.del(RedisKey.longlian_res_system_menu);
//        redisUtil.set(RedisKey.longlian_res_system_menu_time, DateUtil.format(new Date()));
//    }
//
//    @Override
//    public List getAllMenus(long id) {
//        List<MRes> list =  loadList();
//        List<MRes> res = new ArrayList();
//
//        MRes r = new MRes();
//        r.setId(0l);
//        r.setName("根节点");
//        res.add(r);
//        loadMenuTree(res , 0  , list , 0 , id);
//        return res;
//    }

}
