package com.bilibili.studio.videoeditor.capturev3.viewmodel;

import F3.O1;
import JB0.C2401b;
import JB0.m;
import OC0.h;
import android.app.Application;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.C4628q;
import com.alibaba.fastjson.JSON;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.opd.app.core.config.ConfigService;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.videoeditor.capturev3.bean.CaptureSticker;
import com.bilibili.studio.videoeditor.capturev3.bean.CaptureStoreViewData;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureBeautyEntity;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureMakeupEntity;
import com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3;
import com.bilibili.studio.videoeditor.capturev3.data.VideoClipRecordInfo;
import com.bilibili.studio.videoeditor.capturev3.draft.CaptureDraftBean;
import com.bilibili.studio.videoeditor.capturev3.draft.ClipBean;
import com.bilibili.studio.videoeditor.capturev3.filter.FilterListItemV3;
import com.bilibili.studio.videoeditor.capturev3.logic.CaptureRecordManager;
import com.bilibili.studio.videoeditor.capturev3.logic.d;
import com.bilibili.studio.videoeditor.capturev3.logic.g;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import com.bilibili.studio.videoeditor.media.performance.BeautifyTemplate;
import com.bilibili.studio.videoeditor.mediav3.data.SizeV3;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import com.bilibili.xpref.Xpref;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import mB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import wB0.e;
import zB0.i;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/viewmodel/IndependentCaptureViewModel.class */
public class IndependentCaptureViewModel extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f109297A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f109298B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f109299C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final i f109300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final qB0.d f109301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final qB0.b f109302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final qB0.a f109303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public LB0.a f109304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final com.bilibili.studio.videoeditor.capturev3.logic.d f109305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final com.bilibili.studio.videoeditor.capturev3.logic.i f109306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final CaptureRecordManager f109307t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final com.bilibili.studio.videoeditor.capturev3.logic.b f109308u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.videoeditor.capturev3.logic.a f109309v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public g f109310w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f109311x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.videoeditor.capturev3.logic.c f109312y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public CaptureStoreViewData f109313z;

    /* JADX WARN: Removed duplicated region for block: B:24:0x014d  */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.studio.videoeditor.capturev3.logic.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.bilibili.studio.videoeditor.capturev3.logic.CaptureRecordManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qB0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, zB0.i] */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.bilibili.studio.videoeditor.capturev3.logic.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IndependentCaptureViewModel(@org.jetbrains.annotations.NotNull android.app.Application r9) {
        /*
            Method dump skipped, instruction units count: 983
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel.<init>(android.app.Application):void");
    }

    public void A1(boolean z6) {
        qB0.b bVar = this.f109302o;
        bVar.k = false;
        this.f109319i = true;
        if (z6) {
            a.P0(m1());
            if (this.f109321k) {
                c1(bVar.e ? "edit" : "new");
            }
            this.f109321k = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C1(@Nullable String str) {
        if (Intrinsics.areEqual(str, "CaptureFragmentSTICKER")) {
            CaptureSticker captureSticker = new CaptureSticker(1002);
            captureSticker.needShow = false;
            captureSticker.selectedItem = null;
            qB0.d dVar = this.f109301n;
            dVar.l.setValue(captureSticker);
            CaptureSticker captureSticker2 = new CaptureSticker(1004);
            captureSticker2.needShow = false;
            dVar.l.setValue(captureSticker2);
            g gVar = this.f109310w;
            if (gVar != null) {
                StickerListItemV3 stickerListItemV3 = gVar.f109235g;
                if (stickerListItemV3 != null) {
                    sB0.c cVar = stickerListItemV3.stickerInfo;
                    Y0(cVar != null ? cVar.j : -1, gVar.d());
                } else {
                    Y0(0, null);
                }
            }
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), (CoroutineStart) null, new IndependentCaptureViewModel$onStickerPopWindowDismiss$2(this, null), 2, (Object) null);
    }

    public final void D1() {
        com.bilibili.studio.videoeditor.capturev3.logic.d dVar = this.f109305r;
        if (dVar != null) {
            d.a aVar = dVar.f109218b;
            if (aVar == null || !aVar.canDetectOrientation()) {
                d.a aVar2 = dVar.f109218b;
                if (aVar2 != null) {
                    aVar2.disable();
                }
                BLog.e("CaptureOrientationLogicManager", "orientationEnable  false " + dVar.f109218b);
                return;
            }
            d.a aVar3 = dVar.f109218b;
            if (aVar3 != null) {
                aVar3.enable();
            }
            BLog.e("CaptureOrientationLogicManager", "orientationEnable  true " + dVar.f109218b);
        }
    }

    public final void E1() {
        g gVar;
        sB0.c cVar;
        CaptureSchema.MissionInfo missionInfo;
        CaptureSchema.MissionInfo missionInfo2;
        g gVar2 = this.f109310w;
        if (gVar2 == null || gVar2.f109230b == null) {
            return;
        }
        qB0.b bVar = this.f109302o;
        CaptureSchema captureSchema = bVar.a;
        if (captureSchema != null) {
            captureSchema.parseJumpParams(bVar.c);
        }
        if (bVar.g == 0) {
            if (!bVar.e) {
                CaptureSchema captureSchema2 = bVar.a;
                boolean z6 = captureSchema2 != null && captureSchema2.schemeStickerV2Available();
                g gVar3 = this.f109310w;
                if (gVar3 != null) {
                    gVar3.f109242o = z6;
                }
                CaptureSchema captureSchema3 = bVar.a;
                if (captureSchema3 != null && captureSchema3.schemeMusicAvailable() && (missionInfo2 = captureSchema3.getMissionInfo()) != null) {
                    MusicInfo musicInfo = new MusicInfo(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null);
                    String bgmName = missionInfo2.getBgmName();
                    String str = bgmName;
                    if (bgmName == null) {
                        str = "";
                    }
                    musicInfo.setName(str);
                    musicInfo.setId(missionInfo2.getBgmId());
                    musicInfo.setType(1);
                    musicInfo.setState(1);
                    musicInfo.setFrom(0);
                    g1().e().f193e.postValue(musicInfo);
                }
                g gVar4 = this.f109310w;
                StickerListItemV3 stickerListItemV3 = gVar4 != null ? gVar4.f109236i : null;
                CaptureSchema captureSchema4 = bVar.a;
                boolean zSchemeStickerV2Available = captureSchema4 != null ? captureSchema4.schemeStickerV2Available() : false;
                int stickerIdV2 = (captureSchema4 == null || (missionInfo = captureSchema4.getMissionInfo()) == null) ? -1 : missionInfo.getStickerIdV2();
                if (zSchemeStickerV2Available && stickerListItemV3 != null && stickerListItemV3.getStickerFileStatus() == 1 && (cVar = stickerListItemV3.stickerInfo) != null && stickerIdV2 == cVar.j) {
                    b1(true);
                } else if (zSchemeStickerV2Available && (gVar = this.f109310w) != null) {
                    String str2 = bVar.c;
                    StickerListItemV3 stickerListItemV3F = gVar.f(stickerIdV2);
                    gVar.f109236i = stickerListItemV3F;
                    IndependentCaptureViewModel independentCaptureViewModel = gVar.f109249v;
                    if (independentCaptureViewModel != null) {
                        if (stickerListItemV3F != null) {
                            gVar.l(str2);
                            independentCaptureViewModel.f109301n.l.setValue(new CaptureSticker(1006));
                            int i7 = gVar.f109240m;
                            IndependentCaptureViewModel independentCaptureViewModel2 = gVar.f109249v;
                            if (independentCaptureViewModel2 != null) {
                                CaptureSticker captureSticker = new CaptureSticker(BLHumanActionParamsType.BL_FACE_ACTION_THRESHOLD_FACE_LIPS_POUTED);
                                captureSticker.targetTabIndex = i7;
                                independentCaptureViewModel2.f109301n.l.setValue(captureSticker);
                            }
                            stickerListItemV3F.needShowCVModelLoading = true;
                            if (stickerListItemV3F.isEffectPackageAvailable()) {
                                m mVar = gVar.f109247t;
                                if (mVar != null) {
                                    mVar.b(stickerListItemV3F);
                                }
                                independentCaptureViewModel.b1(true);
                            } else {
                                C2401b c2401b = gVar.f109245r;
                                if (c2401b != null) {
                                    c2401b.c(stickerListItemV3F, gVar.f109247t);
                                }
                                independentCaptureViewModel.b1(false);
                                independentCaptureViewModel.N1();
                                independentCaptureViewModel.M1();
                            }
                        } else {
                            independentCaptureViewModel.b1(true);
                        }
                    }
                }
            }
            w1();
            c1("new");
        }
    }

    public final void F1() {
        uB0.b bVar;
        g gVar = this.f109310w;
        IB0.b bVar2 = gVar != null ? gVar.f109230b : null;
        com.bilibili.studio.videoeditor.capturev3.logic.b bVar3 = this.f109308u;
        if (bVar2 == null) {
            if (bVar3 == null || (bVar = bVar3.f109212c) == null) {
                return;
            }
            bVar.c = true;
            return;
        }
        if (bVar3 != null) {
            uB0.b bVar4 = bVar3.f109212c;
            if (bVar4 != null) {
                bVar4.c = false;
            }
            CaptureDraftBean captureDraftBean = bVar3.f109211b;
            if (captureDraftBean != null) {
                this.f109301n.r.postValue(Integer.valueOf(captureDraftBean.getFilterId()));
            }
        }
    }

    public final void G1() {
        uB0.b bVar;
        StickerListItemV3 stickerListItemV3F;
        g gVar = this.f109310w;
        IB0.b bVar2 = gVar != null ? gVar.f109230b : null;
        com.bilibili.studio.videoeditor.capturev3.logic.b bVar3 = this.f109308u;
        if (bVar2 == null) {
            if (bVar3 == null || (bVar = bVar3.f109212c) == null) {
                return;
            }
            bVar.b = true;
            return;
        }
        if (bVar3 != null) {
            uB0.b bVar4 = bVar3.f109212c;
            if (bVar4 != null) {
                bVar4.b = false;
            }
            if (gVar != null) {
                CaptureDraftBean captureDraftBean = bVar3.f109211b;
                stickerListItemV3F = gVar.f(captureDraftBean != null ? captureDraftBean.getStickerId() : Integer.MIN_VALUE);
            } else {
                stickerListItemV3F = null;
            }
            g gVar2 = this.f109310w;
            if (gVar2 != null) {
                gVar2.f109236i = stickerListItemV3F;
            }
            if (stickerListItemV3F != null) {
                this.f109301n.l.setValue(new CaptureSticker(1015));
                N1();
                b1(false);
                g gVar3 = this.f109310w;
                if (gVar3 != null) {
                    gVar3.a(stickerListItemV3F, gVar3.f109247t);
                    return;
                }
                return;
            }
            CaptureDraftBean captureDraftBean2 = bVar3.f109211b;
            int makeUpid = Integer.MIN_VALUE;
            if (captureDraftBean2 != null) {
                makeUpid = captureDraftBean2.getMakeUpid();
            }
            com.bilibili.studio.videoeditor.capturev3.logic.a aVar = this.f109309v;
            ArrayList<CaptureMakeupEntity> arrayList = null;
            if (aVar != null) {
                arrayList = aVar.f109205k;
            }
            if (bVar3.f109212c != null) {
                Iterator<CaptureMakeupEntity> it = arrayList.iterator();
                while (it.hasNext() && makeUpid != it.next().id) {
                }
            }
        }
    }

    public final void H1() {
        CaptureSticker captureSticker = new CaptureSticker(1010);
        captureSticker.targetTabIndex = 1;
        this.f109301n.l.setValue(captureSticker);
    }

    public final void I1(@NotNull ImageItem imageItem) {
        this.f109301n.i.postValue(imageItem);
    }

    @Nullable
    public final void J1(@Nullable FilterListItemV3 filterListItemV3) {
        FilterInfo filterInfo;
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar = this.f109309v;
        if (aVar != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.i iVar = aVar.f109196a;
            if (filterListItemV3 != null && (filterInfo = filterListItemV3.getFilterInfo()) != null && filterInfo.getId() != -1) {
                double d7 = filterInfo.filter_intensity;
                int filterType = filterInfo.getFilterType();
                LC0.a aVar2 = iVar.f109252a;
                if (aVar2 != null) {
                    aVar2.j0(d7, filterType, false);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void K1(boolean z6) {
        CaptureDraftBean captureDraftBean;
        List<ClipBean> videoClips;
        com.bilibili.studio.videoeditor.capturev3.logic.b bVar = this.f109308u;
        if (bVar == null || (captureDraftBean = bVar.f109210a) == null) {
            return;
        }
        if (z6 && (videoClips = captureDraftBean.getVideoClips()) != null && !videoClips.isEmpty()) {
            videoClips.remove(CollectionsKt.getLastIndex(videoClips));
        }
        uB0.a aVarB = uB0.a.b();
        Application application = BiliContext.application();
        CaptureDraftBean captureDraftBean2 = bVar.f109210a;
        aVarB.getClass();
        String jSONString = JSON.toJSONString(captureDraftBean2);
        SharedPreferences.Editor editorEdit = j.a(application).a.edit();
        editorEdit.putString("CAPTURE_DRAFT_KEY_V3", jSONString);
        editorEdit.apply();
    }

    public final void M1() {
        CaptureSticker captureSticker = new CaptureSticker(1020);
        captureSticker.what = 294;
        captureSticker.delayMillis = 5000L;
        this.f109301n.l.setValue(captureSticker);
    }

    public final void N1() {
        CaptureSticker captureSticker = new CaptureSticker(1019);
        captureSticker.textResId = 2131842045;
        this.f109301n.l.setValue(captureSticker);
    }

    public final void O1(@Nullable StickerListItemV3 stickerListItemV3, boolean z6) {
        sB0.c cVar;
        LC0.a aVar;
        if (stickerListItemV3 == null || (cVar = stickerListItemV3.stickerInfo) == null) {
            return;
        }
        int iB = cVar.b();
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        if (iVar == null || (aVar = iVar.f109252a) == null) {
            return;
        }
        aVar.i0(iB, z6);
    }

    public final void P1(StickerListItemV3 stickerListItemV3, boolean z6) {
        sB0.c cVar;
        LC0.a aVar;
        if (stickerListItemV3 == null || (cVar = stickerListItemV3.stickerInfo) == null) {
            return;
        }
        int iB = cVar.b();
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        if (iVar == null || (aVar = iVar.f109252a) == null) {
            return;
        }
        aVar.a0(iB, z6);
    }

    public final void Q1(int i7) {
        Application application = BiliContext.application();
        if (application != null) {
            a1(application.getString(i7));
        }
    }

    public final void R1(boolean z6) {
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        if (iVar == null || iVar.f109256e <= 1) {
            return;
        }
        int nowDeviceIndex = zB0.d.a().a.getNowDeviceIndex() ^ 1;
        iVar.f109254c = nowDeviceIndex;
        LC0.a aVar = iVar.f109252a;
        if (aVar != null) {
            aVar.t(nowDeviceIndex);
        }
        BLog.e("MediaEngineManager", " switchEngineCamera=" + iVar.f109252a + "，deviceIndex=" + iVar.f109254c);
        zB0.d.a().b(iVar.f109254c);
        LC0.a aVar2 = iVar.f109252a;
        if (aVar2 != null) {
            aVar2.r0(iVar.f109254c);
        }
        qB0.d dVar = this.f109301n;
        dVar.e.postValue(Integer.valueOf(iVar.f109254c));
        if (!iVar.d()) {
            T1(false);
        }
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar3 = this.f109309v;
        if ((aVar3 == null || Xpref.getSharedPreferences(aVar3.f109197b, "editor_config").getInt("beautify_select_template", -1) == -1) && com.bilibili.studio.videoeditor.media.performance.a.e().c().isConfigured) {
            Application application = BiliContext.application();
            int i7 = application != null ? Xpref.getSharedPreferences(application, "editor_config").getInt("beautify_select_template", -1) : -1;
            int i8 = i7;
            if (i7 == -1) {
                BeautifyTemplate beautifyTemplateC = com.bilibili.studio.videoeditor.media.performance.a.e().c();
                i8 = NC0.b.d() ? beautifyTemplateC.frontCameraTemplateId : beautifyTemplateC.backCameraTemplateId;
            }
            dVar.o.postValue(new Pair(Integer.valueOf(i8), Boolean.FALSE));
        }
        if (z6) {
            boolean zD = iVar.d();
            List<String> list = HB0.a.f8154a;
            HashMap map = new HashMap();
            map.put("reverse_status", true == (zD ^ true) ? "front" : "rear");
            map.put("first_entrance", Xz0.j.a("first_entrance"));
            map.put("track_id", Xz0.g.d());
            map.put("router_topic_id", Xz0.g.f28463b);
            Neurons.reportClick(false, "creation.video-shoot.reverse-camera.0.click", map);
        }
        boolean zD2 = iVar.d();
        String strM1 = m1();
        String str = CenterPlusStatisticsHelper.f105195a;
        HashMap map2 = new HashMap();
        map2.put("current", true == zD2 ? "前" : "后");
        map2.put("after", true == (zD2 ^ true) ? "前" : "后");
        map2.put("capture_id", CenterPlusStatisticsHelper.f105197c);
        String str2 = strM1;
        if (strM1 == null) {
            str2 = "";
        }
        map2.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str2);
        BLog.dfmt("CenterPlusStatisticsHelper", "reportNewBMMSwitchCamera...params = " + map2, new Object[0]);
        Neurons.trackT(false, "creation.new-bmm.switch.camera.track", map2, 1, new O1(9));
    }

    public final void S1(int i7) {
        this.f109301n.f.postValue(Integer.valueOf(i7));
        j.a(BiliContext.application()).c("CountDown", i7);
    }

    public final void T1(boolean z6) {
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        if (iVar == null || !iVar.d()) {
            z6 = false;
        }
        this.f109301n.d.setValue(Boolean.valueOf(z6));
        if (iVar != null) {
            Y0.c.c(" mediaEngine，updateEngineFlashOn=", "MediaEngineManager", z6);
            LC0.a aVar = iVar.f109252a;
            if (aVar != null) {
                aVar.s0(z6);
            }
        }
    }

    public final void U1(float f7) {
        this.f109301n.c.setValue(Float.valueOf(f7));
        zB0.d.a().a.setNowSpeed(f7);
    }

    public final void b1(boolean z6) {
        CaptureSticker captureSticker = new CaptureSticker(1022);
        captureSticker.active = z6;
        this.f109301n.l.setValue(captureSticker);
    }

    public final void c1(String str) {
        CaptureSchema.MissionInfo missionInfo;
        qB0.b bVar = this.f109302o;
        CaptureSchema captureSchema = bVar.a;
        if (captureSchema != null && captureSchema.missionIdAvailable() && captureSchema.getMissionInfo() != null) {
            String strM1 = m1();
            String str2 = strM1 != null ? strM1 : "";
            CaptureSchema captureSchema2 = bVar.a;
            S0(str2, String.valueOf((captureSchema2 == null || (missionInfo = captureSchema2.getMissionInfo()) == null) ? 0 : missionInfo.getMissionId()), str);
            return;
        }
        String strM12 = m1();
        String str3 = strM12;
        if (strM12 == null) {
            str3 = "";
        }
        S0(str3, "", str);
    }

    @Nullable
    public final void d1() {
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar = this.f109309v;
        if (aVar != null) {
            ArrayList<CaptureMakeupEntity> arrayList = aVar.f109205k;
            if (arrayList != null) {
                for (CaptureMakeupEntity captureMakeupEntity : arrayList) {
                    captureMakeupEntity.isSelect = TextUtils.isEmpty(captureMakeupEntity.download_url);
                }
            }
            com.bilibili.studio.videoeditor.capturev3.logic.i iVar = aVar.f109196a;
            LC0.a aVar2 = iVar.f109252a;
            if (aVar2 != null) {
                aVar2.p("Makeup Lip Resource");
            }
            LC0.a aVar3 = iVar.f109252a;
            if (aVar3 != null) {
                aVar3.p("Makeup Face Resource");
            }
            LC0.a aVar4 = iVar.f109252a;
            if (aVar4 != null) {
                aVar4.p("Makeup Nose Resource");
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final Bundle e1(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("anim_up_down", true);
        qB0.b bVar = this.f109302o;
        bundle2.putBoolean("is_new_ui", bVar.d);
        bundle2.putString("JUMP_PARAMS", bVar.c);
        bundle2.putString("ARCHIVE_FROM", "shoot");
        bundle2.putBoolean("use_bmm_gray", true);
        bundle2.putBoolean("support_fast_publish", true);
        bundle2.putBoolean("support_fast_p2v", true);
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f1() {
        Integer num = (Integer) this.f109301n.f.getValue();
        return num != null ? num.intValue() : 1;
    }

    @NotNull
    public final com.bilibili.studio.videoeditor.capturev3.music.g<AB0.a> g1() {
        return (com.bilibili.studio.videoeditor.capturev3.music.g) this.f109311x.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int h1() {
        Integer num = (Integer) this.f109301n.g.getValue();
        return num != null ? num.intValue() : 0;
    }

    public final long j1() {
        com.bilibili.studio.videoeditor.capturev3.logic.c cVar = this.f109312y;
        String strE = cVar != null ? cVar.e() : "";
        long jA = 0;
        if (!TextUtils.isEmpty(strE)) {
            com.bilibili.studio.videoeditor.capturev3.logic.c cVar2 = this.f109312y;
            jA = 0;
            if (cVar2 != null) {
                jA = 0;
                if (cVar2.f109213a != null) {
                    jA = 1000 * HC0.a.a(strE);
                }
            }
        }
        return jA;
    }

    public final long k1() {
        com.bilibili.studio.videoeditor.capturev3.logic.c cVar = this.f109312y;
        long j7 = 0;
        if (cVar != null) {
            e eVarA = cVar.f109215c.a();
            j7 = 0;
            if (eVarA != null) {
                j7 = eVarA.e;
            }
        }
        return j7;
    }

    @NotNull
    public final String l1() {
        LC0.a aVar;
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        if (iVar == null || (aVar = iVar.f109252a) == null) {
            return "";
        }
        zB0.d.a().a.getNowDeviceIndex();
        SizeV3 sizeV3U = aVar.u();
        return C4628q.a(sizeV3U.getWidth(), sizeV3U.getHeight(), ConfigService.ANY);
    }

    @Nullable
    public final String m1() {
        CaptureSchema.SchemaInfo schemaInfo;
        CaptureSchema captureSchema = this.f109302o.a;
        return (captureSchema == null || (schemaInfo = captureSchema.getSchemaInfo()) == null) ? null : schemaInfo.getRelationFrom();
    }

    @Nullable
    public final StickerListItemV3 n1() {
        g gVar = this.f109310w;
        return gVar != null ? gVar.f109235g : null;
    }

    public final long o1() {
        CaptureRecordManager captureRecordManager = this.f109307t;
        return captureRecordManager != null ? captureRecordManager.a() : 0L;
    }

    public final boolean p1() {
        CaptureRecordManager captureRecordManager = this.f109307t;
        boolean z6 = false;
        if (captureRecordManager != null) {
            VideoClipRecordInfo videoClipRecordInfo = captureRecordManager.f109188a;
            z6 = false;
            if (videoClipRecordInfo != null && videoClipRecordInfo.hasClip()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void q1() {
        ArrayList<CaptureBeautyEntity> arrayList;
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar = this.f109309v;
        if (aVar == null || (arrayList = aVar.f109203i) == null) {
            return;
        }
        for (CaptureBeautyEntity captureBeautyEntity : arrayList) {
            if (!TextUtils.isEmpty(captureBeautyEntity.params)) {
                boolean z6 = aVar.f109209o;
                com.bilibili.studio.videoeditor.capturev3.logic.i iVar = aVar.f109196a;
                if (!z6) {
                    String str = captureBeautyEntity.params;
                    LC0.a aVar2 = iVar.f109252a;
                    captureBeautyEntity.currentValue = (aVar2 != null ? Double.valueOf(aVar2.S(str)) : 0).floatValue();
                }
                String str2 = captureBeautyEntity.params;
                float f7 = captureBeautyEntity.currentValue;
                LC0.a aVar3 = iVar.f109252a;
                if (aVar3 != null) {
                    aVar3.o0(f7, str2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r1() {
        Boolean bool = (Boolean) this.f109301n.d.getValue();
        return bool != null ? bool.booleanValue() : false;
    }

    public final boolean s1() {
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        boolean z6 = false;
        if (iVar != null) {
            LC0.a aVar = iVar.f109252a;
            z6 = false;
            if (aVar != null) {
                z6 = false;
                if ((aVar.q() & 1) != 0) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final boolean t1() {
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        boolean z6 = false;
        if (iVar != null) {
            z6 = false;
            if (iVar.d()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean u1() {
        com.bilibili.studio.videoeditor.capturev3.logic.i iVar = this.f109306s;
        boolean z6 = false;
        if (iVar != null) {
            LC0.a aVar = iVar.f109252a;
            z6 = false;
            if (aVar != null && aVar.v() == 2) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean v1(@Nullable int[] iArr) {
        boolean zContains = false;
        if (this.f109310w != null) {
            zContains = false;
            if (iArr != null) {
                zContains = ArraysKt.contains(iArr, 13);
            }
        }
        return zContains;
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, mB0.a$a] */
    public final void w1() {
        CaptureSchema.CaptureCooperate captureCooperate;
        i iVar;
        CaptureSchema captureSchema = this.f109302o.a;
        if (captureSchema == null || !captureSchema.schemeCooperateAvailable() || (captureCooperate = captureSchema.getCaptureCooperate()) == null || !captureCooperate.getShouldResetCorporate()) {
            return;
        }
        g1().f(2, false);
        g1().g(null);
        g1().e().f190b.postValue(null);
        com.bilibili.studio.videoeditor.capturev3.logic.c cVar = this.f109312y;
        if (cVar != null) {
            CaptureSchema.CaptureCooperate captureCooperate2 = captureSchema.getCaptureCooperate();
            Long lValueOf = captureCooperate2 != null ? Long.valueOf(captureCooperate2.getCoorperateId()) : null;
            if (lValueOf == null || (iVar = this.f109300m) == null) {
                return;
            }
            long jLongValue = lValueOf.longValue();
            if (iVar.c == null) {
                iVar.c = new e(BiliContext.application());
            }
            e eVar = iVar.c;
            if (eVar != null) {
                eVar.b = cVar;
            }
            if (eVar != null) {
                eVar.e = jLongValue;
                String strA = android.support.v4.media.session.a.a(new StringBuilder(), eVar.e, ".mp4");
                eVar.c = strA;
                eVar.d = true;
                eVar.j = false;
                mB0.a.a = 0L;
                mB0.a.b = null;
                mB0.a.c = null;
                File file = new File(h.f17814e, strA);
                boolean zExists = file.exists();
                mB0.a.c = file;
                if (zExists) {
                    mB0.a.c = null;
                } else {
                    mB0.a.a = System.currentTimeMillis();
                    ?? obj = new Object();
                    ((a.a) obj).a = jLongValue;
                    ((a.a) obj).b = 0L;
                    ((a.a) obj).c = 0;
                    ((a.a) obj).d = 0;
                    ((a.a) obj).e = 0L;
                    ((a.a) obj).f = 0L;
                    ((a.a) obj).g = 0L;
                    ((a.a) obj).h = "";
                    ((a.a) obj).i = 0L;
                    ((a.a) obj).j = 1;
                    mB0.a.b = obj;
                }
                Xz0.d dVar = Xz0.d.f28458a;
                long j7 = eVar.e;
                dVar.getClass();
                Xz0.d.y("capture", "start", "cooperate", String.valueOf(j7), null);
                v0.b(jLongValue, "cooperate id = ", "FTDataFetcherV3");
                ((IB0.e) ServiceGenerator.createService(IB0.e.class)).getFTVideoMaterialAidCid(BiliAccounts.get(eVar.a).getAccessKey(), jLongValue).enqueue(new wB0.c<>(eVar));
            }
        }
    }

    public final void x1(boolean z6) {
        KB0.a aVar;
        KB0.a aVar2;
        this.f109301n.z.postValue(Boolean.TRUE);
        g gVar = this.f109310w;
        if (gVar != null && (aVar2 = gVar.f109250w) != null) {
            aVar2.f12713e = this.f109302o.e;
        }
        if (gVar != null && (aVar = gVar.f109250w) != null) {
            aVar.f12714f = z6;
        }
        if (gVar != null) {
            KB0.a aVar3 = gVar.f109250w;
            Integer value = aVar3.f12709a.getValue();
            aVar3.f12709a.postValue(Integer.valueOf((value != null ? value.intValue() : 0) | 2));
        }
    }

    public void y1(boolean z6) {
        this.f109319i = false;
    }

    public final void z1() {
        this.f109301n.p.setValue(Boolean.TRUE);
    }
}
