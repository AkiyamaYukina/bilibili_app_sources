package com.bilibili.relation;

import android.content.Context;
import com.bilibili.droid.ToastHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.relation.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/h.class */
public final /* synthetic */ class C6016h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f86093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f86094b;

    public /* synthetic */ C6016h(Context context, Function0 function0) {
        this.f86093a = context;
        this.f86094b = function0;
    }

    public final Object invoke(Object obj) {
        ToastHelper.showToastShort(this.f86093a, (String) obj);
        this.f86094b.invoke();
        return Unit.INSTANCE;
    }
}
