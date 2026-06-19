package com.bilibili.upper.module.draft.vm;

import androidx.lifecycle.MutableLiveData;
import bilibili.live.app.service.resolver.c;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import com.bilibili.studio.videoeditor.template.bean.BiliDraftInfo;
import com.bilibili.studio.videoeditor.util.U;
import com.bilibili.upper.module.draft.bean.DraftItemBean;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/draft/vm/DraftViewModel$getBCutDraftsData$1$1.class */
final class DraftViewModel$getBCutDraftsData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BiliTemplateEngineManager $it;
    int label;
    final DraftViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftViewModel$getBCutDraftsData$1$1(BiliTemplateEngineManager biliTemplateEngineManager, DraftViewModel draftViewModel, Continuation<? super DraftViewModel$getBCutDraftsData$1$1> continuation) {
        super(2, continuation);
        this.$it = biliTemplateEngineManager;
        this.this$0 = draftViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DraftViewModel$getBCutDraftsData$1$1(this.$it, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliTemplateEngineManager biliTemplateEngineManager = this.$it;
            this.label = 1;
            Object objJ = biliTemplateEngineManager.j(this);
            obj = objJ;
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        List<BiliDraftInfo> arrayList = list;
        if (list == null) {
            arrayList = new ArrayList();
        }
        c.a(arrayList.size(), "getBCutDraftsData, size=", "DraftViewModel");
        MutableLiveData<List<DraftItemBean>> mutableLiveData = this.this$0.f113122e;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        ArrayList arrayList2 = new ArrayList();
        for (BiliDraftInfo biliDraftInfo : arrayList) {
            DraftItemBean draftItemBean = new DraftItemBean();
            draftItemBean.draftId = biliDraftInfo.createTime;
            draftItemBean.bCutDraftId = biliDraftInfo.id;
            draftItemBean.draftCoverPath = biliDraftInfo.cover;
            draftItemBean.title = biliDraftInfo.title;
            draftItemBean.duration = U.c(biliDraftInfo.duration / 1000);
            draftItemBean.time = simpleDateFormat.format(new Date(biliDraftInfo.updateTime));
            draftItemBean.createTime = biliDraftInfo.createTime;
            draftItemBean.updateTime = biliDraftInfo.updateTime;
            arrayList2.add(draftItemBean);
        }
        mutableLiveData.postValue(arrayList2);
        return Unit.INSTANCE;
    }
}
