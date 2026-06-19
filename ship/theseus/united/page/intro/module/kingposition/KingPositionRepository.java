package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import android.graphics.drawable.Drawable;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.okretro.response.BiliApiResponse;
import com.google.gson.annotations.SerializedName;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
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
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository.class */
@StabilityInferred(parameters = 0)
public final class KingPositionRepository {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100315A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100316B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100317C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f100318D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f100319E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100320F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100321G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f100322H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f100323I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f100324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f100325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final p f100326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Drawable f100327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Drawable f100328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Drawable f100329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Boolean> f100330g = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

    @NotNull
    public final MutableSharedFlow<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow f100331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Unit> f100345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f100346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final SharedFlow<Boolean> f100347y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f100348z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository$FirstSharedData.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class FirstSharedData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("is_first")
        private final boolean f100349a;

        public FirstSharedData(boolean z6) {
            this.f100349a = z6;
        }

        public final boolean a() {
            return this.f100349a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FirstSharedData) && this.f100349a == ((FirstSharedData) obj).f100349a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f100349a);
        }

        @NotNull
        public final String toString() {
            return J1.M.a("FirstSharedData(isFirst=", ")", this.f100349a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionRepository$a.class */
    @BaseUrl("https://api.bilibili.com")
    public interface a {
        @GET("/x/share/isFirstShare")
        @Nullable
        Object isFirstShare(@Query("need_complete") @Nullable Boolean bool, @NotNull Continuation<? super BiliApiResponse<FirstSharedData>> continuation);
    }

    @Inject
    public KingPositionRepository(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @Nullable p pVar) {
        this.f100324a = coroutineScope;
        this.f100325b = componentActivity;
        this.f100326c = pVar;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.h = mutableSharedFlowMutableSharedFlow$default;
        this.f100331i = mutableSharedFlowMutableSharedFlow$default;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100332j = mutableSharedFlowMutableSharedFlow$default2;
        this.f100333k = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100334l = mutableSharedFlowMutableSharedFlow$default3;
        this.f100335m = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100336n = mutableSharedFlowMutableSharedFlow$default4;
        this.f100337o = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100338p = mutableSharedFlowMutableSharedFlow$default5;
        this.f100339q = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100340r = mutableSharedFlowMutableSharedFlow$default6;
        this.f100341s = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100342t = mutableSharedFlowMutableSharedFlow$default7;
        this.f100343u = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100344v = mutableSharedFlowMutableSharedFlow$default8;
        this.f100345w = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100346x = mutableSharedFlowMutableSharedFlow$default9;
        this.f100347y = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100348z = mutableSharedFlowMutableSharedFlow$default10;
        this.f100315A = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default10);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_LATEST, 1, (Object) null);
        this.f100316B = mutableSharedFlowMutableSharedFlow$default11;
        this.f100317C = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default11);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f100318D = MutableStateFlow;
        this.f100319E = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default12 = SharedFlowKt.MutableSharedFlow$default(0, 1, bufferOverflow, 1, (Object) null);
        this.f100320F = mutableSharedFlowMutableSharedFlow$default12;
        this.f100321G = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default12);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f100322H = MutableStateFlow2;
        this.f100323I = FlowKt.asStateFlow(MutableStateFlow2);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new KingPositionRepository$preloadData$1(this, String.valueOf(aVar.a()), null), 3, (Object) null);
    }

    @Nullable
    public final Drawable a() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f100327d;
        return (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
    }
}
