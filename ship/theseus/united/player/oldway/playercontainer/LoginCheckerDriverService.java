package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerSpeedChangedObserver;
import tv.danmaku.biliplayerv2.service.PlayerSeekObserver;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import xq0.RunnableC9000a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/LoginCheckerDriverService.class */
@StabilityInferred(parameters = 0)
public final class LoginCheckerDriverService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RunnableC9000a f104761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f104762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f104763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f104764d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.LoginCheckerDriverService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/LoginCheckerDriverService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IPlayerCoreService $playerCoreService;
        int label;
        final LoginCheckerDriverService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LoginCheckerDriverService loginCheckerDriverService, IPlayerCoreService iPlayerCoreService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = loginCheckerDriverService;
            this.$playerCoreService = iPlayerCoreService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$playerCoreService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f104761a.b();
                this.$playerCoreService.unregisterSeekObserver(this.this$0.f104762b);
                this.$playerCoreService.removePlayerSpeedChangedObserver(this.this$0.f104763c);
                this.$playerCoreService.unregisterState(this.this$0.f104764d);
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/LoginCheckerDriverService$a.class */
    public static final class a implements PlayerSeekObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoginCheckerDriverService f104765a;

        public a(LoginCheckerDriverService loginCheckerDriverService) {
            this.f104765a = loginCheckerDriverService;
        }

        public final void onSeekComplete(long j7) {
            this.f104765a.f104761a.a();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/LoginCheckerDriverService$b.class */
    public static final class b implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoginCheckerDriverService f104766a;

        public b(LoginCheckerDriverService loginCheckerDriverService) {
            this.f104766a = loginCheckerDriverService;
        }

        public final void onPlayerStateChanged(int i7) {
            if (i7 == 3) {
                this.f104766a.f104761a.a();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/LoginCheckerDriverService$c.class */
    public static final class c implements IPlayerSpeedChangedObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoginCheckerDriverService f104767a;

        public c(LoginCheckerDriverService loginCheckerDriverService) {
            this.f104767a = loginCheckerDriverService;
        }

        public final void onChanged(float f7) {
            this.f104767a.f104761a.a();
        }
    }

    @Inject
    public LoginCheckerDriverService(@NotNull PlayerContainer playerContainer, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull CoroutineScope coroutineScope) {
        this.f104761a = new RunnableC9000a(new WeakReference(playerContainer));
        a aVar = new a(this);
        this.f104762b = aVar;
        c cVar = new c(this);
        this.f104763c = cVar;
        b bVar = new b(this);
        this.f104764d = bVar;
        iPlayerCoreService.registerState(bVar, new int[]{3});
        iPlayerCoreService.registerSeekObserver(aVar);
        iPlayerCoreService.addPlayerSpeedChangedObserver(cVar);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, iPlayerCoreService, null), 3, (Object) null);
    }
}
