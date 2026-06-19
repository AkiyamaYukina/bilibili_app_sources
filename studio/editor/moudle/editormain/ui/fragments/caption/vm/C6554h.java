package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import My0.b;
import android.app.Application;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.timeline.backup.BackUpTag;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import java.util.List;
import javax.inject.Inject;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/h.class */
public final class C6554h extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ez0.a f106708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final My0.b f106709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Ly0.t f106710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Ny0.c f106711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<b.a> f106712g;

    @Inject
    public C6554h(@NotNull Application application, @NotNull ez0.a aVar, @NotNull My0.b bVar, @NotNull Ly0.t tVar, @NotNull Ny0.c cVar) {
        super(application);
        this.f106708c = aVar;
        this.f106709d = bVar;
        this.f106710e = tVar;
        this.f106711f = cVar;
        this.f106712g = FlowKt.asStateFlow(bVar.h);
    }

    public static CaptionInfo J0(C6554h c6554h, long j7, long j8, String str, int i7, CaptionInfo captionInfo, int i8) {
        CaptionInfo captionInfo2;
        My0.b bVar = c6554h.f106709d;
        EditVideoInfo editVideoInfo = bVar.f16505a.f4806b;
        if (editVideoInfo == null) {
            captionInfo2 = null;
        } else {
            List<P50.p> listR = bVar.f16510f.r();
            long j9 = j8 - j7;
            captionInfo2 = null;
            if (j9 > 0) {
                Ly0.t tVar = bVar.f16510f;
                float f7 = tVar.f14992n;
                CaptionInfo captionInfoJ = tVar.j(str, j7, j9, captionInfo, editVideoInfo.getUserTrackBClipList(), i8);
                if (captionInfoJ != null) {
                    captionInfoJ.id = System.currentTimeMillis() + ((long) listR.size());
                    captionInfoJ.captionType = i7;
                    captionInfoJ.inPoint = j7;
                    captionInfoJ.outPoint = j8;
                    captionInfoJ.pos = new BPointF(captionInfoJ.timelineCaption.getCaptionTranslation().x, captionInfoJ.timelineCaption.getCaptionTranslation().y);
                } else {
                    captionInfoJ = null;
                }
                P50.p pVar = captionInfoJ != null ? captionInfoJ.timelineCaption : null;
                captionInfo2 = null;
                if (pVar != null) {
                    bVar.f16510f.G(pVar);
                    listR.add(pVar);
                    bVar.f16510f.H();
                    Oy0.d.d(bVar.f16511g, false, "EditorCaptionMultiEditUseCase.addAsrCaption", false, null, 12);
                    captionInfo2 = captionInfoJ;
                }
            }
        }
        return captionInfo2;
    }

    public final void K0(@NotNull BackUpTag backUpTag) {
        this.f106711f.a(backUpTag);
    }

    public final void L0() {
        this.f106710e.f14981b.t();
    }
}
