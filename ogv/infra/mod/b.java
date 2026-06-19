package com.bilibili.ogv.infra.mod;

import androidx.fragment.app.z;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.lib.mod.ModResourceClient;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/mod/b.class */
public final class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.mod.b.a(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean b(ModResource modResource, String str) {
        String modVersion = modResource.getModVersion();
        Integer intOrNull = modVersion != null ? StringsKt.toIntOrNull(modVersion) : null;
        Integer intOrNull2 = StringsKt.toIntOrNull(str);
        boolean z6 = false;
        if (intOrNull != null) {
            z6 = false;
            if (intOrNull2 != null) {
                z6 = false;
                if (intOrNull.intValue() < intOrNull2.intValue()) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @NotNull
    public static final Object c(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        ModResource modResource = ModResourceClient.getInstance().get(FoundationAlias.getFapp(), str, str2);
        if (!modResource.isAvailable()) {
            Result.Companion companion = Result.Companion;
            return Result.constructor-impl(ResultKt.createFailure(new IllegalStateException()));
        }
        if (!b(modResource, str3)) {
            BLog.i("ModKt-getModResourceIfReady", "[ogv-glue-ModKt-getModResourceIfReady] Available immediately.");
            return Result.constructor-impl(modResource);
        }
        f.a("[ogv-glue-ModKt-getModResourceIfReady] ", z.a("Mod resource expired. Version ", modResource.getModVersion(), " < ", str3), "ModKt-getModResourceIfReady", (Throwable) null);
        Result.Companion companion2 = Result.Companion;
        return Result.constructor-impl(ResultKt.createFailure(new IllegalStateException()));
    }
}
