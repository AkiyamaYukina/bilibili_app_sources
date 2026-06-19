package com.bilibili.topix.create;

import androidx.core.app.o;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.utils.t;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.topix.api.TopicService;
import com.bilibili.topix.model.TopicCreationResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializersKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicViewModel$postTopicCreation$1.class */
final class CreateTopicViewModel$postTopicCreation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $topicType;
    int label;
    final CreateTopicViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTopicViewModel$postTopicCreation$1(CreateTopicViewModel createTopicViewModel, int i7, Continuation<? super CreateTopicViewModel$postTopicCreation$1> continuation) {
        super(2, continuation);
        this.this$0 = createTopicViewModel;
        this.$topicType = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTopicViewModel$postTopicCreation$1(this.this$0, this.$topicType, continuation);
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
                String strJ0 = this.this$0.J0();
                String strI0 = this.this$0.I0();
                String str = (String) this.this$0.f112582a.get("topic_current_scene");
                String str2 = str;
                if (str == null) {
                    str2 = "";
                }
                BiliCall<GeneralResponse<TopicCreationResult>> parser = topicService.postTopicCreate(strJ0, strI0, str2, this.$topicType).setParser(new t(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(TopicCreationResult.class))));
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
            TopicCreationResult topicCreationResult = (TopicCreationResult) obj;
            if (topicCreationResult != null) {
                MutableLiveData<Resource<TopicCreationResult>> mutableLiveData = this.this$0.f112584c;
                Resource.Companion.getClass();
                mutableLiveData.setValue(Resource.a.d(topicCreationResult));
            } else {
                MutableLiveData<Resource<TopicCreationResult>> mutableLiveData2 = this.this$0.f112584c;
                Resource.a aVar = Resource.Companion;
                Throwable th = new Throwable();
                aVar.getClass();
                mutableLiveData2.setValue(Resource.a.a(th));
            }
        } catch (Exception e7) {
            MutableLiveData<Resource<TopicCreationResult>> mutableLiveData3 = this.this$0.f112584c;
            Resource.Companion.getClass();
            mutableLiveData3.setValue(Resource.a.a(e7));
            if (e7 instanceof BiliApiException) {
                BLog.e("CreateTopicViewModel", o.a(e7.mCode, "post topic failed, code ", ", msg ", e7.getMessage()), e7);
            } else {
                BLog.e("CreateTopicViewModel", "post topic failed", e7);
            }
        }
        return Unit.INSTANCE;
    }
}
