package com.bilibili.tgwt.square;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/RecommendModule_JsonDescriptor.class */
public final class RecommendModule_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f112089a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("style", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("attr", (String[]) null, ModuleAttr.class, (Class) null, 7), new PojoPropertyDescriptor("headers", (String[]) null, Types.parameterizedType(List.class, new Type[]{ModuleHeader.class}), (Class) null, 23), new PojoPropertyDescriptor("items", (String[]) null, Types.parameterizedType(List.class, new Type[]{CommonCard.class}), (Class) null, 23), new PojoPropertyDescriptor("link", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("report", (String[]) null, Types.parameterizedType(Map.class, new Type[]{String.class, String.class}), (Class) null, 6)};

    public RecommendModule_JsonDescriptor() {
        super(RecommendModule.class, f112089a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        String str = (String) obj;
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str2 = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str3 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        ModuleAttr moduleAttr = (ModuleAttr) obj4;
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        List list = (List) obj5;
        Object obj6 = objArr[5];
        int i12 = i11;
        if (obj6 == null) {
            i12 = i11 | 32;
        }
        List list2 = (List) obj6;
        Object obj7 = objArr[6];
        int i13 = i12;
        if (obj7 == null) {
            i13 = i12 | 64;
        }
        String str4 = (String) obj7;
        Object obj8 = objArr[7];
        int i14 = i13;
        if (obj8 == null) {
            i14 = i13 | 128;
        }
        return new RecommendModule(str, str2, str3, moduleAttr, list, list2, str4, (Map) obj8, i14);
    }

    public final Object get(Object obj, int i7) {
        RecommendModule recommendModule = (RecommendModule) obj;
        switch (i7) {
            case 0:
                return recommendModule.f112082a;
            case 1:
                return recommendModule.b();
            case 2:
                return recommendModule.f112084c;
            case 3:
                return recommendModule.f112085d;
            case 4:
                return recommendModule.f112086e;
            case 5:
                return recommendModule.a();
            case 6:
                return recommendModule.f112088g;
            case 7:
                return recommendModule.h;
            default:
                return null;
        }
    }
}
