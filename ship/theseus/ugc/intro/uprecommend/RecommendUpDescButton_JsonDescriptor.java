package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpDescButton_JsonDescriptor.class */
public final class RecommendUpDescButton_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f97789a = {new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("relation", (String[]) null, RecommendUpDescRelation.class, (Class) null, 4)};

    public RecommendUpDescButton_JsonDescriptor() {
        super(RecommendUpDescButton.class, f97789a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        Integer num = (Integer) objArr[1];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new RecommendUpDescButton(str, iIntValue, (RecommendUpDescRelation) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        RecommendUpDescButton recommendUpDescButton = (RecommendUpDescButton) obj;
        if (i7 == 0) {
            return recommendUpDescButton.c();
        }
        if (i7 == 1) {
            return Integer.valueOf(recommendUpDescButton.d());
        }
        if (i7 != 2) {
            return null;
        }
        return recommendUpDescButton.b();
    }
}
