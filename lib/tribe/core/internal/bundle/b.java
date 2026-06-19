package com.bilibili.lib.tribe.core.internal.bundle;

import Ef0.InterfaceC1642a;
import Ef0.InterfaceC1644c;
import Jf0.f;
import android.content.ContextWrapper;
import com.bilibili.lib.tribe.core.internal.report.ReporterService;
import com.bilibili.lib.tribe.core.internal.stub.TribeStubProvider;
import java.io.File;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/b.class */
public interface b extends InterfaceC1642a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f64643a = a.f64644a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/b$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64644a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final ContextWrapper f64645b = new ContextWrapper(null);
    }

    void b(@NotNull File file, @NotNull Df0.b bVar);

    @NotNull
    Map<String, InterfaceC1644c> d();

    void f(boolean z6);

    @NotNull
    ReporterService getReporterService();

    @NotNull
    f getResources();

    @NotNull
    com.bilibili.lib.tribe.core.internal.loader.a i();

    void j(@NotNull String str, @NotNull TribeStubProvider tribeStubProvider);

    @Nullable
    InterfaceC1644c k(@NotNull String str);
}
