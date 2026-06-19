package com.bilibili.ship.theseus.united.player.oldway;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import javax.inject.Inject;
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
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/InMediaControlSetup.class */
@StabilityInferred(parameters = 0)
public final class InMediaControlSetup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j f104646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ControlContainerLazyService f104649e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.InMediaControlSetup$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/InMediaControlSetup$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final InMediaControlSetup this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InMediaControlSetup inMediaControlSetup, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = inMediaControlSetup;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            ControlContainerType controlContainerType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                j jVar = this.this$0.f104646b;
                this.label = 1;
                if (jVar.u(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BLog.i("InMediaControlSetup$1-invokeSuspend", "[theseus-united-InMediaControlSetup$1-invokeSuspend] in media scope, wait first frame, set control container config");
            this.this$0.f104649e.a();
            c.a aVarH = this.this$0.f104647c.h();
            boolean z6 = aVarH.f102988b;
            if (z6) {
                boolean z7 = aVarH.f102987a;
                controlContainerType = (!z6 || z7) ? (z6 && z7) ? ControlContainerType.VERTICAL_FULLSCREEN : ControlContainerType.HALF_SCREEN : ControlContainerType.LANDSCAPE_FULLSCREEN;
            } else {
                controlContainerType = ControlContainerType.HALF_SCREEN;
            }
            defpackage.a.b("[theseus-united-InMediaControlSetup$1-invokeSuspend] ", "in media scope,wait first frame, set control container config: " + controlContainerType + ", screen state: " + aVarH, "InMediaControlSetup$1-invokeSuspend");
            this.this$0.f104648d.switchTo(controlContainerType);
            return Unit.INSTANCE;
        }
    }

    @Inject
    public InMediaControlSetup(@NotNull CoroutineScope coroutineScope, @NotNull j jVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IControlContainerService iControlContainerService, @NotNull ControlContainerLazyService controlContainerLazyService) {
        this.f104645a = coroutineScope;
        this.f104646b = jVar;
        this.f104647c = cVar;
        this.f104648d = iControlContainerService;
        this.f104649e = controlContainerLazyService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
