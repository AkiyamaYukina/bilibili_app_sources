package com.bilibili.ship.theseus.ogv.media;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.IToastServiceKtxKt;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/VipAdFreeToastService.class */
@StabilityInferred(parameters = 1)
public final class VipAdFreeToastService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.VipAdFreeToastService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/VipAdFreeToastService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.keel.player.h $player;
        final IToastService $toastService;
        final String $vipAdFreeToastText;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.media.VipAdFreeToastService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/VipAdFreeToastService$1$1.class */
        public static final class C07391 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public C07391(Continuation<? super C07391> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07391 c07391 = new C07391(continuation);
                c07391.Z$0 = ((Boolean) obj).booleanValue();
                return c07391;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.keel.player.h hVar, String str, IToastService iToastService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$player = hVar;
            this.$vipAdFreeToastText = str;
            this.$toastService = iToastService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$player, this.$vipAdFreeToastText, this.$toastService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Boolean> flowD = CompoundPlayStateProviderKt.d(this.$player);
                C07391 c07391 = new C07391(null);
                this.label = 1;
                if (FlowKt.first(flowD, c07391, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            PlayerToast playerToastBuild = new PlayerToast.Builder().location(32).setExtraString("extra_title", this.$vipAdFreeToastText).toastItemType(17).duration(5000L).build();
            IToastService iToastService = this.$toastService;
            this.label = 2;
            if (IToastServiceKtxKt.a(iToastService, playerToastBuild, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public VipAdFreeToastService(@NotNull CoroutineScope coroutineScope, @Nullable String str, @NotNull IToastService iToastService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(hVar, str, iToastService, null), 3, (Object) null);
    }
}
