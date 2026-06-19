package com.bilibili.upper.module.cover_v2.data;

import SH0.f;
import com.bilibili.upper.module.cover_v2.data.MultiCoverDataLoader;
import com.bilibili.upper.module.cover_v2.model.template.MultiCoverCaptionTemplate;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/data/i.class */
public final class i implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<MultiCoverCaptionTemplate> f112809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultiCoverDataLoader.b f112810b;

    public i(Ref.ObjectRef<MultiCoverCaptionTemplate> objectRef, MultiCoverDataLoader.b bVar) {
        this.f112809a = objectRef;
        this.f112810b = bVar;
    }

    @Override // SH0.f.b
    public final void a(String str) {
        Ref.ObjectRef<MultiCoverCaptionTemplate> objectRef = this.f112809a;
        ((MultiCoverCaptionTemplate) objectRef.element).setPackagePath(str);
        ((MultiCoverCaptionTemplate) objectRef.element).setDownloaded(true);
        this.f112810b.c(str);
    }

    @Override // SH0.f.b
    public final void b() {
        this.f112810b.a();
    }
}
