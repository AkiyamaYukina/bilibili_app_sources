package com.bilibili.pegasus.components.interestv2.host;

import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import tv.danmaku.bili.interest.v2.entry.m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/e.class */
public final class e {
    public static final kp0.f a(tv.danmaku.bili.interest.v2.entry.f fVar) {
        InterestChooseGender interestChooseGender;
        InterestChooseAge interestChooseAge;
        long j7 = fVar.b;
        m mVar = fVar.e;
        if (mVar != null) {
            interestChooseGender = new InterestChooseGender(mVar.a, true, 184, mVar.b, mVar.c);
        } else {
            interestChooseGender = null;
        }
        m mVar2 = fVar.f;
        if (mVar2 != null) {
            interestChooseAge = new InterestChooseAge(mVar2.a, 44, mVar2.b, true);
        } else {
            interestChooseAge = null;
        }
        return new kp0.f(j7, null, fVar.d, interestChooseGender, interestChooseAge, fVar.c, fVar.i);
    }
}
