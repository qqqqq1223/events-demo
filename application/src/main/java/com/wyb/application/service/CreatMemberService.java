package com.wyb.application.service;

import com.wyb.application.usecase.CreatMemberUseCase;
import com.wyb.domain.Member;
import com.wyb.port.MemberRepository;
import jakarta.annotation.Resource;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author 30142
 */
@Service
public class CreatMemberService implements CreatMemberUseCase {
    @Resource
    private MemberRepository memberRepository;
    @Resource
    private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void execute(Member member) {
        memberRepository.save(member);
        member.creat();
        List<Object> events=member.pullDomainEvents();
        if(!events.isEmpty()){
            events.forEach(e->{
                applicationEventPublisher.publishEvent(e);
            });
        }


    }
}
