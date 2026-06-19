package com.bilibili.topix.create;

import Dd.k;
import com.bilibili.app.comm.list.common.utils.t;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.topix.api.TopicService;
import com.bilibili.topix.model.TopicTitleCheckResult;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.SerializersKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicViewModel$checkTitle$1.class */
final class CreateTopicViewModel$checkTitle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $title;
    private Object L$0;
    int label;
    final CreateTopicViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTopicViewModel$checkTitle$1(String str, CreateTopicViewModel createTopicViewModel, Continuation<? super CreateTopicViewModel$checkTitle$1> continuation) {
        super(2, continuation);
        this.$title = str;
        this.this$0 = createTopicViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateTopicViewModel$checkTitle$1 createTopicViewModel$checkTitle$1 = new CreateTopicViewModel$checkTitle$1(this.$title, this.this$0, continuation);
        createTopicViewModel$checkTitle$1.L$0 = obj;
        return createTopicViewModel$checkTitle$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = true;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                BiliCall<GeneralResponse<TopicTitleCheckResult>> parser = ((TopicService) ServiceGenerator.createService(TopicService.class)).checkTitleDuplicated(this.$title).setParser(new t(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(TopicTitleCheckResult.class))));
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = BiliCallExtKt.getData(parser, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            TopicTitleCheckResult topicTitleCheckResult = (TopicTitleCheckResult) obj;
            this.this$0.f112586e.setValue(topicTitleCheckResult != null ? topicTitleCheckResult.b : null);
            if (topicTitleCheckResult != null) {
                z6 = topicTitleCheckResult.a;
            }
            BLog.i("CreateTopicViewModel", "checking title " + this.$title + " duplicated: " + z6);
            if (JobKt.isActive(coroutineScope.getCoroutineContext()) && Intrinsics.areEqual(this.$title, this.this$0.J0())) {
                this.this$0.f112583b.setValue(z6 ? TitleStatus.Invalid : TitleStatus.Valid);
            }
        } catch (CancellationException e7) {
            k.b("checking title ", this.$title, " cancelled", "CreateTopicViewModel");
        } catch (Exception e8) {
            BLog.e("CreateTopicViewModel", "checking title " + this.$title + " failed", e8);
            this.this$0.f112583b.setValue(TitleStatus.Failed);
        }
        return Unit.INSTANCE;
    }
}
