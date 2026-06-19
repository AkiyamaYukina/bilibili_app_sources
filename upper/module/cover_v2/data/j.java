package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverCaptionTemplate;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/j.class */
public final class j implements com.bilibili.studio.editor.moudle.material.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<MultiCoverCaptionTemplate> f112811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112812b;

    public j(Ref.ObjectRef<MultiCoverCaptionTemplate> objectRef, MultiCoverDataLoader.b bVar) {
        this.f112811a = objectRef;
        this.f112812b = bVar;
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onFailed() {
        this.f112812b.a();
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onSuccess(String str) {
        Ref.ObjectRef<MultiCoverCaptionTemplate> objectRef = this.f112811a;
        ((MultiCoverCaptionTemplate) objectRef.element).setPackagePath(str);
        ((MultiCoverCaptionTemplate) objectRef.element).setDownloaded(true);
        this.f112812b.c(str);
    }
}
