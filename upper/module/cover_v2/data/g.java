package com.bilibili.upper.module.cover_v2.data;

import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCaptionFont;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/g.class */
public final class g implements com.bilibili.studio.editor.moudle.material.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<MultiCaptionFont> f112807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112808b;

    public g(Ref.ObjectRef<MultiCaptionFont> objectRef, MultiCoverDataLoader.b bVar) {
        this.f112807a = objectRef;
        this.f112808b = bVar;
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onFailed() {
        this.f112808b.a();
    }

    @Override // com.bilibili.studio.editor.moudle.material.g
    public final void onSuccess(String str) {
        Ref.ObjectRef<MultiCaptionFont> objectRef = this.f112807a;
        ((MultiCaptionFont) objectRef.element).setLocalPath(str);
        ((MultiCaptionFont) objectRef.element).setDownloaded(true);
        this.f112808b.c(str);
    }
}
