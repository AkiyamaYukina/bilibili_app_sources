package com.bilibili.lib.resmanager;

import java.io.File;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/ResResponse.class */
public final class ResResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f64281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final File f64282b;

    public ResResponse(@Nullable String str, @Nullable File file) {
        this.f64281a = str;
        this.f64282b = file;
    }

    @Nullable
    public final File getFile() {
        return this.f64282b;
    }

    @Nullable
    public final String getPath() {
        return this.f64281a;
    }
}
