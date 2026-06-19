package com.bilibili.ship.theseus.united.page.ad;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/ad/AdPanelRepository$onPanelShow$2.class */
final class AdPanelRepository$onPanelShow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final AdPanelRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPanelRepository$onPanelShow$2(AdPanelRepository adPanelRepository, Continuation<? super AdPanelRepository$onPanelShow$2> continuation) {
        super(2, continuation);
        this.this$0 = adPanelRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean invokeSuspend$lambda$0(com.bilibili.ship.theseus.united.page.ad.AdPanelRepository r3, boolean r4) {
        /*
            r0 = r3
            com.bilibili.ship.theseus.united.page.ad.AdPanelHelper r0 = r0.f98911k
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            boolean r0 = r0.b()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            r5 = r0
        L17:
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            r1 = r4
            boolean r0 = r0.c(r1)
            r4 = r0
            goto L47
        L24:
            r0 = r3
            com.bilibili.ship.theseus.united.page.ad.AdPanelHelper r0 = r0.f98912l
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L45
            r0 = r6
            r3 = r0
            r0 = r5
            boolean r0 = r0.b()
            if (r0 == 0) goto L38
            r0 = r5
            r3 = r0
        L38:
            r0 = r3
            if (r0 == 0) goto L45
            r0 = r3
            r1 = r4
            boolean r0 = r0.c(r1)
            r4 = r0
            goto L47
        L45:
            r0 = 0
            r4 = r0
        L47:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.ad.AdPanelRepository$onPanelShow$2.invokeSuspend$lambda$0(com.bilibili.ship.theseus.united.page.ad.AdPanelRepository, boolean):boolean");
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdPanelRepository$onPanelShow$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final AdPanelRepository adPanelRepository = this.this$0;
            BackActionRepository backActionRepository = adPanelRepository.h;
            Function1<? super Boolean, Boolean> function1 = new Function1(adPanelRepository) { // from class: com.bilibili.ship.theseus.united.page.ad.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final AdPanelRepository f98960a;

                {
                    this.f98960a = adPanelRepository;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(AdPanelRepository$onPanelShow$2.invokeSuspend$lambda$0(this.f98960a, ((Boolean) obj2).booleanValue()));
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
