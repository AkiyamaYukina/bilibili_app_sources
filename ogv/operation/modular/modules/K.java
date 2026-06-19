package com.bilibili.ogv.operation.modular.modules;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/K.class */
public final /* synthetic */ class K implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f70378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f70379b;

    public /* synthetic */ K(L l7, long j7) {
        this.f70378a = l7;
        this.f70379b = j7;
    }

    public final Object invoke() {
        L l7 = this.f70378a;
        l7.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f70379b;
        if (jCurrentTimeMillis >= 400) {
            l7.f70382c.set(false);
            l7.f70380a.N(((Number) l7.f70381b.invoke()).intValue());
        } else {
            Single.just(Boolean.FALSE).delay(((long) 400) - jCurrentTimeMillis, TimeUnit.MILLISECONDS, Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Vg1.f(l7), Functions.f);
        }
        return Unit.INSTANCE;
    }
}
