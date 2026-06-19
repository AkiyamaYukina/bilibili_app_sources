package com.bilibili.tgwt.watermark;

import android.content.Context;
import com.bilibili.bangumi.logic.page.detail.service.DetailRightPanelService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/a.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class a implements Factory<PgcPlayerWatermarkFunctionWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f112306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f112307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f112308c;

    public a(yW0.b bVar, yW0.b bVar2, yW0.c cVar) {
        this.f112306a = cVar;
        this.f112307b = bVar;
        this.f112308c = bVar2;
    }

    public final Object get() {
        return new PgcPlayerWatermarkFunctionWidget((Context) this.f112306a.a, (ScreenStateService) this.f112307b.get(), (DetailRightPanelService) this.f112308c.get());
    }
}
