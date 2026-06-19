package com.bilibili.ogv.operation3.module.feedback;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import ql0.InterfaceC8453a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/feedback/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow<List<w>> f71208a = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableState f71209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState f71210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f71211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f71212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f71213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC8453a f71214g;

    public g(CoroutineScope coroutineScope, h hVar, y yVar, InterfaceC8453a interfaceC8453a) {
        this.f71211d = coroutineScope;
        this.f71212e = hVar;
        this.f71213f = yVar;
        this.f71214g = interfaceC8453a;
        Boolean bool = Boolean.FALSE;
        this.f71209b = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f71210c = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.runtime.Composer r7, int r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation3.module.feedback.g.a(androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f71210c.getValue()).booleanValue();
    }

    public final void c() {
        boolean zB = b();
        y yVar = this.f71213f;
        if (zB) {
            BuildersKt.launch$default(this.f71211d, (CoroutineContext) null, (CoroutineStart) null, new CreateFeedbackModel$invoke$1$feedback$1(this.f71212e, yVar, 0, this, this.f71214g, null), 3, (Object) null);
        } else {
            BuildersKt.launch$default(this.f71211d, (CoroutineContext) null, (CoroutineStart) null, new CreateFeedbackModel$invoke$1$requestFeedbackOptions$1(this.f71212e, yVar, this, null), 3, (Object) null);
        }
    }
}
