package com.bilibili.lib.setup;

import com.bilibili.lib.blkv.BLKV;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.foundation.FoundationAlias;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/setup/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final SharedPrefX f64395a = BLKV.getBLSharedPreferences$default(FoundationAlias.getFapp(), "deviceInfoCache", false, 0, 6, (Object) null);
}
