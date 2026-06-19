package com.bilibili.mini.player.biz;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qh0.InterfaceC8430a;
import sh0.C8594c;
import sh0.InterfaceC8593b;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/DefaultMiniPlayerBizManager$loadAIRelates$1.class */
final class DefaultMiniPlayerBizManager$loadAIRelates$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Video.PlayableParams $params;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMiniPlayerBizManager$loadAIRelates$1(b bVar, Video.PlayableParams playableParams, Continuation<? super DefaultMiniPlayerBizManager$loadAIRelates$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$params = playableParams;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultMiniPlayerBizManager$loadAIRelates$1(this.this$0, this.$params, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        List list;
        InterfaceC8430a interfaceC8430aD;
        List list2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BLog.i("DefaultMiniPlayerBizManager", "start to load ai relates.");
            InterfaceC8593b interfaceC8593bA = ((C8594c) this.this$0.f66036b.getValue()).a(this.$params.getClass());
            if (interfaceC8593bA == null || (interfaceC8430aD = interfaceC8593bA.d()) == null) {
                list = null;
                list2 = list;
                if (list2 != null || list2.isEmpty()) {
                    this.this$0.f66048o = false;
                    return Unit.INSTANCE;
                }
                this.this$0.f66035a.addAll(list2);
                b bVar = this.this$0;
                bVar.f66047n = list.size() + bVar.f66047n;
                this.this$0.f66044k = null;
                return Unit.INSTANCE;
            }
            Video.PlayableParams playableParams = this.$params;
            int i8 = this.this$0.f66040f;
            this.label = 1;
            Object objA = interfaceC8430aD.a(playableParams, i8, this);
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
        list = (List) obj;
        list2 = list;
        if (list2 != null) {
        }
        this.this$0.f66048o = false;
        return Unit.INSTANCE;
    }
}
