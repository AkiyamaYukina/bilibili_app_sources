package com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting;

import Dy0.C1609e;
import Ex0.c;
import Ex0.n;
import Fc.i;
import Ky0.a0;
import Ly0.t;
import Ny0.d;
import Ny0.g;
import Ny0.p;
import Ny0.q;
import Ny0.r;
import OC0.h;
import P50.v;
import PH.e;
import PH.f;
import UC0.c;
import android.graphics.PointF;
import bx0.C5171d;
import com.bilibili.app.comm.list.common.inline.anim.InlineAlphaAnim;
import com.bilibili.biligame.video.inline.GameHomeInlinePanel;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.studio.config.UpperFawkesDeviceDecision;
import com.bilibili.studio.editor.moudle.caption.v1.BPointF;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionAssetBean;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionInfo;
import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import com.bilibili.studio.editor.moudle.editormain.track.cover.enums.BiliEditorTrackMode;
import com.bilibili.studio.editor.moudle.editormain.track.manager.EditorTrackLocationMode;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.C6563q;
import com.bilibili.studio.editor.moudle.editormain.uistate.bottomfragment.FragmentContainerModal;
import com.bilibili.studio.editor.moudle.editormain.usecase.middlemodule.MiddleControlUseCase;
import com.bilibili.studio.editor.tts.TtsManager;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfoUtils;
import cx0.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import px0.e$b;
import sx0.InterfaceC8632a;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/captionmodule/fastsetting/b.class */
public final class b extends Jy0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ez0.b f107154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f107155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final n f107156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a0 f107157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final d f107158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Ny0.b f107159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final p f107160g;

    @NotNull
    public final Ny0.n h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final g f107161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.a f107162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final t f107163k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Ny0.c f107164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Oy0.d f107165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Oy0.b f107166n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final My0.b f107167o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final My0.d f107168p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Wy0.d f107169q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public C6563q f107170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public PH.c f107171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.t f107172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public e f107173u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public f f107174v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public PH.g f107175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public A50.p f107176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f107177y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final a f107178z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/captionmodule/fastsetting/b$a.class */
    public static final class a implements InterfaceC8632a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f107179a;

        public a(b bVar) {
            this.f107179a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0298  */
        @Override // sx0.InterfaceC8632a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.String r10, boolean r11, int r12, java.lang.Boolean r13) {
            /*
                Method dump skipped, instruction units count: 793
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b.a.a(java.lang.String, boolean, int, java.lang.Boolean):void");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/usecase/captionmodule/fastsetting/b$b.class */
    public final class C1193b implements e$b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f107180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CaptionListItem f107181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e$b f107182c;

        public C1193b(b bVar, CaptionListItem captionListItem, e$b e_b) {
            this.f107180a = bVar;
            this.f107181b = captionListItem;
            this.f107182c = e_b;
        }

        @Override // px0.e$b
        public final void a(int i7, String str) {
            this.f107182c.a(i7, str);
        }

        @Override // px0.e$b
        public final void b(String str) {
            b bVar = this.f107180a;
            bVar.f107164l.f17480f.isTemp = false;
            CaptionListItem captionListItem = this.f107181b;
            bVar.p(captionListItem);
            bVar.q(captionListItem.getMax(), str == null ? "" : str);
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            this.f107182c.b(str2);
        }
    }

    @Inject
    public b(@NotNull ez0.b bVar, @NotNull c cVar, @NotNull n nVar, @NotNull a0 a0Var, @NotNull d dVar, @NotNull Ny0.b bVar2, @NotNull p pVar, @NotNull Ny0.n nVar2, @NotNull g gVar, @NotNull com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.a aVar, @NotNull t tVar, @NotNull Ny0.c cVar2, @NotNull Oy0.d dVar2, @NotNull Oy0.b bVar3, @NotNull My0.b bVar4, @NotNull My0.d dVar3, @NotNull Wy0.d dVar4) {
        this.f107154a = bVar;
        this.f107155b = cVar;
        this.f107156c = nVar;
        this.f107157d = a0Var;
        this.f107158e = dVar;
        this.f107159f = bVar2;
        this.f107160g = pVar;
        this.h = nVar2;
        this.f107161i = gVar;
        this.f107162j = aVar;
        this.f107163k = tVar;
        this.f107164l = cVar2;
        this.f107165m = dVar2;
        this.f107166n = bVar3;
        this.f107167o = bVar4;
        this.f107168p = dVar3;
        this.f107169q = dVar4;
        bVar4.f16515l = new q(this);
        dVar3.f16543s = new r(this, 0);
        this.f107178z = new a(this);
    }

    public static long i(int i7) {
        return Math.round((((i7 - 4.0f) * 0.15f) + 2.0f) * 1000000.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        if (!this.f107177y) {
            BLog.e("EditorCaptionSettingUseCase", "hideCaptionSettingFragment 当前没有显示快速编辑面板");
            return;
        }
        v vVar = this.f107156c.h;
        if (vVar != null) {
            vVar.setOnClickListener(null);
        }
        this.f107170r = null;
        this.f107171s = null;
        this.f107172t = null;
        this.f107174v = null;
        this.f107173u = null;
        this.f107175w = null;
        this.f107176x = null;
        p pVar = this.f107160g;
        pVar.f17540f = true;
        pVar.f17541g = true;
        com.bilibili.studio.editor.moudle.caption.manager.e eVar = pVar.f17538d;
        if (eVar != null) {
            eVar.a();
            eVar.f105783e = null;
            TtsManager ttsManager = eVar.f105782d;
            CoroutineScopeKt.cancel$default(ttsManager.f108316a, (CancellationException) null, 1, (Object) null);
            ((LinkedHashMap) ttsManager.f108317b).clear();
            CoroutineScopeKt.cancel$default(eVar.f105779a, (CancellationException) null, 1, (Object) null);
        }
        pVar.f17538d = null;
        this.f107158e.f17486a.f24409a = false;
        Ny0.b bVar = this.f107159f;
        bVar.getClass();
        bVar.f17474a = new gx0.a();
        g gVar = this.f107161i;
        gVar.f17506j = null;
        gVar.f17507k = null;
        com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.a aVar = this.f107162j;
        aVar.f107151e = null;
        gVar.f17498a.b(gVar.f17508l, "EditorCaptionSettingFastUseCase");
        this.f107177y = false;
        this.f107163k.f14995q = false;
        aVar.c();
        aVar.f107150d.f107186d.m.setValue(new Gy0.a(false, false, new EditorCaptionLargeEditUseCase$updateCaptionLargeEditVisible$1(aVar)));
        final int i7 = 0;
        Runnable runnable = new Runnable(this, i7) { // from class: Ny0.s

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f17548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f17549b;

            {
                this.f17548a = i7;
                this.f17549b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f17548a) {
                    case 0:
                        com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b bVar2 = (com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b) this.f17549b;
                        bVar2.f107163k.B();
                        My0.b bVar3 = bVar2.f107167o;
                        if (!bVar3.f16512i) {
                            My0.d dVar = bVar2.f107168p;
                            if (dVar.f16540p) {
                                dVar.f16540p = false;
                                if (bVar2.f107163k.f14993o != null) {
                                    dVar.i(false, true, true);
                                }
                            }
                        } else {
                            bVar3.f16512i = false;
                            bVar3.i();
                        }
                        break;
                    default:
                        GameHomeInlinePanel gameHomeInlinePanel = (GameHomeInlinePanel) this.f17549b;
                        InlineAlphaAnim inlineAlphaAnim = gameHomeInlinePanel.s;
                        InlineAlphaAnim inlineAlphaAnim2 = inlineAlphaAnim;
                        if (inlineAlphaAnim == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mCompleteHideAnimation");
                            inlineAlphaAnim2 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim2, false, (Function0) null, 3, (Object) null);
                        InlineAlphaAnim inlineAlphaAnim3 = gameHomeInlinePanel.t;
                        InlineAlphaAnim inlineAlphaAnim4 = inlineAlphaAnim3;
                        if (inlineAlphaAnim3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHalfHideAnimation");
                            inlineAlphaAnim4 = null;
                        }
                        InlineAlphaAnim.startHideAnim$default(inlineAlphaAnim4, false, (Function0) null, 3, (Object) null);
                        gameHomeInlinePanel.getGestureSeekWidget().hideInlineSeekBar();
                        break;
                }
            }
        };
        a0 a0Var = this.f107157d;
        a0Var.f13078e.j();
        a0Var.f13077d.e(true);
        MiddleControlUseCase middleControlUseCase = a0Var.f13081i;
        middleControlUseCase.o(true);
        Boolean bool = Boolean.TRUE;
        middleControlUseCase.l(bool, bool);
        middleControlUseCase.j(true);
        Sy0.a.H(a0Var.f13082j, EditorTrackLocationMode.LOCATION_BOTTOM, BiliEditorTrackMode.TRACK_MODE_EASY_EDIT, null, false, 12);
        ez0.a aVar2 = a0Var.f13074a;
        C1609e c1609e = (C1609e) aVar2.D.getValue();
        C1609e c1609e2 = c1609e;
        if (c1609e == null) {
            c1609e2 = new C1609e(false, null, null, -1, false, null, FragmentContainerModal.MODAL_FULL_SCREEN);
        }
        aVar2.D.setValue(C1609e.a(c1609e2, false, null, null, 0, false, runnable, 94));
        a0Var.p();
    }

    public final void k(@NotNull CaptionListItem captionListItem) {
        Ny0.c cVar = this.f107164l;
        if (cVar.b("onSetFlower")) {
            cVar.f17480f.flowerId = captionListItem.getId();
            if (cVar.b("saveCaptionTransform")) {
                cVar.f17479e.getFontSize();
                cVar.f17483j = cVar.f17479e.getBoundingRectangleVertices();
                cVar.f17484k = cVar.f17479e.getScaleX();
                cVar.f17485l = cVar.f17479e.getRotationZ();
            }
            CaptionInfo captionInfo = cVar.f17480f;
            if (captionInfo.captionAssetBean == null) {
                captionInfo.captionAssetBean = new CaptionAssetBean();
            }
            CaptionInfo captionInfo2 = cVar.f17480f;
            CaptionAssetBean captionAssetBean = captionInfo2.captionAssetBean;
            CaptionAssetBean captionAssetBean2 = captionListItem.captionAssetBean;
            captionAssetBean.captionRendererPackagePath = captionAssetBean2 != null ? captionAssetBean2.captionRendererPackagePath : null;
            if (captionInfo2.flowerId == -1) {
                h.a(captionAssetBean);
            }
            c.a aVar = UC0.c.f24618e;
            CaptionInfo captionInfo3 = cVar.f17480f;
            CaptionAssetBean captionAssetBean3 = captionInfo3.captionAssetBean;
            P50.p pVar = captionInfo3.timelineCaption;
            int i7 = captionInfo3.flowerId;
            aVar.getClass();
            if (captionAssetBean3 != null && pVar != null) {
                c.a.f(captionAssetBean3, pVar);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("renderer_id", String.valueOf(i7));
                pVar.addStatsExtraInfo(linkedHashMap);
            }
            CaptionInfo captionInfo4 = cVar.f17480f;
            P50.p pVar2 = captionInfo4.timelineCaption;
            if (pVar2 != null) {
                com.bilibili.studio.videoeditor.extension.h.c(pVar2, "caption_info", captionInfo4);
            }
            if (cVar.b("restoreCaptionTransform")) {
                PointF pointFD = Ny0.c.d(cVar.f17483j);
                PointF pointFD2 = Ny0.c.d(cVar.f17479e.getBoundingRectangleVertices());
                if (pointFD != null && pointFD2 != null && !Intrinsics.areEqual(pointFD, pointFD2)) {
                    cVar.f17479e.translateCaption(new PointF(pointFD.x - pointFD2.x, pointFD.y - pointFD2.y));
                }
                if (cVar.f17479e.getCaptionTranslation() != null) {
                    cVar.f17480f.pos = new BPointF(cVar.f17479e.getCaptionTranslation().x, cVar.f17479e.getCaptionTranslation().y);
                }
                float scaleX = cVar.f17479e.getScaleX();
                if (scaleX != 0.0f) {
                    float f7 = cVar.f17484k / scaleX;
                    P50.p pVar3 = cVar.f17479e;
                    pVar3.scaleCaption(f7, cVar.c(pVar3));
                }
                if (cVar.f17479e.getTextBoundingRect() != null) {
                    cVar.f17479e.rotateCaption((cVar.f17485l - cVar.f17479e.getRotationZ()) % 360);
                }
            }
            s();
            if (this.f107169q.f27447g) {
                return;
            }
            this.h.i();
        }
    }

    public final void l(int i7, @Nullable String str, boolean z6) {
        Ny0.c cVar = this.f107164l;
        if (cVar.b("onSetFont")) {
            if (cVar.f17479e != null && cVar.f17480f != null) {
                cVar.g(Boolean.valueOf(z6));
                if (str == null || str.length() == 0) {
                    cVar.f17479e.setFontByFilePath("");
                    cVar.f17480f.font = "";
                } else {
                    cVar.f17479e.setFontByFilePath(str);
                    cVar.f17480f.font = str;
                }
                cVar.f17480f.idFont = i7;
            }
            a.a.a(cx0.a.g, Integer.valueOf(i7), (Integer) null, (Float) null, (Integer) null, (Integer) null, (String) null, 62);
            s();
        }
    }

    public final void m(@Nullable Integer num, boolean z6, int i7) {
        Ny0.c cVar = this.f107164l;
        if (cVar.b("onSetFontColor")) {
            cVar.f();
            cVar.g(Boolean.valueOf(z6));
            if (num == null) {
                cVar.f17480f.color = null;
                cVar.f17479e.h((R50.h) null);
            } else {
                R50.h hVarE = h.e((Q50.a) cVar.f17479e.getExtension(), num.intValue());
                cVar.f17479e.h(hVarE);
                cVar.f17480f.color = new CaptionInfo.Color(hVarE.d(), hVarE.c(), hVarE.b(), hVarE.a());
            }
            cVar.f17480f.idFontColor = i7;
            a.a.a(cx0.a.g, (Integer) null, Integer.valueOf(i7), (Float) null, (Integer) null, (Integer) null, (String) null, 61);
            s();
        }
    }

    public final void n(int i7, int i8, boolean z6, boolean z7) {
        Ny0.c cVar = this.f107164l;
        if (cVar.b("onSetOutlineColor")) {
            cVar.g(Boolean.valueOf(z7));
            cVar.f17479e.setDrawOutline(z6);
            cVar.f17480f.drawOutLine = z6;
            if (z6) {
                R50.h hVarE = h.e((Q50.a) cVar.f17479e.getExtension(), i7);
                cVar.f17479e.a(hVarE);
                cVar.f17480f.outLineColor = new CaptionInfo.Color(hVarE.d(), hVarE.c(), hVarE.b(), hVarE.a());
                cVar.f17480f.idOutLineColor = i8;
            }
            a.a aVar = cx0.a.g;
            if (!z6) {
                i8 = -1;
            }
            a.a.a(aVar, (Integer) null, (Integer) null, (Float) null, Integer.valueOf(i8), (Integer) null, (String) null, 55);
            s();
        }
    }

    public final void o(int i7, boolean z6) {
        Ny0.c cVar = this.f107164l;
        if (cVar.b("onSetOutlineWidth")) {
            cVar.g(Boolean.valueOf(z6));
            P50.p pVar = cVar.f17479e;
            float f7 = i7;
            pVar.setOutlineWidth(f7);
            cVar.f17480f.outLineWidth = f7;
            a.a.a(cx0.a.g, (Integer) null, (Integer) null, (Float) null, (Integer) null, Integer.valueOf(i7), (String) null, 47);
            s();
        }
    }

    public final void p(@NotNull CaptionListItem captionListItem) {
        CaptionAssetBean captionAssetBean;
        Ny0.c cVar = this.f107164l;
        if (cVar.b("onSetTemplate")) {
            CaptionInfo captionInfo = cVar.f17480f;
            P50.p pVar = cVar.f17479e;
            CaptionAssetBean captionAssetBean2 = captionListItem.captionAssetBean;
            boolean z6 = (captionAssetBean2 == null || (captionAssetBean = captionInfo.captionAssetBean) == null || (Intrinsics.areEqual(captionAssetBean.captionStylePackageId, captionAssetBean2.captionStylePackageId) && Intrinsics.areEqual(captionInfo.captionAssetBean.captionContextPackageId, captionListItem.captionAssetBean.captionContextPackageId) && Intrinsics.areEqual(captionInfo.captionAssetBean.captionAnimationPackageId, captionListItem.captionAssetBean.captionAnimationPackageId) && Intrinsics.areEqual(captionInfo.captionAssetBean.captionOutAnimationPackageId, captionListItem.captionAssetBean.captionOutAnimationPackageId) && Intrinsics.areEqual(captionInfo.captionAssetBean.captionInAnimationPackageId, captionListItem.captionAssetBean.captionInAnimationPackageId) && Intrinsics.areEqual(captionInfo.captionAssetBean.captionRendererPackageId, captionListItem.captionAssetBean.captionRendererPackageId))) ? false : true;
            captionInfo.txtMax = captionListItem.getMax();
            captionInfo.captionAssetBean = captionListItem.captionAssetBean.m9883clone();
            captionInfo.tempType = captionListItem.getTempType();
            captionInfo.tempFormat = captionListItem.getTempFormat();
            captionInfo.idTmp = captionListItem.getId();
            captionInfo.tempDuration = captionListItem.getDuration();
            List boundingRectangleVertices = pVar.getBoundingRectangleVertices();
            float scaleX = pVar.getScaleX();
            float rotationZ = pVar.getRotationZ();
            captionInfo.captionScale = scaleX;
            captionInfo.rotation = rotationZ;
            if (z6) {
                captionInfo.drawOutLine = false;
                pVar.setDrawOutline(false);
            }
            CaptionInfo captionInfo2 = cVar.f17480f;
            if (captionInfo2.flowerId > 0) {
                captionInfo2.flowerId = -1;
            }
            if (captionInfo2.circleAnimId > 0) {
                captionInfo2.circleAnimId = -1;
            }
            if (captionInfo2.inAnimId > 0) {
                captionInfo2.inAnimId = -1;
            }
            if (captionInfo2.outAnimId > 0) {
                captionInfo2.outAnimId = -1;
            }
            if (UpperFawkesDeviceDecision.b()) {
                captionInfo.inAnimDuration = 1000;
                captionInfo.outAnimDuration = 1000;
                captionInfo.circleAnimDuration = 1000;
                int i7 = ((int) (captionInfo.outPoint - captionInfo.inPoint)) / 1000;
                CaptionAssetBean captionAssetBean3 = captionListItem.captionAssetBean;
                String str = captionAssetBean3 != null ? captionAssetBean3.captionInAnimationPackagePath : null;
                if (str != null && str.length() != 0) {
                    captionInfo.inAnimId = (int) captionListItem.getInAnimId();
                    captionInfo.inAnimDuration = RangesKt.coerceAtMost(1000, i7);
                }
                CaptionAssetBean captionAssetBean4 = captionListItem.captionAssetBean;
                String str2 = captionAssetBean4 != null ? captionAssetBean4.captionOutAnimationPackagePath : null;
                if (str2 != null && str2.length() != 0) {
                    captionInfo.outAnimId = (int) captionListItem.getOutAnimId();
                    captionInfo.outAnimDuration = RangesKt.coerceAtMost(1000, i7);
                }
                CaptionAssetBean captionAssetBean5 = captionListItem.captionAssetBean;
                String str3 = null;
                if (captionAssetBean5 != null) {
                    str3 = captionAssetBean5.captionAnimationPackagePath;
                }
                if (str3 != null && str3.length() != 0) {
                    captionInfo.circleAnimId = (int) captionListItem.getCircleAnimId();
                    captionInfo.circleAnimDuration = RangesKt.coerceAtMost(1000, i7);
                }
                if (captionInfo.inAnimId > 0 && captionInfo.outAnimId > 0 && captionInfo.inAnimDuration + captionInfo.outAnimDuration > i7) {
                    int i8 = i7 / 2;
                    captionInfo.inAnimDuration = i8;
                    captionInfo.outAnimDuration = i8;
                }
            }
            c.a.b(UC0.c.f24618e, captionInfo.captionAssetBean, captionInfo.timelineCaption, captionInfo.circleAnimDuration, captionInfo.inAnimDuration, captionInfo.outAnimDuration, captionInfo.idTmp);
            captionInfo.textBold = pVar.getBold();
            captionInfo.textItalic = pVar.getItalic();
            captionInfo.textUnderline = pVar.getUnderline();
            String fontPath = captionListItem.getFontPath();
            Integer fontId = captionListItem.getFontId();
            l(fontId != null ? fontId.intValue() : 0, fontPath, false);
            Integer fontColor = captionListItem.getFontColor();
            Integer fontColorId = captionListItem.getFontColorId();
            m(fontColor, false, fontColorId != null ? fontColorId.intValue() : 0);
            if (captionListItem.getOutlineColor() != null && captionListItem.getOutlineColorId() != null) {
                n(captionListItem.getOutlineColor().intValue(), captionListItem.getOutlineColorId().intValue(), true, false);
            }
            Integer outlineWidth = captionListItem.getOutlineWidth();
            o(outlineWidth != null ? outlineWidth.intValue() : 0, false);
            PointF pointFD = Ny0.c.d(boundingRectangleVertices);
            PointF pointFD2 = Ny0.c.d(pVar.getBoundingRectangleVertices());
            if (pointFD != null && pointFD2 != null && !Intrinsics.areEqual(pointFD, pointFD2)) {
                pVar.translateCaption(new PointF(pointFD.x - pointFD2.x, pointFD.y - pointFD2.y));
            }
            if (pVar.getCaptionTranslation() != null) {
                captionInfo.pos = new BPointF(pVar.getCaptionTranslation().x, pVar.getCaptionTranslation().y);
            }
            float scaleX2 = pVar.getScaleX();
            if (scaleX2 != 0.0f) {
                float f7 = captionInfo.captionScaleBeforeAutoAdjust;
                if (f7 > 0.0f) {
                    captionInfo.captionScale = f7;
                    captionInfo.captionScaleBeforeAutoAdjust = -1.0f;
                    scaleX = f7;
                }
                pVar.scaleCaption(scaleX / scaleX2, cVar.c(pVar));
            }
            if (pVar.getTextBoundingRect() != null) {
                pVar.rotateCaption((rotationZ - pVar.getRotationZ()) % 360);
            }
            com.bilibili.studio.videoeditor.extension.h.c(pVar, "caption_info", captionInfo);
            v(this.f107163k.m(pVar));
            e eVar = this.f107173u;
            if (eVar != null) {
                eVar.invoke(captionInfo);
            }
            if (this.f107169q.f27447g) {
                return;
            }
            this.h.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[PHI: r12
  0x0048: PHI (r12v1 boolean) = (r12v0 boolean), (r12v3 boolean) binds: [B:9:0x001f, B:15:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.b.q(int, java.lang.String):void");
    }

    @NotNull
    public final C5171d r() {
        Ny0.c cVar = this.f107164l;
        cVar.getClass();
        C5171d c5171d = new C5171d(0);
        CaptionInfo captionInfo = cVar.f17480f;
        c5171d.h = captionInfo;
        c5171d.f57122a = cVar.f17477c.f14983d.f13179b;
        if (captionInfo != null) {
            c5171d.f57123b = captionInfo.idTmp;
            c5171d.f57124c = captionInfo.idFont;
            c5171d.f57125d = captionInfo.idFontColor;
            c5171d.f57127f = captionInfo.captionScale;
            if (captionInfo.drawOutLine) {
                c5171d.f57128g = MathKt.roundToInt(captionInfo.outLineWidth);
                c5171d.f57126e = captionInfo.idOutLineColor;
            } else {
                c5171d.f57128g = 0;
                c5171d.f57126e = -1;
            }
        }
        return c5171d;
    }

    public final void s() {
        t tVar = this.f107163k;
        tVar.B();
        P50.p pVar = this.f107164l.f17479e;
        tVar.f14985f.x(pVar == null ? 0L : pVar.getInPoint());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(CaptionInfo captionInfo, int i7, boolean z6) {
        if (this.f107167o.f16513j) {
            EditVideoInfoUtils.throwDebugException("当前正在展示文字批量编辑页面，请使用 onClickConfirm 跳转");
            return;
        }
        if (this.f107168p.f16533i) {
            EditVideoInfoUtils.throwDebugException("当前正在展示贴纸批量编辑页面，请使用 onClickCaption 跳转");
            return;
        }
        this.f107177y = true;
        this.f107164l.i(true, this.f107163k.f14995q);
        this.f107166n.c(captionInfo);
        com.bilibili.studio.editor.moudle.editormain.usecase.captionmodule.fastsetting.a aVar = this.f107162j;
        aVar.getClass();
        aVar.f107150d.f107186d.m.setValue(new Gy0.a(true, false, new EditorCaptionLargeEditUseCase$updateCaptionLargeEditVisible$1(aVar)));
        i iVar = new i(this, 1);
        a0 a0Var = this.f107157d;
        a0Var.f13078e.j();
        MiddleControlUseCase middleControlUseCase = a0Var.f13081i;
        middleControlUseCase.o(false);
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        middleControlUseCase.l(bool, bool2);
        middleControlUseCase.j(false);
        ez0.f fVar = a0Var.f13077d;
        fVar.getClass();
        fVar.d(8);
        Hx.n nVar = a0Var.f13082j.f23141e;
        if (nVar != null) {
            nVar.invoke(bool2);
        }
        Sy0.a.H(a0Var.f13082j, EditorTrackLocationMode.LOCATION_MID_2_HIGH, BiliEditorTrackMode.TRACK_MODE_FOLD_EDIT, null, false, 12);
        ez0.a aVar2 = a0Var.f13074a;
        C1609e c1609e = (C1609e) aVar2.D.getValue();
        C1609e c1609e2 = c1609e;
        if (c1609e == null) {
            c1609e2 = new C1609e(false, null, null, -1, false, null, FragmentContainerModal.MODAL_FULL_SCREEN);
        }
        aVar2.D.setValue(C1609e.a(c1609e2, true, captionInfo, this.f107178z, i7, z6, iVar, 64));
        a0Var.o();
        g gVar = this.f107161i;
        gVar.f17498a.a(gVar.f17508l, "EditorCaptionSettingFastUseCase");
        Xz0.d.f28458a.getClass();
        HashMap map = new HashMap();
        Neurons.reportExposure$default(false, "creation.new-video-editor.subtitle-choose.0.show", map, (List) null, 8, (Object) null);
    }

    public final void u(int i7) {
        t tVar = this.f107163k;
        CaptionInfo captionInfoX = tVar.x();
        if (captionInfoX == null) {
            BLog.e("EditorCaptionSettingUseCase", "showCaptionSettingFragmentOtherTab fail,captionInfo == null");
        } else {
            t(captionInfoX, i7, false);
            tVar.I(captionInfoX);
        }
    }

    public final void v(float f7) {
        PH.c cVar;
        if (!this.f107177y || (cVar = this.f107171s) == null) {
            return;
        }
        cVar.invoke(Float.valueOf(f7));
    }
}
