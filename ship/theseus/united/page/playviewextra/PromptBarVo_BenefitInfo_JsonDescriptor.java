package com.bilibili.ship.theseus.united.page.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PromptBarVo_BenefitInfo_JsonDescriptor.class */
public final class PromptBarVo_BenefitInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102409a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 1)};

    public PromptBarVo_BenefitInfo_JsonDescriptor() {
        super(PromptBarVo.BenefitInfo.class, f102409a);
    }

    public final Object constructWith(Object[] objArr) {
        return new PromptBarVo.BenefitInfo((String) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        PromptBarVo.BenefitInfo benefitInfo = (PromptBarVo.BenefitInfo) obj;
        if (i7 == 0) {
            return benefitInfo.f102407a;
        }
        if (i7 != 1) {
            return null;
        }
        return benefitInfo.f102408b;
    }
}
