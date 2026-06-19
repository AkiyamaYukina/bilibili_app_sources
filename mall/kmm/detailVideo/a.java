package com.bilibili.mall.kmm.detailVideo;

import F3.U;
import bh0.C5108d;
import java.util.Map;
import kntr.kotlin.native.ObjCExport;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/detailVideo/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f65598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, Object> f65599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f65600c = LazyKt.lazy(new U(14));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<MallDetailVideoState<C5108d>> f65601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow f65602e;

    @ObjCExport
    public a(@NotNull Map map, @NotNull CoroutineScope coroutineScope) {
        this.f65598a = coroutineScope;
        this.f65599b = map;
        MutableStateFlow<MallDetailVideoState<C5108d>> MutableStateFlow = StateFlowKt.MutableStateFlow(new MallDetailVideoState(null));
        this.f65601d = MutableStateFlow;
        this.f65602e = FlowKt.asSharedFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.mall.kmm.detailVideo.comment.MallDetailCommentPageVM a(ah0.C3219i r9) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.detailVideo.a.a(ah0.i):com.bilibili.mall.kmm.detailVideo.comment.MallDetailCommentPageVM");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @kntr.kotlin.native.ObjCExport
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull java.util.Map r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.mall.kmm.detailVideo.a.b(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
