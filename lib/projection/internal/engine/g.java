package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/g.class */
public final class g<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DeviceSnapshot> f63151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC7845m f63152b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends DeviceSnapshot> list, InterfaceC7845m interfaceC7845m) {
        this.f63151a = list;
        this.f63152b = interfaceC7845m;
    }

    public final Object apply(Object obj) {
        r rVar = (r) obj;
        List<DeviceSnapshot> list = this.f63151a;
        IProjectionItem iProjectionItemN = this.f63152b.n(false);
        return rVar.a(iProjectionItemN != null ? iProjectionItemN.getClientType() : 1, list);
    }
}
