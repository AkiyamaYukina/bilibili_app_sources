package com.bilibili.ship.theseus.united.player.oldway;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.delegate.DelegateStoreKey;
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
import yk.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/PlayerCommonActionDelegateService.class */
@StabilityInferred(parameters = 1)
public final class PlayerCommonActionDelegateService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.PlayerCommonActionDelegateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/PlayerCommonActionDelegateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final yk.c $delegate;
        final Er0.a $delegateStoreService;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Er0.a aVar, yk.c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$delegateStoreService = aVar;
            this.$delegate = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$delegateStoreService, this.$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            DelegateStoreKey<?> delegateStoreKey = c.a.a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$delegateStoreService.put(delegateStoreKey, this.$delegate);
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
                this.$delegateStoreService.remove(delegateStoreKey);
                throw th;
            }
        }
    }

    @Inject
    public PlayerCommonActionDelegateService(@NotNull Er0.a aVar, @NotNull yk.c cVar, @NotNull CoroutineScope coroutineScope) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(aVar, cVar, null), 3, (Object) null);
    }
}
