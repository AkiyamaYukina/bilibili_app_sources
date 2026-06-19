package com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule;

import A51.i;
import Dy0.C1607c;
import Ex0.c;
import Ex0.n;
import F3.C1731f6;
import Jy0.a;
import Ly0.C2543b;
import Ly0.C2547f;
import Ly0.E;
import Ly0.H;
import Ly0.I;
import Ly0.K;
import Ly0.p;
import Ly0.t;
import My0.d;
import Sy0.o;
import Wy0.e;
import Yy0.h;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.fragment.app.Fragment;
import com.bilibili.base.MainThread;
import com.bilibili.lib.blrouter.MutableBundleLike;
import com.bilibili.lib.fasthybrid.JumpParam;
import com.bilibili.lib.fasthybrid.runtime.AppRuntime;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.editor.asr.bean.AsrExtraMsg;
import com.bilibili.studio.editor.asr.bean.AsrSource;
import com.bilibili.studio.editor.asr.multi.BiliEditorMultiAsrManager;
import com.bilibili.studio.editor.asr.zip2ai.AsrFrom;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.editormain.track.enums.BiliEditorMaterialType;
import com.bilibili.studio.editor.moudle.editormain.ui.panels.control.MainPanelMaterialTrackType;
import com.bilibili.studio.editor.moudle.editormain.uistate.mainpanel.MainPanelMaterialAddTrackUiState;
import com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.f;
import com.bilibili.studio.videoeditor.extension.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/captionmodule/EditorCaptionUseCase.class */
public final class EditorCaptionUseCase extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f107131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final n f107132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Sy0.a f107133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final e f107134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Oy0.c f107135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final t f107136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final E f107137g;

    @NotNull
    public final C2543b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C2547f f107138i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f107139j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final My0.b f107140k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final d f107141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final H f107142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final p f107143n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Oy0.d f107144o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final h f107145p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f107146q = true;

    @Inject
    public EditorCaptionUseCase(@NotNull c cVar, @NotNull n nVar, @NotNull Sy0.a aVar, @NotNull e eVar, @NotNull Oy0.c cVar2, @NotNull t tVar, @NotNull E e7, @NotNull C2543b c2543b, @NotNull C2547f c2547f, @NotNull b bVar, @NotNull My0.b bVar2, @NotNull d dVar, @NotNull H h, @NotNull p pVar, @NotNull Oy0.d dVar2, @NotNull h hVar) {
        this.f107131a = cVar;
        this.f107132b = nVar;
        this.f107133c = aVar;
        this.f107134d = eVar;
        this.f107135e = cVar2;
        this.f107136f = tVar;
        this.f107137g = e7;
        this.h = c2543b;
        this.f107138i = c2547f;
        this.f107139j = bVar;
        this.f107140k = bVar2;
        this.f107141l = dVar;
        this.f107142m = h;
        this.f107143n = pVar;
        this.f107144o = dVar2;
        this.f107145p = hVar;
        dVar2.f18128e = new I(this, 0);
    }

    public final void i() {
        List<BClip> userTrackBClipList;
        EditVideoInfo editVideoInfo;
        List<CaptionInfo> captionInfoList;
        EditVideoInfo editVideoInfo2 = this.f107131a.f4806b;
        if (editVideoInfo2 == null || (userTrackBClipList = editVideoInfo2.getUserTrackBClipList()) == null || (editVideoInfo = this.f107131a.f4806b) == null || (captionInfoList = editVideoInfo.getCaptionInfoList()) == null) {
            return;
        }
        for (CaptionInfo captionInfo : captionInfoList) {
            Iterator<BClip> it = userTrackBClipList.iterator();
            long duration = 0;
            while (true) {
                long j7 = duration;
                if (it.hasNext()) {
                    BClip next = it.next();
                    long duration2 = next.getDuration(true);
                    long j8 = captionInfo.inPoint;
                    if (j7 <= j8 && j8 < duration2 + j7) {
                        captionInfo.bClipID = next.id;
                        long trimIn = next.getTrimIn();
                        long j9 = captionInfo.inPoint;
                        captionInfo.capTimeInVideo = trimIn + ((long) ((j9 - j7) * next.playRate));
                        captionInfo.capTimeDuration = captionInfo.outPoint - j9;
                        break;
                    }
                    duration = j7 + next.getDuration(true);
                }
            }
        }
    }

    public final void j(boolean z6, boolean z7) {
        Y0.c.c("onClickCaptionAddTrack isAsr=", "MainPanelCaptionUseCase", z6);
        EditVideoInfo editVideoInfo = this.f107131a.f4806b;
        Xz0.d dVar = Xz0.d.f28458a;
        String strS = f.s(editVideoInfo);
        String strE = l.e(editVideoInfo);
        dVar.getClass();
        Xz0.d.T("文字", strS, strE);
        if (z6) {
            if (!z7) {
                this.f107138i.h.B(MainPanelMaterialAddTrackUiState.RecognitionState.HIDE_BTN);
                return;
            }
            Map mapE = Xz0.d.e();
            Neurons.reportClick(false, "creation.new-video-editor.speech-recognition.total-clip.click", mapE);
            C2547f c2547f = this.f107138i;
            EditorCaptionUseCase$onClickCaptionAddTrack$1 editorCaptionUseCase$onClickCaptionAddTrack$1 = new EditorCaptionUseCase$onClickCaptionAddTrack$1(this.h);
            c2547f.h.B(MainPanelMaterialAddTrackUiState.RecognitionState.HIDE_BTN);
            C2547f.k(c2547f, false, false, false, editorCaptionUseCase$onClickCaptionAddTrack$1, 7);
            return;
        }
        C2543b c2543b = this.h;
        Oy0.d.a(c2543b.f14921d, null);
        p pVar = c2543b.f14919b;
        CaptionInfo captionInfoI = pVar.i(pVar.f14975d.z(), true);
        if (captionInfoI != null) {
            c2543b.f14918a.f14995q = true;
            c2543b.f14920c.t(captionInfoI, 0, true);
        }
        o oVar = this.f107133c.f23143g;
        if (oVar != null) {
            oVar.invoke(Boolean.FALSE);
        }
    }

    public final void k(@Nullable Boolean bool) {
        i iVar = new i(this, 1);
        K k7 = new K(this, 0);
        ez0.c cVar = this.f107133c.f23139c;
        cVar.k.setValue(MainPanelMaterialAddTrackUiState.a(cVar.b(), bool != null ? bool.booleanValue() : cVar.b().f107109a, iVar, k7, true, null, 16));
        cVar.d.setValue(Fy0.c.a(cVar.g(), false, false, MainPanelMaterialTrackType.TRACK_CAPTION_ADD, null, null, false, null, 251));
    }

    public final void l(@Nullable Boolean bool, boolean z6) {
        this.f107132b.getClass();
        BLog.i("StreamingRepository", "setSeekFlag, false");
        EditVideoInfo editVideoInfo = this.f107131a.f4806b;
        if (editVideoInfo == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) new Pair(Sy0.b.e(editVideoInfo), (Object) null).component1();
        if (z6) {
            if (arrayList.isEmpty()) {
                MainPanelMaterialAddTrackUiState.RecognitionState recognitionState = this.f107133c.f23139c.b().f107113e;
                MainPanelMaterialAddTrackUiState.RecognitionState recognitionState2 = MainPanelMaterialAddTrackUiState.RecognitionState.HIDE_BTN;
                if (recognitionState != recognitionState2) {
                    if (recognitionState == MainPanelMaterialAddTrackUiState.RecognitionState.SHOW_BTN) {
                        this.f107133c.B(recognitionState2);
                    } else {
                        final C2547f c2547f = this.f107138i;
                        c2547f.getClass();
                        final String strA = vg.E.a(Random.Default.nextInt(100), System.currentTimeMillis(), "_");
                        defpackage.a.b("startFastAsrOnBackground, ", strA, "EditorCaptionAsrUseCase");
                        c2547f.f14945p = strA;
                        BiliEditorMultiAsrManager.f105608a.d(null, AsrSource.EDITOR, c2547f.f14935e.f4806b, new Function2(strA, c2547f) { // from class: Ly0.c

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final String f14922a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final C2547f f14923b;

                            {
                                this.f14922a = strA;
                                this.f14923b = c2547f;
                            }

                            public final Object invoke(Object obj, Object obj2) {
                                String str = this.f14922a;
                                final C2547f c2547f2 = this.f14923b;
                                final Bw0.d dVar = (Bw0.d) obj;
                                BLog.i("EditorCaptionAsrUseCase", "onLabelResult:," + str + " " + dVar + ", " + ((AsrExtraMsg) obj2));
                                if (Intrinsics.areEqual(c2547f2.f14945p, str)) {
                                    if (c2547f2.h.f23139c.b().f107113e == MainPanelMaterialAddTrackUiState.RecognitionState.HIDE_BTN) {
                                        BLog.i("EditorCaptionAsrUseCase", "当前已隐藏画面识别按钮，不再展示");
                                    } else {
                                        final int i7 = 0;
                                        c2547f2.f14937g.f13074a.F.setValue(new C1607c(new Function1(i7, c2547f2, dVar) { // from class: Ly0.d

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final int f14924a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final Object f14925b;

                                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                                            public final Object f14926c;

                                            {
                                                this.f14924a = i7;
                                                this.f14925b = c2547f2;
                                                this.f14926c = dVar;
                                            }

                                            public final Object invoke(Object obj3) {
                                                Unit unit;
                                                Object obj4 = this.f14925b;
                                                Object obj5 = this.f14926c;
                                                switch (this.f14924a) {
                                                    case 0:
                                                        Fragment fragment = (Fragment) obj3;
                                                        if (fragment != null) {
                                                            BLog.i("EditorCaptionAsrUseCase", "当前不在主面板，暂不展示: " + fragment);
                                                            unit = Unit.INSTANCE;
                                                        } else {
                                                            final C2547f c2547f3 = (C2547f) obj4;
                                                            Sy0.a aVar = c2547f3.h;
                                                            final int i8 = 0;
                                                            final Bw0.d dVar2 = (Bw0.d) obj5;
                                                            Function1 function1 = new Function1(i8, c2547f3, dVar2) { // from class: Ly0.e

                                                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                                                public final int f14927a;

                                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                                public final Object f14928b;

                                                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                                                public final Object f14929c;

                                                                {
                                                                    this.f14927a = i8;
                                                                    this.f14928b = c2547f3;
                                                                    this.f14929c = dVar2;
                                                                }

                                                                /* JADX WARN: Removed duplicated region for block: B:11:0x0095  */
                                                                /* JADX WARN: Removed duplicated region for block: B:28:0x015e  */
                                                                /* JADX WARN: Removed duplicated region for block: B:65:0x02d2  */
                                                                /* JADX WARN: Removed duplicated region for block: B:66:0x02d9  */
                                                                /* JADX WARN: Removed duplicated region for block: B:69:0x02e4  */
                                                                /*
                                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                                */
                                                                public final java.lang.Object invoke(java.lang.Object r9) {
                                                                    /*
                                                                        Method dump skipped, instruction units count: 796
                                                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                                                    */
                                                                    throw new UnsupportedOperationException("Method not decompiled: Ly0.C2546e.invoke(java.lang.Object):java.lang.Object");
                                                                }
                                                            };
                                                            aVar.getClass();
                                                            aVar.f23139c.l(new QK.E(function1, 1));
                                                            unit = Unit.INSTANCE;
                                                        }
                                                        break;
                                                    case 1:
                                                        int i9 = AppRuntime.O;
                                                        MainThread.runOnMainThread(new com.bilibili.biligame.ui.feed.widget.bottomtip.E(1, (AppRuntime) obj4, (JumpParam) obj5));
                                                        break;
                                                    case 2:
                                                        Uri uri = (Uri) obj4;
                                                        MutableBundleLike mutableBundleLike = (MutableBundleLike) obj3;
                                                        mutableBundleLike.remove("url");
                                                        mutableBundleLike.put("url", uri.buildUpon().authority(StringsKt.L((String) obj5, "bilibili.com", "dreamcast.hk")).toString());
                                                        break;
                                                    default:
                                                        Boolean bool2 = (Boolean) obj3;
                                                        boolean zBooleanValue = bool2.booleanValue();
                                                        ((MutableState) obj5).setValue(bool2);
                                                        if (zBooleanValue) {
                                                            kntr.common.ouro.ui.textField.h.a((kntr.common.ouro.ui.textField.h) obj4, false, false, 2);
                                                        }
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }));
                                    }
                                    Ex0.r rVar = c2547f2.f14936f;
                                    EditVideoInfo editVideoInfo2 = c2547f2.f14935e.f4806b;
                                    AsrFrom asrFrom = AsrFrom.CUSTOMER;
                                    rVar.getClass();
                                    Ex0.r.a(editVideoInfo2, asrFrom);
                                }
                                return Unit.INSTANCE;
                            }
                        }, new C1731f6(3));
                    }
                }
            } else {
                this.f107133c.B(MainPanelMaterialAddTrackUiState.RecognitionState.HIDE_BTN);
            }
        }
        if (arrayList.isEmpty()) {
            k(bool);
        } else {
            Sy0.a aVar = this.f107133c;
            aVar.f23139c.s(bool, BiliEditorMaterialType.TYPE_CAPTION, arrayList, new EditorCaptionUseCase$showMaterialTopFoldOrAddTrack$1(this));
        }
        this.f107138i.getClass();
        e eVar = this.f107134d;
        eVar.o(null);
        eVar.j(false, null);
        E e7 = this.f107137g;
        e7.f14884d.b(e7.f14899t, "EditorCaptionStickerUseCase");
    }
}
