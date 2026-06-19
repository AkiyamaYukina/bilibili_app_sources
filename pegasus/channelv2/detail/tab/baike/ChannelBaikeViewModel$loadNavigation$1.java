package com.bilibili.pegasus.channelv2.detail.tab.baike;

import androidx.compose.foundation.text.C0;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeNavigation;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeNavigationItem;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeNavigationResponse;
import fo0.C7131a;
import fo0.InterfaceC7135e;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/ChannelBaikeViewModel$loadNavigation$1.class */
public final class ChannelBaikeViewModel$loadNavigation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChannelBaikeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelBaikeViewModel$loadNavigation$1(ChannelBaikeViewModel channelBaikeViewModel, Continuation<? super ChannelBaikeViewModel$loadNavigation$1> continuation) {
        super(2, continuation);
        this.this$0 = channelBaikeViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelBaikeViewModel$loadNavigation$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C0.c(this.this$0.f75084j.getBid(), "start load navigation :", "ChannelBaikeViewModel");
            ChannelBaikeViewModel channelBaikeViewModel = this.this$0;
            C7131a c7131a = channelBaikeViewModel.f75082g;
            this.label = 1;
            Object result = BiliCallExtKt.getResult(((InterfaceC7135e) c7131a.f118535a.getValue()).getChannelBaikeNavigation(channelBaikeViewModel.f75083i.getBid()), this);
            obj = result;
            if (result == coroutine_suspended) {
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
            ChannelBaikeNavigationResponse channelBaikeNavigationResponse = (ChannelBaikeNavigationResponse) resource.getData();
            defpackage.a.b("current navigation version:", channelBaikeNavigationResponse != null ? channelBaikeNavigationResponse.getVersion() : null, "ChannelBaikeViewModel");
            channelBaikeViewModel2.f75084j.setVersion(channelBaikeNavigationResponse != null ? channelBaikeNavigationResponse.getVersion() : null);
            channelBaikeViewModel2.f75089o.setValue(channelBaikeNavigationResponse != null ? channelBaikeNavigationResponse.getBaikeTree() : null);
            channelBaikeViewModel2.f75090p.setValue(channelBaikeNavigationResponse != null ? channelBaikeNavigationResponse.getBaikeInfo() : null);
            MutableLiveData<Resource<List<ChannelBaikeNavigationItem>>> mutableLiveData = channelBaikeViewModel2.f75085k;
            Resource.a aVar = Resource.Companion;
            List<ChannelBaikeNavigationItem> list = null;
            if (channelBaikeNavigationResponse != null) {
                ChannelBaikeNavigation navigation = channelBaikeNavigationResponse.getNavigation();
                list = null;
                if (navigation != null) {
                    list = navigation.getList();
                }
            }
            aVar.getClass();
            mutableLiveData.setValue(Resource.a.d(list));
        }
        ChannelBaikeViewModel channelBaikeViewModel3 = this.this$0;
        if (resource.getStatus() == Status.ERROR && resource.getError() != null) {
            Throwable error = resource.getError();
            MutableLiveData<Resource<List<ChannelBaikeNavigationItem>>> mutableLiveData2 = channelBaikeViewModel3.f75085k;
            Resource.Companion.getClass();
            mutableLiveData2.setValue(Resource.a.a(error));
        }
        return Unit.INSTANCE;
    }
}
