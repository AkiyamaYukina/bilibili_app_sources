package com.bilibili.lib.tribe.core.internal.bundle;

import Ef0.InterfaceC1644c;
import Ff0.C1888e;
import Ff0.ExecutorC1884a;
import G.p;
import Gf0.AbstractC1966a;
import Gf0.InterfaceC1965A;
import Gf0.InterfaceC1968c;
import Gf0.InterfaceC1969d;
import Gf0.InterfaceC1970e;
import Gf0.l;
import Gf0.n;
import Gf0.x;
import Gf0.y;
import Gf0.z;
import Jf0.c;
import Jf0.f;
import Kf0.C2439a;
import Nf0.C2742a;
import Nf0.C2745d;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bilibili.digital.card.Z;
import com.bilibili.digital.card.depercated.DigitalCardDetail;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.tribe.core.api.BundleInfo;
import com.bilibili.lib.tribe.core.api.DynamicBundleInfo;
import com.bilibili.lib.tribe.core.api.TribeVersion;
import com.bilibili.lib.tribe.core.internal.bundle.BundleManager;
import com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$ActivateStage;
import com.bilibili.lib.tribe.core.internal.bundle.BundleProcessor$SourceFrom;
import com.bilibili.lib.tribe.core.internal.bundle.DefaultBundleProcessor;
import com.bilibili.lib.tribe.core.internal.bundle.b;
import com.bilibili.lib.tribe.core.internal.report.ReporterService;
import com.bilibili.lib.tribe.core.internal.stub.TribeStubProvider;
import com.bilibili.lib.tribe.runtime.TribeApi;
import com.bilibili.studio.material.util.UtilsKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kntr.base.router.Router;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/BundleManager.class */
public final class BundleManager implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExecutorService f64620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C2439a f64621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.lib.tribe.core.internal.report.a f64622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.lib.tribe.core.internal.loader.a f64623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Gson f64624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f64625g;

    @NotNull
    public final Application h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final DefaultBundleProcessor f64626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final f f64627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y f64628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f64630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Handler f64631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC1969d> f64632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC1644c> f64633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Map<String, List<InterfaceC1970e>> f64634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final LinkedBlockingQueue<n> f64635r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal/bundle/BundleManager$a.class */
    public static final class a extends TypeToken<List<? extends C2742a>> {
    }

    public BundleManager(@NotNull ExecutorService executorService, @NotNull C2439a c2439a, @NotNull com.bilibili.lib.tribe.core.internal.report.a aVar, @NotNull com.bilibili.lib.tribe.core.internal.loader.a aVar2, @NotNull Gson gson, @NotNull Context context, @NotNull Application application) {
        this.f64620b = executorService;
        this.f64621c = c2439a;
        this.f64622d = aVar;
        this.f64623e = aVar2;
        this.f64624f = gson;
        this.f64625g = context;
        this.h = application;
        this.f64626i = new DefaultBundleProcessor(this, gson);
        boolean z6 = C1888e.f6133a;
        int i7 = Build.VERSION.SDK_INT;
        this.f64627j = i7 < 30 ? new c(context, aVar) : new Jf0.b(context);
        this.f64630m = "";
        l lVar = new l(this);
        IntentFilter intentFilter = new IntentFilter(p.a(context.getPackageName(), ".tribe.installed"));
        if (i7 < 26 && i7 < 34) {
            context.registerReceiver(lVar, intentFilter);
        } else {
            context.registerReceiver(lVar, intentFilter, 4);
        }
        this.f64631n = new Handler(Looper.getMainLooper());
        this.f64632o = new ConcurrentHashMap<>();
        this.f64633p = new ConcurrentHashMap<>();
        this.f64634q = new LinkedHashMap();
        this.f64635r = new LinkedBlockingQueue<>();
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    public final void b(@NotNull final File file, @NotNull final Df0.b bVar) {
        Pair pair;
        synchronized (this) {
            if (this.f64629l) {
                pair = TuplesKt.to(new IOException("Tribe init failed, can't install " + file + UtilsKt.DOT), Boolean.FALSE);
            } else {
                try {
                    final int i7 = 0;
                    pair = (Pair) this.f64621c.h(new Function0(i7, this, file) { // from class: Gf0.j

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f7079a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f7080b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Object f7081c;

                        {
                            this.f7079a = i7;
                            this.f7080b = this;
                            this.f7081c = file;
                        }

                        public final Object invoke() throws Throwable {
                            Pair pair2;
                            switch (this.f7079a) {
                                case 0:
                                    File file2 = (File) this.f7081c;
                                    BundleManager bundleManager = (BundleManager) this.f7080b;
                                    Pair<C2742a, File> pairB = bundleManager.f64626i.b(BundleProcessor$SourceFrom.RUNTIME_API, file2, false);
                                    C2742a c2742a = (C2742a) pairB.component1();
                                    File file3 = (File) pairB.component2();
                                    InterfaceC1969d interfaceC1969d = bundleManager.f64632o.get(c2742a.h());
                                    boolean z6 = interfaceC1969d instanceof InterfaceC1967b;
                                    DefaultBundleProcessor defaultBundleProcessor = bundleManager.f64626i;
                                    if (z6) {
                                        try {
                                            defaultBundleProcessor.a(BundleProcessor$ActivateStage.WARM_UP, file3, c2742a, false);
                                        } catch (Exception e7) {
                                            Log.w("Tribe", "do failed", e7);
                                        }
                                        pair2 = TuplesKt.to(interfaceC1969d, Boolean.FALSE);
                                        break;
                                    } else {
                                        try {
                                            pair2 = TuplesKt.to(defaultBundleProcessor.a(BundleProcessor$ActivateStage.ON_INSTALL, file3, c2742a, true), Boolean.TRUE);
                                        } catch (ClassNotFoundException e8) {
                                            StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(c2742a.k(), "Activate ", c2742a.h(), "(");
                                            sbA.append(") failed.");
                                            throw new IOException(sbA.toString(), e8);
                                        }
                                    }
                                    return pair2;
                                case 1:
                                    com.bilibili.digital.card.scene.carddetail.c cVar = (com.bilibili.digital.card.scene.carddetail.c) this.f7080b;
                                    Z z7 = cVar.d;
                                    DigitalCardDetail.Button button = (DigitalCardDetail.Button) this.f7081c;
                                    z7.c("main.space.profile.all.click", button.d());
                                    cVar.b.a(Uri.parse(button.c()));
                                    return Unit.INSTANCE;
                                default:
                                    v81.a.g((u81.a) this.f7080b, "user_agreement");
                                    ((Router) this.f7081c).launch(com.bilibili.lib.brouter.uri.Uri.Companion.parse(j81.a.b));
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                } catch (IOException e7) {
                    pair = TuplesKt.to(e7, Boolean.FALSE);
                }
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                p(bVar, pair);
            } else {
                final Pair pair2 = pair;
                this.f64631n.post(new Runnable(this, bVar, pair2) { // from class: Gf0.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BundleManager f7082a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Df0.b f7083b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Pair f7084c;

                    {
                        this.f7082a = this;
                        this.f7083b = bVar;
                        this.f7084c = pair2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7082a.p(this.f7083b, this.f7084c);
                    }
                });
            }
        }
    }

    @Override // Ef0.InterfaceC1642a
    public final void c(@NotNull TribeVersion tribeVersion) {
        if (tribeVersion != TribeVersion.NONE) {
            this.f64621c.j(tribeVersion == TribeVersion.f64619V3);
        }
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final Map<String, InterfaceC1644c> d() {
        return new HashMap(this.f64633p);
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final ClassLoader e() {
        return this.f64623e.b();
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    public final void f(boolean z6) {
        String strC;
        boolean z7;
        boolean zHasNext;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = -1L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = -1L;
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = -1L;
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            InputStream inputStreamOpen = this.f64625g.getAssets().open("tribe/bundles.json");
            try {
                Iterable iterable = (Iterable) this.f64624f.fromJson(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), new a().getType());
                final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                for (Object obj : iterable) {
                    String strH = ((C2742a) obj).h();
                    C2742a c2742a = (C2742a) obj;
                    AbstractC1966a abstractC1966a = (!Intrinsics.areEqual(c2742a.h(), "host") && c2742a.b()) ? new AbstractC1966a(c2742a) : new AbstractC1966a(c2742a);
                    linkedHashMap.put(strH, abstractC1966a);
                }
                CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                Object obj2 = linkedHashMap.get("host");
                y yVar = obj2 instanceof y ? (y) obj2 : null;
                if (yVar == null) {
                    throw new IllegalStateException("No host info");
                }
                this.f64628k = yVar;
                this.f64632o.putAll(linkedHashMap);
                com.bilibili.lib.tribe.core.internal.loader.a aVar = this.f64623e;
                if (!z6) {
                    Context baseContext = this.f64625g;
                    ClassLoader classLoaderB = aVar.b();
                    while (baseContext instanceof ContextWrapper) {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                    Field declaredField = baseContext.getClass().getDeclaredField("mPackageInfo");
                    declaredField.setAccessible(true);
                    Object obj3 = declaredField.get(baseContext);
                    Field declaredField2 = obj3.getClass().getDeclaredField("mClassLoader");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj3, classLoaderB);
                }
                try {
                    this.f64621c.h(new Function0(this, longRef2, longRef, longRef3, linkedHashMap) { // from class: com.bilibili.lib.tribe.core.internal.bundle.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final BundleManager f64638a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Ref.LongRef f64639b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Ref.LongRef f64640c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final Ref.LongRef f64641d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final Map f64642e;

                        {
                            this.f64638a = this;
                            this.f64639b = longRef2;
                            this.f64640c = longRef;
                            this.f64641d = longRef3;
                            this.f64642e = linkedHashMap;
                        }

                        public final Object invoke() throws InterruptedException, IOException {
                            Set setEmptySet;
                            BundleManager bundleManager = this.f64638a;
                            Ref.LongRef longRef4 = this.f64639b;
                            Ref.LongRef longRef5 = this.f64640c;
                            Ref.LongRef longRef6 = this.f64641d;
                            Map map = this.f64642e;
                            bundleManager.f64621c.g();
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            DefaultBundleProcessor defaultBundleProcessor = bundleManager.f64626i;
                            File file = bundleManager.f64621c.f12822c;
                            ExecutorC1884a executorC1884aO = defaultBundleProcessor.f64636a.o();
                            ArrayList arrayList = new ArrayList();
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            File[] fileArrListFiles = file.listFiles();
                            if (fileArrListFiles != null) {
                                for (File file2 : fileArrListFiles) {
                                    if (file2.isFile()) {
                                        arrayList.add(file2.getName());
                                        executorC1884aO.execute(new Runnable(defaultBundleProcessor, file2, concurrentHashMap) { // from class: Gf0.q

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final DefaultBundleProcessor f7096a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final File f7097b;

                                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                                            public final ConcurrentHashMap f7098c;

                                            {
                                                this.f7096a = defaultBundleProcessor;
                                                this.f7097b = file2;
                                                this.f7098c = concurrentHashMap;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                DefaultBundleProcessor defaultBundleProcessor2 = this.f7096a;
                                                File file3 = this.f7097b;
                                                ConcurrentHashMap concurrentHashMap2 = this.f7098c;
                                                try {
                                                    try {
                                                        defaultBundleProcessor2.b(BundleProcessor$SourceFrom.STASH_DIR, file3, true);
                                                    } catch (IOException e7) {
                                                        Log.w("Tribe", "Install " + file3 + " failed.", e7);
                                                    }
                                                } finally {
                                                    concurrentHashMap2.put(file3.getName(), Boolean.TRUE);
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                            executorC1884aO.a(TribeApi.bundleLoadTimeoutEnable ? 15000L : 0L);
                            if (TribeApi.bundleLoadTimeoutEnable) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj4 : arrayList) {
                                    if (!concurrentHashMap.containsKey((String) obj4)) {
                                        arrayList2.add(obj4);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    Log.e("Tribe", "Bundle install timeout (15000ms), failed bundles: " + arrayList2);
                                    defaultBundleProcessor.f64636a.f64622d.f(arrayList.size(), "INSTALL", arrayList2);
                                }
                            }
                            longRef4.element = SystemClock.uptimeMillis() - jUptimeMillis2;
                            long jUptimeMillis3 = SystemClock.uptimeMillis();
                            DefaultBundleProcessor defaultBundleProcessor2 = bundleManager.f64626i;
                            boolean zC = bundleManager.f64621c.c();
                            File file3 = bundleManager.f64621c.f12825f;
                            long jE = defaultBundleProcessor2.f64636a.f64621c.e();
                            String[] strings$default = RawKV.DefaultImpls.getStrings$default(defaultBundleProcessor2.f64636a.f64621c.f12824e, "last_host_features", (String[]) null, 2, (Object) null);
                            y yVarN = defaultBundleProcessor2.f64636a.n();
                            defaultBundleProcessor2.f64636a.f64621c.f();
                            if (yVarN.getVersionCode() != jE) {
                                List<C2745d> listF = yVarN.getMeta().f();
                                Set setMutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strings$default, strings$default.length));
                                Iterator<T> it = listF.iterator();
                                while (true) {
                                    setEmptySet = setMutableSetOf;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C2745d c2745d = (C2745d) it.next();
                                    if (c2745d.a().contains(Long.valueOf(jE))) {
                                        setMutableSetOf.remove(c2745d.b());
                                    } else {
                                        setMutableSetOf.add(c2745d.b());
                                    }
                                }
                            } else {
                                setEmptySet = SetsKt.emptySet();
                            }
                            File[] fileArrListFiles2 = file3.listFiles();
                            if (fileArrListFiles2 == null) {
                                throw new IOException(SW.a.b(file3, "Directory '", "' is illegal."));
                            }
                            ExecutorC1884a executorC1884aO2 = defaultBundleProcessor2.f64636a.o();
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap();
                            int i7 = 0;
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            ArrayList arrayList3 = new ArrayList();
                            ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
                            for (File file4 : fileArrListFiles2) {
                                if (file4.isDirectory()) {
                                    arrayList3.add(file4.getName());
                                    i7 = 0;
                                    executorC1884aO2.execute(new Runnable(map, file4, defaultBundleProcessor2, zC, setEmptySet, concurrentHashMap2, atomicBoolean, concurrentHashMap3, concurrentHashMap4) { // from class: Gf0.p

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final Map f7088a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final File f7089b;

                                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                                        public final DefaultBundleProcessor f7090c;

                                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                                        public final boolean f7091d;

                                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                                        public final Set f7092e;

                                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                                        public final ConcurrentHashMap f7093f;

                                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                                        public final AtomicBoolean f7094g;
                                        public final ConcurrentHashMap h;

                                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                                        public final ConcurrentHashMap f7095i;

                                        {
                                            this.f7088a = map;
                                            this.f7089b = file4;
                                            this.f7090c = defaultBundleProcessor2;
                                            this.f7091d = zC;
                                            this.f7092e = setEmptySet;
                                            this.f7093f = concurrentHashMap2;
                                            this.f7094g = atomicBoolean;
                                            this.h = concurrentHashMap3;
                                            this.f7095i = concurrentHashMap4;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            Map map2 = this.f7088a;
                                            File file5 = this.f7089b;
                                            DefaultBundleProcessor defaultBundleProcessor3 = this.f7090c;
                                            boolean z8 = this.f7091d;
                                            Set set = this.f7092e;
                                            ConcurrentHashMap concurrentHashMap5 = this.f7093f;
                                            AtomicBoolean atomicBoolean2 = this.f7094g;
                                            ConcurrentHashMap concurrentHashMap6 = this.h;
                                            ConcurrentHashMap concurrentHashMap7 = this.f7095i;
                                            Object obj5 = ((LinkedHashMap) map2).get(file5.getName());
                                            Long lValueOf = null;
                                            InterfaceC1968c interfaceC1968c = obj5 instanceof InterfaceC1968c ? (InterfaceC1968c) obj5 : null;
                                            if (interfaceC1968c != null) {
                                                lValueOf = Long.valueOf(interfaceC1968c.getVersionCode());
                                            }
                                            Triple tripleD = defaultBundleProcessor3.d(file5, z8, set, lValueOf);
                                            x xVar = (x) tripleD.component1();
                                            boolean zBooleanValue = ((Boolean) tripleD.component2()).booleanValue();
                                            InterfaceC1644c interfaceC1644c = (InterfaceC1644c) tripleD.component3();
                                            if (xVar != null) {
                                                concurrentHashMap5.put(xVar.getName(), xVar);
                                            }
                                            if (zBooleanValue) {
                                                atomicBoolean2.set(true);
                                            }
                                            if (interfaceC1644c != null) {
                                                concurrentHashMap6.put(interfaceC1644c.getName(), interfaceC1644c);
                                            }
                                            concurrentHashMap7.put(file5.getName(), Boolean.TRUE);
                                        }
                                    });
                                } else {
                                    file4.delete();
                                }
                            }
                            executorC1884aO2.a(TribeApi.bundleLoadTimeoutEnable ? 15000L : 0L);
                            if (TribeApi.bundleLoadTimeoutEnable) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj5 : arrayList3) {
                                    if (!concurrentHashMap4.containsKey((String) obj5)) {
                                        arrayList4.add(obj5);
                                    }
                                }
                                if (!arrayList4.isEmpty()) {
                                    Log.e("Tribe", "Bundle load timeout (15000ms), failed bundles: " + arrayList4);
                                    defaultBundleProcessor2.f64636a.f64622d.f(arrayList3.size(), "LOAD", arrayList4);
                                }
                            }
                            if (!setEmptySet.isEmpty() && !atomicBoolean.get()) {
                                C2439a c2439a = defaultBundleProcessor2.f64636a.f64621c;
                                long versionCode = yVarN.getVersionCode();
                                List<C2745d> listF2 = yVarN.getMeta().f();
                                int size = listF2.size();
                                String[] strArr = new String[size];
                                while (i7 < size) {
                                    strArr[i7] = listF2.get(i7).b();
                                    i7++;
                                }
                                RawKV rawKV = c2439a.f12824e;
                                if (rawKV.putLong("built_in_installed", versionCode) && !rawKV.putStrings("last_host_features", strArr) && jE > 0) {
                                    rawKV.putLong("built_in_installed", jE);
                                }
                            }
                            Pair pair = TuplesKt.to(concurrentHashMap2, concurrentHashMap3);
                            Map map2 = (Map) pair.component1();
                            Map<? extends String, ? extends InterfaceC1644c> map3 = (Map) pair.component2();
                            Iterator it2 = map2.entrySet().iterator();
                            while (it2.hasNext()) {
                                bundleManager.l((x) ((Map.Entry) it2.next()).getValue());
                            }
                            bundleManager.f64633p.putAll(map3);
                            longRef5.element = SystemClock.uptimeMillis() - jUptimeMillis3;
                            ArrayList arrayList5 = new ArrayList();
                            Iterator<Map.Entry<String, InterfaceC1969d>> it3 = bundleManager.f64632o.entrySet().iterator();
                            while (it3.hasNext()) {
                                InterfaceC1969d value = it3.next().getValue();
                                if (value instanceof x) {
                                    x xVar = (x) value;
                                    if (xVar.a()) {
                                        arrayList5.add(xVar.getApk().getPath());
                                    }
                                } else if (value instanceof InterfaceC1968c) {
                                    bundleManager.f64622d.c(ReporterService.Result.SUCCESS.ordinal(), value.getVersionCode(), 0L, "ACTIVATE", value.getName(), value.getVersionName(), "BUILT_IN", null, null, null, null);
                                }
                            }
                            f fVar = bundleManager.f64627j;
                            b.f64643a.getClass();
                            fVar.b(b.a.f64645b, bundleManager.f64625g, null);
                            long jUptimeMillis4 = SystemClock.uptimeMillis();
                            bundleManager.f64627j.c(arrayList5);
                            longRef6.element = SystemClock.uptimeMillis() - jUptimeMillis4;
                            bundleManager.f64623e.a(new BundleManager$doBoostrapInit$initMillis$1$1$5(bundleManager));
                            C2439a c2439a2 = bundleManager.f64621c;
                            c2439a2.h = c2439a2.f();
                            bundleManager.f64621c.b();
                            bundleManager.q();
                            return Unit.INSTANCE;
                        }
                    });
                    while (true) {
                        if (!zHasNext) {
                            break;
                        }
                    }
                    z7 = true;
                    strC = null;
                } finally {
                    for (InterfaceC1969d interfaceC1969d : this.f64632o.values()) {
                        if (interfaceC1969d instanceof InterfaceC1965A) {
                            ((InterfaceC1965A) interfaceC1969d).b(this.h);
                            aVar.e((InterfaceC1965A) interfaceC1969d);
                        }
                    }
                }
            } finally {
            }
        } catch (Exception e7) {
            Log.e("Tribe", "init failed", e7);
            strC = C1888e.c(e7);
            z7 = false;
        }
        this.f64622d.d(z7, SystemClock.uptimeMillis() - jUptimeMillis, longRef2.element, longRef.element, longRef3.element, strC);
        this.f64629l = !z7;
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final TribeVersion g() {
        return TribeVersion.f64618V2;
    }

    @Override // Ef0.InterfaceC1642a
    @Nullable
    public final BundleInfo get(@NotNull String str) {
        return this.f64632o.get(str);
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final String getReportInfo() {
        return this.f64630m;
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final ReporterService getReporterService() {
        return this.f64622d;
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final f getResources() {
        return this.f64627j;
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final Map<String, BundleInfo> h() {
        return new HashMap(this.f64632o);
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final com.bilibili.lib.tribe.core.internal.loader.a i() {
        return this.f64623e;
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    public final void j(@NotNull String str, @NotNull TribeStubProvider tribeStubProvider) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f64634q;
        Object obj = linkedHashMap.get(str);
        Object objA = obj;
        if (obj == null) {
            objA = androidx.compose.ui.text.font.x.a(linkedHashMap, str);
        }
        ((List) objA).add(tribeStubProvider);
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @Nullable
    public final InterfaceC1644c k(@NotNull String str) {
        return this.f64633p.get(str);
    }

    public final void l(x xVar) {
        this.f64632o.put(xVar.getName(), xVar);
        this.f64623e.f(xVar.getLoader());
        C2742a meta = xVar.getMeta();
        Iterator<T> it = meta.d().iterator();
        while (it.hasNext()) {
            this.f64635r.add(new n(meta.h(), (String) it.next()));
        }
    }

    public final boolean m() {
        if (this.f64629l) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                Log.w("Tribe", "Can't ensureLatest on non-main Thread");
            } else {
                C2439a c2439a = this.f64621c;
                if (c2439a.h != c2439a.f()) {
                    synchronized (this) {
                        C2439a c2439a2 = this.f64621c;
                        if (c2439a2.h != c2439a2.f()) {
                            final int i7 = 0;
                            this.f64621c.h(new Function0(i7, this, booleanRef) { // from class: Gf0.g

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final int f7074a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Object f7075b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final Object f7076c;

                                {
                                    this.f7074a = i7;
                                    this.f7075b = this;
                                    this.f7076c = booleanRef;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v0, types: [java.io.FileFilter, java.lang.Object] */
                                public final Object invoke() {
                                    ArrayList<x> arrayList;
                                    switch (this.f7074a) {
                                        case 0:
                                            final BundleManager bundleManager = (BundleManager) this.f7075b;
                                            File[] fileArrListFiles = bundleManager.f64621c.f12825f.listFiles((FileFilter) new Object());
                                            if (fileArrListFiles != null) {
                                                ArrayList arrayList2 = new ArrayList(fileArrListFiles.length);
                                                for (final File file : fileArrListFiles) {
                                                    arrayList2.add(!(bundleManager.f64632o.get(file.getName()) instanceof InterfaceC1967b) ? bundleManager.f64620b.submit(new Callable(bundleManager, file) { // from class: Gf0.i

                                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                        public final BundleManager f7077a;

                                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                        public final File f7078b;

                                                        {
                                                            this.f7077a = bundleManager;
                                                            this.f7078b = file;
                                                        }

                                                        @Override // java.util.concurrent.Callable
                                                        public final Object call() throws Throwable {
                                                            Triple tripleD;
                                                            BundleManager bundleManager2 = this.f7077a;
                                                            File file2 = this.f7078b;
                                                            try {
                                                                tripleD = bundleManager2.f64626i.d(file2, false, SetsKt.emptySet(), null);
                                                            } catch (IOException e7) {
                                                                Log.w("Tribe", "Ensure latest " + file2 + " failed.", e7);
                                                                tripleD = null;
                                                            }
                                                            x xVar = null;
                                                            if (tripleD != null) {
                                                                x xVar2 = (x) tripleD.getFirst();
                                                                xVar = null;
                                                                if (xVar2 != null) {
                                                                    bundleManager2.l(xVar2);
                                                                    xVar = xVar2;
                                                                }
                                                            }
                                                            return xVar;
                                                        }
                                                    }) : null);
                                                }
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it = arrayList2.iterator();
                                                while (true) {
                                                    arrayList = arrayList3;
                                                    if (it.hasNext()) {
                                                        Future future = (Future) it.next();
                                                        x xVar = future != null ? (x) future.get() : null;
                                                        if (xVar != null) {
                                                            arrayList3.add(xVar);
                                                        }
                                                    }
                                                }
                                            } else {
                                                arrayList = null;
                                            }
                                            C2439a c2439a3 = bundleManager.f64621c;
                                            c2439a3.h = c2439a3.f();
                                            if (arrayList != null && !arrayList.isEmpty()) {
                                                ArrayList arrayList4 = new ArrayList();
                                                for (x xVar2 : arrayList) {
                                                    String path = xVar2.a() ? xVar2.getApk().getPath() : null;
                                                    if (path != null) {
                                                        arrayList4.add(path);
                                                    }
                                                }
                                                bundleManager.f64627j.c(arrayList4);
                                                ((Ref.BooleanRef) this.f7076c).element = true;
                                            }
                                            break;
                                        case 1:
                                            ((com.bilibili.digital.card.scene.k) this.f7075b).f.a((com.bilibili.digital.card.action.a) this.f7076c);
                                            break;
                                        default:
                                            ((Function1) this.f7075b).invoke(kntr.common.ouro.codeblock.ui.o.a((kntr.common.ouro.codeblock.ui.o) this.f7076c, false, !r0.c, 3));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        } catch (IOException e7) {
            Log.w("Tribe", "Ensure latest failed.", e7);
        }
        return booleanRef.element;
    }

    @NotNull
    public final y n() {
        y yVar = this.f64628k;
        if (yVar != null) {
            return yVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hostInfo");
        return null;
    }

    @NotNull
    public final ExecutorC1884a o() {
        return new ExecutorC1884a(this.f64620b);
    }

    public final void p(Df0.b bVar, Pair pair) {
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        Object first = pair.getFirst();
        if (zBooleanValue) {
            x xVar = (x) first;
            l(xVar);
            this.f64625g.sendBroadcast(new Intent(p.a(this.f64625g.getPackageName(), ".tribe.installed")).putExtra("stub_bundle_name", xVar.getName()));
            q();
        }
        if (first instanceof IOException) {
            bVar.a((IOException) first);
            return;
        }
        BundleInfo bundleInfo = (BundleInfo) first;
        if (bundleInfo instanceof x) {
            x xVar2 = (x) bundleInfo;
            if (xVar2.a()) {
                this.f64627j.a(xVar2.getApk().getPath());
            }
        }
        bVar.b(bundleInfo);
    }

    public final void q() {
        String json;
        Map<String, BundleInfo> mapH = h();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((HashMap) mapH).entrySet()) {
            if (((BundleInfo) entry.getValue()) instanceof DynamicBundleInfo) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            json = "";
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), new z(((BundleInfo) entry2.getValue()).getVersionCode()));
            }
            json = this.f64624f.toJson(linkedHashMap2);
        }
        this.f64630m = json;
    }
}
