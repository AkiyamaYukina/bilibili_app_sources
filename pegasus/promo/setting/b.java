package com.bilibili.pegasus.promo.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.pegasus.PegasusInlineVolumeMode;
import javax.inject.Singleton;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/b.class */
@Singleton
@StabilityInferred(parameters = 1)
public final class b implements com.bilibili.pegasus.a {
    public final boolean a() {
        com.bilibili.pegasus.k kVar = (com.bilibili.pegasus.k) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.pegasus.k.class, (String) null, 2, (Object) null);
        boolean z6 = false;
        if (kVar == null) {
            return false;
        }
        if (kVar.a() == PegasusInlineVolumeMode.MODE_USER_OPEN || kVar.a() == PegasusInlineVolumeMode.MODE_SERVER_OPEN) {
            z6 = true;
        }
        return z6;
    }

    public final void b() {
        c.a();
        com.bilibili.pegasus.k kVar = (com.bilibili.pegasus.k) BLRouter.get$default(BLRouter.INSTANCE, com.bilibili.pegasus.k.class, (String) null, 2, (Object) null);
        if (kVar == null) {
            return;
        }
        kVar.b(PegasusInlineVolumeMode.MODE_USER_OPEN);
    }
}
