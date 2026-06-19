package com.bilibili.ogv.kmm.operation.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.kmm.operation.inlinevideo.j;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinevideo/m.class */
@StabilityInferred(parameters = 0)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<k, j.a.b> f68513a = new HashMap<>();

    @Inject
    public m() {
    }

    public final void a(k kVar) {
        if (this.f68513a.remove(kVar) != null && kVar.b()) {
            b();
        }
        kVar.e(false);
    }

    public final void b() {
        k kVar = null;
        float f7 = Float.POSITIVE_INFINITY;
        for (Map.Entry<k, j.a.b> entry : this.f68513a.entrySet()) {
            k key = entry.getKey();
            j.a.b value = entry.getValue();
            if (key.b()) {
                return;
            }
            float f8 = value.f68510a.a;
            if (f8 < f7) {
                f7 = f8;
                kVar = key;
            }
        }
        if (kVar != null) {
            kVar.e(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull com.bilibili.ogv.kmm.operation.inlinevideo.b r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.inlinevideo.m.c(com.bilibili.ogv.kmm.operation.inlinevideo.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
