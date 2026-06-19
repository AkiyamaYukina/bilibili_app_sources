package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo_Info_ScoreItem_JsonDescriptor.class */
public final class UgcDmQoeInfo_Info_ScoreItem_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f96689a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("url", (String[]) null, String.class, (Class) null, 7), new PojoPropertyDescriptor("score", (String[]) null, Float.TYPE, (Class) null, 7)};

    public UgcDmQoeInfo_Info_ScoreItem_JsonDescriptor() {
        super(UgcDmQoeInfo.Info.ScoreItem.class, f96689a);
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
        Float f7 = (Float) obj3;
        return new UgcDmQoeInfo.Info.ScoreItem(f7 == null ? 0.0f : f7.floatValue(), i9, str, str2);
    }

    public final Object get(Object obj, int i7) {
        UgcDmQoeInfo.Info.ScoreItem scoreItem = (UgcDmQoeInfo.Info.ScoreItem) obj;
        if (i7 == 0) {
            return scoreItem.f96682a;
        }
        if (i7 == 1) {
            return scoreItem.f96683b;
        }
        if (i7 != 2) {
            return null;
        }
        return Float.valueOf(scoreItem.f96684c);
    }
}
