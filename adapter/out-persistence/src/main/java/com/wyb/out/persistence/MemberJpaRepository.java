package com.wyb.out.persistence;

import com.wyb.domain.Member;
import com.wyb.port.MemberRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 30142
 */
@Repository
public class MemberJpaRepository implements MemberRepository {

    @Override
    public void save(Member member) {
        System.out.println("保存会员信息"+member.getId()+" "+member.getName());
    }
}
