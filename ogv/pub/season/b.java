package com.bilibili.ogv.pub.season;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/season/b.class */
public final class b {
    public static final boolean a(@NotNull a aVar) {
        return Intrinsics.areEqual(aVar, a.f71775b) || Intrinsics.areEqual(aVar, a.f71778e);
    }

    @NotNull
    public static final String b(@NotNull a aVar, @NotNull Context context) {
        return Intrinsics.areEqual(aVar, a.f71775b) ? context.getString(2131832117) : Intrinsics.areEqual(aVar, a.f71776c) ? context.getString(2131832120) : Intrinsics.areEqual(aVar, a.f71777d) ? context.getString(2131832118) : Intrinsics.areEqual(aVar, a.f71778e) ? context.getString(2131832119) : Intrinsics.areEqual(aVar, a.f71779f) ? context.getString(2131832121) : Intrinsics.areEqual(aVar, a.f71780g) ? context.getString(2131832122) : "";
    }
}
