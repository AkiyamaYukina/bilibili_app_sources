package com.bilibili.upper.module.template.vm;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/a.class */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f114030a;

    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        ((Integer) obj2).intValue();
        this.f114030a.f114049d.postValue(Integer.valueOf(((int) (iIntValue * 0.7f)) + 20));
        return Unit.INSTANCE;
    }
}
