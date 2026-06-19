package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/i.class */
@StabilityInferred(parameters = 0)
public final class C6318i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f101250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C8043a f101251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f101252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f101253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f101254g;

    @Nullable
    public String h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.i$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/i$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/i$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C1048a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Throwable f101255a;

            public C1048a(@NotNull Throwable th) {
                this.f101255a = th;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.i$a$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/i$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final b f101256a;

            public b(@NotNull b bVar) {
                this.f101256a = bVar;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.i$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/i$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<o0> f101257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f101258b;

        public b(@NotNull List<o0> list, @NotNull String str) {
            this.f101257a = list;
            this.f101258b = str;
        }
    }

    @Inject
    public C6318i(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C8043a c8043a, @NotNull PageAdRepository pageAdRepository) {
        this.f101248a = coroutineScope;
        this.f101249b = str;
        this.f101250c = aVar;
        this.f101251d = c8043a;
        this.f101252e = pageAdRepository;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f101253f = mutableSharedFlowMutableSharedFlow$default;
        this.f101254g = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }
}
