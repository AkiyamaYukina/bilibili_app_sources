package com.bilibili.topix.compose.create;

import com.bilibili.api.BiliApiException;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.topix.api.TopicService;
import com.bilibili.topix.model.TopicCreationResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.SerializersKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$createTopic$1.class */
final class TopicCreateViewModel$createTopic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TopicCreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicCreateViewModel$createTopic$1(TopicCreateViewModel topicCreateViewModel, Continuation<? super TopicCreateViewModel$createTopic$1> continuation) {
        super(2, continuation);
        this.this$0 = topicCreateViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicCreateViewModel$createTopic$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        E e7;
        C c7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
        } catch (Exception e8) {
            if (e8 instanceof BiliApiException) {
                BLog.e("TopicCreateViewModel", androidx.core.app.o.a(e8.mCode, "post topic failed, code ", ", msg ", e8.getMessage()), e8);
            } else {
                BLog.e("TopicCreateViewModel", "post topic failed", e8);
            }
            e7 = new E(null, e8);
        }
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c7 = (C) this.this$0.f112485d.getValue();
            BiliCall<GeneralResponse<TopicCreationResult>> parser = ((TopicService) ServiceGenerator.createService(TopicService.class)).postTopicCreate(StringsKt.trim(c7.f112454c.f112477a.f45498a.getText()).toString(), c7.f112455d.f112472a.f45498a.getText(), c7.f112458g ? "up_act" : c7.f112452a, c7.f112453b.getApiInt()).setParser(new com.bilibili.app.comm.list.common.utils.t(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(TopicCreationResult.class))));
            this.L$0 = c7;
            this.label = 1;
            Object data = BiliCallExtKt.getData(parser, this);
            obj = data;
            if (data == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            c7 = (C) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        TopicCreationResult topicCreationResult = (TopicCreationResult) obj;
        if (topicCreationResult != null) {
            topicCreationResult.e = c7.f112458g;
        } else {
            topicCreationResult = null;
        }
        e7 = new E(topicCreationResult, topicCreationResult == null ? new Throwable() : null);
        MutableStateFlow<C> mutableStateFlow = this.this$0.f112485d;
        C cA = C.a((C) mutableStateFlow.getValue(), null, null, null, null, null, false, e7, SearchBangumiItem.TYPE_FULLNET_BANGUMI);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow.emit(cA, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
