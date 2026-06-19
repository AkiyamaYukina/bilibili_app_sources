package com.bilibili.studio.videoeditor.capturev3.fragment;

import By0.A1;
import By0.C1443b1;
import By0.C1449d1;
import By0.C1467j1;
import By0.C1470k1;
import By0.C1473l1;
import By0.C1476m1;
import By0.C1499u1;
import By0.C1502v1;
import By0.C1505w1;
import By0.C1508x1;
import By0.I0;
import By0.J0;
import By0.K0;
import By0.M0;
import By0.N0;
import By0.O0;
import By0.P0;
import By0.Z0;
import By0.y1;
import By0.z1;
import Di0.C1600d;
import Ef.x;
import F3.O1;
import Fx.u;
import JB0.C;
import JB0.C2401b;
import JB0.InterfaceC2400a;
import JB0.m;
import LR0.l;
import NB0.A;
import NB0.C2689g;
import NB0.C2691i;
import NB0.C2695m;
import NB0.C2696n;
import NB0.C2697o;
import NB0.C2698p;
import NB0.C2700s;
import NB0.C2704w;
import NB0.F;
import NB0.G;
import NB0.InterfaceC2703v;
import NB0.L;
import NB0.P;
import NB0.ViewOnClickListenerC2701t;
import NB0.a0;
import NB0.b0;
import NB0.c0;
import NB0.f0;
import QB0.h;
import QB0.k;
import TB0.M;
import Yv0.c;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.v;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.C4618g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import c6.Q;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.ad.adview.pegasus.holders.inline.player.egg.eggpicture.StarEggPictureStyle2Activity;
import com.bilibili.app.authorspace.ui.pages.AuthorSeasonVideoFragment;
import com.bilibili.base.BiliContext;
import com.bilibili.bililive.room.biz.shopping.dialog.g;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.t0;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.fasthybrid.biz.settings.MessageSubscribeFragment;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.infoeyes.InfoEyesManager;
import com.bilibili.lib.mod.ModResourceClient;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.moduleservice.account.AccountService;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.privacy.PrivacyHelper;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.n;
import com.bilibili.studio.base.BaseVMFragment;
import com.bilibili.studio.centerplus.model.CenterPlusViewModel;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.ui.CenterPlusMainActivity;
import com.bilibili.studio.centerplus.widgets.GeneralModLoadingView2;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import com.bilibili.studio.videoeditor.C6597e;
import com.bilibili.studio.videoeditor.EditManager;
import com.bilibili.studio.videoeditor.bean.SelectVideo;
import com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.bean.CaptureSticker;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureBeautyEntity;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureMakeupEntity;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureTemplateEntity;
import com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3;
import com.bilibili.studio.videoeditor.capturev3.data.VideoClipRecordInfo;
import com.bilibili.studio.videoeditor.capturev3.dialog.ModMaskDialog;
import com.bilibili.studio.videoeditor.capturev3.draft.CaptureActionBean;
import com.bilibili.studio.videoeditor.capturev3.draft.CaptureCooperateBean;
import com.bilibili.studio.videoeditor.capturev3.draft.CaptureDraftBean;
import com.bilibili.studio.videoeditor.capturev3.draft.ClipBean;
import com.bilibili.studio.videoeditor.capturev3.filter.FilterListItemV3;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.logic.Accelerometer;
import com.bilibili.studio.videoeditor.capturev3.logic.CaptureRecordManager;
import com.bilibili.studio.videoeditor.capturev3.logic.d;
import com.bilibili.studio.videoeditor.capturev3.logic.i;
import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.capturev3.widget.CaptureFocusExposureView;
import com.bilibili.studio.videoeditor.capturev3.widget.CaptureScaleProgressBar;
import com.bilibili.studio.videoeditor.capturev3.widget.FTPlayView;
import com.bilibili.studio.videoeditor.event.EventFinishEdit;
import com.bilibili.studio.videoeditor.loader.ImageItem;
import com.bilibili.studio.videoeditor.lrc.LrcListView;
import com.bilibili.studio.videoeditor.media.base.opengl.GLTextureView;
import com.bilibili.studio.videoeditor.ms.filter.FilterInfo;
import com.bilibili.studio.videoeditor.util.C6628a;
import com.bilibili.studio.videoeditor.util.C6629b;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import com.bilibili.studio.videoeditor.util.J;
import com.bilibili.studio.videoeditor.util.V;
import com.bilibili.studio.videoeditor.widgets.PictureEdgeView;
import com.bilibili.xpref.Xpref;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.behavior.ui.UIBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import kntr.base.utils.foundation.RomUtils;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import lB0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.C8397q;
import tv.danmaku.android.log.BLog;
import tv.danmaku.android.util.WeakHandler;
import tv.danmaku.bili.ui.main2.W;
import vB0.b;
import wB0.e;
import xB0.f;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/IndependentCaptureFragment.class */
public class IndependentCaptureFragment<VM extends Yv0.c> extends BaseCaptureFragment<IndependentCaptureViewModel> implements C2689g.a, ViewOnClickListenerC2701t.a, A.a {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f109161L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public G f109162A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public F f109163B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public ViewOnClickListenerC2701t f109164C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public L f109165D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public C2700s f109166E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public f0 f109167F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public A f109168G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public LB0.a f109170I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public a.a f109173v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public a.a f109174w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public ViewBinding f109175x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public C2689g f109176y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public InterfaceC2703v f109177z;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final Lazy f109169H = LazyKt.lazy(new Z50.F(this, 3));

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final g f109171J = new g(1, this);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final t0 f109172K = new t0(1, this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/IndependentCaptureFragment$a.class */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment] */
        @NotNull
        public static IndependentCaptureFragment a(@Nullable Bundle bundle, boolean z6, @Nullable String str, boolean z7) {
            ?? independentCaptureFragment = new IndependentCaptureFragment();
            Bundle bundle2 = bundle;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("is_new_ui", z6);
            bundle2.putBoolean("selectVideoList", z7);
            if (str != null && str.length() != 0) {
                bundle2.putString(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str);
            }
            independentCaptureFragment.setArguments(bundle2);
            return independentCaptureFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/IndependentCaptureFragment$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IndependentCaptureFragment<VM> f109178a;

        public b(IndependentCaptureFragment<VM> independentCaptureFragment) {
            this.f109178a = independentCaptureFragment;
        }

        public final void a(String str) {
            defpackage.a.b("initFaceFx.onStickerLoadFail...path = ", str, "IndependentCaptureFragment");
        }

        public final void b(String str) {
            com.bilibili.studio.videoeditor.capturev3.logic.g gVar;
            defpackage.a.b("initFaceFx.onStickerLoadFinish...path = ", str, "IndependentCaptureFragment");
            IndependentCaptureFragment<VM> independentCaptureFragment = this.f109178a;
            IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment).b;
            if (independentCaptureViewModel != null) {
                com.bilibili.studio.videoeditor.capturev3.logic.g gVar2 = independentCaptureViewModel.f109310w;
                if (gVar2 != null ? gVar2.f109239l : false) {
                    independentCaptureFragment.zh();
                    independentCaptureFragment.uh();
                    IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment).b;
                    if (independentCaptureViewModel2 == null || (gVar = independentCaptureViewModel2.f109310w) == null) {
                        return;
                    }
                    gVar.f109239l = false;
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/IndependentCaptureFragment$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IndependentCaptureFragment<VM> f109179a;

        public c(IndependentCaptureFragment<VM> independentCaptureFragment) {
            this.f109179a = independentCaptureFragment;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/IndependentCaptureFragment$d.class */
    public static final /* synthetic */ class d implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f109180a;

        public d(Function1 function1) {
            this.f109180a = function1;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f109180a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f109180a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0254  */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.ViewModel, com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel] */
    /* JADX WARN: Type inference failed for: r0v233, types: [java.lang.Object, uB0.b] */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Af() {
        /*
            Method dump skipped, instruction units count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.Af():void");
    }

    public final long Ag() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.f109302o.g : 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ah() {
        ViewGroup viewGroup;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            qB0.b bVar = independentCaptureViewModel.f109302o;
            boolean z6 = bVar.g > 0;
            int i7 = bVar.i;
            String str = independentCaptureViewModel.f109314c;
            boolean z7 = independentCaptureViewModel.f109303p.f;
            ImageItem imageItem = (ImageItem) independentCaptureViewModel.f109301n.i.getValue();
            boolean z8 = ((float) bVar.g) / 1000000.0f >= 5.0f;
            ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
            if (viewOnClickListenerC2701t != null) {
                viewOnClickListenerC2701t.g(z6, i7, str, z7, imageItem, z8);
            }
            if (!bVar.e && !z6 && !independentCaptureViewModel.s1() && (viewGroup = Xf().f109268e) != null) {
                viewGroup.setEnabled(true);
                viewGroup.setAlpha(1.0f);
            }
            independentCaptureViewModel.g1().seekTo(bVar.g / ((long) 1000));
            Bh(bVar.g, z6);
            yB0.d dVar = this.f109108g;
            if (dVar != null) {
                dVar.a(z6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a0  */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Bf() {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.Bf():boolean");
    }

    public final int Bg() {
        C2689g c2689g = this.f109176y;
        return c2689g != null ? c2689g.f16871b : 0;
    }

    public void Bh(long j7, boolean z6) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C3() {
        CaptureSchema.MissionInfo missionInfo;
        if (p3() == null) {
            return;
        }
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        Integer numValueOf = null;
        String strM1 = independentCaptureViewModel != null ? independentCaptureViewModel.m1() : null;
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            CaptureSchema captureSchema = independentCaptureViewModel2.f109302o.a;
            numValueOf = Integer.valueOf((captureSchema == null || (missionInfo = captureSchema.getMissionInfo()) == null) ? 0 : missionInfo.getMissionId());
        }
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.U0(numValueOf, strM1);
        }
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null) {
            Bundle bundle = this.f109117q;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Bundle bundleE1 = independentCaptureViewModel3.e1(bundle);
            RouteRequest.Builder builderAddFlag = new RouteRequest.Builder(Uri.parse("activity://uper/album/")).extras(new J31.b(bundleE1, 2)).addFlag(BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER);
            qB0.b bVar = independentCaptureViewModel3.f109302o;
            if (bVar.e) {
                bundleE1.putBoolean("show_drafts", false);
                bundleE1.putBoolean("selectVideoList", true);
                builderAddFlag.requestCode(1);
            }
            BLRouter.routeTo(builderAddFlag.build(), fragmentActivityRequireActivity);
            fragmentActivityRequireActivity.overridePendingTransition(2130771988, 0);
            bVar.k = true;
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Cf() {
        i iVar;
        LC0.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null || (aVar = iVar.f109252a) == null) {
            return;
        }
        aVar.p0(new b(this));
        aVar.i(new c(this));
        aVar.d(new f(this));
        aVar.o(new xB0.g(this, aVar));
    }

    public final int Cg() {
        C2689g c2689g = this.f109176y;
        return c2689g != null ? c2689g.f16870a : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [QB0.h, android.view.GestureDetector$OnGestureListener, android.view.View$OnTouchListener, java.lang.Object] */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Df() {
        Context context;
        CaptureFocusExposureView captureFocusExposureView;
        Application application;
        RelativeLayout relativeLayout;
        final F f7 = this.f109163B;
        if (f7 != null) {
            ViewBinding viewBinding = this.f109175x;
            if (viewBinding instanceof M) {
                M m7 = (M) viewBinding;
                context = m7.f23599H.getContext();
                captureFocusExposureView = m7.f23599H;
            } else if (viewBinding instanceof TB0.L) {
                TB0.L l7 = (TB0.L) viewBinding;
                context = l7.f23539E.getContext();
                captureFocusExposureView = l7.f23539E;
            } else {
                context = null;
                captureFocusExposureView = null;
            }
            if (context == null || captureFocusExposureView == null) {
                return;
            }
            if (f7.f16774c == null) {
                SurfaceView surfaceView = new SurfaceView(context);
                surfaceView.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                RelativeLayout relativeLayout2 = f7.f16772a;
                if (relativeLayout2 != null) {
                    relativeLayout2.addView(surfaceView, 0, layoutParams);
                }
                ?? obj = new Object();
                obj.f19763f = true;
                obj.f19764g = false;
                obj.h = true;
                obj.f19765i = 0.0f;
                obj.f19766j = 0.0f;
                obj.f19767k = 0.0f;
                obj.f19768l = 0.0f;
                obj.f19769m = 0;
                obj.f19770n = 1;
                obj.f19771o = true;
                obj.f19772p = 0.0f;
                obj.f19758a = surfaceView;
                boolean zIsHarmony = RomUtils.isHarmony();
                obj.f19764g = zIsHarmony;
                if (zIsHarmony) {
                    obj.f19758a.getHolder().addCallback(new QB0.g(obj));
                }
                obj.f19758a.setOnTouchListener(obj);
                obj.f19762e = new GestureDetector(context, (GestureDetector.OnGestureListener) obj);
                f7.f16774c = obj;
                Application application2 = BiliContext.application();
                if (application2 != null && application2.getResources().getConfiguration().smallestScreenWidthDp >= 600 && (application = BiliContext.application()) != null && (application.getResources().getConfiguration().screenLayout & 15) >= 3 && (relativeLayout = f7.f16773b) != null) {
                    final int i7 = 0;
                    relativeLayout.post(new Runnable(f7, i7) { // from class: NB0.D

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f16768a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f16769b;

                        {
                            this.f16768a = i7;
                            this.f16769b = f7;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (this.f16768a) {
                                case 0:
                                    RelativeLayout relativeLayout3 = ((F) this.f16769b).f16773b;
                                    if (relativeLayout3 != null) {
                                        int width = relativeLayout3.getWidth();
                                        int height = relativeLayout3.getHeight();
                                        int i8 = (height * 9) / 16;
                                        int i9 = i8;
                                        if (i8 > width) {
                                            i9 = width;
                                        }
                                        StringBuilder sbB = Vn.A.b(width, height, "w=", ",h=", ",vw=");
                                        sbB.append(i9);
                                        sbB.append(",vh=");
                                        sbB.append(height);
                                        BLog.e("LiveWindowUIManager", sbB.toString());
                                        ViewGroup.LayoutParams layoutParams2 = relativeLayout3.getLayoutParams();
                                        layoutParams2.width = i9;
                                        layoutParams2.height = height;
                                        relativeLayout3.setLayoutParams(layoutParams2);
                                        com.bilibili.ad.adview.pegasus.holders.inline.player.egg.eggpicture.util.i.a(relativeLayout3.getWidth(), relativeLayout3.getHeight(), " w=", ",h=", "LiveWindowUIManager");
                                    }
                                    break;
                                default:
                                    LynxTemplateRender lynxTemplateRender = (LynxTemplateRender) this.f16769b;
                                    boolean z6 = LynxTemplateRender.p0;
                                    lynxTemplateRender.K();
                                    UIBody.b bVar = lynxTemplateRender.w;
                                    if (bVar != null) {
                                        bVar.removeAllViews();
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
            h hVar = f7.f16774c;
            if (hVar != null) {
                hVar.f19760c = f7;
                hVar.f19761d = f7;
                hVar.f19759b = captureFocusExposureView;
            }
        }
    }

    public final boolean Dg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        boolean z6 = false;
        if (independentCaptureViewModel != null) {
            z6 = false;
            if (independentCaptureViewModel.u1()) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void Eg(int i7) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.f109302o.i = i7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [NB0.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v170, types: [JC0.b, JC0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [NB0.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v447, types: [JB0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v467, types: [JB0.t, androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARN: Type inference failed for: r0v49, types: [OB0.d$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v568, types: [com.bilibili.studio.videoeditor.util.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v627, types: [NB0.w$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [NB0.F, java.lang.Object] */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public void Ff() {
        InterfaceC2703v dVar;
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar;
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar2;
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar3;
        IndependentCaptureViewModel independentCaptureViewModel;
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel2;
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar2;
        IndependentCaptureViewModel independentCaptureViewModel3;
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar3;
        com.bilibili.studio.videoeditor.capturev3.logic.c cVar;
        e eVarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2689g c2689gCg = cg();
        this.f109176y = c2689gCg;
        c2689gCg.k(this.f109175x);
        C2689g c2689g = this.f109176y;
        Context context = getContext();
        if (context == null) {
            c2689g.getClass();
        } else if (c2689g.f16872c != null && (DensityUtil.getDevicesWidthPixels(context) * 1.0f) / DensityUtil.getDevicesHeightPixels(context) < 0.5625f) {
            c2689g.g(context);
            c2689g.l();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mBasicUIManager time=" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
        ?? obj = new Object();
        this.f109162A = obj;
        ViewBinding viewBinding = this.f109175x;
        if (viewBinding instanceof M) {
            obj.f16776a = ((M) viewBinding).f23615X;
        } else if (viewBinding instanceof TB0.L) {
            obj.f16776a = ((TB0.L) viewBinding).f23560Y;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        v0.b(jCurrentTimeMillis3 - jCurrentTimeMillis2, " PermissionUIManager time=", "IndependentCaptureFragment");
        ViewBinding viewBinding2 = this.f109175x;
        if (viewBinding2 instanceof M) {
            ?? obj2 = new Object();
            M m7 = (M) viewBinding2;
            obj2.f16965a = m7.f23620a;
            obj2.f16966b = m7.f23624c0;
            obj2.f16967c = m7.f23623c;
            obj2.f16968d = m7.f23644v;
            obj2.f16969e = m7.f23593B;
            obj2.f16970f = m7.f23592A;
            obj2.f16971g = m7.f23649z;
            obj2.h = m7.f23601J;
            obj2.f16972i = m7.f23642t;
            obj2.f16973j = m7.f23604M;
            obj2.f16974k = m7.f23613V;
            obj2.f16982s = m7.f23597F;
            obj2.f16975l = m7.f23611T;
            obj2.f16976m = m7.f23596E;
            obj2.f16977n = m7.f23614W;
            obj2.f16978o = m7.f23627f;
            obj2.f16979p = m7.f23632l;
            obj2.f16980q = m7.f23626e;
            obj2.f16981r = m7.f23599H;
            dVar = new C2704w(obj2);
        } else if (viewBinding2 instanceof TB0.L) {
            ?? obj3 = new Object();
            TB0.L l7 = (TB0.L) viewBinding2;
            obj3.f17771a = l7.f23562a;
            obj3.f17772b = l7.f23579p0;
            obj3.f17773c = l7.f23565c;
            obj3.f17774d = l7.f23585u;
            obj3.f17775e = l7.f23590y;
            obj3.f17776f = l7.f23589x;
            obj3.f17777g = l7.f23555U;
            obj3.h = l7.f23554T;
            obj3.f17778i = l7.f23541G;
            obj3.f17779j = l7.f23583s;
            obj3.f17780k = l7.f23546L;
            obj3.f17781l = l7.f23557W;
            obj3.f17789t = l7.f23537C;
            obj3.f17782m = l7.f23553S;
            obj3.f17783n = l7.f23536B;
            obj3.f17784o = l7.f23558X;
            obj3.f17785p = l7.f23568e;
            obj3.f17786q = l7.f23573k;
            obj3.f17787r = l7.f23567d;
            obj3.f17788s = l7.f23539E;
            dVar = new OB0.d(obj3);
        } else {
            dVar = null;
        }
        this.f109177z = dVar;
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mRotateManager time=" + (jCurrentTimeMillis4 - jCurrentTimeMillis3));
        ?? obj4 = new Object();
        this.f109163B = obj4;
        ViewBinding viewBinding3 = this.f109175x;
        if (viewBinding3 instanceof M) {
            M m8 = (M) viewBinding3;
            obj4.f16772a = m8.f23606O;
            obj4.f16773b = m8.f23608Q;
        } else if (viewBinding3 instanceof TB0.L) {
            TB0.L l8 = (TB0.L) viewBinding3;
            obj4.f16772a = l8.f23548N;
            obj4.f16773b = l8.f23550P;
        }
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mLiveWindowManager time=" + (jCurrentTimeMillis5 - jCurrentTimeMillis4));
        ViewOnClickListenerC2701t viewOnClickListenerC2701tDg = dg();
        this.f109164C = viewOnClickListenerC2701tDg;
        viewOnClickListenerC2701tDg.b(this.f109175x);
        long jCurrentTimeMillis6 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mBottomFunctionUIManager time=" + (jCurrentTimeMillis6 - jCurrentTimeMillis5));
        L lFg = fg();
        this.f109165D = lFg;
        lFg.l(this.f109175x);
        if (p3() != null) {
            if (NotchCompat.hasDisplayCutout(requireActivity().getWindow())) {
                this.f109165D.e(requireActivity());
            }
            L l9 = this.f109165D;
            IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            l9.d(getApplicationContext() != null ? (int) getApplicationContext().getResources().getDimension(2131165418) : 0, independentCaptureViewModel4 != null && Intrinsics.areEqual(independentCaptureViewModel4.f109314c, "contribution"));
        }
        long jCurrentTimeMillis7 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mRecordUIManager time=" + (jCurrentTimeMillis7 - jCurrentTimeMillis6));
        ?? obj5 = new Object();
        obj5.f16925y = true;
        obj5.f16926z = true;
        obj5.f16900A = true;
        obj5.f16901B = true;
        this.f109166E = obj5;
        ViewBinding viewBinding4 = this.f109175x;
        if (viewBinding4 instanceof M) {
            M m9 = (M) viewBinding4;
            obj5.f16903b = m9.f23632l;
            obj5.f16904c = m9.f23631k;
            obj5.f16905d = m9.f23633m;
            obj5.f16906e = m9.f23620a;
        } else if (viewBinding4 instanceof TB0.L) {
            TB0.L l10 = (TB0.L) viewBinding4;
            LinearLayout linearLayout = l10.f23573k;
            obj5.f16904c = l10.f23572j;
            obj5.f16905d = l10.f23574l;
            obj5.f16906e = l10.f23562a;
        }
        long jCurrentTimeMillis8 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mBeautifyUIManager time=" + (jCurrentTimeMillis8 - jCurrentTimeMillis7));
        final f0 f0VarGg = gg();
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            BLog.e("IndependentCaptureFragment", "initSticker  start");
            long jCurrentTimeMillis9 = System.currentTimeMillis();
            ViewBinding viewBinding5 = this.f109175x;
            boolean z6 = viewBinding5 instanceof M;
            if (z6) {
                RelativeLayout relativeLayout = ((M) viewBinding5).f23606O;
            } else if (viewBinding5 instanceof TB0.L) {
                RelativeLayout relativeLayout2 = ((TB0.L) viewBinding5).f23548N;
            }
            if (viewBinding5 != null) {
                if (viewBinding5 instanceof M) {
                    M m10 = (M) viewBinding5;
                    f0VarGg.f16841a = m10.f23627f;
                    f0VarGg.f16842b = m10.h;
                    f0VarGg.f16843c = m10.f23629i;
                    f0VarGg.f16844d = m10.f23628g;
                    f0VarGg.f16845e = m10.f23630j;
                    f0VarGg.f16846f = m10.f23609R;
                } else if (viewBinding5 instanceof TB0.L) {
                    TB0.L l11 = (TB0.L) viewBinding5;
                    f0VarGg.f16841a = l11.f23568e;
                    f0VarGg.f16842b = l11.f23570g;
                    f0VarGg.f16843c = l11.h;
                    f0VarGg.f16844d = l11.f23569f;
                    f0VarGg.f16845e = l11.f23571i;
                    f0VarGg.f16846f = l11.f23551Q;
                }
                PictureEdgeView pictureEdgeView = f0VarGg.f16843c;
                if (pictureEdgeView != null) {
                    pictureEdgeView.setDrawEdgeLine(false);
                }
                TextView textView = f0VarGg.f16846f;
                ?? obj6 = new Object();
                obj6.f110223a = textView;
                ValueAnimator valueAnimator = new ValueAnimator();
                obj6.f110225c = valueAnimator;
                valueAnimator.setFloatValues(1.0f, 0.3f, 1.0f);
                valueAnimator.setDuration(2000L).setRepeatCount(2);
                valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                valueAnimator.addUpdateListener(new u((Object) obj6, 1));
                valueAnimator.addListener(new C6628a(obj6));
                f0VarGg.f16857r = obj6;
            }
            RelativeLayout relativeLayout3 = z6 ? ((M) viewBinding5).f23620a : viewBinding5 instanceof TB0.L ? ((TB0.L) viewBinding5).f23562a : null;
            if (relativeLayout3 != null) {
                k kVarI = f0VarGg.i(fragmentActivityP3);
                View viewFindViewById = kVarI.f19780c.findViewById(2131306951);
                f0VarGg.f16847g = viewFindViewById;
                if (viewFindViewById != null) {
                    final int i7 = 0;
                    viewFindViewById.setOnClickListener(new View.OnClickListener(f0VarGg, i7) { // from class: NB0.O

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f16805a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f16806b;

                        {
                            this.f16805a = i7;
                            this.f16806b = f0VarGg;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (this.f16805a) {
                                case 0:
                                    ((f0) this.f16806b).k();
                                    break;
                                case 1:
                                    Ze1.g gVar4 = (Ze1.g) this.f16806b;
                                    gVar4.d.c(gVar4.r0());
                                    break;
                                default:
                                    ((Function0) this.f16806b).invoke();
                                    break;
                            }
                        }
                    });
                }
                View viewN = f0VarGg.n(kVarI);
                f0VarGg.h = viewN;
                if (viewN != null) {
                    viewN.post(new P(f0VarGg, relativeLayout3));
                }
                ImageView imageView = (ImageView) kVarI.f19780c.findViewById(2131304141);
                f0VarGg.f16848i = imageView;
                if (imageView != null) {
                    final int i8 = 0;
                    imageView.setOnClickListener(new View.OnClickListener(f0VarGg, i8) { // from class: NB0.Q

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f16810a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f16811b;

                        {
                            this.f16810a = i8;
                            this.f16811b = f0VarGg;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            IndependentCaptureViewModel independentCaptureViewModel5;
                            com.bilibili.studio.videoeditor.capturev3.logic.g gVar4;
                            StickerListItemV3 stickerListItemV3;
                            sB0.c cVar2;
                            int i9;
                            switch (this.f16810a) {
                                case 0:
                                    IndependentCaptureFragment independentCaptureFragment = ((f0) this.f16811b).f16865z;
                                    if (independentCaptureFragment != null && (independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment).b) != null && (gVar4 = independentCaptureViewModel5.f109310w) != null && (stickerListItemV3 = gVar4.f109235g) != null && (cVar2 = stickerListItemV3.stickerInfo) != null) {
                                        int i10 = cVar2.h == 0 ? 1 : 0;
                                        int i11 = cVar2.j;
                                        String strD = gVar4.d();
                                        if (i10 != 0) {
                                            AO0.g.b(1, i11, independentCaptureViewModel5.f109314c, strD);
                                        } else {
                                            AO0.g.b(2, i11, independentCaptureViewModel5.f109314c, strD);
                                        }
                                        if (i10 != 0) {
                                            ArrayList<StickerListItemV3> arrayList = gVar4.f109234f.get(0);
                                            if ((arrayList != null ? arrayList.size() : -1) >= 500) {
                                                Application application = BiliContext.application();
                                                if (application != null) {
                                                    independentCaptureViewModel5.a1(application.getString(2131842013));
                                                }
                                            }
                                        }
                                        independentCaptureViewModel5.f109300m.getClass();
                                        int i12 = cVar2.h == 1 ? 0 : 1;
                                        TC0.e eVar = (TC0.e) ServiceGenerator.createService(TC0.e.class);
                                        AccountService accountService = (AccountService) BLRouter.get$default(BLRouter.INSTANCE, AccountService.class, (String) null, 2, (Object) null);
                                        eVar.favStickerAction(accountService != null ? accountService.getAccessToken() : null, 5, i12, cVar2.j).enqueue(new BiliApiDataCallback());
                                        IndependentCaptureViewModel independentCaptureViewModel6 = gVar4.f109249v;
                                        if (independentCaptureViewModel6 != null) {
                                            CaptureSticker captureSticker = new CaptureSticker(1003);
                                            captureSticker.favoriteState = i10;
                                            independentCaptureViewModel6.f109301n.l.setValue(captureSticker);
                                        }
                                        sB0.c cVar3 = stickerListItemV3.stickerInfo;
                                        if (cVar3 != null) {
                                            cVar3.h = i10;
                                        }
                                        int size = gVar4.f109234f.size();
                                        for (int i13 = 0; i13 < size; i13++) {
                                            int size2 = gVar4.f109234f.get(i13).size();
                                            for (int i14 = 0; i14 < size2; i14++) {
                                                sB0.c cVar4 = gVar4.f109234f.get(i13).get(i14).stickerInfo;
                                                if (cVar4.j == stickerListItemV3.stickerInfo.j) {
                                                    cVar4.h = i10;
                                                }
                                            }
                                        }
                                        ArrayList<StickerListItemV3> arrayList2 = gVar4.f109234f.get(0);
                                        if (arrayList2 != null) {
                                            if (i10 != 0) {
                                                try {
                                                    arrayList2.add(stickerListItemV3.m10419clone());
                                                } catch (CloneNotSupportedException e7) {
                                                    e7.printStackTrace();
                                                    Unit unit = Unit.INSTANCE;
                                                }
                                            } else {
                                                int size3 = arrayList2.size();
                                                int i15 = 0;
                                                while (true) {
                                                    i9 = -1;
                                                    if (i15 < size3) {
                                                        if (Intrinsics.areEqual(stickerListItemV3, arrayList2.get(i15))) {
                                                            i9 = i15;
                                                        } else {
                                                            i15++;
                                                        }
                                                    }
                                                }
                                                if (i9 >= 0 && i9 < arrayList2.size()) {
                                                    arrayList2.remove(i9);
                                                }
                                            }
                                            IndependentCaptureViewModel independentCaptureViewModel7 = gVar4.f109249v;
                                            if (independentCaptureViewModel7 != null) {
                                                independentCaptureViewModel7.f109301n.l.setValue(new CaptureSticker(1008));
                                            }
                                        }
                                        IndependentCaptureViewModel independentCaptureViewModel8 = gVar4.f109249v;
                                        if (independentCaptureViewModel8 != null) {
                                            independentCaptureViewModel8.f109301n.l.setValue(new CaptureSticker(1009));
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    FragmentActivity fragmentActivityP32 = ((MessageSubscribeFragment) this.f16811b).p3();
                                    if (fragmentActivityP32 != null) {
                                        fragmentActivityP32.finish();
                                    }
                                    break;
                                default:
                                    ((AuthorSeasonVideoFragment) this.f16811b).onRefresh();
                                    break;
                            }
                        }
                    });
                }
                f0VarGg.f16849j = (TextView) kVarI.f19780c.findViewById(2131298424);
                Switch r02 = (Switch) kVarI.f19780c.findViewById(2131298309);
                f0VarGg.f16850k = r02;
                if (r02 != null) {
                    r02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(f0VarGg) { // from class: NB0.S

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final f0 f16812a;

                        {
                            this.f16812a = f0VarGg;
                        }

                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                            IndependentCaptureViewModel independentCaptureViewModel5;
                            com.bilibili.studio.videoeditor.capturev3.logic.g gVar4;
                            StickerListItemV3 stickerListItemV3;
                            int iB;
                            int[] iArr;
                            String str;
                            LC0.a aVar4;
                            LC0.a aVar5;
                            LC0.a aVar6;
                            IndependentCaptureFragment independentCaptureFragment = this.f16812a.f16865z;
                            if (independentCaptureFragment == null || (independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment).b) == null || (gVar4 = independentCaptureViewModel5.f109310w) == null || (stickerListItemV3 = gVar4.f109235g) == null) {
                                return;
                            }
                            sB0.c cVar2 = stickerListItemV3.attachStickerInfo;
                            if (cVar2 != null) {
                                str = cVar2.a;
                                iB = cVar2.b();
                                iArr = cVar2.d;
                            } else {
                                iB = 2;
                                iArr = null;
                                str = null;
                            }
                            sB0.c cVar3 = stickerListItemV3.stickerInfo;
                            int[] iArr2 = iArr;
                            String str2 = str;
                            int iB2 = iB;
                            if (cVar3 != null) {
                                iArr2 = iArr;
                                str2 = str;
                                iB2 = iB;
                                if (TextUtils.isEmpty(str)) {
                                    str2 = cVar3.a;
                                    iB2 = cVar3.b();
                                    iArr2 = cVar3.d;
                                }
                            }
                            com.bilibili.studio.videoeditor.capturev3.logic.i iVar = independentCaptureViewModel5.f109306s;
                            if (!z7) {
                                if (iVar == null || (aVar4 = iVar.f109252a) == null) {
                                    return;
                                }
                                aVar4.D(iB2);
                                return;
                            }
                            if (str2 != null) {
                                if (iVar != null && (aVar6 = iVar.f109252a) != null) {
                                    aVar6.D(iB2);
                                }
                                Boolean boolValueOf = null;
                                if (iVar != null) {
                                    boolValueOf = Boolean.valueOf(iVar.a(str2, iB2, iArr2));
                                }
                                if (boolValueOf != null) {
                                    return;
                                }
                            }
                            if (iVar == null || (aVar5 = iVar.f109252a) == null) {
                                return;
                            }
                            aVar5.D(iB2);
                        }
                    });
                }
                f0VarGg.f16851l = (RelativeLayout) kVarI.f19780c.findViewById(2131310460);
                View viewFindViewById2 = kVarI.f19780c.findViewById(2131302821);
                f0VarGg.f16852m = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    final int i9 = 0;
                    viewFindViewById2.setOnClickListener(new View.OnClickListener(f0VarGg, i9) { // from class: NB0.X

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final int f16821a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final Object f16822b;

                        {
                            this.f16821a = i9;
                            this.f16822b = f0VarGg;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            IndependentCaptureViewModel independentCaptureViewModel5;
                            StickerListItemV3 stickerListItemV3;
                            sB0.c cVar2;
                            sB0.c cVar3;
                            switch (this.f16821a) {
                                case 0:
                                    BaseVMFragment baseVMFragment = ((f0) this.f16822b).f16865z;
                                    if (baseVMFragment != null && (independentCaptureViewModel5 = (IndependentCaptureViewModel) baseVMFragment.b) != null) {
                                        StickerListItemV3 stickerListItemV3N1 = independentCaptureViewModel5.n1();
                                        boolean zV1 = independentCaptureViewModel5.v1((stickerListItemV3N1 == null || (cVar3 = stickerListItemV3N1.stickerInfo) == null) ? null : cVar3.d);
                                        Bundle bundleA = androidx.credentials.p.a("selectVideoList", "show_drafts", true, false);
                                        bundleA.putBoolean("show_camera", false);
                                        bundleA.putBoolean("album_gray", false);
                                        bundleA.putInt("key_choose_mode", 1);
                                        bundleA.putBoolean("only_show_picture", zV1);
                                        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/album/")).extras(new com.bilibili.bililive.biz.pkv2.ui.m(bundleA, 1)).requestCode(2).build(), baseVMFragment);
                                        com.bilibili.studio.videoeditor.capturev3.logic.g gVar4 = independentCaptureViewModel5.f109310w;
                                        if (gVar4 != null && (stickerListItemV3 = gVar4.f109235g) != null && (cVar2 = stickerListItemV3.stickerInfo) != null) {
                                            String strValueOf = String.valueOf(cVar2.j);
                                            String strD = gVar4.d();
                                            String str = strD;
                                            if (strD == null) {
                                                str = "";
                                            }
                                            String strM1 = independentCaptureViewModel5.m1();
                                            List<String> list = HB0.a.f8154a;
                                            HashMap map = new HashMap();
                                            map.putAll(HB0.a.c(strM1));
                                            map.put("shoot_sticker_id", strValueOf);
                                            map.put("shoot_sticker_type", str);
                                            Neurons.reportClick(false, "creation.video-shoot.sticker.upload-panel-add.click", map);
                                            if (independentCaptureViewModel5.v1(cVar2.d)) {
                                                Cg.l.a("shoot_sticker_id", strValueOf, "creation.video-shoot.sticker.add.click", false);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    StarEggPictureStyle2Activity starEggPictureStyle2Activity = (StarEggPictureStyle2Activity) this.f16822b;
                                    com.bilibili.ad.adview.pegasus.holders.inline.player.egg.eggpicture.util.a aVar4 = starEggPictureStyle2Activity.M;
                                    if (aVar4 != null) {
                                        aVar4.a();
                                    }
                                    starEggPictureStyle2Activity.P6();
                                    starEggPictureStyle2Activity.finish();
                                    break;
                            }
                        }
                    });
                }
                RecyclerView recyclerView = (RecyclerView) kVarI.f19780c.findViewById(2131310772);
                f0VarGg.f16853n = recyclerView;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivityP3, 0, false));
                    C c7 = new C();
                    c7.f11132c = new c0(f0VarGg);
                    f0VarGg.f16859t = c7;
                    recyclerView.setAdapter(c7);
                }
                ImageView imageView2 = (ImageView) kVarI.f19780c.findViewById(2131304573);
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new View.OnClickListener(f0VarGg) { // from class: NB0.T

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final f0 f16813a;

                        {
                            this.f16813a = f0VarGg;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f16813a.o();
                        }
                    });
                }
                f0VarGg.f16855p = (TextView) kVarI.f19780c.findViewById(2131314483);
                RecyclerView recyclerView2 = (RecyclerView) kVarI.f19780c.findViewById(2131310761);
                f0VarGg.f16854o = recyclerView2;
                if (recyclerView2 != null) {
                    recyclerView2.setFocusable(false);
                    recyclerView2.setFocusableInTouchMode(false);
                    recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
                }
                ViewPager viewPager = (ViewPager) kVarI.f19780c.findViewById(2131316461);
                f0VarGg.f16856q = viewPager;
                if (viewPager != null) {
                    viewPager.addOnPageChangeListener(new b0(f0VarGg));
                }
                kVarI.f19779b = new a0(f0VarGg);
                f0VarGg.f16858s = kVarI;
            }
            BLog.e("IndependentCaptureFragment", "initSticker  end time=" + (System.currentTimeMillis() - jCurrentTimeMillis9));
            ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
            ViewGroup viewGroup = viewOnClickListenerC2701t != null ? viewOnClickListenerC2701t.f16935j : null;
            ?? obj7 = new Object();
            Context context2 = getContext();
            obj7.f11217a = context2;
            obj7.f11220d = viewGroup;
            obj7.f11221e = new ArrayList();
            obj7.f11222f = null;
            View viewInflate = LayoutInflater.from(context2).inflate(2131493942, viewGroup, false);
            PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            obj7.f11218b = popupWindow;
            popupWindow.setFocusable(false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setBackgroundDrawable(new BitmapDrawable());
            RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(2131312090);
            recyclerView3.setLayoutManager(new LinearLayoutManager(context2, 0, false));
            JB0.u uVar = new JB0.u(obj7);
            ?? adapter = new RecyclerView.Adapter();
            adapter.f11207a = new ArrayList();
            adapter.f11208b = uVar;
            obj7.f11219c = adapter;
            recyclerView3.setAdapter(adapter);
            obj7.f11222f = new NB0.M(f0VarGg);
            f0VarGg.f16863x = obj7;
        }
        this.f109167F = f0VarGg;
        long jCurrentTimeMillis10 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mStickerUIManager time=" + (jCurrentTimeMillis10 - jCurrentTimeMillis8));
        A a7 = new A();
        this.f109168G = a7;
        ViewBinding viewBinding6 = this.f109175x;
        if (viewBinding6 instanceof M) {
            M m11 = (M) viewBinding6;
            a7.f16758p = m11.f23620a;
            a7.f16744a = m11.f23606O;
            a7.f16746c = m11.f23634n;
            a7.f16745b = m11.f23608Q;
            a7.f16760r = m11.f23643u;
            a7.f16761s = m11.f23635o;
            a7.f16763u = m11.f23636p;
            a7.f16762t = m11.f23639r;
            a7.f16764v = m11.f23641s;
        } else if (viewBinding6 instanceof TB0.L) {
            TB0.L l12 = (TB0.L) viewBinding6;
            a7.f16758p = l12.f23562a;
            a7.f16744a = l12.f23548N;
            a7.f16746c = l12.f23575m;
            a7.f16745b = l12.f23550P;
            a7.f16760r = l12.f23584t;
            a7.f16761s = l12.f23576n;
            a7.f16763u = l12.f23577o;
            a7.f16762t = l12.f23580q;
            a7.f16764v = l12.f23581r;
        }
        ?? obj8 = new Object();
        obj8.f11234f = 101;
        obj8.h = 1.0f;
        a7.f16759q = obj8;
        RelativeLayout relativeLayout4 = a7.f16744a;
        if (relativeLayout4 != null) {
            relativeLayout4.setOnTouchListener(a7);
        }
        RelativeLayout relativeLayout5 = a7.f16746c;
        if (relativeLayout5 != null) {
            relativeLayout5.setOnTouchListener(a7);
        }
        JC0.b bVar = a7.f16759q;
        if (bVar != null) {
            bVar.f11230b = a7;
        }
        RelativeLayout relativeLayout6 = a7.f16746c;
        if (relativeLayout6 != null) {
            relativeLayout6.setOnClickListener(a7);
        }
        ImageView imageView3 = a7.f16760r;
        if (imageView3 != null) {
            imageView3.setOnClickListener(a7);
        }
        View view = a7.f16761s;
        if (view != null) {
            view.setOnClickListener(a7);
        }
        View view2 = a7.f16763u;
        if (view2 != null) {
            view2.setOnClickListener(a7);
        }
        View view3 = a7.f16762t;
        if (view3 != null) {
            view3.setOnClickListener(a7);
        }
        View view4 = a7.f16764v;
        if (view4 != null) {
            view4.setOnClickListener(a7);
        }
        IndependentCaptureFragment independentCaptureFragment = a7.f16755m;
        if (independentCaptureFragment != null) {
            IndependentCaptureViewModel independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment).b;
            if ((independentCaptureViewModel5 == null || (cVar = independentCaptureViewModel5.f109312y) == null || (eVarA = cVar.f109215c.a()) == null) ? false : eVarA.d) {
                QB0.i iVar = (QB0.i) a7.f16756n.getValue();
                View view5 = a7.f16758p;
                iVar.f19775d = 0;
                iVar.a(view5);
            }
        }
        long jCurrentTimeMillis11 = System.currentTimeMillis();
        BLog.e("IndependentCaptureFragment", " mFollowTogetherUIManager time=" + (jCurrentTimeMillis11 - jCurrentTimeMillis10));
        Xf().b(this.f109175x);
        LrcListView lrcListView = Xf().f109265b;
        if (lrcListView != null) {
            IndependentCaptureViewModel independentCaptureViewModel6 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            lrcListView.setContributeFrom(independentCaptureViewModel6 != null ? independentCaptureViewModel6.f109314c : null);
        }
        v0.b(System.currentTimeMillis() - jCurrentTimeMillis11, " mMusicUIManager time=", "IndependentCaptureFragment");
        C2689g c2689g2 = this.f109176y;
        if (c2689g2 != null) {
            c2689g2.f16877i = this;
        }
        G g7 = this.f109162A;
        if (g7 != null) {
            g7.f16778c = this;
        }
        F f7 = this.f109163B;
        if (f7 != null) {
            f7.f16775d = this;
        }
        ViewOnClickListenerC2701t viewOnClickListenerC2701t2 = this.f109164C;
        if (viewOnClickListenerC2701t2 != null) {
            viewOnClickListenerC2701t2.f16943r = this;
        }
        L l13 = this.f109165D;
        if (l13 != null) {
            l13.f16793k = this;
        }
        C2700s c2700s = this.f109166E;
        if (c2700s != null) {
            c2700s.f16921u = this;
            vB0.b bVar2 = new vB0.b(new C2695m(c2700s));
            bVar2.e = new C2696n(c2700s);
            c2700s.f16916p = bVar2;
            IndependentCaptureFragment independentCaptureFragment2 = c2700s.f16921u;
            ArrayList<sB0.a> arrayList = (independentCaptureFragment2 == null || (independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment2).b) == null || (aVar3 = independentCaptureViewModel3.f109309v) == null) ? null : aVar3.h;
            ArrayList<sB0.a> arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList<>();
            }
            rB0.b bVar3 = new rB0.b(arrayList2);
            bVar3.b = new C2691i(c2700s);
            c2700s.f16917q = bVar3;
            IndependentCaptureFragment independentCaptureFragment3 = c2700s.f16921u;
            ArrayList<CaptureBeautyEntity> arrayList3 = (independentCaptureFragment3 == null || (independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment3).b) == null || (aVar2 = independentCaptureViewModel2.f109309v) == null) ? null : aVar2.f109203i;
            ArrayList<CaptureBeautyEntity> arrayList4 = arrayList3;
            if (arrayList3 == null) {
                arrayList4 = new ArrayList<>();
            }
            rB0.a aVar4 = new rB0.a(arrayList4);
            aVar4.b = new C2691i(c2700s);
            c2700s.f16918r = aVar4;
            IndependentCaptureFragment independentCaptureFragment4 = c2700s.f16921u;
            ArrayList<CaptureTemplateEntity> arrayList5 = (independentCaptureFragment4 == null || (independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment4).b) == null || (aVar = independentCaptureViewModel.f109309v) == null) ? null : aVar.f109204j;
            ArrayList<CaptureTemplateEntity> arrayList6 = arrayList5;
            if (arrayList5 == null) {
                arrayList6 = new ArrayList<>();
            }
            MB0.a aVar5 = new MB0.a(arrayList6);
            aVar5.f15986b = new C2697o(c2700s);
            c2700s.f16919s = aVar5;
            IndependentCaptureFragment independentCaptureFragment5 = c2700s.f16921u;
            ArrayList<CaptureMakeupEntity> arrayList7 = null;
            if (independentCaptureFragment5 != null) {
                IndependentCaptureViewModel independentCaptureViewModel7 = (IndependentCaptureViewModel) ((BaseVMFragment) independentCaptureFragment5).b;
                arrayList7 = null;
                if (independentCaptureViewModel7 != null) {
                    com.bilibili.studio.videoeditor.capturev3.logic.a aVar6 = independentCaptureViewModel7.f109309v;
                    arrayList7 = null;
                    if (aVar6 != null) {
                        arrayList7 = aVar6.f109205k;
                    }
                }
            }
            ArrayList<CaptureMakeupEntity> arrayList8 = arrayList7;
            if (arrayList7 == null) {
                arrayList8 = new ArrayList<>();
            }
            RecyclerView.Adapter adapter2 = new RecyclerView.Adapter();
            ((rB0.d) adapter2).a = arrayList8;
            ((rB0.d) adapter2).b = new C2698p(c2700s);
            c2700s.f16920t = adapter2;
        }
        f0 f0Var = this.f109167F;
        if (f0Var != null) {
            f0Var.f16865z = this;
            m mVar = new m(false, false);
            mVar.f11189c = f0Var;
            Yv0.c cVar2 = ((BaseVMFragment) this).b;
            IndependentCaptureViewModel independentCaptureViewModel8 = (IndependentCaptureViewModel) cVar2;
            if (independentCaptureViewModel8 != null && (gVar3 = independentCaptureViewModel8.f109310w) != null) {
                gVar3.f109246s = mVar;
            }
            m mVar2 = new m(false, true);
            mVar2.f11189c = f0Var;
            IndependentCaptureViewModel independentCaptureViewModel9 = (IndependentCaptureViewModel) cVar2;
            if (independentCaptureViewModel9 != null && (gVar2 = independentCaptureViewModel9.f109310w) != null) {
                gVar2.f109247t = mVar2;
            }
            m mVar3 = new m(true, true);
            mVar3.f11189c = f0Var;
            IndependentCaptureViewModel independentCaptureViewModel10 = (IndependentCaptureViewModel) cVar2;
            if (independentCaptureViewModel10 != null && (gVar = independentCaptureViewModel10.f109310w) != null) {
                gVar.f109248u = mVar3;
            }
            WeakHandler weakHandler = new WeakHandler(f0Var);
            f0Var.f16864y = weakHandler;
            weakHandler.sendMessageDelayed(weakHandler.obtainMessage(295), 1000L);
        }
        A a8 = this.f109168G;
        if (a8 != null) {
            a8.f16755m = this;
        }
        Xf().f109270g = this;
    }

    public final void Fg(int i7) {
        h hVar;
        SurfaceView surfaceView;
        F f7 = this.f109163B;
        if (f7 == null || (hVar = f7.f16774c) == null || (surfaceView = hVar.f19758a) == null) {
            return;
        }
        surfaceView.setVisibility(i7);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Gf() {
        int iS;
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar;
        LC0.a aVar2;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            boolean zLf = BaseCaptureFragment.Lf();
            i iVar = independentCaptureViewModel.f109306s;
            if (iVar != null) {
                if (zLf && (aVar = independentCaptureViewModel.f109309v) != null && (aVar2 = aVar.f109196a.f109252a) != null) {
                    aVar2.j();
                }
                CaptureSticker captureSticker = new CaptureSticker(1026);
                qB0.d dVar = independentCaptureViewModel.f109301n;
                dVar.l.setValue(captureSticker);
                LC0.a aVar3 = iVar.f109252a;
                if (aVar3 != null && (iS = aVar3.s()) != 0) {
                    iVar.f109256e = iS;
                    if (iS > 1) {
                        zB0.d.a().a.setFrontCameraIndex(iVar.f109252a.T(0) ? 1 : 0);
                        zB0.d.a().a.setBackCameraIndex(!iVar.f109252a.T(0) ? 1 : 0);
                        iVar.f109254c = zB0.d.a().a.getFrontCameraIndex();
                    }
                    int iB = j.a(BiliContext.application()).b("DeviceIndex", Integer.MIN_VALUE);
                    if (iB != Integer.MIN_VALUE) {
                        iVar.f109254c = iB;
                    }
                    zB0.d.a().b(iVar.f109254c);
                }
                String str = Build.MODEL;
                String str2 = Build.MANUFACTURER;
                if (str != null && str2 != null) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    String upperCase2 = str2.toUpperCase(locale);
                    if ((Intrinsics.areEqual("SM-J7008", upperCase) && Intrinsics.areEqual("SAMSUNG", upperCase2)) || ((Intrinsics.areEqual("HTC ONE A9", upperCase) && Intrinsics.areEqual("HTC", upperCase2)) || (Intrinsics.areEqual("YQ601", upperCase) && Intrinsics.areEqual("SMARTISAN", upperCase2)))) {
                        iVar.f109255d = 4;
                    }
                }
                LC0.a aVar4 = iVar.f109252a;
                if (aVar4 != null) {
                    aVar4.F(iVar);
                }
                dVar.e.setValue(Integer.valueOf(iVar.f109254c));
                com.bilibili.studio.videoeditor.capturev3.logic.a aVar5 = independentCaptureViewModel.f109309v;
                HashMap<String, Integer> mapD = aVar5 != null ? aVar5.d() : null;
                boolean zD = iVar.d();
                com.bilibili.studio.videoeditor.capturev3.logic.a aVar6 = independentCaptureViewModel.f109309v;
                long j7 = aVar6 != null ? Xpref.getSharedPreferences(aVar6.f109197b, "editor_config").getInt("beautify_filter_select_id_v3", Integer.MIN_VALUE) : 0;
                com.bilibili.studio.videoeditor.capturev3.logic.a aVar7 = independentCaptureViewModel.f109309v;
                int i7 = aVar7 != null ? Xpref.getSharedPreferences(aVar7.f109197b, "editor_config").getInt("beautify_filter_progress_v3", 100) : 0;
                String strM1 = independentCaptureViewModel.m1();
                String str3 = CenterPlusStatisticsHelper.f105195a;
                JSONObject jSONObject = new JSONObject();
                CenterPlusStatisticsHelper.c(jSONObject, mapD);
                jSONObject.put("position", Integer.valueOf(!zD ? 1 : 0));
                jSONObject.put("FILTER_ID", Long.valueOf(j7));
                jSONObject.put("FILTER_INTENSITY", Integer.valueOf(i7));
                HashMap mapA = W.a("value", jSONObject.toJSONString(), "capture_id", CenterPlusStatisticsHelper.f105197c);
                String str4 = strM1;
                if (strM1 == null) {
                    str4 = "";
                }
                mapA.put(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str4);
                BLog.dfmt("CenterPlusStatisticsHelper", "reportNewBMMInitValue...params = " + mapA, new Object[0]);
                Neurons.trackT(false, "creation.new-bmm.init.value.track", mapA, 1, new O1(9));
            }
        }
    }

    public final void Gg(boolean z6) {
        h hVar;
        SurfaceView surfaceView;
        F f7 = this.f109163B;
        if (f7 == null || (hVar = f7.f16774c) == null || (surfaceView = hVar.f19758a) == null) {
            return;
        }
        surfaceView.setVisibility(4);
        surfaceView.setZOrderMediaOverlay(z6);
        surfaceView.postDelayed(new LR0.i(surfaceView, 1), 400L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Hf() {
        qB0.a aVar;
        MutableLiveData mutableLiveData;
        Long l7;
        ViewGroup viewGroup;
        qB0.a aVar2;
        qB0.a aVar3;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        boolean z6 = (independentCaptureViewModel == null || (aVar3 = independentCaptureViewModel.f109303p) == null || !aVar3.f) ? false : true;
        boolean z7 = (independentCaptureViewModel == null || (aVar2 = independentCaptureViewModel.f109303p) == null || aVar2.h) ? false : true;
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        if (viewOnClickListenerC2701t != null) {
            boolean z8 = independentCaptureViewModel != null && Intrinsics.areEqual(independentCaptureViewModel.f109314c, EditManager.KEY_FROM_CLIP_VIDEO);
            ay.b.a(Q.a(" initFollowAndUploadView showFT=", ",isFromClipVideo=", ",showSticker=", z6, z8), !z7, "BottomFunctionUIManager");
            if (!z6 && (viewGroup = viewOnClickListenerC2701t.f16932f) != null) {
                viewGroup.setVisibility(8);
            }
            if (z8) {
                ViewGroup viewGroup2 = viewOnClickListenerC2701t.f16932f;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                ViewGroup viewGroup3 = viewOnClickListenerC2701t.f16929c;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                }
            }
            if (z7) {
                ViewGroup viewGroup4 = viewOnClickListenerC2701t.f16935j;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(8);
                }
                viewOnClickListenerC2701t.f16927a = true;
            }
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        boolean z9 = false;
        if (independentCaptureViewModel2 != null) {
            qB0.a aVar4 = independentCaptureViewModel2.f109303p;
            z9 = false;
            if (aVar4 != null) {
                z9 = false;
                if (!aVar4.i) {
                    z9 = true;
                }
            }
        }
        C2700s c2700s = this.f109166E;
        if (c2700s != null) {
            c2700s.f16901B = true ^ z9;
        }
        long jLongValue = (independentCaptureViewModel2 == null || (aVar = independentCaptureViewModel2.f109303p) == null || (mutableLiveData = aVar.k) == null || (l7 = (Long) mutableLiveData.getValue()) == null) ? 0L : l7.longValue();
        if (jLongValue == 0) {
            IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            long j7 = 0;
            if (independentCaptureViewModel3 != null) {
                LB0.a aVar5 = independentCaptureViewModel3.f109304q;
                j7 = 0;
                if (aVar5 != null) {
                    dD0.b bVar = aVar5.f116375c;
                    j7 = 0;
                    if (bVar != null) {
                        j7 = bVar.b;
                    }
                }
            }
            L l8 = this.f109165D;
            if (l8 != null) {
                l8.p(j7);
            }
        } else {
            L l9 = this.f109165D;
            if (l9 != null) {
                l9.p(jLongValue);
            }
        }
        lB0.a aVarA = lB0.a.a();
        xB0.i iVar = new xB0.i(this);
        aVarA.getClass();
        this.f109174w = lB0.a.b(uC0.d.class, iVar);
    }

    public final int Hg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.f109302o.h : 0;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final boolean If() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        boolean z6 = false;
        if (independentCaptureViewModel != null) {
            i iVar = independentCaptureViewModel.f109306s;
            z6 = false;
            if (iVar != null) {
                LC0.a aVar = iVar.f109252a;
                z6 = false;
                if (aVar != null) {
                    z6 = false;
                    if (aVar.f0()) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    public final void Ig() {
        com.bilibili.studio.videoeditor.capturev3.music.g<AB0.a> gVarG1;
        AB0.a aVarE;
        MutableLiveData<MusicInfo> mutableLiveData;
        com.bilibili.studio.videoeditor.capturev3.music.g<AB0.a> gVarG12;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null && (gVarG12 = independentCaptureViewModel.g1()) != null) {
            gVarG12.a();
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        MusicInfo value = (independentCaptureViewModel2 == null || (gVarG1 = independentCaptureViewModel2.g1()) == null || (aVarE = gVarG1.e()) == null || (mutableLiveData = aVarE.f189a) == null) ? null : mutableLiveData.getValue();
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null) {
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_music_delete_click", "click", independentCaptureViewModel3.f109314c, C4618g.a(value != null ? value.getState() : 1, "")});
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final boolean Jf() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        boolean z6 = false;
        if (independentCaptureViewModel != null) {
            i iVar = independentCaptureViewModel.f109306s;
            z6 = false;
            if (iVar != null) {
                LC0.a aVar = iVar.f109252a;
                Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.k0()) : null;
                BLog.e("MediaEngineManager", " isEngineResourceReady engine=" + boolValueOf);
                z6 = false;
                if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void Jg() {
        com.bilibili.studio.videoeditor.capturev3.music.g<AB0.a> gVarG1;
        AB0.a aVarE;
        MutableLiveData<MusicInfo> mutableLiveData;
        com.bilibili.studio.videoeditor.capturev3.music.g<AB0.a> gVarG12;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null && (gVarG12 = independentCaptureViewModel.g1()) != null) {
            gVarG12.h(this);
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        int state = 1;
        if (independentCaptureViewModel2 != null) {
            independentCaptureViewModel2.f109302o.k = true;
        }
        MusicInfo value = (independentCaptureViewModel2 == null || (gVarG1 = independentCaptureViewModel2.g1()) == null || (aVarE = gVarG1.e()) == null || (mutableLiveData = aVarE.f189a) == null) ? null : mutableLiveData.getValue();
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null) {
            if (value != null) {
                state = value.getState();
            }
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_music_change_click", "click", independentCaptureViewModel3.f109314c, C4618g.a(state, "")});
        }
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.T0(2);
        }
    }

    public void K3() {
    }

    public final void Kg() {
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            HB0.a.e("取消");
        }
    }

    public final void Lg() {
        J j7;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null && independentCaptureViewModel.p1()) {
            IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            VideoClipRecordInfo.VideoClip videoClip = null;
            VideoClipRecordInfo.VideoClip videoClipRemoveLast = null;
            if (independentCaptureViewModel2 != null) {
                CaptureRecordManager captureRecordManager = independentCaptureViewModel2.f109307t;
                videoClip = null;
                if (captureRecordManager != null) {
                    VideoClipRecordInfo videoClipRecordInfo = captureRecordManager.f109188a;
                    videoClip = null;
                    if (videoClipRecordInfo != null) {
                        videoClip = null;
                        if (videoClipRecordInfo.hasClip()) {
                            VideoClipRecordInfo videoClipRecordInfo2 = captureRecordManager.f109188a;
                            if (videoClipRecordInfo2 != null) {
                                videoClipRemoveLast = videoClipRecordInfo2.removeLast();
                            }
                            if (videoClipRemoveLast != null && !TextUtils.isEmpty(videoClipRemoveLast.getPath()) && (j7 = captureRecordManager.f109189b) != null && !j7.b(videoClipRemoveLast.getPath())) {
                                PB0.c.a(videoClipRemoveLast.getPath());
                            }
                            IndependentCaptureViewModel independentCaptureViewModel3 = captureRecordManager.h;
                            videoClip = videoClipRemoveLast;
                            if (independentCaptureViewModel3 != null) {
                                independentCaptureViewModel3.z1();
                                videoClip = videoClipRemoveLast;
                            }
                        }
                    }
                }
                independentCaptureViewModel2.f109302o.g = captureRecordManager != null ? captureRecordManager.a() : 0L;
            }
            L l7 = this.f109165D;
            if (l7 != null) {
                CaptureScaleProgressBar captureScaleProgressBar = l7.f16785b;
                if (captureScaleProgressBar != null && !captureScaleProgressBar.f109369e.isEmpty()) {
                    captureScaleProgressBar.f109369e.removeLast();
                }
                CaptureScaleProgressBar captureScaleProgressBar2 = l7.f16785b;
                if (captureScaleProgressBar2 != null) {
                    captureScaleProgressBar2.a();
                }
                IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
                l7.g(independentCaptureViewModel4 != null ? independentCaptureViewModel4.o1() : 0L);
            }
            IndependentCaptureViewModel independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel5 != null && !independentCaptureViewModel5.f109302o.e && independentCaptureViewModel5 != null) {
                independentCaptureViewModel5.K1(true);
            }
            IndependentCaptureViewModel independentCaptureViewModel6 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            long jO1 = independentCaptureViewModel6 != null ? independentCaptureViewModel6.o1() : 0L;
            A a7 = this.f109168G;
            if (a7 != null) {
                int i7 = (int) (jO1 / ((long) 1000));
                JC0.b bVar = a7.f16759q;
                if (bVar != null) {
                    bVar.c(i7);
                }
            }
            IndependentCaptureViewModel independentCaptureViewModel7 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel7 != null) {
                qB0.b bVar2 = independentCaptureViewModel7.f109302o;
                if (bVar2.g == 0) {
                    int iH1 = independentCaptureViewModel7.h1();
                    A a8 = this.f109168G;
                    if (a8 != null) {
                        a8.m(bVar2.i, iH1);
                    }
                    A a9 = this.f109168G;
                    if (a9 != null) {
                        a9.o(bVar2.i, iH1, independentCaptureViewModel7.s1());
                    }
                    if (Kf() && !bVar2.e) {
                        uB0.a aVarB = uB0.a.b();
                        Application application = BiliContext.application();
                        aVarB.getClass();
                        uB0.a.a(application);
                    }
                }
                if (videoClip != null) {
                    HB0.a.e("确定");
                }
            }
        }
        Ah();
    }

    public final void Mg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.L0("取消");
            if (independentCaptureViewModel.f109308u != null) {
                uB0.a aVarB = uB0.a.b();
                Application application = BiliContext.application();
                aVarB.getClass();
                uB0.a.a(application);
            }
            independentCaptureViewModel.x1(false);
        }
        eg();
    }

    public void N0() {
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.M0(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Nf() {
        i iVar;
        if (getFragmentManager() == null) {
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C2689g c2689g = this.f109176y;
        if (c2689g != null) {
            com.freeletics.flowredux.dsl.e eVar = new com.freeletics.flowredux.dsl.e(this);
            Bundle bundle = new Bundle();
            ModMaskDialog modMaskDialog = new ModMaskDialog();
            modMaskDialog.f109138c = eVar;
            modMaskDialog.setArguments(bundle);
            c2689g.f16881m = modMaskDialog;
            if (!modMaskDialog.isAdded() && !c2689g.f16881m.isVisible()) {
                c2689g.f16881m.show(parentFragmentManager, "ModMaskDialog");
            }
            c2689g.f16885q = System.currentTimeMillis();
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"contribute_mod_state", "click", "1", "0"});
        }
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null) {
            return;
        }
        com.bilibili.studio.videoeditor.capturev3.viewmodel.d dVar = new com.bilibili.studio.videoeditor.capturev3.viewmodel.d(independentCaptureViewModel);
        BLog.e("MediaEngineManager", " setEngineModeUpdateCallback engine=" + iVar.f109252a);
        LC0.a aVar = iVar.f109252a;
        if (aVar != null) {
            aVar.Y(dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ng() {
        uB0.b bVar;
        CaptureSchema captureSchema;
        com.bilibili.studio.videoeditor.capturev3.logic.c cVar;
        CaptureSchema.MissionInfo missionInfo;
        CaptureSchema captureSchema2;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.L0("确定");
            com.bilibili.studio.videoeditor.capturev3.logic.b bVar2 = independentCaptureViewModel.f109308u;
            if (bVar2 != null && (bVar = bVar2.f109212c) != null && bVar.a) {
                bVar.a = false;
                Bundle arguments = getArguments();
                String string = arguments != null ? arguments.getString("JUMP_PARAMS") : null;
                CaptureDraftBean captureDraftBean = bVar2.f109211b;
                bVar2.f109210a = captureDraftBean;
                List<ClipBean> videoClips = captureDraftBean != null ? captureDraftBean.getVideoClips() : null;
                qB0.d dVar = independentCaptureViewModel.f109301n;
                qB0.b bVar3 = independentCaptureViewModel.f109302o;
                if (videoClips != null) {
                    for (ClipBean clipBean : videoClips) {
                        CaptureRecordManager captureRecordManager = independentCaptureViewModel.f109307t;
                        if (captureRecordManager != null) {
                            VideoClipRecordInfo.VideoClip videoClipClipBean2videoClip = ClipBean.clipBean2videoClip(clipBean);
                            VideoClipRecordInfo videoClipRecordInfo = captureRecordManager.f109188a;
                            if (videoClipRecordInfo != null) {
                                videoClipRecordInfo.addClip(videoClipClipBean2videoClip);
                            }
                            IndependentCaptureViewModel independentCaptureViewModel2 = captureRecordManager.h;
                            if (independentCaptureViewModel2 != null) {
                                independentCaptureViewModel2.z1();
                            }
                        }
                        bVar3.g = captureRecordManager != null ? captureRecordManager.a() : 0L;
                        dVar.q.setValue(Boolean.TRUE);
                    }
                }
                independentCaptureViewModel.F1();
                independentCaptureViewModel.G1();
                CaptureDraftBean captureDraftBean2 = bVar2.f109211b;
                if (captureDraftBean2 != null) {
                    if (!TextUtils.isEmpty(captureDraftBean2.getSchemeString())) {
                        String schemeString = captureDraftBean2.getSchemeString();
                        int iA = com.bilibili.studio.centerplus.util.h.a(string);
                        String strReplaceAll = schemeString;
                        if (iA > 0) {
                            strReplaceAll = schemeString;
                            if (schemeString != null) {
                                if (schemeString.length() == 0) {
                                    strReplaceAll = schemeString;
                                } else {
                                    Matcher matcher = com.bilibili.studio.centerplus.util.h.f105297a.matcher(schemeString);
                                    strReplaceAll = schemeString;
                                    if (matcher.find()) {
                                        try {
                                            String strGroup = matcher.group(0);
                                            String strGroup2 = matcher.group(1);
                                            if (strGroup == null || strGroup.length() == 0) {
                                                strReplaceAll = schemeString + "&topic_id=" + iA;
                                            } else if (strGroup2 == null || strGroup2.length() == 0) {
                                                strReplaceAll = matcher.replaceAll("topic_id=" + iA);
                                            } else {
                                                strReplaceAll = schemeString;
                                                if (Intrinsics.areEqual(strGroup2, "0")) {
                                                    strReplaceAll = matcher.replaceAll("topic_id=" + iA);
                                                }
                                            }
                                        } catch (Exception e7) {
                                            C8397q.a("appendTopicId failed : ", "TopicUtils", e7);
                                            strReplaceAll = schemeString;
                                        }
                                    }
                                }
                            }
                        }
                        CaptureSchema captureSchema3 = bVar3.a;
                        if (captureSchema3 != null && (missionInfo = captureSchema3.getMissionInfo()) != null) {
                            missionInfo.setJumpParams(strReplaceAll);
                            CaptureActionBean captureActionBean = captureDraftBean2.getCaptureActionBean();
                            missionInfo.setOriginTopicId(captureActionBean != null ? captureActionBean.originTopicId : 0);
                            CaptureActionBean captureActionBean2 = captureDraftBean2.getCaptureActionBean();
                            missionInfo.setCooperateTopicId(captureActionBean2 != null ? captureActionBean2.isCooperateTopicId : false);
                            if (missionInfo.isCooperateTopicId() && (captureSchema2 = bVar3.a) != null) {
                                captureSchema2.setDraftSchemaUseCooperateTopicId(true);
                            }
                        }
                        CaptureSchema captureSchema4 = bVar3.a;
                        if (captureSchema4 != null) {
                            captureSchema4.parseJumpParams(strReplaceAll);
                        }
                    }
                    CaptureSchema.SchemaInfo schemaInfo = captureDraftBean2.getSchemaInfo();
                    if (TextUtils.isEmpty(schemaInfo != null ? schemaInfo.getRelationFrom() : null)) {
                        CaptureSchema captureSchema5 = bVar3.a;
                        if (captureSchema5 != null) {
                            captureSchema5.setSchemaInfo(new CaptureSchema.SchemaInfo("recover", bVar3.b));
                        }
                    } else {
                        String relationFrom = captureDraftBean2.getSchemaInfo().getRelationFrom();
                        CaptureSchema captureSchema6 = bVar3.a;
                        if (captureSchema6 != null) {
                            captureSchema6.setSchemaInfo(new CaptureSchema.SchemaInfo(C4496a.a("recover_", relationFrom), bVar3.b));
                        }
                    }
                    independentCaptureViewModel.S1(captureDraftBean2.getCountDownState());
                    independentCaptureViewModel.U1(captureDraftBean2.getCaptureSpeed());
                    MusicInfo musicInfoC = CB0.a.c(new MusicInfo(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null), captureDraftBean2.getBGMInfo());
                    if (musicInfoC != null) {
                        musicInfoC.setInitProgress(bVar3.g / ((long) 1000));
                    }
                    independentCaptureViewModel.g1().e().f190b.postValue(musicInfoC);
                    independentCaptureViewModel.g1().g(musicInfoC);
                    independentCaptureViewModel.g1().e().f195g.put(0, CB0.a.c(new MusicInfo(0L, null, 0, null, null, 0L, 0L, 0L, 0, 0, null, 2047, null), captureDraftBean2.getRecordBgmInfo()));
                    CaptureCooperateBean captureCooperateBean = captureDraftBean2.getCaptureCooperateBean();
                    if (captureCooperateBean != null) {
                        bVar3.h = captureCooperateBean.getOrientationWhenCaptured();
                        bVar3.i = captureCooperateBean.getCaptureMode();
                        if (captureCooperateBean.cooperateAvailable() && (captureSchema = bVar3.a) != null && captureSchema.schemeCooperateAvailable() && (cVar = independentCaptureViewModel.f109312y) != null) {
                            CaptureSchema captureSchema7 = bVar3.a;
                            long coorperateId = 0;
                            if (captureSchema7 != null) {
                                CaptureSchema.CaptureCooperate captureCooperate = captureSchema7.getCaptureCooperate();
                                coorperateId = 0;
                                if (captureCooperate != null) {
                                    coorperateId = captureCooperate.getCoorperateId();
                                }
                            }
                            e eVarA = cVar.f109215c.a();
                            if (eVarA != null) {
                                eVarA.e = coorperateId;
                            }
                        }
                    }
                    MutableLiveData mutableLiveData = dVar.w;
                    Integer num = (Integer) mutableLiveData.getValue();
                    mutableLiveData.postValue(num != null ? x.a(1, num) : null);
                }
                Ah();
                L l7 = this.f109165D;
                if (l7 != null) {
                    l7.x(false);
                }
                Xf().a();
            }
            independentCaptureViewModel.x1(true);
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Of() {
        ViewStub viewStub;
        View viewFindViewById;
        View viewFindViewById2;
        TextView textView;
        G g7 = this.f109162A;
        if (g7 == null || (viewStub = g7.f16776a) == null) {
            return;
        }
        if (g7.f16777b == null) {
            View viewInflate = viewStub.inflate();
            g7.f16777b = viewInflate;
            if (viewInflate != null && (textView = (TextView) viewInflate.findViewById(2131298383)) != null) {
                textView.setText(Build.VERSION.SDK_INT >= 33 ? 2131841845 : 2131842105);
            }
            View view = g7.f16777b;
            if (view != null && (viewFindViewById2 = view.findViewById(2131298381)) != null) {
                viewFindViewById2.setOnClickListener(new LR0.k(g7, 1));
            }
            View view2 = g7.f16777b;
            if (view2 != null && (viewFindViewById = view2.findViewById(2131298382)) != null) {
                viewFindViewById.setOnClickListener(new l(g7, 1));
            }
        }
        ViewStub viewStub2 = g7.f16776a;
        if (viewStub2 != null) {
            g7.f16779d = true;
            viewStub2.setVisibility(0);
        }
    }

    public final void Og(boolean z6) {
        if (z6) {
            n0(kf(2131841801));
            return;
        }
        xh();
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.n();
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Pf(boolean z6) {
        i iVar;
        LC0.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null || (aVar = iVar.f109252a) == null) {
            return;
        }
        aVar.K(z6);
    }

    public final void Pg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.f109297A = true;
        }
        xh();
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 == null || independentCaptureViewModel2.h1() != 0) {
            return;
        }
        Tf(0);
    }

    public final void Qg() {
        C6629b c6629b;
        ValueAnimator valueAnimator;
        C2700s c2700s = this.f109166E;
        if (c2700s != null) {
            TextView textView = c2700s.f16904c;
            if (textView != null) {
                textView.setAlpha(0.0f);
            }
            TextView textView2 = c2700s.f16905d;
            if (textView2 != null) {
                textView2.setAlpha(0.0f);
            }
        }
        f0 f0Var = this.f109167F;
        if (f0Var != null && (c6629b = f0Var.f16857r) != null && (valueAnimator = c6629b.f110225c) != null && valueAnimator.isRunning()) {
            c6629b.f110225c.cancel();
        }
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        Integer numValueOf = independentCaptureViewModel != null ? Integer.valueOf(independentCaptureViewModel.f1()) : null;
        bg(true);
        if (numValueOf == null || numValueOf.intValue() == 1) {
            wh();
            Wf();
            return;
        }
        zh();
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.s(numValueOf.intValue());
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Rf() {
        i iVar;
        LC0.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null || (aVar = iVar.f109252a) == null) {
            return;
        }
        aVar.v0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Rg(@org.jetbrains.annotations.Nullable int[] r4) {
        /*
            r3 = this;
            r0 = r3
            Yv0.c r0 = r0.b
            com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel r0 = (com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel) r0
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L44
            r0 = r6
            r5 = r0
            r0 = r7
            com.bilibili.studio.videoeditor.capturev3.logic.g r0 = r0.f109310w
            if (r0 == 0) goto L44
            r0 = r4
            if (r0 != 0) goto L25
            r0 = r6
            r5 = r0
            goto L44
        L25:
            r0 = r4
            r1 = 7
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            if (r0 == 0) goto L37
            r0 = r4
            r1 = 9
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            if (r0 != 0) goto L42
        L37:
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 13
            boolean r0 = kotlin.collections.ArraysKt.contains(r0, r1)
            if (r0 == 0) goto L44
        L42:
            r0 = 1
            r5 = r0
        L44:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.Rg(int[]):boolean");
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Sf() {
        i iVar;
        LC0.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null || (aVar = iVar.f109252a) == null) {
            return;
        }
        aVar.H();
    }

    public final void Sg() {
        i iVar;
        LC0.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null || (aVar = iVar.f109252a) == null) {
            return;
        }
        aVar.w0();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Tf(int r6) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.Tf(int):void");
    }

    @Nullable
    public final BiliImageView Tg() {
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        return viewOnClickListenerC2701t != null ? viewOnClickListenerC2701t.f16936k : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Uf(Function1 function1, boolean z6) {
        boolean z7;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            String strA = C6597e.a("uper", "android_cv_model_1", "android_cv_model_1.zip", null);
            String strA2 = C6597e.a("uper", "android_cv_model_2", "android_cv_model_2.zip", null);
            String strA3 = C6597e.a("uper", "android_cv_model_3", "android_cv_model_3.zip", null);
            if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2) || TextUtils.isEmpty(strA3) || TextUtils.isEmpty(C6597e.a("uper", "android_cv_model_4", "android_cv_model_4.zip", null))) {
                yh(z6);
                FragmentActivity fragmentActivityP3 = p3();
                CenterPlusMainActivity centerPlusMainActivity = fragmentActivityP3 instanceof CenterPlusMainActivity ? (CenterPlusMainActivity) fragmentActivityP3 : null;
                CenterPlusViewModel centerPlusViewModel = null;
                if (centerPlusMainActivity != null) {
                    centerPlusViewModel = (CenterPlusViewModel) new ViewModelProvider(centerPlusMainActivity).get(CenterPlusViewModel.class);
                }
                if (centerPlusViewModel != null) {
                    centerPlusViewModel.loadOtherCaptureModAsync(new xB0.j(this, function1));
                    return;
                }
                yh(false);
                if (hg()) {
                    function1.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
            boolean z8 = independentCaptureViewModel.f109298B;
            i iVar = independentCaptureViewModel.f109306s;
            if (!z8 && iVar != null) {
                BLog.w("MediaEngineManager", "MediaEngineManager initCvConfigPath");
                long jCurrentTimeMillis = System.currentTimeMillis();
                LC0.a aVar = iVar.f109252a;
                Integer numValueOf = aVar != null ? Integer.valueOf(aVar.z()) : null;
                BLog.e("timee", "initCvConfigPath time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", result = " + numValueOf);
                independentCaptureViewModel.f109298B = numValueOf != null && numValueOf.intValue() == 0;
            }
            if (!independentCaptureViewModel.f109299C && iVar != null) {
                BLog.w("MediaEngineManager", "MediaEngineManager loadModel");
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                LC0.a aVar2 = iVar.f109252a;
                Integer numValueOf2 = null;
                if (aVar2 != null) {
                    numValueOf2 = Integer.valueOf(aVar2.h());
                }
                BLog.e("timee", "loadModel time = " + (System.currentTimeMillis() - jCurrentTimeMillis2) + ", result = " + numValueOf2);
                if (numValueOf2 == null) {
                    z7 = false;
                } else {
                    z7 = false;
                    if (numValueOf2.intValue() == 0) {
                        z7 = true;
                    }
                }
                independentCaptureViewModel.f109299C = z7;
            }
        }
        if (hg()) {
            function1.invoke(Boolean.TRUE);
        }
    }

    @Nullable
    public final TextView Ug() {
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        return viewOnClickListenerC2701t != null ? viewOnClickListenerC2701t.f16937l : null;
    }

    public final void Vf() {
        QB0.b bVar;
        C2689g c2689g = this.f109176y;
        if (c2689g != null) {
            c2689g.h();
        }
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.j();
        }
        C2700s c2700s = this.f109166E;
        if (c2700s != null && (bVar = c2700s.f16902a) != null) {
            bVar.c();
        }
        f0 f0Var = this.f109167F;
        if (f0Var != null) {
            f0Var.k();
        }
    }

    public final int Vg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.f109302o.i : 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Wf() {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.Wf():void");
    }

    @Nullable
    public final CaptureSchema Wg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.f109302o.a : null;
    }

    @NotNull
    public final com.bilibili.studio.videoeditor.capturev3.music.f Xf() {
        return (com.bilibili.studio.videoeditor.capturev3.music.f) this.f109169H.getValue();
    }

    @Nullable
    public final i Xg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.f109306s : null;
    }

    @NotNull
    public com.bilibili.studio.videoeditor.capturev3.music.f Yf() {
        return new com.bilibili.studio.videoeditor.capturev3.music.f();
    }

    @Nullable
    public final String Yg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        String selectFaceSegmentPath = null;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.b bVar = independentCaptureViewModel.f109308u;
            selectFaceSegmentPath = null;
            if (bVar != null) {
                CaptureDraftBean captureDraftBean = bVar.f109210a;
                selectFaceSegmentPath = null;
                if (captureDraftBean != null) {
                    selectFaceSegmentPath = captureDraftBean.getSelectFaceSegmentPath();
                }
            }
        }
        return selectFaceSegmentPath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Zf(float r8) {
        /*
            r7 = this;
            r0 = r7
            android.content.Context r0 = r0.getContext()
            if (r0 != 0) goto Lc
            r0 = 0
            r9 = r0
            goto L11
        Lc:
            r0 = r7
            android.content.res.Resources r0 = r0.getResources()
            r9 = r0
        L11:
            r0 = r9
            if (r0 == 0) goto L2e
            r0 = r9
            r1 = 2131842412(0x7f11556c, float:1.931816E38)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3[r4] = r5
            java.lang.String r0 = r0.getString(r1, r2)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L31
        L2e:
            java.lang.String r0 = ""
            r9 = r0
        L31:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.Zf(float):java.lang.String");
    }

    @Nullable
    public final StickerListItemV3 Zg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.n1() : null;
    }

    public void ag(boolean z6) {
        yB0.d dVar;
        View view;
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.k(z6);
        }
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        if (viewOnClickListenerC2701t != null && (view = viewOnClickListenerC2701t.f16928b) != null) {
            view.setVisibility(z6 ? 4 : 0);
        }
        if (z6) {
            yB0.d dVar2 = this.f109108g;
            if (dVar2 != null) {
                dVar2.b();
                return;
            }
            return;
        }
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || independentCaptureViewModel.p1() || (dVar = this.f109108g) == null) {
            return;
        }
        dVar.a(false);
    }

    @Nullable
    public final String ah() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        String selectUploadPath = null;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.b bVar = independentCaptureViewModel.f109308u;
            selectUploadPath = null;
            if (bVar != null) {
                CaptureDraftBean captureDraftBean = bVar.f109210a;
                selectUploadPath = null;
                if (captureDraftBean != null) {
                    selectUploadPath = captureDraftBean.getSelectUploadPath();
                }
            }
        }
        return selectUploadPath;
    }

    public void b3() {
    }

    public void bg(boolean z6) {
        yB0.d dVar;
        ViewGroup viewGroup;
        L l7 = this.f109165D;
        if (l7 != null) {
            int i7 = z6 ? 4 : 0;
            RelativeLayout relativeLayout = l7.f16784a;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(i7);
            }
            LinearLayout linearLayout = l7.f16789f;
            if (linearLayout != null) {
                linearLayout.setVisibility(!z6 ? 8 : 0);
            }
        }
        ViewGroup viewGroup2 = Xf().f109268e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(z6 ? 4 : 0);
        }
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        if (viewOnClickListenerC2701t != null) {
            int i8 = z6 ? 4 : 0;
            ViewGroup viewGroup3 = viewOnClickListenerC2701t.f16932f;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(i8);
            }
            if (!viewOnClickListenerC2701t.f16927a && (viewGroup = viewOnClickListenerC2701t.f16935j) != null) {
                viewGroup.setVisibility(i8);
            }
            ViewGroup viewGroup4 = viewOnClickListenerC2701t.f16929c;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(i8);
            }
            ViewGroup viewGroup5 = viewOnClickListenerC2701t.f16939n;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(i8);
            }
        }
        if (!z6 || (dVar = this.f109108g) == null) {
            return;
        }
        dVar.b();
    }

    public final boolean bh(@Nullable StickerListItemV3 stickerListItemV3) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        boolean zE = false;
        if (independentCaptureViewModel != null) {
            zE = false;
            if (independentCaptureViewModel.f109310w != null) {
                zE = com.bilibili.studio.videoeditor.capturev3.logic.g.e(stickerListItemV3);
            }
        }
        return zE;
    }

    @NotNull
    public C2689g cg() {
        return new C2689g();
    }

    public final boolean ch(@Nullable int[] iArr) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.v1(iArr) : false;
    }

    @NotNull
    public ViewOnClickListenerC2701t dg() {
        return new ViewOnClickListenerC2701t();
    }

    public final void dh() {
        Yv0.c cVar = ((BaseVMFragment) this).b;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) cVar;
        if (independentCaptureViewModel != null) {
            IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) cVar;
            independentCaptureViewModel.O0(independentCaptureViewModel2 != null ? independentCaptureViewModel2.n1() : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void eg() {
        IndependentCaptureViewModel independentCaptureViewModel;
        qB0.b bVar;
        CaptureSchema captureSchema;
        qB0.b bVar2;
        CaptureSchema captureSchema2;
        Bundle arguments = getArguments();
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null && (bVar2 = independentCaptureViewModel2.f109302o) != null && (captureSchema2 = bVar2.a) != null) {
            captureSchema2.reset();
        }
        if (arguments != null) {
            String string = arguments.getString(CaptureSchema.JUMP_PARAMS_RELATION_FROM, null);
            if (string != null && (independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null && (bVar = independentCaptureViewModel.f109302o) != null && (captureSchema = bVar.a) != null) {
                captureSchema.setSchemaInfo(new CaptureSchema.SchemaInfo(string, string));
            }
            fe(arguments);
            String strA = Xz0.l.a(arguments);
            if (strA != null) {
                Xz0.j.c("first_entrance", strA);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void eh(@org.jetbrains.annotations.Nullable com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3 r7) {
        /*
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r7
            sB0.c r0 = r0.stickerInfo
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L16
            r0 = r7
            int r0 = r0.j
            r8 = r0
            goto L18
        L16:
            r0 = -1
            r8 = r0
        L18:
            r0 = r7
            if (r0 == 0) goto L27
            r0 = r7
            java.lang.String r0 = r0.b
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L2a
        L27:
            java.lang.String r0 = ""
            r7 = r0
        L2a:
            r0 = r6
            Yv0.c r0 = r0.b
            com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel r0 = (com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel) r0
            if (r0 == 0) goto L5e
            r0 = r6
            Yv0.c r0 = r0.b
            com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel r0 = (com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L48
            r0 = r9
            java.lang.String r0 = r0.m1()
            r9 = r0
            goto L4a
        L48:
            r0 = 0
            r9 = r0
        L4a:
            java.lang.String r0 = com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper.f105195a
            r10 = r0
            java.lang.String r0 = "unSelectSticker"
            r1 = r8
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = r7
            java.lang.String r3 = com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper.f105197c
            r4 = r9
            com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper.n(r0, r1, r2, r3, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.eh(com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3):void");
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment, ci0.InterfaceC5259a
    public final void fe(@NotNull Bundle bundle) {
        this.f109117q = new Bundle(bundle);
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel.f109310w;
            if (gVar != null) {
                gVar.f109243p = false;
            }
            String string = bundle.getString("JUMP_PARAMS");
            String str = string;
            if (string == null) {
                str = "";
            }
            independentCaptureViewModel.f109302o.c = str;
            independentCaptureViewModel.E1();
        }
    }

    @NotNull
    public L fg() {
        return new L();
    }

    public final void fh() {
        IndependentCaptureViewModel independentCaptureViewModel;
        C2700s c2700s = this.f109166E;
        if (c2700s == null || (independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b) == null) {
            return;
        }
        independentCaptureViewModel.J1(c2700s.b());
    }

    @NotNull
    public f0 gg() {
        return new f0();
    }

    public final void gh() {
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (gVar = independentCaptureViewModel.f109310w) == null) {
            return;
        }
        gVar.f109236i = null;
    }

    public boolean hg() {
        return true;
    }

    public final void hh(boolean z6) {
        ViewGroup viewGroup;
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        if (viewOnClickListenerC2701t == null || (viewGroup = viewOnClickListenerC2701t.f16935j) == null) {
            return;
        }
        viewGroup.setEnabled(z6);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment, com.bilibili.studio.videoeditor.capturev3.logic.e.a
    public final void i2(int i7, boolean z6) {
        switch (i7) {
            case 32:
                if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
                    HB0.b.f("storage", z6);
                }
                break;
            case 33:
                if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
                    HB0.b.f("photo", z6);
                }
                break;
            case 34:
                if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
                    HB0.b.f("microphone", z6);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ig() {
        return isDetached() || !isAdded();
    }

    public final void ih() {
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        if (viewOnClickListenerC2701t != null) {
            String strKf = kf(2131842075);
            TextView textView = viewOnClickListenerC2701t.f16937l;
            if (textView != null) {
                textView.setText(strKf);
            }
        }
    }

    @Nullable
    public View jf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        M mInflate = M.inflate(layoutInflater, viewGroup, false);
        this.f109175x = mInflate;
        return mInflate.f23620a;
    }

    public boolean jg() {
        ViewBinding viewBinding = this.f109175x;
        M m7 = viewBinding instanceof M ? (M) viewBinding : null;
        boolean z6 = false;
        if (m7 != null) {
            z6 = false;
            if (m7.f23607P.f105318f == 2) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void jh() {
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.v(true);
        }
    }

    public final void kg() {
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.M0(3);
        }
    }

    public final void kh() {
        CaptureFocusExposureView captureFocusExposureView;
        C2689g c2689g = this.f109176y;
        if (c2689g == null || (captureFocusExposureView = c2689g.h) == null) {
            return;
        }
        captureFocusExposureView.setIntecept(false);
    }

    public final void lf() {
        String str;
        IndependentCaptureViewModel independentCaptureViewModel;
        BLog.e("IndependentCaptureFragment", " initData ");
        lB0.a aVarA = lB0.a.a();
        xB0.c cVar = new xB0.c(this);
        aVarA.getClass();
        this.f109173v = lB0.a.b(EventFinishEdit.class, cVar);
        vC0.b.a().b("IndependentCaptureFragment");
        LB0.a aVar = this.f109170I;
        if (aVar != null && (independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            independentCaptureViewModel.f109304q = aVar;
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            if (Kf()) {
                this.f109114n = true;
                str = "contribution";
            } else {
                this.f109114n = false;
                str = EditManager.KEY_FROM_CLIP_VIDEO;
            }
            independentCaptureViewModel2.f109314c = str;
        }
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null) {
            independentCaptureViewModel3.f109302o.f = this.f109114n;
        }
    }

    public final void lg() {
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.M0(2);
        }
        uB0.a aVarB = uB0.a.b();
        Context applicationContext = getApplicationContext();
        aVarB.getClass();
        uB0.a.a(applicationContext);
        vf();
    }

    public final void lh(int i7) {
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.y(i7);
        }
    }

    public final void mg() {
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.M0(1);
        }
        vf();
    }

    public final void mh(@Nullable StickerListItemV3 stickerListItemV3) {
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (gVar = independentCaptureViewModel.f109310w) == null) {
            return;
        }
        gVar.h = stickerListItemV3;
    }

    public final void n0(@Nullable String str) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.a1(str);
        }
    }

    public final void ng(boolean z6) {
        CaptureRecordManager captureRecordManager;
        VideoClipRecordInfo videoClipRecordInfo;
        List<VideoClipRecordInfo.VideoClip> videoClips;
        J j7;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null && (captureRecordManager = independentCaptureViewModel.f109307t) != null && (videoClipRecordInfo = captureRecordManager.f109188a) != null && (videoClips = videoClipRecordInfo.getVideoClips()) != null && !videoClips.isEmpty()) {
            Iterator<T> it = videoClips.iterator();
            while (it.hasNext()) {
                String path = ((VideoClipRecordInfo.VideoClip) it.next()).getPath();
                if (!TextUtils.isEmpty(path) && (j7 = captureRecordManager.f109189b) != null && !j7.b(path)) {
                    PB0.c.a(path);
                }
            }
        }
        if (z6) {
            vh();
            vf();
            return;
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_match_quit_click", "click", independentCaptureViewModel2.f109314c});
            CaptureRecordManager captureRecordManager2 = independentCaptureViewModel2.f109307t;
            if (captureRecordManager2 != null) {
                VideoClipRecordInfo videoClipRecordInfo2 = captureRecordManager2.f109188a;
                if (videoClipRecordInfo2 != null) {
                    videoClipRecordInfo2.removeAll(captureRecordManager2.f109189b);
                }
                IndependentCaptureViewModel independentCaptureViewModel3 = captureRecordManager2.h;
                if (independentCaptureViewModel3 != null) {
                    independentCaptureViewModel3.z1();
                }
            }
            independentCaptureViewModel2.f109302o.g = 0L;
        }
        IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        long jO1 = independentCaptureViewModel4 != null ? independentCaptureViewModel4.o1() : 0L;
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.g(jO1);
        }
        IndependentCaptureViewModel independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel5 != null) {
            qB0.b bVar = independentCaptureViewModel5.f109302o;
            bVar.g = 0L;
            bVar.h = independentCaptureViewModel5.h1();
        }
        A a7 = this.f109168G;
        if (a7 != null) {
            a7.d();
        }
    }

    public final void nh() {
        com.bilibili.studio.videoeditor.capturev3.logic.b bVar;
        CaptureDraftBean captureDraftBean;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (bVar = independentCaptureViewModel.f109308u) == null || (captureDraftBean = bVar.f109210a) == null) {
            return;
        }
        captureDraftBean.setSelectFaceSegmentPath(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void of() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            qB0.d dVar = independentCaptureViewModel.f109301n;
            dVar.c.observe(this, new d(new I0(this, 9)));
            dVar.a.observe(this, new d(new A1(this, 6)));
            dVar.b.observe(this, new d(new J0(this, 4)));
            dVar.g.observe(this, new d(new K0(this, 2)));
            dVar.h.observe(this, new d(new M0(this, 4)));
            dVar.i.observe(this, new d(new N0(this, 8)));
            dVar.j.observeForever(this.f109171J);
            dVar.k.observe(this, new d(new O0(this, 3)));
            dVar.p.observe(this, new d(new P0(this, 3)));
            dVar.q.observe(this, new d(new androidx.room.l(this, 7)));
            dVar.n.observe(this, new d(new Xd.f(this, 4)));
            dVar.o.observe(this, new d(new Xd.l(this, 2)));
            IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel2 != null) {
                qB0.d dVar2 = independentCaptureViewModel2.f109301n;
                dVar2.m.observeForever(this.f109172K);
                dVar2.l.observe(this, new d(new C1476m1(this, 5)));
            }
            com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel.f109310w;
            KB0.a aVar = gVar != null ? gVar.f109250w : null;
            if (aVar != null) {
                aVar.f12711c.observe(this, new d(new xB0.d(this, independentCaptureViewModel)));
                aVar.f12710b.observe(this, new d(new com.bilibili.playerbizcommonv2.web.h(this)));
                aVar.f12712d.observe(this, new d(new C1502v1(this, 2)));
            }
            dVar.r.observe(this, new d(new C1505w1(this, 4)));
            dVar.s.observe(this, new d(new C1508x1(this, 6)));
            dVar.x.observe(this, new d(new y1(this, 5)));
            dVar.y.observe(this, new d(new z1(this, 4)));
            IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel3 != null) {
                AB0.a aVarE = independentCaptureViewModel3.g1().e();
                aVarE.f189a.observe(this, new d(new Z0(this, 7)));
                aVarE.f191c.observe(this, new d(new com.bilibili.ship.theseus.cheese.biz.intro.recommend.m(1, this, aVarE)));
                aVarE.f192d.observe(this, new d(new C1443b1(this, 7)));
                aVarE.f193e.observe(this, new d(new n(1, aVarE, this)));
                aVarE.h.observe(this, new d(new C1449d1(this, 3)));
            }
            IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel4 != null) {
                qB0.d dVar3 = independentCaptureViewModel4.f109301n;
                dVar3.t.observe(this, new d(new xB0.e(this)));
                dVar3.u.observe(this, new d(new C1467j1(this, 5)));
                dVar3.v.observe(this, new d(new C1470k1(this, 5)));
                dVar3.w.observe(this, new d(new C1473l1(this, 7)));
            }
        }
    }

    public final void og() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.R1(true);
        }
    }

    public final void oh(int i7) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel.f109310w;
            if (gVar != null) {
                gVar.f109240m = i7;
            }
            if (gVar != null) {
                gVar.f109241n = i7 == 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        String stringExtra;
        SelectVideo selectVideo;
        CaptureSchema.MissionInfo missionInfo;
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i7, i8, intent);
        if (i7 == 1 && i8 == -1) {
            if (p3() != null) {
                requireActivity().setResult(-1, intent);
                vf();
                return;
            }
            return;
        }
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            CaptureDraftBean captureDraftBean = null;
            qB0.b bVar = independentCaptureViewModel.f109302o;
            if (i7 == 18 && i8 == -1) {
                independentCaptureViewModel.g1().c(intent);
                String string = null;
                if (intent != null) {
                    Bundle extras = intent.getExtras();
                    string = null;
                    if (extras != null) {
                        string = extras.getString("key_bgm_shoot_param");
                    }
                }
                if (bVar.a == null && string != null) {
                    CaptureSchema captureSchema = new CaptureSchema();
                    captureSchema.parseJumpParams(string);
                    bVar.a = captureSchema;
                }
                CaptureSchema captureSchema2 = bVar.a;
                if (captureSchema2 == null || !captureSchema2.schemeMusicAvailable() || (missionInfo = captureSchema2.getMissionInfo()) == null) {
                    return;
                }
                missionInfo.setBgmId(0L);
                return;
            }
            if (i7 == 2 && i8 == -1) {
                List list = (List) (intent != null ? intent.getSerializableExtra("selectVideoList") : null);
                if (V.d(list)) {
                    String str = (list == null || (selectVideo = (SelectVideo) list.get(0)) == null) ? null : selectVideo.videoPath;
                    com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel.f109310w;
                    if (gVar != null) {
                        com.bilibili.studio.videoeditor.capturev3.logic.b bVar2 = independentCaptureViewModel.f109308u;
                        if (bVar2 != null) {
                            captureDraftBean = bVar2.f109210a;
                        }
                        gVar.h(str, independentCaptureViewModel.f109306s, captureDraftBean);
                    }
                    independentCaptureViewModel.f109301n.y.postValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            if (i7 != 3 || i8 != -1 || intent == null || (stringExtra = intent.getStringExtra("capture_schema")) == null) {
                return;
            }
            if (bVar.a == null) {
                bVar.a = new CaptureSchema();
            }
            CaptureSchema captureSchema3 = bVar.a;
            if (captureSchema3 != null) {
                captureSchema3.parseJson(stringExtra, independentCaptureViewModel.f109303p.j);
                bVar.c = String.valueOf(captureSchema3.getJumpParams());
                independentCaptureViewModel.w1();
            }
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public void onDestroy() {
        super.onDestroy();
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.f16799q.removeCallbacks(l7.f16800r);
        }
        vC0.b.a().c("IndependentCaptureFragment");
    }

    public final void onDestroyView() {
        qB0.d dVar;
        MutableLiveData mutableLiveData;
        qB0.d dVar2;
        MutableLiveData mutableLiveData2;
        CaptureFocusExposureView captureFocusExposureView;
        super.onDestroyView();
        release();
        C2689g c2689g = this.f109176y;
        if (c2689g != null && (captureFocusExposureView = c2689g.h) != null) {
            captureFocusExposureView.setCaptureExposureSeekbarListener(null);
        }
        A a7 = this.f109168G;
        if (a7 != null) {
            a7.l();
        }
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null && (dVar2 = independentCaptureViewModel.f109301n) != null && (mutableLiveData2 = dVar2.j) != null) {
            mutableLiveData2.removeObserver(this.f109171J);
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null && (dVar = independentCaptureViewModel2.f109301n) != null && (mutableLiveData = dVar.m) != null) {
            mutableLiveData.removeObserver(this.f109172K);
        }
        this.f109175x = null;
    }

    @Override // NB0.A.a
    public void onFollowTogetherEnterCaptureRelationEvent() {
        long j7;
        dD0.b bVar;
        dD0.b bVar2;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel.f109310w;
            independentCaptureViewModel.O1(gVar != null ? gVar.f109235g : null, true);
        }
        Xf().a();
        ViewOnClickListenerC2701t viewOnClickListenerC2701t = this.f109164C;
        if (viewOnClickListenerC2701t != null) {
            viewOnClickListenerC2701t.h("", true);
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            LB0.a aVar = independentCaptureViewModel2.f109304q;
            qB0.a aVar2 = independentCaptureViewModel2.f109303p;
            if (aVar != null && (bVar2 = aVar.f116375c) != null) {
                long j8 = aVar2.d;
                if (j8 < UpperTimeline.MIN_CLIP_DURATION) {
                    bVar2.a = UpperTimeline.MIN_CLIP_DURATION;
                } else {
                    bVar2.a = j8;
                }
            }
            A a7 = this.f109168G;
            if (a7 != null) {
                JC0.b bVar3 = a7.f16759q;
                j7 = ((long) (bVar3 != null ? bVar3.f11233e : 0)) * 1000;
            } else {
                j7 = 0;
            }
            long j9 = aVar2.c;
            if (j9 <= j7) {
                j7 = j9;
            }
            L l7 = this.f109165D;
            if (l7 != null) {
                CaptureScaleProgressBar captureScaleProgressBar = l7.f16785b;
                if (captureScaleProgressBar != null) {
                    captureScaleProgressBar.setScaleEnabled(false);
                }
                CaptureScaleProgressBar captureScaleProgressBar2 = l7.f16785b;
                if (captureScaleProgressBar2 != null) {
                    captureScaleProgressBar2.setFixedMaxDuration(j7);
                }
            }
            L l8 = this.f109165D;
            if (l8 != null) {
                l8.p(j7);
            }
            LB0.a aVar3 = independentCaptureViewModel2.f109304q;
            if (aVar3 != null && (bVar = aVar3.f116375c) != null) {
                bVar.b = j7;
            }
            aVar2.e = aVar2.d;
        }
    }

    @Override // NB0.A.a
    public void onFollowTogetherExitCaptureRelationEvent() {
        dD0.b bVar;
        dD0.b bVar2;
        CaptureSchema.CaptureCooperate captureCooperate;
        ViewOnClickListenerC2701t viewOnClickListenerC2701t;
        LinkedHashMap<Integer, MusicInfo> linkedHashMap;
        Set<Integer> setKeySet;
        Integer num;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            if (independentCaptureViewModel.f109302o.e) {
                Xf().a();
            } else {
                ViewGroup viewGroup = Xf().f109268e;
                if (viewGroup != null) {
                    viewGroup.setEnabled(true);
                    viewGroup.setAlpha(1.0f);
                }
            }
            AB0.a aVarE = independentCaptureViewModel.g1().e();
            if (aVarE == null || (linkedHashMap = aVarE.f195g) == null || (setKeySet = linkedHashMap.keySet()) == null || (num = (Integer) CollectionsKt.lastOrNull(setKeySet)) == null || num.intValue() != 1) {
                independentCaptureViewModel.g1().f(0, false);
            } else {
                independentCaptureViewModel.g1().f(1, true);
            }
            com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel.f109310w;
            independentCaptureViewModel.O1(gVar != null ? gVar.f109235g : null, false);
        }
        String strKf = kf(2131842226);
        if (strKf != null && (viewOnClickListenerC2701t = this.f109164C) != null) {
            viewOnClickListenerC2701t.h(strKf, false);
        }
        C2689g c2689g = this.f109176y;
        if (c2689g != null) {
            c2689g.p();
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            CaptureSchema captureSchema = independentCaptureViewModel2.f109302o.a;
            if (captureSchema != null && (captureCooperate = captureSchema.getCaptureCooperate()) != null) {
                captureCooperate.setCoorperateId(0L);
            }
            LB0.a aVar = independentCaptureViewModel2.f109304q;
            qB0.a aVar2 = independentCaptureViewModel2.f109303p;
            if (aVar != null && (bVar2 = aVar.f116375c) != null) {
                bVar2.b = aVar2.a;
            }
            if (aVar != null && (bVar = aVar.f116375c) != null) {
                long j7 = aVar2.b;
                if (j7 < UpperTimeline.MIN_CLIP_DURATION) {
                    bVar.a = UpperTimeline.MIN_CLIP_DURATION;
                } else {
                    bVar.a = j7;
                }
            }
            L l7 = this.f109165D;
            if (l7 != null) {
                long j8 = aVar2.a;
                CaptureScaleProgressBar captureScaleProgressBar = l7.f16785b;
                if (captureScaleProgressBar != null) {
                    captureScaleProgressBar.setScaleEnabled(true);
                }
                CaptureScaleProgressBar captureScaleProgressBar2 = l7.f16785b;
                if (captureScaleProgressBar2 != null) {
                    captureScaleProgressBar2.setFixedMaxDuration(j8);
                }
                CaptureScaleProgressBar captureScaleProgressBar3 = l7.f16785b;
                if (captureScaleProgressBar3 != null && !captureScaleProgressBar3.f109369e.isEmpty()) {
                    captureScaleProgressBar3.f109369e.clear();
                }
                CaptureScaleProgressBar captureScaleProgressBar4 = l7.f16785b;
                if (captureScaleProgressBar4 != null) {
                    captureScaleProgressBar4.a();
                }
            }
            L l8 = this.f109165D;
            if (l8 != null) {
                l8.p(aVar2.a);
            }
            aVar2.e = aVar2.b;
        }
    }

    @Override // NB0.A.a
    public void onFollowTogetherSetLiveWindowTouchEvent(boolean z6) {
        h hVar;
        F f7 = this.f109163B;
        if (f7 == null || (hVar = f7.f16774c) == null) {
            return;
        }
        if (z6) {
            hVar.f19763f = true;
        } else {
            hVar.f19763f = false;
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public void onPause() {
        QB0.f fVar;
        PopupWindow popupWindow;
        QB0.f fVar2;
        MediaPlayer mediaPlayer;
        A a7;
        JC0.b bVar;
        i iVar;
        LC0.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel;
        i iVar2;
        LC0.a aVar2;
        com.bilibili.studio.videoeditor.capturev3.music.g<AB0.a> gVarG1;
        i iVar3;
        LC0.a aVar3;
        com.bilibili.studio.videoeditor.capturev3.logic.d dVar;
        Accelerometer accelerometer;
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            independentCaptureViewModel2.y1(hg());
        }
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null && (dVar = independentCaptureViewModel3.f109305r) != null && (accelerometer = dVar.f109217a) != null && accelerometer.f109186b) {
            accelerometer.f109186b = false;
            accelerometer.f109185a.unregisterListener(accelerometer.f109187c);
        }
        if (hg()) {
            Yv0.c cVar = ((BaseVMFragment) this).b;
            IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) cVar;
            boolean z6 = independentCaptureViewModel4 != null ? independentCaptureViewModel4.f109302o.k : false;
            this.f109116p = 0L;
            L l7 = this.f109165D;
            if (l7 != null) {
                l7.f16798p = true;
            }
            IndependentCaptureViewModel independentCaptureViewModel5 = (IndependentCaptureViewModel) cVar;
            if (independentCaptureViewModel5 != null) {
                independentCaptureViewModel5.O0(independentCaptureViewModel5.n1());
            }
            IndependentCaptureViewModel independentCaptureViewModel6 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel6 != null) {
                independentCaptureViewModel6.T1(false);
            }
            A a8 = this.f109168G;
            if (a8 != null && a8.f16759q != null) {
                xh();
                IndependentCaptureViewModel independentCaptureViewModel7 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
                if (independentCaptureViewModel7 != null && (iVar3 = independentCaptureViewModel7.f109306s) != null && (aVar3 = iVar3.f109252a) != null) {
                    aVar3.J(true, z6);
                }
            }
            IndependentCaptureViewModel independentCaptureViewModel8 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel8 != null && (gVarG1 = independentCaptureViewModel8.g1()) != null) {
                gVarG1.d();
            }
            IndependentCaptureViewModel independentCaptureViewModel9 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel9 != null && (iVar = independentCaptureViewModel9.f109306s) != null && (aVar = iVar.f109252a) != null && (aVar.q() & 2) != 0 && (independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null && (iVar2 = independentCaptureViewModel.f109306s) != null && (aVar2 = iVar2.f109252a) != null) {
                aVar2.b0();
            }
            IndependentCaptureViewModel independentCaptureViewModel10 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel10 != null && independentCaptureViewModel10.s1() && (a7 = this.f109168G) != null && (bVar = a7.f16759q) != null && bVar.f11234f == 102) {
                bVar.b();
            }
            f0 f0Var = this.f109167F;
            if (f0Var != null && (fVar = f0Var.f16862w) != null && (popupWindow = fVar.f125317a) != null && popupWindow.isShowing() && (fVar2 = f0Var.f16862w) != null && (mediaPlayer = fVar2.f19750e) != null) {
                mediaPlayer.pause();
            }
            IndependentCaptureViewModel independentCaptureViewModel11 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            int i7 = 1;
            if (independentCaptureViewModel11 != null) {
                i iVar4 = independentCaptureViewModel11.f109306s;
                i7 = 1;
                if (iVar4 != null) {
                    i7 = iVar4.f109254c;
                }
            }
            j.a(getApplicationContext()).c("DeviceIndex", i7);
            IndependentCaptureViewModel independentCaptureViewModel12 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel12 != null) {
                com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel12.f109310w;
                independentCaptureViewModel12.P1(gVar != null ? gVar.f109235g : null, false);
            }
        }
        super.onPause();
    }

    public void onResume() {
        com.bilibili.studio.videoeditor.capturev3.logic.d dVar;
        Accelerometer accelerometer;
        Object objAccess$hitPrivacyCache;
        super.onResume();
        boolean zHg = hg();
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.A1(zHg);
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null && (dVar = independentCaptureViewModel2.f109305r) != null && (accelerometer = dVar.f109217a) != null && !accelerometer.f109186b) {
            accelerometer.f109186b = true;
            Accelerometer.f109184d = Accelerometer.CLOCKWISE_ANGLE.Deg90;
            SensorManager sensorManager = accelerometer.f109185a;
            Accelerometer.a aVar = accelerometer.f109187c;
            PrivacyHelper.b bVar = PrivacyHelper.b.f85845d;
            try {
                PrivacyHelper privacyHelper = PrivacyHelper.INSTANCE;
                if (!privacyHelper.hookEnable$privacy_release("sm_get_default_sensor_1")) {
                    PrivacyHelper.f85841g.i("hook disable, tag: [sm_get_default_sensor_1]", null);
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    objAccess$hitPrivacyCache = null;
                    if (defaultSensor != null) {
                        objAccess$hitPrivacyCache = defaultSensor;
                    }
                } else if (!privacyHelper.checkPrivacy$privacy_release("sm_get_default_sensor_1")) {
                    PrivacyHelper.f85841g.i("user deny, tag: [sm_get_default_sensor_1] defaultReturnValue = [null]", null);
                    objAccess$hitPrivacyCache = null;
                } else if (privacyHelper.forbiddenUse$privacy_release("sm_get_default_sensor_1")) {
                    PrivacyHelper.f85841g.i("use forbidden, tag: [sm_get_default_sensor_1] defaultReturnValue = [null]", null);
                    objAccess$hitPrivacyCache = null;
                } else {
                    objAccess$hitPrivacyCache = PrivacyHelper.access$hitPrivacyCache(privacyHelper, "sm_get_default_sensor_1");
                    if (objAccess$hitPrivacyCache == null) {
                        objAccess$hitPrivacyCache = sensorManager.getDefaultSensor(1);
                        if (objAccess$hitPrivacyCache == null) {
                            objAccess$hitPrivacyCache = null;
                        }
                        if (objAccess$hitPrivacyCache != null) {
                            privacyHelper.getPrivacyCache().put("sm_get_default_sensor_1", new PrivacyHelper.a(objAccess$hitPrivacyCache, PrivacyHelper.access$getDDCacheTime(privacyHelper, "sm_get_default_sensor_1", bVar)));
                        }
                        PrivacyHelper.f85841g.i("runOnPrivacyControl tag: sm_get_default_sensor_1", null);
                    }
                }
            } catch (Throwable th) {
                if (PrivacyHelper.f85837c) {
                    v.b("catch error. tag: sm_get_default_sensor_1, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", th);
                    objAccess$hitPrivacyCache = null;
                } else {
                    v.b("catch error. tag: sm_get_default_sensor_1, message = ", th.getMessage(), PrivacyHelper.f85841g, "privacy_", null);
                    objAccess$hitPrivacyCache = null;
                }
            }
            sensorManager.registerListener(aVar, (Sensor) objAccess$hitPrivacyCache, 3);
        }
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null) {
            independentCaptureViewModel3.D1();
        }
        if (zHg) {
            Mf(-1, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        CaptureSchema captureSchema;
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onSaveInstanceState(bundle);
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (captureSchema = independentCaptureViewModel.f109302o.a) == null) {
            return;
        }
        bundle.putString("JUMP_PARAMS", captureSchema.getJumpParams());
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public void onStop() {
        com.bilibili.studio.videoeditor.capturev3.logic.d dVar;
        d.a aVar;
        super.onStop();
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (dVar = independentCaptureViewModel.f109305r) == null || (aVar = dVar.f109218b) == null) {
            return;
        }
        aVar.disable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super/*com.bilibili.lib.ui.BaseFragment*/.onViewCreated(view, bundle);
        BLog.e("IndependentCaptureFragment", "onViewCreated userVisibleHint=" + getUserVisibleHint() + " ");
        if (getUserVisibleHint()) {
            yf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void pf() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z6 = arguments.getBoolean("is_new_ui", false);
            String string = arguments.getString(CaptureSchema.JUMP_PARAMS_RELATION_FROM, "");
            boolean z7 = arguments.getBoolean("selectVideoList", false);
            IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel != null) {
                ay.b.a(C1600d.b("loadDataFromIntent  isNewUI=", ",relation=", string, ",isFromEditor=", z6), z7, "IndependentCaptureViewModel");
                qB0.b bVar = independentCaptureViewModel.f109302o;
                bVar.d = z6;
                bVar.e = z7;
                if (bVar.a == null) {
                    bVar.a = new CaptureSchema();
                }
                bVar.a.setSchemaInfo(new CaptureSchema.SchemaInfo(string, string));
                bVar.b = string;
            }
        }
    }

    public final void pg(float f7) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.U1(f7);
        }
        List<String> list = HB0.a.f8154a;
        HashMap mapC = O4.b.c("speed", f7 + "x");
        mapC.put("first_entrance", Xz0.j.a("first_entrance"));
        mapC.put("track_id", Xz0.g.d());
        mapC.put("router_topic_id", Xz0.g.f28463b);
        Neurons.reportClick(false, "creation.video-shoot.video-speed.0.click", mapC);
    }

    public final void ph() {
        com.bilibili.studio.videoeditor.capturev3.logic.b bVar;
        CaptureDraftBean captureDraftBean;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (bVar = independentCaptureViewModel.f109308u) == null || (captureDraftBean = bVar.f109210a) == null) {
            return;
        }
        captureDraftBean.setSelectUploadPath(null);
    }

    public final boolean qg(@Nullable FilterListItemV3 filterListItemV3) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        boolean zH0 = false;
        if (independentCaptureViewModel != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.a aVar = independentCaptureViewModel.f109309v;
            zH0 = false;
            if (aVar != null) {
                aVar.f109208n = filterListItemV3;
                i iVar = aVar.f109196a;
                LC0.a aVar2 = iVar.f109252a;
                if (aVar2 != null) {
                    aVar2.j();
                }
                zH0 = false;
                if (filterListItemV3 != null) {
                    FilterInfo filterInfo = filterListItemV3.getFilterInfo();
                    zH0 = false;
                    if (filterInfo != null) {
                        String str = filterInfo.filter_path;
                        if (str == null || str.length() == 0) {
                            zH0 = false;
                            if (filterInfo.getId() == -1) {
                                zH0 = true;
                            }
                        } else {
                            String str2 = filterInfo.filter_path;
                            int filterType = filterInfo.getFilterType();
                            float f7 = filterInfo.filter_intensity;
                            LC0.a aVar3 = iVar.f109252a;
                            zH0 = false;
                            if (aVar3 != null) {
                                zH0 = aVar3.h0(filterType, iVar.f109253b, str2, false);
                                aVar3.j0(f7, filterType, false);
                            }
                        }
                        Xpref.getSharedPreferences(aVar.f109197b, "editor_config").edit().putInt("beautify_filter_select_id_v3", filterInfo.getId()).apply();
                        aVar.f109200e = 1;
                    }
                }
            }
        }
        return zH0;
    }

    public final void qh(boolean z6) {
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (gVar = independentCaptureViewModel.f109310w) == null) {
            return;
        }
        gVar.f109239l = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void release() {
        ValueAnimator valueAnimator;
        PopupWindow popupWindow;
        sB0.c cVar;
        vB0.b bVar;
        GLTextureView gLTextureView;
        com.bilibili.studio.videoeditor.capturev3.logic.d dVar;
        d.a aVar;
        if (BaseCaptureFragment.f109105u.contains(Integer.valueOf(hashCode()))) {
            UB0.b.b();
            IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel != null && (dVar = independentCaptureViewModel.f109305r) != null && (aVar = dVar.f109218b) != null) {
                aVar.disable();
            }
            IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel2 != null) {
                boolean zLf = BaseCaptureFragment.Lf();
                i iVar = independentCaptureViewModel2.f109306s;
                if (zLf) {
                    if (iVar != null) {
                        BLog.e("MediaEngineManager", " engineRelease engine=" + iVar.f109252a);
                        LC0.a aVar2 = iVar.f109252a;
                        if (aVar2 != null) {
                            aVar2.l();
                        }
                    }
                    independentCaptureViewModel2.g1().release();
                } else if (iVar != null) {
                    BLog.e("MediaEngineManager", " engineDestroy engine=" + iVar.f109252a);
                    LC0.a aVar3 = iVar.f109252a;
                    if (aVar3 != null) {
                        aVar3.V();
                    }
                }
                if (iVar != null) {
                    iVar.f109252a = null;
                }
            }
            zB0.d dVarA = zB0.d.a();
            dVarA.getClass();
            zB0.d.c = null;
            dVarA.a = null;
            dVarA.b = false;
            A a7 = this.f109168G;
            if (a7 != null) {
                a7.l();
                a7.f16744a = null;
                a7.f16745b = null;
                a7.f16746c = null;
                a7.f16755m = null;
                a7.f16758p = null;
                a7.f16760r = null;
                a7.f16761s = null;
                a7.f16762t = null;
                a7.f16763u = null;
                a7.f16764v = null;
                JC0.b bVar2 = a7.f16759q;
                if (bVar2 != null) {
                    LC0.a aVar4 = bVar2.f11228k;
                    if (aVar4 != null) {
                        aVar4.c0();
                        bVar2.f11228k = null;
                    }
                    bVar2.f11227j = null;
                    bVar2.f11226i = null;
                }
                a7.f16759q = null;
                FTPlayView fTPlayView = a7.f16747d;
                if (fTPlayView != null && (gLTextureView = fTPlayView.getGLTextureView()) != null) {
                    gLTextureView.f109831m = true;
                }
                a7.f16747d = null;
            }
            this.f109168G = null;
            IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel3 != null) {
                com.bilibili.studio.videoeditor.capturev3.logic.c cVar2 = independentCaptureViewModel3.f109312y;
                if (cVar2 != null) {
                    e eVarA = cVar2.f109215c.a();
                    if (eVarA != null) {
                        eVarA.b = null;
                    }
                    cVar2.f109216d = null;
                }
                independentCaptureViewModel3.f109312y = null;
            }
            C2700s c2700s = this.f109166E;
            if (c2700s != null && (bVar = c2700s.f16916p) != null) {
                Set<Map.Entry> setEntrySet = bVar.f.entrySet();
                if (!setEntrySet.isEmpty()) {
                    for (Map.Entry entry : setEntrySet) {
                        b.b bVar3 = (b.b) entry.getValue();
                        if (bVar3 != null) {
                            int iIntValue = ((Integer) entry.getKey()).intValue();
                            ModResourceClient.getInstance().unsubscribe("uper", iIntValue != 2 ? iIntValue != 3 ? "uper_bmm2_0_new_default_lut" : "editor_filter_default" : "uper_capture_new_defualt_filter", bVar3);
                        }
                    }
                    bVar.f.clear();
                }
            }
            IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel4 != null) {
                com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel4.f109310w;
                if (gVar != null) {
                    C2401b c2401b = gVar.f109245r;
                    if (c2401b != null) {
                        if (c2401b.f11140a != null) {
                            for (int i7 = 0; i7 < c2401b.f11140a.size(); i7++) {
                                StickerListItemV3 stickerListItemV3 = c2401b.f11140a.get(i7);
                                if (stickerListItemV3 != null && (cVar = stickerListItemV3.stickerInfo) != null) {
                                    c2401b.a(cVar.j, "cancel by closed");
                                }
                            }
                        }
                        SparseArray<InterfaceC2400a> sparseArray = c2401b.f11141b;
                        if (sparseArray != null) {
                            sparseArray.clear();
                        }
                    }
                    gVar.f109245r = null;
                    gVar.f109246s = null;
                    gVar.f109247t = null;
                    gVar.f109248u = null;
                    gVar.f109249v = null;
                }
                independentCaptureViewModel4.f109310w = null;
            }
            f0 f0Var = this.f109167F;
            if (f0Var != null) {
                QB0.f fVar = f0Var.f16862w;
                if (fVar != null && (popupWindow = fVar.f125317a) != null && popupWindow.isShowing()) {
                    QB0.f.b(fVar.f125317a);
                }
                f0Var.f16862w = null;
                WeakHandler weakHandler = f0Var.f16864y;
                if (weakHandler != null) {
                    weakHandler.release();
                }
                f0Var.f16864y = null;
                f0Var.f16865z = null;
                C6629b c6629b = f0Var.f16857r;
                if (c6629b != null && (valueAnimator = c6629b.f110225c) != null && valueAnimator.isRunning()) {
                    c6629b.f110225c.cancel();
                }
                f0Var.f16857r = null;
            }
            this.f109167F = null;
            a.a aVar5 = this.f109173v;
            if (aVar5 != null) {
                aVar5.a();
            }
            if (BaseCaptureFragment.Lf()) {
                this.f109166E = null;
                IndependentCaptureViewModel independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
                if (independentCaptureViewModel5 != null) {
                    independentCaptureViewModel5.f109309v = null;
                }
                a.a aVar6 = this.f109174w;
                if (aVar6 != null) {
                    aVar6.a();
                }
            }
            super.release();
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void rf() {
        h hVar;
        IndependentCaptureViewModel independentCaptureViewModel;
        i iVar;
        F f7 = this.f109163B;
        if (f7 == null || (hVar = f7.f16774c) == null || (independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b) == null || (iVar = independentCaptureViewModel.f109306s) == null) {
            return;
        }
        LC0.a aVar = iVar.f109252a;
        BLog.e("MediaEngineManager", "attachLiveWindow result=" + (aVar != null ? Boolean.valueOf(aVar.w(BiliContext.application(), hVar.f19758a, iVar)) : null));
    }

    public final void rg(int i7, @NotNull String str) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.J0(i7, str);
        }
    }

    public final void rh(@Nullable StickerListItemV3 stickerListItemV3, boolean z6) {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            independentCaptureViewModel.O1(stickerListItemV3, z6);
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void setUserVisibleCompat(boolean z6) {
        com.bilibili.studio.videoeditor.capturev3.logic.d dVar;
        d.a aVar;
        super.setUserVisibleCompat(z6);
        if (z6) {
            IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel != null) {
                independentCaptureViewModel.D1();
                return;
            }
            return;
        }
        Vf();
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 == null || (dVar = independentCaptureViewModel2.f109305r) == null || (aVar = dVar.f109218b) == null) {
            return;
        }
        aVar.disable();
    }

    public final void sg(@NotNull String str) {
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            List<String> list = HB0.a.f8154a;
            Cg.l.a("beautify_model_name", str, "creation.video-shoot.beautify.beautify-model.click", false);
        }
    }

    public final void sh(@Nullable StickerListItemV3 stickerListItemV3) {
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (gVar = independentCaptureViewModel.f109310w) == null) {
            return;
        }
        gVar.k(stickerListItemV3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void tf() {
        /*
            r9 = this;
            r0 = r9
            Yv0.c r0 = r0.b
            com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel r0 = (com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L8e
            r0 = r11
            com.bilibili.studio.videoeditor.capturev3.logic.i r0 = r0.f109306s
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L1f
            r0 = r12
            com.bilibili.studio.videoeditor.media.performance.a r1 = com.bilibili.studio.videoeditor.media.performance.a.e()
            int r1 = r1.f()
            r0.f109253b = r1
        L1f:
            r0 = r12
            if (r0 == 0) goto L2e
            r0 = r12
            int r0 = r0.f109253b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11 = r0
            goto L30
        L2e:
            r0 = 0
            r11 = r0
        L30:
            r0 = r11
            if (r0 != 0) goto L37
            goto L3e
        L37:
            r0 = r11
            int r0 = r0.intValue()
            if (r0 == 0) goto L4f
        L3e:
            r0 = 1
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L47
            goto L51
        L47:
            r0 = r11
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L51
        L4f:
            r0 = 2
            r10 = r0
        L51:
            com.bilibili.lib.infoeyes.InfoEyesManager r0 = com.bilibili.lib.infoeyes.InfoEyesManager.getInstance()
            r1 = 0
            java.lang.String r2 = "000225"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "shoot_resolution_click"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "click"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = r10
            java.lang.String r7 = ""
            java.lang.String r6 = androidx.media3.common.C4618g.a(r6, r7)
            r4[r5] = r6
            r0.report2(r1, r2, r3)
            r0 = r12
            if (r0 == 0) goto L8e
            LC0.a$a r0 = LC0.a.f14503a
            java.lang.Class r0 = r0.getClass()
            r0 = r12
            kotlin.Lazy<IC0.j> r1 = LC0.a.C0075a.f14505b
            java.lang.Object r1 = r1.getValue()
            LC0.a r1 = (LC0.a) r1
            r0.f109252a = r1
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.tf():void");
    }

    public final void tg(@Nullable FilterListItemV3 filterListItemV3) {
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar;
        FilterInfo filterInfo;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (aVar = independentCaptureViewModel.f109309v) == null) {
            return;
        }
        i iVar = aVar.f109196a;
        if (filterListItemV3 != null && (filterInfo = filterListItemV3.getFilterInfo()) != null) {
            double d7 = filterInfo.filter_intensity;
            int filterType = filterInfo.getFilterType();
            LC0.a aVar2 = iVar.f109252a;
            if (aVar2 != null) {
                aVar2.j0(d7, filterType, false);
            }
        }
        aVar.f109199d = 1;
    }

    public void th() {
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void uf() {
        i iVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null) {
            return;
        }
        BLog.e("MediaEngineManager", " engineDestroy engine=" + iVar.f109252a);
        LC0.a aVar = iVar.f109252a;
        if (aVar != null) {
            aVar.V();
        }
    }

    public final void ug(@Nullable FilterListItemV3 filterListItemV3) {
        String str;
        String str2;
        FilterInfo filterInfo;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            str = "";
            if (filterListItemV3 == null || (filterInfo = filterListItemV3.getFilterInfo()) == null) {
                str2 = "";
            } else {
                String str3 = filterInfo.filter_id;
                String str4 = str3;
                if (str3 == null) {
                    str4 = "";
                }
                String str5 = filterInfo.filter_name;
                str = str4;
                str2 = str5 != null ? str5 : "";
            }
            String strM1 = independentCaptureViewModel.m1();
            String str6 = CenterPlusStatisticsHelper.f105195a;
            CenterPlusStatisticsHelper.n("filterClick", str, str2, CenterPlusStatisticsHelper.f105197c, strM1);
            List<String> list = HB0.a.f8154a;
            Cg.l.a("filter_name", str2, "creation.video-shoot.beautify.filter-choose.click", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uh() {
        /*
            Method dump skipped, instruction units count: 1407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.uh():void");
    }

    public final void vg() {
        com.bilibili.studio.videoeditor.capturev3.logic.a aVar;
        ArrayList<CaptureMakeupEntity> arrayList;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (aVar = independentCaptureViewModel.f109309v) == null || (arrayList = aVar.f109205k) == null) {
            return;
        }
        for (CaptureMakeupEntity captureMakeupEntity : arrayList) {
            if (captureMakeupEntity.isSelect) {
                aVar.f109202g = captureMakeupEntity.id;
                return;
            }
        }
    }

    public final void vh() {
        LC0.a aVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        Integer numValueOf = null;
        String strL1 = independentCaptureViewModel != null ? independentCaptureViewModel.l1() : null;
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            i iVar = independentCaptureViewModel2.f109306s;
            numValueOf = Integer.valueOf((iVar == null || (aVar = iVar.f109252a) == null) ? 0 : (int) aVar.B());
        }
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null) {
            String str = strL1;
            if (strL1 == null) {
                str = "";
            }
            InfoEyesManager.getInstance().report2(false, "000225", new String[]{"shoot_resolution", "click", independentCaptureViewModel3.f109314c, String.valueOf(2), str, String.valueOf(numValueOf != null ? numValueOf.intValue() : 0)});
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void wg() {
        /*
            Method dump skipped, instruction units count: 2394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment.wg():void");
    }

    public void wh() {
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void xf() {
        ViewStub viewStub;
        G g7 = this.f109162A;
        if (g7 == null || (viewStub = g7.f16776a) == null) {
            return;
        }
        g7.f16779d = false;
        viewStub.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // 
    @NotNull
    /* JADX INFO: renamed from: xg, reason: merged with bridge method [inline-methods] */
    public IndependentCaptureViewModel mf() {
        return (IndependentCaptureViewModel) new ViewModelProvider(this).get(IndependentCaptureViewModel.class);
    }

    public final void xh() {
        i iVar;
        LC0.a aVar;
        LC0.a aVar2;
        StickerListItemV3 stickerListItemV3;
        com.bilibili.studio.videoeditor.capturev3.logic.c cVar;
        i iVar2;
        LC0.a aVar3;
        i iVar3;
        LC0.a aVar4;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || (iVar = independentCaptureViewModel.f109306s) == null || (aVar = iVar.f109252a) == null || aVar.v() != 2) {
            return;
        }
        i iVar4 = independentCaptureViewModel.f109306s;
        if (iVar4 != null && (aVar3 = iVar4.f109252a) != null && (aVar3.q() & 2) != 0 && (iVar3 = independentCaptureViewModel.f109306s) != null && (aVar4 = iVar3.f109252a) != null) {
            aVar4.b0();
        }
        if (independentCaptureViewModel.s1() && (cVar = independentCaptureViewModel.f109312y) != null && (iVar2 = cVar.f109213a) != null) {
            LC0.a aVar5 = iVar2.f109252a;
            if (aVar5 != null) {
                aVar5.N(1.0f);
            }
            LC0.a aVar6 = iVar2.f109252a;
            if (aVar6 != null) {
                aVar6.n0();
            }
        }
        com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel.f109310w;
        if (gVar != null && (stickerListItemV3 = gVar.f109235g) != null) {
            independentCaptureViewModel.P1(stickerListItemV3, false);
        }
        if (independentCaptureViewModel.f109307t == null || (aVar2 = iVar.f109252a) == null || aVar2.v() != 2) {
            return;
        }
        aVar2.I();
    }

    public final void yg(@NotNull KC0.a aVar, boolean z6) {
        String strE;
        com.bilibili.studio.videoeditor.capturev3.logic.c cVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            if (z6) {
                com.bilibili.studio.videoeditor.capturev3.logic.b bVar = independentCaptureViewModel.f109308u;
                strE = "";
                if (bVar != null) {
                    CaptureDraftBean captureDraftBean = bVar.f109211b;
                    strE = "";
                    if (captureDraftBean != null) {
                        CaptureCooperateBean captureCooperateBean = captureDraftBean.getCaptureCooperateBean();
                        strE = "";
                        if (captureCooperateBean != null) {
                            strE = captureCooperateBean.getMaterialPath();
                            if (strE == null) {
                                strE = "";
                            }
                        }
                    }
                }
            } else {
                com.bilibili.studio.videoeditor.capturev3.logic.c cVar2 = independentCaptureViewModel.f109312y;
                strE = "";
                if (cVar2 != null) {
                    strE = cVar2.e();
                }
            }
            if (TextUtils.isEmpty(strE) || (cVar = independentCaptureViewModel.f109312y) == null) {
                return;
            }
            e eVarA = cVar.f109215c.a();
            if (eVarA != null) {
                Xz0.d dVar = Xz0.d.f28458a;
                long j7 = eVarA.e;
                dVar.getClass();
                Xz0.d.y("capture", "success", "cooperate", String.valueOf(j7), null);
            }
            i iVar = cVar.f109213a;
            if (iVar != null) {
                Context context = cVar.f109214b;
                LC0.a aVar2 = iVar.f109252a;
                if (aVar2 != null) {
                    aVar2.e0(context, strE, aVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void yh(boolean z6) {
        if (activityDie()) {
            return;
        }
        ViewBinding viewBinding = this.f109175x;
        M m7 = viewBinding instanceof M ? (M) viewBinding : null;
        if (m7 != null) {
            GeneralModLoadingView2 generalModLoadingView2 = m7.f23607P;
            if (!z6) {
                generalModLoadingView2.setVisibility(8);
                return;
            }
            generalModLoadingView2.f105315c = kf(2131842107);
            generalModLoadingView2.f105317e = true;
            generalModLoadingView2.f105314b = new C1499u1(m7, 3);
            generalModLoadingView2.onLoading();
            generalModLoadingView2.setVisibility(0);
        }
    }

    public final int zg() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        return independentCaptureViewModel != null ? independentCaptureViewModel.f109302o.i : 31;
    }

    public final void zh() {
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            long jO1 = independentCaptureViewModel.o1();
            if (jO1 <= 0) {
                L l7 = this.f109165D;
                if (l7 != null) {
                    l7.w("");
                    return;
                }
                return;
            }
            String strZf = Zf(jO1 / 1000000.0f);
            L l8 = this.f109165D;
            if (l8 != null) {
                l8.w(strZf);
            }
        }
    }
}
