package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import ie0.C7564c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/i.class */
public final class i<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IProjectionItem f63157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC7845m f63158c;

    public i(DefaultProjectionEngineManager defaultProjectionEngineManager, IProjectionItem iProjectionItem, InterfaceC7845m interfaceC7845m) {
        this.f63156a = defaultProjectionEngineManager;
        this.f63157b = iProjectionItem;
        this.f63158c = interfaceC7845m;
    }

    public final Object apply(Object obj) {
        Observable observableTakeUntil;
        List list = (List) obj;
        boolean zIsEmpty = list.isEmpty();
        IProjectionItem iProjectionItem = this.f63157b;
        InterfaceC7845m interfaceC7845m = this.f63158c;
        DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63156a;
        if (zIsEmpty) {
            ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
            com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
            ProjectionDeviceInternal projectionDeviceInternalC = interfaceC7845m.i().c();
            aVar.getClass();
            StandardProjectionItem standardProjectionItem = iProjectionItem instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItem : null;
            if (standardProjectionItem != null) {
                he0.j.h("player.cast.search.savedempty", projectionDeviceInternalC, true, (StandardProjectionItem) iProjectionItem, aVar.f63524a, new com.bilibili.bplus.followinglist.interaction.g(standardProjectionItem, 3));
            }
            observableTakeUntil = Observable.error(new NoSuchElementException());
        } else {
            observableTakeUntil = Observable.fromIterable(((LinkedHashMap) defaultProjectionEngineManager.f63100a).values()).flatMap(new g(list, interfaceC7845m)).takeUntil(Observable.timer(1L, TimeUnit.SECONDS).doOnNext(new h(defaultProjectionEngineManager, iProjectionItem, interfaceC7845m)));
        }
        return observableTakeUntil;
    }
}
