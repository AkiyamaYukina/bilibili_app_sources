package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo_Info_QoeOption_JsonDescriptor.class */
public final class UgcDmQoeInfo_Info_QoeOption_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f96688a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("score", (String[]) null, Float.class, (Class) null, 4), new PojoPropertyDescriptor("img_url", (String[]) null, String.class, (Class) null, 4), new PojoPropertyDescriptor("desc", (String[]) null, Types.parameterizedType(List.class, new Type[]{String.class}), (Class) null, 20)};

    public UgcDmQoeInfo_Info_QoeOption_JsonDescriptor() {
        super(UgcDmQoeInfo.Info.QoeOption.class, f96688a);
    }

    public final Object constructWith(Object[] objArr) {
        return new UgcDmQoeInfo.Info.QoeOption((String) objArr[0], (Float) objArr[1], (String) objArr[2], (List) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        UgcDmQoeInfo.Info.QoeOption qoeOption = (UgcDmQoeInfo.Info.QoeOption) obj;
        if (i7 == 0) {
            return qoeOption.f96678a;
        }
        if (i7 == 1) {
            return qoeOption.f96679b;
        }
        if (i7 == 2) {
            return qoeOption.f96680c;
        }
        if (i7 != 3) {
            return null;
        }
        return qoeOption.f96681d;
    }
}
