package com.bilibili.ship.theseus.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import ev0.j;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/c.class */
@StabilityInferred(parameters = 0)
public final class c implements ev0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.sail.immatureplay.e f90874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a.E1 f90875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a.i0 f90876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a.A f90877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PreloadRepository f90878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f90879g;

    @NotNull
    public final MutableStateFlow<a> h = StateFlowKt.MutableStateFlow(a.C0671a.f90882a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f90880i = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f90881j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/c$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/c$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0671a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0671a f90882a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/c$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BusinessType f90883a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.united.player.mediaplay.d f90884b;

            public b(@NotNull BusinessType businessType, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.d dVar) {
                this.f90883a = businessType;
                this.f90884b = dVar;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/c$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class C0672c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0672c f90885a = new Object();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/c$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f90886a;

        static {
            int[] iArr = new int[BizType.values().length];
            try {
                iArr[BizType.BIZ_TYPE_UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BizType.BIZ_TYPE_PGC.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BizType.BIZ_TYPE_PUGV.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f90886a = iArr;
        }
    }

    @Inject
    public c(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.sail.immatureplay.e eVar, @NotNull a.E1 e12, @NotNull a.i0 i0Var, @NotNull a.A a7, @NotNull PreloadRepository preloadRepository, @NotNull C8043a c8043a) {
        this.f90873a = coroutineScope;
        this.f90874b = eVar;
        this.f90875c = e12;
        this.f90876d = i0Var;
        this.f90877e = a7;
        this.f90878f = preloadRepository;
        this.f90879g = c8043a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new MediaScopeDriverImpl$1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.detail.c r5, ev0.InterfaceC7008a.C1258a r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.c.a(com.bilibili.ship.theseus.detail.c, ev0.a$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ev0.j
    public final void f() {
        Job job = this.f90881j;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f90881j = null;
        this.h.setValue(a.C0671a.f90882a);
    }

    @Override // ev0.j
    public final void g(@NotNull j.a aVar) {
        this.h.setValue(new a.b(aVar.f117661e, new com.bilibili.ship.theseus.united.player.mediaplay.d(aVar)));
    }
}
