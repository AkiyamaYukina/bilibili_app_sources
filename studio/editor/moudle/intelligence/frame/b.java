package com.bilibili.studio.editor.moudle.intelligence.frame;

import com.bilibili.studio.editor.moudle.intelligence.frame.data.FileTimePart;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.run.BaseFrameRunStrategy;
import com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.SubsectionFrameUploadStrategy;
import java.util.List;
import nz0.InterfaceC8146a;
import rz0.i;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/frame/b.class */
public final class b implements BaseFrameRunStrategy.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f107298a;

    public b(d dVar) {
        this.f107298a = dVar;
    }

    public final void a(FileTimePart fileTimePart, i.a aVar) {
        InterfaceC8146a interfaceC8146a;
        d dVar = this.f107298a;
        if (dVar.f107308j.get()) {
            BLog.e("AiFrameManager", "startFrameImp 已经强制抽帧结束拉～isStop=" + dVar.f107308j.get());
            return;
        }
        List list = aVar.a;
        boolean zIsImage = fileTimePart.isImage();
        mz0.a aVar2 = dVar.f107312n;
        int i7 = aVar.b;
        int i8 = aVar.c;
        if (zIsImage) {
            aVar2.c += i7;
            aVar2.e += i8;
        } else {
            aVar2.d += i7;
            aVar2.f += i8;
        }
        int iAddAndGet = dVar.f107307i.addAndGet(1);
        InterfaceC8146a interfaceC8146a2 = dVar.f107300a;
        if (interfaceC8146a2 != null) {
            interfaceC8146a2.c(fileTimePart.rotation, dVar.f107306g, list, fileTimePart.filePath);
        }
        if (iAddAndGet != dVar.f107309k || dVar.f107300a == null) {
            return;
        }
        dVar.b();
        BLog.e("AiFrameManager", "onFileFrameProgress 所有文件抽帧完成");
        if (dVar.f107302c == null && (interfaceC8146a = dVar.f107300a) != null) {
            interfaceC8146a.e();
        }
        com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.d dVar2 = dVar.f107302c;
        if (!(dVar2 instanceof com.bilibili.studio.editor.moudle.intelligence.frame.strategy.upload.a) && !(dVar2 instanceof SubsectionFrameUploadStrategy)) {
            if (dVar2 != null) {
                dVar.e(dVar.f107305f);
            }
        } else {
            String str = dVar.f107305f;
            if (dVar2 == null) {
                return;
            }
            dVar2.a(str, new c(dVar));
        }
    }
}
