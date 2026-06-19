package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCaptionFlower;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/d.class */
public final class d implements com.bilibili.studio.editor.moudle.material.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<MultiCaptionFlower> f112803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112804b;

    public d(Ref.ObjectRef<MultiCaptionFlower> objectRef, MultiCoverDataLoader.b bVar) {
        this.f112803a = objectRef;
        this.f112804b = bVar;
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onFailed() {
        this.f112804b.a();
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onSuccess(String str) {
        Ref.ObjectRef<MultiCaptionFlower> objectRef = this.f112803a;
        ((MultiCaptionFlower) objectRef.element).setRenderPath(str);
        ((MultiCaptionFlower) objectRef.element).setDownloaded(true);
        this.f112804b.c(str);
    }
}
