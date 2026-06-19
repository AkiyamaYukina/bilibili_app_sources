package com.bilibili.studio.editor.smarttitle.task;

import bA0.C4936c;
import bA0.g;
import com.bilibili.studio.editor.smarttitle.constans.SmartTitleType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/SmartTitleTask$startAiTask$2$1.class */
public final class SmartTitleTask$startAiTask$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $serverTaskId;
    final String $styleName;
    int label;
    final SmartTitleTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartTitleTask$startAiTask$2$1(SmartTitleTask smartTitleTask, String str, String str2, Continuation<? super SmartTitleTask$startAiTask$2$1> continuation) {
        super(2, continuation);
        this.this$0 = smartTitleTask;
        this.$styleName = str;
        this.$serverTaskId = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmartTitleTask$startAiTask$2$1(this.this$0, this.$styleName, this.$serverTaskId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SmartTitleTask smartTitleTask = this.this$0;
        String str = this.$styleName;
        String str2 = this.$serverTaskId;
        if (smartTitleTask.f108245i.get()) {
            BLog.e("SmartTitleTask", "该任务已经取消掉了～不再回调[onTaskCreated]");
        } else {
            g.a aVar = smartTitleTask.f108246j;
            if (aVar != null) {
                String str3 = smartTitleTask.f108238a;
                SmartTitleType smartTitleType = aVar.f54466a;
                StringBuilder sb = new StringBuilder("智能标题任务 onTaskCreated projectId=");
                sb.append(str3);
                sb.append(",smartTitleType=");
                sb.append(smartTitleType);
                sb.append(",style=");
                S9.b.a(sb, str, "SmartTitleTaskLogic");
                C4936c c4936c = aVar.f54467b.f54462a;
                SmartTitleType smartTitleType2 = aVar.f54466a;
                synchronized (c4936c) {
                    if (smartTitleType2 != SmartTitleType.DEFAULT) {
                        BLog.e("SmartTitleCacheLogic", "addTaskCreatedId 非默认任务，不存储AI任务的id，smartTitleType=" + smartTitleType2);
                    } else {
                        Zz0.b bVar = c4936c.f54459a.get(str3);
                        Zz0.b bVar2 = bVar;
                        if (bVar == null) {
                            bVar2 = new Zz0.b();
                        }
                        synchronized (bVar2) {
                            try {
                                bVar2.f29849a = str2;
                            } finally {
                            }
                        }
                        c4936c.f54459a.put(str3, bVar2);
                    }
                }
            }
        }
        if (zw0.b.b()) {
            Long lBoxLong = Boxing.boxLong(System.currentTimeMillis() - this.this$0.f108247k);
            SmartTitleTask smartTitleTask2 = this.this$0;
            Xz0.d.a0("success", lBoxLong, null, smartTitleTask2.h, smartTitleTask2.f108239b);
        }
        if (zw0.b.b()) {
            SmartTitleTask smartTitleTask3 = this.this$0;
            Xz0.d.d0("start", null, null, smartTitleTask3.h, smartTitleTask3.f108239b, null);
        }
        return Unit.INSTANCE;
    }
}
