package com.bilibili.ship.theseus.ogv.trialcountdown;

import U80.t;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.ship.theseus.united.page.playviewextra.CountdownItemVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FoldDataVo;
import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6385j;
import com.bilibili.ship.theseus.united.page.restrictionlayer.C6386k;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.y;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.biliplayerv2.service.IToastServiceKtxKt;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$runToast$2.class */
final class TrialCountdownToastService$runToast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FullPromptBarVo $data;
    final long $furthestAvailablePosition;
    private Object L$0;
    int label;
    final TrialCountdownToastService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService$runToast$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/trialcountdown/TrialCountdownToastService$runToast$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FullPromptBarVo $data;
        final MutableState<Boolean> $folded$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FullPromptBarVo fullPromptBarVo, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$data = fullPromptBarVo;
            this.$folded$delegate = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$data, this.$folded$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            CountdownItemVo countdownItemVoA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FoldDataVo foldDataVo = this.$data.f102385g;
                if (foldDataVo == null || (countdownItemVoA = foldDataVo.a()) == null) {
                    return Unit.INSTANCE;
                }
                this.label = 1;
                if (DelayKt.delay-VtjQ1oo(countdownItemVoA.f102372a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TrialCountdownToastService$runToast$2.invokeSuspend$lambda$2(this.$folded$delegate, true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrialCountdownToastService$runToast$2(FullPromptBarVo fullPromptBarVo, TrialCountdownToastService trialCountdownToastService, long j7, Continuation<? super TrialCountdownToastService$runToast$2> continuation) {
        super(2, continuation);
        this.$data = fullPromptBarVo;
        this.this$0 = trialCountdownToastService;
        this.$furthestAvailablePosition = j7;
    }

    private static final boolean invokeSuspend$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(MutableState<Boolean> mutableState, boolean z6) {
        mutableState.setValue(Boolean.valueOf(z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$lambda$5(TrialCountdownToastService trialCountdownToastService, final long j7, MutableState mutableState, final FullPromptBarVo fullPromptBarVo, final y yVar, final y yVar2, Composer composer, int i7) {
        if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-406704540, i7, -1, "com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService.runToast.<anonymous>.<anonymous> (TrialCountdownToastService.kt:117)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(trialCountdownToastService.f94587c.J(), Duration.box-impl(trialCountdownToastService.f94587c.F()), null, composer, 0, 2);
            Object objRememberedValue = composer.rememberedValue();
            Object objDerivedStateOf = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0(j7, stateCollectAsState) { // from class: com.bilibili.ship.theseus.ogv.trialcountdown.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f94610a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final State f94611b;

                    {
                        this.f94610a = j7;
                        this.f94611b = stateCollectAsState;
                    }

                    public final Object invoke() {
                        return Long.valueOf(TrialCountdownToastService$runToast$2.invokeSuspend$lambda$5$1$0(this.f94610a, this.f94611b));
                    }
                });
                composer.updateRememberedValue(objDerivedStateOf);
            }
            final State state = (State) objDerivedStateOf;
            AnimatedContentKt.AnimatedContent(Boolean.valueOf(invokeSuspend$lambda$1(mutableState)), null, null, null, "Folding", null, ComposableLambdaKt.rememberComposableLambda(1757769127, true, new Function4(fullPromptBarVo, yVar, yVar2, state) { // from class: com.bilibili.ship.theseus.ogv.trialcountdown.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FullPromptBarVo f94612a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final y f94613b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final y f94614c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final State f94615d;

                {
                    this.f94612a = fullPromptBarVo;
                    this.f94613b = yVar;
                    this.f94614c = yVar2;
                    this.f94615d = state;
                }

                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    y yVar3 = this.f94614c;
                    State state2 = this.f94615d;
                    return TrialCountdownToastService$runToast$2.invokeSuspend$lambda$5$3(this.f94612a, this.f94613b, yVar3, state2, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, iIntValue);
                }
            }, composer, 54), composer, 1597440, 46);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final long invokeSuspend$lambda$5$0(State<Duration> state) {
        return state.getValue().unbox-impl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$5$1$0(long j7, State state) {
        return Duration.getInWholeSeconds-impl(Duration.minus-LRDsOJo(j7, invokeSuspend$lambda$5$0(state)));
    }

    private static final long invokeSuspend$lambda$5$2(State<Long> state) {
        return state.getValue().longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$lambda$5$3(final FullPromptBarVo fullPromptBarVo, y yVar, y yVar2, State state, AnimatedContentScope animatedContentScope, final boolean z6, Composer composer, int i7) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1757769127, i7, -1, "com.bilibili.ship.theseus.ogv.trialcountdown.TrialCountdownToastService.runToast.<anonymous>.<anonymous>.<anonymous> (TrialCountdownToastService.kt:127)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        Object objDerivedStateOf = objRememberedValue;
        if (objRememberedValue == companion.getEmpty()) {
            objDerivedStateOf = SnapshotStateKt.derivedStateOf(new Function0(z6, fullPromptBarVo) { // from class: com.bilibili.ship.theseus.ogv.trialcountdown.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f94600a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final FullPromptBarVo f94601b;

                {
                    this.f94600a = z6;
                    this.f94601b = fullPromptBarVo;
                }

                public final Object invoke() {
                    return TrialCountdownToastService$runToast$2.invokeSuspend$lambda$5$3$0$0(this.f94600a, this.f94601b);
                }
            });
            composer.updateRememberedValue(objDerivedStateOf);
        }
        State state2 = (State) objDerivedStateOf;
        Object objRememberedValue2 = composer.rememberedValue();
        Object objDerivedStateOf2 = objRememberedValue2;
        if (objRememberedValue2 == companion.getEmpty()) {
            objDerivedStateOf2 = SnapshotStateKt.derivedStateOf(new Function0(z6, fullPromptBarVo) { // from class: com.bilibili.ship.theseus.ogv.trialcountdown.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f94602a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final FullPromptBarVo f94603b;

                {
                    this.f94602a = z6;
                    this.f94603b = fullPromptBarVo;
                }

                public final Object invoke() {
                    return TrialCountdownToastService$runToast$2.invokeSuspend$lambda$5$3$2$0(this.f94602a, this.f94603b);
                }
            });
            composer.updateRememberedValue(objDerivedStateOf2);
        }
        g.a(invokeSuspend$lambda$5$3$1(state2), invokeSuspend$lambda$5$3$3((State) objDerivedStateOf2), invokeSuspend$lambda$5$2(state), fullPromptBarVo, yVar, yVar2, null, composer, 4168);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextVo invokeSuspend$lambda$5$3$0$0(boolean z6, FullPromptBarVo fullPromptBarVo) {
        TextVo textVo;
        CountdownItemVo countdownItemVoA;
        if (z6) {
            FoldDataVo foldDataVo = fullPromptBarVo.f102385g;
            textVo = (foldDataVo == null || (countdownItemVoA = foldDataVo.a()) == null) ? null : countdownItemVoA.f102373b;
        } else {
            textVo = fullPromptBarVo.f102380b;
        }
        return textVo;
    }

    private static final TextVo invokeSuspend$lambda$5$3$1(State<TextVo> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextVo invokeSuspend$lambda$5$3$2$0(boolean z6, FullPromptBarVo fullPromptBarVo) {
        TextVo textVo;
        CountdownItemVo countdownItemVoA;
        if (z6) {
            FoldDataVo foldDataVo = fullPromptBarVo.f102385g;
            textVo = (foldDataVo == null || (countdownItemVoA = foldDataVo.a()) == null) ? null : countdownItemVoA.f102374c;
        } else {
            textVo = fullPromptBarVo.f102381c;
        }
        return textVo;
    }

    private static final TextVo invokeSuspend$lambda$5$3$3(State<TextVo> state) {
        return state.getValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrialCountdownToastService$runToast$2 trialCountdownToastService$runToast$2 = new TrialCountdownToastService$runToast$2(this.$data, this.this$0, this.$furthestAvailablePosition, continuation);
        trialCountdownToastService$runToast$2.L$0 = obj;
        return trialCountdownToastService$runToast$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        C6385j c6385j;
        C6385j c6385j2;
        TextVo textVo;
        TextVo textVoE;
        String strD;
        String str;
        Map<String, String> mapC;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ReportVo reportVo = this.$data.h;
            if (reportVo != null && (strD = reportVo.d()) != null && (str = (String) i.a(strD)) != null) {
                TrialCountdownToastService trialCountdownToastService = this.this$0;
                FullPromptBarVo fullPromptBarVo = this.$data;
                Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                ReportVo reportVo2 = fullPromptBarVo.h;
                if (reportVo2 != null && (mapC = reportVo2.c()) != null) {
                    mapCreateMapBuilder.putAll(mapC);
                }
                TrialCountdownToastService.a(trialCountdownToastService, mapCreateMapBuilder);
                PageReportService.i(trialCountdownToastService.f94589e, str, MapsKt.build(mapCreateMapBuilder), 4);
            }
            final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boxing.boxBoolean(false), null, 2, null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$data, mutableStateMutableStateOf$default, null), 3, (Object) null);
            TextVo textVo2 = (TextVo) CollectionsKt.firstOrNull(this.$data.f102384f);
            if (textVo2 != null) {
                C6386k c6386k = this.this$0.f94591g;
                c6386k.getClass();
                c6385j = new C6385j(c6386k, textVo2);
            } else {
                c6385j = null;
            }
            if (c6385j == null || (textVo = c6385j.f102750b) == null || (textVoE = textVo.e()) == null) {
                c6385j2 = null;
            } else {
                C6386k c6386k2 = this.this$0.f94591g;
                c6386k2.getClass();
                c6385j2 = new C6385j(c6386k2, textVoE);
            }
            final TrialCountdownToastService trialCountdownToastService2 = this.this$0;
            final long j7 = this.$furthestAvailablePosition;
            final FullPromptBarVo fullPromptBarVo2 = this.$data;
            final C6385j c6385j3 = c6385j;
            final C6385j c6385j4 = c6385j2;
            ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-406704540, true, new Function2(trialCountdownToastService2, j7, mutableStateMutableStateOf$default, fullPromptBarVo2, c6385j3, c6385j4) { // from class: com.bilibili.ship.theseus.ogv.trialcountdown.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final TrialCountdownToastService f94604a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f94605b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final MutableState f94606c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final FullPromptBarVo f94607d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final C6385j f94608e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final C6385j f94609f;

                {
                    this.f94604a = trialCountdownToastService2;
                    this.f94605b = j7;
                    this.f94606c = mutableStateMutableStateOf$default;
                    this.f94607d = fullPromptBarVo2;
                    this.f94608e = c6385j3;
                    this.f94609f = c6385j4;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    C6385j c6385j5 = this.f94608e;
                    C6385j c6385j6 = this.f94609f;
                    return TrialCountdownToastService$runToast$2.invokeSuspend$lambda$5(this.f94604a, this.f94605b, this.f94606c, this.f94607d, c6385j5, c6385j6, (Composer) obj2, iIntValue);
                }
            });
            this.label = 1;
            trialCountdownToastService2.getClass();
            ComposeView composeView = new ComposeView(trialCountdownToastService2.f94586b, null, 0, 6, null);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(953158966, true, new t(composableLambdaComposableLambdaInstance, 1)));
            PlayerToast.Builder builderDuration = new PlayerToast.Builder().location(32).level(3).toastItemType(19).duration(UpperTimeline.MIN_CLIP_DURATION);
            FrameLayout frameLayout = new FrameLayout(trialCountdownToastService2.f94586b);
            frameLayout.addView(composeView, new ViewGroup.LayoutParams(-2, -2));
            Object objA = IToastServiceKtxKt.a(trialCountdownToastService2.f94588d, builderDuration.setCustomView(frameLayout).build(), this);
            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objA = Unit.INSTANCE;
            }
            if (objA == coroutine_suspended) {
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
