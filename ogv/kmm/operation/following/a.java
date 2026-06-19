package com.bilibili.ogv.kmm.operation.following;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import dk0.C6818b;
import dk0.C6819c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/following/a.class */
public final class a implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f68319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f68320b;

    public a(List<b> list, float f7) {
        this.f68319a = list;
        this.f68320b = f7;
    }

    public final Object invoke(Object obj) {
        List<b> list = this.f68319a;
        ((LazyListScope) obj).items(((ArrayList) list).size(), null, new C6818b(list), ComposableLambdaKt.composableLambdaInstance(802480018, true, new C6819c(list, this.f68320b)));
        return Unit.INSTANCE;
    }
}
