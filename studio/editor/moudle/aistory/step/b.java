package com.bilibili.studio.editor.moudle.aistory.step;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryResult;
import com.bilibili.studio.editor.moudle.aistory.bean.ChatRequestBean;
import com.bilibili.studio.editor.moudle.aistory.bean.Message;
import com.bilibili.studio.editor.moudle.aistory.exception.AIStorySensitiveInvalidateException;
import com.bilibili.studio.videoeditor.template.BiliTemplateEngineManager;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/b.class */
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public BiliTemplateEngineManager f105757a;

    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    public final int a() {
        return 1;
    }

    @Override // com.bilibili.studio.editor.moudle.aistory.step.n
    @Nullable
    public final Object b(@NotNull Context context, @NotNull final AIStoryBean aIStoryBean, @NotNull final com.bilibili.studio.editor.moudle.aistory.a aVar, @NotNull Continuation continuation) {
        String finalPrompt = aIStoryBean.getFinalPrompt();
        if (finalPrompt == null || finalPrompt.length() == 0) {
            Result.Companion companion = Result.Companion;
            aVar.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("finalPrompt is empty")))));
            return Unit.INSTANCE;
        }
        String str = aIStoryBean.getStoryPlayType() == 2 ? "ai_story_video" : "";
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Message(DictionaryKeys.V2_USER, finalPrompt, null, 4, null));
        ChatRequestBean chatRequestBean = new ChatRequestBean("wenxin", arrayList, str);
        BiliTemplateEngineManager biliTemplateEngineManager = this.f105757a;
        BiliTemplateEngineManager biliTemplateEngineManager2 = biliTemplateEngineManager;
        if (biliTemplateEngineManager == null) {
            biliTemplateEngineManager2 = new BiliTemplateEngineManager(0);
            biliTemplateEngineManager2.i(context);
        }
        this.f105757a = biliTemplateEngineManager2;
        biliTemplateEngineManager2.l("chat_model_pink", JSON.toJSONString(chatRequestBean), "", AIStoryResult.class, new Function3(aIStoryBean, aVar, this) { // from class: com.bilibili.studio.editor.moudle.aistory.step.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AIStoryBean f105754a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.studio.editor.moudle.aistory.a f105755b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f105756c;

            {
                this.f105754a = aIStoryBean;
                this.f105755b = aVar;
                this.f105756c = this;
            }

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                String result;
                String str2 = (String) obj2;
                AIStoryResult aIStoryResult = (AIStoryResult) obj3;
                Integer code = null;
                String result2 = aIStoryResult != null ? aIStoryResult.getResult() : null;
                if (aIStoryResult != null) {
                    code = aIStoryResult.getCode();
                }
                StringBuilder sbA = G0.b.a("process onSuccess taskId:", str2, " data:", result2, " code = ");
                sbA.append(code);
                BLog.i("AIStoryGenStoryStep", sbA.toString());
                AIStoryBean aIStoryBean2 = this.f105754a;
                aIStoryBean2.setAiTaskId(str2);
                com.bilibili.studio.editor.moudle.aistory.a aVar2 = this.f105755b;
                if (aIStoryResult == null || (result = aIStoryResult.getResult()) == null || result.length() == 0) {
                    Result.Companion companion2 = Result.Companion;
                    aVar2.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new IllegalStateException("result is null")))));
                } else {
                    Integer code2 = aIStoryResult.getCode();
                    if (code2 != null && code2.intValue() == 140401) {
                        Result.Companion companion3 = Result.Companion;
                        String strB = com.bilibili.app.comm.rubick.common.g.b(aIStoryResult.getCode(), "sensitive check nopassed code = ");
                        this.f105756c.getClass();
                        aVar2.invoke(Result.box-impl(Result.constructor-impl(ResultKt.createFailure(new AIStorySensitiveInvalidateException(strB, 1)))));
                    } else {
                        aIStoryBean2.setStory(aIStoryResult.getResult());
                        aVar2.invoke(Result.box-impl(Result.constructor-impl(aIStoryBean2)));
                    }
                }
                return Unit.INSTANCE;
            }
        }, new R9.k(aVar, 3));
        return Unit.INSTANCE;
    }
}
