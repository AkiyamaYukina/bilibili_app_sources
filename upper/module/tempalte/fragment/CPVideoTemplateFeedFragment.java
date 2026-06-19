package com.bilibili.upper.module.tempalte.fragment;

import HB0.b;
import Xz0.g;
import Xz0.j;
import Xz0.k;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import bF0.H1;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.magicasakura.widgets.TintFrameLayout;
import com.bilibili.moduleservice.upper.ICenterPlusContainer;
import com.bilibili.moduleservice.upper.ICenterPlusTab;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.centerplus.widgets.CenterPlusActivityDialog;
import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import com.bilibili.upper.module.contribute.picker.widget.UpperViewPager;
import eJ0.C6931i;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/fragment/CPVideoTemplateFeedFragment.class */
@StabilityInferred(parameters = 0)
public final class CPVideoTemplateFeedFragment extends VideoTemplateFragment implements ICenterPlusTab {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f113951q;

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    public final void mf() {
        b bVar = b.f8155a;
        j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        j.c("router_topic_id", g.f28463b);
        Map mapB = j.b(k.f28474a);
        b.o(b.l("creation.creation-template-selection.0.0.show", mapB), mapB);
        BLog.dfmt("BiliUpperNeuronsReport", "videoTemplatePageShow...params = " + mapB, new Object[0]);
        Neurons.reportExposure$default(false, "creation.creation-template-selection.0.0.show", mapB, (List) null, 8, (Object) null);
        CenterPlusActivityDialog.a.b(getChildFragmentManager(), "video_template");
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean needToOpenCamera(@NotNull HashMap<String, Object> map) {
        return false;
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final void onHide(boolean z6) {
        b bVar = b.f8155a;
        b.q(this.f113970c);
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final boolean onKeyDown(int i7, @Nullable KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() {
        /*
            r3 = this;
            r0 = r3
            super.onPause()
            r0 = r3
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.moduleservice.upper.ICenterPlusContainer
            if (r0 == 0) goto L2d
            r0 = r3
            androidx.fragment.app.Fragment r0 = r0.getParentFragment()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.bilibili.moduleservice.upper.ICenterPlusTab
            if (r0 == 0) goto L2d
            r0 = r6
            com.bilibili.moduleservice.upper.ICenterPlusContainer r0 = (com.bilibili.moduleservice.upper.ICenterPlusContainer) r0
            r1 = r5
            com.bilibili.moduleservice.upper.ICenterPlusTab r1 = (com.bilibili.moduleservice.upper.ICenterPlusTab) r1
            boolean r0 = r0.isCurrentShow(r1)
            r4 = r0
            goto L2f
        L2d:
            r0 = 0
            r4 = r0
        L2f:
            r0 = r4
            if (r0 == 0) goto L3e
            HB0.b r0 = HB0.b.f8155a
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.f113970c
            HB0.b.q(r0)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.tempalte.fragment.CPVideoTemplateFeedFragment.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            r3 = this;
            r0 = r3
            super.onResume()
            r0 = r3
            androidx.fragment.app.FragmentActivity r0 = r0.p3()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.moduleservice.upper.ICenterPlusContainer
            if (r0 == 0) goto L2d
            r0 = r3
            androidx.fragment.app.Fragment r0 = r0.getParentFragment()
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof com.bilibili.moduleservice.upper.ICenterPlusTab
            if (r0 == 0) goto L2d
            r0 = r6
            com.bilibili.moduleservice.upper.ICenterPlusContainer r0 = (com.bilibili.moduleservice.upper.ICenterPlusContainer) r0
            r1 = r5
            com.bilibili.moduleservice.upper.ICenterPlusTab r1 = (com.bilibili.moduleservice.upper.ICenterPlusTab) r1
            boolean r0 = r0.isCurrentShow(r1)
            r4 = r0
            goto L2f
        L2d:
            r0 = 0
            r4 = r0
        L2f:
            r0 = r4
            if (r0 == 0) goto L49
            r0 = r3
            boolean r0 = r0.f113951q
            if (r0 == 0) goto L49
            HB0.b r0 = HB0.b.f8155a
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.f113970c
            HB0.b.r(r0)
            r0 = r3
            r0.mf()
        L49:
            r0 = r3
            r1 = 1
            r0.f113951q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.tempalte.fragment.CPVideoTemplateFeedFragment.onResume():void");
    }

    @Override // com.bilibili.moduleservice.upper.ICenterPlusTab
    public final void onShow() {
        b bVar = b.f8155a;
        b.r(this.f113970c);
        mf();
        CenterPlusStatisticsHelper.g(3, "tab_show", null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_VARIETY);
    }

    @Override // com.bilibili.upper.module.tempalte.fragment.VideoTemplateFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        TintFrameLayout tintFrameLayout;
        UpperViewPager upperViewPager;
        TintFrameLayout tintFrameLayout2;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        view.setFitsSystemWindows(false);
        H1 h12 = this.f113980n;
        if (h12 != null && (tintFrameLayout2 = h12.f54810A) != null && (layoutParams = tintFrameLayout2.getLayoutParams()) != null) {
            layoutParams.height = C6931i.a(view.getContext(), 48.0f);
        }
        H1 h13 = this.f113980n;
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) ((h13 == null || (upperViewPager = h13.f54811B) == null) ? null : upperViewPager.getLayoutParams());
        if (layoutParams2 != null) {
            androidx.core.content.g gVarP3 = p3();
            ICenterPlusContainer iCenterPlusContainer = null;
            if (gVarP3 instanceof ICenterPlusContainer) {
                iCenterPlusContainer = (ICenterPlusContainer) gVarP3;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iCenterPlusContainer != null ? iCenterPlusContainer.getTabBarHeight() : C6931i.a(view.getContext(), 50.0f);
        }
        H1 h14 = this.f113980n;
        if (h14 == null || (tintFrameLayout = h14.f54810A) == null) {
            return;
        }
        tintFrameLayout.setBackgroundResource(2131241404);
    }
}
