package com.bilibili.playerbizcommonv2.widget.subtitle;

import F3.I1;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.app.NotificationCompat;
import com.bapis.bilibili.community.service.dm.v1.VideoSubtitle;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.media.resource.Badge;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget;
import com.bilibili.playerbizcommonv2.widget.subtitle.q0;
import com.bilibili.playerbizcommonv2.widget.subtitle.z0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.router.PlayerRouteUris;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IControlWidget;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget.class */
@StabilityInferred(parameters = 0)
public final class SubtitleAndAiWidget extends Zq0.d implements IControlWidget {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f83581u = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final TextView f83582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ComposeView f83583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f83584g;

    @NotNull
    public q0 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f83585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f83586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Inject
    public IControlContainerService f83587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Inject
    public IInteractLayerService f83588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Inject
    public IReporterService f83589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Inject
    public AbsFunctionWidgetService f83590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Inject
    public IPlayerSettingService f83591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Inject
    public IToastService f83592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Inject
    public com.bilibili.playerbizcommonv2.service.ai.a f83593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Inject
    public IPlayDirector f83594r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f83595s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f83596t;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        Object result;
        final SubtitleAndAiWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = subtitleAndAiWidget;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(this);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
        private Object L$0;
        int label;
        final SubtitleAndAiWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Flow<Boolean> $aiOnlyFlow;
            final Flow<Boolean> $shouldMergeAiAndSubtitleFlow;
            final Flow<Boolean> $subtitleOnlyFlow;
            int label;
            final SubtitleAndAiWidget this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$1$1.class */
            public static final class C05591 extends SuspendLambda implements Function4<Boolean, Boolean, Boolean, Continuation<? super q0>, Object> {
                boolean Z$0;
                boolean Z$1;
                boolean Z$2;
                int label;
                final SubtitleAndAiWidget this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05591(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super C05591> continuation) {
                    super(4, continuation);
                    this.this$0 = subtitleAndAiWidget;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (Continuation<? super q0>) obj4);
                }

                public final Object invoke(boolean z6, boolean z7, boolean z8, Continuation<? super q0> continuation) {
                    C05591 c05591 = new C05591(this.this$0, continuation);
                    c05591.Z$0 = z6;
                    c05591.Z$1 = z7;
                    c05591.Z$2 = z8;
                    return c05591.invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object dVar;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean z6 = this.Z$0;
                    boolean z7 = this.Z$1;
                    boolean z8 = this.Z$2;
                    if (z6) {
                        dVar = q0.a.f83765a;
                    } else if (z7) {
                        dVar = q0.b.f83766a;
                    } else if (z8) {
                        L0 l0Y = this.this$0.getAiService().Y();
                        boolean zA = l0Y != null ? l0Y.a() : false;
                        L0 l0Y2 = this.this$0.getAiService().Y();
                        dVar = new q0.d(new z0.b(zA, l0Y2 != null ? l0Y2.c(this.this$0.getAiService().e0()) : ""));
                    } else {
                        dVar = q0.c.f83767a;
                    }
                    return dVar;
                }
            }

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$1$2.class */
            public static final class C05602 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {
                Object L$0;
                int label;
                final SubtitleAndAiWidget this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05602(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super C05602> continuation) {
                    super(2, continuation);
                    this.this$0 = subtitleAndAiWidget;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05602 c05602 = new C05602(this.this$0, continuation);
                    c05602.L$0 = obj;
                    return c05602;
                }

                public final Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
                    return create(q0Var, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        q0 q0Var = (q0) this.L$0;
                        SubtitleAndAiWidget subtitleAndAiWidget = this.this$0;
                        subtitleAndAiWidget.h = q0Var;
                        subtitleAndAiWidget.setVisibility(!Intrinsics.areEqual(q0Var, q0.c.f83767a) ? 0 : 8);
                        SubtitleAndAiWidget.k0(this.this$0);
                        if (this.this$0.getVisibility() == 0) {
                            SubtitleAndAiWidget subtitleAndAiWidget2 = this.this$0;
                            this.label = 1;
                            if (SubtitleAndAiWidget.j0(subtitleAndAiWidget2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public AnonymousClass1(Flow<Boolean> flow, Flow<Boolean> flow2, Flow<Boolean> flow3, SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$shouldMergeAiAndSubtitleFlow = flow;
                this.$aiOnlyFlow = flow2;
                this.$subtitleOnlyFlow = flow3;
                this.this$0 = subtitleAndAiWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$shouldMergeAiAndSubtitleFlow, this.$aiOnlyFlow, this.$subtitleOnlyFlow, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.$shouldMergeAiAndSubtitleFlow, this.$aiOnlyFlow, this.$subtitleOnlyFlow, new C05591(this.this$0, null)));
                    C05602 c05602 = new C05602(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c05602, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$2.class */
        public static final class C05612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final SubtitleAndAiWidget this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<LanguageItem, Continuation<? super Unit>, Object> {
                int label;
                final SubtitleAndAiWidget this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = subtitleAndAiWidget;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                public final Object invoke(LanguageItem languageItem, Continuation<? super Unit> continuation) {
                    return create(languageItem, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(this.this$0.h, q0.b.f83766a) || Intrinsics.areEqual(this.this$0.h, q0.a.f83765a)) {
                        SubtitleAndAiWidget.k0(this.this$0);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05612(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super C05612> continuation) {
                super(2, continuation);
                this.this$0 = subtitleAndAiWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05612(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow mutableStateFlowB0 = this.this$0.getAiService().b0();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlowB0, anonymousClass1, this) == coroutine_suspended) {
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
        public AnonymousClass2(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = subtitleAndAiWidget;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final void invokeSuspend$lambda$0(final SubtitleAndAiWidget subtitleAndAiWidget, View view) throws NoWhenBranchMatchedException {
            if (subtitleAndAiWidget.getVisibility() == 0) {
                int i7 = SubtitleAndAiWidget.f83581u;
                subtitleAndAiWidget.getReporterService().report(new NeuronsEvents.b("player.player.translation-subtitles-button.click.player", subtitleAndAiWidget.l0()));
                subtitleAndAiWidget.getControlContainerService().hide();
                q0 q0Var = subtitleAndAiWidget.h;
                if (q0Var instanceof q0.d) {
                    VideoSubtitle subtitleData = subtitleAndAiWidget.getInteractLayerService().getSubtitleData();
                    String str = subtitleAndAiWidget.getInteractLayerService().getMainSubtitle() != null ? "1" : "0";
                    boolean zA = false;
                    boolean z6 = subtitleData != null && subtitleData.getSubtitlesList().size() > 0;
                    subtitleAndAiWidget.getControlContainerService().hide();
                    if (z6) {
                        ScreenModeType screenModeType = subtitleAndAiWidget.getControlContainerService().getScreenModeType();
                        AbsFunctionWidgetService functionWidgetService = subtitleAndAiWidget.getFunctionWidgetService();
                        L0 l0Y = subtitleAndAiWidget.getAiService().Y();
                        if (l0Y != null) {
                            zA = l0Y.a();
                        }
                        L0 l0Y2 = subtitleAndAiWidget.getAiService().Y();
                        z0.a(screenModeType, functionWidgetService, new q0.d(new z0.b(zA, l0Y2 != null ? l0Y2.c(subtitleAndAiWidget.getAiService().e0()) : "")), null);
                    } else {
                        subtitleAndAiWidget.getToastService().showToast(new PlayerToast.Builder().toastItemType(17).location(32).setExtraString("extra_title", subtitleAndAiWidget.getContext().getString(2131847481)).duration(2000L).build());
                    }
                    subtitleAndAiWidget.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.subtitle-button.click.player", new String[]{NotificationCompat.CATEGORY_STATUS, str}));
                    return;
                }
                q0.b bVar = q0.b.f83766a;
                if (Intrinsics.areEqual(q0Var, bVar)) {
                    subtitleAndAiWidget.getReporterService().report(new NeuronsEvents.b("player.player.aidub-button.click.player", (Map) null));
                    final Languages languagesE0 = subtitleAndAiWidget.getAiService().e0();
                    if (languagesE0 == null) {
                        return;
                    }
                    z0.a(subtitleAndAiWidget.getControlContainerService().getScreenModeType(), subtitleAndAiWidget.getFunctionWidgetService(), bVar, new z0.a(languagesE0.j(), languagesE0.i(), languagesE0.h(), subtitleAndAiWidget.getAiService().n0(), subtitleAndAiWidget.getContext().getString(2131846814), new Function2(subtitleAndAiWidget, languagesE0) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.C0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final SubtitleAndAiWidget f83464a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Languages f83465b;

                        {
                            this.f83464a = subtitleAndAiWidget;
                            this.f83465b = languagesE0;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            Unit unit;
                            ((Integer) obj).intValue();
                            LanguageItem languageItem = (LanguageItem) obj2;
                            int i8 = SubtitleAndAiWidget.f83581u;
                            SubtitleAndAiWidget subtitleAndAiWidget2 = this.f83464a;
                            if (sb0.b.b(subtitleAndAiWidget2.getAiService().n0(), languageItem)) {
                                unit = Unit.INSTANCE;
                            } else {
                                Application application = BiliContext.application();
                                Context applicationContext = application != null ? application.getApplicationContext() : null;
                                if (applicationContext == null || BiliAccounts.get(applicationContext).isLogin()) {
                                    com.bilibili.playerbizcommonv2.utils.p.i(this.f83465b.m(), subtitleAndAiWidget2.getControlContainerService().getScreenModeType(), subtitleAndAiWidget2.getToastService());
                                    subtitleAndAiWidget2.getAiService().o0(languageItem);
                                    subtitleAndAiWidget2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.aidubswitch-option.option-click.player", new String[]{"option", languageItem.getTitle(), "perfer_type", sb0.b.a(languageItem)}));
                                    unit = Unit.INSTANCE;
                                } else {
                                    PlayerRouteUris.Routers.login$default(PlayerRouteUris.Routers.INSTANCE, applicationContext, 1024, (String) null, 4, (Object) null);
                                    unit = Unit.INSTANCE;
                                }
                            }
                            return unit;
                        }
                    }, new Function1(subtitleAndAiWidget, languagesE0) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.D0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final SubtitleAndAiWidget f83466a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Languages f83467b;

                        {
                            this.f83466a = subtitleAndAiWidget;
                            this.f83467b = languagesE0;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r10) {
                            /*
                                r9 = this;
                                r0 = r10
                                java.lang.Integer r0 = (java.lang.Integer) r0
                                int r0 = r0.intValue()
                                int r0 = com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget.f83581u
                                r11 = r0
                                r0 = r9
                                com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget r0 = r0.f83466a
                                r10 = r0
                                r0 = r10
                                com.bilibili.playerbizcommonv2.service.ai.a r0 = r0.getAiService()
                                com.bilibili.lib.media.resource.LanguageItem r0 = r0.n0()
                                if (r0 != 0) goto L24
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                r10 = r0
                                goto L83
                            L24:
                                r0 = r9
                                com.bilibili.lib.media.resource.Languages r0 = r0.f83467b
                                java.lang.String r0 = r0.c()
                                r1 = r10
                                tv.danmaku.biliplayerv2.service.IControlContainerService r1 = r1.getControlContainerService()
                                tv.danmaku.biliplayerv2.ScreenModeType r1 = r1.getScreenModeType()
                                r2 = r10
                                tv.danmaku.biliplayerv2.service.IToastService r2 = r2.getToastService()
                                com.bilibili.playerbizcommonv2.utils.p.i(r0, r1, r2)
                                r0 = r10
                                com.bilibili.playerbizcommonv2.service.ai.a r0 = r0.getAiService()
                                r0.N()
                                r0 = r10
                                tv.danmaku.biliplayerv2.service.report.IReporterService r0 = r0.getReporterService()
                                r13 = r0
                                android.app.Application r0 = com.bilibili.base.BiliContext.application()
                                r10 = r0
                                r0 = r10
                                if (r0 == 0) goto L5f
                                r0 = r10
                                r1 = 2131841685(0x7f115295, float:1.9316685E38)
                                java.lang.String r0 = r0.getString(r1)
                                r12 = r0
                                r0 = r12
                                r10 = r0
                                r0 = r12
                                if (r0 != 0) goto L62
                            L5f:
                                java.lang.String r0 = ""
                                r10 = r0
                            L62:
                                r0 = r13
                                tv.danmaku.biliplayerv2.service.report.NeuronsEvents$NormalEvent r1 = new tv.danmaku.biliplayerv2.service.report.NeuronsEvents$NormalEvent
                                r2 = r1
                                java.lang.String r3 = "player.player.aidubswitch-option.option-click.player"
                                r4 = 2
                                java.lang.String[] r4 = new java.lang.String[r4]
                                r5 = r4
                                r6 = 0
                                java.lang.String r7 = "option"
                                r5[r6] = r7
                                r5 = r4
                                r6 = 1
                                r7 = r10
                                r5[r6] = r7
                                r2.<init>(r3, r4)
                                r0.report(r1)
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                r10 = r0
                            L83:
                                r0 = r10
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.D0.invoke(java.lang.Object):java.lang.Object");
                        }
                    }));
                    subtitleAndAiWidget.getControlContainerService().hide();
                    return;
                }
                q0.a aVar = q0.a.f83765a;
                if (!Intrinsics.areEqual(q0Var, aVar)) {
                    if (!Intrinsics.areEqual(q0Var, q0.c.f83767a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                final Languages languagesE02 = subtitleAndAiWidget.getAiService().e0();
                if (languagesE02 == null) {
                    return;
                }
                z0.a(subtitleAndAiWidget.getControlContainerService().getScreenModeType(), subtitleAndAiWidget.getFunctionWidgetService(), aVar, new z0.a(languagesE02.j(), languagesE02.i(), languagesE02.h(), subtitleAndAiWidget.getAiService().n0(), subtitleAndAiWidget.getContext().getString(2131846814), new Function2(subtitleAndAiWidget, languagesE02) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.B0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SubtitleAndAiWidget f83457a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Languages f83458b;

                    {
                        this.f83457a = subtitleAndAiWidget;
                        this.f83458b = languagesE02;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Unit unit;
                        ((Integer) obj).intValue();
                        LanguageItem languageItem = (LanguageItem) obj2;
                        int i8 = SubtitleAndAiWidget.f83581u;
                        SubtitleAndAiWidget subtitleAndAiWidget2 = this.f83457a;
                        if (sb0.b.b(subtitleAndAiWidget2.getAiService().n0(), languageItem)) {
                            unit = Unit.INSTANCE;
                        } else {
                            Application application = BiliContext.application();
                            Context applicationContext = application != null ? application.getApplicationContext() : null;
                            if (applicationContext == null || BiliAccounts.get(applicationContext).isLogin()) {
                                com.bilibili.playerbizcommonv2.utils.p.i(this.f83458b.m(), subtitleAndAiWidget2.getControlContainerService().getScreenModeType(), subtitleAndAiWidget2.getToastService());
                                subtitleAndAiWidget2.getAiService().o0(languageItem);
                                subtitleAndAiWidget2.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.aidubswitch-option.option-click.player", new String[]{"option", languageItem.getTitle(), "perfer_type", sb0.b.a(languageItem)}));
                                unit = Unit.INSTANCE;
                            } else {
                                PlayerRouteUris.Routers.login$default(PlayerRouteUris.Routers.INSTANCE, applicationContext, 1024, (String) null, 4, (Object) null);
                                unit = Unit.INSTANCE;
                            }
                        }
                        return unit;
                    }
                }, new b70.x(subtitleAndAiWidget, languagesE02)));
                subtitleAndAiWidget.getControlContainerService().hide();
            }
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            ControlContainerVisibleObserver controlContainerVisibleObserver;
            ControlContainerVisibleObserver controlContainerVisibleObserver2;
            ControlContainerVisibleObserver controlContainerVisibleObserver3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                IControlContainerService controlContainerService = this.this$0.getControlContainerService();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.conflate(FlowKt.callbackFlow(new SubtitleAndAiWidget$subtitlesAvailableFlow$1(this.this$0.getInteractLayerService(), this.this$0.getPlayerSettingService(), controlContainerService, null))));
                Flow flowDistinctUntilChanged2 = FlowKt.distinctUntilChanged(FlowKt.combine(flowDistinctUntilChanged, this.this$0.getAiService().U(), new SubtitleAndAiWidget$bindToView$2$shouldMergeAiAndSubtitleFlow$1(this.this$0, null)));
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(flowDistinctUntilChanged2, FlowKt.distinctUntilChanged(FlowKt.combine(this.this$0.getAiService().U(), flowDistinctUntilChanged2, new SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1(this.this$0, null))), FlowKt.distinctUntilChanged(FlowKt.combine(flowDistinctUntilChanged, flowDistinctUntilChanged2, new SubtitleAndAiWidget$bindToView$2$subtitleOnlyFlow$1(null))), this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C05612(this.this$0, null), 3, (Object) null);
                final SubtitleAndAiWidget subtitleAndAiWidget = this.this$0;
                controlContainerVisibleObserver = new ControlContainerVisibleObserver(subtitleAndAiWidget, coroutineScope) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SubtitleAndAiWidget f83597a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CoroutineScope f83598b;

                    {
                        this.f83597a = subtitleAndAiWidget;
                        this.f83598b = coroutineScope;
                    }

                    public final void onControlContainerVisibleChanged(boolean z6) {
                        Video.DisplayParams displayParams;
                        SubtitleAndAiWidget subtitleAndAiWidget2 = this.f83597a;
                        if (z6 && subtitleAndAiWidget2.getVisibility() == 0) {
                            int i8 = SubtitleAndAiWidget.f83581u;
                            Video.PlayableParams currentPlayableParams = subtitleAndAiWidget2.getPlayDirector().getCurrentPlayableParams();
                            long cid = (currentPlayableParams == null || (displayParams = currentPlayableParams.getDisplayParams()) == null) ? 0L : displayParams.getCid();
                            if (cid != 0 && cid != subtitleAndAiWidget2.f83585i) {
                                subtitleAndAiWidget2.f83585i = cid;
                                subtitleAndAiWidget2.getReporterService().report(new NeuronsEvents.b("player.player.translation-subtitles-button.show.player", subtitleAndAiWidget2.l0()));
                            }
                        }
                        if (subtitleAndAiWidget2.f83586j && z6) {
                            subtitleAndAiWidget2.f83586j = false;
                            BuildersKt.launch$default(this.f83598b, (CoroutineContext) null, (CoroutineStart) null, new SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1$onControlContainerVisibleChanged$1(subtitleAndAiWidget2, null), 3, (Object) null);
                        }
                    }
                };
                subtitleAndAiWidget.getControlContainerService().registerControlContainerVisible(controlContainerVisibleObserver);
                this.this$0.getInteractLayerService().setSubtitleShowInSettingWidget(this.this$0.f83584g);
                final SubtitleAndAiWidget subtitleAndAiWidget2 = this.this$0;
                subtitleAndAiWidget2.setOnClickListener(new View.OnClickListener(subtitleAndAiWidget2) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.F0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final SubtitleAndAiWidget f83483a;

                    {
                        this.f83483a = subtitleAndAiWidget2;
                    }

                    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) throws NoWhenBranchMatchedException {
                        SubtitleAndAiWidget.AnonymousClass2.invokeSuspend$lambda$0(this.f83483a, view);
                    }
                });
                try {
                    this.L$0 = controlContainerVisibleObserver;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    controlContainerVisibleObserver2 = controlContainerVisibleObserver;
                    this.this$0.setOnClickListener(null);
                    this.this$0.getControlContainerService().unregisterControlContainerVisible(controlContainerVisibleObserver2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1 subtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1 = (SubtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1) this.L$0;
                controlContainerVisibleObserver3 = subtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1;
                try {
                    ResultKt.throwOnFailure(obj);
                    controlContainerVisibleObserver = subtitleAndAiWidget$bindToView$2$controlContainerVisibleObserver$1;
                } catch (Throwable th2) {
                    controlContainerVisibleObserver2 = controlContainerVisibleObserver3;
                    th = th2;
                    this.this$0.setOnClickListener(null);
                    this.this$0.getControlContainerService().unregisterControlContainerVisible(controlContainerVisibleObserver2);
                    throw th;
                }
            }
            controlContainerVisibleObserver3 = controlContainerVisibleObserver;
            throw new KotlinNothingValueException();
        }
    }

    @JvmOverloads
    public SubtitleAndAiWidget(@NotNull Context context) {
        this(context, 0);
    }

    public SubtitleAndAiWidget(Context context, int i7) {
        super(context, null, 0);
        this.h = q0.c.f83767a;
        this.f83595s = LazyKt.lazy(new I1(8));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, dq0.e.f116623c, 0, 0);
        this.f83584g = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(2131501993, (ViewGroup) this, true);
        this.f83582e = (TextView) findViewById(2131319250);
        ComposeView composeView = (ComposeView) findViewById(2131319249);
        this.f83583f = composeView;
        setVisibility(8);
        AX.g.c(composeView);
        this.f83596t = true;
    }

    private final tv.danmaku.bili.widget.preference.a getDataStore() {
        return (tv.danmaku.bili.widget.preference.a) this.f83595s.getValue();
    }

    public static final Object j0(SubtitleAndAiWidget subtitleAndAiWidget, SuspendLambda suspendLambda) throws Throwable {
        Object objM0;
        K0 k0G0;
        if (Intrinsics.areEqual(subtitleAndAiWidget.h, q0.c.f83767a) || subtitleAndAiWidget.getControlContainerService().getState() != ControlContainerType.LANDSCAPE_FULLSCREEN || (k0G0 = subtitleAndAiWidget.getAiService().g0()) == null || !k0G0.d()) {
            objM0 = Unit.INSTANCE;
        } else if (subtitleAndAiWidget.getControlContainerService().isShowing()) {
            objM0 = subtitleAndAiWidget.m0(suspendLambda);
            if (objM0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objM0 = Unit.INSTANCE;
            }
        } else {
            subtitleAndAiWidget.f83586j = true;
            objM0 = Unit.INSTANCE;
        }
        return objM0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k0(com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget.k0(com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget):void");
    }

    public static final void n0(BiliGuideBubble biliGuideBubble) {
        if (biliGuideBubble.isShowing()) {
            try {
                biliGuideBubble.dismiss();
            } catch (Exception e7) {
                Log.e("SubtitleAndAiWidget-showOverflowGuideInternal$dismiss", "[playerbizcommonv2-SubtitleAndAiWidget-showOverflowGuideInternal$dismiss] dismiss bubble error", e7);
            }
        }
    }

    private final void setAiBadgeView(final Badge badge) {
        int i7;
        ComposeView composeView = this.f83583f;
        if (composeView != null) {
            if (badge != null) {
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(535894945, true, new Function2(badge) { // from class: com.bilibili.playerbizcommonv2.widget.subtitle.A0

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Badge f83454a;

                    {
                        this.f83454a = badge;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i8 = SubtitleAndAiWidget.f83581u;
                        if (composer.shouldExecute((iIntValue & 3) != 2, 1 & iIntValue)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(535894945, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget.setAiBadgeView.<anonymous> (SubtitleAndAiWidget.kt:335)");
                            }
                            Jr0.e.a(com.bilibili.playerbizcommonv2.service.ai.b.e(this.f83454a), 12, 6, 3, 8, false, composer, 28080, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }));
                i7 = 0;
            } else {
                i7 = 8;
            }
            composeView.setVisibility(i7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws kotlin.KotlinNothingValueException {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget.AnonymousClass1
            if (r0 == 0) goto L27
            r0 = r6
            com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$1 r0 = (com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget.AnonymousClass1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L31
        L27:
            com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$1 r0 = new com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L31:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5c
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L54
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L54:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7d
        L5c:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2 r0 = new com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r8
            if (r0 != r1) goto L7d
            r0 = r8
            return r0
        L7d:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget.bindToView(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final com.bilibili.playerbizcommonv2.service.ai.a getAiService() {
        com.bilibili.playerbizcommonv2.service.ai.a aVar = this.f83593q;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("aiService");
        return null;
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f83587k;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final AbsFunctionWidgetService getFunctionWidgetService() {
        AbsFunctionWidgetService absFunctionWidgetService = this.f83590n;
        if (absFunctionWidgetService != null) {
            return absFunctionWidgetService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
        return null;
    }

    @NotNull
    public final IInteractLayerService getInteractLayerService() {
        IInteractLayerService iInteractLayerService = this.f83588l;
        if (iInteractLayerService != null) {
            return iInteractLayerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("interactLayerService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f83596t;
    }

    @NotNull
    public final IPlayDirector getPlayDirector() {
        IPlayDirector iPlayDirector = this.f83594r;
        if (iPlayDirector != null) {
            return iPlayDirector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playDirector");
        return null;
    }

    @NotNull
    public final IPlayerSettingService getPlayerSettingService() {
        IPlayerSettingService iPlayerSettingService = this.f83591o;
        if (iPlayerSettingService != null) {
            return iPlayerSettingService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playerSettingService");
        return null;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f83589m;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @NotNull
    public final IToastService getToastService() {
        IToastService iToastService = this.f83592p;
        if (iToastService != null) {
            return iToastService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toastService");
        return null;
    }

    public final Map<String, String> l0() {
        TextView textView = this.f83582e;
        Pair pair = TuplesKt.to("button_name", String.valueOf(textView != null ? textView.getText() : null));
        Languages languagesE0 = getAiService().e0();
        Badge badgeA = null;
        if (languagesE0 != null) {
            badgeA = languagesE0.a();
        }
        Pair pair2 = TuplesKt.to("button_tip", badgeA != null ? "ai" : "");
        VideoSubtitle subtitleData = getInteractLayerService().getSubtitleData();
        return MapsKt.mapOf(new Pair[]{pair, pair2, TuplesKt.to("has_ai_info", (subtitleData == null || !subtitleData.hasSubtitlePosition()) ? "0" : "1")});
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m0(kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget.m0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void onWidgetActive() {
    }

    public final void onWidgetInactive() {
    }

    public final void setAiService(@NotNull com.bilibili.playerbizcommonv2.service.ai.a aVar) {
        this.f83593q = aVar;
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f83587k = iControlContainerService;
    }

    public final void setFunctionWidgetService(@NotNull AbsFunctionWidgetService absFunctionWidgetService) {
        this.f83590n = absFunctionWidgetService;
    }

    public final void setInteractLayerService(@NotNull IInteractLayerService iInteractLayerService) {
        this.f83588l = iInteractLayerService;
    }

    public final void setPlayDirector(@NotNull IPlayDirector iPlayDirector) {
        this.f83594r = iPlayDirector;
    }

    public final void setPlayerSettingService(@NotNull IPlayerSettingService iPlayerSettingService) {
        this.f83591o = iPlayerSettingService;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f83589m = iReporterService;
    }

    public final void setToastService(@NotNull IToastService iToastService) {
        this.f83592p = iToastService;
    }
}
