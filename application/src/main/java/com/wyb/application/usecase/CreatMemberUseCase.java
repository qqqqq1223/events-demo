package com.wyb.application.usecase;

import com.wyb.domain.Member;

/**
 * @author 30142
 */
public interface CreatMemberUseCase {
    /**
     * 创建会员
     * @param member 会员信息
     */
    void execute(Member member);
}
