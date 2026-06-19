package com.bilibili.ogv.infra.tempfile;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/tempfile/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f67941b;

    public d(@NotNull Context context, @NotNull String str) {
        this.f67940a = str;
        this.f67941b = context.getApplicationContext();
    }

    @NotNull
    public final String a() {
        return "DownloadingTempFileFactory-" + this.f67940a;
    }
}
