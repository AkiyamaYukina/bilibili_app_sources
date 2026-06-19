package com.bilibili.studio.videoeditor.capturev3.logic;

import JB0.C2401b;
import JB0.m;
import android.content.Context;
import android.text.TextUtils;
import com.bilibili.studio.videoeditor.capturev3.bean.CaptureSticker;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureStickerBeanV3;
import com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3;
import com.bilibili.studio.videoeditor.capturev3.followtogether.FtMaterialAidCidBeanV3;
import com.bilibili.studio.videoeditor.capturev3.followtogether.FtMaterialLinkBeanV3;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/c.class */
public final class c implements wB0.e$a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final i f109213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f109214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final zB0.i f109215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public IndependentCaptureViewModel f109216d;

    public c(@Nullable i iVar, @NotNull Context context, @NotNull zB0.i iVar2) {
        this.f109213a = iVar;
        this.f109214b = context;
        this.f109215c = iVar2;
    }

    @Override // wB0.e$a
    public final void a(int i7) {
        IndependentCaptureViewModel independentCaptureViewModel = this.f109216d;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.f109301n.t.postValue(Integer.valueOf(i7));
        }
    }

    @Override // wB0.e$a
    public final void b(@Nullable String str) {
        StickerListItemV3 stickerListItemV3;
        m mVar;
        wB0.e eVarA = this.f109215c.a();
        FtMaterialLinkBeanV3 ftMaterialLinkBeanV3 = eVarA != null ? eVarA.g : null;
        if (ftMaterialLinkBeanV3 != null && (stickerListItemV3 = ftMaterialLinkBeanV3.sticker) != null && !TextUtils.isEmpty(stickerListItemV3.stickerInfo.f)) {
            if (stickerListItemV3.isEffectPackageAvailable()) {
                IndependentCaptureViewModel independentCaptureViewModel = this.f109216d;
                if (independentCaptureViewModel != null) {
                    g gVar = independentCaptureViewModel.f109310w;
                    boolean z6 = (gVar == null || (mVar = gVar.f109248u) == null) ? true : mVar.f11188b;
                    CaptureSticker captureSticker = new CaptureSticker(1023);
                    captureSticker.selectedItem = stickerListItemV3;
                    captureSticker.fromScheme = z6;
                    independentCaptureViewModel.f109301n.l.setValue(captureSticker);
                }
            } else {
                BLog.d("CaptureFollowTogetherManager", "ft download finish but sticker not finish, wait...");
            }
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = this.f109216d;
        if (independentCaptureViewModel2 != null) {
            independentCaptureViewModel2.f109302o.j = str;
            independentCaptureViewModel2.f109301n.u.postValue(1);
        }
    }

    @Override // wB0.e$a
    public final void c() {
        StickerListItemV3 stickerListItemV3;
        IndependentCaptureViewModel independentCaptureViewModel;
        g gVar;
        C2401b c2401b;
        wB0.e eVarA = this.f109215c.a();
        FtMaterialLinkBeanV3 ftMaterialLinkBeanV3 = eVarA != null ? eVarA.g : null;
        if (ftMaterialLinkBeanV3 != null && (stickerListItemV3 = ftMaterialLinkBeanV3.sticker) != null && !TextUtils.isEmpty(stickerListItemV3.stickerInfo.f) && (independentCaptureViewModel = this.f109216d) != null && (gVar = independentCaptureViewModel.f109310w) != null && (c2401b = gVar.f109245r) != null) {
            c2401b.a(stickerListItemV3.stickerInfo.j, "cancel by linked ft canceled");
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = this.f109216d;
        if (independentCaptureViewModel2 != null) {
            independentCaptureViewModel2.f109301n.u.postValue(2);
        }
    }

    @Override // wB0.e$a
    @NotNull
    public final FtMaterialLinkBeanV3 d(@Nullable FtMaterialAidCidBeanV3 ftMaterialAidCidBeanV3) {
        CaptureStickerBeanV3 captureStickerBeanV3;
        C2401b c2401b;
        m mVar;
        IndependentCaptureViewModel independentCaptureViewModel;
        if ((ftMaterialAidCidBeanV3 != null ? ftMaterialAidCidBeanV3.topicId : 0L) > 0 && (independentCaptureViewModel = this.f109216d) != null) {
            int i7 = (int) ftMaterialAidCidBeanV3.topicId;
            CaptureSchema captureSchema = independentCaptureViewModel.f109302o.a;
            if (captureSchema != null) {
                captureSchema.resetMissionInfoByCooperateTopicId(i7);
            }
        }
        FtMaterialLinkBeanV3 ftMaterialLinkBeanV3 = new FtMaterialLinkBeanV3();
        if (ftMaterialAidCidBeanV3 != null && (captureStickerBeanV3 = ftMaterialAidCidBeanV3.sticker) != null && !TextUtils.isEmpty(captureStickerBeanV3.download)) {
            StickerListItemV3 stickerListItemV3 = new StickerListItemV3(ftMaterialAidCidBeanV3.sticker, OC0.h.J());
            ftMaterialLinkBeanV3.sticker = stickerListItemV3;
            if (stickerListItemV3.isEffectPackageAvailable()) {
                IndependentCaptureViewModel independentCaptureViewModel2 = this.f109216d;
                if (independentCaptureViewModel2 != null) {
                    StickerListItemV3 stickerListItemV32 = ftMaterialLinkBeanV3.sticker;
                    g gVar = independentCaptureViewModel2.f109310w;
                    if (gVar != null && stickerListItemV32 != null && (mVar = gVar.f109248u) != null) {
                        mVar.b(stickerListItemV32);
                    }
                }
            } else {
                IndependentCaptureViewModel independentCaptureViewModel3 = this.f109216d;
                if (independentCaptureViewModel3 != null) {
                    StickerListItemV3 stickerListItemV33 = ftMaterialLinkBeanV3.sticker;
                    g gVar2 = independentCaptureViewModel3.f109310w;
                    if (gVar2 != null && stickerListItemV33 != null && (c2401b = gVar2.f109245r) != null) {
                        c2401b.c(stickerListItemV33, gVar2.f109248u);
                    }
                }
            }
        }
        return ftMaterialLinkBeanV3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e() {
        /*
            r3 = this;
            r0 = r3
            zB0.i r0 = r0.f109215c
            wB0.e r0 = r0.a()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L3c
            r0 = r5
            boolean r0 = r0.b()
            if (r0 == 0) goto L18
            r0 = 0
            r4 = r0
            goto L36
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            java.lang.String r1 = OC0.h.f17814e
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.c
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            r4 = r0
        L36:
            r0 = r4
            r5 = r0
            r0 = r4
            if (r0 != 0) goto L3f
        L3c:
            java.lang.String r0 = ""
            r5 = r0
        L3f:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.logic.c.e():java.lang.String");
    }
}
