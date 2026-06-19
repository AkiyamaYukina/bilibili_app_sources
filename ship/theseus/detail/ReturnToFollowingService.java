package com.bilibili.ship.theseus.detail;

import Ah0.InterfaceC1406f;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.ship.theseus.detail.ReturnToFollowingService;
import com.bilibili.ship.theseus.detail.di.x;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/ReturnToFollowingService.class */
@StabilityInferred(parameters = 0)
public final class ReturnToFollowingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90860a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.ReturnToFollowingService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/ReturnToFollowingService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BackActionRepository $backActionRepository;
        final x $intentData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BackActionRepository backActionRepository, x xVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$backActionRepository = backActionRepository;
            this.$intentData = xVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(x xVar, boolean z6) {
            if (xVar.f91031W == null) {
                return false;
            }
            InterfaceC1406f interfaceC1406f = (InterfaceC1406f) BLRouter.INSTANCE.get(InterfaceC1406f.class, "page_transfer_service");
            Bundle bundle = new Bundle();
            bundle.putString("i_transfer_match", xVar.f91031W);
            if (interfaceC1406f == null) {
                return false;
            }
            interfaceC1406f.a(bundle, new Ah0.j("theseus_detail", "theseus_detail", ""));
            return false;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$backActionRepository, this.$intentData, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                BackActionRepository backActionRepository = this.$backActionRepository;
                final x xVar = this.$intentData;
                Function1<? super Boolean, Boolean> function1 = new Function1(xVar) { // from class: com.bilibili.ship.theseus.detail.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final x f91065a;

                    {
                        this.f91065a = xVar;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(ReturnToFollowingService.AnonymousClass1.invokeSuspend$lambda$0(this.f91065a, ((Boolean) obj2).booleanValue()));
                    }
                };
                this.label = 1;
                if (backActionRepository.b(function1, this) == coroutine_suspended) {
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

    @Inject
    public ReturnToFollowingService(@NotNull CoroutineScope coroutineScope, @NotNull BackActionRepository backActionRepository, @NotNull x xVar) {
        this.f90860a = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(backActionRepository, xVar, null), 3, (Object) null);
    }
}
