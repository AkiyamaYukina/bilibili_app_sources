package com.bilibili.studio.editor.moudle.intelligence.vm;

import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceAudioConfig;
import com.bilibili.studio.editor.moudle.intelligence.vm.a;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.C6571h;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/o.class */
public final class o implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f107883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f107884b;

    public /* synthetic */ o(Object obj, Object obj2) {
        this.f107883a = obj;
        this.f107884b = obj2;
    }

    public void b() {
        j jVar = (j) this.f107883a;
        jVar.getClass();
        j.g("[智能成片] 快速ASR 失败，耗时=0,错误原因=mEditVideoInfo == null");
        Xz0.d dVar = Xz0.d.f28458a;
        String str = jVar.f107640k;
        dVar.getClass();
        Xz0.d.f(str, "error", "mEditVideoInfo == null");
        IntelligenceAudioConfig intelligenceAudioConfig = (IntelligenceAudioConfig) this.f107884b;
        intelligenceAudioConfig.fastAsrResult = 2;
        jVar.k(intelligenceAudioConfig, null);
    }

    public void d(IntelligenceAudioConfig intelligenceAudioConfig, long j7) {
        j jVar = (j) this.f107883a;
        jVar.getClass();
        j.g("[智能成片][快速ASR] 成功，耗时=" + j7 + ",结果=" + intelligenceAudioConfig);
        IntelligenceAudioConfig intelligenceAudioConfig2 = intelligenceAudioConfig;
        if (intelligenceAudioConfig == null) {
            intelligenceAudioConfig2 = (IntelligenceAudioConfig) this.f107884b;
        }
        if (!intelligenceAudioConfig2.autoASR) {
            j.g("[智能成片][ASR识别] 不需要ASR识别");
            Xz0.d dVar = Xz0.d.f28458a;
            String str = jVar.f107640k;
            dVar.getClass();
            Xz0.d.f(str, "success", "");
            jVar.k(intelligenceAudioConfig2, null);
            return;
        }
        j.g("[智能成片][ASR识别] 开始");
        a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
        if (interfaceC1197a != null) {
            interfaceC1197a.b("step_asr_re");
        }
        C6571h c6571h = jVar.f107637g;
        if (c6571h != null) {
            c6571h.f(jVar.f107640k, new l(jVar, intelligenceAudioConfig2));
        }
    }

    public void onFailure(Call call, IOException iOException) {
        ih.b.a((ih.b) this.f107883a, (Response) null, iOException, (String) this.f107884b);
    }

    public void onResponse(Call call, Response response) {
        ih.b.a((ih.b) this.f107883a, response, (IOException) null, (String) this.f107884b);
    }
}
