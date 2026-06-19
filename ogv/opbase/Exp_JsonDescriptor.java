package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/Exp_JsonDescriptor.class */
public final class Exp_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69824a = {new PojoPropertyDescriptor("cinema_layout_exp", (String[]) null, Boolean.TYPE, (Class) null, 7)};

    public Exp_JsonDescriptor() {
        super(Exp.class, f69824a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new Exp(zBooleanValue, i7);
    }

    public final Object get(Object obj, int i7) {
        Exp exp = (Exp) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(exp.a());
    }
}
