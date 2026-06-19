package com.bilibili.pegasus.components.interestv2;

import Sm.t;
import com.bilibili.lib.gripper.api.SuspendProducer;
import com.bilibili.moduleservice.main.f;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/a.class */
public final class a {
    @Nullable
    public static final Fp0.b a() {
        Fp0.b bVar = null;
        SuspendProducer suspendProducerA = t.a(f.class, (String) null, 2, (Object) null);
        f fVar = suspendProducerA != null ? (f) suspendProducerA.get() : null;
        if (fVar instanceof Fp0.b) {
            bVar = (Fp0.b) fVar;
        }
        return bVar;
    }
}
