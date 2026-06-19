package com.bilibili.upper.module.topic.vm;

import ME0.e;
import android.app.Application;
import androidx.core.app.NotificationManagerCompat;
import ao0.C4809H;
import com.bilibili.base.BiliContext;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.upper.api.bean.topic.Topic;
import com.bilibili.upper.api.bean.topic.TopicListBean;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/topic/vm/TopicSearchViewModel$search$1.class */
public final class TopicSearchViewModel$search$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $keywords;
    int label;
    final TopicSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicSearchViewModel$search$1(String str, TopicSearchViewModel topicSearchViewModel, Continuation<? super TopicSearchViewModel$search$1> continuation) {
        super(2, continuation);
        this.$keywords = str;
        this.this$0 = topicSearchViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicSearchViewModel$search$1(this.$keywords, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$keywords;
            int i8 = this.this$0.f114071c;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            ((e) ServiceGenerator.createService(e.class)).searchTopic(str, i8, 20, i8 * 20).enqueue(new C4809H(cancellableContinuationImpl, 1));
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
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
        TopicListBean.Result result2 = ((TopicListBean) obj).result;
        int i9 = 0;
        if (this.this$0.f114071c == 0 && result2.isNewTopic && this.$keywords.length() > 0 && this.this$0.f114078k) {
            List list = result2.topics;
            String str2 = this.$keywords;
            Topic topic = new Topic();
            topic.state = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            topic.name = str2;
            Application application = BiliContext.application();
            topic.description = application != null ? application.getString(2131850383) : null;
            list.add(0, topic);
        }
        TopicSearchViewModel topicSearchViewModel = this.this$0;
        topicSearchViewModel.f114072d = result2.pageInfo.hasMore;
        if (topicSearchViewModel.f114071c != 0) {
            i9 = 1;
        }
        topicSearchViewModel.f114070b.postValue(new Pair<>(Boxing.boxInt(i9), result2.topics));
        TopicSearchViewModel topicSearchViewModel2 = this.this$0;
        if (topicSearchViewModel2.f114072d) {
            topicSearchViewModel2.f114071c++;
        }
        topicSearchViewModel2.f114076i = result2.tips;
        return Unit.INSTANCE;
    }
}
