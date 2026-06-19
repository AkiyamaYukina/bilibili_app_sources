package com.bilibili.studio.editor.moudle.intelligence.vm.logic;

import F3.C1692b;
import android.text.TextUtils;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.intelligence.data.FileFrameResult;
import com.bilibili.studio.editor.moudle.intelligence.frame.data.FrameUploadData;
import com.bilibili.studio.editor.moudle.intelligence.vm.a;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import nz0.InterfaceC8146a;
import org.json.JSONException;
import tv.danmaku.android.log.BLog;
import zz0.C9270a;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.intelligence.vm.logic.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/logic/x.class */
public final class C6586x implements InterfaceC8146a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f107866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.LongRef f107867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.studio.editor.moudle.intelligence.vm.n f107869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<FileFrameResult> f107870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ref.IntRef f107871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EditVideoInfo f107872g;
    public final Ref.IntRef h;

    public C6586x(y yVar, Ref.LongRef longRef, String str, com.bilibili.studio.editor.moudle.intelligence.vm.n nVar, List list, Ref.IntRef intRef, EditVideoInfo editVideoInfo, Ref.IntRef intRef2) {
        this.f107866a = yVar;
        this.f107867b = longRef;
        this.f107868c = str;
        this.f107869d = nVar;
        this.f107870e = list;
        this.f107871f = intRef;
        this.f107872g = editVideoInfo;
        this.h = intRef2;
    }

    @Override // nz0.InterfaceC8146a
    public final void a(String str, FrameUploadData frameUploadData) throws JSONException {
        String str2 = frameUploadData.zipUrl;
        long j7 = frameUploadData.fileSize;
        Ref.IntRef intRef = this.h;
        int i7 = intRef.element + frameUploadData.frameCount;
        intRef.element = i7;
        this.f107872g.setFrameUploadCount(i7);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f107867b.element;
        BLog.e("FrameLogic", "onFrameUploadSuccess " + str2);
        BLog.e("timee", "帧文件上传 time=" + jCurrentTimeMillis + ",fileSize=" + j7);
        this.f107866a.getClass();
        Xz0.d.f28458a.getClass();
        HashMap map = new HashMap();
        map.put("task_id", this.f107868c);
        map.put("frame_size", String.valueOf(j7));
        map.put("frame_url", str2 == null ? "" : str2);
        Neurons.trackT(false, "creation.uper.ai_to_video.frame_size.track", map, 1, new C1692b(6));
        C9270a.a(this.f107866a, this.f107868c, "upload_frame", jCurrentTimeMillis, true, "", null, null, 224);
        com.bilibili.studio.editor.moudle.intelligence.vm.n nVar = this.f107869d;
        String strB = androidx.compose.ui.input.pointer.k.b(jCurrentTimeMillis, "[智能成片][帧上传] 成功，耗时=", ",文件路径=", str2);
        com.bilibili.studio.editor.moudle.intelligence.vm.j jVar = nVar.f107882a;
        jVar.getClass();
        com.bilibili.studio.editor.moudle.intelligence.vm.j.g(strB);
        yz0.a aVar = jVar.f107650u;
        aVar.c = true;
        aVar.j = str2;
        N n7 = jVar.f107639j;
        if (n7 != null) {
            n7.f107750n = str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (jVar.f107652w == null) {
                jVar.f107652w = new com.bilibili.studio.editor.moudle.home.presenter.k();
                Unit unit = Unit.INSTANCE;
            }
            com.bilibili.studio.editor.moudle.home.presenter.k kVar = jVar.f107652w;
            if (kVar != null) {
                com.bilibili.studio.editor.moudle.home.presenter.k.a(kVar, jVar.f107641l, str2, 1, 1);
            }
        }
        jVar.i();
    }

    @Override // nz0.InterfaceC8146a
    public final void c(int i7, String str, List list, String str2) {
        q4.M.b("onFrameProcess ", str2, "FrameLogic");
        if (list != null) {
            List<FileFrameResult> list2 = this.f107870e;
            FileFrameResult fileFrameResult = new FileFrameResult();
            fileFrameResult.filePath = str2;
            fileFrameResult.rotation = i7;
            fileFrameResult.frameList = list;
            list2.add(fileFrameResult);
            Ref.IntRef intRef = this.f107871f;
            int size = list.size() + intRef.element;
            intRef.element = size;
            this.f107872g.setFrameExtractCount(size);
        }
    }

    @Override // nz0.InterfaceC8146a
    public final void d(String str, String str2, boolean z6) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f107867b.element;
        C9270a.a(this.f107866a, this.f107868c, "upload_frame", jCurrentTimeMillis, false, "Frame upload error", null, null, 224);
        this.f107869d.a(12, jCurrentTimeMillis);
    }

    @Override // nz0.InterfaceC8146a
    public final void f(int i7, String str, boolean z6) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f107867b.element;
        y yVar = this.f107866a;
        yVar.f107875f.set(true);
        CountDownTimerC6585w countDownTimerC6585w = yVar.f107874e;
        if (countDownTimerC6585w != null) {
            countDownTimerC6585w.cancel();
        }
        if (i7 != 1) {
            C9270a.a(this.f107866a, this.f107868c, "extract_frame", jCurrentTimeMillis, false, "Frame extract error", null, null, 224);
        }
        this.f107869d.a(4, jCurrentTimeMillis);
    }

    @Override // nz0.InterfaceC8146a
    public final void g(String str, String str2) {
        y yVar = this.f107866a;
        yVar.f107875f.set(true);
        CountDownTimerC6585w countDownTimerC6585w = yVar.f107874e;
        if (countDownTimerC6585w != null) {
            countDownTimerC6585w.cancel();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ref.LongRef longRef = this.f107867b;
        long j7 = jCurrentTimeMillis - longRef.element;
        BLog.e("timee", androidx.compose.ui.input.pointer.k.b(j7, "视频取帧 time=", ",帧路径=", str2));
        C9270a.a(this.f107866a, this.f107868c, "extract_frame", j7, true, "", null, null, 224);
        com.bilibili.studio.editor.moudle.intelligence.vm.n nVar = this.f107869d;
        List<FileFrameResult> list = this.f107870e;
        String strB = androidx.compose.ui.input.pointer.k.b(j7, "[智能成片][素材取帧] 成功，耗时=", ",本地路径=", str2);
        com.bilibili.studio.editor.moudle.intelligence.vm.j jVar = nVar.f107882a;
        jVar.getClass();
        com.bilibili.studio.editor.moudle.intelligence.vm.j.g(strB);
        com.bilibili.studio.editor.moudle.intelligence.vm.j.g("[智能成片][帧上传] 开始");
        a.InterfaceC1197a interfaceC1197a = jVar.f107602a;
        if (interfaceC1197a != null) {
            interfaceC1197a.b("step_upload_frame");
        }
        com.bilibili.studio.editor.moudle.intelligence.vm.j.a(jVar, list);
        longRef.element = System.currentTimeMillis();
        C9270a.b(this.f107866a, this.f107868c, "upload_frame", null, null, 12);
    }
}
