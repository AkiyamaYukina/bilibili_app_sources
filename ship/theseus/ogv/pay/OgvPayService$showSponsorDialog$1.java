package com.bilibili.ship.theseus.ogv.pay;

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
import xl0.C8986a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvPayService$showSponsorDialog$1.class */
public final class OgvPayService$showSponsorDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final OgvPayService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvPayService$showSponsorDialog$1$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvPayService f94163a;

        public a(OgvPayService ogvPayService) {
            this.f94163a = ogvPayService;
        }

        public final void a(int i7) {
            OgvPayService ogvPayService = this.f94163a;
            if (!ogvPayService.f94158g.isLogin()) {
                Qj0.g.e(ogvPayService.f94154c, C8986a.a());
            } else if (ogvPayService.b()) {
                BuildersKt.launch$default(ogvPayService.f94152a, (CoroutineContext) null, (CoroutineStart) null, new OgvPayService$sponsor$1(ogvPayService, i7, null), 3, (Object) null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPayService$showSponsorDialog$1(OgvPayService ogvPayService, Continuation<? super OgvPayService$showSponsorDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPayService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPayService$showSponsorDialog$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.ogv.pay.sponsor.b bVar;
        com.bilibili.ship.theseus.ogv.pay.sponsor.b bVar2;
        com.bilibili.ship.theseus.ogv.pay.sponsor.b bVar3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvPayService ogvPayService = this.this$0;
            bVar = new com.bilibili.ship.theseus.ogv.pay.sponsor.b(ogvPayService.f94154c, ogvPayService.h);
            bVar.f94253w = new a(this.this$0);
            bVar.show();
            try {
                this.L$0 = bVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                bVar2 = bVar;
                bVar2.dismiss();
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bilibili.ship.theseus.ogv.pay.sponsor.b bVar4 = (com.bilibili.ship.theseus.ogv.pay.sponsor.b) this.L$0;
            bVar3 = bVar4;
            try {
                ResultKt.throwOnFailure(obj);
                bVar = bVar4;
            } catch (Throwable th2) {
                bVar2 = bVar3;
                th = th2;
                bVar2.dismiss();
                throw th;
            }
        }
        bVar3 = bVar;
        throw new KotlinNothingValueException();
    }
}
