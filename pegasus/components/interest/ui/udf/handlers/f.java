package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/f.class */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76428a;

    public /* synthetic */ f(int i7) {
        this.f76428a = i7;
    }

    public final Object invoke(Object obj) {
        return ItemSelectHandler$clickItem$3.invokeSuspend$lambda$0(this.f76428a, (Context) obj);
    }
}
