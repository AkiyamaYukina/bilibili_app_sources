package com.bilibili.pegasus.channelv3.movie.detail;

import androidx.lifecycle.MutableLiveData;
import com.bapis.bilibili.app.interfaces.v1.MediaDetailReply;
import com.bapis.bilibili.app.interfaces.v1.MediaDetailReq;
import com.bapis.bilibili.app.interfaces.v1.MediaMoss;
import com.bapis.bilibili.app.interfaces.v1.MediaMossKtxKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/ChannelMovieDetailVM$loadDetail$1.class */
public final class ChannelMovieDetailVM$loadDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChannelMovieDetailVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMovieDetailVM$loadDetail$1(ChannelMovieDetailVM channelMovieDetailVM, Continuation<? super ChannelMovieDetailVM$loadDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = channelMovieDetailVM;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelMovieDetailVM$loadDetail$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MediaDetailReply mediaDetailReply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.f75357i.setValue(Resource.a.c(Resource.Companion));
                MediaMoss mediaMoss = new MediaMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                MediaDetailReq mediaDetailReqBuild = MediaDetailReq.newBuilder().setBizId(this.this$0.f75355f).setBizType(this.this$0.f75356g).build();
                this.label = 1;
                Object objSuspendMediaDetail = MediaMossKtxKt.suspendMediaDetail(mediaMoss, mediaDetailReqBuild, this);
                obj = objSuspendMediaDetail;
                if (objSuspendMediaDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            mediaDetailReply = (MediaDetailReply) obj;
        } catch (Exception e7) {
            BLog.i(this.this$0.f75350a, "response is error:" + e7);
            MutableLiveData<Resource<d>> mutableLiveData = this.this$0.f75357i;
            Resource.Companion.getClass();
            mutableLiveData.setValue(Resource.a.a(e7));
        }
        if (mediaDetailReply != null) {
            MutableLiveData<Resource<d>> mutableLiveData2 = this.this$0.f75357i;
            Resource.a aVar = Resource.Companion;
            d dVar = new d(mediaDetailReply);
            aVar.getClass();
            mutableLiveData2.setValue(Resource.a.d(dVar));
            return Unit.INSTANCE;
        }
        BLog.i(this.this$0.f75350a, "response is null.");
        MutableLiveData<Resource<d>> mutableLiveData3 = this.this$0.f75357i;
        Resource.a aVar2 = Resource.Companion;
        Throwable th = new Throwable("no data");
        aVar2.getClass();
        mutableLiveData3.setValue(Resource.a.a(th));
        return Unit.INSTANCE;
    }
}
