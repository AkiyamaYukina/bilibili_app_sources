package com.bilibili.studio.editor.smarttitle.task;

import com.bilibili.studio.editor.smarttitle.entity.aitask.SmartTitleAITaskResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/c.class */
public final class c implements Function4<String, String, String, SmartTitleAITaskResult, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmartTitleStyleTask f108253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108254b;

    public c(SmartTitleStyleTask smartTitleStyleTask, String str) {
        this.f108253a = smartTitleStyleTask;
        this.f108254b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BuildersKt.launch$default(this.f108253a.f108244g, Dispatchers.getMain(), (CoroutineStart) null, new SmartTitleStyleTask$startChildAiTask$2$3$1((String) obj2, this.f108253a, (SmartTitleAITaskResult) obj4, this.f108254b, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
