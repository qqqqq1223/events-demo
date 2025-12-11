package com.wyb.application.handler;

import com.wyb.event.CreatMemberEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author 30142
 */
@Component
public class LogListener {
    @EventListener
    public void handle(CreatMemberEvent  event){
        System.out.println("日志"+event.id()+" "+event.name()+"注册成功...");
    }
}
