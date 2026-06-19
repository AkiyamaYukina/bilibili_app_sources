package com.bilibili.studio.centerplus.ui;

import com.bilibili.studio.centerplus.statistics.CenterPlusStatisticsHelper;
import com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment;
import com.bilibili.studio.videoeditor.capturev3.fragment.ForwardCaptureFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/ui/h.class */
public final class h implements BaseCaptureFragment.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabCaptureFragmentV2 f105278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ForwardCaptureFragment f105279b;

    public h(TabCaptureFragmentV2 tabCaptureFragmentV2, ForwardCaptureFragment forwardCaptureFragment) {
        this.f105278a = tabCaptureFragmentV2;
        this.f105279b = forwardCaptureFragment;
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.base.BaseCaptureFragment.a
    public final void a(boolean z6) {
        String str = CenterPlusStatisticsHelper.f105195a;
        boolean z7 = CenterPlusStatisticsHelper.f105198d;
        TabCaptureFragmentV2 tabCaptureFragmentV2 = this.f105278a;
        CenterPlusStatisticsHelper.h("capture_pageload", tabCaptureFragmentV2.f105226s, z7, tabCaptureFragmentV2.f105243k, -1, -1, "1", false);
        long j7 = this.f105279b.f109115o;
        String str2 = tabCaptureFragmentV2.f105226s;
        boolean z8 = tabCaptureFragmentV2.f105243k;
        ((HashMap) CenterPlusStatisticsHelper.f105196b).put("capture_sdkload", Long.valueOf(j7));
        CenterPlusStatisticsHelper.h("capture_sdkload", str2, z7, z8, -1, -1, "1", false);
        CenterPlusStatisticsHelper.f105198d = false;
    }
}
