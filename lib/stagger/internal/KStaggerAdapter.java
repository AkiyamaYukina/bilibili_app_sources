package com.bilibili.lib.stagger.internal;

import android.content.Context;
import com.bilibili.gripper.mod.ModStaggerSource;
import com.bilibili.lib.stagger.CDNType;
import com.bilibili.lib.stagger.KeyType;
import d41.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import mf0.InterfaceC7988c;
import mf0.InterfaceC7990e;
import mf0.InterfaceC7991f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter.class */
public final class KStaggerAdapter implements InterfaceC7991f, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f64471b = o.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Object, Job> f64472c = new LinkedHashMap();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter$KMPResource.class */
    public static final class KMPResource implements InterfaceC7988c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final CoroutineScope f64473b = o.a(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final d41.g f64474a;

        public KMPResource(@NotNull d41.g gVar) {
            this.f64474a = gVar;
        }

        @Override // mf0.InterfaceC7989d
        public final boolean a() {
            return this.f64474a.k;
        }

        @Override // mf0.InterfaceC7988c
        public final void delete() {
            BuildersKt.launch$default(f64473b, Dispatchers.getDefault(), (CoroutineStart) null, new KStaggerAdapter$KMPResource$delete$1(this, null), 2, (Object) null);
        }

        @Override // mf0.InterfaceC7989d
        @NotNull
        public final String getBizType() {
            return this.f64474a.a;
        }

        @Override // mf0.InterfaceC7989d
        @Nullable
        public final String getExtra() {
            return this.f64474a.j;
        }

        @Override // mf0.InterfaceC7989d
        @Nullable
        public final String getHash() {
            return this.f64474a.d;
        }

        @Override // mf0.InterfaceC7989d
        @NotNull
        public final String getKey() {
            return this.f64474a.b;
        }

        @Override // mf0.InterfaceC7989d
        @Nullable
        public final String getPath() {
            return this.f64474a.h;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter$a.class */
    public final class a implements InterfaceC7990e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KStaggerAdapter f64475a;

        /* JADX INFO: renamed from: com.bilibili.lib.stagger.internal.KStaggerAdapter$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter$a$a.class */
        public static final /* synthetic */ class C0358a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f64476a;

            static {
                int[] iArr = new int[KeyType.values().length];
                try {
                    iArr[KeyType.TASK_ID.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[KeyType.HASH.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f64476a = iArr;
            }
        }

        public a(KStaggerAdapter kStaggerAdapter) {
            this.f64475a = kStaggerAdapter;
        }

        @Override // java.lang.Iterable
        @NotNull
        public final Iterator<InterfaceC7988c> iterator() {
            this.f64475a.getClass();
            List<d41.g> listB = d41.d.b.a.getResources().b();
            KStaggerAdapter kStaggerAdapter = this.f64475a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
            for (d41.g gVar : listB) {
                kStaggerAdapter.getClass();
                arrayList.add(new KMPResource(gVar));
            }
            return arrayList.iterator();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // mf0.InterfaceC7990e
        @Nullable
        public final InterfaceC7988c t0(@NotNull String str, @NotNull String str2, @NotNull KeyType keyType) throws NoWhenBranchMatchedException {
            KMPResource kMPResource;
            int i7 = C0358a.f64476a[keyType.ordinal()];
            if (i7 == 1) {
                this.f64475a.getClass();
                d41.g gVar = d41.d.b.a.getResources().get(str, str2);
                kMPResource = null;
                if (gVar != null) {
                    this.f64475a.getClass();
                    kMPResource = new KMPResource(gVar);
                }
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f64475a.getClass();
                d41.g gVarA = d41.d.b.a.getResources().a(str, str2);
                kMPResource = null;
                if (gVarA != null) {
                    this.f64475a.getClass();
                    kMPResource = new KMPResource(gVarA);
                }
            }
            return kMPResource;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/KStaggerAdapter$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ModStaggerSource.a f64477a;

        public b(@NotNull ModStaggerSource.a aVar) {
            this.f64477a = aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return Intrinsics.areEqual("biz", "biz") && Intrinsics.areEqual("mod", "mod") && Intrinsics.areEqual(this.f64477a, bVar.f64477a);
        }

        public final int hashCode() {
            return this.f64477a.hashCode() + 97107345;
        }

        @NotNull
        public final String toString() {
            return "SubscriptionKey(type=biz, identifier=mod, subscriber=" + this.f64477a + ")";
        }
    }

    @Override // mf0.InterfaceC7991f
    public final void e() {
        BuildersKt.launch$default(this.f64471b, Dispatchers.getDefault(), (CoroutineStart) null, new KStaggerAdapter$onManifestChanged$1(null), 2, (Object) null);
    }

    @Override // mf0.InterfaceC7991f
    public final void g(@NotNull InterfaceC7991f interfaceC7991f, @NotNull InterfaceC7991f.c cVar) {
        d41.d.b.c(new com.bilibili.lib.stagger.internal.b(cVar, cVar.f123730a, cVar.f123738j, cVar.f123739k, cVar.f123740l, cVar.f123737i));
        c.c().a(f(), C8770a.a(new StringBuilder("provide: registered bizType="), cVar.f123730a, " via KMP"), null);
    }

    @Override // com.bilibili.lib.stagger.internal.d
    @NotNull
    public final String getLogTag() {
        return "KStaggerAdapter";
    }

    @Override // mf0.InterfaceC7991f
    @NotNull
    public final InterfaceC7990e getResources() {
        return new a(this);
    }

    @Override // mf0.InterfaceC7991f
    public final void h(@NotNull Context context, @NotNull InterfaceC7991f.b bVar) {
        c.c().a(f(), "initialize: KMP mode, skip native init", null);
    }

    @Override // mf0.InterfaceC7991f
    public final void j(@NotNull ModStaggerSource.a aVar) {
        b bVar = new b(aVar);
        Job job = (Job) ((LinkedHashMap) this.f64472c).get(bVar);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f64472c.put(bVar, BuildersKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getUnconfined())), (CoroutineContext) null, (CoroutineStart) null, new KStaggerAdapter$subscribeAll$1(this, "mod", aVar, null), 3, (Object) null));
    }

    @Override // mf0.InterfaceC7991f
    @NotNull
    public final InterfaceC7991f.d k() {
        d41.i iVarD = d41.d.b.a.d();
        List<i.a> list = iVarD.a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (i.a aVar : list) {
            arrayList.add(new InterfaceC7991f.C1327f(CDNType.CDN, aVar.a, aVar.b, aVar.c));
        }
        List<i.a> list2 = iVarD.b;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (i.a aVar2 : list2) {
            arrayList2.add(new InterfaceC7991f.C1327f(CDNType.CDN, aVar2.a, aVar2.b, aVar2.c));
        }
        return new InterfaceC7991f.d(arrayList, arrayList2);
    }
}
