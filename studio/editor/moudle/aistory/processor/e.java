package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameResultBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameTagStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/e.class */
public final class e implements Function1<Map<String, ? extends List<? extends String>>, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AIStoryGenTagProcessor f105745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<AIStoryFrameBean> f105746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CancellableContinuationImpl f105747d;

    public e(long j7, AIStoryGenTagProcessor aIStoryGenTagProcessor, List list, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f105744a = j7;
        this.f105745b = aIStoryGenTagProcessor;
        this.f105746c = list;
        this.f105747d = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = this.f105744a;
        AIStoryGenTagProcessor aIStoryGenTagProcessor = this.f105745b;
        Tw0.b.g("success", -2, Long.valueOf(jCurrentTimeMillis - j7), null, Integer.valueOf(aIStoryGenTagProcessor.f105712e), 8);
        List<AIStoryFrameBean> list = this.f105746c;
        ArrayList<AiFrameResultBean> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<AiFrameResultBean> frameResult = ((AIStoryFrameBean) it.next()).getFrameResult();
            List<AiFrameResultBean> arrayList2 = frameResult;
            if (frameResult == null) {
                arrayList2 = new ArrayList();
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        for (AiFrameResultBean aiFrameResultBean : arrayList) {
            aiFrameResultBean.setResultStatus(AiFrameTagStatus.REG_SUCCESS);
            List list2 = (List) map.get(aiFrameResultBean.getUploadUrl());
            aiFrameResultBean.setTagList(list2 != null ? CollectionsKt.toMutableList(list2) : null);
        }
        if (!aIStoryGenTagProcessor.f105711d) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f105747d;
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.constructor-impl(this.f105746c));
            }
        }
        return Unit.INSTANCE;
    }
}
