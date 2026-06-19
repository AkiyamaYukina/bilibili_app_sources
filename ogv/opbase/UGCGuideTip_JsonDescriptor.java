package com.bilibili.ogv.opbase;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/UGCGuideTip_JsonDescriptor.class */
public final class UGCGuideTip_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f69953a = {new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("btn_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("jump_module_id", (String[]) null, String.class, (Class) null, 5)};

    public UGCGuideTip_JsonDescriptor() {
        super(UGCGuideTip.class, f69953a);
    }

    public final Object constructWith(Object[] objArr) {
        return new UGCGuideTip((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
    }

    public final Object get(Object obj, int i7) {
        UGCGuideTip uGCGuideTip = (UGCGuideTip) obj;
        if (i7 == 0) {
            return uGCGuideTip.f69949a;
        }
        if (i7 == 1) {
            return uGCGuideTip.a();
        }
        if (i7 == 2) {
            return uGCGuideTip.f69951c;
        }
        if (i7 != 3) {
            return null;
        }
        return uGCGuideTip.f69952d;
    }
}
