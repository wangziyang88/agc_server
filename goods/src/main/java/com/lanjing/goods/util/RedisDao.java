package com.lanjing.goods.util;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {
    @Resource
    private StringRedisTemplate template;

    public  void setKey(String key,String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value,5, TimeUnit.MINUTES);//5分钟过期
    }

    public Long increment(String key){
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.increment(key);
    }

    public void setTime(String key,long time){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,ops.get(key),time,TimeUnit.SECONDS);
    }

    public Boolean hasKey(String key){
        return template.hasKey(key);
    }

    public  void setKey1(String key,String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value);
    }

    public String getValue(String key){
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }


    public  void setKey(String key,String value,long times){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value,times, TimeUnit.MINUTES);
    }

    public void remove(String key){
        template.delete(key);
    }


    public void sendmsg(String channel,String data){
        template.convertAndSend(channel,data);
    }


    public static void main(String[] args) {
        RedisDao dao = new RedisDao();
        dao.setKey("qwe","123");
        System.out.println(dao.getValue("qwe"));
        dao.remove("qwe");
        System.out.println(dao.getValue("qwe"));
    }
}
