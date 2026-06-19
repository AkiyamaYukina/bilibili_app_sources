package com.bilibili.upper.module.cover_v2.presenter;

import P50.p;
import android.graphics.PointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import cx0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/presenter/e.class */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiCoverCaptionSettingProxy f112833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f112834b;

    public /* synthetic */ e(MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy, float f7) {
        this.f112833a = multiCoverCaptionSettingProxy;
        this.f112834b = f7;
    }

    public final Object invoke() {
        PointF anchorPoint;
        MultiCoverCaptionSettingProxy multiCoverCaptionSettingProxy = this.f112833a;
        multiCoverCaptionSettingProxy.getClass();
        CaptionInfo captionInfoC = multiCoverCaptionSettingProxy.c();
        float f7 = captionInfoC != null ? captionInfoC.captionScale : 1.0f;
        float f8 = this.f112834b;
        float f9 = f8 / f7;
        p pVarD = multiCoverCaptionSettingProxy.d();
        if (pVarD != null) {
            pVarD.scaleCaption(f9, multiCoverCaptionSettingProxy.f112822a.c(multiCoverCaptionSettingProxy.d()));
        }
        CaptionInfo captionInfoC2 = multiCoverCaptionSettingProxy.c();
        if (captionInfoC2 != null) {
            captionInfoC2.captionScale = f8;
        }
        CaptionInfo captionInfoC3 = multiCoverCaptionSettingProxy.c();
        if (captionInfoC3 != null) {
            p pVarD2 = multiCoverCaptionSettingProxy.d();
            captionInfoC3.anchorX = (pVarD2 == null || (anchorPoint = pVarD2.getAnchorPoint()) == null) ? 0.0f : anchorPoint.x;
        }
        CaptionInfo captionInfoC4 = multiCoverCaptionSettingProxy.c();
        if (captionInfoC4 != null) {
            p pVarD3 = multiCoverCaptionSettingProxy.d();
            float f10 = 0.0f;
            if (pVarD3 != null) {
                PointF anchorPoint2 = pVarD3.getAnchorPoint();
                f10 = 0.0f;
                if (anchorPoint2 != null) {
                    f10 = anchorPoint2.y;
                }
            }
            captionInfoC4.anchorY = f10;
        }
        a.a.a(cx0.a.g, (Integer) null, (Integer) null, Float.valueOf(f8), (Integer) null, (Integer) null, (String) null, 59);
        multiCoverCaptionSettingProxy.k();
        return Unit.INSTANCE;
    }
}
