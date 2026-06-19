package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBall_JsonDescriptor.class */
public final class OgvIntroFloatingBall_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91439a = {new PojoPropertyDescriptor("win_id", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("day_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("dark_img", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 3)};

    public OgvIntroFloatingBall_JsonDescriptor() {
        super(OgvIntroFloatingBall.class, f91439a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        String str4 = (String) objArr[3];
        Object obj = objArr[4];
        if (obj == null) {
            i7 = 16;
        }
        return new OgvIntroFloatingBall(str, str2, i7, str3, str4, (Map) obj);
    }

    public final Object get(Object obj, int i7) {
        OgvIntroFloatingBall ogvIntroFloatingBall = (OgvIntroFloatingBall) obj;
        if (i7 == 0) {
            return ogvIntroFloatingBall.b();
        }
        if (i7 == 1) {
            return ogvIntroFloatingBall.a();
        }
        if (i7 == 2) {
            return ogvIntroFloatingBall.d();
        }
        if (i7 == 3) {
            return ogvIntroFloatingBall.c();
        }
        if (i7 != 4) {
            return null;
        }
        return ogvIntroFloatingBall.f91430e;
    }
}
