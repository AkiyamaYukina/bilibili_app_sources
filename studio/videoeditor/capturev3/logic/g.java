package com.bilibili.studio.videoeditor.capturev3.logic;

import JB0.C2401b;
import JB0.InterfaceC2400a;
import JB0.m;
import JB0.n;
import JB0.o;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.capturev3.bean.CaptureSticker;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureCategoryStickerBeanV3;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureLatestBeanV3;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureTargetStickerBean;
import com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3;
import com.bilibili.studio.videoeditor.capturev3.draft.CaptureDraftBean;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.capturev3.sticker.StickerTabBean;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.editor.common.PreviewItem;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/logic/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f109229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public IB0.b f109230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f109231c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public StickerListItemV3 f109235g;

    @Nullable
    public StickerListItemV3 h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public StickerListItemV3 f109236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f109237j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f109239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f109240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f109241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f109242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f109243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public List<? extends o> f109244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public C2401b f109245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public m f109246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public m f109247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public m f109248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public IndependentCaptureViewModel f109249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final KB0.a f109250w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<StickerTabBean> f109232d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList<CaptureCategoryStickerBeanV3> f109233e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final SparseArray<ArrayList<StickerListItemV3>> f109234f = new SparseArray<>(16);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f109238k = true;

    /* JADX WARN: Type inference failed for: r0v7, types: [JB0.b, java.lang.Object] */
    public g() {
        KB0.a aVar = new KB0.a();
        this.f109250w = aVar;
        ?? obj = new Object();
        obj.f11140a = new SparseArray<>(8);
        obj.f11141b = new SparseArray<>(8);
        this.f109245r = obj;
        aVar.f12709a.observeForever(new h(new com.bilibili.biligame.ui.pay.d(this, 3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3 r3) {
        /*
            r0 = r3
            if (r0 == 0) goto L62
            r0 = r3
            RC0.b r0 = r0.cropInfo
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r7
            java.lang.String r0 = r0.f20701c
            r7 = r0
            goto L1c
        L19:
            r0 = 0
            r7 = r0
        L1c:
            r0 = r7
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = r0
            r0 = 1
            r6 = r0
            r0 = r4
            r1 = 1
            r0 = r0 ^ r1
            r5 = r0
            r0 = r3
            sB0.c r0 = r0.stickerInfo
            r3 = r0
            r0 = r5
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L64
            r0 = 8
            r1 = r3
            int[] r1 = r1.d
            boolean r0 = JB0.p.a(r0, r1)
            if (r0 != 0) goto L4d
            r0 = r5
            r4 = r0
            r0 = 7
            r1 = r3
            int[] r1 = r1.d
            boolean r0 = JB0.p.a(r0, r1)
            if (r0 == 0) goto L4f
        L4d:
            r0 = 1
            r4 = r0
        L4f:
            r0 = 3
            r1 = r3
            int[] r1 = r1.e
            boolean r0 = JB0.p.a(r0, r1)
            if (r0 == 0) goto L5f
            r0 = r6
            r4 = r0
            goto L5f
        L5f:
            goto L64
        L62:
            r0 = 0
            r4 = r0
        L64:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.logic.g.e(com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3):boolean");
    }

    public static boolean j(@Nullable IB0.b bVar) {
        Map<String, CaptureLatestBeanV3> map;
        Application application = BiliContext.application();
        boolean z6 = false;
        if (application != null) {
            Context applicationContext = application.getApplicationContext();
            if (applicationContext == null) {
                z6 = false;
            } else {
                CaptureLatestBeanV3 captureLatestBeanV3 = (bVar == null || (map = bVar.f10097f) == null) ? null : map.get(CaptureLatestBeanV3.LATEST_STICKER_INDEX);
                j jVarA = j.a(applicationContext);
                SharedPreferences sharedPreferences = jVarA.a;
                Long lValueOf = (sharedPreferences == null || !sharedPreferences.contains("latest_click_sticker")) ? Long.MIN_VALUE : Long.valueOf(jVarA.a.getLong("latest_click_sticker", Long.MIN_VALUE));
                z6 = false;
                if (captureLatestBeanV3 != null) {
                    z6 = false;
                    if (captureLatestBeanV3.mMtime > lValueOf.longValue()) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public final void a(@Nullable StickerListItemV3 stickerListItemV3, @Nullable InterfaceC2400a interfaceC2400a) {
        if (stickerListItemV3 == null) {
            return;
        }
        List<String> list = n.f11190a;
        if (stickerListItemV3.isEffectPackageAvailable()) {
            if (interfaceC2400a != null) {
                interfaceC2400a.b(stickerListItemV3);
            }
        } else {
            C2401b c2401b = this.f109245r;
            if (c2401b != null) {
                c2401b.c(stickerListItemV3, interfaceC2400a);
            }
        }
    }

    public final void b(boolean z6) {
        CaptureTargetStickerBean captureTargetStickerBean;
        StickerListItemV3 stickerListItemV3;
        String remoteUrl;
        IB0.b bVar = this.f109230b;
        if (bVar == null || (captureTargetStickerBean = bVar.f10100j) == null) {
            return;
        }
        int i7 = captureTargetStickerBean.materialId;
        ArrayList<StickerListItemV3> arrayList = this.f109234f.get(1);
        if (arrayList == null) {
            stickerListItemV3 = null;
        } else {
            Iterator<StickerListItemV3> it = arrayList.iterator();
            while (true) {
                stickerListItemV3 = null;
                if (!it.hasNext()) {
                    break;
                }
                StickerListItemV3 next = it.next();
                sB0.c cVar = next.stickerInfo;
                if (Intrinsics.areEqual(cVar != null ? Integer.valueOf(cVar.j) : null, Integer.valueOf(i7))) {
                    stickerListItemV3 = next;
                    break;
                }
            }
        }
        if (stickerListItemV3 == null) {
            return;
        }
        stickerListItemV3.needShowCVModelLoading = captureTargetStickerBean.type == 2;
        KB0.a aVar = this.f109250w;
        aVar.f12710b.postValue(Boolean.FALSE);
        int i8 = captureTargetStickerBean.type;
        if (i8 != 1) {
            if (i8 == 2 && !z6) {
                c(stickerListItemV3);
                return;
            }
            return;
        }
        if (z6) {
            c(stickerListItemV3);
            return;
        }
        PreviewItem previewItem = stickerListItemV3.previewItem;
        if (previewItem == null || (remoteUrl = previewItem.getRemoteUrl()) == null) {
            return;
        }
        aVar.f12711c.postValue(remoteUrl);
    }

    public final void c(@NotNull StickerListItemV3 stickerListItemV3) {
        IB0.b bVar = this.f109230b;
        if (bVar != null) {
            bVar.f10100j = null;
        }
        this.f109238k = true;
        if (stickerListItemV3.isEffectPackageAvailable()) {
            m mVar = this.f109246s;
            if (mVar != null) {
                mVar.b(stickerListItemV3);
                return;
            }
            return;
        }
        C2401b c2401b = this.f109245r;
        if (c2401b != null) {
            c2401b.c(stickerListItemV3, this.f109246s);
        }
    }

    @Nullable
    public final String d() {
        int i7 = this.f109240m;
        return (i7 < 0 || i7 > this.f109233e.size() - 1) ? null : this.f109233e.get(this.f109240m).name;
    }

    @Nullable
    public final StickerListItemV3 f(int i7) {
        int size = this.f109234f.size();
        for (int i8 = 1; i8 < size; i8++) {
            ArrayList<StickerListItemV3> arrayList = this.f109234f.get(i8);
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                if (arrayList.get(i9).stickerInfo.j == i7) {
                    return arrayList.get(i9);
                }
            }
        }
        return null;
    }

    public final void g(int i7) {
        int iIndexOf;
        CaptureSticker.StickerItemUpdateBean stickerItemUpdateBean;
        ArrayList<CaptureSticker.StickerItemUpdateBean> arrayList = new ArrayList<>();
        int size = this.f109234f.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList<StickerListItemV3> arrayList2 = this.f109234f.get(i8);
            if (arrayList2 == null) {
                iIndexOf = -1;
            } else {
                for (StickerListItemV3 stickerListItemV3 : arrayList2) {
                    sB0.c cVar = stickerListItemV3.stickerInfo;
                    if (cVar != null && cVar.j == i7) {
                        iIndexOf = arrayList2.indexOf(stickerListItemV3);
                        break;
                    }
                }
                iIndexOf = -1;
            }
            if (iIndexOf != -1) {
                stickerItemUpdateBean = new CaptureSticker.StickerItemUpdateBean(i8, iIndexOf);
                stickerItemUpdateBean.payload = new Bundle();
            } else {
                stickerItemUpdateBean = null;
            }
            arrayList.add(stickerItemUpdateBean);
        }
        IndependentCaptureViewModel independentCaptureViewModel = this.f109249v;
        if (independentCaptureViewModel != null) {
            CaptureSticker captureSticker = new CaptureSticker(1011);
            captureSticker.itemUpdateList = arrayList;
            independentCaptureViewModel.f109301n.m.setValue(captureSticker);
        }
    }

    public final void h(@Nullable String str, @Nullable i iVar, @Nullable CaptureDraftBean captureDraftBean) {
        String selectUploadPath;
        sB0.c cVar;
        StickerListItemV3 stickerListItemV3 = this.f109235g;
        int[] iArr = (stickerListItemV3 == null || (cVar = stickerListItemV3.stickerInfo) == null) ? null : cVar.d;
        boolean zContains = iArr != null ? ArraysKt.contains(iArr, 13) : false;
        if (zContains) {
            selectUploadPath = null;
            if (captureDraftBean != null) {
                selectUploadPath = captureDraftBean.getSelectFaceSegmentPath();
            }
        } else {
            selectUploadPath = null;
            if (captureDraftBean != null) {
                selectUploadPath = captureDraftBean.getSelectUploadPath();
            }
        }
        if (TextUtils.isEmpty(str)) {
            i(str, captureDraftBean, iVar, !zContains, true);
        } else {
            if (StringsKt.x(str, selectUploadPath)) {
                return;
            }
            i(str, captureDraftBean, iVar, !zContains, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.String r6, com.bilibili.studio.videoeditor.capturev3.draft.CaptureDraftBean r7, com.bilibili.studio.videoeditor.capturev3.logic.i r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.logic.g.i(java.lang.String, com.bilibili.studio.videoeditor.capturev3.draft.CaptureDraftBean, com.bilibili.studio.videoeditor.capturev3.logic.i, boolean, boolean):void");
    }

    @Nullable
    public final void k(@Nullable StickerListItemV3 stickerListItemV3) {
        sB0.c cVar;
        int i7;
        if (stickerListItemV3 == null) {
            return;
        }
        int size = this.f109234f.size();
        int i8 = 0;
        while (i8 < size) {
            int size2 = this.f109234f.get(i8).size();
            for (int i9 = 0; i9 < size2; i9++) {
                StickerListItemV3 stickerListItemV32 = this.f109234f.get(i8).get(i9);
                sB0.c cVar2 = stickerListItemV32.stickerInfo;
                if (cVar2 != null && (cVar = stickerListItemV3.stickerInfo) != null && cVar2.j == cVar.j) {
                    cVar2.l = cVar.l;
                    cVar2.k = cVar.k;
                    cVar2.a = cVar.a;
                    FilterInfo filterInfo = stickerListItemV32.filterInfo;
                    FilterInfo filterInfo2 = stickerListItemV3.filterInfo;
                    if (filterInfo != null && filterInfo2 != null && filterInfo.getId() == filterInfo2.getId()) {
                        filterInfo.filterPackageDownloadStatus = filterInfo2.filterPackageDownloadStatus;
                        filterInfo.filterPackageStatus = filterInfo2.filterPackageStatus;
                        filterInfo.filter_path = filterInfo2.filter_path;
                    }
                    int size3 = stickerListItemV32.surgeryArray.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        RC0.a aVarValueAt = stickerListItemV32.surgeryArray.valueAt(i10);
                        if (aVarValueAt == null) {
                            i7 = i8;
                        } else {
                            int size4 = stickerListItemV3.surgeryArray.size();
                            int i11 = 0;
                            while (true) {
                                i7 = i8;
                                if (i11 >= size4) {
                                    break;
                                }
                                RC0.a aVarValueAt2 = stickerListItemV3.surgeryArray.valueAt(i11);
                                if (aVarValueAt.f20696d == aVarValueAt2.f20696d) {
                                    aVarValueAt.f20698f = aVarValueAt2.f20698f;
                                    aVarValueAt.f20693a = aVarValueAt2.f20693a;
                                    aVarValueAt.f20694b = aVarValueAt2.f20694b;
                                    break;
                                }
                                i11++;
                            }
                        }
                        i8 = i7;
                    }
                    int i12 = i8;
                    int size5 = stickerListItemV32.videoFxInfoes.size();
                    for (int i13 = 0; i13 < size5; i13++) {
                        FilterInfo filterInfo3 = stickerListItemV32.videoFxInfoes.get(i13);
                        if (filterInfo3 != null) {
                            int size6 = stickerListItemV3.videoFxInfoes.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size6) {
                                    FilterInfo filterInfo4 = stickerListItemV3.videoFxInfoes.get(i14);
                                    if (filterInfo3.getId() == filterInfo4.getId()) {
                                        filterInfo3.filter_id = filterInfo4.filter_id;
                                        filterInfo3.filterPackageStatus = filterInfo4.filterPackageStatus;
                                        filterInfo3.filterPackageDownloadStatus = filterInfo4.filterPackageDownloadStatus;
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                    }
                    RC0.b bVar = stickerListItemV32.cropInfo;
                    i8 = i12;
                    if (bVar != null) {
                        i8 = i12;
                        if (!TextUtils.isEmpty(bVar.f20701c)) {
                            RC0.b bVar2 = stickerListItemV32.cropInfo;
                            RC0.b bVar3 = stickerListItemV3.cropInfo;
                            bVar2.f20701c = bVar3.f20701c;
                            bVar2.f20700b = bVar3.f20700b;
                            bVar2.f20699a = bVar3.f20699a;
                            i8 = i12;
                        }
                    }
                }
            }
            i8++;
        }
    }

    public final void l(@Nullable String str) {
        int i7;
        if (TextUtils.isEmpty(str)) {
            this.f109240m = 1;
            return;
        }
        CaptureSchema captureSchema = new CaptureSchema();
        captureSchema.parseJumpParams(str);
        if (!captureSchema.schemeStickerV2Available()) {
            this.f109240m = 1;
            return;
        }
        this.f109240m = -1;
        int size = this.f109234f.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList<StickerListItemV3> arrayList = this.f109234f.get(i8);
            int size2 = arrayList.size();
            for (int i9 = 0; i9 < size2; i9++) {
                StickerListItemV3 stickerListItemV3 = arrayList.get(i9);
                CaptureSchema.MissionInfo missionInfo = captureSchema.getMissionInfo();
                if (missionInfo != null && stickerListItemV3.stickerInfo.j == missionInfo.getStickerIdV2() && ((i7 = this.f109240m) == -1 || i7 == 0)) {
                    this.f109240m = i8;
                }
            }
        }
        if (this.f109240m == -1) {
            this.f109240m = 1;
        }
    }
}
