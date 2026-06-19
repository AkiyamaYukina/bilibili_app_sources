package com.bilibili.ship.theseus.detail.di;

import android.net.Uri;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import hv0.C7510d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/D.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class D implements Factory<C7510d.a> {
    public static C7510d.a a(x xVar) {
        String str = xVar.f91011C;
        String str2 = (str == null || Uri.parse(str).getScheme() == null) ? null : xVar.f91011C;
        Fj1.b bVar = xVar.f91040c0;
        String str3 = null;
        if (bVar != null) {
            Fj1.a aVar = bVar.a;
            str3 = null;
            if (aVar != null) {
                str3 = aVar.h;
            }
        }
        return (C7510d.a) Preconditions.checkNotNullFromProvides(new C7510d.a(str2, str3));
    }
}
