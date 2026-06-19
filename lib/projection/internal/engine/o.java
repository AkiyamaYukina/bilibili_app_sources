package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.studio.material.util.UtilsKt;
import ie0.C7564c;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Function;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/o.class */
public final class o<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7564c f63171b;

    public o(DefaultProjectionEngineManager defaultProjectionEngineManager, C7564c c7564c) {
        this.f63170a = defaultProjectionEngineManager;
        this.f63171b = c7564c;
    }

    public final Object apply(Object obj) {
        Observable observableDoOnDispose;
        final com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) obj;
        BLog.i("ProjectionEngineManager", "Switch active device: " + aVar.getDevice() + UtilsKt.DOT);
        if (aVar.getDevice() instanceof ProjectionDeviceInternal.b) {
            observableDoOnDispose = Observable.empty();
        } else {
            final CompositeDisposable compositeDisposable = new CompositeDisposable();
            final DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63170a;
            aVar.i(defaultProjectionEngineManager);
            Observable<IProjectionPlayableItem> observableJ = aVar.getDevice().j();
            final C7564c c7564c = this.f63171b;
            compositeDisposable.add(observableJ.subscribe(new m(aVar, defaultProjectionEngineManager, c7564c)));
            compositeDisposable.add(aVar.getDevice().w().subscribe(new n(aVar, defaultProjectionEngineManager, c7564c)));
            observableDoOnDispose = Observable.never().doOnDispose(new Action(compositeDisposable, c7564c, aVar, defaultProjectionEngineManager) { // from class: com.bilibili.lib.projection.internal.engine.l

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CompositeDisposable f63163a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.lib.projection.internal.device.a f63164b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final DefaultProjectionEngineManager f63165c;

                {
                    this.f63163a = compositeDisposable;
                    this.f63164b = aVar;
                    this.f63165c = defaultProjectionEngineManager;
                }

                public final void run() {
                    this.f63163a.dispose();
                    C7564c.f121633j.z(null);
                    this.f63164b.b(this.f63165c);
                }
            });
        }
        return observableDoOnDispose;
    }
}
