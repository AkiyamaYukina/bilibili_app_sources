package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.link.LinkDeviceSnapshot;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/p.class */
public final class p<T, R> implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<DeviceSnapshot> f63335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NirvanaEngine f63336b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(Collection<? extends DeviceSnapshot> collection, NirvanaEngine nirvanaEngine) {
        this.f63335a = collection;
        this.f63336b = nirvanaEngine;
    }

    public final Object apply(Object obj) {
        Observable observableEmpty;
        Iterator<T> it = this.f63335a.iterator();
        while (true) {
            if (!it.hasNext()) {
                observableEmpty = Observable.empty();
                break;
            }
            DeviceSnapshot deviceSnapshot = (DeviceSnapshot) it.next();
            boolean z6 = deviceSnapshot instanceof NirvanaEngine.NirvanaDeviceSnapshot;
            NirvanaEngine nirvanaEngine = this.f63336b;
            if (z6) {
                String str = ((NirvanaEngine.NirvanaDeviceSnapshot) deviceSnapshot).f63245b;
                nirvanaEngine.getClass();
                ProjectionDeviceInternal projectionDeviceInternal = nirvanaEngine.f63232j.get(StringsKt.removeSuffix(str, "_5"));
                if (projectionDeviceInternal != null) {
                    observableEmpty = Observable.just(projectionDeviceInternal);
                    break;
                }
            } else if (deviceSnapshot instanceof LinkDeviceSnapshot) {
                String str2 = ((LinkDeviceSnapshot) deviceSnapshot).f63209b;
                nirvanaEngine.getClass();
                ProjectionDeviceInternal projectionDeviceInternal2 = nirvanaEngine.f63232j.get(StringsKt.removeSuffix(str2, "_5"));
                if (projectionDeviceInternal2 != null) {
                    observableEmpty = Observable.just(projectionDeviceInternal2);
                    break;
                }
            } else {
                continue;
            }
        }
        return observableEmpty;
    }
}
