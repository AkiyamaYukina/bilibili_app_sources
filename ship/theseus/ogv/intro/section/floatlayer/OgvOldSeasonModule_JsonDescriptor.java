package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ogv.intro.section.bean.BgInfo;
import com.bilibili.ship.theseus.ogv.intro.section.bean.MoreLeft;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvOldSeasonModule;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvOldSeasonModule_JsonDescriptor.class */
public final class OgvOldSeasonModule_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93615a = {new PojoPropertyDescriptor("style", (String[]) null, OgvOldSeasonModule.Type.class, (Class) null, 7), new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 1), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("more", (String[]) null, String.class, (Class) null, 1), new PojoPropertyDescriptor("more_left", (String[]) null, MoreLeft.class, (Class) null, 5), new PojoPropertyDescriptor("more_bottom_desc", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 1), new PojoPropertyDescriptor("can_ord_desc", (String[]) null, Boolean.TYPE, (Class) null, 5), new PojoPropertyDescriptor("module_style", (String[]) null, OgvOldSeasonModule.ModuleStyle.class, (Class) null, 4), new PojoPropertyDescriptor("data", (String[]) null, JsonObject.class, (Class) null, 4), new PojoPropertyDescriptor("splitText", (String[]) null, String.class, (Class) null, 0), new PojoPropertyDescriptor("bg_info", (String[]) null, BgInfo.class, (Class) null, 4)};

    public OgvOldSeasonModule_JsonDescriptor() {
        super(OgvOldSeasonModule.class, f93615a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        OgvOldSeasonModule.Type type = (OgvOldSeasonModule.Type) obj;
        Long l7 = (Long) objArr[1];
        long jLongValue = l7 == null ? 0L : l7.longValue();
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        MoreLeft moreLeft = (MoreLeft) objArr[4];
        String str3 = (String) objArr[5];
        Map map = (Map) objArr[6];
        Boolean bool = (Boolean) objArr[7];
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new OgvOldSeasonModule(type, jLongValue, str, str2, moreLeft, str3, map, zBooleanValue, (OgvOldSeasonModule.ModuleStyle) objArr[8], (JsonObject) objArr[9], (String) objArr[10], (BgInfo) objArr[11], i7);
    }

    public final Object get(Object obj, int i7) {
        OgvOldSeasonModule ogvOldSeasonModule = (OgvOldSeasonModule) obj;
        switch (i7) {
            case 0:
                return ogvOldSeasonModule.e();
            case 1:
                return Long.valueOf(ogvOldSeasonModule.f93596b);
            case 2:
                return ogvOldSeasonModule.d();
            case 3:
                return ogvOldSeasonModule.f93598d;
            case 4:
                return ogvOldSeasonModule.g();
            case 5:
                return ogvOldSeasonModule.f();
            case 6:
                return ogvOldSeasonModule.f93601g;
            case 7:
                return Boolean.valueOf(ogvOldSeasonModule.h());
            case 8:
                return ogvOldSeasonModule.c();
            case 9:
                return ogvOldSeasonModule.b();
            case 10:
                return ogvOldSeasonModule.f93604k;
            case 11:
                return ogvOldSeasonModule.a();
            default:
                return null;
        }
    }
}
