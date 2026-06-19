package com.bilibili.ship.theseus.united.player.controlcontainer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.ScreenOrientationDelegate;
import tv.danmaku.biliplayerv2.service.WindowInset;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService.class */
@StabilityInferred(parameters = 0)
public final class PlayerControlContainerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IActivityStateService f104426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.activitywindow.l f104427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f104428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104429g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlayerControlContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$1$a.class */
        public static final class a implements ScreenOrientationDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerControlContainerService f104430a;

            public a(PlayerControlContainerService playerControlContainerService) {
                this.f104430a = playerControlContainerService;
            }

            public final void enterFullScreen() {
                this.f104430a.f104425c.e();
            }

            public final void switchOrientation(int i7) {
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$1$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$1$b.class */
        public static final class b implements com.bilibili.lib.coroutineextension.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerControlContainerService f104431a;

            public b(PlayerControlContainerService playerControlContainerService) {
                this.f104431a = playerControlContainerService;
            }

            public final void invoke() {
                this.f104431a.f104424b.setScreenOrientationDelegate((ScreenOrientationDelegate) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerControlContainerService playerControlContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playerControlContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.lib.coroutineextension.j bVar;
            Throwable th;
            com.bilibili.lib.coroutineextension.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerControlContainerService playerControlContainerService = this.this$0;
                playerControlContainerService.f104424b.setScreenOrientationDelegate(new a(playerControlContainerService));
                bVar = new b(playerControlContainerService);
                try {
                    this.L$0 = bVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jVar = bVar;
                    jVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bilibili.lib.coroutineextension.j jVar2 = (com.bilibili.lib.coroutineextension.j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    bVar = jVar2;
                } catch (Throwable th3) {
                    th = th3;
                    jVar.invoke();
                    throw th;
                }
            }
            com.bilibili.lib.coroutineextension.j jVar3 = bVar;
            jVar = bVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayerControlContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayerControlContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayerControlContainerService playerControlContainerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playerControlContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.a aVar = (c.a) this.L$0;
                if (!CoroutineScopeKt.isActive(this.this$0.f104423a)) {
                    BLog.e("PlayerControlContainerService$2$1-invokeSuspend", "[theseus-united-PlayerControlContainerService$2$1-invokeSuspend] coroutineScope is not active", (Throwable) null);
                    return Unit.INSTANCE;
                }
                boolean z6 = aVar.f102987a;
                boolean z7 = aVar.f102988b;
                if (z6) {
                    if (z7) {
                        this.this$0.f104424b.switchTo(ControlContainerType.VERTICAL_FULLSCREEN);
                        PlayerControlContainerService.a(this.this$0, ScreenModeType.VERTICAL_FULLSCREEN);
                    } else {
                        this.this$0.f104424b.switchTo(ControlContainerType.HALF_SCREEN);
                        PlayerControlContainerService.a(this.this$0, ScreenModeType.THUMB);
                    }
                } else if (z7) {
                    this.this$0.f104424b.switchTo(ControlContainerType.LANDSCAPE_FULLSCREEN);
                    PlayerControlContainerService.a(this.this$0, ScreenModeType.LANDSCAPE_FULLSCREEN);
                } else {
                    this.this$0.f104424b.switchTo(ControlContainerType.HALF_SCREEN);
                    PlayerControlContainerService.a(this.this$0, ScreenModeType.THUMB);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayerControlContainerService playerControlContainerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playerControlContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.f104425c.c());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final PlayerControlContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$3$a.class */
        public static final class a implements ControlContainerObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerControlContainerService f104432a;

            public a(PlayerControlContainerService playerControlContainerService) {
                this.f104432a = playerControlContainerService;
            }

            public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
                if (screenModeType == ScreenModeType.VERTICAL_FULLSCREEN) {
                    this.f104432a.f104425c.e();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlayerControlContainerService playerControlContainerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playerControlContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PlayerControlContainerService playerControlContainerService = this.this$0;
            a aVar = new a(playerControlContainerService);
            playerControlContainerService.f104424b.registerState(aVar);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerControlContainerService$3$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0, aVar), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final PlayerControlContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$4$a.class */
        public static final class a implements ControlContainerVisibleObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerControlContainerService f104433a;

            public a(PlayerControlContainerService playerControlContainerService) {
                this.f104433a = playerControlContainerService;
            }

            public final void onControlContainerVisibleChanged(boolean z6) {
                this.f104433a.f104428f.setValue(Boolean.valueOf(z6));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlayerControlContainerService playerControlContainerService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playerControlContainerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PlayerControlContainerService playerControlContainerService = this.this$0;
            a aVar = new a(playerControlContainerService);
            playerControlContainerService.f104424b.registerControlContainerVisible(aVar);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayerControlContainerService$4$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0, aVar), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/PlayerControlContainerService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f104434a;

        static {
            int[] iArr = new int[ScreenModeType.values().length];
            try {
                iArr[ScreenModeType.LANDSCAPE_FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ScreenModeType.VERTICAL_FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f104434a = iArr;
        }
    }

    @Inject
    public PlayerControlContainerService(@NotNull CoroutineScope coroutineScope, @NotNull IControlContainerService iControlContainerService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IActivityStateService iActivityStateService, @NotNull com.bilibili.ship.theseus.united.page.activitywindow.l lVar) {
        this.f104423a = coroutineScope;
        this.f104424b = iControlContainerService;
        this.f104425c = cVar;
        this.f104426d = iActivityStateService;
        this.f104427e = lVar;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(iControlContainerService.isShowing()));
        this.f104428f = MutableStateFlow;
        this.f104429g = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public static final void a(PlayerControlContainerService playerControlContainerService, ScreenModeType screenModeType) {
        playerControlContainerService.getClass();
        WindowInset windowInset = new WindowInset(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
        int iB = playerControlContainerService.f104427e.f98873a.b();
        if (iB > 0) {
            int i7 = a.f104434a[screenModeType.ordinal()];
            com.bilibili.ship.theseus.united.page.screenstate.c cVar = playerControlContainerService.f104425c;
            if (i7 != 1) {
                if (i7 == 2) {
                    if (cVar.h().f102989c) {
                        windowInset.setBottomPadding(iB);
                    } else {
                        windowInset.setTopPadding(iB);
                    }
                }
            } else if (cVar.h().f102989c) {
                windowInset.setRightPadding(iB);
            } else {
                windowInset.setLeftPadding(iB);
            }
            playerControlContainerService.f104426d.dispatchWindowInsetChanged(windowInset);
        }
    }
}
