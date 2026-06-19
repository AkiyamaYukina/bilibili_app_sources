package com.bilibili.ship.theseus.ogv.intro.followup;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/OgvGuideOfFollowUpperData_JsonDescriptor.class */
public final class OgvGuideOfFollowUpperData_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93048a = {new PojoPropertyDescriptor("staff", (String[]) null, Upper.class, (Class) null, 4), new PojoPropertyDescriptor("desc", (String[]) null, GuideDescription.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 5)};

    public OgvGuideOfFollowUpperData_JsonDescriptor() {
        super(OgvGuideOfFollowUpperData.class, f93048a);
    }

    public final Object constructWith(Object[] objArr) {
        return new OgvGuideOfFollowUpperData((Upper) objArr[0], (GuideDescription) objArr[1], (Map) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        OgvGuideOfFollowUpperData ogvGuideOfFollowUpperData = (OgvGuideOfFollowUpperData) obj;
        if (i7 == 0) {
            return ogvGuideOfFollowUpperData.b();
        }
        if (i7 == 1) {
            return ogvGuideOfFollowUpperData.a();
        }
        if (i7 != 2) {
            return null;
        }
        return ogvGuideOfFollowUpperData.f93047c;
    }
}
