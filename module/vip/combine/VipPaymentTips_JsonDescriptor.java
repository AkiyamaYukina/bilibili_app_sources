package com.bilibili.module.vip.combine;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.bson.common.Types;
import com.bilibili.vip.VipPrivilegeType;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentTips_JsonDescriptor.class */
public final class VipPaymentTips_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f66166a = {new PojoPropertyDescriptor("rights_type", (String[]) null, VipPrivilegeType.class, (Class) null, 7), new PojoPropertyDescriptor("image", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("sub_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("price_panel_title", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("buttons", (String[]) null, Types.parameterizedType(List.class, new Type[]{VipPrivilegeButton.class}), (Class) null, 21)};

    public VipPaymentTips_JsonDescriptor() {
        super(VipPaymentTips.class, f66166a);
    }

    public final Object constructWith(Object[] objArr) {
        Object obj = objArr[0];
        return new VipPaymentTips((VipPrivilegeType) obj, (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (List) objArr[5], obj == null ? 1 : 0);
    }

    public final Object get(Object obj, int i7) {
        VipPaymentTips vipPaymentTips = (VipPaymentTips) obj;
        if (i7 == 0) {
            return vipPaymentTips.f66143a;
        }
        if (i7 == 1) {
            return vipPaymentTips.a();
        }
        if (i7 == 2) {
            return vipPaymentTips.f66145c;
        }
        if (i7 == 3) {
            return vipPaymentTips.b();
        }
        if (i7 == 4) {
            return vipPaymentTips.f66147e;
        }
        if (i7 != 5) {
            return null;
        }
        return vipPaymentTips.f66148f;
    }
}
