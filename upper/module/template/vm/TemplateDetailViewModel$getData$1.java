package com.bilibili.upper.module.template.vm;

import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.upper.api.bean.videotemplate.VideoTemplateCategory;
import java.util.Iterator;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/template/vm/TemplateDetailViewModel$getData$1.class */
public final class TemplateDetailViewModel$getData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TemplateDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateDetailViewModel$getData$1(TemplateDetailViewModel templateDetailViewModel, Continuation<? super TemplateDetailViewModel$getData$1> continuation) {
        super(2, continuation);
        this.this$0 = templateDetailViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TemplateDetailViewModel$getData$1(this.this$0, continuation);
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
                this.this$0.f114021c.setValue(Boxing.boxInt(1));
                long j7 = this.this$0.f114023e;
                this.label = 1;
                Object objA = OI0.b.a(j7, this);
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
            VideoTemplateCategory videoTemplateCategory = (VideoTemplateCategory) obj;
            TemplateDetailViewModel templateDetailViewModel = this.this$0;
            templateDetailViewModel.f114028k = videoTemplateCategory.name;
            templateDetailViewModel.f114022d.setValue(Boxing.boxLong(videoTemplateCategory.id));
            List list = videoTemplateCategory.materials;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    EA0.b.j((VideoTemplateBean) it.next());
                }
            }
            this.this$0.f114020b.postValue(videoTemplateCategory.materials);
            this.this$0.f114021c.setValue(Boxing.boxInt(3));
        } catch (Exception e7) {
            BLog.i("TemplateDetailViewModel", e7.getMessage());
            this.this$0.f114021c.setValue(Boxing.boxInt(2));
        }
        return Unit.INSTANCE;
    }
}
