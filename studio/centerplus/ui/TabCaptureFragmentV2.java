package com.bilibili.studio.centerplus.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.credentials.p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.moduleservice.upper.ICenterPlusTab;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment;
import com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.core.common.PlayerAudioManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/TabCaptureFragmentV2.class */
public final class TabCaptureFragmentV2 extends BaseCheckPermissionFragment implements ICenterPlusTab {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final Integer[] f105222v = {0, 1, 2};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f105223p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f105224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f105225r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public ForwardCaptureFragment f105227t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f105226s = "center_plus";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final g f105228u = new Object();

    public final void Af(Fragment fragment) {
        this.f105226s = com.bilibili.studio.centerplus.util.g.a(getArguments());
        if (fragment.isStateSaved()) {
            return;
        }
        Bundle bundleUf = uf(getArguments());
        bundleUf.putInt("key_material_source_from", 20498);
        bundleUf.putBoolean("is_new_ui", true);
        bundleUf.putString(CaptureSchema.JUMP_PARAMS_RELATION_FROM, this.f105226s);
        bundleUf.putBoolean("selectVideoList", false);
        fragment.setArguments(bundleUf);
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final void jf(int i7, @Nullable Integer num) {
        boolean z6 = false;
        if (i7 == 0) {
            HB0.b bVar = HB0.b.f8155a;
            boolean z7 = false;
            if (num == null) {
                z7 = true;
            }
            HB0.b.f("storage", z7);
            return;
        }
        if (i7 == 1) {
            HB0.b bVar2 = HB0.b.f8155a;
            boolean z8 = false;
            if (num == null) {
                z8 = true;
            }
            HB0.b.f("photo", z8);
            return;
        }
        if (i7 != 2) {
            return;
        }
        HB0.b bVar3 = HB0.b.f8155a;
        if (num == null) {
            z6 = true;
        }
        HB0.b.f("microphone", z6);
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final void kf(boolean z6, boolean z7) {
        String queryParameter;
        int i7 = z6 ? 2 : 1;
        HB0.b bVar = HB0.b.f8155a;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("JUMP_PARAMS") : null;
        if (string == null) {
            queryParameter = null;
        } else {
            try {
                queryParameter = Uri.parse(string).getQueryParameter(CaptureSchema.JUMP_PARAMS_RELATION_FROM);
            } catch (Exception e7) {
                e7.printStackTrace();
                queryParameter = null;
            }
        }
        HB0.b.e(z7 ? 1 : 0, i7, "shot", queryParameter);
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final void lf() {
        CenterPlusStatisticsHelper.g(1, "permission_2", "success", null, null, null, null, 120);
        if (this.f105223p) {
            yf();
        }
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean needToOpenCamera(@NotNull HashMap<String, Object> map) {
        BLog.ifmt("TabCaptureFragmentV2", "needToOpenCamera...cameraHolder = " + map + ", mChildFragment = " + this.f105227t, new Object[0]);
        ICenterPlusTab iCenterPlusTabZf = zf();
        if (iCenterPlusTabZf == null) {
            return true;
        }
        ((ForwardCaptureFragment) iCenterPlusTabZf).needToOpenCamera(map);
        return true;
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean needToReOpenActivity(@Nullable Intent intent) {
        return zf() != null;
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    @NotNull
    public final String nf() {
        return "capture_pageload";
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    @NotNull
    public final FrameLayout of() throws Exception {
        FrameLayout frameLayout;
        View view = getView();
        if (view == null || (frameLayout = (FrameLayout) view.findViewById(2131301153)) == null) {
            throw new Exception("please getErrorPage after viewCreated");
        }
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        super.onActivityResult(i7, i8, intent);
        BLog.dfmt("TabCaptureFragmentV2", "onActivityResult...requestCode = %s, resultCode = %s, data = %s", new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), intent});
        Object objZf = zf();
        if (objZf != null) {
            ((Fragment) objZf).onActivityResult(i7, i8, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        BLog.dfmt("TabCaptureFragmentV2", "onCreateView...savedInstanceState = %s", new Object[]{bundle});
        return layoutInflater.inflate(2131494027, viewGroup, false);
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BLog.dfmt("TabCaptureFragmentV2", "onDestroy", new Object[0]);
        this.f105227t = null;
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final void onHide(boolean z6) {
        ICenterPlusTab iCenterPlusTabZf;
        Window window;
        BLog.dfmt("TabCaptureFragmentV2", "onHide...closeCamera = %s", new Object[]{Boolean.valueOf(z6)});
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && (window = fragmentActivityP3.getWindow()) != null) {
            window.clearFlags(128);
        }
        this.f105223p = false;
        if (this.f105240g && (iCenterPlusTabZf = zf()) != null) {
            ((ForwardCaptureFragment) iCenterPlusTabZf).onHide(z6);
        }
        PlayerAudioManager.Companion.getInstance().abandonAudioFocus(this.f105228u);
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean onKeyDown(int i7, @Nullable KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        BLog.dfmt("TabCaptureFragmentV2", "onPause", new Object[0]);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BLog.dfmt("TabCaptureFragmentV2", "onResume", new Object[0]);
        if (this.f105223p) {
            mf(f105222v);
        } else {
            this.f105225r = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onShow() {
        /*
            r5 = this;
            java.lang.String r0 = "TabCaptureFragmentV2"
            java.lang.String r1 = "onShow"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            tv.danmaku.android.log.BLog.dfmt(r0, r1, r2)
            r0 = r5
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L25
            r0 = r7
            android.view.Window r0 = r0.getWindow()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L25
            r0 = r7
            r1 = 128(0x80, float:1.8E-43)
            r0.addFlags(r1)
        L25:
            r0 = r5
            r1 = 1
            r0.f105223p = r1
            r0 = r5
            boolean r0 = r0.f105225r
            r6 = r0
            java.lang.Integer[] r0 = com.bilibili.studio.centerplus.ui.TabCaptureFragmentV2.f105222v
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L49
            r0 = r5
            r1 = 0
            r0.f105225r = r1
            r0 = r5
            r1 = 1
            r0.f105224q = r1
            r0 = r5
            r1 = r7
            r0.mf(r1)
            goto Lb0
        L49:
            r0 = r5
            boolean r0 = r0.tf()
            if (r0 == 0) goto L58
            r0 = r5
            r1 = r7
            r0.mf(r1)
            goto Lb0
        L58:
            r0 = r5
            boolean r0 = r0.f105240g
            if (r0 == 0) goto Lb0
            r0 = r5
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L69
            goto L85
        L69:
            r0 = r5
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            r1 = 2131298339(0x7f090823, float:1.8214648E38)
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.moduleservice.upper.ICenterPlusTab
            if (r0 == 0) goto Lac
            r0 = r7
            boolean r0 = r0.isAdded()
            if (r0 != 0) goto L85
            goto Lac
        L85:
            r0 = r5
            com.bilibili.moduleservice.upper.ICenterPlusTab r0 = r0.zf()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lb0
            r0 = r7
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0.isStateSaved()
            if (r0 != 0) goto La2
            r0 = r8
            r1 = r5
            android.os.Bundle r1 = r1.getArguments()
            r0.setArguments(r1)
        La2:
            r0 = r7
            com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment r0 = (com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment) r0
            r0.onShow()
            goto Lb0
        Lac:
            r0 = r5
            r0.yf()
        Lb0:
            tv.danmaku.videoplayer.core.common.PlayerAudioManager$Companion r0 = tv.danmaku.videoplayer.core.common.PlayerAudioManager.Companion
            tv.danmaku.videoplayer.core.common.PlayerAudioManager r0 = r0.getInstance()
            r1 = r5
            com.bilibili.studio.centerplus.ui.g r1 = r1.f105228u
            r2 = 3
            r3 = 2
            int r0 = r0.requestAudioFocus(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.TabCaptureFragmentV2.onShow():void");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        BLog.dfmt("TabCaptureFragmentV2", "onStart", new Object[0]);
        if (this.f105223p) {
            PlayerAudioManager.Companion.getInstance().requestAudioFocus(this.f105228u, 3, 2);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        BLog.dfmt("TabCaptureFragmentV2", "onStop", new Object[0]);
        PlayerAudioManager.Companion.getInstance().abandonAudioFocus(this.f105228u);
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        BLog.dfmt("TabCaptureFragmentV2", "onViewCreated...view = %s, savedInstanceState = %s", new Object[]{view, bundle});
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    @Nullable
    public final String pf() {
        Context context = getContext();
        return context != null ? context.getString(2131842120) : null;
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final int rf() {
        return 1;
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final void sf(boolean z6) {
        if (z6) {
            HB0.b bVar = HB0.b.f8155a;
            HB0.b.p("shot");
            return;
        }
        FragmentActivity fragmentActivityP3 = p3();
        boolean zJ0 = false;
        if (fragmentActivityP3 != null) {
            qf().getClass();
            zJ0 = com.bilibili.studio.centerplus.model.g.J0(fragmentActivityP3, 0);
        }
        String str = zJ0 ? "microphone-photo" : "storage";
        HB0.b bVar2 = HB0.b.f8155a;
        HB0.b.g(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void yf() {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.centerplus.ui.TabCaptureFragmentV2.yf():void");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.fragment.app.Fragment, com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment, com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, yB0.a] */
    public final ICenterPlusTab zf() {
        if (this.f105227t == null) {
            int i7 = ForwardCaptureFragment.f109153Q;
            String str = this.f105226s;
            ?? forwardCaptureFragment = new ForwardCaptureFragment();
            Bundle bundleA = p.a("is_new_ui", "selectVideoList", true, false);
            bundleA.putString(CaptureSchema.JUMP_PARAMS_RELATION_FROM, str);
            forwardCaptureFragment.setArguments(bundleA);
            forwardCaptureFragment.f109106e = new Object();
            forwardCaptureFragment.f109107f = new h(this, forwardCaptureFragment);
            this.f105227t = forwardCaptureFragment;
        }
        return this.f105227t;
    }
}
