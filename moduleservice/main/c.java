package com.bilibili.moduleservice.main;

import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/c.class */
public final class c {
    public static final void a(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull Flow flow, @NotNull Function1 function1) {
        FlowKt.launchIn(FlowKt.onEach(flow, new AnswerServiceKt$collectAnswerEventFlow$1(function1, null)), lifecycleCoroutineScope);
    }
}
