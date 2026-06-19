package com.bilibili.lib.tribe.runtime;

import Ef0.InterfaceC1642a;
import Ef0.InterfaceC1645d;
import Ef0.InterfaceC1646e;
import Ef0.InterfaceC1648g;
import Hx.m;
import com.bilibili.lib.tribe.core.api.BundleInfo;
import com.bilibili.lib.tribe.core.api.TribeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/runtime/TribeApi.class */
public final class TribeApi {

    @JvmField
    public static volatile boolean bundleLoadTimeoutEnable;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile InterfaceC1646e f64694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public static Function0<? extends InterfaceC1648g> f64695d;

    @NotNull
    public static final TribeApi INSTANCE = new TribeApi();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static InterfaceC1642a f64692a = a.f64697b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<Pair<String, Map<String, String>>> f64693b = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Lazy f64696e = LazyKt.lazy(new m(2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/runtime/TribeApi$a.class */
    public static final class a implements InterfaceC1642a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f64697b = new Object();

        @Override // Ef0.InterfaceC1642a
        public final void c(@NotNull TribeVersion tribeVersion) {
        }

        @Override // Ef0.InterfaceC1642a
        @NotNull
        public final ClassLoader e() {
            return a.class.getClassLoader();
        }

        @Override // Ef0.InterfaceC1642a
        @NotNull
        public final TribeVersion g() {
            return TribeVersion.NONE;
        }

        @Override // Ef0.InterfaceC1642a
        @Nullable
        public final BundleInfo get(@NotNull String str) {
            return null;
        }

        @Override // Ef0.InterfaceC1642a
        @NotNull
        public final String getReportInfo() {
            return "";
        }
    }

    @JvmStatic
    public static final void bindReporter(@NotNull InterfaceC1646e interfaceC1646e) {
        synchronized (TribeApi.class) {
            try {
                f64694c = interfaceC1646e;
                Iterator<T> it = f64693b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    interfaceC1646e.report((String) pair.getFirst(), (Map) pair.getSecond());
                }
                ((ArrayList) f64693b).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public static final InterfaceC1642a getBundles() {
        return f64692a;
    }

    @JvmStatic
    public static /* synthetic */ void getBundles$annotations() {
    }

    @JvmStatic
    @NotNull
    public static final String getReportInfo() {
        return f64692a.getReportInfo();
    }

    @JvmStatic
    @Nullable
    public static final InterfaceC1645d loadBy(@NotNull Class<?> cls) {
        Object classLoader = cls.getClassLoader();
        return classLoader instanceof InterfaceC1645d ? (InterfaceC1645d) classLoader : null;
    }

    @JvmStatic
    public static final void report(@NotNull String str, @NotNull Map<String, String> map) {
        synchronized (TribeApi.class) {
            try {
                Map<String, String> mutableMap = MapsKt.toMutableMap(map);
                mutableMap.putIfAbsent("tribeVersion", String.valueOf(f64692a.g().getVersionCode()));
                InterfaceC1646e interfaceC1646e = f64694c;
                if (interfaceC1646e != null) {
                    interfaceC1646e.report(str, mutableMap);
                } else {
                    f64693b.add(TuplesKt.to(str, mutableMap));
                }
            } finally {
            }
        }
    }

    public static final void setBundles(@NotNull InterfaceC1642a interfaceC1642a) {
        f64692a = interfaceC1642a;
    }

    @JvmStatic
    public static final void setWebViewPackageInfoProvider(@NotNull Function0<? extends InterfaceC1648g> function0) {
        f64695d = function0;
    }

    @Nullable
    public final BundleInfo get(@NotNull String str) {
        return f64692a.get(str);
    }

    @Nullable
    public final InterfaceC1648g getWebViewPackageInfoProvider() {
        return (InterfaceC1648g) f64696e.getValue();
    }
}
