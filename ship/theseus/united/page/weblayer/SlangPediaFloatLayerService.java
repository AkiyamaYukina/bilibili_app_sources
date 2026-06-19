package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.provider.IUiObserveContainerStatusBehavior;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class SlangPediaFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f104154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f104155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f104156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f104157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final e f104158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104159g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f104160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f104161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f104162k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final HashMap<String, String> f104163l = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ArrayList<Pair<String, com.bilibili.ogv.infra.jsb.f>> f104164m = new ArrayList<>();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SlangPediaFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$1$1.class */
        public static final class C11571 extends SuspendLambda implements Function2<g, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final SlangPediaFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11571(SlangPediaFloatLayerService slangPediaFloatLayerService, Continuation<? super C11571> continuation) {
                super(2, continuation);
                this.this$0 = slangPediaFloatLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C11571 c11571 = new C11571(this.this$0, continuation);
                c11571.L$0 = obj;
                return c11571;
            }

            public final Object invoke(g gVar, Continuation<? super Unit> continuation) {
                return create(gVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    g gVar = (g) this.L$0;
                    SlangPediaFloatLayerService slangPediaFloatLayerService = this.this$0;
                    String str = gVar.f104252a;
                    this.label = 1;
                    slangPediaFloatLayerService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new SlangPediaFloatLayerService$showSlangPediaPanel$3(slangPediaFloatLayerService, str, gVar.f104253b, gVar.f104254c, gVar.f104255d, gVar.f104256e, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SlangPediaFloatLayerService slangPediaFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = slangPediaFloatLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SlangPediaFloatLayerService slangPediaFloatLayerService = this.this$0;
                SharedFlow<g> sharedFlow = slangPediaFloatLayerService.f104158f.f104250b;
                C11571 c11571 = new C11571(slangPediaFloatLayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c11571, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$a.class */
    public final class a implements IUiObserveContainerStatusBehavior {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlangPediaFloatLayerService f104165a;

        public a(SlangPediaFloatLayerService slangPediaFloatLayerService) {
            this.f104165a = slangPediaFloatLayerService;
        }

        @NotNull
        public final Map<String, String> getCallbackIdMap() {
            return MapsKt.toMap(this.f104165a.f104163l);
        }

        public final int getContainerStatus() {
            return this.f104165a.f104162k;
        }

        public final boolean getContainerStatusSwitch() {
            return this.f104165a.f104160i;
        }

        public final boolean isDestroyed() {
            return this.f104165a.f104161j;
        }

        public final void release() {
        }

        public final void saveCallbackIdMap(@Nullable String str, @Nullable String str2) {
            if (str == null || str2 == null) {
                return;
            }
            this.f104165a.f104163l.put(str, str2);
        }

        public final void setContainerStatusSwitch(boolean z6) {
            this.f104165a.f104160i = z6;
        }
    }

    @Inject
    public SlangPediaFloatLayerService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull PageReportService pageReportService, @NotNull e eVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar) {
        this.f104153a = coroutineScope;
        this.f104154b = componentActivity;
        this.f104155c = theseusFloatLayerService;
        this.f104156d = backActionRepository;
        this.f104157e = pageReportService;
        this.f104158f = eVar;
        this.f104159g = aVar;
        this.h = gVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static final void a(SlangPediaFloatLayerService slangPediaFloatLayerService, String str, String str2) {
        slangPediaFloatLayerService.getClass();
        PageReportService.g(slangPediaFloatLayerService.f104157e, "united.player-video-detail.h5-container.close.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("url", str), TuplesKt.to("gesture", str2)}), 4);
    }

    public final int b(WindowSizeClass windowSizeClass) {
        com.bilibili.ship.theseus.united.page.screensize.a aVar = this.f104159g;
        return aVar.f() ? 0 : aVar.i() ? MathKt.roundToInt((DimenUtilsKt.dpToPx(windowSizeClass.getMinWidthDp()) * 9) / 16.0f) : DimenUtilsKt.dpToPx(aVar.a(windowSizeClass));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull com.bilibili.ogv.infra.jsb.f r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$registerJsBridge$1
            if (r0 == 0) goto L2c
            r0 = r8
            com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$registerJsBridge$1 r0 = (com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$registerJsBridge$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2c
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L36
        L2c:
            com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$registerJsBridge$1 r0 = new com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$registerJsBridge$1
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L36:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L72
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L5c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5c:
            r0 = r8
            java.lang.Object r0 = r0.L$0
            kotlin.Pair r0 = (kotlin.Pair) r0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6e
            goto La2
        L6e:
            r7 = move-exception
            goto Lb2
        L72:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r1 = r7
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r7 = r0
            r0 = r5
            java.util.ArrayList<kotlin.Pair<java.lang.String, com.bilibili.ogv.infra.jsb.f>> r0 = r0.f104164m
            r1 = r7
            boolean r0 = r0.add(r1)
            r0 = r7
            r6 = r0
            r0 = r8
            r1 = r7
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L6e
            r0 = r7
            r6 = r0
            r0 = r8
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6e
            r0 = r7
            r6 = r0
            r0 = r8
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6e
            r1 = r10
            if (r0 != r1) goto La2
            r0 = r10
            return r0
        La2:
            r0 = r7
            r6 = r0
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6e
            r8 = r0
            r0 = r7
            r6 = r0
            r0 = r8
            r0.<init>()     // Catch: java.lang.Throwable -> L6e
            r0 = r7
            r6 = r0
            r0 = r8
            throw r0     // Catch: java.lang.Throwable -> L6e
        Lb2:
            r0 = r5
            java.util.ArrayList<kotlin.Pair<java.lang.String, com.bilibili.ogv.infra.jsb.f>> r0 = r0.f104164m
            r1 = r6
            boolean r0 = r0.remove(r1)
            r0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService.c(java.lang.String, com.bilibili.ogv.infra.jsb.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
