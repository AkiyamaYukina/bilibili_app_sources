package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/j.class */
public final class C5446j implements Function2<LazyListScope, Dp, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5449m f68118a;

    public C5446j(C5449m c5449m) {
        this.f68118a = c5449m;
    }

    public final Object invoke(Object obj, Object obj2) {
        float fM3894unboximpl = ((Dp) obj2).m3894unboximpl();
        ArrayList arrayList = (ArrayList) this.f68118a.f68126c;
        ((LazyListScope) obj).items(arrayList.size(), null, new C5444h(arrayList), ComposableLambdaKt.composableLambdaInstance(802480018, true, new C5445i(arrayList, fM3894unboximpl)));
        return Unit.INSTANCE;
    }
}
