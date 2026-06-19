package com.bilibili.studio.editor.moudle.intelligence.frame;

import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameUploadData;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d;
import nz0.InterfaceC8146a;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/c.class */
public final class c implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f107299a;

    public c(d dVar) {
        this.f107299a = dVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void a() {
        InterfaceC8146a interfaceC8146a = this.f107299a.f107300a;
        if (interfaceC8146a != null) {
            interfaceC8146a.e();
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void b(int i7, String str, String str2) {
        M.b("新上传逻辑～onUploadFail errorMsg=", str, "AiFrameManager");
        d dVar = this.f107299a;
        InterfaceC8146a interfaceC8146a = dVar.f107300a;
        if (interfaceC8146a != null) {
            if (i7 == 1) {
                interfaceC8146a.f(i7, str2, true);
            } else {
                interfaceC8146a.d(dVar.f107306g, str2, true);
            }
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d.a
    public final void c(int i7, long j7, String str) {
        d dVar = this.f107299a;
        if (dVar.f107300a != null) {
            dVar.f107300a.a(dVar.f107306g, new FrameUploadData(str, j7, i7, true, d.a(dVar)));
        }
    }
}
