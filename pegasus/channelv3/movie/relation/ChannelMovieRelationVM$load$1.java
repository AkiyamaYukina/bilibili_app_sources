package com.bilibili.pegasus.channelv3.movie.relation;

import androidx.lifecycle.MutableLiveData;
import com.bapis.bilibili.app.interfaces.v1.MediaMoss;
import com.bapis.bilibili.app.interfaces.v1.MediaMossKtxKt;
import com.bapis.bilibili.app.interfaces.v1.MediaRelationReply;
import com.bapis.bilibili.app.interfaces.v1.MediaRelationReq;
import com.bilibili.bililive.room.biz.shopping.view.coupon.v;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/ChannelMovieRelationVM$load$1.class */
final class ChannelMovieRelationVM$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMovieRelationVM$load$1(e eVar, Continuation<? super ChannelMovieRelationVM$load$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelMovieRelationVM$load$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        MediaRelationReply mediaRelationReply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                e eVar = this.this$0;
                d dVar = eVar.f75476k;
                long j7 = dVar.f75461a;
                if (dVar.f75465e) {
                    ((ArrayList) eVar.f75477l).clear();
                }
                this.this$0.f75478m.setValue(Resource.a.c(Resource.Companion));
                MediaMoss mediaMoss = new MediaMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                d dVar2 = this.this$0.f75476k;
                MediaRelationReq mediaRelationReqBuild = MediaRelationReq.newBuilder().setBizId(dVar2.f75461a).setBizType(dVar2.f75462b).setFeedId(dVar2.f75463c).setOffset(dVar2.f75464d).setPs(20).build();
                this.label = 1;
                Object objSuspendMediaRelation = MediaMossKtxKt.suspendMediaRelation(mediaMoss, mediaRelationReqBuild, this);
                obj = objSuspendMediaRelation;
                if (objSuspendMediaRelation == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            mediaRelationReply = (MediaRelationReply) obj;
        } catch (Exception e7) {
            BLog.i(this.this$0.f75467a, "response is error:" + e7);
            MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> mutableLiveData = this.this$0.f75478m;
            Resource.Companion.getClass();
            mutableLiveData.setValue(Resource.a.a(e7));
        }
        if (mediaRelationReply == null) {
            BLog.i(this.this$0.f75467a, "response is empty.");
            MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> mutableLiveData2 = this.this$0.f75478m;
            Resource.a aVar = Resource.Companion;
            Throwable th = new Throwable("no data.");
            aVar.getClass();
            mutableLiveData2.setValue(Resource.a.a(th));
            return Unit.INSTANCE;
        }
        this.this$0.f75476k.f75464d = mediaRelationReply.getOffset();
        this.this$0.f75476k.f75466f = mediaRelationReply.getHasMore();
        ((ArrayList) this.this$0.f75477l).addAll(SequencesKt.toList(SequencesKt.map(CollectionsKt.asSequence(mediaRelationReply.getListList()), new v(this.this$0.f75468b, 2))));
        MutableLiveData<Resource<Pair<Boolean, List<BasicIndexItem>>>> mutableLiveData3 = this.this$0.f75478m;
        Resource.a aVar2 = Resource.Companion;
        Pair pair = TuplesKt.to(Boxing.boxBoolean(mediaRelationReply.getHasMore()), this.this$0.f75477l);
        aVar2.getClass();
        mutableLiveData3.setValue(Resource.a.d(pair));
        return Unit.INSTANCE;
    }
}
