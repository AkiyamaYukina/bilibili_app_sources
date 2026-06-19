package com.bilibili.ogvcommon.play.vo;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo_BottomDisplayVo_JsonDescriptor.class */
public final class LimitDialogVo_BottomDisplayVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73321a = {new PojoPropertyDescriptor("title", (String[]) null, TextVo.class, (Class) null, 1), new PojoPropertyDescriptor("icon", (String[]) null, String.class, (Class) null, 1)};

    public LimitDialogVo_BottomDisplayVo_JsonDescriptor() {
        super(LimitDialogVo.BottomDisplayVo.class, f73321a);
    }

    public final Object constructWith(Object[] objArr) {
        return new LimitDialogVo.BottomDisplayVo((TextVo) objArr[0], (String) objArr[1]);
    }

    public final Object get(Object obj, int i7) {
        LimitDialogVo.BottomDisplayVo bottomDisplayVo = (LimitDialogVo.BottomDisplayVo) obj;
        if (i7 == 0) {
            return bottomDisplayVo.f73313a;
        }
        if (i7 != 1) {
            return null;
        }
        return bottomDisplayVo.f73314b;
    }
}
