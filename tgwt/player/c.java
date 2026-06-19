package com.bilibili.tgwt.player;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/c.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.c f111540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.c f111541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.c f111542d;

    public c(yW0.c cVar, yW0.c cVar2, yW0.c cVar3, yW0.c cVar4) {
        this.f111539a = cVar;
        this.f111540b = cVar2;
        this.f111541c = cVar3;
        this.f111542d = cVar4;
    }

    public final Object get() {
        return new b((Context) this.f111539a.a, (rW0.b) this.f111540b.a, (rW0.b) this.f111541c.a, (rW0.b) this.f111542d.a);
    }
}
