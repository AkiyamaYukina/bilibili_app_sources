package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.alipay.sdk.app.PayTask;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6989h;
import eu0.C7002u;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import nu0.C8142a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/CheeseBottomContainerService$showConsultBubble$1$1.class */
public final class CheeseBottomContainerService$showConsultBubble$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final WeakReference<View> $weakBtn;
    final WeakReference<CheeseBottomContainerService> $weakSelf;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseBottomContainerService$showConsultBubble$1$1(WeakReference<CheeseBottomContainerService> weakReference, WeakReference<View> weakReference2, Continuation<? super CheeseBottomContainerService$showConsultBubble$1$1> continuation) {
        super(2, continuation);
        this.$weakSelf = weakReference;
        this.$weakBtn = weakReference2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0$0(CheeseBottomContainerService cheeseBottomContainerService) {
        cheeseBottomContainerService.c();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseBottomContainerService$showConsultBubble$1$1(this.$weakSelf, this.$weakBtn, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        C6989h c6989h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(PayTask.f60018j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final CheeseBottomContainerService cheeseBottomContainerService = this.$weakSelf.get();
        if (cheeseBottomContainerService != null) {
            WeakReference<View> weakReference = this.$weakBtn;
            FragmentActivity fragmentActivity = cheeseBottomContainerService.f89027d;
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                return Unit.INSTANCE;
            }
            View view = weakReference.get();
            if (view != null) {
                cheeseBottomContainerService.f89022F = CheeseBottomContainerService.ConsultButtonStatus.WXBubbleStay;
                PageReportService.i(cheeseBottomContainerService.f89037o, "pugv.detail.consult.consult-popup.show", null, 6);
                Lazy lazy = C8142a.f124388a;
                C7002u c7002u = cheeseBottomContainerService.f89028e.f117578c;
                String str = (c7002u == null || (c6989h = c7002u.f117586f) == null) ? null : c6989h.f117536a;
                String str2 = null;
                if (c7002u != null) {
                    C6989h c6989h2 = c7002u.f117586f;
                    str2 = null;
                    if (c6989h2 != null) {
                        str2 = c6989h2.f117538c;
                    }
                }
                C8142a.c(view, str, str2, true, new Function0(cheeseBottomContainerService) { // from class: com.bilibili.ship.theseus.cheese.biz.bottomcontainer.l

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheeseBottomContainerService f89092a;

                    {
                        this.f89092a = cheeseBottomContainerService;
                    }

                    public final Object invoke() {
                        return CheeseBottomContainerService$showConsultBubble$1$1.invokeSuspend$lambda$0$0$0(this.f89092a);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
