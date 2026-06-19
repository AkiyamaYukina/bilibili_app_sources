package com.bilibili.ship.theseus.united.page.intro.module.merchandise;

import com.bilibili.gripper.api.ad.biz.videodetail.merchandise.AdMerchandisePanelState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandisePanelComponent$bindContent$result$1.class */
final class MerchandisePanelComponent$bindContent$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdMerchandisePanelState>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final f this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$result$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/merchandise/MerchandisePanelComponent$bindContent$result$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(350L, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchandisePanelComponent$bindContent$result$1(f fVar, Continuation<? super MerchandisePanelComponent$bindContent$result$1> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchandisePanelComponent$bindContent$result$1 merchandisePanelComponent$bindContent$result$1 = new MerchandisePanelComponent$bindContent$result$1(this.this$0, continuation);
        merchandisePanelComponent$bindContent$result$1.L$0 = obj;
        return merchandisePanelComponent$bindContent$result$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AdMerchandisePanelState> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:9:0x003e, B:36:0x0129, B:28:0x00cd, B:30:0x00d7, B:38:0x013e, B:40:0x014e, B:42:0x0159, B:45:0x0166, B:47:0x0176, B:51:0x0186, B:55:0x019c, B:57:0x01a5, B:58:0x01c4, B:15:0x0056, B:22:0x0099, B:24:0x00a2, B:26:0x00ab, B:17:0x0078), top: B:62:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013e A[Catch: all -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:9:0x003e, B:36:0x0129, B:28:0x00cd, B:30:0x00d7, B:38:0x013e, B:40:0x014e, B:42:0x0159, B:45:0x0166, B:47:0x0176, B:51:0x0186, B:55:0x019c, B:57:0x01a5, B:58:0x01c4, B:15:0x0056, B:22:0x0099, B:24:0x00a2, B:26:0x00ab, B:17:0x0078), top: B:62:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c4 A[Catch: all -> 0x0048, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0048, blocks: (B:9:0x003e, B:36:0x0129, B:28:0x00cd, B:30:0x00d7, B:38:0x013e, B:40:0x014e, B:42:0x0159, B:45:0x0166, B:47:0x0176, B:51:0x0186, B:55:0x019c, B:57:0x01a5, B:58:0x01c4, B:15:0x0056, B:22:0x0099, B:24:0x00a2, B:26:0x00ab, B:17:0x0078), top: B:62:0x000e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x011d -> B:36:0x0129). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.merchandise.MerchandisePanelComponent$bindContent$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
