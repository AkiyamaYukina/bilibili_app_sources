package com.bilibili.playerbizcommonv2.api;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/TrialBenefit_JsonDescriptor.class */
public final class TrialBenefit_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f80816a = {new PojoPropertyDescriptor("remaining_times", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public TrialBenefit_JsonDescriptor() {
        super(TrialBenefit.class, f80816a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new TrialBenefit(iIntValue);
    }

    public final Object get(Object obj, int i7) {
        TrialBenefit trialBenefit = (TrialBenefit) obj;
        if (i7 != 0) {
            return null;
        }
        return Integer.valueOf(trialBenefit.a());
    }
}
