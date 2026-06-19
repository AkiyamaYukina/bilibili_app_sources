package com.bilibili.pegasus.channelv3.movie.head;

import androidx.lifecycle.MutableLiveData;
import com.bapis.bilibili.app.interfaces.v1.MediaFollowReply;
import com.bapis.bilibili.app.interfaces.v1.MediaFollowReq;
import com.bapis.bilibili.app.interfaces.v1.MediaMoss;
import com.bapis.bilibili.app.interfaces.v1.MediaMossKtxKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/ChannelMovieHeadVM$followMovie$1.class */
final class ChannelMovieHeadVM$followMovie$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChannelMovieHeadVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMovieHeadVM$followMovie$1(ChannelMovieHeadVM channelMovieHeadVM, Continuation<? super ChannelMovieHeadVM$followMovie$1> continuation) {
        super(2, continuation);
        this.this$0 = channelMovieHeadVM;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelMovieHeadVM$followMovie$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MediaMoss mediaMoss = new MediaMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                MediaFollowReq mediaFollowReqBuild = MediaFollowReq.newBuilder().setId(this.this$0.f75382d.f75403d).setType(this.this$0.f75382d.f75405f).build();
                this.label = 1;
                Object objSuspendMediaFollow = MediaMossKtxKt.suspendMediaFollow(mediaMoss, mediaFollowReqBuild, this);
                obj = objSuspendMediaFollow;
                if (objSuspendMediaFollow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((MediaFollowReply) obj) != null) {
                ChannelMovieHeadVM channelMovieHeadVM = this.this$0;
                c cVar = channelMovieHeadVM.f75382d;
                boolean z6 = !cVar.f75406g;
                cVar.f75406g = z6;
                MutableLiveData<Resource<Boolean>> mutableLiveData = channelMovieHeadVM.f75387j;
                Resource.a aVar = Resource.Companion;
                Boolean boolBoxBoolean = Boxing.boxBoolean(z6);
                aVar.getClass();
                mutableLiveData.setValue(Resource.a.d(boolBoxBoolean));
            }
        } catch (Exception e7) {
            MutableLiveData<Resource<Boolean>> mutableLiveData2 = this.this$0.f75387j;
            Resource.Companion.getClass();
            mutableLiveData2.setValue(Resource.a.a(e7));
            BLog.e(this.this$0.f75379a, "update follow button error.", e7);
        }
        return Unit.INSTANCE;
    }
}
