package com.bilibili.upper.module.cover_v2.data;

import SH0.f;
import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCaptionFlower;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/c.class */
public final class c implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<MultiCaptionFlower> f112801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112802b;

    public c(Ref.ObjectRef<MultiCaptionFlower> objectRef, MultiCoverDataLoader.b bVar) {
        this.f112801a = objectRef;
        this.f112802b = bVar;
    }

    @Override // SH0.f.b
    public final void a(String str) {
        Ref.ObjectRef<MultiCaptionFlower> objectRef = this.f112801a;
        ((MultiCaptionFlower) objectRef.element).setRenderPath(str);
        ((MultiCaptionFlower) objectRef.element).setDownloaded(true);
        this.f112802b.c(str);
    }

    @Override // SH0.f.b
    public final void b() {
        this.f112802b.a();
    }
}
