package com.wyb.in.web.comtroller;

import com.wyb.application.usecase.CreatMemberUseCase;
import com.wyb.domain.Member;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 30142
 */
@RestController
@RequestMapping("member")
public class MemberController {
    @Resource
    private CreatMemberUseCase createMemberUseCase;
    @GetMapping("index")
    public void index(){
        Member member=new Member();
        member.setId(System.currentTimeMillis());
        member.setName("wyb");
        createMemberUseCase.execute(member);
    }


}
