package com.bilibili.ship.theseus.playlist.di.driver;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kj0.h;
import kj0.j;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/c.class */
@StabilityInferred(parameters = 0)
public final class c implements com.bilibili.ship.theseus.playlist.di.driver.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f95478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f95479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f95480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f95481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusPageErrorStateService f95482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a.F0 f95484g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.performance.a h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f95486j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.util.c f95485i = (com.bilibili.ship.theseus.playlist.util.c) ServiceGenerator.createService(com.bilibili.ship.theseus.playlist.util.c.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f95487k = StateFlowKt.MutableStateFlow(b.C0780b.f95500a);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/c$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f95488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f95490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f95491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f95492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f95493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f95494g;
        public final int h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f95495i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f95496j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final String f95497k;

        public a(long j7, int i7, @NotNull String str, long j8, boolean z6, int i8, int i9, int i10, int i11, boolean z7, @NotNull String str2) {
            this.f95488a = j7;
            this.f95489b = i7;
            this.f95490c = str;
            this.f95491d = j8;
            this.f95492e = z6;
            this.f95493f = i8;
            this.f95494g = i9;
            this.h = i10;
            this.f95495i = i11;
            this.f95496j = z7;
            this.f95497k = str2;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/c$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/c$b$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final Throwable f95498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.united.page.error.a f95499b;

            public a(@Nullable Throwable th, @NotNull com.bilibili.ship.theseus.united.page.error.a aVar) {
                this.f95498a = th;
                this.f95499b = aVar;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.c$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/c$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0780b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0780b f95500a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0780b);
            }

            public final int hashCode() {
                return -708549912;
            }

            @NotNull
            public final String toString() {
                return "Idle";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.c$b$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/c$b$c.class */
        @StabilityInferred(parameters = 0)
        public static final class C0781c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final PlaylistInfo f95501a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final List<MultiTypeMedia> f95502b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f95503c;

            public C0781c(@NotNull PlaylistInfo playlistInfo, @NotNull List<MultiTypeMedia> list, boolean z6) {
                this.f95501a = playlistInfo;
                this.f95502b = list;
                this.f95503c = z6;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/c$b$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f95504a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 26211752;
            }

            @NotNull
            public final String toString() {
                return "Loading";
            }
        }
    }

    @Inject
    public c(@NotNull Context context, @NotNull a aVar, @NotNull BiliAccounts biliAccounts, @NotNull BiliAccountInfo biliAccountInfo, @NotNull TheseusPageErrorStateService theseusPageErrorStateService, @NotNull CoroutineScope coroutineScope, @NotNull a.F0 f02, @NotNull com.bilibili.ship.theseus.united.page.performance.a aVar2) {
        this.f95478a = context;
        this.f95479b = aVar;
        this.f95480c = biliAccounts;
        this.f95481d = biliAccountInfo;
        this.f95482e = theseusPageErrorStateService;
        this.f95483f = coroutineScope;
        this.f95484g = f02;
        this.h = aVar2;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistScopeDriverImpl$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistScopeDriverImpl$2(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.playlist.di.driver.c r6, com.bilibili.ship.theseus.playlist.di.driver.c.b r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.c.b(com.bilibili.ship.theseus.playlist.di.driver.c, com.bilibili.ship.theseus.playlist.di.driver.c$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.ship.theseus.playlist.di.driver.b
    public final void a() {
        a aVar = this.f95479b;
        if (aVar.f95496j) {
            b bVar = (b) this.f95487k.getValue();
            if (bVar instanceof b.C0781c) {
                Map<String, List<h>> map = j.f122838a;
                List<MultiTypeMedia> list = ((b.C0781c) bVar).f95502b;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Ou0.a.a((MultiTypeMedia) it.next()));
                }
                j.f122838a.put(aVar.f95497k, arrayList);
            }
        }
    }

    public final void c() {
        Job jobLaunch$default;
        d(b.d.f95504a);
        Job job = this.f95486j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (this.f95479b.f95496j) {
            jobLaunch$default = BuildersKt.launch$default(this.f95483f, (CoroutineContext) null, (CoroutineStart) null, new PlaylistScopeDriverImpl$loadCachedData$1(this, null), 3, (Object) null);
        } else {
            jobLaunch$default = BuildersKt.launch$default(this.f95483f, (CoroutineContext) null, (CoroutineStart) null, new PlaylistScopeDriverImpl$requestAPI$1(this, null), 3, (Object) null);
        }
        this.f95486j = jobLaunch$default;
    }

    public final void d(b bVar) {
        this.f95487k.setValue(bVar);
    }
}
