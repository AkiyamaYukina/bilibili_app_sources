package com.bilibili.studio.editor.moudle.danmaku.ui;

import AC0.g;
import Cx0.f;
import Cx0.i;
import Cx0.k;
import Cx0.l;
import Cx0.m;
import Cx0.n;
import P50.q;
import P50.v;
import R50.A;
import R50.u;
import android.app.Application;
import android.graphics.PointF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.c;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.biz.interactionpanel.underway.LiveMultiPkUnderWayDialogFragment;
import com.bilibili.bililive.biz.interactionpanel.underway.LivePkCrossRoomPkUnderWayDialogFragment;
import com.bilibili.bililive.biz.interactionpanel.underway.UnderWayPanelClientProvider;
import com.bilibili.bplus.im.pblink.w;
import com.bilibili.campus.home.CampusViewModel;
import com.bilibili.campus.home.index.CampusIndexFragment;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.studio.editor.base.BiliEditorBaseFragment;
import com.bilibili.studio.editor.moudle.caption.v1.captionrect.CaptionRectV2;
import com.bilibili.studio.editor.moudle.common.AdsorbResult;
import com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment;
import com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuSettingFragment;
import com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuCreateInfo;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuItem;
import com.bilibili.studio.editor.moudle.danmaku.v1.DanmakuTypeItem;
import com.bilibili.studio.editor.moudle.danmaku.v1.EditorDanmakuInfo;
import com.bilibili.studio.editor.moudle.editormain.constans.EditorPage;
import com.bilibili.studio.editor.moudle.editormain.ui.BiliEditorMainActivity;
import com.bilibili.studio.editor.timeline.UpperLiveWindowExt;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.bilibili.studio.videoeditor.extension.h;
import com.bilibili.studio.videoeditor.ms.transition.TransitionInfo;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.EditorUsedFunctionUtil;
import com.bilibili.studio.videoeditor.util.U;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.widgets.material.BiliEditorMaterialTrackView;
import com.bilibili.studio.videoeditor.widgets.track.cover.BiliEditorTrackCoverCommonView;
import com.bilibili.studio.videoeditor.widgets.track.media.BiliEditorMediaTrackView;
import com.bilibili.studio.videoeditor.widgets.track.timeaxis.TimeAxisZoomView;
import com.bilibili.topix.interpretation.TopicSheetDialog;
import com.bilibili.upper.module.contribute.picker.v3.manager.sticktop2.AlbumTopOperateTipsManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mD0.InterfaceC7923b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import px0.b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/ui/BiliEditorDanmakuFragment.class */
public class BiliEditorDanmakuFragment extends BiliEditorBaseFragment implements Mw0.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zx0.c f106105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BiliEditorTrackCoverCommonView f106106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public BiliEditorMaterialTrackView f106107n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public px0.b f106108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public UpperLiveWindowExt f106109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f106110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f106111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f106112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f106113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f106114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f106115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TimeAxisZoomView f106116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public BiliEditorDanmakuSettingFragment f106117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public BiliEditorDanmakuListFragment f106118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f106119z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final ArrayList<Fragment> f106100A = new ArrayList<>();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final b f106101B = new b(this);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final c f106102C = new c(this);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final a f106103D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final i f106104E = new View.OnLayoutChangeListener(this) { // from class: Cx0.i

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorDanmakuFragment f1872a;

        {
            this.f1872a = this;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f1872a;
            if (i7 == i11 && i9 == i13 && i8 == i12 && i10 == i14) {
                return;
            }
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            cVar2.l();
        }
    };

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/ui/BiliEditorDanmakuFragment$a.class */
    public static final class a implements InterfaceC7923b {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // mD0.InterfaceC7923b
        public final List<mD0.a> a(List<mD0.a> list) {
            return CollectionsKt.sortedWith(list, ComparisonsKt.compareBy(new Function1[]{new n(0), new Object()}));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/ui/BiliEditorDanmakuFragment$b.class */
    public static final class b implements b.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorDanmakuFragment f106120a;

        public b(BiliEditorDanmakuFragment biliEditorDanmakuFragment) {
            this.f106120a = biliEditorDanmakuFragment;
        }

        @Override // px0.b.e
        public final void b(float f7, PointF pointF) {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[PHI: r4
  0x0067: PHI (r4v4 float) = (r4v1 float), (r4v2 float) binds: [B:15:0x0064, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // px0.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c() {
            /*
                r3 = this;
                r0 = r3
                com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment r0 = r0.f106120a
                zx0.c r0 = r0.f106105l
                r8 = r0
                r0 = r8
                r7 = r0
                r0 = r8
                if (r0 != 0) goto L1a
                java.lang.String r0 = "mPresenter"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
                r0 = 0
                r7 = r0
            L1a:
                r0 = r7
                P50.q r0 = r0.f
                r8 = r0
                r0 = r8
                if (r0 != 0) goto L29
                goto Lb8
            L29:
                r0 = r8
                float r0 = r0.getRotationZ()
                r5 = r0
                r0 = r5
                float r0 = java.lang.Math.abs(r0)
                r1 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L41
                r0 = r5
                float r0 = -r0
                r4 = r0
                goto L83
            L41:
                r0 = 90
                float r0 = (float) r0
                r6 = r0
                r0 = r5
                r1 = r6
                float r0 = r0 - r1
                r4 = r0
                r0 = r4
                float r0 = java.lang.Math.abs(r0)
                r1 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L59
                r0 = r4
                float r0 = -r0
                r4 = r0
                goto L83
            L59:
                r0 = r6
                r1 = r5
                float r0 = r0 + r1
                r4 = r0
                r0 = r4
                float r0 = java.lang.Math.abs(r0)
                r1 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L6d
            L67:
                r0 = r4
                float r0 = -r0
                r4 = r0
                goto L83
            L6d:
                r0 = r5
                r1 = 180(0xb4, float:2.52E-43)
                float r1 = (float) r1
                float r0 = r0 - r1
                r4 = r0
                r0 = r4
                float r0 = java.lang.Math.abs(r0)
                r1 = 1092616192(0x41200000, float:10.0)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 > 0) goto L81
                goto L67
            L81:
                r0 = r5
                r4 = r0
            L83:
                r0 = r4
                r1 = r5
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L8c
                goto La9
            L8c:
                r0 = r7
                r0.l()
                r0 = r7
                UC0.n r0 = r0.f16456e
                java.lang.Class r0 = r0.getClass()
                com.bilibili.studio.editor.timeline.i r0 = UC0.n.b()
                r8 = r0
                r0 = r8
                if (r0 == 0) goto La9
                r0 = r8
                r0.s()
            La9:
                r0 = r7
                com.bilibili.studio.editor.base.BiliEditorBaseFragment r0 = r0.f16454c
                com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment r0 = (com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment) r0
                ey0.c r0 = r0.f105685b
                r1 = 0
                r0.s(r1)
            Lb8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.danmaku.ui.BiliEditorDanmakuFragment.b.c():void");
        }

        @Override // px0.b.e
        public final void e(Pair pair, float f7, float f8) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106120a;
            px0.b bVar = biliEditorDanmakuFragment.f106108o;
            if (bVar != null) {
                float contentBottom = (bVar.getContentBottom() - bVar.getContentTop()) / 2.0f;
                float height = (bVar.getHeight() / 4.0f) - contentBottom;
                float height2 = ((bVar.getHeight() * 3) / 4.0f) + contentBottom;
                if (f8 > 0.0f && bVar.getContentTop() - f8 < height) {
                    f8 = bVar.getContentTop() - height;
                } else if (f8 < 0.0f && bVar.getContentBottom() - f8 > height2) {
                    f8 = bVar.getContentBottom() - height2;
                } else if (bVar.getContentBottom() - bVar.getContentTop() > bVar.getHeight()) {
                    f8 = 0.0f;
                }
                zx0.c cVar = biliEditorDanmakuFragment.f106105l;
                zx0.c cVar2 = cVar;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                    cVar2 = null;
                }
                cVar2.d(pair, 0.0f, f8);
            }
        }

        @Override // px0.b.e
        public final void f(float f7, PointF pointF, float f8, Pair<? extends AdsorbResult, Float> pair) {
        }

        @Override // px0.b.e
        public final void g(boolean z6, float f7, float f8, boolean z7) {
            Region regionC;
            Mw0.d dVar = this.f106120a.f106105l;
            Mw0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                dVar2 = null;
            }
            BiliEditorBaseFragment biliEditorBaseFragment = dVar2.f16454c;
            if (z6 && ((zx0.c) dVar2).f != null) {
                CaptionRectV2 captionRectV2O = ((BiliEditorDanmakuFragment) biliEditorBaseFragment).f105685b.o();
                if (captionRectV2O == null || !captionRectV2O.f125665o) {
                    dVar2.g();
                    return;
                }
                q qVar = ((zx0.c) dVar2).f;
                if (qVar != null) {
                    ((BiliEditorDanmakuFragment) dVar2.f16454c).Kf((EditorDanmakuInfo) h.a(qVar, "danmaku_info"));
                    return;
                }
                return;
            }
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = (BiliEditorDanmakuFragment) biliEditorBaseFragment;
            BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment = biliEditorDanmakuFragment.f106117x;
            if (biliEditorDanmakuSettingFragment == null || !biliEditorDanmakuSettingFragment.isVisible()) {
                dVar2.f16456e.getClass();
                UpperTimeline upperTimelineC = UC0.n.c();
                List<q> compoundCaptionsByTimelinePosition = upperTimelineC != null ? upperTimelineC.getCompoundCaptionsByTimelinePosition(dVar2.j()) : null;
                if (compoundCaptionsByTimelinePosition != null) {
                    for (q qVar2 : compoundCaptionsByTimelinePosition) {
                        List listJ = qVar2.j();
                        if (listJ != null && biliEditorDanmakuFragment.f105685b.p() != null && (regionC = px0.a.c(px0.a.a(biliEditorDanmakuFragment.f105685b.p(), listJ))) != null && regionC.contains((int) f7, (int) f8)) {
                            dVar2.g();
                            ((zx0.c) dVar2).f = qVar2;
                            biliEditorDanmakuFragment.Df((EditorDanmakuInfo) h.a(qVar2, "danmaku_info"));
                            dVar2.l();
                            return;
                        }
                    }
                }
            }
        }

        @Override // px0.b.e
        public final void h() {
            Mw0.d dVar = this.f106120a.f106105l;
            Mw0.d dVar2 = dVar;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                dVar2 = null;
            }
            dVar2.h();
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = (BiliEditorDanmakuFragment) dVar2.f16454c;
            BiliEditorDanmakuListFragment biliEditorDanmakuListFragment = biliEditorDanmakuFragment.f106118y;
            if (biliEditorDanmakuListFragment == null || !biliEditorDanmakuListFragment.isVisible()) {
                return;
            }
            biliEditorDanmakuFragment.Bf();
        }

        @Override // px0.b.e
        public final void j(PointF pointF, PointF pointF2, Pair<? extends AdsorbResult, ? extends AdsorbResult> pair) {
            float f7 = pointF.x;
            if (f7 != pointF2.x) {
                pointF2.x = f7;
            }
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106120a;
            px0.b bVar = biliEditorDanmakuFragment.f106108o;
            if (bVar != null) {
                float contentBottom = (bVar.getContentBottom() - bVar.getContentTop()) / 2.0f;
                float height = (bVar.getHeight() / 4.0f) - contentBottom;
                float height2 = ((bVar.getHeight() * 3) / 4.0f) + contentBottom;
                float f8 = pointF2.y - pointF.y;
                if (f8 < 0.0f && bVar.getContentTop() + f8 < height) {
                    pointF2.y = (height - bVar.getContentTop()) + pointF.y;
                } else if (f8 > 0.0f && bVar.getContentBottom() + f8 > height2) {
                    pointF2.y = (height2 - bVar.getContentBottom()) + pointF.y;
                }
                if (bVar.getContentBottom() - bVar.getContentTop() > bVar.getHeight()) {
                    pointF2.y = pointF.y;
                }
                zx0.c cVar = biliEditorDanmakuFragment.f106105l;
                zx0.c cVar2 = cVar;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                    cVar2 = null;
                }
                UpperLiveWindowExt upperLiveWindowExtP = ((BiliEditorDanmakuFragment) cVar2.f16454c).f105685b.p();
                if (upperLiveWindowExtP != null) {
                    PointF pointFMapViewToCanonicalX = upperLiveWindowExtP.mapViewToCanonicalX(pointF);
                    PointF pointFMapViewToCanonicalX2 = upperLiveWindowExtP.mapViewToCanonicalX(pointF2);
                    cVar2.d(pair, pointFMapViewToCanonicalX2.x - pointFMapViewToCanonicalX.x, pointFMapViewToCanonicalX2.y - pointFMapViewToCanonicalX.y);
                }
                pointF.y = pointF2.y;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/ui/BiliEditorDanmakuFragment$c.class */
    public static final class c implements mD0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f106121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliEditorDanmakuFragment f106122b;

        public c(BiliEditorDanmakuFragment biliEditorDanmakuFragment) {
            this.f106122b = biliEditorDanmakuFragment;
        }

        @Override // mD0.h
        public final void a() {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106122b;
            CaptionRectV2 captionRectV2O = biliEditorDanmakuFragment.f105685b.o();
            this.f106121a = captionRectV2O != null ? captionRectV2O.f125665o : false;
            if (biliEditorDanmakuFragment.f105690g) {
                biliEditorDanmakuFragment.jf();
            }
        }

        @Override // mD0.h
        public final void b(mD0.a aVar) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106122b;
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            if (cVar2.f == null) {
                BLog.e("materialLongPressUp: mCurrTimelineCaption cant be null");
            } else {
                EditorDanmakuInfo editorDanmakuInfo = aVar.g;
                BiliEditorDanmakuFragment biliEditorDanmakuFragment2 = (BiliEditorDanmakuFragment) cVar2.f16454c;
                long jHf = biliEditorDanmakuFragment2.Hf(aVar.c);
                long jHf2 = biliEditorDanmakuFragment2.Hf(aVar.d);
                if (cVar2.f(cVar2.f, jHf, jHf2) > 8) {
                    ToastHelper.showToastShort(biliEditorDanmakuFragment2.getContext(), biliEditorDanmakuFragment2.getString(2131841924));
                    biliEditorDanmakuFragment2.Ff(editorDanmakuInfo);
                    int iG = biliEditorDanmakuFragment2.Af().f125320c.g(cVar2.f.getInPoint());
                    int iDp2px = DensityUtil.dp2px(biliEditorDanmakuFragment2.getContext(), 1.0f);
                    BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonViewAf = biliEditorDanmakuFragment2.Af();
                    biliEditorTrackCoverCommonViewAf.f125320c.post(new pD0.a(biliEditorTrackCoverCommonViewAf, iDp2px + iG));
                } else {
                    if (jHf > cVar2.f.getOutPoint()) {
                        cVar2.f.changeOutPoint(jHf2);
                        cVar2.f.changeInPoint(jHf);
                    } else {
                        cVar2.f.changeInPoint(jHf);
                        cVar2.f.changeOutPoint(jHf2);
                    }
                    editorDanmakuInfo.inPoint = cVar2.f.getInPoint();
                    editorDanmakuInfo.outPoint = cVar2.f.getOutPoint();
                    BiliEditorMaterialTrackView biliEditorMaterialTrackView = biliEditorDanmakuFragment2.f106107n;
                    BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorMaterialTrackView;
                    if (biliEditorMaterialTrackView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
                        biliEditorMaterialTrackView2 = null;
                    }
                    biliEditorMaterialTrackView2.b();
                    long inPoint = cVar2.f.getInPoint();
                    long outPoint = cVar2.f.getOutPoint();
                    long j7 = cVar2.j();
                    if (inPoint > j7 || j7 > outPoint) {
                        cVar2.f = null;
                    } else {
                        biliEditorDanmakuFragment2.Df(editorDanmakuInfo);
                    }
                    cVar2.k(cVar2.j());
                    cVar2.l();
                }
            }
            int i7 = aVar.c;
            BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonViewAf2 = biliEditorDanmakuFragment.Af();
            biliEditorTrackCoverCommonViewAf2.f125320c.post(new pD0.a(biliEditorTrackCoverCommonViewAf2, i7));
        }

        @Override // mD0.h
        public final void c(mD0.a aVar) {
            q qVar;
            zx0.c cVar = this.f106122b.f106105l;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            boolean z6 = this.f106121a;
            cVar2.getClass();
            EditorDanmakuInfo editorDanmakuInfo = aVar.g;
            q qVar2 = cVar2.f;
            q qVarI = cVar2.i(editorDanmakuInfo);
            cVar2.f = qVarI;
            BiliEditorBaseFragment biliEditorBaseFragment = cVar2.f16454c;
            if (qVarI != null && z6 && Intrinsics.areEqual(qVar2, qVarI) && (qVar = cVar2.f) != null) {
                ((BiliEditorDanmakuFragment) biliEditorBaseFragment).Kf((EditorDanmakuInfo) h.a(qVar, "danmaku_info"));
            }
            cVar2.l();
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = (BiliEditorDanmakuFragment) biliEditorBaseFragment;
            if (aVar.c > biliEditorDanmakuFragment.Af().getIndicatorPos() || aVar.d < biliEditorDanmakuFragment.Af().getIndicatorPos()) {
                int i7 = aVar.c;
                int iDp2px = DensityUtil.dp2px(biliEditorDanmakuFragment.getContext(), 1.0f);
                BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonViewAf = biliEditorDanmakuFragment.Af();
                biliEditorTrackCoverCommonViewAf.f125320c.post(new pD0.a(biliEditorTrackCoverCommonViewAf, iDp2px + i7));
                biliEditorDanmakuFragment.Df(editorDanmakuInfo);
            }
        }

        @Override // mD0.h
        public final void d(mD0.a aVar) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106122b;
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            cVar2.getClass();
            q qVarI = cVar2.i(aVar.g);
            cVar2.f = qVarI;
            long inPoint = qVarI.getInPoint();
            long outPoint = cVar2.f.getOutPoint();
            long j7 = cVar2.j();
            if (inPoint <= j7 && j7 <= outPoint) {
                cVar2.l();
            }
            zx0.c cVar3 = biliEditorDanmakuFragment.f106105l;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar3 = null;
            }
            cVar3.n(biliEditorDanmakuFragment.Hf(aVar.c));
        }

        @Override // mD0.h
        public final void e(mD0.a aVar) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106122b;
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            cVar2.n(biliEditorDanmakuFragment.Hf(aVar.c));
        }

        @Override // mD0.h
        public final void f(mD0.a aVar, boolean z6) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106122b;
            BiliEditorMaterialTrackView biliEditorMaterialTrackView = biliEditorDanmakuFragment.f106107n;
            BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorMaterialTrackView;
            if (biliEditorMaterialTrackView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
                biliEditorMaterialTrackView2 = null;
            }
            int i7 = z6 ? aVar.c : aVar.d;
            BiliEditorMediaTrackView biliEditorMediaTrackView = biliEditorMaterialTrackView2.h;
            long jB = biliEditorMediaTrackView != null ? biliEditorMediaTrackView.b(i7) : 0L;
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar = null;
            }
            cVar.n(jB);
        }

        @Override // mD0.h
        public final void g(mD0.a aVar, boolean z6) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106122b;
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            BiliEditorMaterialTrackView biliEditorMaterialTrackView = null;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            if (cVar2.f == null) {
                BLog.e("materialHandleTouchUp: mCurrTimelineCaption cant be null");
            } else {
                EditorDanmakuInfo editorDanmakuInfo = aVar.g;
                BiliEditorDanmakuFragment biliEditorDanmakuFragment2 = (BiliEditorDanmakuFragment) cVar2.f16454c;
                if (cVar2.f(cVar2.f, biliEditorDanmakuFragment2.Hf(aVar.c), biliEditorDanmakuFragment2.Hf(aVar.d)) > 8) {
                    ToastHelper.showToastShort(biliEditorDanmakuFragment2.getContext(), biliEditorDanmakuFragment2.getString(2131841924));
                    biliEditorDanmakuFragment2.Ff(editorDanmakuInfo);
                    int iG = biliEditorDanmakuFragment2.Af().f125320c.g(cVar2.f.getInPoint());
                    int iDp2px = DensityUtil.dp2px(biliEditorDanmakuFragment2.getContext(), 1.0f);
                    BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonViewAf = biliEditorDanmakuFragment2.Af();
                    biliEditorTrackCoverCommonViewAf.f125320c.post(new pD0.a(biliEditorTrackCoverCommonViewAf, iDp2px + iG));
                } else {
                    if (z6) {
                        cVar2.f.changeInPoint(biliEditorDanmakuFragment2.Hf(aVar.c));
                        editorDanmakuInfo.inPoint = cVar2.f.getInPoint();
                    } else {
                        cVar2.f.changeOutPoint(biliEditorDanmakuFragment2.Hf(aVar.d));
                        editorDanmakuInfo.outPoint = cVar2.f.getOutPoint();
                    }
                    BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorDanmakuFragment2.f106107n;
                    if (biliEditorMaterialTrackView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
                    } else {
                        biliEditorMaterialTrackView = biliEditorMaterialTrackView2;
                    }
                    biliEditorMaterialTrackView.b();
                    cVar2.l();
                }
            }
            int i7 = z6 ? aVar.c : aVar.d;
            BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonViewAf2 = biliEditorDanmakuFragment.Af();
            biliEditorTrackCoverCommonViewAf2.f125320c.post(new pD0.a(biliEditorTrackCoverCommonViewAf2, i7));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/ui/BiliEditorDanmakuFragment$d.class */
    public static final class d implements BiliEditorDanmakuListFragment.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliEditorDanmakuFragment f106123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DanmakuTypeItem f106124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106125c;

        public d(BiliEditorDanmakuFragment biliEditorDanmakuFragment, DanmakuTypeItem danmakuTypeItem, String str) {
            this.f106123a = biliEditorDanmakuFragment;
            this.f106124b = danmakuTypeItem;
            this.f106125c = str;
        }

        @Override // com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment.a
        public final void a(int i7, long j7, String str, String str2) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106123a;
            biliEditorDanmakuFragment.Cf();
            biliEditorDanmakuFragment.Bf();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DanmakuTypeItem danmakuTypeItem = this.f106124b;
            DanmakuCreateInfo danmakuCreateInfoCreateInfo = DanmakuCreateInfo.createInfo(0, i7, str, str2, j7, this.f106125c, 0L, danmakuTypeItem != null ? danmakuTypeItem.assetPath : null, danmakuTypeItem != null ? danmakuTypeItem.assetLic : null, 10, danmakuTypeItem);
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar = null;
            }
            cVar.c(danmakuCreateInfoCreateInfo);
        }

        @Override // com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment.a
        public final void b(int i7, String str, DanmakuItem danmakuItem) {
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106123a;
            biliEditorDanmakuFragment.Cf();
            biliEditorDanmakuFragment.Bf();
            BLog.e("BiliEditorDanmakuFragment", "数据异常 type=" + i7 + ",typename=" + str + ",chosenItem=" + danmakuItem);
            if (danmakuItem == null || TextUtils.isEmpty(str)) {
                return;
            }
            String str2 = danmakuItem.title;
            String str3 = danmakuItem.desc;
            long j7 = danmakuItem.planStartTime;
            long j8 = danmakuItem.sid;
            DanmakuTypeItem danmakuTypeItem = this.f106124b;
            DanmakuCreateInfo danmakuCreateInfoCreateInfo = DanmakuCreateInfo.createInfo(1, i7, str2, str3, j7, str, j8, danmakuTypeItem != null ? danmakuTypeItem.assetPath : null, danmakuTypeItem != null ? danmakuTypeItem.assetLic : null, 10, danmakuTypeItem);
            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar = null;
            }
            cVar.c(danmakuCreateInfoCreateInfo);
        }

        @Override // com.bilibili.studio.editor.moudle.danmaku.setting.ui.BiliEditorDanmakuListFragment.a
        public final void c() {
            this.f106123a.Bf();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/danmaku/ui/BiliEditorDanmakuFragment$e.class */
    public static final class e implements BiliDanmakuEditorDialog.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditorDanmakuInfo f106126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliEditorDanmakuFragment f106127b;

        public e(EditorDanmakuInfo editorDanmakuInfo, BiliEditorDanmakuFragment biliEditorDanmakuFragment) {
            this.f106126a = editorDanmakuInfo;
            this.f106127b = biliEditorDanmakuFragment;
        }

        @Override // com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog.a
        public final void a(long j7, String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            EditorDanmakuInfo editorDanmakuInfo = this.f106126a;
            int i7 = editorDanmakuInfo.reverseType;
            BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f106127b;
            if (i7 != 2) {
                zx0.c cVar = biliEditorDanmakuFragment.f106105l;
                zx0.c cVar2 = cVar;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                    cVar2 = null;
                }
                cVar2.p(str, editorDanmakuInfo.subtitle, true, false, j7, 0L);
                return;
            }
            String strB = U.b(j7, U.f110219b);
            Application application = BiliContext.application();
            String strA = B0.a.a(strB, " ", application != null ? application.getString(2131842311) : null);
            zx0.c cVar3 = biliEditorDanmakuFragment.f106105l;
            zx0.c cVar4 = cVar3;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar4 = null;
            }
            cVar4.p(str, strA, true, true, j7, 0L);
        }

        @Override // com.bilibili.studio.editor.moudle.danmaku.input.BiliDanmakuEditorDialog.a
        public final void onCancel() {
        }
    }

    @NotNull
    public final BiliEditorTrackCoverCommonView Af() {
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView = this.f106106m;
        if (biliEditorTrackCoverCommonView != null) {
            return biliEditorTrackCoverCommonView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mTrackCoverView");
        return null;
    }

    public final void Bf() {
        if (this.f106118y == null) {
            BLog.e("BiliEditorDanmakuFragment", "hideSettingFragment:mDanmakuSettingFragment cant be null");
            return;
        }
        getChildFragmentManager().beginTransaction().hide(this.f106118y).commitNowAllowingStateLoss();
        this.f106100A.remove(this.f106118y);
        if (this.f106100A.isEmpty()) {
            View view = this.f106115v;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelBaseView");
                view2 = null;
            }
            view2.setVisibility(0);
        }
    }

    public final void Cf() {
        this.f105685b.A(true);
        v vVarP = this.f105685b.p();
        View view = null;
        if (vVarP != null) {
            vVarP.setOnClickListener(null);
        }
        if (this.f106117x == null) {
            BLog.e("BiliEditorDanmakuFragment", "hideSettingFragment:mDanmakuSettingFragment cant be null");
            return;
        }
        getChildFragmentManager().beginTransaction().hide(this.f106117x).commitNowAllowingStateLoss();
        this.f106100A.remove(this.f106117x);
        if (this.f106100A.isEmpty()) {
            View view2 = this.f106115v;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelBaseView");
            } else {
                view = view2;
            }
            view.setVisibility(0);
        }
    }

    public final void Df(@Nullable EditorDanmakuInfo editorDanmakuInfo) {
        BiliEditorMaterialTrackView biliEditorMaterialTrackView = this.f106107n;
        BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorMaterialTrackView;
        if (biliEditorMaterialTrackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
            biliEditorMaterialTrackView2 = null;
        }
        biliEditorMaterialTrackView2.setSelectedMaterial(null);
        boolean z6 = editorDanmakuInfo != null;
        View view = this.f106112s;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvChange");
            view2 = null;
        }
        view2.setEnabled(z6);
        View view3 = this.f106113t;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvEdit");
            view4 = null;
        }
        view4.setEnabled(z6);
        View view5 = this.f106114u;
        View view6 = view5;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDelete");
            view6 = null;
        }
        view6.setEnabled(z6);
        float f7 = z6 ? 1.0f : 0.6f;
        View view7 = this.f106112s;
        View view8 = view7;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvChange");
            view8 = null;
        }
        view8.setAlpha(f7);
        View view9 = this.f106113t;
        View view10 = view9;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvEdit");
            view10 = null;
        }
        view10.setAlpha(f7);
        View view11 = this.f106114u;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDelete");
            view11 = null;
        }
        view11.setAlpha(f7);
    }

    public final void Ef() {
        BiliEditorMaterialTrackView biliEditorMaterialTrackView = this.f106107n;
        BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorMaterialTrackView;
        if (biliEditorMaterialTrackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
            biliEditorMaterialTrackView2 = null;
        }
        ArrayList<mD0.a> materialList = biliEditorMaterialTrackView2.getMaterialList();
        if (materialList.isEmpty()) {
            return;
        }
        for (mD0.a aVar : materialList) {
            EditorDanmakuInfo editorDanmakuInfo = aVar.g;
            aVar.c = Af().f125320c.g(editorDanmakuInfo.inPoint);
            aVar.d = Af().f125320c.g(editorDanmakuInfo.outPoint);
        }
        BiliEditorMaterialTrackView biliEditorMaterialTrackView3 = this.f106107n;
        if (biliEditorMaterialTrackView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
            biliEditorMaterialTrackView3 = null;
        }
        biliEditorMaterialTrackView3.b();
    }

    public final void Ff(@NotNull EditorDanmakuInfo editorDanmakuInfo) {
        BiliEditorMaterialTrackView biliEditorMaterialTrackView = this.f106107n;
        BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorMaterialTrackView;
        if (biliEditorMaterialTrackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
            biliEditorMaterialTrackView2 = null;
        }
        for (mD0.a aVar : biliEditorMaterialTrackView2.getMaterialList()) {
            if (aVar.g.id == editorDanmakuInfo.id) {
                aVar.b = editorDanmakuInfo.trackName;
                aVar.c = Af().f125320c.g(editorDanmakuInfo.inPoint);
                aVar.d = Af().f125320c.g(editorDanmakuInfo.outPoint);
                BiliEditorMaterialTrackView biliEditorMaterialTrackView3 = this.f106107n;
                if (biliEditorMaterialTrackView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
                    biliEditorMaterialTrackView3 = null;
                }
                if (biliEditorMaterialTrackView3.f110475a.contains(aVar)) {
                    biliEditorMaterialTrackView3.b();
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Gf() {
        Mw0.d dVar = this.f106105l;
        Mw0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            dVar2 = null;
        }
        BiliEditorDanmakuFragment biliEditorDanmakuFragment = (BiliEditorDanmakuFragment) dVar2.f16454c;
        biliEditorDanmakuFragment.jf();
        biliEditorDanmakuFragment.f105685b.s(false);
        dVar2.f16456e.getClass();
        com.bilibili.studio.editor.timeline.i iVarB = UC0.n.b();
        if (iVarB != null) {
            iVarB.h = 0;
        }
        dVar2.o();
        EditVideoInfo editVideoInfo = dVar2.f16453b;
        if (!EditorUsedFunctionUtil.d(editVideoInfo, "互动工具")) {
            yx0.a aVar = dVar2.f16455d;
            if (EditorUsedFunctionUtil.g((List) aVar.f16450a, (List) aVar.f16451b)) {
                EditorUsedFunctionUtil.a(editVideoInfo, "互动工具");
            }
        }
        if (dVar2.f16455d.b()) {
            editVideoInfo.setDanmakuInfoList((List) dVar2.f16455d.f16451b);
            editVideoInfo.setIsEdited(true);
            Application application = BiliContext.application();
            if (application != null) {
                fC0.e.a(application, editVideoInfo);
            }
        }
        biliEditorDanmakuFragment.f105685b.u();
        ArrayList arrayList = (ArrayList) dVar2.f16455d.f16451b;
        if (arrayList == null || arrayList.isEmpty()) {
            Xz0.d.f28458a.getClass();
            Xz0.d.x(0L, "", "", true, false);
            return;
        }
        EditorDanmakuInfo editorDanmakuInfo = (EditorDanmakuInfo) arrayList.get(0);
        long j7 = editorDanmakuInfo.reverseType == 2 ? editorDanmakuInfo.reserveTime : 0L;
        Xz0.d dVar3 = Xz0.d.f28458a;
        String str = editorDanmakuInfo.text;
        boolean zIsNewCreate = editorDanmakuInfo.isNewCreate();
        String str2 = editorDanmakuInfo.trackName;
        dVar3.getClass();
        Xz0.d.x(j7, str, str2, zIsNewCreate, true);
    }

    public final long Hf(int i7) {
        return Af().f125320c.b(i7);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.FrameLayout, com.bilibili.studio.editor.timeline.UpperLiveWindowExt] */
    public final void If(@Nullable q qVar) {
        List<PointF> listA;
        if (this.f105688e) {
            zx0.c cVar = this.f106105l;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            cVar2.getClass();
            if (qVar == null) {
                px0.b bVar = this.f106108o;
                if (bVar != null) {
                    bVar.setDrawRect(null);
                    return;
                }
                return;
            }
            List listJ = qVar.j();
            if (listJ == null) {
                px0.b bVar2 = this.f106108o;
                if (bVar2 != null) {
                    bVar2.setVisibility(8);
                    return;
                }
                return;
            }
            px0.b bVar3 = this.f106108o;
            if (bVar3 != null) {
                bVar3.setVisibility(0);
            }
            ?? r02 = this.f106109p;
            if (r02 == 0) {
                listA = CollectionsKt.emptyList();
            } else {
                ViewParent parent = r02.getParent();
                RelativeLayout relativeLayout = null;
                if (parent instanceof RelativeLayout) {
                    relativeLayout = (RelativeLayout) parent;
                }
                listA = px0.c.a(relativeLayout, (UpperLiveWindowExt) r02, listJ);
            }
            px0.b bVar4 = this.f106108o;
            if (bVar4 != null) {
                bVar4.setDrawRect(listA);
            }
        }
    }

    public final void Jf(int i7, @NotNull String str, long j7, @Nullable DanmakuTypeItem danmakuTypeItem) {
        BiliEditorDanmakuListFragment biliEditorDanmakuListFragment = this.f106118y;
        if (biliEditorDanmakuListFragment == null || !biliEditorDanmakuListFragment.isVisible()) {
            BiliEditorDanmakuListFragment biliEditorDanmakuListFragmentXf = xf(j7);
            this.f106118y = biliEditorDanmakuListFragmentXf;
            biliEditorDanmakuListFragmentXf.f106086k = i7;
            biliEditorDanmakuListFragmentXf.f106087l = str;
            biliEditorDanmakuListFragmentXf.nf(true);
            biliEditorDanmakuListFragmentXf.of(true);
            getChildFragmentManager().beginTransaction().add(2131298614, this.f106118y, (String) null).commitNowAllowingStateLoss();
            BiliEditorDanmakuListFragment biliEditorDanmakuListFragment2 = this.f106118y;
            if (biliEditorDanmakuListFragment2 != null) {
                biliEditorDanmakuListFragment2.f106088m = new d(this, danmakuTypeItem, str);
            }
            View view = this.f106115v;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPanelBaseView");
                view = null;
            }
            view.setVisibility(8);
            this.f106100A.add(this.f106118y);
        }
    }

    public final void Kf(@NotNull EditorDanmakuInfo editorDanmakuInfo) {
        BiliDanmakuEditorDialog biliDanmakuEditorDialog = new BiliDanmakuEditorDialog();
        if (!editorDanmakuInfo.isNewCreate()) {
            wf();
            return;
        }
        String str = editorDanmakuInfo.text;
        biliDanmakuEditorDialog.f106072i = str;
        biliDanmakuEditorDialog.f106077n = editorDanmakuInfo.reverseType;
        biliDanmakuEditorDialog.m9896if(editorDanmakuInfo.titleLimit, str, true);
        biliDanmakuEditorDialog.f106076m = new e(editorDanmakuInfo, this);
        biliDanmakuEditorDialog.f106074k = editorDanmakuInfo.reserveTime;
        biliDanmakuEditorDialog.showNow(getChildFragmentManager(), "BiliDanmakuEditorDialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    public final void La(@NotNull Function1<? super Boolean, Unit> function1) {
        Mw0.d dVar = this.f106105l;
        Mw0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            dVar2 = null;
        }
        dVar2.o();
        EditVideoInfo editVideoInfo = dVar2.f16453b;
        if (!EditorUsedFunctionUtil.d(editVideoInfo, "互动工具")) {
            yx0.a aVar = dVar2.f16455d;
            if (EditorUsedFunctionUtil.g((List) aVar.f16450a, (List) aVar.f16451b)) {
                EditorUsedFunctionUtil.a(editVideoInfo, "互动工具");
            }
        }
        if (dVar2.f16455d.b()) {
            ((ArrayList) dVar2.f16455d.f16450a).clear();
            yx0.a aVar2 = dVar2.f16455d;
            ArrayList arrayList = (ArrayList) aVar2.f16450a;
            Iterable iterable = (Iterable) aVar2.f16451b;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EditorDanmakuInfo) it.next()).mo9886clone());
            }
            arrayList.addAll(arrayList2);
            editVideoInfo.setDanmakuInfoList((List) dVar2.f16455d.f16450a);
            editVideoInfo.setIsEdited(true);
        }
        function1.invoke(Boolean.TRUE);
    }

    public final void Lf(boolean z6) {
        View view = this.f106111r;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvAdd");
            view2 = null;
        }
        view2.setVisibility(z6 ? 0 : 8);
    }

    public final void Mf(boolean z6) {
        View view = this.f106112s;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvChange");
            view2 = null;
        }
        view2.setVisibility(z6 ? 0 : 8);
    }

    public final void Nf(boolean z6) {
        View view = this.f106114u;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDelete");
            view2 = null;
        }
        view2.setVisibility(z6 ? 0 : 8);
    }

    public final void Of(boolean z6) {
        View view = this.f106113t;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvEdit");
            view2 = null;
        }
        view2.setVisibility(z6 ? 0 : 8);
    }

    public final void Pf(int i7) {
        if (this.f106119z == i7) {
            return;
        }
        if (i7 == 0) {
            Lf(true);
            Mf(false);
            Nf(false);
            Of(false);
        } else if (i7 != 1) {
            Lf(false);
            Mf(false);
            Nf(true);
            Of(true);
        } else {
            Lf(false);
            Mf(true);
            Nf(true);
            Of(false);
        }
        this.f106119z = i7;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, fz0.InterfaceC7206a
    @Nullable
    public final EditVideoInfo Q0() {
        Mw0.d dVar = this.f106105l;
        Mw0.d dVar2 = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            dVar2 = null;
        }
        EditVideoInfo editVideoInfoM10450clone = dVar2.f16453b.m10450clone();
        dVar2.o();
        if (!EditorUsedFunctionUtil.d(editVideoInfoM10450clone, "互动工具")) {
            yx0.a aVar = dVar2.f16455d;
            if (EditorUsedFunctionUtil.g((List) aVar.f16450a, (List) aVar.f16451b)) {
                EditorUsedFunctionUtil.a(editVideoInfoM10450clone, "互动工具");
            }
        }
        editVideoInfoM10450clone.setDanmakuInfoList((List) dVar2.f16455d.f16451b);
        if (!V.e(editVideoInfoM10450clone.getDanmakuInfoList())) {
            editVideoInfoM10450clone.setIsEdited(true);
        }
        return editVideoInfoM10450clone;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void j8() {
        super.j8();
        px0.b bVar = this.f106108o;
        if (bVar != null) {
            bVar.setShowRect(true);
        }
        zx0.c cVar = this.f106105l;
        zx0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            cVar2 = null;
        }
        cVar2.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        u iVar;
        A aK;
        super.onCreate(bundle);
        zx0.c cVar = new zx0.c(this, this.f105686c);
        this.f106105l = cVar;
        cVar.f16456e.getClass();
        com.bilibili.studio.editor.timeline.i iVarB = UC0.n.b();
        P50.n nVarI = iVarB != null ? iVarB.i() : null;
        if (nVarI != null && (aK = ((R50.v) nVarI).k()) != null) {
            aK.b();
            aK.a();
        }
        cVar.f16456e.getClass();
        UpperTimeline upperTimelineC = UC0.n.c();
        UC0.d compoundCaption = upperTimelineC != null ? upperTimelineC.getCompoundCaption() : null;
        if (compoundCaption != null) {
            ArrayList arrayList = new ArrayList();
            R50.v vVar = compoundCaption.f24623b;
            if (vVar != null) {
                R50.v vVar2 = vVar;
                TimelineCompoundCaption firstCompoundCaption = vVar2.a.getFirstCompoundCaption();
                if (firstCompoundCaption != null) {
                    iVar = new R50.i(firstCompoundCaption);
                    iVar.c = firstCompoundCaption;
                } else {
                    iVar = null;
                }
                u iVar2 = iVar;
                if (iVar != null) {
                    while (iVar2 != null) {
                        EditorDanmakuInfo editorDanmakuInfo = (EditorDanmakuInfo) h.a(iVar2, "danmaku_info");
                        if (editorDanmakuInfo != null) {
                            editorDanmakuInfo.timelineCompoundCaption = iVar2;
                        }
                        arrayList.add(iVar2);
                        TimelineCompoundCaption nextCaption = vVar2.a.getNextCaption(iVar2.c);
                        if (nextCaption == null) {
                            iVar2 = null;
                        } else {
                            iVar2 = new R50.i(nextCaption);
                            iVar2.c = nextCaption;
                        }
                    }
                }
            }
            cVar.g = arrayList;
        }
        int i7 = 0;
        for (Object obj : (Iterable) cVar.f16455d.f16450a) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EditorDanmakuInfo editorDanmakuInfo2 = (EditorDanmakuInfo) obj;
            EditorDanmakuInfo editorDanmakuInfo3 = (EditorDanmakuInfo) ((ArrayList) cVar.f16455d.f16451b).get(i7);
            q qVarI = cVar.i(editorDanmakuInfo2);
            if (qVarI != null) {
                h.c(qVarI, "danmaku_info", editorDanmakuInfo3);
            }
            i7++;
        }
        this.f105687d.h = 2;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494054, viewGroup, false);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f105687d.h = 0;
        px0.b bVar = this.f106108o;
        BiliEditorMainActivity.a aVar = null;
        if (bVar != null) {
            bVar.setOnCaptionTouchListener(null);
        }
        px0.b bVar2 = this.f106108o;
        if (bVar2 != null) {
            ey0.c cVar = this.f105685b;
            if (cVar != null) {
                aVar = cVar.a.f106284X;
            }
            bVar2.setOnCommonTouchListener(aVar);
        }
        v vVar = this.f106109p;
        if (vVar != null) {
            vVar.removeOnLayoutChangeListener(this.f106104E);
        }
        zf(false);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        long j7;
        Object next;
        super.onViewCreated(view, bundle);
        this.f106108o = this.f105685b.o();
        this.f106109p = this.f105685b.p();
        this.f106107n = (BiliEditorMaterialTrackView) view.findViewById(2131307291);
        this.f106110q = view.findViewById(2131310728);
        ((TextView) view.findViewById(2131309694)).setText(2131842046);
        this.f106115v = view.findViewById(2131308635);
        this.f106111r = view.findViewById(2131314129);
        this.f106112s = view.findViewById(2131314278);
        this.f106113t = view.findViewById(2131314472);
        this.f106114u = view.findViewById(2131314418);
        this.f106116w = (TimeAxisZoomView) view.findViewById(2131313274);
        View view2 = this.f106111r;
        View view3 = view2;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvAdd");
            view3 = null;
        }
        final int i7 = 0;
        view3.setOnClickListener(new View.OnClickListener(this, i7) { // from class: Cx0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1857a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1858b;

            {
                this.f1857a = i7;
                this.f1858b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                switch (this.f1857a) {
                    case 0:
                        final BiliEditorDanmakuFragment biliEditorDanmakuFragment = (BiliEditorDanmakuFragment) this.f1858b;
                        biliEditorDanmakuFragment.getClass();
                        if (!V.c()) {
                            biliEditorDanmakuFragment.Af().getTrackView().f();
                            if (biliEditorDanmakuFragment.f105690g) {
                                biliEditorDanmakuFragment.jf();
                            }
                            Mw0.d dVar = biliEditorDanmakuFragment.f106105l;
                            Mw0.d dVar2 = dVar;
                            if (dVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                                dVar2 = null;
                            }
                            if (dVar2.f16456e != null) {
                                Mw0.d dVar3 = biliEditorDanmakuFragment.f106105l;
                                Mw0.d dVar4 = dVar3;
                                if (dVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                                    dVar4 = null;
                                }
                                dVar4.f16456e.getClass();
                                com.bilibili.studio.editor.timeline.i iVarB = UC0.n.b();
                                long j8 = iVarB != null ? iVarB.j() : 0L;
                                zx0.c cVar = biliEditorDanmakuFragment.f106105l;
                                zx0.c cVar2 = cVar;
                                if (cVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                                    cVar2 = null;
                                }
                                if (cVar2.e(j8, TransitionInfo.DEFAULT_DURATION + j8)) {
                                    biliEditorDanmakuFragment.f105685b.A(false);
                                    v vVarP = biliEditorDanmakuFragment.f105685b.p();
                                    if (vVarP != null) {
                                        final int i8 = 0;
                                        vVarP.setOnClickListener(new View.OnClickListener(i8, biliEditorDanmakuFragment) { // from class: Cx0.j

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final int f1873a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final androidx_fragment_app_Fragment f1874b;

                                            {
                                                this.f1873a = i8;
                                                this.f1874b = biliEditorDanmakuFragment;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view5) {
                                                switch (this.f1873a) {
                                                    case 0:
                                                        zx0.c cVar3 = ((BiliEditorDanmakuFragment) this.f1874b).f106105l;
                                                        zx0.c cVar4 = cVar3;
                                                        if (cVar3 == null) {
                                                            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                                                            cVar4 = null;
                                                        }
                                                        Handler handler = cVar4.h;
                                                        zx0.b bVar = cVar4.i;
                                                        handler.removeCallbacks(bVar);
                                                        bVar.run();
                                                        break;
                                                    default:
                                                        CampusIndexFragment campusIndexFragment = this.f1874b;
                                                        CampusViewModel.L0(campusIndexFragment.of(), false, campusIndexFragment.getCampusId(), (String) null, 5);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (biliEditorDanmakuFragment.f106117x == null) {
                                        biliEditorDanmakuFragment.f106117x = biliEditorDanmakuFragment.yf();
                                        biliEditorDanmakuFragment.getChildFragmentManager().beginTransaction().add(2131298614, biliEditorDanmakuFragment.f106117x, (String) null).commitNowAllowingStateLoss();
                                    } else {
                                        biliEditorDanmakuFragment.getChildFragmentManager().beginTransaction().show(biliEditorDanmakuFragment.f106117x).commitNowAllowingStateLoss();
                                    }
                                    BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment = biliEditorDanmakuFragment.f106117x;
                                    if (biliEditorDanmakuSettingFragment != null) {
                                        biliEditorDanmakuSettingFragment.f106094e = new p(biliEditorDanmakuFragment);
                                    }
                                    biliEditorDanmakuFragment.f106100A.add(biliEditorDanmakuSettingFragment);
                                    View view5 = biliEditorDanmakuFragment.f106115v;
                                    if (view5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mPanelBaseView");
                                        view5 = null;
                                    }
                                    view5.setVisibility(8);
                                }
                            }
                            break;
                        }
                        break;
                    case 1:
                        ((NR0.l) this.f1858b).a();
                        break;
                    default:
                        UnderWayPanelClientProvider clientProvider = ((LiveMultiPkUnderWayDialogFragment) this.f1858b).getClientProvider();
                        if (clientProvider != null) {
                            clientProvider.nextPk();
                        }
                        view4.setAlpha(0.3f);
                        view4.setClickable(false);
                        break;
                }
            }
        });
        View view4 = this.f106112s;
        View view5 = view4;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvChange");
            view5 = null;
        }
        view5.setOnClickListener(new Cx0.b(this, 0));
        View view6 = this.f106114u;
        View view7 = view6;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvDelete");
            view7 = null;
        }
        final int i8 = 0;
        view7.setOnClickListener(new View.OnClickListener(this, i8) { // from class: Cx0.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1862b;

            {
                this.f1861a = i8;
                this.f1862b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                switch (this.f1861a) {
                    case 0:
                        BiliEditorDanmakuFragment biliEditorDanmakuFragment = (BiliEditorDanmakuFragment) this.f1862b;
                        if (biliEditorDanmakuFragment.f105690g) {
                            biliEditorDanmakuFragment.jf();
                        }
                        zx0.c cVar = biliEditorDanmakuFragment.f106105l;
                        zx0.c cVar2 = cVar;
                        if (cVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                            cVar2 = null;
                        }
                        cVar2.h();
                        break;
                    case 1:
                        com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.c cVar3 = (com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.c) this.f1862b;
                        cVar3.b.invoke(new c.a.c(cVar3.a));
                        break;
                    default:
                        LivePkCrossRoomPkUnderWayDialogFragment livePkCrossRoomPkUnderWayDialogFragment = (LivePkCrossRoomPkUnderWayDialogFragment) this.f1862b;
                        LivePkCrossRoomPkUnderWayDialogFragment.CrossRoomPkIngPanelListener crossRoomPkIngPanelListener = livePkCrossRoomPkUnderWayDialogFragment.v;
                        if (crossRoomPkIngPanelListener != null) {
                            crossRoomPkIngPanelListener.onQuit();
                        }
                        LivePkCrossRoomPkUnderWayDialogFragment.CrossRoomPkIngPanelListener crossRoomPkIngPanelListener2 = livePkCrossRoomPkUnderWayDialogFragment.v;
                        if (crossRoomPkIngPanelListener2 != null) {
                            crossRoomPkIngPanelListener2.onHidePanel();
                        }
                        break;
                }
            }
        });
        View view8 = this.f106113t;
        View view9 = view8;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTvEdit");
            view9 = null;
        }
        final int i9 = 0;
        view9.setOnClickListener(new View.OnClickListener(this, i9) { // from class: Cx0.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1864b;

            {
                this.f1863a = i9;
                this.f1864b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                switch (this.f1863a) {
                    case 0:
                        BiliEditorDanmakuFragment biliEditorDanmakuFragment = (BiliEditorDanmakuFragment) this.f1864b;
                        biliEditorDanmakuFragment.getClass();
                        if (!V.c()) {
                            zx0.c cVar = biliEditorDanmakuFragment.f106105l;
                            zx0.c cVar2 = cVar;
                            if (cVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                                cVar2 = null;
                            }
                            q qVar = cVar2.f;
                            if (qVar != null) {
                                EditorDanmakuInfo editorDanmakuInfo = (EditorDanmakuInfo) com.bilibili.studio.videoeditor.extension.h.a(qVar, "danmaku_info");
                                biliEditorDanmakuFragment.Kf(editorDanmakuInfo);
                                Xz0.d dVar = Xz0.d.f28458a;
                                String str = editorDanmakuInfo.text;
                                boolean zIsNewCreate = editorDanmakuInfo.isNewCreate();
                                String str2 = editorDanmakuInfo.trackName;
                                dVar.getClass();
                                Xz0.d.w(str, str2, zIsNewCreate, false);
                            } else {
                                BLog.e("BiliEditorDanmakuFragment", " currTimelineCaption == null clickEditCaption error");
                            }
                            break;
                        }
                        break;
                    case 1:
                        TopicSheetDialog topicSheetDialog = (TopicSheetDialog) this.f1864b;
                        KProperty[] kPropertyArr = TopicSheetDialog.d;
                        topicSheetDialog.dismiss();
                        break;
                    case 2:
                        com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.c cVar3 = (com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.c) this.f1864b;
                        cVar3.b.invoke(new c.a.a(cVar3.a));
                        break;
                    default:
                        AlbumTopOperateTipsManager.b((AlbumTopOperateTipsManager) this.f1864b);
                        break;
                }
            }
        });
        view.findViewById(2131302459).setOnClickListener(new Cx0.e(this, 0));
        view.findViewById(2131302460).setOnClickListener(new f(this, 0));
        if (getView() != null) {
            ImageView imageView = (ImageView) getView().findViewById(2131302475);
            this.h = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new Mw0.b(this, 0));
            }
        }
        this.f106106m = (BiliEditorTrackCoverCommonView) view.findViewById(2131300944);
        this.f105691i = Af();
        px0.b bVar = this.f106108o;
        if (bVar != null) {
            bVar.setOnCaptionTouchListener(this.f106101B);
        }
        px0.b bVar2 = this.f106108o;
        if (bVar2 != null) {
            bVar2.setOnCommonTouchListener(null);
        }
        px0.b bVar3 = this.f106108o;
        if (bVar3 != null) {
            bVar3.setSupportAdsorb(true);
        }
        px0.b bVar4 = this.f106108o;
        if (bVar4 != null) {
            bVar4.setAdsorbProvide(new m(this));
        }
        v vVar = this.f106109p;
        if (vVar != null) {
            vVar.addOnLayoutChangeListener(this.f106104E);
        }
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonViewAf = Af();
        biliEditorTrackCoverCommonViewAf.f125329m.setVisibility(4);
        biliEditorTrackCoverCommonViewAf.setOnVideoControlListener((g) this.f105685b);
        EditVideoInfo editVideoInfo = this.f105686c;
        List<BClip> userTrackBClipList = editVideoInfo == null ? null : editVideoInfo.getUserTrackBClipList();
        if (userTrackBClipList == null) {
            userTrackBClipList = new ArrayList();
        }
        int iDp2px = DensityUtil.dp2px(getContext(), 44.0f);
        ArrayList<qD0.a> arrayList = new ArrayList<>();
        Iterator<BClip> it = userTrackBClipList.iterator();
        long duration = 0;
        while (true) {
            j7 = duration;
            if (!it.hasNext()) {
                break;
            } else {
                duration = j7 + it.next().getDuration(true);
            }
        }
        TimeAxisZoomView timeAxisZoomView = this.f106116w;
        TimeAxisZoomView timeAxisZoomView2 = timeAxisZoomView;
        if (timeAxisZoomView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeAxisView");
            timeAxisZoomView2 = null;
        }
        timeAxisZoomView2.setTotalDuration(j7);
        TimeAxisZoomView timeAxisZoomView3 = this.f106116w;
        TimeAxisZoomView timeAxisZoomView4 = timeAxisZoomView3;
        if (timeAxisZoomView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeAxisView");
            timeAxisZoomView4 = null;
        }
        long frameDuration = timeAxisZoomView4.getFrameDuration();
        for (BClip bClip : userTrackBClipList) {
            qD0.a aVar = new qD0.a();
            aVar.a(bClip, frameDuration, iDp2px);
            arrayList.add(aVar);
        }
        Af().setTrackData(arrayList);
        BiliEditorMaterialTrackView biliEditorMaterialTrackView = this.f106107n;
        BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorMaterialTrackView;
        if (biliEditorMaterialTrackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
            biliEditorMaterialTrackView2 = null;
        }
        biliEditorMaterialTrackView2.setColorFixed(ContextCompat.getColor(this.f105689f, 2131101379));
        biliEditorMaterialTrackView2.setColorLongPressOut(ContextCompat.getColor(this.f105689f, 2131104230));
        biliEditorMaterialTrackView2.setColorMaterialOut(-1);
        biliEditorMaterialTrackView2.setOnMaterialTouchListener(this.f106102C);
        biliEditorMaterialTrackView2.setMaterialSorter(this.f106103D);
        BiliEditorMediaTrackView trackView = Af().getTrackView();
        biliEditorMaterialTrackView2.h = trackView;
        trackView.f110533z.add(biliEditorMaterialTrackView2.f110473K);
        BiliEditorMaterialTrackView biliEditorMaterialTrackView3 = this.f106107n;
        BiliEditorMaterialTrackView biliEditorMaterialTrackView4 = biliEditorMaterialTrackView3;
        if (biliEditorMaterialTrackView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
            biliEditorMaterialTrackView4 = null;
        }
        biliEditorMaterialTrackView4.setShowHandle(false);
        zx0.c cVar = this.f106105l;
        zx0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            cVar2 = null;
        }
        if (!((ArrayList) cVar2.g).isEmpty()) {
            ArrayList<EditorDanmakuInfo> arrayList2 = new ArrayList();
            zx0.c cVar3 = this.f106105l;
            zx0.c cVar4 = cVar3;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar4 = null;
            }
            Iterator it2 = ((ArrayList) cVar4.g).iterator();
            while (it2.hasNext()) {
                EditorDanmakuInfo editorDanmakuInfo = (EditorDanmakuInfo) h.a((q) it2.next(), "danmaku_info");
                if (editorDanmakuInfo != null) {
                    arrayList2.add(editorDanmakuInfo);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (EditorDanmakuInfo editorDanmakuInfo2 : arrayList2) {
                mD0.a aVar2 = new mD0.a(0);
                aVar2.g = editorDanmakuInfo2;
                aVar2.b = editorDanmakuInfo2.trackName;
                aVar2.c = Af().f125320c.g(editorDanmakuInfo2.inPoint);
                aVar2.d = Af().f125320c.g(editorDanmakuInfo2.outPoint);
                arrayList3.add(aVar2);
            }
            BiliEditorMaterialTrackView biliEditorMaterialTrackView5 = this.f106107n;
            BiliEditorMaterialTrackView biliEditorMaterialTrackView6 = biliEditorMaterialTrackView5;
            if (biliEditorMaterialTrackView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
                biliEditorMaterialTrackView6 = null;
            }
            biliEditorMaterialTrackView6.setMaterialList(arrayList3);
        }
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonViewAf2 = Af();
        k kVar = new k(this);
        biliEditorTrackCoverCommonViewAf2.f125322e.add(kVar);
        kVar.b(biliEditorTrackCoverCommonViewAf2.f125330n);
        TimeAxisZoomView timeAxisZoomView5 = this.f106116w;
        TimeAxisZoomView timeAxisZoomView6 = timeAxisZoomView5;
        if (timeAxisZoomView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTimeAxisView");
            timeAxisZoomView6 = null;
        }
        timeAxisZoomView6.setGestureListener(new l(this));
        View view10 = this.f106110q;
        View view11 = view10;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTrackPanel");
            view11 = null;
        }
        view11.setOnTouchListener(new View.OnTouchListener(this) { // from class: Cx0.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliEditorDanmakuFragment f1871a;

            {
                this.f1871a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view12, MotionEvent motionEvent) {
                this.f1871a.Af().onTouchEvent(motionEvent);
                return true;
            }
        });
        BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView = this.f105691i;
        if (biliEditorTrackCoverCommonView != null) {
            int iG = biliEditorTrackCoverCommonView.f125320c.g(of());
            BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView2 = this.f105691i;
            if (biliEditorTrackCoverCommonView2 != null) {
                biliEditorTrackCoverCommonView2.f125320c.post(new pD0.a(biliEditorTrackCoverCommonView2, iG));
            }
        }
        Bundle arguments = getArguments();
        DanmakuCreateInfo danmakuCreateInfo = arguments != null ? (DanmakuCreateInfo) arguments.getParcelable("create_danmaku") : null;
        zx0.c cVar5 = this.f106105l;
        zx0.c cVar6 = cVar5;
        if (cVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            cVar6 = null;
        }
        if (((ArrayList) cVar6.g).isEmpty()) {
            Pf(0);
            if (danmakuCreateInfo != null) {
                final DanmakuCreateInfo danmakuCreateInfo2 = danmakuCreateInfo;
                Af().post(new Runnable(this, danmakuCreateInfo2) { // from class: Cx0.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final BiliEditorDanmakuFragment f1869a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final DanmakuCreateInfo f1870b;

                    {
                        this.f1869a = this;
                        this.f1870b = danmakuCreateInfo2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BiliEditorDanmakuFragment biliEditorDanmakuFragment = this.f1869a;
                        DanmakuCreateInfo danmakuCreateInfo3 = this.f1870b;
                        zx0.c cVar7 = biliEditorDanmakuFragment.f106105l;
                        zx0.c cVar8 = cVar7;
                        if (cVar7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                            cVar8 = null;
                        }
                        cVar8.c(danmakuCreateInfo3);
                    }
                });
            }
        } else {
            long jOf = of();
            zx0.c cVar7 = this.f106105l;
            zx0.c cVar8 = cVar7;
            if (cVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar8 = null;
            }
            List list = cVar8.g;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : (ArrayList) list) {
                q qVar = (q) obj;
                long inPoint = qVar.getInPoint();
                if (jOf <= qVar.getOutPoint() && inPoint <= jOf) {
                    arrayList4.add(obj);
                }
            }
            Iterator it3 = arrayList4.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    long j8 = ((EditorDanmakuInfo) h.a((q) next, "danmaku_info")).id;
                    Object obj2 = next;
                    do {
                        Object next2 = it3.next();
                        long j9 = ((EditorDanmakuInfo) h.a((q) next2, "danmaku_info")).id;
                        long j10 = j8;
                        next = obj2;
                        if (j8 < j9) {
                            next = next2;
                            j10 = j9;
                        }
                        j8 = j10;
                        obj2 = next;
                    } while (it3.hasNext());
                }
            } else {
                next = null;
            }
            q qVar2 = (q) next;
            if (qVar2 != null) {
                Mw0.d dVar = this.f106105l;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                    dVar = null;
                }
                ((zx0.c) dVar).f = qVar2;
                ((BiliEditorDanmakuFragment) dVar.f16454c).Df((EditorDanmakuInfo) h.a(qVar2, "danmaku_info"));
                EditorDanmakuInfo editorDanmakuInfo3 = (EditorDanmakuInfo) h.a(qVar2, "danmaku_info");
                if (editorDanmakuInfo3 == null || !editorDanmakuInfo3.isNewCreate()) {
                    Pf(1);
                } else {
                    Pf(2);
                }
            }
            BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView3 = this.f105691i;
            if (biliEditorTrackCoverCommonView3 != null) {
                int iG2 = biliEditorTrackCoverCommonView3.f125320c.g(of());
                BiliEditorTrackCoverCommonView biliEditorTrackCoverCommonView4 = this.f105691i;
                if (biliEditorTrackCoverCommonView4 != null) {
                    biliEditorTrackCoverCommonView4.f125320c.post(new pD0.a(biliEditorTrackCoverCommonView4, iG2));
                }
            }
        }
        zf(true);
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void vd() {
        super.vd();
        px0.b bVar = this.f106108o;
        if (bVar != null) {
            bVar.setShowRect(true);
        }
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void w2(long j7) {
        super.w2(j7);
        BiliEditorDanmakuSettingFragment biliEditorDanmakuSettingFragment = this.f106117x;
        if (biliEditorDanmakuSettingFragment == null || !biliEditorDanmakuSettingFragment.isVisible()) {
            zx0.c cVar = this.f106105l;
            zx0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar2 = null;
            }
            cVar2.k(j7);
            px0.b bVar = this.f106108o;
            if (bVar != null) {
                bVar.setShowRect(false);
            }
        }
    }

    public final void wf() {
        zx0.c cVar = this.f106105l;
        zx0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            cVar2 = null;
        }
        if (cVar2.f == null) {
            return;
        }
        Af().getTrackView().f();
        if (this.f105690g) {
            jf();
        }
        zx0.c cVar3 = this.f106105l;
        zx0.c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
            cVar4 = null;
        }
        q qVar = cVar4.f;
        Object objA = null;
        if (qVar != null) {
            objA = h.a(qVar, "danmaku_info");
        }
        EditorDanmakuInfo editorDanmakuInfo = (EditorDanmakuInfo) objA;
        Jf(editorDanmakuInfo.reverseType, editorDanmakuInfo.trackName, editorDanmakuInfo.reserveId, editorDanmakuInfo.typeItem);
        Xz0.d dVar = Xz0.d.f28458a;
        String str = editorDanmakuInfo.text;
        boolean zIsNewCreate = editorDanmakuInfo.isNewCreate();
        String str2 = editorDanmakuInfo.trackName;
        dVar.getClass();
        Xz0.d.w(str, str2, zIsNewCreate, true);
    }

    @NotNull
    public BiliEditorDanmakuListFragment xf(long j7) {
        Bundle bundleA = w.a(j7, "select_id");
        BiliEditorDanmakuListFragment biliEditorDanmakuListFragment = new BiliEditorDanmakuListFragment();
        biliEditorDanmakuListFragment.setArguments(bundleA);
        return biliEditorDanmakuListFragment;
    }

    @NotNull
    public BiliEditorDanmakuSettingFragment yf() {
        return new BiliEditorDanmakuSettingFragment();
    }

    @Override // fz0.InterfaceC7206a
    @NotNull
    public final EditorPage z0() {
        return EditorPage.DANMAKU;
    }

    @Override // com.bilibili.studio.editor.base.BiliEditorBaseFragment, aC0.InterfaceC3194a
    public final void z4(long j7, long j8) {
        int i7;
        BiliEditorMaterialTrackView biliEditorMaterialTrackView = this.f106107n;
        BiliEditorMaterialTrackView biliEditorMaterialTrackView2 = biliEditorMaterialTrackView;
        if (biliEditorMaterialTrackView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMaterialView");
            biliEditorMaterialTrackView2 = null;
        }
        mD0.a selectMaterial = biliEditorMaterialTrackView2.getSelectMaterial();
        if (selectMaterial == null || !((i7 = selectMaterial.a) == 2 || i7 == 1)) {
            super.z4(j7, j8);
            zx0.c cVar = this.f106105l;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
                cVar = null;
            }
            cVar.k(j7);
        }
    }

    public final void zf(boolean z6) {
        if (z6) {
            CaptionRectV2 captionRectV2O = this.f105685b.o();
            if (captionRectV2O != null) {
                captionRectV2O.setCanDragHorizontal(false);
            }
            CaptionRectV2 captionRectV2O2 = this.f105685b.o();
            if (captionRectV2O2 != null) {
                captionRectV2O2.setCanScaleAndRotate(false);
                return;
            }
            return;
        }
        CaptionRectV2 captionRectV2O3 = this.f105685b.o();
        if (captionRectV2O3 != null) {
            captionRectV2O3.setCanDragHorizontal(true);
        }
        CaptionRectV2 captionRectV2O4 = this.f105685b.o();
        if (captionRectV2O4 != null) {
            captionRectV2O4.setCanScaleAndRotate(true);
        }
    }
}
