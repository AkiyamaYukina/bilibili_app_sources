package com.bilibili.studio.videoeditor.capturev3.fragment;

import By0.A0;
import By0.B0;
import By0.D0;
import By0.F0;
import NB0.A;
import NB0.C2689g;
import NB0.F;
import NB0.L;
import NB0.ViewOnClickListenerC2701t;
import NB0.f0;
import OB0.e;
import QB0.h;
import Yv0.c;
import android.app.Application;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.g;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;
import com.bilibili.base.BiliContext;
import com.bilibili.moduleservice.upper.ICenterPlusContainer;
import com.bilibili.moduleservice.upper.ICenterPlusTab;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.base.BaseVMFragment;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.widgets.CenterPlusActivityDialog;
import com.bilibili.studio.centerplus.widgets.GeneralModLoadingView2;
import com.bilibili.studio.videoeditor.capturev3.data.VideoClipRecordInfo;
import com.bilibili.studio.videoeditor.capturev3.draft.CaptureDraftBean;
import com.bilibili.studio.videoeditor.capturev3.draft.ClipBean;
import com.bilibili.studio.videoeditor.capturev3.logic.CaptureRecordManager;
import com.bilibili.studio.videoeditor.capturev3.logic.i;
import com.bilibili.studio.videoeditor.capturev3.music.f;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.capturev3.widget.CaptureScaleProgressBar;
import com.bilibili.studio.videoeditor.util.DensityUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import zB0.d;
import zB0.j;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/ForwardCaptureFragment.class */
public final class ForwardCaptureFragment extends IndependentCaptureFragment<com.bilibili.studio.videoeditor.capturev3.viewmodel.b> implements ICenterPlusTab {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f109153Q = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public com.bilibili.topix.topixset.a f109154M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f109155N = true;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f109156O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f109157P;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/ForwardCaptureFragment$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ForwardCaptureFragment f109158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.bilibili.studio.videoeditor.capturev3.viewmodel.b f109159b;

        public a(ForwardCaptureFragment forwardCaptureFragment, com.bilibili.studio.videoeditor.capturev3.viewmodel.b bVar) {
            this.f109158a = forwardCaptureFragment;
            this.f109159b = bVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/fragment/ForwardCaptureFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f109160a;

        public b(Function1 function1) {
            this.f109160a = function1;
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
            return this.f109160a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f109160a.invoke(obj);
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void Bh(long j7, boolean z6) {
        LinearLayout linearLayout;
        dD0.b bVar;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            LB0.a aVar = independentCaptureViewModel.f109304q;
            String strZf = Zf(Math.min((aVar == null || (bVar = aVar.f116375c) == null) ? 0L : bVar.b, j7) / 1000000.0f);
            L l7 = this.f109165D;
            if (l7 != null) {
                l7.w(strZf);
            }
            if (z6) {
                return;
            }
            L l8 = this.f109165D;
            if (l8 != null) {
                l8.x(true);
            }
            C2689g c2689g = this.f109176y;
            if (!(c2689g instanceof OB0.a) || (linearLayout = ((OB0.a) c2689g).f17741A) == null) {
                return;
            }
            int iDp2px = DensityUtil.dp2px(19);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iDp2px;
                linearLayout.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, NB0.ViewOnClickListenerC2701t.a
    public final void C3() {
        Integer numValueOf;
        CaptureSchema.MissionInfo missionInfo;
        com.bilibili.topix.topixset.a aVar = this.f109154M;
        if (aVar == null) {
            super.C3();
            return;
        }
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        String strM1 = independentCaptureViewModel != null ? independentCaptureViewModel.m1() : null;
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            CaptureSchema captureSchema = independentCaptureViewModel2.f109302o.a;
            numValueOf = Integer.valueOf((captureSchema == null || (missionInfo = captureSchema.getMissionInfo()) == null) ? 0 : missionInfo.getMissionId());
        } else {
            numValueOf = null;
        }
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.U0(numValueOf, strM1);
        }
        aVar.onClick((View) null);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void Ff() {
        super.Ff();
        BLog.d("ForwardCaptureFragment", " viewModel=" + ((BaseVMFragment) this).b + ", binding=" + this.f109175x);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, NB0.C2689g.a
    public final void K3() {
        c cVar = ((BaseVMFragment) this).b;
        if (cVar instanceof com.bilibili.studio.videoeditor.capturev3.viewmodel.b) {
            ((com.bilibili.studio.videoeditor.capturev3.viewmodel.b) cVar).T1(!r0.r1());
            boolean zR1 = ((IndependentCaptureViewModel) ((BaseVMFragment) this).b).r1();
            ((IndependentCaptureViewModel) ((BaseVMFragment) this).b).getClass();
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.N0(zR1);
            ((IndependentCaptureViewModel) ((BaseVMFragment) this).b).J0(1, "flash");
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, NB0.C2689g.a
    public final void N0() {
        CaptureDraftBean captureDraftBean;
        List<ClipBean> videoClips;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            if (independentCaptureViewModel.p1()) {
                CaptureRecordManager captureRecordManager = independentCaptureViewModel.f109307t;
                if (captureRecordManager != null) {
                    VideoClipRecordInfo videoClipRecordInfo = captureRecordManager.f109188a;
                    if (videoClipRecordInfo != null) {
                        videoClipRecordInfo.removeAll(captureRecordManager.f109189b);
                    }
                    IndependentCaptureViewModel independentCaptureViewModel2 = captureRecordManager.h;
                    if (independentCaptureViewModel2 != null) {
                        independentCaptureViewModel2.z1();
                    }
                }
                qB0.b bVar = independentCaptureViewModel.f109302o;
                bVar.g = 0L;
                L l7 = this.f109165D;
                if (l7 != null) {
                    CaptureScaleProgressBar captureScaleProgressBar = l7.f16785b;
                    if (captureScaleProgressBar != null && !captureScaleProgressBar.f109369e.isEmpty()) {
                        captureScaleProgressBar.f109369e.clear();
                    }
                    CaptureScaleProgressBar captureScaleProgressBar2 = l7.f16785b;
                    if (captureScaleProgressBar2 != null) {
                        captureScaleProgressBar2.a();
                    }
                }
                L l8 = this.f109165D;
                if (l8 != null) {
                    l8.g(independentCaptureViewModel.o1());
                }
                if (!bVar.e) {
                    com.bilibili.studio.videoeditor.capturev3.logic.b bVar2 = independentCaptureViewModel.f109308u;
                    if (bVar2 != null && (captureDraftBean = bVar2.f109210a) != null && (videoClips = captureDraftBean.getVideoClips()) != null) {
                        videoClips.clear();
                    }
                    independentCaptureViewModel.K1(false);
                }
                A a7 = this.f109168G;
                if (a7 != null) {
                    int iO1 = (int) (independentCaptureViewModel.o1() / ((long) 1000));
                    JC0.b bVar3 = a7.f16759q;
                    if (bVar3 != null) {
                        bVar3.c(iO1);
                    }
                }
                if (bVar.g == 0) {
                    A a8 = this.f109168G;
                    if (a8 != null) {
                        a8.m(bVar.i, independentCaptureViewModel.h1());
                    }
                    A a9 = this.f109168G;
                    if (a9 != null) {
                        a9.o(bVar.i, independentCaptureViewModel.h1(), independentCaptureViewModel.s1());
                    }
                    if (independentCaptureViewModel.f109308u != null) {
                        uB0.a aVarB = uB0.a.b();
                        Application application = BiliContext.application();
                        aVarB.getClass();
                        uB0.a.a(application);
                    }
                }
            }
            Ah();
        }
        if (((IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.M0(0);
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    @NotNull
    public final f Yf() {
        return new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Zf(float r8) {
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
            r1 = 2131825244(0x7f11125c, float:1.9283339E38)
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
            if (r0 != 0) goto L32
        L2e:
            java.lang.String r0 = ""
            r9 = r0
        L32:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment.Zf(float):java.lang.String");
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void ag(boolean z6) {
        TextView textView;
        C2689g c2689g = this.f109176y;
        if (c2689g instanceof OB0.a) {
            ((OB0.a) c2689g).q(z6);
        }
        L l7 = this.f109165D;
        if (l7 != null && (textView = l7.f16786c) != null) {
            textView.setAlpha(z6 ? 0.0f : 1.0f);
        }
        super.ag(z6);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, NB0.C2689g.a
    public final void b3() {
        c cVar = ((BaseVMFragment) this).b;
        if (cVar instanceof com.bilibili.studio.videoeditor.capturev3.viewmodel.b) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.b bVar = (com.bilibili.studio.videoeditor.capturev3.viewmodel.b) cVar;
            int iF1 = bVar.f1() % 3;
            bVar.S1(iF1 + 1);
            IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            String str = (String) nB0.a.c.get(iF1 % 3);
            independentCaptureViewModel.getClass();
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.K0(str);
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void bg(boolean z6) {
        C2689g c2689g = this.f109176y;
        if (c2689g instanceof OB0.a) {
            ((OB0.a) c2689g).q(z6);
        }
        super.bg(z6);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    @NotNull
    public final C2689g cg() {
        return new OB0.a();
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    @NotNull
    public final ViewOnClickListenerC2701t dg() {
        return new ViewOnClickListenerC2701t();
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    @NotNull
    public final L fg() {
        return new e();
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    @NotNull
    public final f0 gg() {
        return new f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final boolean hg() {
        g gVarP3 = p3();
        if (!(gVarP3 instanceof ICenterPlusContainer)) {
            return false;
        }
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof ICenterPlusTab) {
            return ((ICenterPlusContainer) gVarP3).isCurrentShow((ICenterPlusTab) parentFragment);
        }
        return false;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    @NotNull
    public final View jf(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        TB0.L lInflate = TB0.L.inflate(layoutInflater, viewGroup, false);
        this.f109175x = lInflate;
        return lInflate.f23562a;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final boolean jg() {
        ViewBinding viewBinding = this.f109175x;
        TB0.L l7 = viewBinding instanceof TB0.L ? (TB0.L) viewBinding : null;
        boolean z6 = false;
        if (l7 != null) {
            z6 = false;
            if (l7.f23549O.f105318f == 2) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final c mf() {
        return (com.bilibili.studio.videoeditor.capturev3.viewmodel.b) new ViewModelProvider(this).get(com.bilibili.studio.videoeditor.capturev3.viewmodel.b.class);
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean needToOpenCamera(@NotNull HashMap<String, Object> map) {
        int nowDeviceIndex;
        int nowDeviceIndex2;
        BLog.i("ForwardCaptureFragment", "needToOpenCamera...viewModel = " + ((BaseVMFragment) this).b);
        c cVar = ((BaseVMFragment) this).b;
        if (!(cVar instanceof com.bilibili.studio.videoeditor.capturev3.viewmodel.b)) {
            if (cVar != null) {
                return true;
            }
            boolean z6 = this.f109112l.get();
            BLog.i("ForwardCaptureFragment", "ForwardCaptureFragment...needToOpenCamera...cameraHolder = " + map + ", hasStarted = " + z6 + ", needToSwitchCamera = " + this.f109156O);
            if (!map.containsKey("CameraId")) {
                return true;
            }
            try {
                nowDeviceIndex = ((Integer) map.get("CameraId")).intValue();
            } catch (Exception e7) {
                nowDeviceIndex = d.a().a.getNowDeviceIndex();
            }
            int nowDeviceIndex3 = d.a().a.getNowDeviceIndex();
            BLog.v("ForwardCaptureFragment", "ForwardCaptureFragment...needToOpenCamera...nowDeviceIndex = " + nowDeviceIndex3 + ", cameraId = " + nowDeviceIndex);
            if (nowDeviceIndex3 == nowDeviceIndex) {
                return true;
            }
            this.f109156O = !z6;
            d.a().b(nowDeviceIndex);
            return true;
        }
        com.bilibili.studio.videoeditor.capturev3.viewmodel.b bVar = (com.bilibili.studio.videoeditor.capturev3.viewmodel.b) cVar;
        boolean z7 = this.f109112l.get();
        bVar.getClass();
        BLog.i("ForwardCaptureFragment", "ForwardCaptureViewModel...needToOpenCamera...cameraHolder = " + map + ", hasStarted = " + z7);
        if (!map.containsKey("CameraId")) {
            return true;
        }
        try {
            nowDeviceIndex2 = ((Integer) map.get("CameraId")).intValue();
        } catch (Exception e8) {
            i iVar = bVar.f109306s;
            nowDeviceIndex2 = iVar != null ? iVar.f109254c : d.a().a.getNowDeviceIndex();
        }
        i iVar2 = bVar.f109306s;
        int nowDeviceIndex4 = iVar2 != null ? iVar2.f109254c : d.a().a.getNowDeviceIndex();
        BLog.v("ForwardCaptureFragment", "ForwardCaptureViewModel...needToOpenCamera...nowDeviceIndex = " + nowDeviceIndex4 + ", cameraId = " + nowDeviceIndex2);
        if (nowDeviceIndex4 == nowDeviceIndex2) {
            return true;
        }
        this.f109156O = !z7;
        i iVar3 = bVar.f109306s;
        if (iVar3 != null) {
            iVar3.f109254c = nowDeviceIndex2;
            d.a().b(iVar3.f109254c);
            LC0.a aVar = iVar3.f109252a;
            if (aVar != null) {
                aVar.r0(nowDeviceIndex2);
            }
        }
        bVar.f109301n.e.postValue(Integer.valueOf(nowDeviceIndex2));
        return true;
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean needToReOpenActivity(@Nullable Intent intent) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void of() {
        super.of();
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel != null) {
            qB0.d dVar = independentCaptureViewModel.f109301n;
            dVar.f.observe(this, new b(new A0(this, 5)));
            dVar.d.observe(this, new b(new B0(1, this, independentCaptureViewModel)));
            dVar.e.observe(this, new b(new xB0.a(this, independentCaptureViewModel)));
            dVar.z.observe(this, new b(new D0(this, 3)));
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        BLog.dfmt("ForwardCaptureFragment", "onCreate...savedInstanceState = %s", new Object[]{bundle});
        c cVar = ((BaseVMFragment) this).b;
        if (cVar instanceof com.bilibili.studio.videoeditor.capturev3.viewmodel.b) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.b bVar = (com.bilibili.studio.videoeditor.capturev3.viewmodel.b) cVar;
            HashMap<String, Object> mapWf = wf();
            bVar.getClass();
            boolean zBooleanValue = true;
            if (mapWf != null) {
                try {
                } catch (Exception e7) {
                    BLog.w("ForwardCaptureFragment", "initCloseCameraFlag...firstOpenCapture...e = " + e7.fillInStackTrace());
                }
                zBooleanValue = mapWf.containsKey("OpenBmmCaptureFirst") ? ((Boolean) mapWf.get("OpenBmmCaptureFirst")).booleanValue() : true;
                Object obj = null;
                try {
                    if (mapWf.containsKey("Camera")) {
                        obj = mapWf.get("Camera");
                    }
                } catch (Exception e8) {
                    BLog.wfmt("ForwardCaptureFragment", O4.d.a("initCloseCameraFlag...camera...e = ", e8.fillInStackTrace()), new Object[0]);
                    obj = null;
                }
                BLog.vfmt("ForwardCaptureFragment", "initCloseCameraFlag...firstOpenCapture = " + zBooleanValue + ", camera = " + obj, new Object[0]);
                if (obj == null) {
                    mapWf.put("OpenBmmCaptureFirst", Boolean.TRUE);
                    zBooleanValue = true;
                }
                BLog.ifmt("ForwardCaptureFragment", com.bilibili.app.comm.bh.x5.b.a("initCloseCameraFlag...return ", zBooleanValue), new Object[0]);
            } else {
                BLog.ifmt("ForwardCaptureFragment", "initCloseCameraFlag...return true", new Object[0]);
            }
            this.f109155N = zBooleanValue;
        }
        this.f109108g = new xB0.b(this);
        this.f109154M = new com.bilibili.topix.topixset.a(this, 1);
        vx0.d.b().c();
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void onDestroy() {
        super.onDestroy();
        BLog.dfmt("ForwardCaptureFragment", "onDestroy", new Object[0]);
        this.f109108g = null;
        this.f109154M = null;
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final void onHide(boolean z6) {
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
        T9.e.a("onHide...closeCameraFlag = ", "ForwardCaptureFragment", z6);
        this.f109155N = z6;
        c cVar = ((BaseVMFragment) this).b;
        if (cVar instanceof com.bilibili.studio.videoeditor.capturev3.viewmodel.b) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.b bVar2 = (com.bilibili.studio.videoeditor.capturev3.viewmodel.b) cVar;
            bVar2.getClass();
            com.bilibili.studio.videoeditor.capturev3.viewmodel.a.Q0();
            bVar2.f109319i = false;
        }
        this.f109116p = 0L;
        L l7 = this.f109165D;
        if (l7 != null) {
            l7.f16798p = true;
        }
        IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel2 != null) {
            independentCaptureViewModel2.O0(independentCaptureViewModel2.n1());
        }
        IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel3 != null) {
            independentCaptureViewModel3.T1(false);
        }
        A a8 = this.f109168G;
        if (a8 != null && a8.f16759q != null) {
            xh();
            IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if (independentCaptureViewModel4 != null && (iVar3 = independentCaptureViewModel4.f109306s) != null && (aVar3 = iVar3.f109252a) != null) {
                aVar3.J(z6, true);
            }
        }
        IndependentCaptureViewModel independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel5 != null && (gVarG1 = independentCaptureViewModel5.g1()) != null) {
            gVarG1.d();
        }
        IndependentCaptureViewModel independentCaptureViewModel6 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel6 != null && (iVar = independentCaptureViewModel6.f109306s) != null && (aVar = iVar.f109252a) != null && (aVar.q() & 2) != 0 && (independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b) != null && (iVar2 = independentCaptureViewModel.f109306s) != null && (aVar2 = iVar2.f109252a) != null) {
            aVar2.b0();
        }
        IndependentCaptureViewModel independentCaptureViewModel7 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel7 != null && independentCaptureViewModel7.s1() && (a7 = this.f109168G) != null && (bVar = a7.f16759q) != null && bVar.f11234f == 102) {
            bVar.b();
        }
        f0 f0Var = this.f109167F;
        if (f0Var != null && (fVar = f0Var.f16862w) != null && (popupWindow = fVar.f125317a) != null && popupWindow.isShowing() && (fVar2 = f0Var.f16862w) != null && (mediaPlayer = fVar2.f19750e) != null) {
            mediaPlayer.pause();
        }
        IndependentCaptureViewModel independentCaptureViewModel8 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        int i7 = 1;
        if (independentCaptureViewModel8 != null) {
            i iVar4 = independentCaptureViewModel8.f109306s;
            i7 = 1;
            if (iVar4 != null) {
                i7 = iVar4.f109254c;
            }
        }
        j.a(getApplicationContext()).c("DeviceIndex", i7);
        IndependentCaptureViewModel independentCaptureViewModel9 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel9 != null) {
            com.bilibili.studio.videoeditor.capturev3.logic.g gVar = independentCaptureViewModel9.f109310w;
            independentCaptureViewModel9.P1(gVar != null ? gVar.f109235g : null, false);
        }
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean onKeyDown(int i7, @Nullable KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void onPause() {
        super.onPause();
        BLog.dfmt("ForwardCaptureFragment", "onPause", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void onResume() {
        qB0.d dVar;
        MutableLiveData mutableLiveData;
        h hVar;
        super.onResume();
        BLog.dfmt("ForwardCaptureFragment", "onResume", new Object[0]);
        if (hg()) {
            F f7 = this.f109163B;
            if (f7 != null && (hVar = f7.f16774c) != null && hVar.f19764g && !hVar.h) {
                hVar.f19758a.setVisibility(4);
                hVar.f19758a.setVisibility(0);
            }
            IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
            if ((independentCaptureViewModel == null || (dVar = independentCaptureViewModel.f109301n) == null || (mutableLiveData = dVar.z) == null) ? false : Intrinsics.areEqual(mutableLiveData.getValue(), Boolean.TRUE)) {
                IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
                boolean z6 = false;
                if (independentCaptureViewModel2 != null) {
                    z6 = false;
                    if (independentCaptureViewModel2.f109321k) {
                        z6 = true;
                    }
                }
                if (z6) {
                    CenterPlusActivityDialog.a.b(getChildFragmentManager(), "shot");
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final void onShow() {
        LC0.a aVar;
        LC0.a aVar2;
        BLog.d("ForwardCaptureFragment", "onShow");
        Xz0.j.c("send_channel", "拍摄");
        CenterPlusStatisticsHelper.g(1, "tab_show", null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
        c cVar = ((BaseVMFragment) this).b;
        if (cVar instanceof com.bilibili.studio.videoeditor.capturev3.viewmodel.b) {
            com.bilibili.studio.videoeditor.capturev3.viewmodel.b bVar = (com.bilibili.studio.videoeditor.capturev3.viewmodel.b) cVar;
            if (bVar.f109321k) {
                com.bilibili.studio.videoeditor.capturev3.viewmodel.a.R0();
                bVar.c1(bVar.f109302o.e ? "edit" : "new");
            }
            bVar.f109319i = true;
            i iVar = bVar.f109306s;
            int nowDeviceIndex = iVar != null ? iVar.f109254c : d.a().a.getNowDeviceIndex();
            a aVar3 = new a(this, bVar);
            i iVar2 = bVar.f109306s;
            if (iVar2 != null && (aVar2 = iVar2.f109252a) != null) {
                aVar2.L(aVar3);
            }
            if (this.f109112l.get()) {
                Mf(nowDeviceIndex, this.f109155N);
            } else {
                boolean z6 = this.f109155N;
                i iVar3 = bVar.f109306s;
                if (iVar3 != null && (aVar = iVar3.f109252a) != null) {
                    aVar.x(-1, z6);
                }
            }
            if (Intrinsics.areEqual(bVar.f109301n.z.getValue(), Boolean.TRUE)) {
                CenterPlusActivityDialog.a.b(getChildFragmentManager(), "shot");
            } else {
                this.f109157P = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onStart();
        BLog.dfmt("ForwardCaptureFragment", "onStart", new Object[0]);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment, com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    public final void onStop() {
        super.onStop();
        BLog.dfmt("ForwardCaptureFragment", "onStop", new Object[0]);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void th() {
        L l7;
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) this).b;
        if (independentCaptureViewModel == null || independentCaptureViewModel.f109302o.g <= 0 || (l7 = this.f109165D) == null) {
            return;
        }
        l7.x(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment
    @Nullable
    public final HashMap<String, Object> wf() {
        g gVarP3 = p3();
        return gVarP3 instanceof ICenterPlusContainer ? ((ICenterPlusContainer) gVarP3).getCameraHolder() : new HashMap<>();
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void wh() {
        LinearLayout linearLayout;
        L l7 = this.f109165D;
        if (l7 instanceof e) {
            TextView textView = ((e) l7).f16786c;
            if (textView != null) {
                int iDp2px = DensityUtil.dp2px(8);
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iDp2px;
                    textView.setLayoutParams(layoutParams);
                }
            }
            L l8 = this.f109165D;
            if (l8 != null) {
                l8.x(false);
            }
        }
        C2689g c2689g = this.f109176y;
        if (!(c2689g instanceof OB0.a) || (linearLayout = ((OB0.a) c2689g).f17741A) == null) {
            return;
        }
        int iDp2px2 = DensityUtil.dp2px(36);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iDp2px2;
            linearLayout.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    /* JADX INFO: renamed from: xg */
    public final IndependentCaptureViewModel mf() {
        return (com.bilibili.studio.videoeditor.capturev3.viewmodel.b) new ViewModelProvider(this).get(com.bilibili.studio.videoeditor.capturev3.viewmodel.b.class);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment
    public final void yh(boolean z6) {
        ViewBinding viewBinding = this.f109175x;
        TB0.L l7 = viewBinding instanceof TB0.L ? (TB0.L) viewBinding : null;
        if (l7 != null) {
            GeneralModLoadingView2 generalModLoadingView2 = l7.f23549O;
            if (!z6) {
                generalModLoadingView2.setVisibility(8);
                return;
            }
            generalModLoadingView2.f105315c = kf(2131842107);
            generalModLoadingView2.f105317e = true;
            generalModLoadingView2.f105314b = new F0(l7, 5);
            generalModLoadingView2.onLoading();
            generalModLoadingView2.setVisibility(0);
        }
    }
}
