package com.bilibili.studio.centerplus.model;

import com.bilibili.studio.centerplus.network.entity.PreviewData;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/model/j.class */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f105181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RE0.c f105183c;

    public /* synthetic */ j(boolean z6, boolean z7, RE0.c cVar) {
        this.f105181a = z6;
        this.f105182b = z7;
        this.f105183c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Unit unit;
        if (this.f105181a && k.a()) {
            unit = Unit.INSTANCE;
        } else {
            boolean z6 = this.f105182b;
            RE0.c cVar = this.f105183c;
            l lVar = l.f105184a;
            if (z6) {
                cVar.invoke(Boolean.FALSE, lVar.a());
                Unit unit2 = Unit.INSTANCE;
            } else {
                PreviewData previewData = l.f105185b;
                boolean z7 = previewData != null;
                PreviewData previewDataA = previewData;
                if (previewData == null) {
                    previewDataA = lVar.a();
                }
                cVar.invoke(Boolean.valueOf(z7), previewDataA);
                Unit unit3 = Unit.INSTANCE;
            }
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
