package com.bilibili.ogv.review.detailpage;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/VipLabel_JsonDescriptor.class */
public final class VipLabel_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f72325a = {new PojoPropertyDescriptor("path", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("text", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("label_theme", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("bg_style", (String[]) null, Integer.TYPE, (Class) null, 5), new PojoPropertyDescriptor("bg_color", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("border_color", (String[]) null, String.class, (Class) null, 5), new PojoPropertyDescriptor("text_color", (String[]) null, String.class, (Class) null, 5)};

    public VipLabel_JsonDescriptor() {
        super(VipLabel.class, f72325a);
    }

    public final Object constructWith(Object[] objArr) {
        int iIntValue = 0;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        Integer num = (Integer) objArr[3];
        if (num != null) {
            iIntValue = num.intValue();
        }
        return new VipLabel(str, str2, str3, iIntValue, (String) objArr[4], (String) objArr[5], (String) objArr[6]);
    }

    public final Object get(Object obj, int i7) {
        VipLabel vipLabel = (VipLabel) obj;
        switch (i7) {
            case 0:
                return vipLabel.f72318a;
            case 1:
                return vipLabel.f72319b;
            case 2:
                return vipLabel.f72320c;
            case 3:
                return Integer.valueOf(vipLabel.f72321d);
            case 4:
                return vipLabel.f72322e;
            case 5:
                return vipLabel.f72323f;
            case 6:
                return vipLabel.f72324g;
            default:
                return null;
        }
    }
}
