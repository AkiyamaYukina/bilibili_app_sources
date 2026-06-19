package com.bilibili.upper.module.tempalte.fragment;

import HB0.b;
import II0.a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.base.MainThread;
import com.bilibili.moduleservice.upper.ICenterPlusTab;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/fragment/TabVideoTemplateFragmentV2.class */
@StabilityInferred(parameters = 0)
public final class TabVideoTemplateFragmentV2 extends BaseCheckPermissionFragment implements ICenterPlusTab {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f113952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f113953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f113954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public CPVideoTemplateFeedFragment f113955s;

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final void kf(boolean z6, boolean z7) {
        String queryParameter;
        if (z6) {
            int i7 = z6 ? 2 : 1;
            b bVar = b.f8155a;
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
            b.e(z7 ? 1 : 0, i7, "video-template", queryParameter);
        }
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final void lf() {
        CenterPlusStatisticsHelper.g(3, "permission_2", "success", null, null, null, null, 120);
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(2131298339);
        if ((fragmentFindFragmentById instanceof CPVideoTemplateFeedFragment) && ((CPVideoTemplateFeedFragment) fragmentFindFragmentById).isAdded()) {
            BLog.wfmt("TabVideoTemplateFragmentV2", "showContentPage...replace fragment error...fragment=%s", new Object[]{fragmentFindFragmentById});
        } else {
            if (this.f113955s == null) {
                this.f113955s = new CPVideoTemplateFeedFragment();
            }
            CPVideoTemplateFeedFragment cPVideoTemplateFeedFragment = this.f113955s;
            if (cPVideoTemplateFeedFragment != null) {
                Bundle bundleUf = uf(getArguments());
                bundleUf.putInt("key_material_source_from", 20499);
                cPVideoTemplateFeedFragment.setArguments(bundleUf);
            }
            getChildFragmentManager().beginTransaction().replace(2131298339, cPVideoTemplateFeedFragment).commitNowAllowingStateLoss();
        }
        if (this.f113953q) {
            this.f113953q = false;
            MainThread.postOnMainThread(new a(this, 0));
        }
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean needToOpenCamera(@NotNull HashMap<String, Object> map) {
        BLog.dfmt("TabVideoTemplateFragmentV2", "needToOpenCamera...cameraHolder = %s", new Object[]{map});
        return false;
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean needToReOpenActivity(@Nullable Intent intent) {
        CPVideoTemplateFeedFragment cPVideoTemplateFeedFragment = this.f113955s;
        if (cPVideoTemplateFeedFragment != null) {
            return cPVideoTemplateFeedFragment.needToReOpenActivity(intent);
        }
        return false;
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    @NotNull
    public final String nf() {
        return "videotemp";
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
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        BLog.dfmt("TabVideoTemplateFragmentV2", "onCreateView...savedInstanceState = %s", new Object[]{bundle});
        return layoutInflater.inflate(2131494027, viewGroup, false);
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BLog.dfmt("TabVideoTemplateFragmentV2", "onDestroy", new Object[0]);
        this.f113955s = null;
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final void onHide(boolean z6) {
        CPVideoTemplateFeedFragment cPVideoTemplateFeedFragment;
        BLog.dfmt("TabVideoTemplateFragmentV2", "onHide...closeCamera = %s", new Object[]{Boolean.valueOf(z6)});
        this.f113952p = false;
        if (!this.f105240g || (cPVideoTemplateFeedFragment = this.f113955s) == null) {
            return;
        }
        cPVideoTemplateFeedFragment.onHide(z6);
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean onKeyDown(int i7, @Nullable KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        BLog.dfmt("TabVideoTemplateFragmentV2", "onPause", new Object[0]);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        BLog.dfmt("TabVideoTemplateFragmentV2", "onResume", new Object[0]);
        if (this.f113952p) {
            mf(null);
        } else {
            this.f113954r = true;
        }
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final void onShow() {
        Bundle arguments;
        BLog.dfmt("TabVideoTemplateFragmentV2", "onShow", new Object[0]);
        this.f113952p = true;
        if (this.f113954r) {
            this.f113954r = false;
            this.f113953q = true;
            mf(null);
        }
        if (this.f105240g) {
            CPVideoTemplateFeedFragment cPVideoTemplateFeedFragment = this.f113955s;
            if (cPVideoTemplateFeedFragment != null && !cPVideoTemplateFeedFragment.isStateSaved()) {
                CPVideoTemplateFeedFragment cPVideoTemplateFeedFragment2 = this.f113955s;
                if (cPVideoTemplateFeedFragment2 != null) {
                    cPVideoTemplateFeedFragment2.setArguments(getArguments());
                }
                CPVideoTemplateFeedFragment cPVideoTemplateFeedFragment3 = this.f113955s;
                if (cPVideoTemplateFeedFragment3 != null && (arguments = cPVideoTemplateFeedFragment3.getArguments()) != null) {
                    arguments.putBoolean("is_new_ui", true);
                }
            }
            CPVideoTemplateFeedFragment cPVideoTemplateFeedFragment4 = this.f113955s;
            if (cPVideoTemplateFeedFragment4 != null) {
                cPVideoTemplateFeedFragment4.onShow();
            }
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        BLog.dfmt("TabVideoTemplateFragmentV2", "onStart", new Object[0]);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        BLog.dfmt("TabVideoTemplateFragmentV2", "onStop", new Object[0]);
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        BLog.dfmt("TabVideoTemplateFragmentV2", "onViewCreated...view = %s, savedInstanceState = %s", new Object[]{view, bundle});
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final int rf() {
        return 3;
    }

    @Override // com.bilibili.studio.centerplus.ui.base.BaseCheckPermissionFragment
    public final void sf(boolean z6) {
        if (z6) {
            b bVar = b.f8155a;
            b.p("video-template");
        }
    }
}
