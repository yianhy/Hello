package com.atguigu02.singleton;

/**
 * @author yian
 * @date 2023/3/13 13:01
 */
public class GirlFriend {

    private static GirlFriend instance=null;

    private GirlFriend() {
    }



    public static GirlFriend getInstance() {
        if (instance==null){
            instance=new GirlFriend();
        }
        return instance;
    }
}
