package com.bilibili.upper.module.tempalte.fragment;

import GI0.b;
import II0.j;
import II0.m;
import II0.s;
import KI0.d;
import NI0.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bF0.C5045s2;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.studio.template.data.VideoTemplateBean;
import com.bilibili.upper.module.tempalte.dialog.UpperDownloadProgressDialog;
import com.bilibili.upper.module.tempalte.dialog.UpperDownloadProgressDialogV2;
import com.bilibili.upper.module.tempalte.fragment.VideoTemplateFeedFragment;
import eJ0.t;
import gD0.InterfaceC7248b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.RecyclerView;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/fragment/VideoTemplateFeedFragment.class */
@StabilityInferred(parameters = 0)
public final class VideoTemplateFeedFragment extends BaseFragment implements InterfaceC7248b, a.InterfaceC0095a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public UpperDownloadProgressDialogV2 f113957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f113958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f113959e;
    public int h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f113964k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f113966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public C5045s2 f113967n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f113956b = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public String f113960f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f113961g = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f113962i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public String f113963j = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f113965l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Lazy f113968o = LazyKt.lazy(new II0.b(this, 0));

    @Override // NI0.a.InterfaceC0095a
    public final void Ad(int i7, @NotNull List<? extends VideoTemplateBean> list) {
        SwipeRefreshLayout swipeRefreshLayout;
        final int i8;
        if (isDetached()) {
            return;
        }
        if (this.f113966m) {
            TE0.b bVar = TE0.b.f24088a;
            boolean zJf = jf();
            bVar.getClass();
            TE0.b.f0(zJf, true);
        }
        if (i7 == 1) {
            this.f113956b.S(list, false, false);
        } else if (i7 == 2) {
            this.f113956b.S(list, true, false);
            if (this.f113965l && (i8 = this.f113964k) > 0) {
                C5045s2 c5045s2 = this.f113967n;
                if (c5045s2 != null) {
                    c5045s2.f56100b.post(new Runnable(this, i8) { // from class: II0.l

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final VideoTemplateFeedFragment f10238a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final int f10239b;

                        {
                            this.f10238a = this;
                            this.f10239b = i8;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            RecyclerView recyclerView;
                            VideoTemplateFeedFragment videoTemplateFeedFragment = this.f10238a;
                            int i9 = this.f10239b;
                            C5045s2 c5045s22 = videoTemplateFeedFragment.f113967n;
                            StaggeredGridLayoutManager staggeredGridLayoutManager = null;
                            RecyclerView.LayoutManager layoutManager = (c5045s22 == null || (recyclerView = c5045s22.f56100b) == null) ? null : recyclerView.getLayoutManager();
                            if (layoutManager instanceof StaggeredGridLayoutManager) {
                                staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                            }
                            if (staggeredGridLayoutManager == null) {
                                return;
                            }
                            staggeredGridLayoutManager.scrollToPositionWithOffset(i9, 0);
                        }
                    });
                }
                this.f113965l = false;
            }
        }
        C5045s2 c5045s22 = this.f113967n;
        if (c5045s22 != null && (swipeRefreshLayout = c5045s22.f56101c) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        this.f113966m = false;
        C5045s2 c5045s23 = this.f113967n;
        if (c5045s23 != null) {
            c5045s23.f56100b.post(new Runnable(this) { // from class: II0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoTemplateFeedFragment f10237a;

                {
                    this.f10237a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoTemplateFeedFragment videoTemplateFeedFragment = this.f10237a;
                    if (videoTemplateFeedFragment.isDetached()) {
                        return;
                    }
                    C5045s2 c5045s24 = videoTemplateFeedFragment.f113967n;
                    RecyclerView.LayoutManager layoutManager = c5045s24 != null ? c5045s24.f56100b.getLayoutManager() : null;
                    StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
                    if (staggeredGridLayoutManager == null) {
                        return;
                    }
                    int[] iArrFindLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(null);
                    if (iArrFindLastVisibleItemPositions.length == 0) {
                        return;
                    }
                    if (staggeredGridLayoutManager.getSpanCount() + iArrFindLastVisibleItemPositions[0] >= videoTemplateFeedFragment.f113956b.getItemCount()) {
                        Map<Long, a.b> map = NI0.a.f17097a;
                        NI0.a.c(videoTemplateFeedFragment.f113962i, false);
                        videoTemplateFeedFragment.f113956b.a0(2);
                    }
                }
            });
        }
    }

    @Override // gD0.InterfaceC7248b
    public final void K8() {
        FragmentActivity fragmentActivityFindFragmentActivityOrNull;
        if (this.f113957c == null) {
            UpperDownloadProgressDialogV2 upperDownloadProgressDialogV2 = new UpperDownloadProgressDialogV2();
            upperDownloadProgressDialogV2.setCancelable(false);
            upperDownloadProgressDialogV2.f113945d = new m(this);
            upperDownloadProgressDialogV2.f113946e = new j(this);
            this.f113957c = upperDownloadProgressDialogV2;
        }
        d dVar = (d) this.f113968o.getValue();
        UpperDownloadProgressDialogV2 upperDownloadProgressDialogV22 = this.f113957c;
        dVar.getClass();
        BLog.d("VideoTemplateFeedVM", "showDownloadDialog");
        if ((upperDownloadProgressDialogV22 != null && upperDownloadProgressDialogV22.f113947f) || (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getContext())) == null || fragmentActivityFindFragmentActivityOrNull.isFinishing() || fragmentActivityFindFragmentActivityOrNull.isDestroyed()) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        FragmentManager childFragmentManager = null;
        if (parentFragment != null) {
            if (parentFragment instanceof VideoTemplateFragment) {
                childFragmentManager = ((VideoTemplateFragment) parentFragment).getChildFragmentManager();
            } else {
                Fragment parentFragment2 = parentFragment.getParentFragment();
                childFragmentManager = null;
                if (parentFragment2 != null) {
                    childFragmentManager = parentFragment2 instanceof VideoTemplateFragment ? ((VideoTemplateFragment) parentFragment2).getChildFragmentManager() : d.a.a(parentFragment2, false);
                }
            }
        }
        if (childFragmentManager == null) {
            return;
        }
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("UpperDownloadProgressDialog");
        Fragment fragment = upperDownloadProgressDialogV22;
        if (fragmentFindFragmentByTag != null) {
            fragment = fragmentFindFragmentByTag;
        }
        if (!(fragment instanceof UpperDownloadProgressDialog) || ((UpperDownloadProgressDialog) fragment).isAdded()) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.add(fragment, "UpperDownloadProgressDialog");
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }

    @Override // gD0.InterfaceC7248b
    public final void Z2(int i7) {
        TextView textView;
        Resources resources;
        UpperDownloadProgressDialogV2 upperDownloadProgressDialogV2 = this.f113957c;
        if (upperDownloadProgressDialogV2 == null || (textView = upperDownloadProgressDialogV2.h) == null) {
            return;
        }
        Context context = upperDownloadProgressDialogV2.getContext();
        textView.setText((context == null || (resources = context.getResources()) == null) ? null : resources.getString(2131850740, Integer.valueOf(i7)));
    }

    @Override // gD0.InterfaceC7248b
    public final void f1() {
        UpperDownloadProgressDialogV2 upperDownloadProgressDialogV2 = this.f113957c;
        if (upperDownloadProgressDialogV2 != null) {
            try {
                upperDownloadProgressDialogV2.dismissAllowingStateLoss();
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    public final boolean jf() {
        C5045s2 c5045s2 = this.f113967n;
        return (c5045s2 != null ? c5045s2.f56101c : null).isRefreshing() || ((ArrayList) this.f113956b.f25266a).size() == 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i8, @Nullable Intent intent) {
        tv.danmaku.bili.widget.RecyclerView recyclerView;
        tv.danmaku.bili.widget.RecyclerView recyclerView2;
        super.onActivityResult(i7, i8, intent);
        if (11 == i7) {
            int intExtra = -1;
            if (intent != null) {
                intExtra = intent.getIntExtra("pos", -1);
            }
            if (intExtra >= 0) {
                C5045s2 c5045s2 = this.f113967n;
                RecyclerView.LayoutManager layoutManager = (c5045s2 == null || (recyclerView2 = c5045s2.f56100b) == null) ? null : recyclerView2.getLayoutManager();
                StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
                if (staggeredGridLayoutManager != null) {
                    C5045s2 c5045s22 = this.f113967n;
                    Integer numValueOf = (c5045s22 == null || (recyclerView = c5045s22.f56100b) == null) ? null : Integer.valueOf(ListExtentionsKt.getFirstVisible(recyclerView));
                    C5045s2 c5045s23 = this.f113967n;
                    Integer numValueOf2 = null;
                    if (c5045s23 != null) {
                        tv.danmaku.bili.widget.RecyclerView recyclerView3 = c5045s23.f56100b;
                        numValueOf2 = null;
                        if (recyclerView3 != null) {
                            numValueOf2 = Integer.valueOf(ListExtentionsKt.getLastVisible(recyclerView3));
                        }
                    }
                    if (numValueOf == null || numValueOf2 == null) {
                        return;
                    }
                    int iIntValue = numValueOf.intValue();
                    if (intExtra > numValueOf2.intValue() || iIntValue > intExtra) {
                        staggeredGridLayoutManager.scrollToPositionWithOffset(intExtra, 0);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C5045s2 c5045s2Inflate = C5045s2.inflate(getLayoutInflater(), viewGroup, false);
        this.f113967n = c5045s2Inflate;
        return c5045s2Inflate != null ? c5045s2Inflate.f56099a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Map<Long, a.b> map = a.f17097a;
        a.d(this.f113962i, this);
        super.onDestroyView();
        this.f113957c = null;
        Xz0.j.d("template_page_from");
    }

    @Override // NI0.a.InterfaceC0095a
    public final void onError(int i7) {
        Context context;
        SwipeRefreshLayout swipeRefreshLayout;
        if (this.f113966m) {
            TE0.b bVar = TE0.b.f24088a;
            boolean zJf = jf();
            bVar.getClass();
            TE0.b.f0(zJf, false);
        }
        this.f113956b.a0(3);
        C5045s2 c5045s2 = this.f113967n;
        if (c5045s2 != null && (swipeRefreshLayout = c5045s2.f56101c) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        if (isResumed()) {
            d dVar = (d) this.f113968o.getValue();
            int i8 = this.f113958d;
            s sVar = dVar.f12773a;
            if ((sVar != null ? ((Boolean) sVar.invoke(Integer.valueOf(i8))).booleanValue() : false) && (context = getContext()) != null) {
                t.c(2131849890, context);
            }
        }
        this.f113966m = false;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Xz0.j.d("template_page_from");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Type inference failed for: r1v17, types: [II0.h] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r7, @org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.tempalte.fragment.VideoTemplateFeedFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
