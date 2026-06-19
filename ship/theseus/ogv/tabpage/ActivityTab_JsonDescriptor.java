package com.bilibili.ship.theseus.ogv.tabpage;

import com.bilibili.bson.adapter.JsonInStringTypeAdapterFactory;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.tabpage.ActivityTab;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/tabpage/ActivityTab_JsonDescriptor.class */
public final class ActivityTab_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f94556a = {new PojoPropertyDescriptor("show_name", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("picurl", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("picurl_selected", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("type", (String[]) null, ActivityTab.Type.class, (Class) null, 7), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("act_ext", (String[]) null, TabActivityExtensionField.class, JsonInStringTypeAdapterFactory.class, 12), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 4)};

    public ActivityTab_JsonDescriptor() {
        super(ActivityTab.class, f94556a);
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
        return new ActivityTab(str, str2, str3, str4, (ActivityTab.Type) obj, (String) objArr[5], (TabActivityExtensionField) objArr[6], (Map) objArr[7], i7);
    }

    public final Object get(Object obj, int i7) {
        ActivityTab activityTab = (ActivityTab) obj;
        switch (i7) {
            case 0:
                return activityTab.f();
            case 1:
                return activityTab.c();
            case 2:
                return activityTab.d();
            case 3:
                return activityTab.f94552d;
            case 4:
                return activityTab.f94553e;
            case 5:
                return activityTab.b();
            case 6:
                return activityTab.a();
            case 7:
                return activityTab.e();
            default:
                return null;
        }
    }
}
