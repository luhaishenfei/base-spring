package com.lsgf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lsgf.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class Springboot10RedisApplicationTests {

    @Autowired
    @Qualifier("myRedisTemplate")
    private RedisTemplate redisTemplate;





    @Test
    void distributedTest() throws InterruptedException {
        System.out.println("user2抢购开始");
        Thread.sleep(2000);
        while (true) {
            System.out.println("user2尝试获得抢购权限...");
            Thread.sleep(2000);
            if (redisTemplate.opsForValue().setIfAbsent("lockKey", "t1", 40, TimeUnit.SECONDS)
            ) {
                System.out.println("user2获取到下单资格！");
                Thread.sleep(1000);
                System.out.println("user2获取商品数量");
                int i = (int) redisTemplate.opsForValue().get("goodNum");
                System.out.println("user2商品数量为" + i);
                Thread.sleep(1000);
                System.out.println("user2进行下单");
                redisTemplate.opsForValue().set("goodNum", --i);
                Thread.sleep(1000);
                System.out.println("user2购买成功");
                Thread.sleep(1000);
                i = (int) redisTemplate.opsForValue().get("goodNum");
                System.out.println("user2剩余商品数量为：" + i);
                Thread.sleep(1000);
                System.out.println("user2归还抢购权限...");
                Thread.sleep(800);
                if (redisTemplate.delete("lockKey")){
                    System.out.println("user2归还抢购权限成功");
                }else {
                    System.out.println("user2归还抢购权限失败");
                }
                Thread.sleep(1000);
                System.out.println("user2结束本轮抢购，再见");
            } else {
                System.out.println("user2未能获取到抢购权限");
                Thread.sleep(1000);
                System.out.print("user2重新进入抢购模式");
                Thread.sleep(1000);
            }
        }

    }





    @Test
    void testRedis(){
        int i = 0;
        try {
            long start = System.currentTimeMillis();// 开始毫秒数
            while (true) {
                long end = System.currentTimeMillis();
                if (end - start >= 1000) {// 当大于等于1000毫秒（相当于1秒）时，结束操作
                    break;
                }
                i++;
                redisTemplate.opsForValue().set("test" + i, i + "");
            }
        } finally {// 关闭连接
        }
        // 打印1秒内对Redis的操作次数
        System.out.println("redis每秒操作：" + i + "次");

    }

    @Test
    void contextLoads() {
//         redisTemplate.opsForSet().add("java","SpringBoot");
//        System.out.println(redisTemplate.opsForSet().pop("java"));
        redisTemplate.opsForValue().set("java","SpringBoot");
        System.out.println(redisTemplate.opsForValue().get("java"));
    }


    @Test
    public void test() throws JsonProcessingException {
        User user = new User("zhw", 24);

//        String jsonUser = new ObjectMapper().writeValueAsString(user);
//        redisTemplate.opsForValue().set("user",jsonUser);

        //未序列化 报错
        redisTemplate.opsForValue().set("user",user);

        System.out.println(redisTemplate.opsForValue().get("user"));
    }


}
