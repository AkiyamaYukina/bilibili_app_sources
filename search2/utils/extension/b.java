package com.bilibili.search2.utils.extension;

import B11.h;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/b.class */
public final class b {
    public static void a(Flow flow, BaseFragment baseFragment, Function1 function1) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(baseFragment), (CoroutineContext) null, (CoroutineStart) null, new FlowExtKt$collectIn$1(flow, baseFragment, Lifecycle.State.CREATED, function1, null), 3, (Object) null);
    }

    public static void b(Flow flow, BaseSearchResultFragment baseSearchResultFragment, KProperty1 kProperty1, h hVar) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(baseSearchResultFragment), (CoroutineContext) null, (CoroutineStart) null, new FlowExtKt$collectIn$2(flow, baseSearchResultFragment, Lifecycle.State.CREATED, kProperty1, hVar, null), 3, (Object) null);
    }

    public static void c(Flow flow, BaseFragment baseFragment, KProperty1 kProperty1, Function1 function1) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(baseFragment), (CoroutineContext) null, (CoroutineStart) null, new FlowExtKt$collectInUntilChanged$2(flow, baseFragment, Lifecycle.State.CREATED, kProperty1, function1, null), 3, (Object) null);
    }
}
