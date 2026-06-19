package com.bilibili.upper.module.cover_v2.presenter;

import KH0.i;
import P50.p;
import UC0.c;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/presenter/d.class */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverCaptionSettingProxy f112831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CaptionListItem f112832b;

    public /* synthetic */ d(MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy, CaptionListItem captionListItem) {
        this.f112831a = multiCoverCaptionSettingProxy;
        this.f112832b = captionListItem;
    }

    public final Object invoke() {
        BPointF bPointF;
        BPointF bPointF2;
        p pVarD;
        CaptionAssetBean captionAssetBean;
        CaptionInfo captionInfoC;
        MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112831a;
        CaptionInfo captionInfoC2 = multiCoverCaptionSettingProxy.c();
        CaptionListItem captionListItem = this.f112832b;
        if (captionInfoC2 != null) {
            captionInfoC2.flowerId = captionListItem.getId();
        }
        p pVarD2 = multiCoverCaptionSettingProxy.d();
        if (pVarD2 != null) {
            pVarD2.getFontSize();
            multiCoverCaptionSettingProxy.f112823b = pVarD2.getBoundingRectangleVertices();
            multiCoverCaptionSettingProxy.f112824c = pVarD2.getScaleX();
            multiCoverCaptionSettingProxy.f112825d = pVarD2.getRotationZ();
        }
        CaptionInfo captionInfoC3 = multiCoverCaptionSettingProxy.c();
        if ((captionInfoC3 != null ? captionInfoC3.captionAssetBean : null) == null && (captionInfoC = multiCoverCaptionSettingProxy.c()) != null) {
            captionInfoC.captionAssetBean = new CaptionAssetBean();
        }
        CaptionInfo captionInfoC4 = multiCoverCaptionSettingProxy.c();
        if (captionInfoC4 != null && (captionAssetBean = captionInfoC4.captionAssetBean) != null) {
            CaptionAssetBean captionAssetBean2 = captionListItem.captionAssetBean;
            captionAssetBean.captionRendererPackagePath = captionAssetBean2 != null ? captionAssetBean2.captionRendererPackagePath : null;
        }
        CaptionInfo captionInfoC5 = multiCoverCaptionSettingProxy.c();
        int i7 = -1;
        if (captionInfoC5 != null && captionInfoC5.flowerId == -1) {
            CaptionInfo captionInfoC6 = multiCoverCaptionSettingProxy.c();
            OC0.h.a(captionInfoC6 != null ? captionInfoC6.captionAssetBean : null);
        }
        c.a aVar = UC0.c.f24618e;
        CaptionInfo captionInfoC7 = multiCoverCaptionSettingProxy.c();
        CaptionAssetBean captionAssetBean3 = captionInfoC7 != null ? captionInfoC7.captionAssetBean : null;
        p pVarD3 = multiCoverCaptionSettingProxy.d();
        CaptionInfo captionInfoC8 = multiCoverCaptionSettingProxy.c();
        if (captionInfoC8 != null) {
            i7 = captionInfoC8.flowerId;
        }
        aVar.getClass();
        if (captionAssetBean3 != null && pVarD3 != null) {
            c.a.f(captionAssetBean3, pVarD3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("renderer_id", String.valueOf(i7));
            pVarD3.addStatsExtraInfo(linkedHashMap);
        }
        if (multiCoverCaptionSettingProxy.d() != null) {
            PointF pointFB = MultiCoverCaptionSettingProxy.b(multiCoverCaptionSettingProxy.f112823b);
            p pVarD4 = multiCoverCaptionSettingProxy.d();
            PointF pointFB2 = MultiCoverCaptionSettingProxy.b(pVarD4 != null ? pVarD4.getBoundingRectangleVertices() : null);
            if (pointFB != null && pointFB2 != null && !Intrinsics.areEqual(pointFB, pointFB2) && (pVarD = multiCoverCaptionSettingProxy.d()) != null) {
                pVarD.translateCaption(new PointF(pointFB.x - pointFB2.x, pointFB.y - pointFB2.y));
            }
            p pVarD5 = multiCoverCaptionSettingProxy.d();
            if ((pVarD5 != null ? pVarD5.getCaptionTranslation() : null) != null) {
                CaptionInfo captionInfoC9 = multiCoverCaptionSettingProxy.c();
                if (captionInfoC9 != null && (bPointF2 = captionInfoC9.pos) != null) {
                    bPointF2.f106027x = multiCoverCaptionSettingProxy.d().getCaptionTranslation().x;
                }
                CaptionInfo captionInfoC10 = multiCoverCaptionSettingProxy.c();
                if (captionInfoC10 != null && (bPointF = captionInfoC10.pos) != null) {
                    bPointF.f106028y = multiCoverCaptionSettingProxy.d().getCaptionTranslation().y;
                }
            }
            p pVarD6 = multiCoverCaptionSettingProxy.d();
            Float fValueOf = pVarD6 != null ? Float.valueOf(pVarD6.getScaleX()) : null;
            if (fValueOf != null && !Intrinsics.areEqual(fValueOf, 0.0f)) {
                float fFloatValue = multiCoverCaptionSettingProxy.f112824c / fValueOf.floatValue();
                p pVarD7 = multiCoverCaptionSettingProxy.d();
                if (pVarD7 != null) {
                    p pVarD8 = multiCoverCaptionSettingProxy.d();
                    PointF pointF = new PointF();
                    List boundingRectangleVertices = pVarD8.getBoundingRectangleVertices();
                    if (boundingRectangleVertices != null) {
                        float f7 = ((PointF) boundingRectangleVertices.get(0)).x;
                        float f8 = ((PointF) boundingRectangleVertices.get(2)).x;
                        float f9 = 2;
                        pointF.x = (f7 + f8) / f9;
                        pointF.y = (((PointF) boundingRectangleVertices.get(0)).y + ((PointF) boundingRectangleVertices.get(2)).y) / f9;
                    } else {
                        com.bilibili.upper.module.cover_v2.ui.a aVarA = multiCoverCaptionSettingProxy.f112822a.f112826a.a();
                        i iVarC3 = aVarA != null ? aVarA.C3() : null;
                        if (iVarC3 != null) {
                            LH0.a aVar2 = iVarC3.f12746d;
                            float fWidth = aVar2.f14536a.width();
                            float f10 = 2;
                            pointF.x = fWidth / f10;
                            pointF.y = aVar2.f14537b.height() / f10;
                        }
                    }
                    pVarD7.scaleCaption(fFloatValue, pointF);
                }
            }
            p pVarD9 = multiCoverCaptionSettingProxy.d();
            RectF textBoundingRect = null;
            if (pVarD9 != null) {
                textBoundingRect = pVarD9.getTextBoundingRect();
            }
            if (textBoundingRect != null) {
                float rotationZ = multiCoverCaptionSettingProxy.d().getRotationZ();
                p pVarD10 = multiCoverCaptionSettingProxy.d();
                if (pVarD10 != null) {
                    pVarD10.rotateCaption((multiCoverCaptionSettingProxy.f112825d - rotationZ) % 360);
                }
            }
        }
        multiCoverCaptionSettingProxy.k();
        return Unit.INSTANCE;
    }
}
