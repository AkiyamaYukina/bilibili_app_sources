package com.bilibili.ogvcommon.play.vo;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo_ConfigVo_JsonDescriptor.class */
public final class LimitDialogVo_ConfigVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73322a = {new PojoPropertyDescriptor("is_show_cover", (String[]) null, Boolean.TYPE, (Class) null, 7)};

    public LimitDialogVo_ConfigVo_JsonDescriptor() {
        super(LimitDialogVo.ConfigVo.class, f73322a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean zBooleanValue = false;
        Object obj = objArr[0];
        int i7 = obj == null ? 1 : 0;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return new LimitDialogVo.ConfigVo(zBooleanValue, i7);
    }

    public final Object get(Object obj, int i7) {
        LimitDialogVo.ConfigVo configVo = (LimitDialogVo.ConfigVo) obj;
        if (i7 != 0) {
            return null;
        }
        return Boolean.valueOf(configVo.a());
    }
}
