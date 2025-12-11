package com.wyb.port;

import com.wyb.domain.Member;

/**
 * @author 30142
 */
public interface MemberRepository {
    /**
     * 保存会员
     * @param member 会员的领域模型
     */
    void save(Member member);
}
