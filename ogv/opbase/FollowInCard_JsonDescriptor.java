package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/FollowInCard_JsonDescriptor.class */
public final class FollowInCard_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69830a;

    static {
        Class cls = Boolean.TYPE;
        f69830a = new PojoPropertyDescriptor[]{new PojoPropertyDescriptor("is_finished", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_started", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("new_ep", (String[]) null, NewestEp.class, (Class) null, 4), new PojoPropertyDescriptor("desc", (String[]) null, FavorDesc.class, (Class) null, 4), new PojoPropertyDescriptor("total_count", (String[]) null, Integer.TYPE, (Class) null, 5)};
    }

    public FollowInCard_JsonDescriptor() {
        super(FollowInCard.class, f69830a);
    }

    public final Object constructWith(Object[] objArr) {
        Boolean bool = (Boolean) objArr[0];
        boolean zBooleanValue = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[1];
        boolean zBooleanValue2 = bool2 == null ? false : bool2.booleanValue();
        NewestEp newestEp = (NewestEp) objArr[2];
        FavorDesc favorDesc = (FavorDesc) objArr[3];
        Integer num = (Integer) objArr[4];
        return new FollowInCard(zBooleanValue, zBooleanValue2, newestEp, favorDesc, num == null ? 0 : num.intValue());
    }

    public final Object get(Object obj, int i7) {
        FollowInCard followInCard = (FollowInCard) obj;
        if (i7 == 0) {
            return Boolean.valueOf(followInCard.f69825a);
        }
        if (i7 == 1) {
            return Boolean.valueOf(followInCard.f69826b);
        }
        if (i7 == 2) {
            return followInCard.a();
        }
        if (i7 == 3) {
            return followInCard.f69828d;
        }
        if (i7 != 4) {
            return null;
        }
        return Integer.valueOf(followInCard.f69829e);
    }
}
