package com.bilibili.ogv.filmlist.part;

import java.util.Arrays;
import java.util.List;
import kntr.base.localization.DateTimeStringID;
import kntr.base.localization.o;
import kntr.common.compose.utils.ResourcesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/part/k.class */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67785a;

    public final Object invoke(Object obj) {
        switch (this.f67785a) {
            case 0:
                return ((g) CollectionsKt.first((List) obj)).f67775a.getContentType();
            default:
                return ResourcesKt.c(kntr.base.localization.i.a(DateTimeStringID.Yesterday), Arrays.copyOf(new Object[]{o.b.invoke((q91.n) obj)}, 1));
        }
    }
}
