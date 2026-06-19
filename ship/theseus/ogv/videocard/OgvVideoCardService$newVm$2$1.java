package com.bilibili.ship.theseus.ogv.videocard;

import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.united.utils.q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$newVm$2$1.class */
final class OgvVideoCardService$newVm$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final i $vm;
    int label;
    final OgvVideoCardService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardService$newVm$2$1(OgvVideoCardService ogvVideoCardService, i iVar, Continuation<? super OgvVideoCardService$newVm$2$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvVideoCardService;
        this.$vm = iVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVideoCardService$newVm$2$1(this.this$0, this.$vm, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        i iVar;
        i next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvVideoCardService ogvVideoCardService = this.this$0;
            OgvVideoCardApiService ogvVideoCardApiService = ogvVideoCardService.f94643n;
            i iVar2 = this.$vm;
            String str = iVar2.f94747f;
            boolean z6 = iVar2.f94763w;
            Long l7 = iVar2.f94749i;
            int i8 = iVar2.f94739R;
            String str2 = iVar2.f94748g;
            this.label = 1;
            Object objA = a.a(ogvVideoCardApiService, str, ogvVideoCardService.h, ogvVideoCardService.f94648s, !z6, l7, i8, str2, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        OgvVideoCardService ogvVideoCardService2 = this.this$0;
        i iVar3 = this.$vm;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            q.c(((BiliApiResponse.BusinessFailure) biliApiResponse).getMessage());
            ogvVideoCardService2.l(false, iVar3, !iVar3.f94763w);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            q.c(ogvVideoCardService2.f94636f.getString(2131854818));
            ogvVideoCardService2.l(false, iVar3, !iVar3.f94763w);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            PlayerCardResultVO playerCardResultVO = (PlayerCardResultVO) ((BiliApiResponse.Success) biliApiResponse).getData();
            ogvVideoCardService2.l(true, iVar3, !iVar3.f94763w);
            ogvVideoCardService2.d(iVar3);
            if (playerCardResultVO.c().length() > 0) {
                q.c(playerCardResultVO.c());
            }
            OgvVideoCardService.a(ogvVideoCardService2, playerCardResultVO.a());
            ArrayList<i> arrayList = ogvVideoCardService2.f94650u;
            if (arrayList != null) {
                Iterator<i> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    i iVar4 = next;
                    if (iVar4.f94731J != 3 && (!iVar4.f94763w || iVar4.f94762v || iVar4.f94730I)) {
                        if (iVar4.f94753m == 1) {
                            break;
                        }
                    }
                }
                iVar = next;
            } else {
                iVar = null;
            }
            if (iVar != null) {
                iVar.f94731J = 1;
                iVar.s(BuildersKt.launch$default(ogvVideoCardService2.f94632b, (CoroutineContext) null, (CoroutineStart) null, new OgvVideoCardService$checkAndShowImmediateVideoCard$1(iVar, ogvVideoCardService2, null), 3, (Object) null));
                ogvVideoCardService2.j(ogvVideoCardService2.f94635e.F());
            }
        }
        return Unit.INSTANCE;
    }
}
