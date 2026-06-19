package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameResultBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameTagStatus;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/f.class */
public final class f implements Function1<String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AIStoryGenTagProcessor f105749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<AiFrameResultBean> f105750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CancellableContinuationImpl f105751d;

    public f(long j7, AIStoryGenTagProcessor aIStoryGenTagProcessor, List list, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105748a = j7;
        this.f105749b = aIStoryGenTagProcessor;
        this.f105750c = list;
        this.f105751d = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f105748a;
        AIStoryGenTagProcessor aIStoryGenTagProcessor = this.f105749b;
        Tw0.b.e("fail", -2, Long.valueOf(jCurrentTimeMillis - j7), str, Integer.valueOf(aIStoryGenTagProcessor.f105712e));
        Iterator<T> it = this.f105750c.iterator();
        while (it.hasNext()) {
            ((AiFrameResultBean) it.next()).setResultStatus(AiFrameTagStatus.FAIL);
        }
        if (!aIStoryGenTagProcessor.f105711d) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f105751d;
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException(str))));
            }
        }
        return Unit.INSTANCE;
    }
}
