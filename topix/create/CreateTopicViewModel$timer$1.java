package com.bilibili.topix.create;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicViewModel$timer$1.class */
public final /* synthetic */ class CreateTopicViewModel$timer$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    public CreateTopicViewModel$timer$1(Object obj) {
        super(1, obj, CreateTopicViewModel.class, "checkTitle", "checkTitle(Ljava/lang/String;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        CreateTopicViewModel createTopicViewModel = (CreateTopicViewModel) ((CallableReference) this).receiver;
        createTopicViewModel.getClass();
        BLog.d("CreateTopicViewModel", "Checking title " + str);
        Job job = createTopicViewModel.f112588g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (com.bilibili.topix.utils.a.a(str) < 6) {
            BLog.d("CreateTopicViewModel", "title too short, skip check");
            createTopicViewModel.f112586e.setValue(null);
        } else {
            createTopicViewModel.f112583b.setValue(TitleStatus.Loading);
            createTopicViewModel.f112588g = BuildersKt.launch$default(ViewModelKt.getViewModelScope(createTopicViewModel), (CoroutineContext) null, (CoroutineStart) null, new CreateTopicViewModel$checkTitle$1(str, createTopicViewModel, null), 3, (Object) null);
        }
    }
}
