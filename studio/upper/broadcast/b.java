package com.bilibili.studio.upper.broadcast;

import com.bilibili.studio.upper.publish.f;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/upper/broadcast/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<a> f108668a = StateFlowKt.MutableStateFlow(new a());

    public static void a(int i7, @NotNull String str, Object obj) {
        MutableStateFlow<a> mutableStateFlow;
        Object value;
        a aVar;
        do {
            mutableStateFlow = f108668a;
            value = mutableStateFlow.getValue();
            aVar = new a();
            aVar.f108665a = i7;
            aVar.f108666b = str;
            aVar.f108667c = obj;
        } while (!mutableStateFlow.compareAndSet(value, aVar));
    }

    public static void b(@NotNull f fVar) {
        BuildersKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new TaskMessageBroadcast$registerBroadcaster$1(fVar, null), 3, (Object) null);
    }
}
