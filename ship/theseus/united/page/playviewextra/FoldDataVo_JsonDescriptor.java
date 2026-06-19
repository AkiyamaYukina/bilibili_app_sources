package com.bilibili.ship.theseus.united.page.playviewextra;

import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/FoldDataVo_JsonDescriptor.class */
public final class FoldDataVo_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f102378a = {new PojoPropertyDescriptor("fold_style", (String[]) null, FoldStyle.class, (Class) null, 7), new PojoPropertyDescriptor("count_down", (String[]) null, CountdownItemVo.class, (Class) null, 4)};

    public FoldDataVo_JsonDescriptor() {
        super(FoldDataVo.class, f102378a);
    }

    public final Object constructWith(Object[] objArr) {
        boolean z6 = false;
        Object obj = objArr[0];
        if (obj == null) {
            z6 = true;
        }
        FoldStyle foldStyle = (FoldStyle) obj;
        CountdownItemVo countdownItemVo = (CountdownItemVo) objArr[1];
        FoldStyle foldStyle2 = foldStyle;
        if (z6) {
            foldStyle2 = FoldStyle.Countdown;
        }
        return new FoldDataVo(foldStyle2, countdownItemVo);
    }

    public final Object get(Object obj, int i7) {
        FoldDataVo foldDataVo = (FoldDataVo) obj;
        if (i7 == 0) {
            return foldDataVo.b();
        }
        if (i7 != 1) {
            return null;
        }
        return foldDataVo.a();
    }
}
