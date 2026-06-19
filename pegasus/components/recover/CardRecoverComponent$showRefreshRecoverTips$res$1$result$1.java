package com.bilibili.pegasus.components.recover;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.bilibili.ad.adview.videodetail.merchandise.y;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.data.config.FlushRecoverConfig;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$showRefreshRecoverTips$res$1$result$1.class */
public final class CardRecoverComponent$showRefreshRecoverTips$res$1$result$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final FlushRecoverConfig $config;
    final int $flushType;
    final ViewGroup $rootView;
    private Object L$0;
    int label;
    final CardRecoverComponent this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$showRefreshRecoverTips$res$1$result$1$a.class */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardRecoverComponent f77137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FlushRecoverConfig f77138b;

        public a(ComposeView composeView, CardRecoverComponent cardRecoverComponent, FlushRecoverConfig flushRecoverConfig) {
            this.f77137a = cardRecoverComponent;
            this.f77138b = flushRecoverConfig;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComposeView composeView = this.f77137a.f77130o;
            int style = this.f77138b.getStyle();
            if (composeView == null) {
                return;
            }
            if (style == 1) {
                composeView.setAlpha(0.0f);
                composeView.animate().setStartDelay(50L).alpha(1.0f).setDuration(200L).start();
            } else {
                if (style != 2) {
                    return;
                }
                composeView.setAlpha(0.0f);
                composeView.post(new PH0.h(composeView, 1));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRecoverComponent$showRefreshRecoverTips$res$1$result$1(CardRecoverComponent cardRecoverComponent, ViewGroup viewGroup, int i7, FlushRecoverConfig flushRecoverConfig, Continuation<? super CardRecoverComponent$showRefreshRecoverTips$res$1$result$1> continuation) {
        super(2, continuation);
        this.this$0 = cardRecoverComponent;
        this.$rootView = viewGroup;
        this.$flushType = i7;
        this.$config = flushRecoverConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$lambda$0$0(final FlushRecoverConfig flushRecoverConfig, final ProducerScope producerScope, Composer composer, int i7) {
        if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-635137806, i7, -1, "com.bilibili.pegasus.components.recover.CardRecoverComponent.showRefreshRecoverTips.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CardRecoverComponent.kt:216)");
            }
            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1803195222, true, new Function2(flushRecoverConfig, producerScope) { // from class: com.bilibili.pegasus.components.recover.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlushRecoverConfig f77153a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ProducerScope f77154b;

                {
                    this.f77153a = flushRecoverConfig;
                    this.f77154b = producerScope;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return CardRecoverComponent$showRefreshRecoverTips$res$1$result$1.invokeSuspend$lambda$0$0$0(this.f77153a, this.f77154b, (Composer) obj, iIntValue);
                }
            }, composer, 54), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0166  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit invokeSuspend$lambda$0$0$0(com.bilibili.pegasus.data.config.FlushRecoverConfig r27, final kotlinx.coroutines.channels.ProducerScope r28, androidx.compose.runtime.Composer r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.recover.CardRecoverComponent$showRefreshRecoverTips$res$1$result$1.invokeSuspend$lambda$0$0$0(com.bilibili.pegasus.data.config.FlushRecoverConfig, kotlinx.coroutines.channels.ProducerScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0$0$0$1$0(ProducerScope producerScope) {
        Neurons.reportClick$default(false, "tm.recommend.feed-card.recover-button.click", (Map) null, 4, (Object) null);
        producerScope.trySend-JP2dKIU(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2() {
        BLog.i("[Pegasus]CardRecoverComponent", "awaitClose, onClose");
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CardRecoverComponent$showRefreshRecoverTips$res$1$result$1 cardRecoverComponent$showRefreshRecoverTips$res$1$result$1 = new CardRecoverComponent$showRefreshRecoverTips$res$1$result$1(this.this$0, this.$rootView, this.$flushType, this.$config, continuation);
        cardRecoverComponent$showRefreshRecoverTips$res$1$result$1.L$0 = obj;
        return cardRecoverComponent$showRefreshRecoverTips$res$1$result$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public final Object invokeSuspend(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            this.this$0.d(this.$rootView);
            CardRecoverComponent cardRecoverComponent = this.this$0;
            ComposeView composeView = new ComposeView(this.$rootView.getContext(), null, 0, 6, null);
            final FlushRecoverConfig flushRecoverConfig = this.$config;
            ViewGroup viewGroup = this.$rootView;
            composeView.setTag("pegasus_recover_tips_view");
            int style = flushRecoverConfig.getStyle();
            if (style != 1) {
                if (style != 2) {
                    producerScope.trySend-JP2dKIU(Boxing.boxBoolean(false));
                    return Unit.INSTANCE;
                }
                if (viewGroup instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 8388661;
                    layoutParams = layoutParams2;
                } else if (viewGroup instanceof ConstraintLayout) {
                    ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                    layoutParams3.endToEnd = 0;
                    layoutParams3.topToTop = 0;
                    layoutParams = layoutParams3;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(-2, -2);
                }
            } else if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams4.gravity = 49;
                layoutParams = layoutParams4;
            } else if (viewGroup instanceof ConstraintLayout) {
                ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams5.startToStart = 0;
                layoutParams5.endToEnd = 0;
                layoutParams5.topToTop = 0;
                layoutParams = layoutParams5;
            } else {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            composeView.setLayoutParams(layoutParams);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-635137806, true, new Function2(flushRecoverConfig, producerScope) { // from class: com.bilibili.pegasus.components.recover.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlushRecoverConfig f77155a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ProducerScope f77156b;

                {
                    this.f77155a = flushRecoverConfig;
                    this.f77156b = producerScope;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return CardRecoverComponent$showRefreshRecoverTips$res$1$result$1.invokeSuspend$lambda$0$0(this.f77155a, this.f77156b, (Composer) obj2, iIntValue);
                }
            }));
            cardRecoverComponent.f77130o = composeView;
            this.$rootView.addView(this.this$0.f77130o);
            CardRecoverComponent cardRecoverComponent2 = this.this$0;
            ComposeView composeView2 = cardRecoverComponent2.f77130o;
            if (composeView2 != null) {
                OneShotPreDrawListener.add(composeView2, new a(composeView2, cardRecoverComponent2, this.$config));
            }
            Neurons.reportExposure$default(false, "tm.recommend.feed-card.recover-button.show", y.a(this.$flushType, "flush_type"), (List) null, 8, (Object) null);
            ?? obj2 = new Object();
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, (Function0) obj2, this) == coroutine_suspended) {
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
