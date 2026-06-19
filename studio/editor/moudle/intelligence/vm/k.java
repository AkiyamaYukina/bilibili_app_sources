package com.bilibili.studio.editor.moudle.intelligence.vm;

import com.bilibili.studio.editor.moudle.intelligence.data.FileFrameResult;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/k.class */
public final class k implements IntelligenceModDownloadLogic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f107665a;

    public k(j jVar) {
        this.f107665a = jVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
    public final void a(long j7, String str) {
        j jVar = this.f107665a;
        String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][Mod资源][画面识别mod] 下载失败，耗时=", "，失败原因=", str);
        jVar.getClass();
        j.g(strB);
        this.f107665a.f107647r = 2;
        j jVar2 = this.f107665a;
        List<FileFrameResult> list = jVar2.f107648s;
        if (list != null) {
            j.a(jVar2, list);
        }
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.IntelligenceModDownloadLogic.a
    public final void b(long j7, String str, String str2) {
        j jVar = this.f107665a;
        String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][Mod资源][画面识别mod] 下载成功，耗时=", ",modVersion=", str2);
        jVar.getClass();
        j.g(strB);
        this.f107665a.f107647r = 1;
        j jVar2 = this.f107665a;
        jVar2.f107645p = jVar2.f(jVar2.f107633c.b());
        j jVar3 = this.f107665a;
        List<FileFrameResult> list = jVar3.f107648s;
        if (list != null) {
            j.a(jVar3, list);
        }
    }
}
