package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUp_JsonDescriptor.class */
public final class RecommendUp_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f97811a = {new PojoPropertyDescriptor("param", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("cover", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("desc_button", (String[]) null, RecommendUpDescButton.class, (Class) null, 4), new PojoPropertyDescriptor("official_icon", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("handle", (String[]) null, String.class, (Class) null, 6)};

    public RecommendUp_JsonDescriptor() {
        super(RecommendUp.class, f97811a);
    }

    public final Object constructWith(Object[] objArr) {
        char c7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        RecommendUpDescButton recommendUpDescButton = (RecommendUpDescButton) objArr[4];
        Integer num = (Integer) objArr[5];
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj = objArr[6];
        if (obj == null) {
            c7 = '@';
        }
        String str5 = (String) obj;
        if ((c7 & '@') != 0) {
            str5 = null;
        }
        return new RecommendUp(str, str2, str3, str4, recommendUpDescButton, iIntValue, str5);
    }

    public final Object get(Object obj, int i7) {
        RecommendUp recommendUp = (RecommendUp) obj;
        switch (i7) {
            case 0:
                return recommendUp.g();
            case 1:
                return recommendUp.b();
            case 2:
                return recommendUp.h();
            case 3:
                return recommendUp.c();
            case 4:
                return recommendUp.d();
            case 5:
                return Integer.valueOf(recommendUp.f());
            case 6:
                return recommendUp.e();
            default:
                return null;
        }
    }
}
