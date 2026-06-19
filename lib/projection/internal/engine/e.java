package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import ge0.InterfaceC7274d;
import ie0.C7564c;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import le0.C7838f;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/e.class */
public final class e<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7838f f63147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63148b;

    public e(C7838f c7838f, DefaultProjectionEngineManager defaultProjectionEngineManager) {
        this.f63147a = c7838f;
        this.f63148b = defaultProjectionEngineManager;
    }

    public final void accept(Object obj) {
        ProjectionDeviceInternal projectionDeviceInternal = (ProjectionDeviceInternal) ((Pair) obj).getFirst();
        boolean z6 = projectionDeviceInternal instanceof ProjectionDeviceInternal.b;
        C7838f c7838f = this.f63147a;
        DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63148b;
        if (z6) {
            ((C7564c) defaultProjectionEngineManager.getContext()).getApp();
            c7838f.v();
            return;
        }
        if (projectionDeviceInternal instanceof NirvanaEngine.a) {
            NirvanaEngine.a aVar = (NirvanaEngine.a) projectionDeviceInternal;
            if (StringsKt.n(aVar.f63251e, "我的小电视")) {
                List<? extends InterfaceC7274d> list = defaultProjectionEngineManager.f63109k;
                if (list != null) {
                    InterfaceC7274d interfaceC7274dO = DefaultProjectionEngineManager.o(se0.k.c(aVar.f63247a), CollectionsKt.toMutableList(list));
                    if (interfaceC7274dO != null) {
                        aVar.f63251e = interfaceC7274dO.getDisplayName();
                    }
                } else {
                    aVar.f63251e = "我的小电视";
                }
            }
        }
        ((C7564c) defaultProjectionEngineManager.getContext()).getApp();
        c7838f.v();
    }
}
