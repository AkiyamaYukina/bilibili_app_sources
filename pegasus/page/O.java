package com.bilibili.pegasus.page;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/O.class */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy f78308a = LazyKt.lazy(new E50.a(9));

    public static final boolean a(List list) {
        int lastIndex = CollectionsKt.getLastIndex(list);
        boolean z6 = false;
        if (lastIndex >= 0) {
            ArrayList arrayList = (ArrayList) list;
            Object obj = arrayList.get(lastIndex);
            String cardType = null;
            fp0.o oVar = obj instanceof fp0.o ? (fp0.o) obj : null;
            if (oVar != null) {
                cardType = oVar.getCardType();
            }
            if (Intrinsics.areEqual(cardType, "footer_loading")) {
                arrayList.remove(CollectionsKt.getLastIndex(list));
                z6 = true;
            }
        }
        return z6;
    }
}
