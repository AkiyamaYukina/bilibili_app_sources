package com.bilibili.studio.editor.moudle.intelligence.frame;

import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameUploadData;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import nz0.InterfaceC8146a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/a.class */
public final class a implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f107297a;

    public a(b bVar) {
        this.f107297a = bVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void a() {
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void b(int i7, String str, String str2) {
        S9.b.a(bilibili.live.app.service.resolver.a.b(i7, "onUploadFail errorCode=", ",errorMsg=", str, ",zipFile="), str2, "AiFrameManager");
        d dVar = this.f107297a.f107298a;
        InterfaceC8146a interfaceC8146a = dVar.f107300a;
        if (interfaceC8146a != null) {
            if (i7 == 1) {
                interfaceC8146a.f(i7, str2, false);
            } else {
                interfaceC8146a.d(dVar.f107306g, str2, false);
            }
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void c(int i7, long j7, String str) {
        b bVar = this.f107297a;
        d dVar = bVar.f107298a;
        if (dVar.f107300a != null) {
            FrameUploadData frameUploadData = new FrameUploadData(str, j7, i7, false, d.a(dVar));
            d dVar2 = bVar.f107298a;
            dVar2.f107300a.a(dVar2.f107306g, frameUploadData);
        }
    }
}
