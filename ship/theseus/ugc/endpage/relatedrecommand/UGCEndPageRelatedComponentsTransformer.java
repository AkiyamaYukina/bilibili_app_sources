package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import UD.Z1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bapis.bilibili.app.viewunite.common.RelateCardType;
import com.bilibili.app.gemini.ugc.feature.n;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j;
import com.tencent.connect.common.Constants;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedComponentsTransformer.class */
@StabilityInferred(parameters = 0)
public final class UGCEndPageRelatedComponentsTransformer implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f96795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final n f96796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f96797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f96798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8043a f96799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96800g;

    @NotNull
    public final IActivityStateService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f96801i = StateFlowKt.MutableStateFlow(0);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedComponentsTransformer$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedComponentsTransformer$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCEndPageRelatedComponentsTransformer this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedComponentsTransformer$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedComponentsTransformer$1$1.class */
        public static final class C08271 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCEndPageRelatedComponentsTransformer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08271(UGCEndPageRelatedComponentsTransformer uGCEndPageRelatedComponentsTransformer, Continuation<? super C08271> continuation) {
                super(2, continuation);
                this.this$0 = uGCEndPageRelatedComponentsTransformer;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08271 c08271 = new C08271(this.this$0, continuation);
                c08271.L$0 = obj;
                return c08271;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                WindowInset windowInset = this.this$0.h.getWindowInset();
                int rightPadding = windowInset.getRightPadding() + windowInset.getLeftPadding();
                if (this.this$0.f96800g.i()) {
                    this.this$0.f96801i.setValue(Boxing.boxInt(0));
                } else if (this.this$0.f96800g.h() || this.this$0.f96800g.g()) {
                    this.this$0.f96801i.setValue(Boxing.boxInt(((DimenUtilsKt.dpToPx(windowSizeClass.getMinWidthDp()) - rightPadding) - DimenUtilsKt.dpToPx(28)) / 3));
                } else if (com.bilibili.ship.theseus.united.page.screensize.b.a(windowSizeClass)) {
                    this.this$0.f96801i.setValue(Boxing.boxInt(((DimenUtilsKt.dpToPx(windowSizeClass.getMinWidthDp()) - rightPadding) - DimenUtilsKt.dpToPx(56)) / 5));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCEndPageRelatedComponentsTransformer uGCEndPageRelatedComponentsTransformer, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCEndPageRelatedComponentsTransformer;
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
                UGCEndPageRelatedComponentsTransformer uGCEndPageRelatedComponentsTransformer = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = uGCEndPageRelatedComponentsTransformer.f96800g.f102939c;
                C08271 c08271 = new C08271(uGCEndPageRelatedComponentsTransformer, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08271, this) == coroutine_suspended) {
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

    @Inject
    public UGCEndPageRelatedComponentsTransformer(@NotNull CoroutineScope coroutineScope, @NotNull InterfaceC7008a interfaceC7008a, @Nullable n nVar, @NotNull PlayerContainer playerContainer, @NotNull C7893a c7893a, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull IActivityStateService iActivityStateService) {
        this.f96794a = coroutineScope;
        this.f96795b = interfaceC7008a;
        this.f96796c = nVar;
        this.f96797d = playerContainer;
        this.f96798e = c7893a;
        this.f96799f = c8043a;
        this.f96800g = aVar;
        this.h = iActivityStateService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static void c(UGCEndPageRelatedComponentsTransformer uGCEndPageRelatedComponentsTransformer, o oVar, o oVar2) {
        b.a(0, oVar2, uGCEndPageRelatedComponentsTransformer.f96797d.getReporterService(), uGCEndPageRelatedComponentsTransformer.f96798e, uGCEndPageRelatedComponentsTransformer.f96799f);
        n nVar = uGCEndPageRelatedComponentsTransformer.f96796c;
        if (nVar != null) {
            nVar.u(String.valueOf(oVar.m), Constants.VIA_REPORT_TYPE_DATALINE, oVar.j, oVar.l);
        }
    }

    @Override // com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.a
    public final boolean a(@NotNull RelateCard relateCard, boolean z6) {
        return (relateCard.getRelateCardType() != RelateCardType.AV || relateCard.getAv() == null || Intrinsics.areEqual("operation", relateCard.getBasicInfo().getFrom())) ? false : true;
    }

    @Override // com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.a
    @Nullable
    public final RunningUIComponent b(@NotNull RelateCard relateCard, int i7, @NotNull ScreenModeType screenModeType) {
        RunningUIComponent runningUIComponent;
        o oVarA = C6320j.a(C6320j.c(relateCard, Long.MIN_VALUE, ""));
        if (oVarA == null) {
            return null;
        }
        if (screenModeType == ScreenModeType.THUMB) {
            runningUIComponent = new RunningUIComponent(new com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.c(oVarA, new Z1(2, this, oVarA)), 0, (Function1) null, 6);
        } else {
            runningUIComponent = new RunningUIComponent(new com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.b(oVarA, this.f96801i, new c(i7, oVarA, this)), 0, (Function1) null, 6);
        }
        return runningUIComponent;
    }
}
