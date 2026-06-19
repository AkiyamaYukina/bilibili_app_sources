package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.ship.theseus.ugc.endpage.qoe.UgcDmQoeInfo;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeInfo_Info_Form_JsonDescriptor.class */
public final class UgcDmQoeInfo_Info_Form_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f96685a = {new PojoPropertyDescriptor("type", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("options", (String[]) null, Types.parameterizedType(List.class, new Type[]{UgcDmQoeInfo.Info.QoeOption.class}), (Class) null, 21)};

    public UgcDmQoeInfo_Info_Form_JsonDescriptor() {
        super(UgcDmQoeInfo.Info.Form.class, f96685a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new UgcDmQoeInfo.Info.Form(iIntValue, (List) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        UgcDmQoeInfo.Info.Form form = (UgcDmQoeInfo.Info.Form) obj;
        if (i7 == 0) {
            return Integer.valueOf(form.f96675a);
        }
        if (i7 != 1) {
            return null;
        }
        return form.f96676b;
    }
}
