package com.bilibili.upper.module.cover_v2.data;

import SH0.f;
import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCaptionFont;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/f.class */
public final class f implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<MultiCaptionFont> f112805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112806b;

    public f(Ref.ObjectRef<MultiCaptionFont> objectRef, MultiCoverDataLoader.b bVar) {
        this.f112805a = objectRef;
        this.f112806b = bVar;
    }

    @Override // SH0.f.b
    public final void a(String str) {
        Ref.ObjectRef<MultiCaptionFont> objectRef = this.f112805a;
        ((MultiCaptionFont) objectRef.element).setLocalPath(str);
        ((MultiCaptionFont) objectRef.element).setDownloaded(true);
        this.f112806b.c(str);
    }

    @Override // SH0.f.b
    public final void b() {
        this.f112806b.a();
    }
}
