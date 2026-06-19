package com.bilibili.lib.tribe.core.internal;

import Df0.C1593a;
import Ff0.ThreadFactoryC1886c;
import Hf0.C2126a;
import Kf0.C2439a;
import R40.a;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.bilibili.lib.tribe.core.internal.bundle.BundleManager;
import com.bilibili.lib.tribe.core.internal.bundle.b;
import com.bilibili.lib.tribe.core.internal.loader.DefaultClassLoaderService;
import com.bilibili.lib.tribe.core.internal.loader.a;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleManager3;
import com.bilibili.lib.tribe.runtime.TribeApi;
import com.google.gson.Gson;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/Hooks.class */
public final class Hooks extends a {

    @NotNull
    public static final Hooks INSTANCE = new Hooks();

    @JvmStatic
    @NotNull
    public static final Class<?> forName(@NotNull String str) {
        b bVar = C1593a.f2893a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            bVar = null;
        }
        return Class.forName(str, false, bVar.e());
    }

    @JvmStatic
    public static final void hookAfterAttachContext(@NotNull ContextWrapper contextWrapper) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void hookAttachApplicationContext(@NotNull Context context, @NotNull Application application, boolean z6, @NotNull List<String> list) {
        TribeApi.bundleLoadTimeoutEnable = z6;
        ClassLoader classLoader = context.getClassLoader();
        boolean z7 = classLoader instanceof a.InterfaceC0361a;
        Hooks hooks = INSTANCE;
        if (((R40.a) hooks).a) {
            return;
        }
        hooks.markInitialized();
        com.bilibili.lib.tribe.core.internal.report.a aVar = new com.bilibili.lib.tribe.core.internal.report.a();
        DefaultClassLoaderService service = z7 ? ((a.InterfaceC0361a) classLoader).getService() : new DefaultClassLoaderService(classLoader, context.getApplicationInfo());
        C2439a c2439a = new C2439a(context, context.getDir("tribe", 0));
        Gson gson = new Gson();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ThreadFactoryC1886c.f6131a);
        b bundleManager3 = c2439a.f12821b.getBoolean("use_tribe3", true) ? new BundleManager3(threadPoolExecutor, c2439a, aVar, service, gson, context, application) : new BundleManager(threadPoolExecutor, c2439a, aVar, service, gson, context, application);
        C1593a.f2893a = bundleManager3;
        TribeApi.setBundles(bundleManager3);
        bundleManager3.f(z7);
    }

    public static /* synthetic */ void hookAttachApplicationContext$default(Context context, Application application, boolean z6, List list, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        if ((i7 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        hookAttachApplicationContext(context, application, z6, list);
    }

    @JvmStatic
    @NotNull
    public static final Context hookAttachContext(@NotNull ContextWrapper contextWrapper, @NotNull Context context) {
        b bVar = C1593a.f2893a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            bVar = null;
        }
        try {
            bVar.getResources().b(contextWrapper, context, null);
        } catch (Exception e7) {
            Log.e("Tribe", "hookAddCtx fail", e7);
        }
        b bVar2 = C1593a.f2893a;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(NotificationCompat.CATEGORY_SERVICE);
            bVar2 = null;
        }
        return new C2126a(contextWrapper, context, bVar2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:16:0x0075
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final androidx.databinding.DataBinderMapper tribeMapper() {
        /*
            androidx.databinding.MergedDataBinderMapper r0 = new androidx.databinding.MergedDataBinderMapper
            r1 = r0
            r1.<init>()
            r4 = r0
            android.util.SparseIntArray r0 = com.bilibili.lib.fasthybrid.DataBinderMapperImpl.a     // Catch: java.lang.Exception -> L71
            r5 = r0
            r0 = r4
            java.lang.Class<com.bilibili.lib.fasthybrid.DataBinderMapperImpl> r1 = com.bilibili.lib.fasthybrid.DataBinderMapperImpl.class
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L71
            r2 = 0
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L71
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1     // Catch: java.lang.Exception -> L71
            r0.a(r1)     // Catch: java.lang.Exception -> L71
        L1d:
            android.util.SparseIntArray r0 = com.bilibili.lib.fasthybrid.game.DataBinderMapperImpl.a     // Catch: java.lang.Exception -> L71 java.lang.Exception -> L75
            r5 = r0
            r0 = r4
            java.lang.Class<com.bilibili.lib.fasthybrid.game.DataBinderMapperImpl> r1 = com.bilibili.lib.fasthybrid.game.DataBinderMapperImpl.class
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L75
            r2 = 0
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L75
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1     // Catch: java.lang.Exception -> L75
            r0.a(r1)     // Catch: java.lang.Exception -> L75
        L32:
            android.util.SparseIntArray r0 = com.bilibili.bililive.room.DataBinderMapperImpl.a     // Catch: java.lang.Exception -> L75 java.lang.Exception -> L79
            r5 = r0
            r0 = r4
            java.lang.Class<com.bilibili.bililive.room.DataBinderMapperImpl> r1 = com.bilibili.bililive.room.DataBinderMapperImpl.class
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L79
            r2 = 0
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L79
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1     // Catch: java.lang.Exception -> L79
            r0.a(r1)     // Catch: java.lang.Exception -> L79
        L47:
            r0 = r4
            java.lang.String r1 = "com.bcut.compositemodule.DataBinderMapperImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L7d
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L7d
            r2 = 0
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L7d
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1     // Catch: java.lang.Exception -> L7d
            r0.a(r1)     // Catch: java.lang.Exception -> L7d
        L5b:
            r0 = r4
            java.lang.String r1 = "com.bilibili.studio.module.tuwen.DataBinderMapperImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L81
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L81
            r2 = 0
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L81
            androidx.databinding.DataBinderMapper r1 = (androidx.databinding.DataBinderMapper) r1     // Catch: java.lang.Exception -> L81
            r0.a(r1)     // Catch: java.lang.Exception -> L81
        L6f:
            r0 = r4
            return r0
        L71:
            r5 = move-exception
            goto L1d
        L75:
            r5 = move-exception
            goto L32
        L79:
            r5 = move-exception
            goto L47
        L7d:
            r5 = move-exception
            goto L5b
        L81:
            r5 = move-exception
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal.Hooks.tribeMapper():androidx.databinding.DataBinderMapper");
    }
}
