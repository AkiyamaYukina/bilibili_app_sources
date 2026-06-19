package com.bilibili.pegasus.channelv2.alllist;

import Op0.b;
import Qn0.j;
import Qn0.k;
import Qn0.l;
import Vn0.c;
import Vn0.g;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.api.BiliApiException;
import com.bilibili.bililive.infra.log.LiveLog;
import com.bilibili.bililive.infra.log.LiveLogDelegate;
import com.bilibili.bililive.room.biz.shopping.beans.LiveGoodsCardDetail;
import com.bilibili.bililive.room.biz.shopping.beans.LiveShoppingRecommendCardGoodsDetail;
import com.bilibili.bililive.room.biz.shopping.service.LiveRoomShoppingBusinessService;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.P0;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.mixin.IFragmentShowHide;
import com.bilibili.lib.ui.swiperefresh.BaseSwipeRecyclerViewFragment;
import com.bilibili.pegasus.channelv2.alllist.ChannelAllListFragment;
import com.bilibili.pegasus.channelv2.api.model.ChannelItem;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.mall.common.utils.CodeReinfoceReportUtils;
import com.mall.data.page.create.presale.PreSaleCreateDataBean;
import com.mall.ui.page.create2.PreSaleFragmentV3;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/ChannelAllListFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelAllListFragment extends BaseSwipeRecyclerViewFragment implements PassportObserver, IFragmentShowHide, IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f74955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f74956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public k f74957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public List<? extends ChannelItem> f74958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c f74959f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l f74960g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/alllist/ChannelAllListFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74961a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f74961a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Qn0.l] */
    public ChannelAllListFragment() {
        final int i7 = 0;
        this.f74960g = new Observer(this, i7) { // from class: Qn0.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f20087a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f20088b;

            {
                this.f20087a = i7;
                this.f20088b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                switch (this.f20087a) {
                    case 0:
                        ChannelAllListFragment.kf((ChannelAllListFragment) this.f20088b, (Resource) obj);
                        break;
                    case 1:
                        if (((LiveGoodsCardDetail) obj) != null) {
                            LiveRoomShoppingBusinessService liveRoomShoppingBusinessService = (LiveRoomShoppingBusinessService) this.f20088b;
                            String str = null;
                            liveRoomShoppingBusinessService.z = null;
                            liveRoomShoppingBusinessService.o();
                            liveRoomShoppingBusinessService.j().getClass();
                            if (liveRoomShoppingBusinessService.D == LiveRoomShoppingBusinessService.ShoppingViewType.SHOPPING_VIEW_EXPLAIN_CARD) {
                                Pair pair = (Pair) liveRoomShoppingBusinessService.j().u.getValue();
                                LiveShoppingRecommendCardGoodsDetail liveShoppingRecommendCardGoodsDetail = pair != null ? (LiveShoppingRecommendCardGoodsDetail) pair.getFirst() : null;
                                if (liveShoppingRecommendCardGoodsDetail != null) {
                                    List list = liveShoppingRecommendCardGoodsDetail.recommendGoodsList;
                                    if (list == null || list.isEmpty()) {
                                        LiveLog.Companion companion = LiveLog.Companion;
                                        if (companion.isDebug()) {
                                            BLog.d("LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods.recommendGoodsList is null.");
                                            LiveLogDelegate logDelegate = companion.getLogDelegate();
                                            if (logDelegate != null) {
                                                LiveLogDelegate.onLog$default(logDelegate, 4, "LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods.recommendGoodsList is null.", (Throwable) null, 8, (Object) null);
                                            }
                                        } else if (companion.matchLevel(4) && companion.matchLevel(3)) {
                                            LiveLogDelegate logDelegate2 = companion.getLogDelegate();
                                            if (logDelegate2 != null) {
                                                LiveLogDelegate.onLog$default(logDelegate2, 3, "LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods.recommendGoodsList is null.", (Throwable) null, 8, (Object) null);
                                            }
                                            BLog.i("LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods.recommendGoodsList is null.");
                                        }
                                        liveRoomShoppingBusinessService.f();
                                    } else {
                                        LiveLog.Companion companion2 = LiveLog.Companion;
                                        if (companion2.matchLevel(3)) {
                                            try {
                                                str = "observerRemoveGoodsCard cacheGoods " + liveShoppingRecommendCardGoodsDetail;
                                            } catch (Exception e7) {
                                                BLog.e("LiveLog", "getLogMessage", e7);
                                            }
                                            String str2 = str;
                                            if (str == null) {
                                                str2 = "";
                                            }
                                            LiveLogDelegate logDelegate3 = companion2.getLogDelegate();
                                            if (logDelegate3 != null) {
                                                LiveLogDelegate.onLog$default(logDelegate3, 3, "LiveRoomShoppingBusinessService", str2, (Throwable) null, 8, (Object) null);
                                            }
                                            BLog.i("LiveRoomShoppingBusinessService", str2);
                                        }
                                        liveRoomShoppingBusinessService.s(LiveRoomShoppingBusinessService.ShoppingViewType.SHOPPING_VIEW_RECOMMEND_CARD, (LiveGoodsCardDetail) null, liveShoppingRecommendCardGoodsDetail, (Function0) null, new MZ.c(liveRoomShoppingBusinessService, 1));
                                    }
                                } else {
                                    LiveLog.Companion companion3 = LiveLog.Companion;
                                    if (companion3.isDebug()) {
                                        BLog.d("LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods is null.");
                                        LiveLogDelegate logDelegate4 = companion3.getLogDelegate();
                                        if (logDelegate4 != null) {
                                            LiveLogDelegate.onLog$default(logDelegate4, 4, "LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods is null.", (Throwable) null, 8, (Object) null);
                                        }
                                    } else if (companion3.matchLevel(4) && companion3.matchLevel(3)) {
                                        LiveLogDelegate logDelegate5 = companion3.getLogDelegate();
                                        if (logDelegate5 != null) {
                                            LiveLogDelegate.onLog$default(logDelegate5, 3, "LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods is null.", (Throwable) null, 8, (Object) null);
                                        }
                                        BLog.i("LiveRoomShoppingBusinessService", "observerRemoveGoodsCard cacheGoods is null.");
                                    }
                                    liveRoomShoppingBusinessService.f();
                                }
                            }
                            break;
                        }
                        break;
                    case 2:
                        if (((Boolean) obj) != null) {
                            ((P0) this.f20088b).s();
                        }
                        break;
                    default:
                        try {
                            ((PreSaleFragmentV3) this.f20088b).Ff((PreSaleCreateDataBean) obj);
                        } catch (Exception e8) {
                            CodeReinfoceReportUtils.a.a(CodeReinfoceReportUtils.CodeReinforceExcepType.SUB_EVENT_NATIVE_COMPONENT_ERROR.ordinal(), "PreSaleFragmentV3", "notifyPrCreateDataUpdate", e8);
                        }
                        break;
                }
            }
        };
    }

    public static void kf(ChannelAllListFragment channelAllListFragment, Resource resource) {
        Status status = resource.getStatus();
        int i7 = status == null ? -1 : a.f74961a[status.ordinal()];
        if (i7 == 1) {
            if (x.q(channelAllListFragment.f74958e)) {
                channelAllListFragment.showLoading();
                return;
            }
            return;
        }
        if (i7 == 2) {
            channelAllListFragment.hideLoading();
            channelAllListFragment.setRefreshCompleted();
            List<? extends ChannelItem> list = (List) resource.getData();
            if (list != null && list.size() != 1) {
                channelAllListFragment.f74958e = list;
                k kVar = channelAllListFragment.f74957d;
                if (kVar != null) {
                    List<? extends ChannelItem> list2 = kVar.f20086b;
                    kVar.f20086b = list;
                    DiffUtil.calculateDiff(new j(list, list2)).dispatchUpdatesTo(kVar);
                    return;
                }
                return;
            }
            ViewGroup.LayoutParams layoutParams = channelAllListFragment.mLoadingView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = null;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            }
            if (layoutParams2 != null) {
                layoutParams2.topMargin = (int) channelAllListFragment.getResources().getDimension(2131165618);
                channelAllListFragment.showEmptyTips();
                return;
            }
            return;
        }
        if (i7 != 3) {
            return;
        }
        channelAllListFragment.setRefreshCompleted();
        channelAllListFragment.hideLoading();
        if (x.q(channelAllListFragment.f74958e)) {
            k kVar2 = channelAllListFragment.f74957d;
            if (kVar2 != null) {
                List<? extends ChannelItem> listEmptyList = CollectionsKt.emptyList();
                List<? extends ChannelItem> list3 = kVar2.f20086b;
                kVar2.f20086b = listEmptyList;
                DiffUtil.calculateDiff(new j(listEmptyList, list3)).dispatchUpdatesTo(kVar2);
            }
            ViewGroup.LayoutParams layoutParams3 = channelAllListFragment.mLoadingView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.topMargin = (int) channelAllListFragment.getResources().getDimension(2131165618);
                channelAllListFragment.showErrorTips();
            }
        }
        BiliApiException error = resource.getError();
        BiliApiException biliApiException = error instanceof BiliApiException ? error : null;
        String message = null;
        if (biliApiException != null) {
            message = biliApiException.getMessage();
        }
        if (TextUtils.isEmpty(message)) {
            return;
        }
        ToastHelper.showToastShort(channelAllListFragment.getContext(), message);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return b.b("traffic.discovery-channel-tab.0.0");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putString("tab_name", this.f74956c);
        return bundle;
    }

    public final void lf() {
        c cVar = this.f74959f;
        if (cVar != null) {
            long j7 = this.f74955b;
            if (j7 == -1) {
                return;
            }
            g gVarK0 = cVar.K0(j7);
            MutableLiveData<Resource<List<ChannelItem>>> mutableLiveDataJ0 = cVar.J0(j7);
            if (gVarK0.f25630e) {
                return;
            }
            gVarK0.f25628c = "";
            gVarK0.f25629d = true;
            gVarK0.f25631f.clear();
            cVar.L0(gVarK0, mutableLiveDataJ0);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(@NotNull Context context) {
        Long longOrNull;
        super.onAttach(context);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_channel_id") : null;
        this.f74955b = (string == null || (longOrNull = StringsKt.toLongOrNull(string)) == null) ? -1L : longOrNull.longValue();
        Bundle arguments2 = getArguments();
        String string2 = null;
        if (arguments2 != null) {
            string2 = arguments2.getString("key_channel_name");
        }
        this.f74956c = string2;
    }

    public final void onChange(@Nullable Topic topic) {
        lf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
        setHasOptionsMenu(true);
        BiliAccounts.get(getContext()).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            c cVar = (c) new ViewModelProvider(fragmentActivityP3, ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(fragmentActivityP3.getApplication())).get(c.class);
            this.f74959f = cVar;
            if (cVar != null) {
                cVar.J0(this.f74955b).observe(this, this.f74960g);
            }
            c cVar2 = this.f74959f;
            if (cVar2 != null) {
                cVar2.f25606k = this.f74956c;
            }
        }
        c cVar3 = this.f74959f;
        if (cVar3 != null) {
            Resource<List<ChannelItem>> value = cVar3.J0(this.f74955b).getValue();
            List<? extends ChannelItem> list = null;
            if (value != null) {
                list = (List) value.getData();
            }
            this.f74958e = list;
        }
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRecyclerViewFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BiliAccounts.get(getContext()).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        PageViewTracker.getInstance().setFragmentVisibility(this, false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        PageViewTracker.getInstance().setFragmentVisibility(this, true);
        if (x.q(this.f74958e)) {
            lf();
        }
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRefreshFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        super.onRefresh();
        lf();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        Lifecycle lifecycle = getLifecycle();
        LifecycleRegistry lifecycleRegistry = lifecycle instanceof LifecycleRegistry ? (LifecycleRegistry) lifecycle : null;
        if (lifecycleRegistry != null) {
            lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Type inference failed for: r1v4, types: [Fi.c, java.lang.Object] */
    @Override // com.bilibili.lib.ui.swiperefresh.BaseSwipeRecyclerViewFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.Nullable androidx.recyclerview.widget.RecyclerView r7, @org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.alllist.ChannelAllListFragment.onViewCreated(androidx.recyclerview.widget.RecyclerView, android.os.Bundle):void");
    }
}
