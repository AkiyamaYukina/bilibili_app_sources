package com.bilibili.pegasus.hot.tab;

import Aa.i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.material3.internal.C4094s;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bapis.bilibili.app.show.popular.v1.PopularReply;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comment3.utils.r;
import com.bilibili.base.BiliContext;
import com.bilibili.common.fallbackcache.c;
import com.bilibili.commons.time.DateUtils;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.homepage.startdust.OnPageSelectChangeListener;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.pegasus.api.C;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.api.modelv2.HotPageConfig;
import com.bilibili.pegasus.api.modelv2.PegasusHotFeedResponse;
import com.bilibili.pegasus.api.n;
import com.bilibili.pegasus.utils.D;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.recommendmode.RecommendMode;
import com.bilibili.spmid.SPMID;
import com.bilibili.spmid.SPMTrackNodeWrapper;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class IndexHotFragment extends Hilt_IndexHotFragment implements OnPageSelectChangeListener, ha0.c, IPvTracker, ha0.b, SPMTrackNodeWrapper {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f78165p0 = 0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f78167U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    @Nullable
    public String f78170X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @Nullable
    public bY.c<RecyclerView> f78171Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @Inject
    public com.bilibili.common.fallbackcache.e f78172Z;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @NotNull
    public String f78166T = "";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final Lazy f78168V = LazyKt.lazy(new Aa1.a(9));

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final int f78169W = 4;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final Lazy f78173a0 = LazyKt.lazy(new C4094s(this, 2));

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @NotNull
    public final a f78174c0 = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragment$HotCacheCallbackImpl.class */
    public final class HotCacheCallbackImpl implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f78175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IndexHotFragment f78176b;

        public HotCacheCallbackImpl(@NotNull IndexHotFragment indexHotFragment, String str) {
            this.f78176b = indexHotFragment;
            this.f78175a = str;
        }

        public final void a(@NotNull PopularReply popularReply) {
            IndexHotFragment indexHotFragment = this.f78176b;
            if (((Boolean) indexHotFragment.f78168V.getValue()).booleanValue()) {
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(indexHotFragment), Dispatchers.getIO(), (CoroutineStart) null, new IndexHotFragment$HotCacheCallbackImpl$write$1(popularReply, indexHotFragment, this, null), 2, (Object) null);
            }
        }

        @Nullable
        public final PegasusHotFeedResponse read() {
            IndexHotFragment indexHotFragment = this.f78176b;
            PegasusHotFeedResponse pegasusHotFeedResponse = null;
            if (((Boolean) indexHotFragment.f78168V.getValue()).booleanValue()) {
                if (indexHotFragment.nf().c() != 0) {
                    pegasusHotFeedResponse = null;
                } else {
                    c.d dVar = (com.bilibili.common.fallbackcache.c) BuildersKt.runBlocking$default((CoroutineContext) null, new IndexHotFragment$HotCacheCallbackImpl$read$res$1(indexHotFragment, this, null), 1, (Object) null);
                    if (dVar == null) {
                        return null;
                    }
                    pegasusHotFeedResponse = null;
                    if (dVar instanceof c.d) {
                        Object obj = dVar.a;
                        String str = obj instanceof String ? (String) obj : null;
                        if (str == null) {
                            return null;
                        }
                        try {
                            pegasusHotFeedResponse = new PegasusHotFeedResponse(PopularReply.parseFrom(Base64.decode(str, 2)));
                        } catch (Throwable th) {
                            pegasusHotFeedResponse = null;
                        }
                    }
                }
            }
            return pegasusHotFeedResponse;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragment$a.class */
    public static final class a extends BiliApiDataCallback<PegasusHotFeedResponse> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IndexHotFragment f78177b;

        public a(IndexHotFragment indexHotFragment) {
            this.f78177b = indexHotFragment;
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final boolean isCancel() {
            int i7 = IndexHotFragment.f78165p0;
            return this.f78177b.activityDie();
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(PegasusHotFeedResponse pegasusHotFeedResponse) {
            ArrayList arrayList;
            PegasusHotFeedResponse pegasusHotFeedResponse2 = pegasusHotFeedResponse;
            int i7 = IndexHotFragment.f78165p0;
            IndexHotFragment indexHotFragment = this.f78177b;
            indexHotFragment.f78489r = 0;
            if (pegasusHotFeedResponse2 == null || (arrayList = pegasusHotFeedResponse2.items) == null || arrayList.isEmpty()) {
                indexHotFragment.Jf();
            } else {
                if (indexHotFragment.f78487p) {
                    indexHotFragment.Lf(pegasusHotFeedResponse2);
                    indexHotFragment.f78170X = D.b();
                } else {
                    indexHotFragment.Mf(pegasusHotFeedResponse2);
                }
                HotPageConfig hotPageConfig = pegasusHotFeedResponse2.config;
                indexHotFragment.f78120I = hotPageConfig;
                String str = hotPageConfig != null ? hotPageConfig.toast : null;
                KProperty<Object>[] kPropertyArr = com.bilibili.pegasus.hot.tab.b.f78185a;
                if (RecommendMode.isRecommendModeEnable() && str != null && !StringsKt.isBlank(str)) {
                    KProperty<Object>[] kPropertyArr2 = com.bilibili.pegasus.hot.tab.b.f78185a;
                    KProperty<Object> kProperty = kPropertyArr2[0];
                    com.bilibili.app.comm.list.widget.utils.D d7 = com.bilibili.pegasus.hot.tab.b.f78186b;
                    if (DateUtils.isSameDay(new Date(((Number) d7.a()).longValue()), new Date())) {
                        BLog.i("HotToast", "今天已经显示过了");
                    } else {
                        PromoToast.showTopToast(BiliContext.application(), str);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        KProperty<Object> kProperty2 = kPropertyArr2[0];
                        d7.b(Long.valueOf(jCurrentTimeMillis));
                    }
                }
            }
            bY.c<RecyclerView> cVar = indexHotFragment.f78171Y;
            if (cVar != null) {
                cVar.d();
            }
            bY.c<RecyclerView> cVar2 = indexHotFragment.f78171Y;
            if (cVar2 != null) {
                cVar2.i();
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            boolean z6 = th instanceof BiliApiException;
            IndexHotFragment indexHotFragment = this.f78177b;
            if (z6 && ((BiliApiException) th).mCode == 78000) {
                int i7 = IndexHotFragment.f78165p0;
                indexHotFragment.Jf();
            } else {
                int i8 = IndexHotFragment.f78165p0;
                indexHotFragment.Kf();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragment$b.class */
    public static final class b implements eY.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f78178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f78179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f78180c;

        public b(Rect rect, int i7, RecyclerView recyclerView) {
            this.f78178a = rect;
            this.f78179b = recyclerView;
            this.f78180c = i7;
        }

        public final Rect a() {
            Rect rect = this.f78178a;
            RecyclerView recyclerView = this.f78179b;
            rect.set(0, 0, recyclerView.getWidth(), recyclerView.getHeight() - this.f78180c);
            return this.f78178a;
        }
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment
    public final void Mf(@NotNull PegasusHotFeedResponse pegasusHotFeedResponse) {
        super.Mf(pegasusHotFeedResponse);
        this.f78490s = pegasusHotFeedResponse.feedVer;
    }

    public final void Qf() {
        HotPageConfig hotPageConfig;
        boolean z6 = Rf() > 0 && this.f78469n > 0 && Jp0.a.a() - this.f78469n > Rf();
        if (z6) {
            long jA = Jp0.a.a();
            long j7 = this.f78469n;
            long jRf = Rf();
            StringBuilder sbA = z.a(jA, "hit default auto refresh, current time:", " and last leave time:");
            sbA.append(j7);
            r.b(jRf, " and leave time gap:", "BasePegasusFragment", sbA);
        }
        if (!z6 || (hotPageConfig = this.f78120I) == null || !hotPageConfig.hitAutoRefresh() || Rf() >= 21600000) {
            return;
        }
        this.f78166T = "";
        this.f78469n = Jp0.a.a();
        if (Bf()) {
            Sf(true);
        }
    }

    public final long Rf() {
        Long longOrNull;
        String str = (String) Contract.get$default(ConfigManager.Companion.config(), "pegasus.hot_auto_refresh_second", (Object) null, 2, (Object) null);
        return (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? -1L : longOrNull.longValue() * 1000;
    }

    public final void Sf(boolean z6) {
        String str = "";
        long j7 = 0;
        if (nf().c() != 0) {
            str = "";
            j7 = 0;
            if (!this.f78487p) {
                ArrayList arrayList = (ArrayList) this.f78488q;
                str = "";
                j7 = 0;
                if (!arrayList.isEmpty()) {
                    BasicIndexItem basicIndexItem = (BasicIndexItem) CollectionsKt.last(arrayList);
                    str = basicIndexItem.param;
                    j7 = basicIndexItem.idx;
                }
            }
        }
        if (this.f78487p) {
            this.f78121J = false;
        }
        C.d(0, 0L, this.f78166T, j7, str, this.f78489r, this.f78490s, Op0.b.a(this.f78169W, 0), z6 ? 1 : 0, (n) this.f78173a0.getValue(), this.f78174c0);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.spmid.SPMTrackNodeWrapper
    @NotNull
    public final Pair<SPMID, HashMap<String, String>> fillTrackParams() {
        HashMap mapC = O4.b.c("page_type", "tab");
        String str = this.f78170X;
        if (str != null) {
            mapC.put("scm_id", str);
        }
        return new Pair<>(new SPMID("creation", SPMID.Segment.First), mapC);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.hot-tab.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    @Override // com.bilibili.pegasus.promo.BasePegasusFragment
    public final int of() {
        return this.f78169W;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAnchored(@org.jetbrains.annotations.Nullable android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "onAnchored + "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "IndexHot"
            r1 = r6
            java.lang.String r1 = r1.toString()
            tv.danmaku.android.log.BLog.d(r0, r1)
            r0 = r5
            if (r0 == 0) goto L2d
            r0 = r5
            java.lang.String r1 = "aid"
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L30
        L2d:
            java.lang.String r0 = ""
            r5 = r0
        L30:
            r0 = r4
            r1 = r5
            r0.f78166T = r1
            r0 = r4
            super.onRefresh()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.hot.tab.IndexHotFragment.onAnchored(android.os.Bundle):void");
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f78171Y = null;
        }
    }

    public final void onPageReSelected() {
        this.f78166T = "";
        if (xf() != null) {
            ListExtentionsKt.smoothScrollToTop(getMRecyclerView());
            Gf();
        }
    }

    public final void onPageSelected(@androidx.annotation.Nullable @Nullable Map<String, ? extends Object> map) {
        BLog.d("IndexHot", "onPageSelected + " + map);
    }

    public final void onPageUnselected() {
        super.setUserVisibleCompat(false);
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (tv.danmaku.bili.common.home.c.a()) {
            this.f78469n = Jp0.a.a();
        }
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, com.bilibili.pegasus.promo.BasePromoFragment
    public final void onRefresh() {
        this.f78166T = "";
        super.onRefresh();
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (tv.danmaku.bili.common.home.c.a()) {
            Qf();
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [cY.c, java.lang.Object] */
    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.setPadding(0, 0, 0, ha0.c.H3(view.getContext()));
        }
        SwipeRefreshLayout swipeRefreshLayoutXf = xf();
        if (swipeRefreshLayoutXf != null) {
            swipeRefreshLayoutXf.setStyle(1);
        }
        RecyclerView mRecyclerView2 = getMRecyclerView();
        if (mRecyclerView2 != null) {
            D.a(mRecyclerView2, TuplesKt.to(new SPMID("feed", SPMID.Segment.Third), (Object) null));
        }
        RecyclerView mRecyclerView3 = getMRecyclerView();
        ViewParent parent = mRecyclerView3 != null ? mRecyclerView3.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            D.a(view2, TuplesKt.to(new SPMID("hot-chart", SPMID.Segment.Second), (Object) null));
        }
        RecyclerView mRecyclerView4 = getMRecyclerView();
        if (mRecyclerView4 != null) {
            Rect rect = new Rect();
            Context context = getContext();
            int dimensionPixelSize = 0;
            if (context != null) {
                Resources resources = context.getResources();
                dimensionPixelSize = 0;
                if (resources != null) {
                    dimensionPixelSize = resources.getDimensionPixelSize(2131166100);
                }
            }
            b bVar = new b(rect, dimensionPixelSize, mRecyclerView4);
            bY.d dVar = new bY.d(new eY.c(mRecyclerView4));
            dVar.b(0.0f);
            bY.a aVar = dVar.b;
            aVar.b = bVar;
            aVar.e = true;
            aVar.g = new Object();
            this.f78171Y = dVar.a();
        }
        GAdBizKt.getGAdPegasus().installHotExposure(getLifecycle(), getMRecyclerView(), new i(this, 3));
    }

    @Override // com.bilibili.pegasus.hot.base.BaseHotFragment, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        if (z6) {
            Qf();
        } else if (this.f78167U) {
            this.f78469n = Jp0.a.a();
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        this.f78167U = z6;
    }

    @Override // com.bilibili.pegasus.promo.BasePromoFragment
    public final void zf() {
        Sf(false);
    }
}
