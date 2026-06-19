package com.bilibili.lib.projection.internal.engine;

import He0.InterfaceC2124c;
import android.os.Parcel;
import com.bilibili.lib.blkv.RawKV;
import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager;
import com.bilibili.lib.projection.internal.nirvana.CommonNvaController;
import ie0.C7564c;
import ie0.InterfaceC7569h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le0.InterfaceC7845m;
import me0.C7985q;
import ne0.C8085a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultProjectionEngineManager f63138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC7845m f63139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProjectionDeviceInternal f63140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f63142e;

    public /* synthetic */ b(DefaultProjectionEngineManager defaultProjectionEngineManager, InterfaceC7845m interfaceC7845m, ProjectionDeviceInternal projectionDeviceInternal, int i7, Function1 function1) {
        this.f63138a = defaultProjectionEngineManager;
        this.f63139b = interfaceC7845m;
        this.f63140c = projectionDeviceInternal;
        this.f63141d = i7;
        this.f63142e = function1;
    }

    /* JADX WARN: Type inference failed for: r0v117, types: [He0.a, He0.c, java.lang.Object] */
    public final Object invoke() {
        DeviceSnapshot deviceSnapshotF;
        ProjectionDeviceInternal device;
        boolean z6 = C7564c.f121637n instanceof InterfaceC2124c.a;
        DefaultProjectionEngineManager defaultProjectionEngineManager = this.f63138a;
        if (z6) {
            ?? obj = new Object();
            obj.f8656a = "";
            obj.f8656a = UUID.randomUUID().toString();
            DefaultProjectionEngineManager.f fVar = defaultProjectionEngineManager.f63117s;
            com.bilibili.lib.nirvana.api.m mVar = (com.bilibili.lib.nirvana.api.m) CommonNvaController.f63217a.getValue();
            if (mVar != null) {
                mVar.A(new se0.i(fVar));
            }
            ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
            C7564c.f121637n = obj;
        }
        InterfaceC7845m interfaceC7845m = this.f63139b;
        int clientType = interfaceC7845m.getClientType();
        ProjectionDeviceInternal.b bVar = ProjectionDeviceInternal.b.f63069a;
        ProjectionDeviceInternal projectionDeviceInternal = this.f63140c;
        if (clientType == 6) {
            if (Intrinsics.areEqual(defaultProjectionEngineManager.f63106g.e(), bVar)) {
                com.bilibili.lib.projection.internal.device.a aVar = (com.bilibili.lib.projection.internal.device.a) defaultProjectionEngineManager.f63102c.e();
                if (aVar != null && (device = aVar.getDevice()) != null) {
                    device.z();
                }
                ((C7564c) defaultProjectionEngineManager.getContext()).hideFloatView();
            }
            defaultProjectionEngineManager.f63106g.onNext(projectionDeviceInternal);
        }
        int i7 = this.f63141d;
        if ((i7 != 4 || !projectionDeviceInternal.E()) && (deviceSnapshotF = projectionDeviceInternal.F()) != null) {
            ((C7564c) defaultProjectionEngineManager.getContext()).getClass();
            C8085a c8085a = C7564c.f121633j;
            c8085a.f124072b.put(deviceSnapshotF.getUuid(), deviceSnapshotF);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeMap(c8085a.f124072b.snapshot());
            RawKV rawKV = c8085a.f124071a;
            RawKV rawKV2 = rawKV;
            if (rawKV == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storage");
                rawKV2 = null;
            }
            rawKV2.putBytes("history_devices", parcelObtain.marshall());
            parcelObtain.recycle();
        }
        defaultProjectionEngineManager.f63104e.dispose();
        Map<String, com.bilibili.lib.projection.internal.device.a> map = com.bilibili.lib.projection.internal.device.b.f63072t;
        InterfaceC7569h context = defaultProjectionEngineManager.getContext();
        Object obj2 = ((LinkedHashMap) com.bilibili.lib.projection.internal.device.b.f63072t).get(projectionDeviceInternal.e() + "-" + projectionDeviceInternal.getRealName() + "-" + projectionDeviceInternal.getUuid());
        Object bVar2 = obj2;
        if (obj2 == null) {
            bVar2 = new com.bilibili.lib.projection.internal.device.b(projectionDeviceInternal, context, null, interfaceC7845m);
        }
        com.bilibili.lib.projection.internal.device.a aVar2 = (com.bilibili.lib.projection.internal.device.a) bVar2;
        if ((projectionDeviceInternal instanceof pe0.i) || (projectionDeviceInternal instanceof C7985q) || (projectionDeviceInternal instanceof se0.f)) {
            io.reactivex.rxjava3.subjects.a<com.bilibili.lib.projection.internal.device.a> aVar3 = defaultProjectionEngineManager.f63102c;
            if (!Intrinsics.areEqual(aVar3.e(), aVar2)) {
                aVar3.onNext(aVar2);
            }
        }
        if (i7 != 0 && Intrinsics.areEqual(defaultProjectionEngineManager.f63106g.e(), bVar)) {
            interfaceC7845m.getReporter().Y(interfaceC7845m, projectionDeviceInternal, false, i7);
        }
        interfaceC7845m.j(i7, aVar2);
        Function1 function1 = this.f63142e;
        if (function1 != null) {
            function1.invoke(aVar2);
        }
        return Unit.INSTANCE;
    }
}
