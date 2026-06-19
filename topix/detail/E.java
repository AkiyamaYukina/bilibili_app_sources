package com.bilibili.topix.detail;

import Ih.b;
import com.bilibili.app.comm.list.common.data.DataStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/E.class */
public final /* synthetic */ class E implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112651a;

    public final Object invoke(Object obj) {
        b bVar = (b) obj;
        bVar.a = this.f112651a;
        bVar.e = DataStatus.LOADING;
        return Unit.INSTANCE;
    }
}
