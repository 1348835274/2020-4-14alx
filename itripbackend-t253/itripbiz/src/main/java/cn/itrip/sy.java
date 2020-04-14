package cn.itrip;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

import java.lang.reflect.Method;

public class sy {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println("Red");
        System.out.println(jedis.get("token:PC-b7782e510d27f86dd1ba7c0c915c2351-12-20200402162420-719db7"));
        jedis.close();
    }
}
