package com.bilibili.pegasus.channelv2.detail.tab.baike;

import androidx.compose.runtime.snapshots.z;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.v;
import com.bilibili.bilifeed.card.FeedItem;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeFeedResponse;
import fo0.C7131a;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/ChannelBaikeViewModel$reloadFeed$1.class */
public final class ChannelBaikeViewModel$reloadFeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $nid;
    int label;
    final ChannelBaikeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelBaikeViewModel$reloadFeed$1(ChannelBaikeViewModel channelBaikeViewModel, long j7, Continuation<? super ChannelBaikeViewModel$reloadFeed$1> continuation) {
        super(2, continuation);
        this.this$0 = channelBaikeViewModel;
        this.$nid = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelBaikeViewModel$reloadFeed$1(this.this$0, this.$nid, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            v.a(z.a(this.this$0.f75084j.getBid(), "start reload feed : bid->", " , nid->"), this.$nid, "ChannelBaikeViewModel");
            this.this$0.f75084j.setNid(this.$nid);
            this.this$0.f75084j.setVertical(0L);
            this.this$0.f75084j.setDownOffset(null);
            this.this$0.f75084j.setUpOffset(null);
            ChannelBaikeViewModel channelBaikeViewModel = this.this$0;
            C7131a c7131a = channelBaikeViewModel.f75082g;
            this.label = 1;
            Object objA = c7131a.a(channelBaikeViewModel.f75084j, this);
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
        Resource resource = (Resource) obj;
        ChannelBaikeViewModel channelBaikeViewModel2 = this.this$0;
        long j7 = this.$nid;
        if (resource.getStatus() == Status.SUCCESS) {
            ChannelBaikeFeedResponse channelBaikeFeedResponse = (ChannelBaikeFeedResponse) resource.getData();
            channelBaikeViewModel2.f75084j.setUpOffset(channelBaikeFeedResponse != null ? channelBaikeFeedResponse.getUpOffset() : null);
            channelBaikeViewModel2.f75084j.setDownOffset(channelBaikeFeedResponse != null ? channelBaikeFeedResponse.getDownOffset() : null);
            channelBaikeViewModel2.f75091q.setValue(channelBaikeFeedResponse != null ? Boxing.boxBoolean(channelBaikeFeedResponse.getUpMore()) : null);
            channelBaikeViewModel2.f75092r.setValue(channelBaikeFeedResponse != null ? Boxing.boxBoolean(channelBaikeFeedResponse.getDownMore()) : null);
            MutableLiveData<Resource<Pair<Long, List<FeedItem>>>> mutableLiveData = channelBaikeViewModel2.f75086l;
            Resource.a aVar = Resource.Companion;
            Long lBoxLong = Boxing.boxLong(j7);
            List<FeedItem> items = null;
            if (channelBaikeFeedResponse != null) {
                items = channelBaikeFeedResponse.getItems();
            }
            Pair pair = TuplesKt.to(lBoxLong, items);
            aVar.getClass();
            mutableLiveData.setValue(Resource.a.d(pair));
            channelBaikeViewModel2.f75080e = false;
        }
        ChannelBaikeViewModel channelBaikeViewModel3 = this.this$0;
        if (resource.getStatus() == Status.ERROR && resource.getError() != null) {
            Throwable error = resource.getError();
            MutableLiveData<Resource<Pair<Long, List<FeedItem>>>> mutableLiveData2 = channelBaikeViewModel3.f75086l;
            Resource.Companion.getClass();
            mutableLiveData2.setValue(Resource.a.a(error));
        }
        return Unit.INSTANCE;
    }
}
