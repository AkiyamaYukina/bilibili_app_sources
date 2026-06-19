package com.bilibili.upper.module.cover_v2.presenter;

import KH0.i;
import P50.p;
import R50.A;
import R50.v;
import UC0.c;
import android.graphics.PointF;
import com.bilibili.biligame.ui.playing.widget.B0;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/presenter/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverCaptionSettingProxy f112827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionListItem f112828b;

    public /* synthetic */ b(MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy, CaptionListItem captionListItem) {
        this.f112827a = multiCoverCaptionSettingProxy;
        this.f112828b = captionListItem;
    }

    public final Object invoke() {
        Unit unit;
        List boundingRectangleVertices;
        BPointF bPointF;
        BPointF bPointF2;
        MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112827a;
        p pVarD = multiCoverCaptionSettingProxy.d();
        CaptionInfo captionInfoC = multiCoverCaptionSettingProxy.c();
        CaptionListItem captionListItem = this.f112828b;
        CaptionAssetBean captionAssetBean = captionListItem.captionAssetBean;
        if (captionAssetBean != null && captionInfoC != null) {
            captionInfoC.captionAssetBean = captionAssetBean.m9883clone();
        }
        if ((captionInfoC != null ? captionInfoC.captionAssetBean : null) == null && captionInfoC != null) {
            captionInfoC.captionAssetBean = new CaptionAssetBean();
        }
        if (pVarD == null || (boundingRectangleVertices = pVarD.getBoundingRectangleVertices()) == null) {
            unit = Unit.INSTANCE;
        } else {
            float scaleX = pVarD.getScaleX();
            float rotationZ = pVarD.getRotationZ();
            c.a.b(UC0.c.f24618e, captionInfoC != null ? captionInfoC.captionAssetBean : null, multiCoverCaptionSettingProxy.d(), 1000, 1000, 1000, captionInfoC != null ? captionInfoC.idTmp : 0);
            if (captionInfoC != null) {
                p pVarD2 = multiCoverCaptionSettingProxy.d();
                captionInfoC.textBold = pVarD2 != null ? pVarD2.getBold() : false;
                p pVarD3 = multiCoverCaptionSettingProxy.d();
                captionInfoC.textItalic = pVarD3 != null ? pVarD3.getItalic() : false;
                p pVarD4 = multiCoverCaptionSettingProxy.d();
                boolean underline = false;
                if (pVarD4 != null) {
                    underline = pVarD4.getUnderline();
                }
                captionInfoC.textUnderline = underline;
            }
            multiCoverCaptionSettingProxy.a(new B0(2, multiCoverCaptionSettingProxy, captionListItem));
            List boundingRectangleVertices2 = pVarD.getBoundingRectangleVertices();
            PointF pointFA = com.bilibili.upper.module.cover.editor.b.a(boundingRectangleVertices);
            PointF pointFA2 = com.bilibili.upper.module.cover.editor.b.a(boundingRectangleVertices2);
            pVarD.translateCaption(new PointF(pointFA.x - pointFA2.x, pointFA.y - pointFA2.y));
            float scaleX2 = pVarD.getScaleX();
            float fB = 0.0f;
            a aVar = multiCoverCaptionSettingProxy.f112822a;
            if (scaleX2 != 0.0f) {
                pVarD.scaleCaption(scaleX / scaleX2, aVar.c(pVarD));
            }
            if (pVarD.getTextBoundingRect() != null) {
                pVarD.rotateCaption((rotationZ - pVarD.getRotationZ()) % 360);
            }
            if (captionInfoC != null) {
                com.bilibili.upper.module.cover_v2.ui.a aVarA = aVar.f112826a.a();
                i iVarC3 = aVarA != null ? aVarA.C3() : null;
                A aK = null;
                if (iVarC3 != null) {
                    v vVarF = iVarC3.f();
                    aK = null;
                    if (vVarF != null) {
                        aK = vVarF.k();
                    }
                }
                if (aK != null) {
                    fB = aK.b() * 0.07777777f;
                }
                captionInfoC.fontSize = fB;
            }
            if (captionInfoC != null) {
                captionInfoC.idTmp = captionListItem.getId();
            }
            if (captionInfoC != null) {
                captionInfoC.txtMax = captionListItem.getMax();
            }
            if (captionInfoC != null && (bPointF2 = captionInfoC.pos) != null) {
                bPointF2.f106027x = pVarD.getCaptionTranslation().x;
            }
            if (captionInfoC != null && (bPointF = captionInfoC.pos) != null) {
                bPointF.f106028y = pVarD.getCaptionTranslation().y;
            }
            if (captionInfoC != null) {
                captionInfoC.tempType = captionListItem.getTempType();
            }
            if (captionInfoC != null) {
                captionInfoC.tempFormat = captionListItem.getTempFormat();
            }
            if (captionInfoC != null) {
                captionInfoC.captionScale = pVarD.getScaleX();
            }
            if (captionInfoC != null) {
                captionInfoC.rotation = pVarD.getRotationZ();
            }
            multiCoverCaptionSettingProxy.k();
            unit = Unit.INSTANCE;
        }
        return unit;
    }
}
