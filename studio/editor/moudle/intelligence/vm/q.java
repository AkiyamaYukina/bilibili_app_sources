package com.bilibili.studio.editor.moudle.intelligence.vm;

import com.bilibili.studio.editor.moudle.intelligence.vm.a;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import org.json.JSONException;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/q.class */
public final class q implements a.InterfaceC1197a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f107886a;

    public q(b bVar) {
        this.f107886a = bVar;
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.a.InterfaceC1197a
    public final void a(EditVideoInfo editVideoInfo, boolean z6) throws JSONException {
        String strA = com.bilibili.app.comm.bh.x5.b.a("[智能成片] 正常流程结束，生成结果=", z6);
        b bVar = this.f107886a;
        BiliIntelligenceGenViewModelV1.O0(strA);
        com.bilibili.studio.videoeditor.extension.l.a(editVideoInfo);
        if (!z6 || editVideoInfo == null) {
            EditVideoInfo editVideoInfo2 = bVar.f107582c;
            if (editVideoInfo2 != null) {
                editVideoInfo2.setFrameExtractCount(editVideoInfo != null ? editVideoInfo.getFrameExtractCount() : 0);
            }
            EditVideoInfo editVideoInfo3 = bVar.f107582c;
            if (editVideoInfo3 != null) {
                int frameUploadCount = 0;
                if (editVideoInfo != null) {
                    frameUploadCount = editVideoInfo.getFrameUploadCount();
                }
                editVideoInfo3.setFrameUploadCount(frameUploadCount);
            }
            bVar.f107584e.postValue(Boolean.TRUE);
            bVar.P0("error", "没有数据");
        } else {
            bVar.f107582c = editVideoInfo;
            BiliIntelligenceGenViewModelV1.J0(bVar, -1);
            bVar.P0("success", "生成成功");
        }
        BiliIntelligenceGenViewModelV1.Q0();
    }

    @Override // com.bilibili.studio.editor.moudle.intelligence.vm.a.InterfaceC1197a
    public final void b(String str) {
        BLog.e("BiliIntelligenceGenViewModelV1", "genIntelligenceProject onLogicProgress type=".concat(str));
    }
}
