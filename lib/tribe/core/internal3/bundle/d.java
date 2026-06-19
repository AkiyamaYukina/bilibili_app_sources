package com.bilibili.lib.tribe.core.internal3.bundle;

import Gf0.InterfaceC1967b;
import Gf0.InterfaceC1969d;
import Gf0.x;
import com.bilibili.lib.tribe.core.internal3.bundle.BundleActionExecutor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/tribe/core/internal3/bundle/d.class */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f64681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC1969d f64682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<BundleActionExecutor.a> f64683c = new ArrayList();

    public d(@NotNull String str, @Nullable InterfaceC1969d interfaceC1969d) {
        this.f64681a = str;
        this.f64682b = interfaceC1969d;
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.c
    @Nullable
    public final x a(@NotNull BundleActionExecutor.a aVar) throws IOException, ClassNotFoundException {
        Iterator it = ((ArrayList) this.f64683c).iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (((BundleActionExecutor.a) it.next()).getMeta().k() <= aVar.getMeta().k()) {
                break;
            }
            i7++;
        }
        if (i7 < 0) {
            ((ArrayList) this.f64683c).add(aVar);
        } else if (((BundleActionExecutor.a) ((ArrayList) this.f64683c).get(i7)).getMeta().k() == aVar.getMeta().k()) {
            ((ArrayList) this.f64683c).set(i7, aVar);
        } else {
            ((ArrayList) this.f64683c).add(i7, aVar);
        }
        if (aVar.getStatus() != BundleActionExecutor.BundleStatus.PENDING_ACTIVE || (this.f64682b instanceof InterfaceC1967b)) {
            aVar.c(BundleActionExecutor.ActivateStage.WARM_UP);
            return null;
        }
        x xVarC = aVar.c(BundleActionExecutor.ActivateStage.ON_INSTALL);
        this.f64682b = xVarC;
        return xVarC;
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.c
    @NotNull
    public final List<BundleActionExecutor.a> b() {
        return this.f64683c;
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.c
    @Nullable
    public final InterfaceC1969d c() {
        return this.f64682b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // com.bilibili.lib.tribe.core.internal3.bundle.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Gf0.x d(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Long, java.lang.String> r5) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.tribe.core.internal3.bundle.d.d(java.util.Map):Gf0.x");
    }

    @Override // com.bilibili.lib.tribe.core.internal3.bundle.c
    @NotNull
    public final String getName() {
        return this.f64681a;
    }
}
