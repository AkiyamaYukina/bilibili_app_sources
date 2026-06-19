package com.bilibili.pegasus.holders;

import android.view.View;
import com.bilibili.base.MainThread;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.template.BiliEditorTemplateFragmentV5;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.editor.moudle.templatev2.vm.k;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoIntelligenceInfo;
import com.bilibili.studio.videoeditor.editor.editdata.Size;
import com.bilibili.studio.videoeditor.ms.picture.PictureRatioInfo;
import com.bilibili.studio.videoeditor.util.EditorMonStatsExtraUtils;
import fA0.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import op0.C8249a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.moss.MossConfigFragment;
import uy0.a;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/t0.class */
public final /* synthetic */ class ViewOnClickListenerC5699t0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78094b;

    public /* synthetic */ ViewOnClickListenerC5699t0(Object obj, int i7) {
        this.f78093a = i7;
        this.f78094b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditVideoIntelligenceInfo intelligenceInfo;
        dz0.f fVar;
        final Ex0.n nVar;
        Size videoSize;
        PictureRatioInfo pictureRatioInfo;
        switch (this.f78093a) {
            case 0:
                LargeCoverV9Holder largeCoverV9Holder = (LargeCoverV9Holder) this.f78094b;
                C8249a.h(largeCoverV9Holder, largeCoverV9Holder, null, null, "0", null, false, false, false, false, null, 2038);
                break;
            case 1:
                MossConfigFragment mossConfigFragment = (MossConfigFragment) this.f78094b;
                mossConfigFragment.kf("AppPushUnregister");
                mossConfigFragment.jf("na", (Function2) new Object(), new o0.C(1));
                break;
            default:
                BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV5 = (BiliEditorTemplateFragmentV5) this.f78094b;
                if (!com.bilibili.studio.videoeditor.util.V.f()) {
                    biliEditorTemplateFragmentV5.getClass();
                    Lazy lazy = fA0.l.d;
                    EditorTemplateTabItemBean editorTemplateTabItemBean = l.a.a().b;
                    BLog.d("TemplateReportCacheUtils", "markLastCancelTemplate: " + (editorTemplateTabItemBean != null ? Long.valueOf(editorTemplateTabItemBean.getOriginId()) : null));
                    com.bilibili.studio.editor.moudle.music.manager.b.d().b();
                    Mw0.d dVar = biliEditorTemplateFragmentV5.f106992m;
                    Mw0.d dVar2 = dVar;
                    if (dVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                        dVar2 = null;
                    }
                    k.c cVar = biliEditorTemplateFragmentV5.f106996q;
                    boolean z6 = cVar.f108202d;
                    boolean z7 = cVar.f108203e;
                    BiliEditorTemplateFragmentV5 biliEditorTemplateFragmentV52 = (BiliEditorTemplateFragmentV5) dVar2.f16454c;
                    biliEditorTemplateFragmentV52.jf();
                    ey0.c cVar2 = biliEditorTemplateFragmentV52.f105685b;
                    if (cVar2 != null) {
                        EditVideoInfo editVideoInfo = (EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16450a;
                        if (editVideoInfo != null && (videoSize = editVideoInfo.getVideoSize()) != null) {
                            EditVideoInfo editVideoInfo2 = (EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16451b;
                            cVar2.l((EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16450a, videoSize.getWidth(), videoSize.getHeight(), (editVideoInfo2 == null || (pictureRatioInfo = editVideoInfo2.getPictureRatioInfo()) == null) ? -1.0f : pictureRatioInfo.ratio);
                        }
                        a.a aVar = ((uy0.a) dVar2).g;
                        if (aVar != null) {
                            ((EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16450a).setUserTrackNativeVolume(aVar.a);
                            ((EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16450a).setEditorMusicInfo(aVar.b);
                        }
                        com.bilibili.studio.editor.timeline.i iVar = ((uy0.a) dVar2).f;
                        if (iVar != null) {
                            iVar.b((EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16450a, true, "TemplatePresenterV5-cancelEdit");
                        }
                        long j7 = iVar != null ? iVar.j() : 0L;
                        BiliEditorMainActivity biliEditorMainActivity = cVar2.a;
                        dz0.c cVar3 = ((Yv0.b) biliEditorMainActivity).B;
                        if (cVar3 != null && (fVar = cVar3.d) != null && (nVar = fVar.a) != null) {
                            BLog.d("StreamingRepository", "seekTimelineWithoutGap startTime=" + j7 + ",delayTime=100");
                            final long j8 = j7;
                            MainThread.postOnMainThreadDelayed(new Runnable(nVar, j8) { // from class: Ex0.m

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final n f4829a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final long f4830b;

                                {
                                    this.f4829a = nVar;
                                    this.f4830b = j8;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    n nVar2 = this.f4829a;
                                    long j9 = this.f4830b;
                                    com.bilibili.studio.editor.timeline.i iVar2 = nVar2.f4833c;
                                    if (iVar2 != null) {
                                        iVar2.q(j9, 0L);
                                    }
                                }
                            }, 100L);
                        }
                        dz0.c cVar4 = ((Yv0.b) biliEditorMainActivity).B;
                        if (cVar4 != null) {
                            cVar4.e.f.i(null, true);
                        }
                    }
                    Xz0.d.f28458a.getClass();
                    Xz0.d.r("模板", null);
                    EditVideoInfo editVideoInfo3 = (EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16450a;
                    int i7 = (editVideoInfo3 == null || (intelligenceInfo = editVideoInfo3.getIntelligenceInfo()) == null) ? 0 : intelligenceInfo.enterFrom;
                    String strE = com.bilibili.studio.videoeditor.extension.l.e((EditVideoInfo) ((Rz0.a) dVar2.f16455d).f16451b);
                    Map mapE = Xz0.d.e();
                    HashMap map = (HashMap) mapE;
                    P4.a.a(i7, "fast_video", strE, "enter_from", map);
                    map.put("action_type", (z6 && z7) ? "选择音乐和模板" : z6 ? "选择模板" : z7 ? "选择音乐" : "无操作");
                    Neurons.reportClick(false, "creation.new-video-editor.template.cancel.click", mapE);
                    biliEditorTemplateFragmentV5.f105685b.A(true);
                    EditVideoInfo editVideoInfoZf = biliEditorTemplateFragmentV5.zf();
                    EditorTemplateTabItemBean editTemplateInfo = editVideoInfoZf != null ? editVideoInfoZf.getEditTemplateInfo() : null;
                    EditVideoInfo editVideoInfoYf = biliEditorTemplateFragmentV5.yf();
                    if (!Intrinsics.areEqual(editTemplateInfo, editVideoInfoYf != null ? editVideoInfoYf.getEditTemplateInfo() : null)) {
                        EditVideoInfo editVideoInfoZf2 = biliEditorTemplateFragmentV5.zf();
                        Ez0.e eVarB = Ez0.e.b();
                        List<String> templateMusicList = null;
                        if (editVideoInfoZf2 != null) {
                            templateMusicList = editVideoInfoZf2.getTemplateMusicList();
                        }
                        eVarB.h(templateMusicList);
                    }
                    EditorMonStatsExtraUtils.a(biliEditorTemplateFragmentV5.zf(), biliEditorTemplateFragmentV5.f105687d);
                    break;
                }
                break;
        }
    }
}
