package com.bilibili.topix.create;

import androidx.lifecycle.MutableLiveData;
import com.bilibili.app.comm.list.common.utils.t;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.topix.api.TopicService;
import com.bilibili.topix.model.TopicCreateLimit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializersKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicViewModel$loadLimitInfo$1.class */
final class CreateTopicViewModel$loadLimitInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final CreateTopicViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTopicViewModel$loadLimitInfo$1(CreateTopicViewModel createTopicViewModel, Continuation<? super CreateTopicViewModel$loadLimitInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = createTopicViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTopicViewModel$loadLimitInfo$1(this.this$0, continuation);
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
                TopicService topicService = (TopicService) ServiceGenerator.createService(TopicService.class);
                String str = (String) this.this$0.f112582a.get("topic_current_scene");
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                BiliCall<GeneralResponse<TopicCreateLimit>> parser = topicService.createTopicLimit(str2).setParser(new t(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(TopicCreateLimit.class))));
                this.label = 1;
                Object data = BiliCallExtKt.getData(parser, this);
                obj = data;
                if (data == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TopicCreateLimit topicCreateLimit = (TopicCreateLimit) obj;
            BLog.i("CreateTopicViewModel", "Topic create limit info " + topicCreateLimit + " valid " + (topicCreateLimit != null ? Boxing.boxBoolean(topicCreateLimit.a()) : null));
            if (topicCreateLimit == null || !topicCreateLimit.a()) {
                MutableLiveData<Resource<TopicCreateLimit>> mutableLiveData = this.this$0.f112585d;
                Resource.a aVar = Resource.Companion;
                Throwable th = new Throwable();
                aVar.getClass();
                mutableLiveData.setValue(Resource.a.a(th));
            } else {
                MutableLiveData<Resource<TopicCreateLimit>> mutableLiveData2 = this.this$0.f112585d;
                Resource.Companion.getClass();
                mutableLiveData2.setValue(Resource.a.d(topicCreateLimit));
            }
        } catch (Exception e7) {
            BLog.e("CreateTopicViewModel", "Create topic page information interface failed", e7);
            MutableLiveData<Resource<TopicCreateLimit>> mutableLiveData3 = this.this$0.f112585d;
            Resource.Companion.getClass();
            mutableLiveData3.setValue(Resource.a.a(e7));
        }
        return Unit.INSTANCE;
    }
}
