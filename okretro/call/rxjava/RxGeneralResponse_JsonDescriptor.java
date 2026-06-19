package com.bilibili.okretro.call.rxjava;

import androidx.exifinterface.media.ExifInterface;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/call/rxjava/RxGeneralResponse_JsonDescriptor.class */
public final class RxGeneralResponse_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73429a;

    static {
        PojoPropertyDescriptor pojoPropertyDescriptor = new PojoPropertyDescriptor("data", (String[]) null, Types.typeVariable(ExifInterface.GPS_DIRECTION_TRUE, RxGeneralResponse.class), (Class) null, 6);
        PojoPropertyDescriptor pojoPropertyDescriptor2 = new PojoPropertyDescriptor(ThirdPartyExtraBuilder.KEY_RESULT, (String[]) null, Types.typeVariable(ExifInterface.GPS_DIRECTION_TRUE, RxGeneralResponse.class), (Class) null, 6);
        Class cls = Integer.TYPE;
        f73429a = new PojoPropertyDescriptor[]{pojoPropertyDescriptor, pojoPropertyDescriptor2, new PojoPropertyDescriptor("code", (String[]) null, cls, (Class) null, 3), new PojoPropertyDescriptor("message", (String[]) null, String.class, (Class) null, 2), new PojoPropertyDescriptor("ttl", (String[]) null, cls, (Class) null, 3)};
    }

    public RxGeneralResponse_JsonDescriptor() {
        super(RxGeneralResponse.class, f73429a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object constructWith(Object[] objArr) {
        RxGeneralResponse rxGeneralResponse = new RxGeneralResponse();
        T t7 = objArr[0];
        if (t7 != 0) {
            rxGeneralResponse._data = t7;
        }
        T t8 = objArr[1];
        if (t8 != 0) {
            rxGeneralResponse._result = t8;
        }
        Object[] objArr2 = objArr[2];
        if (objArr2 != 0) {
            rxGeneralResponse.code = ((Integer) objArr2).intValue();
        }
        Object[] objArr3 = objArr[3];
        if (objArr3 != 0) {
            rxGeneralResponse.message = (String) objArr3;
        }
        Object[] objArr4 = objArr[4];
        if (objArr4 != 0) {
            rxGeneralResponse.ttl = ((Integer) objArr4).intValue();
        }
        return rxGeneralResponse;
    }

    public final Object get(Object obj, int i7) {
        int i8;
        RxGeneralResponse rxGeneralResponse = (RxGeneralResponse) obj;
        if (i7 == 0) {
            return rxGeneralResponse._data;
        }
        if (i7 == 1) {
            return rxGeneralResponse._result;
        }
        if (i7 == 2) {
            i8 = rxGeneralResponse.code;
        } else {
            if (i7 == 3) {
                return rxGeneralResponse.message;
            }
            if (i7 != 4) {
                return null;
            }
            i8 = rxGeneralResponse.ttl;
        }
        return Integer.valueOf(i8);
    }
}
