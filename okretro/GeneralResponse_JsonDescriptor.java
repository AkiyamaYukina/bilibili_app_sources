package com.bilibili.okretro;

import androidx.exifinterface.media.ExifInterface;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/GeneralResponse_JsonDescriptor.class */
public final class GeneralResponse_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73392a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("data", (String[]) null, Types.typeVariable(ExifInterface.GPS_DIRECTION_TRUE, GeneralResponse.class), (Class) null, 2);
        Class cls = Integer.TYPE;
        f73392a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, new PojoPropertyDescriptor("code", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("message", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("ttl", (String[]) null, cls, (Class) null, 3)};
    }

    public GeneralResponse_JsonDescriptor() {
        super(GeneralResponse.class, f73392a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object constructWith(Object[] objArr) {
        GeneralResponse generalResponse = new GeneralResponse();
        T t7 = objArr[0];
        if (t7 != 0) {
            generalResponse.data = t7;
        }
        Object[] objArr2 = objArr[1];
        if (objArr2 != 0) {
            generalResponse.code = ((Integer) objArr2).intValue();
        }
        Object[] objArr3 = objArr[2];
        if (objArr3 != 0) {
            generalResponse.message = (String) objArr3;
        }
        Object[] objArr4 = objArr[3];
        if (objArr4 != 0) {
            generalResponse.ttl = ((Integer) objArr4).intValue();
        }
        return generalResponse;
    }

    public final Object get(Object obj, int i7) {
        int i8;
        GeneralResponse generalResponse = (GeneralResponse) obj;
        if (i7 == 0) {
            return generalResponse.data;
        }
        if (i7 == 1) {
            i8 = generalResponse.code;
        } else {
            if (i7 == 2) {
                return generalResponse.message;
            }
            if (i7 != 3) {
                return null;
            }
            i8 = generalResponse.ttl;
        }
        return Integer.valueOf(i8);
    }
}
