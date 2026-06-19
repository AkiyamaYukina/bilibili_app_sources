package com.bilibili.studio.editor.smarttitle.task;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/task/a.class */
public final class a implements Function1<String, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmartTitleStyleTask f108249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellableContinuationImpl f108250b;

    public a(SmartTitleStyleTask smartTitleStyleTask, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f108249a = smartTitleStyleTask;
        this.f108250b = cancellableContinuationImpl;
    }

    public final Object invoke(Object obj) {
        this.f108249a.f108237l.add((String) obj);
        Result.Companion companion = Result.Companion;
        this.f108250b.resumeWith(Result.constructor-impl(Boolean.TRUE));
        return Unit.INSTANCE;
    }
}
