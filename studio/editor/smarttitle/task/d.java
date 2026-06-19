package com.bilibili.studio.editor.smarttitle.task;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/d.class */
public final class d implements Function4<String, String, Integer, String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmartTitleStyleTask f108255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108256b;

    public d(SmartTitleStyleTask smartTitleStyleTask, String str) {
        this.f108255a = smartTitleStyleTask;
        this.f108256b = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BuildersKt.launch$default(this.f108255a.f108244g, Dispatchers.getMain(), (CoroutineStart) null, new SmartTitleStyleTask$startChildAiTask$2$4$1((String) obj, this.f108255a, this.f108256b, ((Number) obj3).intValue(), (String) obj4, null), 2, (Object) null);
        return Unit.INSTANCE;
    }
}
