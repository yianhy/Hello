package com.atguigu01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 8:56
 * @Version 1.0
 */
public class InetAddressTest {
    public static void main(String[] args) {


        try {
            InetAddress byName = InetAddress.getByName("www.baidu.com");
            System.out.println(byName);
            //1. 实例化
            //getByName(String host)：获取指定ip对应的InetAddress的实例
            InetAddress inet1 = InetAddress.getByName("192.168.23.31");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            //www.atguigu.com/122.228.95.175
            System.out.println(inet2);


            //getLocalHost():获取本地ip对应的InetAddress的实例
            InetAddress inet3 = InetAddress.getLocalHost();

            System.out.println(inet3);


            InetAddress inet4 = InetAddress.getByName("127.0.0.1");
            System.out.println(inet4);

            //2.两个常用的方法
            System.out.println(inet1.getHostName());
            System.out.println(inet1.getHostAddress());
            //www.atguigu.com,没有的话还是显示ip地址
            System.out.println(inet2.getHostName());
            //122.228.95.175,ip地址
            System.out.println(inet2.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}
