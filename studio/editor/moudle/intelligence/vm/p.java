package com.bilibili.studio.editor.moudle.intelligence.vm;

import androidx.compose.runtime.snapshots.z;
import com.bilibili.studio.editor.moudle.intelligence.data.IntelligenceMusicInfo;
import com.bilibili.studio.editor.moudle.intelligence.vm.a;
import com.bilibili.studio.editor.moudle.intelligence.vm.logic.I;
import com.bilibili.studio.videoeditor.capturev3.data.BgmMissionInfo;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/p.class */
public final class p implements I.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f107885a;

    public p(j jVar) {
        this.f107885a = jVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.I.a
    public final void a(IntelligenceMusicInfo intelligenceMusicInfo, List<String> list, long j7) {
        long j8 = intelligenceMusicInfo.musicId;
        StringBuilder sbA = z.a(j7, "[智能成片][音乐下载] 成功，耗时=", "，音乐sid=");
        sbA.append(j8);
        String string = sbA.toString();
        j jVar = this.f107885a;
        jVar.getClass();
        j.g(string);
        jVar.l(intelligenceMusicInfo, list);
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.I.a
    public final void b(BgmMissionInfo bgmMissionInfo, long j7) {
        a.InterfaceC1197a interfaceC1197a = this.f107885a.f107602a;
        if (interfaceC1197a != null) {
            interfaceC1197a.b("step_music_download");
        }
        j.g("[智能成片][音乐推荐] 成功，耗时=" + j7 + "，推荐的音乐=" + bgmMissionInfo);
        j.g("[智能成片][音乐下载] 开始");
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.logic.I.a
    public final void c(long j7, String str) {
        String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][音乐推荐/下载] 失败，耗时=", "，失败原因=", str);
        j jVar = this.f107885a;
        jVar.getClass();
        j.g(strB);
        jVar.l(null, null);
    }
}
