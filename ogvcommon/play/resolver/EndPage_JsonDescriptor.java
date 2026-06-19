package com.bilibili.ogvcommon.play.resolver;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;
import com.bilibili.ogvcommon.play.vo.LimitDialogVo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/EndPage_JsonDescriptor.class */
public final class EndPage_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f73203a = {new PojoPropertyDescriptor("dialog", (String[]) null, LimitDialogVo.class, (Class) null, 7)};

    public EndPage_JsonDescriptor() {
        super(EndPage.class, f73203a);
    }

    public final Object constructWith(Object[] objArr) {
        int i7 = 0;
        Object obj = objArr[0];
        if (obj == null) {
            i7 = 1;
        }
        return new EndPage((LimitDialogVo) obj, i7);
    }

    public final Object get(Object obj, int i7) {
        EndPage endPage = (EndPage) obj;
        if (i7 != 0) {
            return null;
        }
        return endPage.a();
    }
}
