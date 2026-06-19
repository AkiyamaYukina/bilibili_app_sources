package com.bilibili.lib.projection.internal.nirvana;

import com.bilibili.lib.nirvana.api.UPnPActionException;
import com.bilibili.lib.projection.internal.config.DefaultProjectionUserCompat;
import com.bilibili.lib.projection.internal.engine.DefaultProjectionEngineManager;
import com.bilibili.lib.projection.internal.nirvana.NirvanaEngine;
import ie0.C7564c;
import kotlin.Pair;
import ne0.C8085a;
import ne0.InterfaceC8086b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/nirvana/b.class */
public final class b extends NirvanaEngine.a.AbstractC0349a<com.bilibili.lib.nirvana.api.b<Integer>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NirvanaEngine.a f63312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NirvanaEngine f63313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NirvanaEngine.a aVar, Pair<Long, String> pair, NirvanaEngine nirvanaEngine) {
        super(aVar, "accountInfo", pair);
        this.f63312d = aVar;
        this.f63313e = nirvanaEngine;
    }

    @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
    public final void a(UPnPActionException uPnPActionException) {
        DefaultProjectionEngineManager defaultProjectionEngineManager;
        C8085a c8085a;
        super.a(uPnPActionException);
        NirvanaEngine nirvanaEngine = this.f63313e;
        DefaultProjectionEngineManager defaultProjectionEngineManager2 = nirvanaEngine.f63227d;
        DefaultProjectionUserCompat defaultProjectionUserCompat = null;
        InterfaceC8086b interfaceC8086b = (defaultProjectionEngineManager2 == null || defaultProjectionEngineManager2.getContext() == null) ? null : C7564c.f121636m;
        if (interfaceC8086b instanceof DefaultProjectionUserCompat) {
            defaultProjectionUserCompat = (DefaultProjectionUserCompat) interfaceC8086b;
        }
        if (defaultProjectionUserCompat == null || (defaultProjectionEngineManager = nirvanaEngine.f63227d) == null || defaultProjectionEngineManager.getContext() == null || (c8085a = C7564c.f121633j) == null) {
            return;
        }
        c8085a.D(defaultProjectionUserCompat);
    }

    @Override // com.bilibili.lib.projection.internal.nirvana.NirvanaEngine.a.AbstractC0349a
    public final void b(com.bilibili.lib.nirvana.api.g gVar) {
        DefaultProjectionEngineManager defaultProjectionEngineManager;
        C8085a c8085a;
        com.bilibili.lib.nirvana.api.b bVar = (com.bilibili.lib.nirvana.api.b) gVar;
        super.b(bVar);
        int iIntValue = ((Number) bVar.a).intValue();
        NirvanaEngine nirvanaEngine = this.f63313e;
        DefaultProjectionEngineManager defaultProjectionEngineManager2 = nirvanaEngine.f63227d;
        DefaultProjectionUserCompat defaultProjectionUserCompat = null;
        InterfaceC8086b interfaceC8086b = (defaultProjectionEngineManager2 == null || defaultProjectionEngineManager2.getContext() == null) ? null : C7564c.f121636m;
        if (interfaceC8086b instanceof DefaultProjectionUserCompat) {
            defaultProjectionUserCompat = (DefaultProjectionUserCompat) interfaceC8086b;
        }
        if (defaultProjectionUserCompat != null) {
            this.f63312d.getClass();
            int i7 = 0;
            if (iIntValue != -1) {
                i7 = iIntValue != 0 ? iIntValue != 1 ? 0 : 3 : 1;
            }
            defaultProjectionUserCompat.f63019e = i7;
        }
        if (defaultProjectionUserCompat == null || (defaultProjectionEngineManager = nirvanaEngine.f63227d) == null || defaultProjectionEngineManager.getContext() == null || (c8085a = C7564c.f121633j) == null) {
            return;
        }
        c8085a.D(defaultProjectionUserCompat);
    }
}
