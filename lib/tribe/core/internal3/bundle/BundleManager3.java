package com.bilibili.lib.tribe.core.internal3.bundle;

import Df0.C1593a;
import Ef0.InterfaceC1644c;
import Ff0.C1888e;
import Ff0.ExecutorC1884a;
import G.p;
import Gf0.AbstractC1966a;
import Gf0.InterfaceC1965A;
import Gf0.InterfaceC1968c;
import Gf0.InterfaceC1969d;
import Gf0.InterfaceC1970e;
import Gf0.m;
import Gf0.n;
import Gf0.t;
import Gf0.z;
import Kf0.C2439a;
import Mf0.C2661b;
import Mf0.C2668i;
import Mf0.InterfaceC2669j;
import Nf0.C2742a;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.C4340n;
import androidx.compose.ui.text.font.x;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentManager;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.tribe.core.api.BundleInfo;
import com.bilibili.lib.tribe.core.api.DynamicBundleInfo;
import com.bilibili.lib.tribe.core.api.TribeVersion;
import com.bilibili.lib.tribe.core.internal.bundle.b;
import com.bilibili.lib.tribe.core.internal.report.ReporterService;
import com.bilibili.lib.tribe.core.internal.stub.TribeStubProvider;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleManager3;
import com.bilibili.lib.tribe.runtime.TribeApi;
import com.bilibili.studio.material.util.UtilsKt;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mall.ui.page.create3.dialog.MallOrderCouponListDialogFragment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleManager3.class */
public final class BundleManager3 implements InterfaceC2669j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ExecutorService f64658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C2439a f64659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.lib.tribe.core.internal.report.a f64660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.lib.tribe.core.internal.loader.a f64661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Gson f64662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Context f64663g;

    @NotNull
    public final Application h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final DefaultBundleProcessor f64664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final f f64665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Jf0.f f64666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f64667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public String f64668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Handler f64669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, c> f64670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Map<String, List<InterfaceC1970e>> f64671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final LinkedBlockingQueue<n> f64672q;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/BundleManager3$a.class */
    public static final class a extends TypeToken<List<? extends C2742a>> {
    }

    public BundleManager3(@NotNull ExecutorService executorService, @NotNull C2439a c2439a, @NotNull com.bilibili.lib.tribe.core.internal.report.a aVar, @NotNull com.bilibili.lib.tribe.core.internal.loader.a aVar2, @NotNull Gson gson, @NotNull Context context, @NotNull Application application) {
        this.f64658b = executorService;
        this.f64659c = c2439a;
        this.f64660d = aVar;
        this.f64661e = aVar2;
        this.f64662f = gson;
        this.f64663g = context;
        this.h = application;
        DefaultBundleProcessor defaultBundleProcessor = new DefaultBundleProcessor(this, gson);
        this.f64664i = defaultBundleProcessor;
        this.f64665j = new f(this, defaultBundleProcessor);
        boolean z6 = C1888e.f6133a;
        int i7 = Build.VERSION.SDK_INT;
        this.f64666k = i7 < 30 ? new Jf0.c(context, aVar) : new Jf0.b(context);
        this.f64668m = "";
        C2668i c2668i = new C2668i(this);
        IntentFilter intentFilter = new IntentFilter(p.a(context.getPackageName(), ".tribe.installed"));
        if (i7 < 26 && i7 < 34) {
            context.registerReceiver(c2668i, intentFilter);
        } else {
            context.registerReceiver(c2668i, intentFilter, 4);
        }
        this.f64669n = new Handler(Looper.getMainLooper());
        this.f64670o = new ConcurrentHashMap<>();
        this.f64671p = new LinkedHashMap();
        this.f64672q = new LinkedBlockingQueue<>();
    }

    @Override // Mf0.InterfaceC2669j
    public final void a(@NotNull final List<C1593a.C0017a> list) {
        synchronized (this) {
            final int i7 = 0;
            this.f64659c.h(new Function0(i7, list, this) { // from class: Mf0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f16169a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f16170b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f16171c;

                {
                    this.f16169a = i7;
                    this.f16170b = list;
                    this.f16171c = this;
                }

                public final Object invoke() {
                    switch (this.f16169a) {
                        case 0:
                            List list2 = (List) this.f16170b;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj : list2) {
                                String str = ((C1593a.C0017a) obj).f2894a;
                                Object obj2 = linkedHashMap.get(str);
                                Object objA = obj2;
                                if (obj2 == null) {
                                    objA = x.a(linkedHashMap, str);
                                }
                                ((List) objA).add(obj);
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator it = linkedHashMap.entrySet().iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                BundleManager3 bundleManager3 = (BundleManager3) this.f16171c;
                                if (!zHasNext) {
                                    if (!arrayList.isEmpty()) {
                                        C2439a c2439a = bundleManager3.f64659c;
                                        c2439a.i(c2439a.f() + 1);
                                        bundleManager3.q(arrayList);
                                    }
                                    return Unit.INSTANCE;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                String str2 = (String) entry.getKey();
                                ConcurrentHashMap<String, com.bilibili.lib.tribe.core.internal3.bundle.c> concurrentHashMap = bundleManager3.f64670o;
                                com.bilibili.lib.tribe.core.internal3.bundle.c cVar = concurrentHashMap.get(str2);
                                com.bilibili.lib.tribe.core.internal3.bundle.c dVar = cVar;
                                if (cVar == null) {
                                    dVar = new com.bilibili.lib.tribe.core.internal3.bundle.d(str2, null);
                                    com.bilibili.lib.tribe.core.internal3.bundle.c cVarPutIfAbsent = concurrentHashMap.putIfAbsent(str2, dVar);
                                    if (cVarPutIfAbsent != null) {
                                        dVar = cVarPutIfAbsent;
                                    }
                                }
                                com.bilibili.lib.tribe.core.internal3.bundle.c cVar2 = dVar;
                                Iterable<C1593a.C0017a> iterable = (Iterable) entry.getValue();
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C4340n.a(iterable, 10, 16));
                                for (C1593a.C0017a c0017a : iterable) {
                                    Pair pair = TuplesKt.to(Long.valueOf(c0017a.f2895b), c0017a.f2896c);
                                    linkedHashMap2.put(pair.getFirst(), pair.getSecond());
                                }
                                Gf0.x xVarD = cVar2.d(linkedHashMap2);
                                if (xVarD != null) {
                                    arrayList.add(xVarD);
                                }
                            }
                            break;
                        default:
                            return ((Function0) this.f16170b).invoke() + " ---- thread: " + Thread.currentThread().getName() + ((String) this.f16171c);
                    }
                }
            });
        }
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    public final void b(@NotNull final File file, @NotNull final Df0.b bVar) {
        Pair pair;
        synchronized (this) {
            if (this.f64667l) {
                pair = TuplesKt.to(new IOException("Tribe init failed, can't install " + file + UtilsKt.DOT), Boolean.FALSE);
            } else {
                try {
                    final int i7 = 0;
                    pair = (Pair) this.f64659c.h(new Function0(i7, this, file) { // from class: Mf0.f

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f16172a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f16173b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Object f16174c;

                        {
                            this.f16172a = i7;
                            this.f16173b = this;
                            this.f16174c = file;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final Object invoke() throws Throwable {
                            Object obj = this.f16173b;
                            Object obj2 = this.f16174c;
                            switch (this.f16172a) {
                                case 0:
                                    File file2 = (File) obj2;
                                    BundleManager3 bundleManager3 = (BundleManager3) obj;
                                    BundleActionExecutor.a aVarB = bundleManager3.f64664i.b(BundleActionExecutor.SourceFrom.RUNTIME_API, file2, false);
                                    String strH = aVarB.getMeta().h();
                                    ConcurrentHashMap<String, com.bilibili.lib.tribe.core.internal3.bundle.c> concurrentHashMap = bundleManager3.f64670o;
                                    com.bilibili.lib.tribe.core.internal3.bundle.c cVar = concurrentHashMap.get(strH);
                                    com.bilibili.lib.tribe.core.internal3.bundle.c dVar = cVar;
                                    if (cVar == null) {
                                        dVar = new com.bilibili.lib.tribe.core.internal3.bundle.d(strH, null);
                                        com.bilibili.lib.tribe.core.internal3.bundle.c cVarPutIfAbsent = concurrentHashMap.putIfAbsent(strH, dVar);
                                        if (cVarPutIfAbsent != null) {
                                            dVar = cVarPutIfAbsent;
                                        }
                                    }
                                    com.bilibili.lib.tribe.core.internal3.bundle.c cVar2 = dVar;
                                    Gf0.x xVarA = cVar2.a(aVarB);
                                    return xVarA != null ? TuplesKt.to(xVarA, Boolean.TRUE) : TuplesKt.to(cVar2.c(), Boolean.FALSE);
                                default:
                                    String str = (String) ((MutableState) obj2).getValue();
                                    MallOrderCouponListDialogFragment mallOrderCouponListDialogFragment = (MallOrderCouponListDialogFragment) obj;
                                    FragmentManager parentFragmentManager = mallOrderCouponListDialogFragment.getParentFragmentManager();
                                    int i8 = com.mall.logic.page.create.c.u;
                                    Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("extra_coupon_id_selected", str);
                                    Unit unit = Unit.INSTANCE;
                                    parentFragmentManager.setFragmentResult(String.valueOf(i8), bundleM);
                                    mallOrderCouponListDialogFragment.dismissAllowingStateLoss();
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
                this.f64669n.post(new Runnable(this, bVar, pair2) { // from class: Mf0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BundleManager3 f16175a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Df0.b f16176b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final Pair f16177c;

                    {
                        this.f16175a = this;
                        this.f16176b = bVar;
                        this.f16177c = pair2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f16175a.p(this.f16176b, this.f16177c);
                    }
                });
            }
        }
    }

    @Override // Ef0.InterfaceC1642a
    public final void c(@NotNull TribeVersion tribeVersion) {
        if (tribeVersion != TribeVersion.NONE) {
            this.f64659c.j(tribeVersion == TribeVersion.f64619V3);
        }
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final Map<String, InterfaceC1644c> d() {
        ConcurrentHashMap<String, c> concurrentHashMap = this.f64670o;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, c> entry : concurrentHashMap.entrySet()) {
            BundleActionExecutor.a aVar = (BundleActionExecutor.a) CollectionsKt.firstOrNull(entry.getValue().b());
            Pair pair = aVar != null ? TuplesKt.to(entry.getKey(), new t(m.b(aVar.a()), aVar.getMeta().k(), entry.getKey())) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final ClassLoader e() {
        return this.f64661e.b();
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
            InputStream inputStreamOpen = this.f64663g.getAssets().open("tribe/bundles.json");
            try {
                Iterable iterable = (Iterable) this.f64662f.fromJson(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), new a().getType());
                final LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                for (Object obj : iterable) {
                    String strH = ((C2742a) obj).h();
                    C2742a c2742a = (C2742a) obj;
                    AbstractC1966a abstractC1966a = (!Intrinsics.areEqual(c2742a.h(), "host") && c2742a.b()) ? new AbstractC1966a(c2742a) : new AbstractC1966a(c2742a);
                    linkedHashMap.put(strH, abstractC1966a);
                }
                CloseableKt.closeFinally(inputStreamOpen, (Throwable) null);
                if (((AbstractC1966a) linkedHashMap.get("host")) == null) {
                    throw new IllegalStateException("No host info");
                }
                com.bilibili.lib.tribe.core.internal.loader.a aVar = this.f64661e;
                if (!z6) {
                    Context baseContext = this.f64663g;
                    ClassLoader classLoaderB = aVar.b();
                    while (baseContext instanceof ContextWrapper) {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                    Field declaredField = baseContext.getClass().getDeclaredField("mPackageInfo");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(baseContext);
                    Field declaredField2 = obj2.getClass().getDeclaredField("mClassLoader");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj2, classLoaderB);
                }
                try {
                    this.f64659c.h(new Function0(this, longRef2, longRef, longRef3, linkedHashMap) { // from class: com.bilibili.lib.tribe.core.internal3.bundle.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final BundleManager3 f64676a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Ref.LongRef f64677b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Ref.LongRef f64678c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final Ref.LongRef f64679d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final Map f64680e;

                        {
                            this.f64676a = this;
                            this.f64677b = longRef2;
                            this.f64678c = longRef;
                            this.f64679d = longRef3;
                            this.f64680e = linkedHashMap;
                        }

                        public final Object invoke() throws InterruptedException, IOException {
                            BundleManager3 bundleManager3 = this.f64676a;
                            Ref.LongRef longRef4 = this.f64677b;
                            Ref.LongRef longRef5 = this.f64678c;
                            Ref.LongRef longRef6 = this.f64679d;
                            Map map = this.f64680e;
                            bundleManager3.f64659c.g();
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            f fVar = bundleManager3.f64665j;
                            File file = bundleManager3.f64659c.f12822c;
                            ExecutorC1884a executorC1884aN = fVar.f64690a.n();
                            ArrayList arrayList = new ArrayList();
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            File[] fileArrListFiles = file.listFiles();
                            if (fileArrListFiles != null) {
                                for (File file2 : fileArrListFiles) {
                                    if (file2.isFile()) {
                                        arrayList.add(file2.getName());
                                        executorC1884aN.execute(new Runnable(fVar, file2, concurrentHashMap) { // from class: Mf0.l

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final com.bilibili.lib.tribe.core.internal3.bundle.f f16187a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final File f16188b;

                                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                                            public final ConcurrentHashMap f16189c;

                                            {
                                                this.f16187a = fVar;
                                                this.f16188b = file2;
                                                this.f16189c = concurrentHashMap;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                com.bilibili.lib.tribe.core.internal3.bundle.f fVar2 = this.f16187a;
                                                File file3 = this.f16188b;
                                                ConcurrentHashMap concurrentHashMap2 = this.f16189c;
                                                try {
                                                    try {
                                                        fVar2.f64691b.b(BundleActionExecutor.SourceFrom.STASH_DIR, file3, true);
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
                            executorC1884aN.a(TribeApi.bundleLoadTimeoutEnable ? 15000L : 0L);
                            if (TribeApi.bundleLoadTimeoutEnable) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : arrayList) {
                                    if (!concurrentHashMap.containsKey((String) obj3)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                                if (!arrayList2.isEmpty()) {
                                    Log.e("Tribe", "Bundle install timeout (15000ms), failed bundles: " + arrayList2);
                                    fVar.f64690a.f64660d.f(arrayList.size(), "INSTALL", arrayList2);
                                }
                            }
                            longRef4.element = SystemClock.uptimeMillis() - jUptimeMillis2;
                            long jUptimeMillis3 = SystemClock.uptimeMillis();
                            f fVar2 = bundleManager3.f64665j;
                            boolean zC = bundleManager3.f64659c.c();
                            File file3 = bundleManager3.f64659c.f12825f;
                            LinkedHashMap linkedHashMap2 = (LinkedHashMap) map;
                            InterfaceC1969d interfaceC1969d = (InterfaceC1969d) linkedHashMap2.get("host");
                            if (interfaceC1969d == null) {
                                throw new IllegalStateException("No Host.");
                            }
                            boolean z8 = fVar2.f64690a.f64659c.e() != interfaceC1969d.getVersionCode();
                            boolean z9 = z8 || zC;
                            File[] fileArrListFiles2 = file3.listFiles();
                            if (fileArrListFiles2 == null) {
                                throw new IOException(SW.a.b(file3, "Directory '", "' is illegal."));
                            }
                            ExecutorC1884a executorC1884aN2 = fVar2.f64690a.n();
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                            ArrayList arrayList3 = new ArrayList();
                            for (File file4 : fileArrListFiles2) {
                                if (file4.isDirectory()) {
                                    arrayList3.add(file4.getName());
                                    executorC1884aN2.execute(new Runnable(fVar2, map, file4, z9, concurrentHashMap2) { // from class: Mf0.k

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final com.bilibili.lib.tribe.core.internal3.bundle.f f16182a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final Map f16183b;

                                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                                        public final File f16184c;

                                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                                        public final boolean f16185d;

                                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                                        public final ConcurrentHashMap f16186e;

                                        {
                                            this.f16182a = fVar2;
                                            this.f16183b = map;
                                            this.f16184c = file4;
                                            this.f16185d = z9;
                                            this.f16186e = concurrentHashMap2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.bilibili.lib.tribe.core.internal3.bundle.f fVar3 = this.f16182a;
                                            Map map2 = this.f16183b;
                                            File file5 = this.f16184c;
                                            boolean z10 = this.f16185d;
                                            ConcurrentHashMap concurrentHashMap3 = this.f16186e;
                                            com.bilibili.lib.tribe.core.internal3.bundle.d dVarA = fVar3.a((InterfaceC1969d) ((LinkedHashMap) map2).get(file5.getName()), file5, z10);
                                            concurrentHashMap3.put(dVarA.f64681a, dVarA);
                                        }
                                    });
                                } else {
                                    file4.delete();
                                }
                            }
                            executorC1884aN2.a(TribeApi.bundleLoadTimeoutEnable ? 15000L : 0L);
                            if (TribeApi.bundleLoadTimeoutEnable) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : arrayList3) {
                                    if (!concurrentHashMap2.containsKey((String) obj4)) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                concurrentHashMap2 = concurrentHashMap2;
                                if (!arrayList4.isEmpty()) {
                                    Log.e("Tribe", "Bundle load timeout (15000ms), failed bundles: " + arrayList4);
                                    fVar2.f64690a.f64660d.f(arrayList3.size(), "LOAD", arrayList4);
                                    concurrentHashMap2 = concurrentHashMap2;
                                }
                            }
                            for (InterfaceC1969d interfaceC1969d2 : linkedHashMap2.values()) {
                                concurrentHashMap2.putIfAbsent(interfaceC1969d2.getName(), new d(interfaceC1969d2.getName(), interfaceC1969d2));
                            }
                            if (z8) {
                                fVar2.f64690a.f64659c.f12824e.putLong("built_in_installed", interfaceC1969d.getVersionCode());
                            }
                            Iterator it = concurrentHashMap2.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                c cVar = (c) ((Map.Entry) it.next()).getValue();
                                bundleManager3.f64670o.put(cVar.getName(), cVar);
                                InterfaceC1969d interfaceC1969dC = cVar.c();
                                Gf0.x xVar = interfaceC1969dC instanceof Gf0.x ? (Gf0.x) interfaceC1969dC : null;
                                if (xVar != null) {
                                    bundleManager3.l(xVar);
                                }
                            }
                            longRef5.element = SystemClock.uptimeMillis() - jUptimeMillis3;
                            ArrayList arrayList5 = new ArrayList();
                            Iterator<Map.Entry<String, c>> it2 = bundleManager3.f64670o.entrySet().iterator();
                            while (it2.hasNext()) {
                                InterfaceC1969d interfaceC1969dC2 = it2.next().getValue().c();
                                if (interfaceC1969dC2 != null) {
                                    if (interfaceC1969dC2 instanceof Gf0.x) {
                                        Gf0.x xVar2 = (Gf0.x) interfaceC1969dC2;
                                        if (xVar2.a()) {
                                            arrayList5.add(xVar2.getApk().getPath());
                                        }
                                    } else if (interfaceC1969dC2 instanceof InterfaceC1968c) {
                                        bundleManager3.f64660d.c(ReporterService.Result.SUCCESS.ordinal(), interfaceC1969dC2.getVersionCode(), 0L, "ACTIVATE", interfaceC1969dC2.getName(), interfaceC1969dC2.getVersionName(), "BUILT_IN", null, null, null, null);
                                    }
                                }
                            }
                            Jf0.f fVar3 = bundleManager3.f64666k;
                            com.bilibili.lib.tribe.core.internal.bundle.b.f64643a.getClass();
                            fVar3.b(b.a.f64645b, bundleManager3.f64663g, null);
                            long jUptimeMillis4 = SystemClock.uptimeMillis();
                            bundleManager3.f64666k.c(arrayList5);
                            longRef6.element = SystemClock.uptimeMillis() - jUptimeMillis4;
                            bundleManager3.f64661e.a(new BundleManager3$doBoostrapInit$initMillis$1$1$5(bundleManager3));
                            C2439a c2439a = bundleManager3.f64659c;
                            c2439a.h = c2439a.f();
                            bundleManager3.f64659c.b();
                            bundleManager3.r();
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
                    Iterator<T> it = this.f64670o.values().iterator();
                    while (it.hasNext()) {
                        InterfaceC1969d interfaceC1969dC = ((c) it.next()).c();
                        if (interfaceC1969dC != null && (interfaceC1969dC instanceof InterfaceC1965A)) {
                            ((InterfaceC1965A) interfaceC1969dC).b(this.h);
                            aVar.e((InterfaceC1965A) interfaceC1969dC);
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
        this.f64660d.d(z7, SystemClock.uptimeMillis() - jUptimeMillis, longRef2.element, longRef.element, longRef3.element, strC);
        this.f64667l = !z7;
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final TribeVersion g() {
        return TribeVersion.f64619V3;
    }

    @Override // Ef0.InterfaceC1642a
    @Nullable
    public final BundleInfo get(@NotNull String str) {
        c cVar = this.f64670o.get(str);
        return cVar != null ? cVar.c() : null;
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final String getReportInfo() {
        return this.f64668m;
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final ReporterService getReporterService() {
        return this.f64660d;
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final Jf0.f getResources() {
        return this.f64666k;
    }

    @Override // Ef0.InterfaceC1642a
    @NotNull
    public final Map<String, BundleInfo> h() {
        ConcurrentHashMap<String, c> concurrentHashMap = this.f64670o;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, c> entry : concurrentHashMap.entrySet()) {
            InterfaceC1969d interfaceC1969dC = entry.getValue().c();
            Pair pair = interfaceC1969dC != null ? TuplesKt.to(entry.getKey(), interfaceC1969dC) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @NotNull
    public final com.bilibili.lib.tribe.core.internal.loader.a i() {
        return this.f64661e;
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    public final void j(@NotNull String str, @NotNull TribeStubProvider tribeStubProvider) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f64671p;
        Object obj = linkedHashMap.get(str);
        Object objA = obj;
        if (obj == null) {
            objA = x.a(linkedHashMap, str);
        }
        ((List) objA).add(tribeStubProvider);
    }

    @Override // com.bilibili.lib.tribe.core.internal.bundle.b
    @Nullable
    public final InterfaceC1644c k(@NotNull String str) {
        List<BundleActionExecutor.a> listB;
        BundleActionExecutor.a aVar;
        c cVar = this.f64670o.get(str);
        return (cVar == null || (listB = cVar.b()) == null || (aVar = (BundleActionExecutor.a) CollectionsKt.firstOrNull(listB)) == null) ? null : new t(m.b(aVar.a()), aVar.getMeta().k(), str);
    }

    public final void l(Gf0.x xVar) {
        this.f64661e.f(xVar.getLoader());
        C2742a meta = xVar.getMeta();
        Iterator<T> it = meta.d().iterator();
        while (it.hasNext()) {
            this.f64672q.add(new n(meta.h(), (String) it.next()));
        }
    }

    public final boolean m() {
        if (this.f64667l) {
            return false;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                Log.w("Tribe", "Can't ensureLatest on non-main Thread");
            } else {
                C2439a c2439a = this.f64659c;
                if (c2439a.h != c2439a.f()) {
                    synchronized (this) {
                        C2439a c2439a2 = this.f64659c;
                        if (c2439a2.h != c2439a2.f()) {
                            this.f64659c.h(new C2661b(0, this, booleanRef));
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
    public final ExecutorC1884a n() {
        return new ExecutorC1884a(this.f64658b);
    }

    public final void o(@NotNull String str) {
        this.f64663g.sendBroadcast(new Intent(p.a(this.f64663g.getPackageName(), ".tribe.installed")).putExtra("stub_bundle_name", str));
    }

    public final void p(Df0.b bVar, Pair pair) {
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        Object first = pair.getFirst();
        if (zBooleanValue) {
            Gf0.x xVar = (Gf0.x) first;
            l(xVar);
            o(xVar.getName());
            r();
        }
        if (first instanceof IOException) {
            bVar.a((IOException) first);
            return;
        }
        BundleInfo bundleInfo = (BundleInfo) first;
        if (bundleInfo instanceof Gf0.x) {
            Gf0.x xVar2 = (Gf0.x) bundleInfo;
            if (xVar2.a()) {
                this.f64666k.a(xVar2.getApk().getPath());
            }
        }
        bVar.b(bundleInfo);
    }

    public final void q(final List<? extends Gf0.x> list) {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            final int i7 = 0;
            this.f64669n.post(new Runnable(i7, this, list) { // from class: Mf0.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f16178a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f16179b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Object f16180c;

                {
                    this.f16178a = i7;
                    this.f16179b = this;
                    this.f16180c = list;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f16178a) {
                        case 0:
                            ((BundleManager3) this.f16179b).q((List) this.f16180c);
                            break;
                        default:
                            ((MossResponseHandler) this.f16179b).onError((MossException) this.f16180c);
                            break;
                    }
                }
            });
            return;
        }
        for (Gf0.x xVar : list) {
            l(xVar);
            o(xVar.getName());
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Gf0.x) it.next()).getApk().getPath());
        }
        this.f64666k.c(arrayList);
        r();
    }

    public final void r() {
        String json;
        Map<String, BundleInfo> mapH = h();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, BundleInfo> entry : mapH.entrySet()) {
            if (entry.getValue() instanceof DynamicBundleInfo) {
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
            json = this.f64662f.toJson(linkedHashMap2);
        }
        this.f64668m = json;
    }
}
