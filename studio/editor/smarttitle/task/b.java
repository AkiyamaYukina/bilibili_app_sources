package com.bilibili.studio.editor.smarttitle.task;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/b.class */
public final class b implements Function2<String, String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmartTitleStyleTask f108251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108252b;

    public b(SmartTitleStyleTask smartTitleStyleTask, String str) {
        this.f108251a = smartTitleStyleTask;
        this.f108252b = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        SmartTitleStyleTask smartTitleStyleTask = this.f108251a;
        BuildersKt.launch$default(smartTitleStyleTask.f108244g, Dispatchers.getMain(), (CoroutineStart) null, new SmartTitleStyleTask$startChildAiTask$2$2$1(smartTitleStyleTask, this.f108252b, (String) obj2, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
