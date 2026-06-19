package com.bilibili.studio.videoeditor.capturev3.base;

import NB0.A;
import NB0.C;
import NB0.F;
import NB0.G;
import NB0.f0;
import QB0.f;
import QB0.h;
import Yv0.c;
import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import c6.Q;
import ci0.InterfaceC5259a;
import com.bilibili.ad.adview.liveroom.answer.fragment.compont.v0;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.ui.PermissionsChecker;
import com.bilibili.moduleservice.upper.ICenterPlusContainer;
import com.bilibili.studio.base.BaseVMFragment;
import com.bilibili.studio.centerplus.dialog.AlbumQuitDialog;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.comm.ab.ABManager;
import com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3;
import com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.logic.CaptureRecordManager;
import com.bilibili.studio.videoeditor.capturev3.logic.e;
import com.bilibili.studio.videoeditor.capturev3.logic.g;
import com.bilibili.studio.videoeditor.capturev3.logic.i;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel;
import com.bilibili.studio.videoeditor.capturev3.widget.FTPlayView;
import com.bilibili.studio.videoeditor.util.J;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kntr.base.utils.foundation.CpuUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.D;
import tv.danmaku.android.log.BLog;
import yB0.b;
import yB0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/base/BaseCaptureFragment.class */
public abstract class BaseCaptureFragment<VM extends c> extends BaseVMFragment<VM> implements InterfaceC5259a, e.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final HashSet<Integer> f109105u = new HashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public yB0.a f109106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public a f109107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public d f109108g;

    @Nullable
    public b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public e f109109i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f109110j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f109114n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f109115o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f109116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Bundle f109117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f109118r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f109120t;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f109111k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f109112l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f109113m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f109119s = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/base/BaseCaptureFragment$a.class */
    public interface a {
        void a(boolean z6);
    }

    public static boolean Lf() {
        boolean z6 = true;
        if (f109105u.size() != 1) {
            z6 = false;
        }
        return z6;
    }

    public abstract void Af();

    public abstract boolean Bf();

    public abstract void Cf();

    public abstract void Df();

    public final void Ef() {
        BLog.e("BaseCaptureFragment", "initMediaEngine");
        tf();
        Sf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z6 = sf() && Jf();
        Y0.c.c("canStartEngine=", "BaseCaptureFragment", z6);
        if (z6) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            BLog.e("timee", "initMediaEngine  canStartEngine time=" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
            if (!Bf()) {
                BLog.e("BaseCaptureFragment", "initEngineConfig fail");
                return;
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
            this.f109118r = jCurrentTimeMillis3;
            v0.b(jCurrentTimeMillis3, "BaseCaptureFragment initEngineConfig time=", "timee");
        }
    }

    public abstract void Ff();

    public abstract void Gf();

    public abstract void Hf();

    public abstract boolean If();

    public abstract boolean Jf();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Kf() {
        if (p3() == null) {
            return false;
        }
        String simpleName = p3().getClass().getSimpleName();
        return Intrinsics.areEqual("BiliCaptureActivityV3", simpleName) || Intrinsics.areEqual("CenterPlusMainActivity", simpleName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.fragment.app.Fragment, com.bilibili.studio.base.BaseVMFragment, com.bilibili.studio.videoeditor.capturev3.fragment.IndependentCaptureFragment] */
    public final void Mf(int i7, boolean z6) {
        f fVar;
        MediaPlayer mediaPlayer;
        CaptureRecordManager captureRecordManager;
        J j7;
        i iVar;
        LC0.a aVar;
        i iVar2;
        LC0.a aVar2;
        LC0.a aVar3;
        A a7;
        View view;
        RelativeLayout relativeLayout;
        h hVar;
        SurfaceView surfaceView;
        h hVar2;
        String queryParameter;
        if (getView() == null) {
            return;
        }
        View viewRequireView = requireView();
        viewRequireView.setFocusableInTouchMode(true);
        viewRequireView.requestFocus();
        ?? r02 = (IndependentCaptureFragment) this;
        viewRequireView.setOnKeyListener(new pB0.a((IndependentCaptureFragment) r02));
        boolean zSf = sf();
        IndependentCaptureViewModel independentCaptureViewModel = (IndependentCaptureViewModel) ((BaseVMFragment) r02).b;
        if (!(independentCaptureViewModel != null ? independentCaptureViewModel instanceof com.bilibili.studio.videoeditor.capturev3.viewmodel.b : false) && independentCaptureViewModel != null) {
            Bundle arguments = r02.getArguments();
            String string = arguments != null ? arguments.getString("JUMP_PARAMS") : null;
            if (string == null) {
                queryParameter = null;
                HB0.b.e(zSf ? 1 : 0, 1, "shot", queryParameter);
            } else {
                try {
                    queryParameter = Uri.parse(string).getQueryParameter(CaptureSchema.JUMP_PARAMS_RELATION_FROM);
                } catch (Exception e7) {
                    e7.printStackTrace();
                    queryParameter = null;
                }
                HB0.b.e(zSf ? 1 : 0, 1, "shot", queryParameter);
            }
        }
        G g7 = r02.f109162A;
        if ((g7 != null && g7.f16779d) != false && zSf) {
            xf();
            Qf();
        }
        if (this.f109112l.get()) {
            this.f109113m.set(true);
            F f7 = r02.f109163B;
            if ((f7 != null ? f7.f16774c : null) == null) {
                return;
            }
            if (((f7 == null || (hVar2 = f7.f16774c) == null) ? null : hVar2.f19758a) == null) {
                return;
            }
            A a8 = r02.f109168G;
            if (a8 != null && a8.f16759q != null) {
                if (((f7 == null || (hVar = f7.f16774c) == null || (surfaceView = hVar.f19758a) == null) ? null : surfaceView.getParent()) == null) {
                    r02.rf();
                    r02.Pf(false);
                    lB0.a aVarA = lB0.a.a();
                    uC0.d dVar = new uC0.d();
                    aVarA.getClass();
                    lB0.a.c(dVar);
                    IndependentCaptureViewModel independentCaptureViewModel2 = (IndependentCaptureViewModel) ((BaseVMFragment) r02).b;
                    if ((independentCaptureViewModel2 != null ? independentCaptureViewModel2.f109302o.i : 31) != 31 && (a7 = r02.f109168G) != null && (view = a7.f16758p) != null && view.getContext() != null) {
                        FTPlayView fTPlayView = a7.f16747d;
                        if (fTPlayView != null && (relativeLayout = a7.f16746c) != null) {
                            relativeLayout.removeView(fTPlayView);
                        }
                        View view2 = a7.f16758p;
                        a7.f16747d = new FTPlayView(view2 != null ? view2.getContext() : null);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams.addRule(13);
                        RelativeLayout relativeLayout2 = a7.f16746c;
                        if (relativeLayout2 != null) {
                            relativeLayout2.addView(a7.f16747d, 0, layoutParams);
                        }
                        IndependentCaptureFragment independentCaptureFragment = a7.f16755m;
                        if (independentCaptureFragment != null) {
                            independentCaptureFragment.yg(new C(a7), false);
                        }
                    }
                }
            }
            IndependentCaptureViewModel independentCaptureViewModel3 = (IndependentCaptureViewModel) ((BaseVMFragment) r02).b;
            if (independentCaptureViewModel3 != null && independentCaptureViewModel3.f109302o.g == 0) {
                i iVar3 = independentCaptureViewModel3.f109306s;
                if (((iVar3 == null || (aVar3 = iVar3.f109252a) == null || (aVar3.q() & 2) == 0) ? false : true) != false && (iVar2 = independentCaptureViewModel3.f109306s) != null && (aVar2 = iVar2.f109252a) != null) {
                    aVar2.k();
                }
            }
            IndependentCaptureViewModel independentCaptureViewModel4 = (IndependentCaptureViewModel) ((BaseVMFragment) r02).b;
            if (independentCaptureViewModel4 != null && (iVar = independentCaptureViewModel4.f109306s) != null && (aVar = iVar.f109252a) != null) {
                aVar.x(i7, z6);
            }
            IndependentCaptureViewModel independentCaptureViewModel5 = (IndependentCaptureViewModel) ((BaseVMFragment) r02).b;
            if (independentCaptureViewModel5 != null && (captureRecordManager = independentCaptureViewModel5.f109307t) != null && (j7 = captureRecordManager.f109189b) != null) {
                j7.d(BiliContext.application());
            }
            f0 f0Var = r02.f109167F;
            if (f0Var != null) {
                f fVar2 = f0Var.f16862w;
                byte b7 = false;
                if (fVar2 != null) {
                    PopupWindow popupWindow = fVar2.f125317a;
                    b7 = false;
                    if ((popupWindow != null && popupWindow.isShowing()) == true) {
                        b7 = true;
                    }
                }
                if (b7 != false && (fVar = f0Var.f16862w) != null && (mediaPlayer = fVar.f19750e) != null) {
                    mediaPlayer.start();
                }
            }
            IndependentCaptureViewModel independentCaptureViewModel6 = (IndependentCaptureViewModel) ((BaseVMFragment) r02).b;
            if (independentCaptureViewModel6 != null) {
                g gVar = independentCaptureViewModel6.f109310w;
                StickerListItemV3 stickerListItemV3 = null;
                if (gVar != null) {
                    stickerListItemV3 = gVar.f109235g;
                }
                independentCaptureViewModel6.P1(stickerListItemV3, true);
            }
        }
    }

    public abstract void Nf();

    public abstract void Of();

    public abstract void Pf(boolean z6);

    public final void Qf() {
        BLog.e("BaseCaptureFragment", "startStreamingEngine start");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Ef();
        if (If()) {
            zf();
            v0.b(System.currentTimeMillis() - jCurrentTimeMillis, " BaseCaptureFragment startStreamingEngine time=", "timee");
        }
    }

    public abstract void Rf();

    public abstract void Sf();

    @Override // ci0.InterfaceC5259a
    public void fe(@NotNull Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Context getApplicationContext() {
        Context applicationContext = super/*com.bilibili.lib.ui.BaseFragment*/.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        if (p3() != null) {
            return p3();
        }
        Application application = BiliContext.application();
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Context getContext() {
        Context context = super/*androidx.fragment.app.Fragment*/.getContext();
        if (context != null) {
            return context;
        }
        if (p3() != null) {
            return p3();
        }
        Application application = BiliContext.application();
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.logic.e.a
    public void i2(int i7, boolean z6) {
    }

    public final void initView() {
        ViewTreeObserver viewTreeObserver;
        Ff();
        BLog.e("BaseCaptureFragment", "setupEngine start");
        if (!Jf()) {
            Nf();
            Rf();
            yB0.a aVar = this.f109106e;
            if (aVar != null) {
                aVar.onError();
                return;
            }
            return;
        }
        if (!Lf() && If()) {
            uf();
        }
        View view = ((BaseVMFragment) this).c;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new pB0.b(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bilibili.studio.videoeditor.capturev3.logic.e, java.lang.Object] */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        f109105u.add(Integer.valueOf(hashCode()));
        String str = CenterPlusStatisticsHelper.f105195a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        CenterPlusStatisticsHelper.f105197c = String.format("captureID_%s", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        OC0.h.x(BiliContext.application());
        ?? obj = new Object();
        this.f109109i = obj;
        obj.f109225b = this;
        Ef();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        String str = CenterPlusStatisticsHelper.f105195a;
        CenterPlusStatisticsHelper.f105197c = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        if (Lf() && !f109105u.contains(Integer.valueOf(hashCode()))) {
            BLog.d("BaseCaptureFragment", "Post event of second capture finish");
            lB0.a aVarA = lB0.a.a();
            uC0.d dVar = new uC0.d();
            aVarA.getClass();
            lB0.a.c(dVar);
        }
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.Fragment, com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment] */
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
    public final void onRequestPermissionsResult(int i7, @NotNull String[] strArr, @NotNull int[] iArr) {
        boolean z6;
        super/*com.bilibili.lib.ui.BaseFragment*/.onRequestPermissionsResult(i7, strArr, iArr);
        e eVar = this.f109109i;
        if (eVar != null) {
            switch (i7) {
                case 32:
                case 33:
                case 34:
                    int length = strArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            z6 = true;
                        } else if (iArr[i8] != 0) {
                            z6 = false;
                        } else {
                            i8++;
                        }
                    }
                    eVar.f109225b.i2(i7, z6);
                    int i9 = eVar.f109224a;
                    String[][] strArr2 = e.f109222c;
                    if (i9 == strArr2.length - 1) {
                        if (z6) {
                            BaseCaptureFragment baseCaptureFragment = eVar.f109225b;
                            if (baseCaptureFragment.sf()) {
                                baseCaptureFragment.xf();
                                baseCaptureFragment.Qf();
                            }
                        } else {
                            eVar.f109225b.Of();
                        }
                        eVar.f109224a = 0;
                    } else if (i9 < strArr2.length - 1) {
                        eVar.f109224a = i9 + 1;
                        ?? r02 = eVar.f109225b;
                        e eVar2 = r02.f109109i;
                        if (eVar2 != 0) {
                            eVar2.a(r02, r02.getLifecycle());
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        super/*com.bilibili.lib.ui.BaseFragment*/.onStop();
        this.f109113m.set(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void qf(@Nullable Bundle bundle) {
        if (bundle != null) {
            this.f109110j = true;
            setArguments(bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void release() {
        int iHashCode = hashCode();
        HashSet<Integer> hashSet = f109105u;
        D.a(iHashCode, hashSet.size(), "releaseEngine:fragment=", ",instanceCount=", "BaseCaptureFragment");
        hashSet.remove(Integer.valueOf(hashCode()));
    }

    public abstract void rf();

    /* JADX WARN: Multi-variable type inference failed */
    public void setUserVisibleCompat(boolean z6) {
        super/*com.bilibili.lib.ui.BaseFragment*/.setUserVisibleCompat(z6);
        this.f109113m.set(z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setUserVisibleHint(boolean z6) {
        super/*com.bilibili.lib.ui.BaseFragment*/.setUserVisibleHint(z6);
        boolean z7 = this.f109112l.get();
        ay.b.a(Q.a("setUserVisibleHint isVisibleToUser=", ",hasStarted=", ",isAdded=", z6, z7), isAdded(), "BaseCaptureFragment");
        if (!z6 || this.f109112l.get() || isAdded()) {
            return;
        }
        yf();
    }

    public final boolean sf() {
        boolean z6 = false;
        if (this.f109109i != null) {
            boolean z7 = true;
            for (String[] strArr : e.f109222c) {
                if (!((!Arrays.equals(strArr, PermissionsChecker.STORAGE_WITH_AUDIO_PERMISSIONS) || Build.VERSION.SDK_INT < 34) ? false : PermissionsChecker.checkSelfPermissions(BiliContext.application(), new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}))) {
                    z7 = z7 && PermissionsChecker.checkSelfPermissions(BiliContext.application(), strArr);
                }
            }
            z6 = false;
            if (z7) {
                z6 = true;
            }
        }
        Y0.c.c("checkAllPermissions=", "BaseCaptureFragment", z6);
        return z6;
    }

    public abstract void tf();

    public abstract void uf();

    /* JADX WARN: Multi-variable type inference failed */
    public final void vf() {
        defpackage.a.a(hashCode(), " finishFragment fragment=", "BaseCaptureFragment");
        if (AlbumQuitDialog.f105100e.f105109f) {
            Map<String, String> map = ABManager.f105341a;
            if (!ABManager.e(com.bilibili.studio.comm.ab.d.f105350a)) {
                androidx.core.content.g gVarP3 = p3();
                ICenterPlusContainer iCenterPlusContainer = gVarP3 instanceof ICenterPlusContainer ? (ICenterPlusContainer) gVarP3 : null;
                if (iCenterPlusContainer != null) {
                    iCenterPlusContainer.setTabBarVisible(true, false);
                    iCenterPlusContainer.switchTab(2, null);
                    return;
                }
            }
        }
        release();
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.finish();
        }
    }

    @Nullable
    public HashMap<String, Object> wf() {
        return new HashMap<>();
    }

    public abstract void xf();

    /* JADX WARN: Multi-variable type inference failed */
    public final void yf() {
        BLog.e("BaseCaptureFragment", " initAll:hasTryInit=" + this.f109111k.get());
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (CpuUtils.isX86(getApplicationContext())) {
            return;
        }
        if (If()) {
            this.f109112l.set(true);
            Af();
            Hf();
            this.f109113m.set(true);
            BLog.e("BaseCaptureFragment", " initAll end");
            v0.b(System.currentTimeMillis() - jCurrentTimeMillis, " BaseCaptureFragment initAll ", "timee");
            return;
        }
        if (!sf()) {
            if (!this.f109110j) {
                this.f109119s = false;
                e eVar = this.f109109i;
                if (eVar != null) {
                    eVar.a(this, getLifecycle());
                }
            }
            Of();
        }
        this.f109111k.set(true);
    }

    public final void zf() {
        BLog.e("BaseCaptureFragment", "initCapturePreview");
        this.f109116p = System.currentTimeMillis() - this.f109118r;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Df();
        rf();
        Pf(false);
        this.f109120t = System.currentTimeMillis();
        BLog.e("timee", "BaseCaptureFragment preInitOptimize time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        Cf();
        Gf();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (this.f109111k.get()) {
            yf();
            this.f109111k.set(false);
        }
        this.f109115o = (this.f109116p + System.currentTimeMillis()) - jCurrentTimeMillis2;
    }
}
