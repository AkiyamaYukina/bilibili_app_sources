package com.bilibili.pegasus.channelv2.detail.tab.baike;

import androidx.lifecycle.MutableLiveData;
import com.bilibili.bilifeed.card.FeedItem;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeFeedResponse;
import fo0.C7131a;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/ChannelBaikeViewModel$loadMoreFeedIfCould$1.class */
public final class ChannelBaikeViewModel$loadMoreFeedIfCould$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChannelBaikeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelBaikeViewModel$loadMoreFeedIfCould$1(ChannelBaikeViewModel channelBaikeViewModel, Continuation<? super ChannelBaikeViewModel$loadMoreFeedIfCould$1> continuation) {
        super(2, continuation);
        this.this$0 = channelBaikeViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelBaikeViewModel$loadMoreFeedIfCould$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BLog.i("ChannelBaikeViewModel", androidx.compose.ui.input.pointer.k.b(this.this$0.f75084j.getBid(), "start load more feed : bid->", " , offset->", this.this$0.f75084j.getDownOffset()));
            this.this$0.f75084j.setNid(0L);
            this.this$0.f75084j.setVertical(0L);
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
        if (resource.getStatus() == Status.SUCCESS) {
            ChannelBaikeFeedResponse channelBaikeFeedResponse = (ChannelBaikeFeedResponse) resource.getData();
            channelBaikeViewModel2.f75084j.setDownOffset(channelBaikeFeedResponse != null ? channelBaikeFeedResponse.getDownOffset() : null);
            MutableLiveData<Resource<List<FeedItem>>> mutableLiveData = channelBaikeViewModel2.f75088n;
            Resource.a aVar = Resource.Companion;
            List<FeedItem> items = null;
            if (channelBaikeFeedResponse != null) {
                items = channelBaikeFeedResponse.getItems();
            }
            aVar.getClass();
            mutableLiveData.setValue(Resource.a.d(items));
            channelBaikeViewModel2.f75092r.setValue(Boxing.boxBoolean(channelBaikeFeedResponse != null ? channelBaikeFeedResponse.getDownMore() : false));
        }
        ChannelBaikeViewModel channelBaikeViewModel3 = this.this$0;
        if (resource.getStatus() == Status.ERROR && resource.getError() != null) {
            Throwable error = resource.getError();
            MutableLiveData<Resource<List<FeedItem>>> mutableLiveData2 = channelBaikeViewModel3.f75088n;
            Resource.Companion.getClass();
            mutableLiveData2.setValue(Resource.a.a(error));
        }
        return Unit.INSTANCE;
    }
}
