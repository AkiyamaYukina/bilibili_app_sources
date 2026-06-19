package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Progress_JsonDescriptor.class */
public final class Progress_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69882a = {new PojoPropertyDescriptor("bar", (String[]) null, Integer.TYPE, (Class) null, 5)};

    public Progress_JsonDescriptor() {
        super(Progress.class, f69882a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Integer num = (Integer) objArr[0];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new Progress(iIntValue);
    }

    public final Object get(Object obj, int i7) {
        Progress progress = (Progress) obj;
        if (i7 != 0) {
            return null;
        }
        return Integer.valueOf(progress.f69881a);
    }
}
