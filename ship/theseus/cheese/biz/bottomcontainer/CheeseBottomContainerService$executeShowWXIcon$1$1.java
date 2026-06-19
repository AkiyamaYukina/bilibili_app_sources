package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService;
import java.lang.ref.WeakReference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$executeShowWXIcon$1$1.class */
public final class CheeseBottomContainerService$executeShowWXIcon$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final View $button;
    final WeakReference<CheeseBottomContainerService> $weakSelf;
    final String $wxIcon;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerService$executeShowWXIcon$1$1(WeakReference<CheeseBottomContainerService> weakReference, View view, String str, Continuation<? super CheeseBottomContainerService$executeShowWXIcon$1$1> continuation) {
        super(2, continuation);
        this.$weakSelf = weakReference;
        this.$button = view;
        this.$wxIcon = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseBottomContainerService$executeShowWXIcon$1$1(this.$weakSelf, this.$button, this.$wxIcon, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CheeseBottomContainerService cheeseBottomContainerService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            cheeseBottomContainerService = this.$weakSelf.get();
            if (cheeseBottomContainerService != null) {
                View view = this.$button;
                String str = this.$wxIcon;
                this.L$0 = cheeseBottomContainerService;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                BiliImageLoader.INSTANCE.acquire(view).useOrigin().asDrawable().url(str).submit().subscribe(new ci1.e(cancellableContinuationImpl, 1));
                obj = cancellableContinuationImpl.getResult();
                if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cheeseBottomContainerService = (CheeseBottomContainerService) this.L$0;
        ResultKt.throwOnFailure(obj);
        Drawable drawable = (Drawable) obj;
        if (cheeseBottomContainerService.f89027d.isFinishing() || cheeseBottomContainerService.f89027d.isDestroyed()) {
            return Unit.INSTANCE;
        }
        n nVar = cheeseBottomContainerService.f89018B;
        if (nVar != null) {
            nVar.f89097b.f89067p.setValue(drawable);
        }
        cheeseBottomContainerService.f89022F = CheeseBottomContainerService.ConsultButtonStatus.WXIcon;
        return Unit.INSTANCE;
    }
}
