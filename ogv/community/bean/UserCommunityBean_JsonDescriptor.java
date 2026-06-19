package com.bilibili.ogv.community.bean;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/community/bean/UserCommunityBean_JsonDescriptor.class */
public final class UserCommunityBean_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f67524a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("coin_number", (String[]) null, Integer.TYPE, (Class) null, 5);
        Class cls = Boolean.TYPE;
        f67524a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor(IVideoLikeRouteService.ACTION_LIKE, (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("is_original", (String[]) null, cls, (Class) null, 5), new PojoPropertyDescriptor("favorite", (String[]) null, cls, (Class) null, 5)};
    }

    public UserCommunityBean_JsonDescriptor() {
        super(UserCommunityBean.class, f67524a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Integer num = (Integer) objArr[0];
        int iIntValue = num == null ? 0 : num.intValue();
        Boolean bool = (Boolean) objArr[1];
        boolean zBooleanValue2 = bool == null ? false : bool.booleanValue();
        Boolean bool2 = (Boolean) objArr[2];
        boolean zBooleanValue3 = bool2 == null ? false : bool2.booleanValue();
        Boolean bool3 = (Boolean) objArr[3];
        if (bool3 != null) {
            zBooleanValue = bool3.booleanValue();
        }
        return new UserCommunityBean(zBooleanValue2, iIntValue, zBooleanValue3, zBooleanValue);
    }

    public final Object get(Object obj, int i7) {
        UserCommunityBean userCommunityBean = (UserCommunityBean) obj;
        if (i7 == 0) {
            return Integer.valueOf(userCommunityBean.a());
        }
        if (i7 == 1) {
            return Boolean.valueOf(userCommunityBean.c());
        }
        if (i7 == 2) {
            return Boolean.valueOf(userCommunityBean.d());
        }
        if (i7 != 3) {
            return null;
        }
        return Boolean.valueOf(userCommunityBean.b());
    }
}
