package com.bilibili.upper.module.honour.utils;

import android.content.Context;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.upper.module.honour.bean.KingHonourBattleInfoBean;
import com.bilibili.upper.module.honour.bean.KingHonourGameBean;
import com.bilibili.upper.module.honour.bean.KingHonourResponseBean;
import com.bilibili.upper.module.honour.net.KingHonourApiService;
import java.util.List;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourRecentBattle$hasKingHonourBattleInfo$1.class */
public final class KingHonourRecentBattle$hasKingHonourBattleInfo$1 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    final Context $context;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/utils/KingHonourRecentBattle$hasKingHonourBattleInfo$1$a.class */
    public static final class a extends BiliApiDataCallback<KingHonourResponseBean<KingHonourBattleInfoBean>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ProducerScope<Boolean> f113329b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ProducerScope<? super Boolean> producerScope) {
            this.f113329b = producerScope;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(KingHonourResponseBean<KingHonourBattleInfoBean> kingHonourResponseBean) {
            KingHonourBattleInfoBean kingHonourBattleInfoBean;
            KingHonourResponseBean<KingHonourBattleInfoBean> kingHonourResponseBean2 = kingHonourResponseBean;
            List<KingHonourGameBean> list = (kingHonourResponseBean2 == null || (kingHonourBattleInfoBean = kingHonourResponseBean2.result) == null) ? null : kingHonourBattleInfoBean.valor;
            boolean z6 = list == null || list.isEmpty();
            ProducerScope<Boolean> producerScope = this.f113329b;
            producerScope.trySend-JP2dKIU(Boolean.valueOf(!z6));
            SendChannel.DefaultImpls.close$default(producerScope, (Throwable) null, 1, (Object) null);
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            Boolean bool = Boolean.FALSE;
            ProducerScope<Boolean> producerScope = this.f113329b;
            producerScope.trySend-JP2dKIU(bool);
            SendChannel.DefaultImpls.close$default(producerScope, (Throwable) null, 1, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingHonourRecentBattle$hasKingHonourBattleInfo$1(Context context, Continuation<? super KingHonourRecentBattle$hasKingHonourBattleInfo$1> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KingHonourRecentBattle$hasKingHonourBattleInfo$1 kingHonourRecentBattle$hasKingHonourBattleInfo$1 = new KingHonourRecentBattle$hasKingHonourBattleInfo$1(this.$context, continuation);
        kingHonourRecentBattle$hasKingHonourBattleInfo$1.L$0 = obj;
        return kingHonourRecentBattle$hasKingHonourBattleInfo$1;
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
            BiliCall<GeneralResponse<KingHonourResponseBean<KingHonourBattleInfoBean>>> kingHonourBattleInfo = ((KingHonourApiService) ServiceGenerator.createService(KingHonourApiService.class)).getKingHonourBattleInfo(BiliAccounts.get(this.$context).getAccessKey());
            if (kingHonourBattleInfo != null) {
                kingHonourBattleInfo.enqueue(new a(producerScope));
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
