package com.bilibili.pegasus.kmm.keywordblocker;

import J3.d2;
import com.bilibili.pegasus.keywordblocker.KeywordBlockerViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/kmm/keywordblocker/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KeywordBlockerViewModel.a f78266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<d> f78267b = StateFlowKt.MutableStateFlow(new d(CollectionsKt.emptyList(), KeywordBlockPageStatus.Idle, null, false, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f78268c = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 6, (Object) null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f78269d = LazyKt.lazy(new d2(6));

    public e(@NotNull KeywordBlockerViewModel.a aVar) {
        this.f78266a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L27
            r0 = r3
            kotlin.Lazy r0 = r0.f78269d
            java.lang.Object r0 = r0.getValue()
            java.lang.String[] r0 = (java.lang.String[]) r0
            r1 = r4
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            if (r0 != 0) goto L25
            r0 = r6
            r5 = r0
            r0 = r4
            int r0 = r0.length()
            r1 = 1
            if (r0 <= r1) goto L27
        L25:
            r0 = 1
            r5 = r0
        L27:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.kmm.keywordblocker.e.a(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x05f9 -> B:101:0x0635). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0517 -> B:89:0x0567). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.bilibili.pegasus.kmm.keywordblocker.d r10, com.bilibili.pegasus.kmm.keywordblocker.b r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 2754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.kmm.keywordblocker.e.b(com.bilibili.pegasus.kmm.keywordblocker.d, com.bilibili.pegasus.kmm.keywordblocker.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
