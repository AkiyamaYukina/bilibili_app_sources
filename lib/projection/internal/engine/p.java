package com.bilibili.lib.projection.internal.engine;

import He0.C2123b;
import He0.InterfaceC2125d;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord;
import com.bilibili.studio.material.util.UtilsKt;
import ie0.C7564c;
import ie0.InterfaceC7569h;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/p.class */
public final class p<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProjectionPlayRecord f63173b;

    public p(DefaultProjectionEngineManager defaultProjectionEngineManager, ProjectionPlayRecord projectionPlayRecord) {
        this.f63172a = defaultProjectionEngineManager;
        this.f63173b = projectionPlayRecord;
    }

    public final void accept(Object obj) {
        ProjectionDeviceInternal projectionDeviceInternal = (ProjectionDeviceInternal) obj;
        DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63172a;
        ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
        if (C7564c.f121644u.isEmpty()) {
            io.reactivex.rxjava3.subjects.a<com.bilibili.lib.projection.internal.device.a> aVar = defaultProjectionEngineManager.f63102c;
            com.bilibili.lib.projection.internal.device.a aVar2 = (com.bilibili.lib.projection.internal.device.a) aVar.e();
            if (Intrinsics.areEqual(aVar2 != null ? aVar2.getDevice() : null, ProjectionDeviceInternal.b.f63069a)) {
                Map<String, com.bilibili.lib.projection.internal.device.a> map = com.bilibili.lib.projection.internal.device.b.f63072t;
                InterfaceC7569h context = defaultProjectionEngineManager.getContext();
                Object obj2 = ((LinkedHashMap) com.bilibili.lib.projection.internal.device.b.f63072t).get(projectionDeviceInternal.e() + "-" + projectionDeviceInternal.getRealName() + "-" + projectionDeviceInternal.getUuid());
                ProjectionPlayRecord projectionPlayRecord = this.f63173b;
                Object bVar = obj2;
                if (obj2 == null) {
                    bVar = new com.bilibili.lib.projection.internal.device.b(projectionDeviceInternal, context, projectionPlayRecord, null);
                }
                com.bilibili.lib.projection.internal.device.a aVar3 = (com.bilibili.lib.projection.internal.device.a) bVar;
                aVar.onNext(aVar3);
                ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
                if (C7564c.f121635l instanceof InterfaceC2125d.a) {
                    String string = UUID.randomUUID().toString();
                    InterfaceC7569h context2 = defaultProjectionEngineManager.getContext();
                    C2123b c2123b = new C2123b(-200, string);
                    ((C7564c) context2).getClass();
                    C7564c.f121635l = c2123b;
                    ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
                    C7564c.f121634k.e0(projectionDeviceInternal, null);
                }
                BLog.i("ProjectionEngineManager", "Restore success: " + projectionPlayRecord.f().getRawItem() + ", device: " + aVar3 + UtilsKt.DOT);
                return;
            }
        }
        BLog.i("ProjectionEngineManager", "Restore too slow, ignored.");
    }
}
