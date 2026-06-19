package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameResultBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AiFrameTagStatus;
import com.bilibili.studio.editor.moudle.intelligence.media.cache.MediaLabelBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tz0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$initFrameResult$2.class */
final class AIStoryGenTagProcessor$initFrameResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final AIStoryFrameBean $frameInfo;
    int label;
    final AIStoryGenTagProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStoryGenTagProcessor$initFrameResult$2(AIStoryFrameBean aIStoryFrameBean, AIStoryGenTagProcessor aIStoryGenTagProcessor, Continuation<? super AIStoryGenTagProcessor$initFrameResult$2> continuation) {
        super(2, continuation);
        this.$frameInfo = aIStoryFrameBean;
        this.this$0 = aIStoryGenTagProcessor;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryGenTagProcessor$initFrameResult$2(this.$frameInfo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        AiFrameResultBean aiFrameResultBean;
        List<AiFrameResultBean> frameResult;
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$frameInfo.getFrameResult() == null) {
            this.$frameInfo.setFrameResult(new ArrayList());
        }
        Map<String, List<AiFrameResultBean>> map = AIStoryGenTagProcessor.f105707f;
        if (map.containsKey(this.$frameInfo.getFilePath())) {
            AIStoryFrameBean aIStoryFrameBean = this.$frameInfo;
            aIStoryFrameBean.setFrameResult((List) ((LinkedHashMap) map).get(aIStoryFrameBean.getFilePath()));
        }
        List<File> frameList = this.$frameInfo.getFrameList();
        if (frameList != null) {
            List<File> list = frameList;
            AIStoryFrameBean aIStoryFrameBean2 = this.$frameInfo;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String path = ((File) it.next()).getPath();
                List<AiFrameResultBean> frameResult2 = aIStoryFrameBean2.getFrameResult();
                if (frameResult2 != null) {
                    Iterator<T> it2 = frameResult2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (Intrinsics.areEqual(((AiFrameResultBean) next).getFilePath(), path)) {
                            break;
                        }
                    }
                    aiFrameResultBean = (AiFrameResultBean) next;
                } else {
                    aiFrameResultBean = null;
                }
                if (aiFrameResultBean == null && (frameResult = aIStoryFrameBean2.getFrameResult()) != null) {
                    Boxing.boxBoolean(frameResult.add(new AiFrameResultBean(path, false, null, null, null, 30, null)));
                }
            }
        }
        List<AiFrameResultBean> frameResult3 = this.$frameInfo.getFrameResult();
        Unit unit = null;
        if (frameResult3 != null) {
            List<AiFrameResultBean> list2 = frameResult3;
            AIStoryGenTagProcessor aIStoryGenTagProcessor = this.this$0;
            for (AiFrameResultBean aiFrameResultBean2 : list2) {
                String filePath = aiFrameResultBean2.getFilePath();
                if (filePath != null) {
                    AiFrameTagStatus resultStatus = aiFrameResultBean2.getResultStatus();
                    AiFrameTagStatus aiFrameTagStatus = AiFrameTagStatus.REG_SUCCESS;
                    if (resultStatus != aiFrameTagStatus) {
                        int i7 = tz0.a.d;
                        tz0.a aVarA = a.a.a();
                        aIStoryGenTagProcessor.getClass();
                        MediaLabelBean mediaLabelBeanC = aVarA.c("AIStory-".concat(filePath));
                        if (mediaLabelBeanC != null) {
                            String str = mediaLabelBeanC.label;
                            if (str == null || str.length() == 0) {
                                mediaLabelBeanC = null;
                            }
                            if (mediaLabelBeanC != null) {
                                aiFrameResultBean2.setResultStatus(aiFrameTagStatus);
                                aiFrameResultBean2.setTagList(CollectionsKt.mutableListOf(new String[]{mediaLabelBeanC.label}));
                            }
                        }
                    }
                }
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
