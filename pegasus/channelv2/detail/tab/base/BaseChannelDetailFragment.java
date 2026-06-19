package com.bilibili.pegasus.channelv2.detail.tab.base;

import CE0.f;
import K90.c;
import Lp0.b;
import Ua0.s;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ao0.InterfaceC4805D;
import ao0.InterfaceC4806E;
import ao0.t;
import bo0.AbstractC5132b;
import bo0.C5131a;
import bo0.r;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.bililive.room.biz.shopping.view.goodslist.LiveRoomShoppingGoodsListFragment;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.imageviewer.fragment.ImageFragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.okretro.BiliApiParseException;
import com.bilibili.pegasus.api.model.ChannelV2;
import com.bilibili.pegasus.api.modelv2.channel.ChannelDetailResponse;
import com.bilibili.pegasus.api.modelv2.channel.base.BaseChannelDetailItem;
import com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment;
import com.bilibili.pegasus.promo.BaseListFragment;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pegasus.widgets.LoadMoreRecyclerView;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.upos.videoupload.UpOSTask;
import com.google.android.material.datepicker.d;
import ho0.C7485b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ro0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/base/BaseChannelDetailFragment.class */
@StabilityInferred(parameters = 0)
public abstract class BaseChannelDetailFragment extends BaseListFragment implements InterfaceC4806E, SwipeRefreshLayout.OnRefreshListener, r, IPvTracker, InterfaceC4805D {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f75224y = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Fh.a f75226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public SwipeRefreshLayout f75227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View f75228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public TextView f75229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public ImageView f75230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f75231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public AbstractC5132b f75232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public t f75233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f75234r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final f f75238v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public String f75225i = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f75235s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f75236t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final s f75237u = new s(this, 1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final b f75239w = new RecyclerView.OnScrollListener();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final d f75240x = new d(this, 1);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/base/BaseChannelDetailFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75241a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f75241a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [CE0.f] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Lp0.b, androidx.recyclerview.widget.RecyclerView$OnScrollListener] */
    public BaseChannelDetailFragment() {
        final int i7 = 3;
        this.f75238v = new Runnable(this, i7) { // from class: CE0.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f1547b;

            {
                this.f1546a = i7;
                this.f1547b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.f1546a) {
                    case 0:
                        UpOSTask upOSTask = (UpOSTask) this.f1547b;
                        ConcurrentHashMap concurrentHashMap = UpOSTask.n;
                        synchronized (upOSTask) {
                            if (upOSTask.e) {
                                return;
                            }
                            upOSTask.c.pause();
                            return;
                        }
                    case 1:
                        ImageFragment imageFragment = (ImageFragment) this.f1547b;
                        imageFragment.Cf();
                        imageFragment.pf();
                        imageFragment.wf();
                        return;
                    case 2:
                        LiveRoomShoppingGoodsListFragment liveRoomShoppingGoodsListFragment = (LiveRoomShoppingGoodsListFragment) this.f1547b;
                        LiveRoomShoppingGoodsListFragment.a aVar = LiveRoomShoppingGoodsListFragment.E;
                        ListExtentionsKt.smoothScrollToTop(liveRoomShoppingGoodsListFragment.nf());
                        return;
                    default:
                        SwipeRefreshLayout swipeRefreshLayout = ((BaseChannelDetailFragment) this.f1547b).f75227k;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(false);
                            return;
                        }
                        return;
                }
            }
        };
    }

    @Override // bo0.r
    @Nullable
    public final AbstractC5132b Kd() {
        return this.f75232p;
    }

    @Override // ao0.InterfaceC4805D
    public final void Pd() {
        p<Void> pVar;
        t tVar = this.f75233q;
        if (tVar == null || (pVar = tVar.f53630m) == null) {
            return;
        }
        pVar.setValue(null);
    }

    public final Fragment getFragment() {
        return this;
    }

    @NotNull
    public final String getPageId() {
        return this.f75225i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.bilibili.pvtracker.IPvTracker
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle getPvExtra() {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r4
            bo0.b r0 = r0.f75232p
            r5 = r0
            java.lang.String r0 = ""
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r5
            com.bilibili.pegasus.api.model.ChannelV2 r0 = r0.I0()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2c
            r0 = r5
            long r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L2f
        L2c:
            java.lang.String r0 = ""
            r5 = r0
        L2f:
            r0 = r8
            java.lang.String r1 = "channel-id"
            r2 = r5
            r0.putString(r1, r2)
            r0 = r4
            ao0.t r0 = r0.f75233q
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L50
            r0 = r7
            java.lang.String r0 = r0.f53626i
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L50
            r0 = r6
            r5 = r0
            goto L50
        L50:
            r0 = r8
            java.lang.String r1 = "from"
            r2 = r5
            r0.putString(r1, r2)
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment.getPvExtra():android.os.Bundle");
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final boolean hasNextPage() {
        return this.f78458d && this.f75234r;
    }

    public abstract void initViewModel();

    @NotNull
    public abstract C5131a lf();

    public final void mf() {
        C5131a c5131aLf = lf();
        BaseChannelDetailItem baseChannelDetailItem = new BaseChannelDetailItem();
        baseChannelDetailItem.cardType = "channel_detail_footer_empty";
        ((c) baseChannelDetailItem).viewType = 13976987;
        K90.a.N(c5131aLf, baseChannelDetailItem);
        lf().notifyItemRangeInserted(lf().getItemCount(), 1);
    }

    public void nf() {
        this.f78457c = false;
        this.f75235s = false;
        SwipeRefreshLayout swipeRefreshLayout = this.f75227k;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.removeCallbacks(this.f75237u);
        }
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f75231o);
        if (iElapsedRealtime < 0 || iElapsedRealtime >= 500) {
            SwipeRefreshLayout swipeRefreshLayout2 = this.f75227k;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.post(this.f75238v);
            }
        } else {
            SwipeRefreshLayout swipeRefreshLayout3 = this.f75227k;
            if (swipeRefreshLayout3 != null) {
                swipeRefreshLayout3.postDelayed(this.f75238v, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE - iElapsedRealtime);
            }
        }
        View view = this.f75228l;
        if (view != null) {
            view.setVisibility(8);
        }
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.post(this.f75240x);
        }
    }

    @Override // ao0.InterfaceC4806E
    public final void o6(@NotNull ChannelV2 channelV2) {
        AbstractC5132b abstractC5132b = this.f75232p;
        if (abstractC5132b != null) {
            abstractC5132b.N0(channelV2);
        }
    }

    public abstract void of(@NotNull String str);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495229, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Handler handler;
        super.onDestroyView();
        SwipeRefreshLayout swipeRefreshLayout = this.f75227k;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f75227k;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.destroyDrawingCache();
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.f75227k;
        if (swipeRefreshLayout3 != null) {
            swipeRefreshLayout3.clearAnimation();
        }
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView == null || (handler = mRecyclerView.getHandler()) == null) {
            return;
        }
        handler.removeCallbacks(this.f75240x);
    }

    public final void onDetailRefresh() {
        if (this.f75227k != null) {
            ListExtentionsKt.smoothScrollToTop(getMRecyclerView());
            u8();
        }
    }

    @Override // com.bilibili.pegasus.promo.BaseListFragment
    public final void onLoadNextPage() {
        if (activityDie() || this.f78457c) {
            return;
        }
        this.f78457c = true;
        AbstractC5132b abstractC5132b = this.f75232p;
        if (abstractC5132b != null) {
            abstractC5132b.h = false;
        }
        if (abstractC5132b != null) {
            abstractC5132b.M0(getApplicationContext());
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    @CallSuper
    public final void onRefresh() {
        this.f75231o = SystemClock.elapsedRealtime();
        u8();
        Fh.a aVar = this.f75226j;
        if (aVar != null) {
            aVar.a();
        }
        this.f75226j = null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        MutableLiveData<Resource<ChannelDetailResponse>> mutableLiveData;
        this.f78460f.a((RecyclerView) view.findViewById(2131306595), BaseListFragment.h[0]);
        ((LoadMoreRecyclerView) getMRecyclerView()).setOnLoadMoreListener(new Te.d(this, 3));
        RecyclerView mRecyclerView = getMRecyclerView();
        if (mRecyclerView != null) {
            mRecyclerView.setBackgroundColor(ThemeUtils.getColorById(p3(), R$color.f64616Wh0));
        }
        RecyclerView mRecyclerView2 = getMRecyclerView();
        if (mRecyclerView2 != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new C7485b(this));
            mRecyclerView2.setLayoutManager(gridLayoutManager);
        }
        int px = ListExtentionsKt.toPx(12.0f);
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = ListExtentionsKt.toPx(6.0f);
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = ListExtentionsKt.toPx(8.0f);
        Ref.IntRef intRef3 = new Ref.IntRef();
        intRef3.element = ListExtentionsKt.toPx(12.0f);
        RecyclerView mRecyclerView3 = getMRecyclerView();
        if (mRecyclerView3 != null) {
            mRecyclerView3.addItemDecoration(new ho0.c(intRef2, px, intRef, intRef3));
        }
        RecyclerView mRecyclerView4 = getMRecyclerView();
        if (mRecyclerView4 != null) {
            mRecyclerView4.setAdapter(lf());
        }
        RecyclerView mRecyclerView5 = getMRecyclerView();
        if (mRecyclerView5 != null) {
            mRecyclerView5.addOnScrollListener(this.f75239w);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(2131312766);
        this.f75227k = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.f75227k;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeColors(ThemeUtils.getColorById(getContext(), 2131100866));
        }
        View viewFindViewById = view.findViewById(2131301032);
        this.f75228l = viewFindViewById;
        this.f75230n = viewFindViewById != null ? (ImageView) viewFindViewById.findViewById(2131301157) : null;
        View view2 = this.f75228l;
        TextView textView = null;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(2131301181);
        }
        this.f75229m = textView;
        AbstractC5132b abstractC5132b = this.f75232p;
        if (abstractC5132b == null || (mutableLiveData = abstractC5132b.f56844k) == null) {
            return;
        }
        mutableLiveData.observe(this, new Observer(this) { // from class: ho0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BaseChannelDetailFragment f121056a;

            {
                this.f121056a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws NoWhenBranchMatchedException {
                ChannelDetailResponse channelDetailResponse;
                String str;
                Resource resource = (Resource) obj;
                int i7 = BaseChannelDetailFragment.f75224y;
                if (resource == null) {
                    return;
                }
                int i8 = BaseChannelDetailFragment.a.f75241a[resource.getStatus().ordinal()];
                BaseChannelDetailFragment baseChannelDetailFragment = this.f121056a;
                if (i8 == 1) {
                    baseChannelDetailFragment.nf();
                    AbstractC5132b abstractC5132b2 = baseChannelDetailFragment.f75232p;
                    if ((abstractC5132b2 != null ? abstractC5132b2.f56839e : null) == null && (channelDetailResponse = (ChannelDetailResponse) resource.getData()) != null && (str = channelDetailResponse.notifyText) != null) {
                        baseChannelDetailFragment.of(str);
                    }
                    AbstractC5132b abstractC5132b3 = baseChannelDetailFragment.f75232p;
                    if (abstractC5132b3 != null) {
                        ChannelDetailResponse channelDetailResponse2 = (ChannelDetailResponse) resource.getData();
                        abstractC5132b3.f56839e = channelDetailResponse2 != null ? channelDetailResponse2.offset : null;
                    }
                    ChannelDetailResponse channelDetailResponse3 = (ChannelDetailResponse) resource.getData();
                    baseChannelDetailFragment.f75234r = channelDetailResponse3 != null ? channelDetailResponse3.hasMore : false;
                    ChannelDetailResponse channelDetailResponse4 = (ChannelDetailResponse) resource.getData();
                    List list = channelDetailResponse4 != null ? channelDetailResponse4.items : null;
                    if (x.q(list)) {
                        AbstractC5132b abstractC5132b4 = baseChannelDetailFragment.f75232p;
                        if (abstractC5132b4 == null || !abstractC5132b4.h) {
                            if (!baseChannelDetailFragment.f75234r) {
                                baseChannelDetailFragment.mf();
                                baseChannelDetailFragment.f78458d = false;
                            }
                        } else if (baseChannelDetailFragment.lf().getItemCount() == 0) {
                            ImageView imageView = baseChannelDetailFragment.f75230n;
                            if (imageView != null) {
                                imageView.setImageResource(2131235613);
                            }
                            TextView textView2 = baseChannelDetailFragment.f75229m;
                            if (textView2 != null) {
                                textView2.setText(2131845371);
                            }
                            View view3 = baseChannelDetailFragment.f75228l;
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                        } else {
                            PromoToast.showTopToast(baseChannelDetailFragment.p3(), 2131841349);
                        }
                    } else if (baseChannelDetailFragment.f78458d) {
                        AbstractC5132b abstractC5132b5 = baseChannelDetailFragment.f75232p;
                        if (abstractC5132b5 == null || !abstractC5132b5.h) {
                            K90.a aVarLf = baseChannelDetailFragment.lf();
                            aVarLf.getClass();
                            if (list != null && !list.isEmpty()) {
                                int itemCount = aVarLf.getItemCount();
                                ((ArrayList) aVarLf.a).addAll(list);
                                aVarLf.notifyItemRangeInserted(itemCount, list.size());
                            }
                        } else {
                            baseChannelDetailFragment.lf().Q(list, true);
                        }
                        if (!baseChannelDetailFragment.f75234r) {
                            baseChannelDetailFragment.mf();
                            baseChannelDetailFragment.f78458d = false;
                        }
                    }
                } else if (i8 == 2) {
                    Throwable error = resource.getError();
                    baseChannelDetailFragment.nf();
                    AbstractC5132b abstractC5132b6 = baseChannelDetailFragment.f75232p;
                    if (abstractC5132b6 == null || !abstractC5132b6.h) {
                        PromoToast.showBottomToast(baseChannelDetailFragment.p3(), 2131841349);
                    } else if (baseChannelDetailFragment.lf().getItemCount() == 0) {
                        ImageView imageView2 = baseChannelDetailFragment.f75230n;
                        if (imageView2 != null) {
                            imageView2.setImageResource(2131232151);
                        }
                        TextView textView3 = baseChannelDetailFragment.f75229m;
                        if (textView3 != null) {
                            textView3.setText(2131841503);
                        }
                        View view4 = baseChannelDetailFragment.f75228l;
                        if (view4 != null) {
                            view4.setVisibility(0);
                        }
                    } else {
                        PromoToast.showTopToast(baseChannelDetailFragment.p3(), 2131841349);
                    }
                    if (!(error instanceof BiliApiException) && !(error instanceof BiliApiParseException)) {
                        PromoToast.showBottomToast(baseChannelDetailFragment.p3(), 2131841503);
                    }
                } else if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC5132b abstractC5132b7 = baseChannelDetailFragment.f75232p;
                if (abstractC5132b7 != null) {
                    abstractC5132b7.f56844k.setValue(null);
                }
            }
        });
    }

    public final void setInitOffset(int i7) {
    }

    public final void setPageId(@NotNull String str) {
        this.f75225i = str;
    }

    public final void setRefreshCallback(@NotNull Fh.a aVar) {
        this.f75226j = aVar;
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        t tVar;
        super.setUserVisibleCompat(z6);
        if (p3() == null || this.f75227k == null) {
            return;
        }
        t tVar2 = this.f75233q;
        boolean zAreEqual = Intrinsics.areEqual(tVar2 != null ? tVar2.f53622d : null, this.f75225i);
        if (z6 && zAreEqual && (tVar = this.f75233q) != null) {
            tVar.f53622d = null;
        }
        this.f75236t = (this.f75235s && zAreEqual) ? false : true;
        if (!z6 || lf().getItemCount() != 0 || this.f78457c || zAreEqual) {
            return;
        }
        u8();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final boolean shouldReport() {
        return this.f75236t;
    }

    @Override // bo0.r
    public final void u8() {
        if (this.f78457c || activityDie()) {
            return;
        }
        this.f78458d = true;
        this.f78457c = true;
        SwipeRefreshLayout swipeRefreshLayout = this.f75227k;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.post(this.f75237u);
        }
        AbstractC5132b abstractC5132b = this.f75232p;
        if (abstractC5132b != null) {
            abstractC5132b.h = true;
        }
        if (abstractC5132b != null) {
            abstractC5132b.f56839e = null;
        }
        this.f75234r = true;
        if (abstractC5132b != null) {
            abstractC5132b.M0(getApplicationContext());
        }
    }
}
