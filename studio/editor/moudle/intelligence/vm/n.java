package com.bilibili.studio.editor.moudle.intelligence.vm;

import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/n.class */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f107882a;

    public n(j jVar) {
        this.f107882a = jVar;
    }

    public final void a(int i7, long j7) {
        j jVar = this.f107882a;
        if (i7 != 12) {
            String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][素材取帧] 失败，耗时=", "，失败原因：", i7 != 3 ? i7 != 4 ? "未知原因" : "帧列表为空" : "素材列表为空");
            jVar.getClass();
            j.g(strB);
            j.a(jVar, new ArrayList());
            return;
        }
        jVar.getClass();
        j.g("[智能成片][帧上传] 失败，耗时=" + j7);
        yz0.a aVar = jVar.f107650u;
        aVar.c = true;
        aVar.j = null;
        jVar.i();
    }
}
