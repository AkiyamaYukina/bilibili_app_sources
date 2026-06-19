package com.bilibili.ship.theseus.united.page.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.lib.projection.ProjectionService;
import com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/TheseusCastScreenRepository.class */
@StabilityInferred(parameters = 0)
public final class TheseusCastScreenRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f99125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<b> f99126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f99127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f99128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ProjectionService f99130g;

    @NotNull
    public final MutableStateFlow<ProjectionClient> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f99132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<ProjectionItemData> f99133k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/TheseusCastScreenRepository$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/TheseusCastScreenRepository$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0954a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final ProjectionItemData f99134a;

            public C0954a(@Nullable ProjectionItemData projectionItemData) {
                this.f99134a = projectionItemData;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/TheseusCastScreenRepository$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f99135a;

            public b(long j7) {
                this.f99135a = j7;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Duration.equals-impl0(this.f99135a, ((b) obj).f99135a);
            }

            public final int hashCode() {
                return Duration.hashCode-impl(this.f99135a);
            }

            @NotNull
            public final String toString() {
                return android.support.v4.media.a.a("Quit(progress=", Duration.toString-impl(this.f99135a), ")");
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/TheseusCastScreenRepository$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/TheseusCastScreenRepository$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f99136a = new Object();
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/castscreen/TheseusCastScreenRepository$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0955b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0955b f99137a = new Object();
        }
    }

    @Inject
    public TheseusCastScreenRepository(@NotNull CoroutineScope coroutineScope) {
        this.f99124a = coroutineScope;
        MutableStateFlow<b> MutableStateFlow = StateFlowKt.MutableStateFlow(b.C0955b.f99137a);
        this.f99125b = MutableStateFlow;
        this.f99126c = FlowKt.asStateFlow(MutableStateFlow);
        boolean z6 = true;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f99127d = mutableSharedFlowMutableSharedFlow$default;
        this.f99128e = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f99129f = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f99130g = (ProjectionService) BLRouter.get$default(BLRouter.INSTANCE, ProjectionService.class, (String) null, 2, (Object) null);
        this.h = StateFlowKt.MutableStateFlow((Object) null);
        ProjectionClient projectionClientA = a();
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.valueOf(projectionClientA != null ? projectionClientA.getDanmakuShow() : z6));
        this.f99131i = MutableStateFlow2;
        this.f99132j = FlowKt.asStateFlow(MutableStateFlow2);
        this.f99133k = StateFlowKt.MutableStateFlow((Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusCastScreenRepository$special$$inlined$awaitCancel$1(null, this), 3, (Object) null);
    }

    @Nullable
    public final ProjectionClient a() {
        return (ProjectionClient) this.h.getValue();
    }

    @Nullable
    public final ProjectionItemData b() {
        return (ProjectionItemData) this.f99133k.getValue();
    }

    public final boolean c() {
        return Intrinsics.areEqual((b) this.f99126c.getValue(), b.a.f99136a);
    }

    public final void d(@Nullable ProjectionItemData projectionItemData) {
        Long lValueOf = null;
        Long lValueOf2 = projectionItemData != null ? Long.valueOf(projectionItemData.f63475b) : null;
        Long lValueOf3 = projectionItemData != null ? Long.valueOf(projectionItemData.f63477d) : null;
        if (projectionItemData != null) {
            lValueOf = Long.valueOf(projectionItemData.f63478e);
        }
        StringBuilder sbA = Mj.b.a("set new casting item, avid:", lValueOf2, lValueOf3, ", cid:", ", epid:");
        sbA.append(lValueOf);
        defpackage.a.b("[theseus-united-TheseusCastScreenRepository-setCurrentCastingItem] ", sbA.toString(), "TheseusCastScreenRepository-setCurrentCastingItem");
        this.f99133k.setValue(projectionItemData);
    }

    public final void e(boolean z6) {
        this.f99131i.setValue(Boolean.valueOf(z6));
        ProjectionClient projectionClientA = a();
        if (projectionClientA != null) {
            ProjectionClient.danmakuToggle$default(projectionClientA, z6, false, 2, null);
        }
    }
}
