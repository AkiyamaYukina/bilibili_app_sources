package com.bilibili.studio.editor.moudle.intelligence.vm;

import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/l.class */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f107666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntelligenceAudioConfig f107667b;

    public l(j jVar, IntelligenceAudioConfig intelligenceAudioConfig) {
        this.f107666a = jVar;
        this.f107667b = intelligenceAudioConfig;
    }

    public final void a(long j7, String str) {
        String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][ASR识别] 失败，耗时=", "，原因=", str);
        j jVar = this.f107666a;
        jVar.getClass();
        j.g(strB);
        Xz0.d dVar = Xz0.d.f28458a;
        String str2 = jVar.f107640k;
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        dVar.getClass();
        Xz0.d.f(str2, "error", str3);
        IntelligenceAudioConfig intelligenceAudioConfig = this.f107667b;
        intelligenceAudioConfig.asrResult = 2;
        jVar.k(intelligenceAudioConfig, null);
    }

    public final void b(int i7, long j7, List list) {
        j jVar = this.f107666a;
        jVar.getClass();
        j.g("[智能成片][ASR识别] 成功，耗时=" + j7 + "，识别结果=" + list);
        IntelligenceAudioConfig intelligenceAudioConfig = this.f107667b;
        intelligenceAudioConfig.asrResult = i7;
        if (list.isEmpty()) {
            jVar.k(intelligenceAudioConfig, null);
            Xz0.d dVar = Xz0.d.f28458a;
            String str = jVar.f107640k;
            dVar.getClass();
            Xz0.d.f(str, "error", "no result");
            return;
        }
        Xz0.d dVar2 = Xz0.d.f28458a;
        String str2 = jVar.f107640k;
        dVar2.getClass();
        Xz0.d.f(str2, "success", "");
        jVar.k(intelligenceAudioConfig, list);
    }
}
