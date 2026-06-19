package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bapis.bilibili.app.viewunite.common.CardBasicInfo;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bapis.bilibili.app.viewunite.common.RelateCardType;
import com.bilibili.adcommon.data.model.FeedExtra;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureEntryV;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.EndPageCMModel;
import com.bilibili.gripper.api.ad.biz.videodetail.endpage.RelateCardExtKt;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRelatedComponentsTransformer.class */
@StabilityInferred(parameters = 0)
public final class UGCEndPageCMRelatedComponentsTransformer implements com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f96861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UGCEndPageRelatedRecommendService f96862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f96863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f96864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f96865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96866g;

    @NotNull
    public final IActivityStateService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f96867i = StateFlowKt.MutableStateFlow(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f96868j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMRelatedComponentsTransformer$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRelatedComponentsTransformer$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCEndPageCMRelatedComponentsTransformer this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMRelatedComponentsTransformer$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/cm/UGCEndPageCMRelatedComponentsTransformer$1$1.class */
        public static final class C08281 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCEndPageCMRelatedComponentsTransformer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08281(UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer, Continuation<? super C08281> continuation) {
                super(2, continuation);
                this.this$0 = uGCEndPageCMRelatedComponentsTransformer;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08281 c08281 = new C08281(this.this$0, continuation);
                c08281.L$0 = obj;
                return c08281;
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
                if (this.this$0.f96866g.i()) {
                    this.this$0.f96867i.setValue(Boxing.boxInt(0));
                } else if (this.this$0.f96866g.h() || this.this$0.f96866g.g()) {
                    this.this$0.f96867i.setValue(Boxing.boxInt(((DimenUtilsKt.dpToPx(windowSizeClass.getMinWidthDp()) - rightPadding) - DimenUtilsKt.dpToPx(28)) / 3));
                } else if (this.this$0.f96866g.f()) {
                    this.this$0.f96867i.setValue(Boxing.boxInt(((DimenUtilsKt.dpToPx(windowSizeClass.getMinWidthDp()) - rightPadding) - DimenUtilsKt.dpToPx(68)) / 5));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCEndPageCMRelatedComponentsTransformer;
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
                UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = uGCEndPageCMRelatedComponentsTransformer.f96866g.f102939c;
                C08281 c08281 = new C08281(uGCEndPageCMRelatedComponentsTransformer, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08281, this) == coroutine_suspended) {
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
    public UGCEndPageCMRelatedComponentsTransformer(@NotNull CoroutineScope coroutineScope, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, @NotNull PageReportService pageReportService, @NotNull C8043a c8043a, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull IActivityStateService iActivityStateService) {
        this.f96860a = coroutineScope;
        this.f96861b = absFunctionWidgetService;
        this.f96862c = uGCEndPageRelatedRecommendService;
        this.f96863d = pageReportService;
        this.f96864e = c8043a;
        this.f96865f = context;
        this.f96866g = aVar;
        this.h = iActivityStateService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        this.f96868j = new a(0);
    }

    @Override // com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.a
    public final boolean a(@NotNull RelateCard relateCard, boolean z6) {
        return relateCard.getRelateCardType() == RelateCardType.CM && !z6;
    }

    @Override // com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.a
    @NotNull
    public final RunningUIComponent b(@NotNull RelateCard relateCard, int i7, @NotNull ScreenModeType screenModeType) {
        return c(new EndPageCMModel(relateCard, (EndPageCMModel.State) null, 0, 6, (DefaultConstructorMarker) null), screenModeType);
    }

    public final RunningUIComponent c(final EndPageCMModel endPageCMModel, ScreenModeType screenModeType) {
        SourceContent.AdContent adContent;
        FeedExtra extra;
        final SourceContent sourceContent = RelateCardExtKt.toSourceContent(endPageCMModel.getRelateCard());
        CardBasicInfo basicInfo = endPageCMModel.getRelateCard().getBasicInfo();
        Pair pair = TuplesKt.to(basicInfo != null ? Long.valueOf(basicInfo.getId()) : null, basicInfo != null ? basicInfo.getTitle() : null);
        final Long l7 = (Long) pair.component1();
        final String str = (String) pair.component2();
        final String strValueOf = String.valueOf(sourceContent != null ? Long.valueOf(sourceContent.getCreativeId()) : null);
        final String strValueOf2 = String.valueOf((sourceContent == null || (adContent = sourceContent.getAdContent()) == null || (extra = adContent.getExtra()) == null) ? null : Long.valueOf(extra.getSalesType()));
        ExposureEntryV exposureEntryV = new ExposureEntryV(new Function1(this, l7, str, sourceContent, strValueOf, strValueOf2, endPageCMModel) { // from class: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCEndPageCMRelatedComponentsTransformer f96884a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Long f96885b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f96886c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final SourceContent f96887d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f96888e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f96889f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final EndPageCMModel f96890g;

            {
                this.f96884a = this;
                this.f96885b = l7;
                this.f96886c = str;
                this.f96887d = sourceContent;
                this.f96888e = strValueOf;
                this.f96889f = strValueOf2;
                this.f96890g = endPageCMModel;
            }

            public final Object invoke(Object obj) {
                Flow flow = (Flow) obj;
                Flow flow2 = (Flow) GAdCoreKt.getGAdExposure().getTransformer().getAdExposeStrategyTransformer().invoke(flow);
                Long l8 = this.f96885b;
                String str2 = this.f96886c;
                SourceContent sourceContent2 = this.f96887d;
                UGCEndPageCMRelatedComponentsTransformer uGCEndPageCMRelatedComponentsTransformer = this.f96884a;
                FlowKt.launchIn(FlowKt.onEach(flow2, new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$1(l8, str2, sourceContent2, uGCEndPageCMRelatedComponentsTransformer, null)), uGCEndPageCMRelatedComponentsTransformer.f96860a);
                Flow flowOnEach = FlowKt.onEach((Flow) GAdCoreKt.getGAdExposure().getTransformer().getAdStrictExposeStrategyTransformer().invoke(flow), new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$2(l8, str2, sourceContent2, uGCEndPageCMRelatedComponentsTransformer, null));
                CoroutineScope coroutineScope = uGCEndPageCMRelatedComponentsTransformer.f96860a;
                FlowKt.launchIn(flowOnEach, coroutineScope);
                FlowKt.launchIn(FlowKt.onEach((Flow) uGCEndPageCMRelatedComponentsTransformer.f96868j.invoke(flow), new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$exposureEntryV$1$3(this.f96888e, this.f96889f, this.f96890g, uGCEndPageCMRelatedComponentsTransformer, null)), coroutineScope);
                return Unit.INSTANCE;
            }
        });
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        RunningUIComponent runningUIComponent = new RunningUIComponent(new UGCEndPageCMComponent(new UGCEndPageCMRelatedComponentsTransformer$createCMEndPageRunningUIComponent$contract$1(screenModeType, endPageCMModel, this, exposureEntryV, strValueOf, strValueOf2, objectRef)), 0, (Function1) null, 6);
        objectRef.element = runningUIComponent;
        return runningUIComponent;
    }
}
