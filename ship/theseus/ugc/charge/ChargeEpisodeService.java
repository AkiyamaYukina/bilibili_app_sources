package com.bilibili.ship.theseus.ugc.charge;

import Vu0.C2969h;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.v1.ChargingPlus;
import com.bapis.bilibili.app.viewunite.v1.PlayToast;
import com.bapis.bilibili.app.viewunite.v1.PlayToastEnum;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.keel.player.h;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeEpisodeService.class */
@StabilityInferred(parameters = 0)
public final class ChargeEpisodeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ChargingPlus f96388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f96389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IToastService f96390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f96391e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeEpisodeService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeEpisodeService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChargeEpisodeService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeEpisodeService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeEpisodeService$1$1.class */
        public static final class C08171 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
            Object L$0;
            int label;

            public C08171(Continuation<? super C08171> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08171 c08171 = new C08171(continuation);
                c08171.L$0 = obj;
                return c08171;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChargeEpisodeService chargeEpisodeService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chargeEpisodeService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<PlayerAvailability> mutableStateFlow = this.this$0.f96389c.f91107a.f79286c;
                C08171 c08171 = new C08171(null);
                this.label = 1;
                if (FlowKt.first(mutableStateFlow, c08171, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.this$0.f96388b.getPass()) {
                ChargeEpisodeService chargeEpisodeService = this.this$0;
                Iterator it = chargeEpisodeService.f96388b.getPlayToastList().iterator();
                do {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                } while (((PlayToast) next).getBusiness() != PlayToastEnum.PLAYTOAST_CHARGINGPLUS);
                PlayToast playToast = (PlayToast) next;
                if (playToast != null) {
                    BLog.i("[ChargeBloc]", "charge show play toast");
                    ComponentActivity componentActivity = chargeEpisodeService.f96391e;
                    C2969h c2969hInflate = C2969h.inflate(componentActivity.getLayoutInflater());
                    c2969hInflate.f25910c.setText(playToast.getText());
                    BiliImageLoader.INSTANCE.with(componentActivity).url(playToast.getIconUrl()).into(c2969hInflate.f25909b);
                    chargeEpisodeService.f96390d.showToast(new PlayerToast.Builder().toastItemType(19).location(32).setCustomView(c2969hInflate.f25908a).duration(8000L).build());
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public ChargeEpisodeService(@NotNull CoroutineScope coroutineScope, @NotNull ChargingPlus chargingPlus, @NotNull h hVar, @NotNull IToastService iToastService, @NotNull ComponentActivity componentActivity) {
        this.f96387a = coroutineScope;
        this.f96388b = chargingPlus;
        this.f96389c = hVar;
        this.f96390d = iToastService;
        this.f96391e = componentActivity;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
