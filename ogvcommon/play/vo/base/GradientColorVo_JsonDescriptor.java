package com.bilibili.ogvcommon.play.vo.base;

import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/GradientColorVo_JsonDescriptor.class */
public final class GradientColorVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73341a = {new PojoPropertyDescriptor("start_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12), new PojoPropertyDescriptor("end_color", (String[]) null, Integer.class, StringIntColorTypeAdapter.class, 12)};

    public GradientColorVo_JsonDescriptor() {
        super(GradientColorVo.class, f73341a);
    }

    public final Object constructWith(Object[] objArr) {
        return new GradientColorVo((Integer) objArr[0], (Integer) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        GradientColorVo gradientColorVo = (GradientColorVo) obj;
        if (i7 == 0) {
            return gradientColorVo.b();
        }
        if (i7 != 1) {
            return null;
        }
        return gradientColorVo.a();
    }
}
