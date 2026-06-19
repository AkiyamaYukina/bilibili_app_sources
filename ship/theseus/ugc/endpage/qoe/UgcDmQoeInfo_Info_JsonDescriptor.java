package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo_Info_JsonDescriptor.class */
public final class UgcDmQoeInfo_Info_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f96686a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("id", (String[]) null, Long.TYPE, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7);
        PojoPropertyDescriptor pojoPropertyDescriptor3 = new PojoPropertyDescriptor("feedback_title", (String[]) null, String.class, (Class) null, 7);
        Class cls = Integer.TYPE;
        f96686a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, pojoPropertyDescriptor3, new PojoPropertyDescriptor("type", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("style", (String[]) null, cls, (Class) null, 7), new PojoPropertyDescriptor("score_items", (String[]) null, Types.parameterizedType(List.class, new Type[]{UgcDmQoeInfo.Info.ScoreItem.class}), (Class) null, 23), new PojoPropertyDescriptor("layer_mask", (String[]) null, UgcDmQoeInfo.Info.LayerMask.class, (Class) null, 4), new PojoPropertyDescriptor("form", (String[]) null, UgcDmQoeInfo.Info.Form.class, (Class) null, 4)};
    }

    public UgcDmQoeInfo_Info_JsonDescriptor() {
        super(UgcDmQoeInfo.Info.class, f96686a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Long l7 = (Long) obj;
        long jLongValue = l7 == null ? 0L : l7.longValue();
        Object obj2 = objArr[1];
        int i8 = i7;
        if (obj2 == null) {
            i8 = i7 | 2;
        }
        String str = (String) obj2;
        Object obj3 = objArr[2];
        int i9 = i8;
        if (obj3 == null) {
            i9 = i8 | 4;
        }
        String str2 = (String) obj3;
        Object obj4 = objArr[3];
        int i10 = i9;
        if (obj4 == null) {
            i10 = i9 | 8;
        }
        Integer num = (Integer) obj4;
        int iIntValue = num == null ? 0 : num.intValue();
        Object obj5 = objArr[4];
        int i11 = i10;
        if (obj5 == null) {
            i11 = i10 | 16;
        }
        Integer num2 = (Integer) obj5;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Object obj6 = objArr[5];
        if (obj6 == null) {
            i11 |= 32;
        }
        return new UgcDmQoeInfo.Info(jLongValue, str, str2, iIntValue, iIntValue2, (List) obj6, (UgcDmQoeInfo.Info.LayerMask) objArr[6], (UgcDmQoeInfo.Info.Form) objArr[7], i11);
    }

    public final Object get(Object obj, int i7) {
        UgcDmQoeInfo.Info info = (UgcDmQoeInfo.Info) obj;
        switch (i7) {
            case 0:
                return Long.valueOf(info.f96668a);
            case 1:
                return info.f96669b;
            case 2:
                return info.f96670c;
            case 3:
                return Integer.valueOf(info.f96671d);
            case 4:
                return Integer.valueOf(info.f96672e);
            case 5:
                return info.f96673f;
            case 6:
                return info.f96674g;
            case 7:
                return info.h;
            default:
                return null;
        }
    }
}
