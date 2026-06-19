package com.bilibili.ship.theseus.ogv;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvDrmCheckResult_JsonDescriptor.class */
public final class OgvDrmCheckResult_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f91266a = {new PojoPropertyDescriptor("allow_play", (String[]) null, Boolean.TYPE, (Class) null, 7), new PojoPropertyDescriptor("errmsg", (String[]) null, String.class, (Class) null, 5)};

    public OgvDrmCheckResult_JsonDescriptor() {
        super(OgvDrmCheckResult.class, f91266a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new OgvDrmCheckResult(zBooleanValue, (String) objArr[1], i7);
    }

    public final Object get(Object obj, int i7) {
        OgvDrmCheckResult ogvDrmCheckResult = (OgvDrmCheckResult) obj;
        if (i7 == 0) {
            return Boolean.valueOf(ogvDrmCheckResult.a());
        }
        if (i7 != 1) {
            return null;
        }
        return ogvDrmCheckResult.b();
    }
}
