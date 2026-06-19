package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpDescRelation_JsonDescriptor.class */
public final class RecommendUpDescRelation_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f97793a;

    static {
        Class cls = Integer.TYPE;
        f97793a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_follow", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_followed", (String[]) null, cls, (Class) null, 5)};
    }

    public RecommendUpDescRelation_JsonDescriptor() {
        super(RecommendUpDescRelation.class, f97793a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        int iIntValue2 = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) objArr[1];
        int iIntValue3 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) objArr[2];
        if (num3 != null) {
            iIntValue = num3.intValue();
        }
        return new RecommendUpDescRelation(iIntValue2, iIntValue3, iIntValue);
    }

    public final Object get(Object obj, int i7) {
        int iD;
        RecommendUpDescRelation recommendUpDescRelation = (RecommendUpDescRelation) obj;
        if (i7 == 0) {
            iD = recommendUpDescRelation.d();
        } else if (i7 == 1) {
            iD = recommendUpDescRelation.b();
        } else {
            if (i7 != 2) {
                return null;
            }
            iD = recommendUpDescRelation.c();
        }
        return Integer.valueOf(iD);
    }
}
