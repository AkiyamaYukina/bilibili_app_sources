package com.bilibili.lib.tribe.core.internal;

import android.app.AppComponentFactory;
import android.content.pm.ApplicationInfo;
import androidx.annotation.RequiresApi;
import com.bilibili.lib.tribe.core.internal.loader.DefaultClassLoaderService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/TribeAppComponentFactory.class */
@RequiresApi(28)
public final class TribeAppComponentFactory extends AppComponentFactory {
    @Override // android.app.AppComponentFactory
    @NotNull
    public final ClassLoader instantiateClassLoader(@NotNull ClassLoader classLoader, @NotNull ApplicationInfo applicationInfo) {
        return new DefaultClassLoaderService(classLoader, applicationInfo).f64652g;
    }
}
