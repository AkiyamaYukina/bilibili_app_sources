package com.bilibili.module.vip.mall;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.module.vip.mall.VipPayResultInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipPayResultInfo_JsonDescriptor.class */
public final class VipPayResultInfo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f66241a = {new PojoPropertyDescriptor(NotificationCompat.CATEGORY_STATUS, (String[]) null, Integer.TYPE, (Class) null, 3), new PojoPropertyDescriptor("order_no", (String[]) null, String.class, (Class) null, 6), new PojoPropertyDescriptor("dialog", (String[]) null, VipPayResultInfo.VipPayResultDialogContentInfo.class, (Class) null, 6)};

    public VipPayResultInfo_JsonDescriptor() {
        super(VipPayResultInfo.class, f66241a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        }
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
        return new VipPayResultInfo(iIntValue, str, (VipPayResultInfo.VipPayResultDialogContentInfo) obj3, i9);
    }

    public final Object get(Object obj, int i7) {
        VipPayResultInfo vipPayResultInfo = (VipPayResultInfo) obj;
        if (i7 == 0) {
            return Integer.valueOf(vipPayResultInfo.f66228a);
        }
        if (i7 == 1) {
            return vipPayResultInfo.b();
        }
        if (i7 != 2) {
            return null;
        }
        return vipPayResultInfo.a();
    }
}
