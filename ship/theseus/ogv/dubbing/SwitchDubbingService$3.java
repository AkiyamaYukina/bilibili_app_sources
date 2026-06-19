package com.bilibili.ship.theseus.ogv.dubbing;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.InteractLayerServiceKtxKt;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.OGVDubbingParam;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$3.class */
final class SwitchDubbingService$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final q this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$3$a.class */
    public static final class a implements ChronosRequestHandler<OGVDubbingParam.Request, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f91829a = Reflection.typeOf(OGVDubbingParam.Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f91830b;

        public a(q qVar) {
            this.f91830b = qVar;
        }

        public final Class<OGVDubbingParam.Request> getRequestClass() {
            return OGVDubbingParam.Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f91829a;
        }

        public final ChronosResponseWrapper<Unit> handle(OGVDubbingParam.Request request) {
            g gVar;
            OGVDubbingParam.Request request2 = request;
            boolean status = request2.getStatus();
            q qVar = this.f91830b;
            if (status) {
                qVar.d(qVar.h, request2.getRole());
            } else if (qVar.f91905u) {
                h hVar = qVar.f91902r;
                if (hVar != null) {
                    qVar.f91890e.hideWidget(hVar);
                }
            } else if (qVar.f91904t && (gVar = qVar.f91901q) != null) {
                gVar.dismiss();
            }
            return new ChronosResponseWrapper.Success(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchDubbingService$3(q qVar, Continuation<? super SwitchDubbingService$3> continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchDubbingService$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            q qVar = this.this$0;
            IInteractLayerService iInteractLayerService = qVar.f91891f;
            a aVar = new a(qVar);
            this.label = 1;
            if (InteractLayerServiceKtxKt.c(iInteractLayerService, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
