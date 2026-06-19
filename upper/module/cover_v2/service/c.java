package com.bilibili.upper.module.cover_v2.service;

import KH0.i;
import OC0.h;
import P50.n;
import P50.p;
import R50.t;
import R50.v;
import UC0.c;
import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.secondary.part.H;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.upper.module.cover_v2.draft.MultiCoverDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/service/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i f112853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public MultiCoverDraft f112854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public p f112855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public CaptionInfo f112856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public p f112857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public CaptionInfo f112858f;

    public c(@NotNull i iVar, @NotNull MultiCoverDraft multiCoverDraft) {
        this.f112853a = iVar;
        this.f112854b = multiCoverDraft;
    }

    public static void b(@Nullable t tVar, @NotNull CaptionInfo captionInfo, boolean z6) {
        if (tVar == null) {
            return;
        }
        tVar.setText(captionInfo.text);
        h.M(captionInfo.captionAssetBean, true);
        c.a aVar = UC0.c.f24618e;
        CaptionAssetBean captionAssetBean = captionInfo.captionAssetBean;
        int i7 = captionInfo.idTmp;
        aVar.getClass();
        c.a.a(captionAssetBean, tVar, 1000, 1000, 1000, i7, !z6);
        if (z6) {
            tVar.setBold(captionInfo.textBold);
            tVar.setItalic(captionInfo.textItalic);
            tVar.setUnderline(captionInfo.textUnderline);
        } else {
            captionInfo.textBold = tVar.c.getBold();
            captionInfo.textItalic = tVar.c.getItalic();
            captionInfo.textUnderline = tVar.c.getUnderline();
        }
        tVar.setAnchorPoint(new PointF(captionInfo.anchorX, captionInfo.anchorY));
        tVar.t(captionInfo.fontSize);
        tVar.setFontByFilePath(captionInfo.font);
        CaptionInfo.Color color = captionInfo.color;
        S50.a aVar2 = ((R50.i) tVar).a;
        if (color != null) {
            tVar.h(color == null ? null : aVar2.createColor(color.f106032r, color.f106031g, color.f106030b, color.f106029a));
        }
        float f7 = captionInfo.outLineWidth;
        if (f7 > 0.0f) {
            tVar.setOutlineWidth(f7);
        }
        tVar.setDrawOutline(captionInfo.drawOutLine);
        CaptionInfo.Color color2 = captionInfo.outLineColor;
        tVar.a(color2 == null ? null : aVar2.createColor(color2.f106032r, color2.f106031g, color2.f106030b, color2.f106029a));
        tVar.setRotationZ(captionInfo.rotation);
        tVar.setScaleX(captionInfo.captionScale);
        tVar.setScaleY(captionInfo.captionScale);
        tVar.setBold(captionInfo.textBold);
        BPointF bPointF = captionInfo.pos;
        tVar.setCaptionTranslation(new PointF(bPointF.f106027x, bPointF.f106028y));
        com.bilibili.studio.videoeditor.extension.h.c(tVar, "object_caption_info", captionInfo);
    }

    public final void a() {
        boolean zIsEmpty = this.f112854b.getCaptionList().isEmpty();
        i iVar = this.f112853a;
        if (zIsEmpty) {
            Iterator it = ((ArrayList) iVar.f12753l.f12739a).iterator();
            while (it.hasNext()) {
                ((KH0.b) it.next()).e(null, false);
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        CaptionInfo captionInfo = this.f112854b.getCaptionList().get(this.f112854b.getCaptionList().size() - 1);
        p pVarG = g(captionInfo.id);
        if (pVarG != null) {
            j(pVarG);
            i(captionInfo);
            Iterator it2 = ((ArrayList) iVar.f12753l.f12739a).iterator();
            while (it2.hasNext()) {
                ((KH0.b) it2.next()).e(this.f112858f, false);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public final void c() {
        CaptionInfo captionInfo = this.f112858f;
        if (captionInfo != null) {
            long j7 = captionInfo.id;
            j(g(j7));
            i(e(j7));
            Iterator it = ((ArrayList) this.f112853a.f12753l.f12739a).iterator();
            while (it.hasNext()) {
                ((KH0.b) it.next()).e(this.f112858f, false);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void d() {
        this.f112857e = null;
        this.f112858f = null;
        this.f112853a.f12753l.a(new H(2));
    }

    public final CaptionInfo e(long j7) {
        for (CaptionInfo captionInfo : this.f112854b.getCaptionList()) {
            if (captionInfo.id == j7) {
                return captionInfo;
            }
        }
        return null;
    }

    public final n f() {
        UpperTimeline upperTimeline = this.f112853a.f12749g;
        return upperTimeline != null ? upperTimeline.getTimeline() : null;
    }

    public final p g(long j7) {
        List<p> listF;
        v vVarF = f();
        if (vVarF != null) {
            com.bilibili.studio.editor.timeline.i iVar = this.f112853a.f12748f;
            if (iVar == null) {
                return null;
            }
            listF = vVarF.f(iVar.j());
        } else {
            listF = null;
        }
        if (listF == null) {
            return null;
        }
        for (p pVar : listF) {
            Object objA = com.bilibili.studio.videoeditor.extension.h.a(pVar, "object_caption_info");
            CaptionInfo captionInfo = objA instanceof CaptionInfo ? (CaptionInfo) objA : null;
            if (captionInfo != null && captionInfo.id == j7) {
                return pVar;
            }
        }
        return null;
    }

    public final boolean h(@Nullable p pVar, boolean z6) {
        p pVar2 = pVar;
        if (pVar == null) {
            pVar2 = this.f112857e;
        }
        if (pVar2 == null || !(com.bilibili.studio.videoeditor.extension.h.a(pVar2, "object_caption_info") instanceof CaptionInfo)) {
            return false;
        }
        j(pVar2);
        i(e(((CaptionInfo) com.bilibili.studio.videoeditor.extension.h.a(pVar2, "object_caption_info")).id));
        Iterator it = ((ArrayList) this.f112853a.f12753l.f12739a).iterator();
        while (it.hasNext()) {
            ((KH0.b) it.next()).e(this.f112858f, z6);
            Unit unit = Unit.INSTANCE;
        }
        return true;
    }

    public final void i(@Nullable CaptionInfo captionInfo) {
        this.f112858f = captionInfo;
        if (captionInfo != null) {
            this.f112856d = captionInfo;
        }
    }

    public final void j(@Nullable p pVar) {
        this.f112857e = pVar;
        if (pVar != null) {
            this.f112855c = pVar;
        }
    }
}
