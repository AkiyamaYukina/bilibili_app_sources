package com.bilibili.upper.module.cover_v2.presenter;

import KH0.i;
import P50.p;
import R50.t;
import R50.v;
import UC0.c;
import android.graphics.PointF;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.kaleidoscope.sdk.TimelineCaption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/presenter/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final KH0.c f112826a;

    public a(@Nullable KH0.c cVar) {
        this.f112826a = cVar;
    }

    @Nullable
    public final CaptionInfo a(boolean z6) {
        v vVarF;
        com.bilibili.upper.module.cover_v2.service.c cVarD = d();
        if (cVarD != null && cVarD.f() != null && (vVarF = cVarD.f()) != null) {
            Lazy lazy = KH0.e.f12734b;
            String str = (String) lazy.getValue();
            i iVar = cVarD.f112853a;
            t tVarC = vVarF.c(0L, iVar.e(), str);
            if (tVarC != null) {
                tVarC.b();
                tVarC.setBold(false);
                CaptionInfo captionInfo = new CaptionInfo();
                captionInfo.isCustomAdd = true;
                tVarC.setOutlineWidth(13.0f);
                v vVarF2 = cVarD.f();
                tVarC.t((vVarF2 != null ? vVarF2.k() : null) == null ? 0.0f : r13.b() * 0.07777777f);
                TimelineCaption timelineCaption = tVarC.c;
                captionInfo.fontSize = timelineCaption.getFontSize();
                captionInfo.color = new CaptionInfo.Color(1.0f, 1.0f, 1.0f, 1.0f);
                CaptionAssetBean captionAssetBean = new CaptionAssetBean();
                OC0.h.b(captionAssetBean);
                c.a.b(UC0.c.f24618e, captionAssetBean, tVarC, 1000, 1000, 1000, captionInfo.idTmp);
                captionInfo.textBold = timelineCaption.getBold();
                captionInfo.textItalic = timelineCaption.getItalic();
                captionInfo.textUnderline = timelineCaption.getUnderline();
                captionInfo.captionAssetBean = captionAssetBean;
                OC0.h.M(captionAssetBean, true);
                captionInfo.id = System.currentTimeMillis();
                captionInfo.isTemp = false;
                captionInfo.text = (String) lazy.getValue();
                captionInfo.textOrigin = (String) lazy.getValue();
                captionInfo.pos = new BPointF(timelineCaption.getCaptionTranslation().x, timelineCaption.getCaptionTranslation().y);
                captionInfo.isStyleEdited = true;
                captionInfo.idTmp = -10086;
                cVarD.f112854b.getCaptionList().add(captionInfo);
                com.bilibili.studio.videoeditor.extension.h.c(tVarC, "object_caption_info", captionInfo);
                cVarD.j(tVarC);
                cVarD.i(captionInfo);
                iVar.l();
                if (z6) {
                    Iterator it = ((ArrayList) iVar.f12753l.f12739a).iterator();
                    while (it.hasNext()) {
                        ((KH0.b) it.next()).a(cVarD.f112858f);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        f();
        com.bilibili.upper.module.cover_v2.service.c cVarD2 = d();
        CaptionInfo captionInfo2 = null;
        if (cVarD2 != null) {
            captionInfo2 = cVarD2.f112858f;
        }
        return captionInfo2;
    }

    public final void b(@Nullable String str) {
        com.bilibili.upper.module.cover_v2.service.c cVarD = d();
        if (cVarD != null && str != null) {
            CaptionInfo captionInfo = cVarD.f112858f;
            if (captionInfo != null) {
                captionInfo.text = str;
            }
            if (captionInfo != null) {
                captionInfo.textOrigin = str;
            }
            if (captionInfo != null) {
                captionInfo.isStyleEdited = true;
            }
            p pVar = cVarD.f112857e;
            if (pVar != null) {
                pVar.setText(str);
            }
            cVarD.f112853a.l();
        }
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.widget.FrameLayout] */
    @NotNull
    public final PointF c(@NotNull p pVar) {
        KH0.c cVar = this.f112826a;
        UpperLiveWindowExt upperLiveWindowExtB = cVar != null ? cVar.b() : null;
        PointF pointF = new PointF();
        List boundingRectangleVertices = pVar.getBoundingRectangleVertices();
        if (boundingRectangleVertices != null) {
            pointF.x = (((PointF) boundingRectangleVertices.get(0)).x + ((PointF) boundingRectangleVertices.get(2)).x) / 2.0f;
            pointF.y = (((PointF) boundingRectangleVertices.get(0)).y + ((PointF) boundingRectangleVertices.get(2)).y) / 2.0f;
        } else if (upperLiveWindowExtB != null) {
            pointF.x = upperLiveWindowExtB.getWidth() / 2.0f;
            pointF.y = upperLiveWindowExtB.getHeight() / 2.0f;
        }
        return pointF;
    }

    @Nullable
    public final com.bilibili.upper.module.cover_v2.service.c d() {
        com.bilibili.upper.module.cover_v2.ui.a aVarA = this.f112826a.a();
        com.bilibili.upper.module.cover_v2.service.c cVar = null;
        i iVarC3 = aVarA != null ? aVarA.C3() : null;
        if (iVarC3 != null) {
            cVar = iVarC3.f12755n;
        }
        return cVar;
    }

    public final void e(float f7, float f8, boolean z6) {
        p pVarC = this.f112826a.c((int) f7, (int) f8);
        com.bilibili.upper.module.cover_v2.service.c cVarD = d();
        if (cVarD == null || !cVarD.h(pVarC, z6)) {
            return;
        }
        f();
    }

    public final void f() {
        com.bilibili.upper.module.cover_v2.service.c cVarD = d();
        p pVar = cVarD != null ? cVarD.f112857e : null;
        KH0.c cVar = this.f112826a;
        if (pVar == null) {
            cVar.d();
            cVar.f();
            return;
        }
        com.bilibili.upper.module.cover_v2.service.c cVarD2 = d();
        p pVar2 = null;
        if (cVarD2 != null) {
            pVar2 = cVarD2.f112857e;
        }
        cVar.e(pVar2);
        cVar.f();
    }
}
