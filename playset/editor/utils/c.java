package com.bilibili.playset.editor.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.playset.editor.PlaySetEditorFragmentV2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/utils/c.class */
public final class c {
    public static void a(StateFlow stateFlow, PlaySetEditorFragmentV2 playSetEditorFragmentV2, KProperty1 kProperty1, Function1 function1) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(playSetEditorFragmentV2), (CoroutineContext) null, (CoroutineStart) null, new FlowExtKt$collectInUntilChanged$1(stateFlow, playSetEditorFragmentV2, Lifecycle.State.CREATED, kProperty1, function1, null), 3, (Object) null);
    }
}
