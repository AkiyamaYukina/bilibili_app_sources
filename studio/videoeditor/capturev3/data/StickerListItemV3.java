package com.bilibili.studio.videoeditor.capturev3.data;

import G.p;
import OC0.h;
import RC0.a;
import RC0.b;
import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import cn.com.chinatelecom.account.api.d.m;
import com.bilibili.base.BiliContext;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.editor.common.PreviewItem;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import com.bilibili.studio.videoeditor.ms.filter.FilterListItem;
import com.bilibili.studio.videoeditor.util.V;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import sB0.c;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/StickerListItemV3.class */
public class StickerListItemV3 implements Serializable, Cloneable {
    public c attachStickerInfo;
    public HashMap<String, Float> beauties;
    public b cropInfo;
    public BGMInfo downloadBgmInfo;
    public FilterInfo filterInfo;
    public boolean firstApply;
    private final String[] mBeautyList;
    public boolean needShowCVModelLoading;
    public CaptureStickerBeanV3 originCaptureStickerBeanData;
    public PreviewItem previewItem;
    public int priority;
    public Bgm serverBgm;
    public c stickerInfo;
    public SparseArray<a> surgeryArray;
    public ArrayList<FilterInfo> videoFxInfoes;
    public String voiceFx;

    /* JADX WARN: Type inference failed for: r1v8, types: [RC0.b, java.lang.Object] */
    public StickerListItemV3() {
        this.mBeautyList = new String[]{"Shrink Face", "Eye Enlarging", "Chin Length Param", "Hairline Height Param", "Narrow Nose Param", "Mouth Size Param"};
        this.needShowCVModelLoading = false;
        this.stickerInfo = new c();
        this.surgeryArray = new SparseArray<>();
        this.videoFxInfoes = new ArrayList<>();
        this.beauties = new HashMap<>();
        this.previewItem = new PreviewItem(0, (String) null);
        this.cropInfo = new Object();
    }

    public StickerListItemV3(@Nullable CaptureStickerBeanV3 captureStickerBeanV3, Map<String, StickerListItemV3> map) {
        String str;
        FilterListItem filterListItem;
        FilterListItem filterListItem2;
        Iterator<sB0.b> it;
        Iterator<sB0.b> it2;
        String str2;
        this();
        if (captureStickerBeanV3 != null) {
            this.originCaptureStickerBeanData = captureStickerBeanV3;
            this.voiceFx = captureStickerBeanV3.voiceFx;
            this.priority = captureStickerBeanV3.rank;
            this.previewItem = new PreviewItem(1, captureStickerBeanV3.cover);
            c cVar = this.stickerInfo;
            cVar.b = captureStickerBeanV3.name;
            cVar.j = captureStickerBeanV3.id;
            cVar.d = captureStickerBeanV3.subType;
            cVar.e = captureStickerBeanV3.source;
            cVar.c = captureStickerBeanV3.tip;
            cVar.h = captureStickerBeanV3.fav;
            cVar.i = captureStickerBeanV3.autoReplay;
            cVar.m = captureStickerBeanV3.arType;
            cVar.n = captureStickerBeanV3.showCoverSticker != 0;
            cVar.o = captureStickerBeanV3.isCoverStickerOn != 0;
            cVar.g = captureStickerBeanV3.cueVideo;
            String str3 = captureStickerBeanV3.download;
            cVar.f = str3;
            cVar.p = captureStickerBeanV3.tags;
            String strQ = h.q(h.o(str3));
            if (map != null && map.containsKey(strQ)) {
                StickerListItemV3 stickerListItemV3 = map.get(strQ);
                if (stickerListItemV3 == null || (str2 = stickerListItemV3.stickerInfo.a) == null) {
                    this.stickerInfo.k = 2;
                } else {
                    c cVar2 = this.stickerInfo;
                    cVar2.k = 1;
                    cVar2.a = str2;
                }
            }
            if (!V.e(captureStickerBeanV3.effectSurgerys)) {
                Iterator<sB0.b> it3 = captureStickerBeanV3.effectSurgerys.iterator();
                while (it3.hasNext()) {
                    sB0.b next = it3.next();
                    int i7 = next.j;
                    if (i7 != 0) {
                        a aVar = new a();
                        aVar.f20696d = next.a;
                        aVar.f20695c = i7;
                        aVar.f20694b = 1;
                        aVar.f20693a = -1;
                        aVar.f20697e = next.d;
                        this.surgeryArray.put(i7, aVar);
                        HashMap map2 = new HashMap();
                        File file = new File(h.f17821m);
                        if (file.exists()) {
                            File[] fileArrListFiles = file.listFiles();
                            it = it3;
                            if (fileArrListFiles != null) {
                                int length = fileArrListFiles.length;
                                int i8 = 0;
                                while (true) {
                                    it = it3;
                                    if (i8 >= length) {
                                        break;
                                    }
                                    File[] fileArrListFiles2 = fileArrListFiles[i8].listFiles();
                                    Iterator<sB0.b> it4 = it3;
                                    if (fileArrListFiles2 != null) {
                                        int i9 = 0;
                                        while (true) {
                                            it4 = it3;
                                            if (i9 < fileArrListFiles2.length) {
                                                if (fileArrListFiles2[i9].isDirectory()) {
                                                    File file2 = fileArrListFiles2[i9];
                                                    File[] fileArrListFiles3 = file2.listFiles();
                                                    it2 = it3;
                                                    if (fileArrListFiles3 != null) {
                                                        if (fileArrListFiles3.length == 0) {
                                                            it2 = it3;
                                                        } else {
                                                            String strQ2 = h.q(file2.getName());
                                                            a aVar2 = new a();
                                                            map2.put(strQ2, aVar2);
                                                            int i10 = 0;
                                                            while (true) {
                                                                it2 = it3;
                                                                if (i10 < fileArrListFiles3.length) {
                                                                    File file3 = fileArrListFiles3[i10];
                                                                    String path = file3.getPath();
                                                                    if (file3.getName().toLowerCase(Locale.getDefault()).endsWith(".zip")) {
                                                                        aVar2.f20698f = path;
                                                                    }
                                                                    i10++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    it2 = it3;
                                                }
                                                i9++;
                                                it3 = it2;
                                            }
                                        }
                                    }
                                    i8++;
                                    it3 = it4;
                                }
                            }
                        } else {
                            it = it3;
                        }
                        String strQ3 = h.q(h.o(aVar.f20697e));
                        it3 = it;
                        if (map2.containsKey(strQ3)) {
                            a aVar3 = (a) map2.get(strQ3);
                            it3 = it;
                            if (aVar3 != null) {
                                aVar.f20698f = aVar3.f20698f;
                                aVar.f20694b = 5;
                                aVar.f20693a = 1;
                                it3 = it;
                            }
                        }
                    }
                }
            }
            HashMap map3 = new HashMap();
            h.I(h.f17833y, map3);
            h.I(h.f17834z, map3);
            if (!V.e(captureStickerBeanV3.effectFilters)) {
                CaptureFilterBean captureFilterBean = captureStickerBeanV3.effectFilters.get(0);
                FilterInfo filterInfo = new FilterInfo();
                this.filterInfo = filterInfo;
                filterInfo.setId(captureFilterBean.mId);
                FilterInfo filterInfo2 = this.filterInfo;
                filterInfo2.filter_name = captureFilterBean.mName;
                filterInfo2.filter_id = "Lut";
                filterInfo2.setFilterType(captureFilterBean.mFilterType);
                int i11 = captureFilterBean.mId;
                if (i11 == -2 || i11 == -3) {
                    this.filterInfo.filterPackageStatus = 1;
                } else {
                    this.filterInfo.filterPackageStatus = 2;
                }
                FilterInfo filterInfo3 = this.filterInfo;
                filterInfo3.filterPackageDownloadStatus = 1;
                String str4 = captureFilterBean.mDownloadUrl;
                filterInfo3.filterPackageDownloadUrl = str4;
                String strQ4 = h.q(h.o(str4));
                if (map3.containsKey(strQ4) && (filterListItem2 = (FilterListItem) map3.get(strQ4)) != null) {
                    FilterInfo filterInfo4 = filterListItem2.getFilterInfo();
                    FilterInfo filterInfo5 = this.filterInfo;
                    filterInfo5.filterPackageStatus = 1;
                    filterInfo5.filterPackageDownloadStatus = 5;
                    filterInfo5.filter_path = filterInfo4.filter_path;
                }
            }
            if (!V.e(captureStickerBeanV3.effectVideoFxes)) {
                for (int i12 = 0; i12 < captureStickerBeanV3.effectVideoFxes.size(); i12++) {
                    CaptureFilterBean captureFilterBean2 = captureStickerBeanV3.effectVideoFxes.get(i12);
                    FilterInfo filterInfo6 = new FilterInfo();
                    filterInfo6.setId(captureFilterBean2.mId);
                    filterInfo6.filter_name = captureFilterBean2.mName;
                    filterInfo6.filterPackageStatus = 2;
                    filterInfo6.filterPackageDownloadStatus = 1;
                    filterInfo6.filterPackageDownloadUrl = captureFilterBean2.mDownloadUrl;
                    this.videoFxInfoes.add(filterInfo6);
                    String strQ5 = h.q(h.o(filterInfo6.filterPackageDownloadUrl));
                    if (map3.containsKey(strQ5) && (filterListItem = (FilterListItem) map3.get(strQ5)) != null) {
                        FilterInfo filterInfo7 = filterListItem.getFilterInfo();
                        filterInfo6.filterPackageStatus = 1;
                        filterInfo6.filterPackageDownloadStatus = 5;
                        filterInfo6.filter_path = filterInfo7.filter_path;
                        filterInfo6.filter_lic = filterInfo7.filter_lic;
                        filterInfo6.filter_id = filterInfo7.filter_id;
                    }
                }
            }
            b bVar = this.cropInfo;
            String str5 = captureStickerBeanV3.splitVideoUrl;
            bVar.f20701c = str5;
            if (!TextUtils.isEmpty(str5)) {
                String strO = h.o(this.cropInfo.f20701c);
                String strQ6 = h.q(strO);
                StringBuilder sb = new StringBuilder();
                sb.append(h.f17802D);
                sb.append(strQ6);
                String strA = C8770a.a(sb, File.separator, strO);
                if (m.b(strA)) {
                    b bVar2 = this.cropInfo;
                    bVar2.f20700b = 1;
                    bVar2.f20699a = strA;
                }
            }
            if (!V.e(captureStickerBeanV3.attachStickers)) {
                CaptureStickerBeanV3 captureStickerBeanV32 = captureStickerBeanV3.attachStickers.get(0);
                c cVar3 = new c();
                this.attachStickerInfo = cVar3;
                String str6 = captureStickerBeanV32.download;
                cVar3.f = str6;
                String strQ7 = h.q(h.o(str6));
                if (map != null && map.containsKey(strQ7)) {
                    StickerListItemV3 stickerListItemV32 = map.get(strQ7);
                    if (stickerListItemV32 == null || (str = stickerListItemV32.stickerInfo.a) == null) {
                        this.attachStickerInfo.k = 2;
                    } else {
                        c cVar4 = this.attachStickerInfo;
                        cVar4.k = 1;
                        cVar4.a = str;
                    }
                }
            }
            this.beauties.clear();
            Map<String, Float> map4 = captureStickerBeanV3.faceshapes;
            if (map4 != null && map4.size() > 0) {
                for (String str7 : this.mBeautyList) {
                    Float f7 = captureStickerBeanV3.faceshapes.get(str7);
                    this.beauties.put(str7, Float.valueOf(f7 == null ? 0.0f : f7.floatValue()));
                }
            }
            Bgm bgm = captureStickerBeanV3.bgm;
            this.serverBgm = bgm;
            this.downloadBgmInfo = serverBgmParseDownloadBgmInfo(bgm);
        }
    }

    private BGMInfo serverBgmParseDownloadBgmInfo(Bgm bgm) {
        Application application = BiliContext.application();
        if (bgm == null || bgm.sid == 0 || application == null) {
            return null;
        }
        File externalFilesDir = application.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
        File cacheDir = externalFilesDir;
        if (externalFilesDir == null) {
            cacheDir = application.getCacheDir();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cacheDir.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        String string = sb.toString();
        bgm.name = bgm.name.replaceAll(str, "&");
        String strA = C8770a.a(new StringBuilder(), bgm.name, ".mp3");
        if (new File(p.a(string, strA)).exists()) {
            return new BGMInfo(p.a(string, strA), bgm.getStartTime(), bgm.name, 1, bgm.sid, 2, bgm);
        }
        return null;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public StickerListItemV3 m10419clone() throws CloneNotSupportedException {
        StickerListItemV3 stickerListItemV3 = (StickerListItemV3) super.clone();
        c cVar = this.stickerInfo;
        if (cVar != null) {
            stickerListItemV3.stickerInfo = cVar.a();
        }
        SparseArray<a> sparseArray = this.surgeryArray;
        if (sparseArray != null) {
            stickerListItemV3.surgeryArray = sparseArray.clone();
        }
        FilterInfo filterInfo = this.filterInfo;
        if (filterInfo != null) {
            stickerListItemV3.filterInfo = filterInfo.m10477clone();
        }
        ArrayList<FilterInfo> arrayList = this.videoFxInfoes;
        if (arrayList != null) {
            stickerListItemV3.videoFxInfoes = (ArrayList) arrayList.clone();
        }
        PreviewItem previewItem = this.previewItem;
        if (previewItem != null) {
            stickerListItemV3.previewItem = previewItem.m10444clone();
        }
        return stickerListItemV3;
    }

    public boolean equals(Object obj) {
        if (obj == null || !StickerListItemV3.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        StickerListItemV3 stickerListItemV3 = (StickerListItemV3) obj;
        c cVar = this.stickerInfo;
        boolean z6 = false;
        if (cVar != null) {
            c cVar2 = stickerListItemV3.stickerInfo;
            z6 = false;
            if (cVar2 != null) {
                z6 = false;
                if (cVar.j == cVar2.j) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public int getDownLoadStatus() {
        if (isEffectPackageAvailable()) {
            return 5;
        }
        return isEffectPackageDownloading() ? 3 : 1;
    }

    public int getStickerFileStatus() {
        return isEffectPackageAvailable() ? 1 : 2;
    }

    public boolean isBgmPackageAvailable() {
        BGMInfo bGMInfo;
        Bgm bgm = this.serverBgm;
        return bgm == null || bgm.sid == 0 || !((bGMInfo = this.downloadBgmInfo) == null || TextUtils.isEmpty(bGMInfo.getPath()));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEffectPackageAvailable() {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3.isEffectPackageAvailable():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isEffectPackageDownloading() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3.isEffectPackageDownloading():boolean");
    }
}
