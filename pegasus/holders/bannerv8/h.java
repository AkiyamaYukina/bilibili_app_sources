package com.bilibili.pegasus.holders.bannerv8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/h.class */
public final class h {
    public static final boolean a(@Nullable String str) {
        return Intrinsics.areEqual("ad", str) || Intrinsics.areEqual("ad_inline", str) || Intrinsics.areEqual("ad_inline_live", str) || Intrinsics.areEqual("ad_inline_av", str);
    }

    public static final boolean b(@Nullable String str) {
        return Intrinsics.areEqual("ad", str) || Intrinsics.areEqual("ad_inline_live", str) || Intrinsics.areEqual("ad_inline_av", str) || Intrinsics.areEqual("ad_compose", str);
    }
}
