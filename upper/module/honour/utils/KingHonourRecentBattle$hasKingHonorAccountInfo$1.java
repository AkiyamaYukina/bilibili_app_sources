package com.bilibili.upper.module.honour.utils;

import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.upper.module.honour.bean.KingHonourAccountBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import com.bilibili.upper.module.honour.net.KingHonourApiService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourRecentBattle$hasKingHonorAccountInfo$1.class */
public final class KingHonourRecentBattle$hasKingHonorAccountInfo$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourRecentBattle$hasKingHonorAccountInfo$1$a.class */
    public static final class a extends BiliApiDataCallback<KingHonourResponseBean<KingHonourAccountBean>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProducerScope<Boolean> f113328b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ProducerScope<? super Boolean> producerScope) {
            this.f113328b = producerScope;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(KingHonourResponseBean<KingHonourAccountBean> kingHonourResponseBean) {
            KingHonourResponseBean<KingHonourAccountBean> kingHonourResponseBean2 = kingHonourResponseBean;
            KingHonourAccountBean kingHonourAccountBean = kingHonourResponseBean2 != null ? kingHonourResponseBean2.result : null;
            ProducerScope<Boolean> producerScope = this.f113328b;
            if (kingHonourAccountBean == null) {
                producerScope.trySend-JP2dKIU(Boolean.FALSE);
                SendChannel.DefaultImpls.close$default(producerScope, (Throwable) null, 1, (Object) null);
            } else {
                KingHonourAccountBean kingHonourAccountBean2 = kingHonourResponseBean2.result;
                producerScope.trySend-JP2dKIU(Boolean.valueOf(kingHonourAccountBean2.isBind && kingHonourAccountBean2.isScenceGrant));
                SendChannel.DefaultImpls.close$default(producerScope, (Throwable) null, 1, (Object) null);
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            Boolean bool = Boolean.FALSE;
            ProducerScope<Boolean> producerScope = this.f113328b;
            producerScope.trySend-JP2dKIU(bool);
            SendChannel.DefaultImpls.close$default(producerScope, (Throwable) null, 1, (Object) null);
        }
    }

    public KingHonourRecentBattle$hasKingHonorAccountInfo$1(Continuation<? super KingHonourRecentBattle$hasKingHonorAccountInfo$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KingHonourRecentBattle$hasKingHonorAccountInfo$1 kingHonourRecentBattle$hasKingHonorAccountInfo$1 = new KingHonourRecentBattle$hasKingHonorAccountInfo$1(continuation);
        kingHonourRecentBattle$hasKingHonorAccountInfo$1.L$0 = obj;
        return kingHonourRecentBattle$hasKingHonorAccountInfo$1;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourAccountBean>>> bindingContent = ((KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class)).getBindingContent();
            if (bindingContent != null) {
                bindingContent.enqueue(new a(producerScope));
            }
            ?? obj2 = new Object();
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, (Function0) obj2, this) == coroutine_suspended) {
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
