package com.bilibili.playerbizcommonv2.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.playerbizcommonv2.utils.o;
import com.bilibili.playerbizcommonv2.widget.base.PlayerPlayPauseWidget;
import com.bilibili.playerbizcommonv2.widget.base.d;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IControlWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerPlayPauseWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerPlayPauseWidget extends TintImageView implements IControlWidget {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Inject
    public ei1.d f82361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Inject
    public IReporterService f82362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Inject
    public IControlContainerService f82363g;

    @Inject
    public tv.danmaku.biliplayerv2.service.report.statistics.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    public Er0.a f82364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f82365j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f82366k;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerPlayPauseWidget$bindToView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerPlayPauseWidget$bindToView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private Object L$0;
        int label;
        final PlayerPlayPauseWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerPlayPauseWidget$bindToView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerPlayPauseWidget$bindToView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayerPlayPauseWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerPlayPauseWidget playerPlayPauseWidget, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playerPlayPauseWidget;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(PlayerPlayPauseWidget playerPlayPauseWidget) {
                PlayerPlayPauseWidget.q(playerPlayPauseWidget);
                return Unit.INSTANCE;
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
                    o uiStyleDelegate = this.this$0.getUiStyleDelegate();
                    if (uiStyleDelegate == null || !uiStyleDelegate.b()) {
                        final PlayerPlayPauseWidget playerPlayPauseWidget = this.this$0;
                        playerPlayPauseWidget.setOnClickListener(new View.OnClickListener(playerPlayPauseWidget) { // from class: com.bilibili.playerbizcommonv2.widget.base.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final PlayerPlayPauseWidget f82394a;

                            {
                                this.f82394a = playerPlayPauseWidget;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PlayerPlayPauseWidget.q(this.f82394a);
                            }
                        });
                    } else {
                        PlayerPlayPauseWidget playerPlayPauseWidget2 = this.this$0;
                        IControlContainerService controlContainerService = playerPlayPauseWidget2.getControlContainerService();
                        final PlayerPlayPauseWidget playerPlayPauseWidget3 = this.this$0;
                        Function0 function0 = new Function0(playerPlayPauseWidget3) { // from class: com.bilibili.playerbizcommonv2.widget.base.e

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final PlayerPlayPauseWidget f82393a;

                            {
                                this.f82393a = playerPlayPauseWidget3;
                            }

                            public final Object invoke() {
                                return PlayerPlayPauseWidget.AnonymousClass2.AnonymousClass1.invokeSuspend$lambda$0(this.f82393a);
                            }
                        };
                        this.label = 1;
                        if (com.bilibili.playerbizcommonv2.utils.f.d(playerPlayPauseWidget2, controlContainerService, false, function0, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerPlayPauseWidget$bindToView$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerPlayPauseWidget$bindToView$2$2.class */
        public static final class C05382 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayerPlayPauseWidget this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.base.PlayerPlayPauseWidget$bindToView$2$2$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/PlayerPlayPauseWidget$bindToView$2$2$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerPlayPauseWidget f82367a;

                public a(PlayerPlayPauseWidget playerPlayPauseWidget) {
                    this.f82367a = playerPlayPauseWidget;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    PlayerPlayPauseWidget playerPlayPauseWidget = this.f82367a;
                    playerPlayPauseWidget.setWidgetState(zBooleanValue);
                    playerPlayPauseWidget.f82365j = zBooleanValue;
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05382(PlayerPlayPauseWidget playerPlayPauseWidget, Continuation<? super C05382> continuation) {
                super(2, continuation);
                this.this$0 = playerPlayPauseWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05382(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowX = this.this$0.getSuppressiblePlayer().X();
                    a aVar = new a(this.this$0);
                    this.label = 1;
                    if (flowX.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass2(PlayerPlayPauseWidget playerPlayPauseWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playerPlayPauseWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
            return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C05382(this.this$0, null), 3, (Object) null);
        }
    }

    public PlayerPlayPauseWidget(@NotNull Context context) {
        super(context);
        this.f82366k = true;
        F();
    }

    public PlayerPlayPauseWidget(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82366k = true;
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o getUiStyleDelegate() {
        return (o) getDelegateStoreService().get(o.a.f81942a);
    }

    private final d getUserPlayPauseDelegate() {
        return (d) getDelegateStoreService().get(d.a.f82392a);
    }

    public static final void q(PlayerPlayPauseWidget playerPlayPauseWidget) {
        String str;
        if (playerPlayPauseWidget.f82365j) {
            playerPlayPauseWidget.getSuppressiblePlayer().pause();
            playerPlayPauseWidget.getStatisticsService().a();
            d userPlayPauseDelegate = playerPlayPauseWidget.getUserPlayPauseDelegate();
            if (userPlayPauseDelegate != null) {
                userPlayPauseDelegate.a();
            }
            BLog.i("BiliPlayerV2", "[player]video pause");
            str = "2";
        } else {
            playerPlayPauseWidget.getSuppressiblePlayer().resume();
            d userPlayPauseDelegate2 = playerPlayPauseWidget.getUserPlayPauseDelegate();
            if (userPlayPauseDelegate2 != null) {
                userPlayPauseDelegate2.b();
            }
            BLog.i("BiliPlayerV2", "[player]video start");
            str = "1";
        }
        playerPlayPauseWidget.getReporterService().report(new NeuronsEvents.NormalEvent("player.player.start-pause.click.player", new String[]{"action_type", str}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWidgetState(boolean z6) {
        if (z6) {
            setImageLevel(1);
            setContentDescription("暂停");
        } else {
            setImageLevel(0);
            setContentDescription("播放");
        }
    }

    public final void F() {
        setImageResource(2131232475);
    }

    @Nullable
    public final Object bindToView(@NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @NotNull
    public final IControlContainerService getControlContainerService() {
        IControlContainerService iControlContainerService = this.f82363g;
        if (iControlContainerService != null) {
            return iControlContainerService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("controlContainerService");
        return null;
    }

    @NotNull
    public final Er0.a getDelegateStoreService() {
        Er0.a aVar = this.f82364i;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateStoreService");
        return null;
    }

    public boolean getMembersInjector() {
        return this.f82366k;
    }

    @NotNull
    public final IReporterService getReporterService() {
        IReporterService iReporterService = this.f82362f;
        if (iReporterService != null) {
            return iReporterService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reporterService");
        return null;
    }

    @NotNull
    public final tv.danmaku.biliplayerv2.service.report.statistics.a getStatisticsService() {
        tv.danmaku.biliplayerv2.service.report.statistics.a aVar = this.h;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("statisticsService");
        return null;
    }

    @NotNull
    public final ei1.d getSuppressiblePlayer() {
        ei1.d dVar = this.f82361e;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("suppressiblePlayer");
        return null;
    }

    public final void setControlContainerService(@NotNull IControlContainerService iControlContainerService) {
        this.f82363g = iControlContainerService;
    }

    public final void setDelegateStoreService(@NotNull Er0.a aVar) {
        this.f82364i = aVar;
    }

    public final void setReporterService(@NotNull IReporterService iReporterService) {
        this.f82362f = iReporterService;
    }

    public final void setStatisticsService(@NotNull tv.danmaku.biliplayerv2.service.report.statistics.a aVar) {
        this.h = aVar;
    }

    public final void setSuppressiblePlayer(@NotNull ei1.d dVar) {
        this.f82361e = dVar;
    }
}
