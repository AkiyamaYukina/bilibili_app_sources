package com.bilibili.topix.compose.create;

import androidx.lifecycle.ViewModelKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$timer$1.class */
public final /* synthetic */ class TopicCreateViewModel$timer$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public TopicCreateViewModel$timer$1(Object obj) {
        super(1, obj, TopicCreateViewModel.class, "checkTitle", "checkTitle(Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        TopicCreateViewModel topicCreateViewModel = (TopicCreateViewModel) ((CallableReference) this).receiver;
        topicCreateViewModel.getClass();
        BLog.d("TopicCreateViewModel", "Checking title " + str);
        Job job = topicCreateViewModel.f112484c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        topicCreateViewModel.f112484c = BuildersKt.launch$default(ViewModelKt.getViewModelScope(topicCreateViewModel), (CoroutineContext) null, (CoroutineStart) null, new TopicCreateViewModel$checkTitle$1(TopicCreateViewModel.J0(str, true), topicCreateViewModel, str, null), 3, (Object) null);
    }
}
