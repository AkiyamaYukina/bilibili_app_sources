package com.bilibili.pegasus.channel.detail;

import Nn0.b;
import Nn0.c;
import Nn0.r;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.app.comm.list.common.channel.detail.IChannelButtonOffsetCallback;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.pegasus.api.k;
import com.bilibili.pegasus.api.model.Channel;
import com.bilibili.pegasus.api.model.ChannelDataItem;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pvtracker.PageViewTracker;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelConvergeDetailFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelConvergeDetailFragment extends BaseFragment implements PassportObserver, ThemeWatcher.Observer, IChannelButtonOffsetCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public PagerSlidingTabStrip f74833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ViewPager f74834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public r f74835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ChannelDataItem f74836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f74837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f74838g = "";

    @NotNull
    public final a h = new a(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Boolean> f74839i = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelConvergeDetailFragment$a.class */
    public static final class a implements Fh.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelConvergeDetailFragment f74840a;

        public a(ChannelConvergeDetailFragment channelConvergeDetailFragment) {
            this.f74840a = channelConvergeDetailFragment;
        }

        public final void a() {
            this.f74840a.jf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    public final void jf() {
        Lazy lazy = k.a;
        ChannelDataItem channelDataItem = this.f74836e;
        ChannelDataItem channelDataItem2 = channelDataItem;
        if (channelDataItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelDataItem2 = null;
        }
        Parcelable.Creator creator = ChannelDataItem.CREATOR;
        Channel channel = new Channel();
        channel.id = channelDataItem2.a;
        channel.name = channelDataItem2.b;
        channel.attention = channelDataItem2.c;
        channel.attenNumber = channelDataItem2.d;
        channel.cover = channelDataItem2.e;
        channel.uri = channelDataItem2.f;
        channel.content = channelDataItem2.g;
        channel.headCover = channelDataItem2.h;
        channel.isActivity = channelDataItem2.i;
        BiliCallLifeCycleObserverKt.enqueue(k.b().getFeedTab(channel.id, channel.name, k.a()).setParser(new Object()), this, new com.bilibili.pegasus.channel.detail.a(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void kf(@org.jetbrains.annotations.Nullable com.bilibili.pegasus.api.model.ChannelDataItem r11) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.detail.ChannelConvergeDetailFragment.kf(com.bilibili.pegasus.api.model.ChannelDataItem):void");
    }

    public final void onChange(@Nullable Topic topic) {
        if (topic == Topic.SIGN_IN) {
            jf();
            r rVar = this.f74835d;
            ChannelDetailFragment channelDetailFragment = null;
            Fragment fragmentB = rVar != null ? rVar.b(653829648) : null;
            if (fragmentB instanceof ChannelDetailFragment) {
                channelDetailFragment = (ChannelDetailFragment) fragmentB;
            }
            if (channelDetailFragment != null) {
                channelDetailFragment.onRefresh();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0041  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            super.onCreate(r1)
            r0 = r7
            android.content.Context r0 = r0.getContext()
            com.bilibili.lib.accounts.BiliAccounts r0 = com.bilibili.lib.accounts.BiliAccounts.get(r0)
            r1 = r7
            r2 = 2
            com.bilibili.lib.accounts.subscribe.Topic[] r2 = new com.bilibili.lib.accounts.subscribe.Topic[r2]
            r3 = r2
            r4 = 0
            com.bilibili.lib.accounts.subscribe.Topic r5 = com.bilibili.lib.accounts.subscribe.Topic.SIGN_IN
            r3[r4] = r5
            r3 = r2
            r4 = 1
            com.bilibili.lib.accounts.subscribe.Topic r5 = com.bilibili.lib.accounts.subscribe.Topic.SIGN_OUT
            r3[r4] = r5
            r0.subscribe(r1, r2)
            com.bilibili.lib.ui.theme.ThemeWatcher r0 = com.bilibili.lib.ui.theme.ThemeWatcher.getInstance()
            r1 = r7
            r0.subscribe(r1)
            r0 = r7
            android.os.Bundle r0 = r0.getArguments()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L41
            r0 = r8
            java.lang.String r1 = "channel_data"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = (com.bilibili.pegasus.api.model.ChannelDataItem) r0
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L4e
        L41:
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = new com.bilibili.pegasus.api.model.ChannelDataItem
            r1 = r0
            r2 = -1
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            r8 = r0
        L4e:
            r0 = r7
            r1 = r8
            r0.f74836e = r1
            r0 = r7
            android.os.Bundle r0 = r0.getArguments()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L69
            r0 = r8
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.getString(r1)
            r8 = r0
            goto L6b
        L69:
            r0 = 0
            r8 = r0
        L6b:
            r0 = r7
            r1 = r8
            r0.f74838g = r1
            r0 = r7
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = r0.f74836e
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L83
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r9
            r8 = r0
            goto L83
        L83:
            r0 = r8
            long r0 = r0.a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L92
            r0 = r7
            java.lang.String r1 = "topic"
            r0.f74838g = r1
        L92:
            java.lang.String r0 = "default"
            r1 = r7
            java.lang.String r1 = r1.f74838g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto Laf
            r0 = r7
            java.lang.String r0 = r0.f74838g
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Laf
            r0 = r8
            int r0 = r0.length()
            if (r0 != 0) goto Lb5
        Laf:
            r0 = r7
            java.lang.String r1 = "multiple"
            r0.f74838g = r1
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.detail.ChannelConvergeDetailFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131495414, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BiliAccounts.get(getContext()).unsubscribe(this, new Topic[]{Topic.SIGN_OUT, Topic.SIGN_IN});
        ThemeWatcher.getInstance().unSubscribe(this);
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f74833b;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.f64616Wh0));
        }
        ViewPager viewPager = this.f74834c;
        if (viewPager != null) {
            viewPager.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.Ga1));
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f74833b = view.findViewById(2131308542);
        this.f74834c = (ViewPager) view.findViewById(2131305458);
        jf();
        PagerSlidingTabStrip pagerSlidingTabStrip = this.f74833b;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.setOnPageChangeListener(new c(this));
        }
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.f74833b;
        if (pagerSlidingTabStrip2 != null) {
            pagerSlidingTabStrip2.setOnPageReselectedListener(new b(this));
        }
        Context context = getContext();
        if (context != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            ChannelDataItem channelDataItem = this.f74836e;
            if (channelDataItem == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem = null;
            }
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("from_spmid") : null;
            Bundle arguments2 = getArguments();
            r rVar = new r(context, childFragmentManager, channelDataItem, string, arguments2 != null ? arguments2.getString("channel_converge_page_from") : null, getArguments());
            this.f74835d = rVar;
            ViewPager viewPager = this.f74834c;
            rVar.h = viewPager != null ? viewPager.getId() : 0;
            ViewPager viewPager2 = this.f74834c;
            if (viewPager2 != null) {
                viewPager2.setAdapter(this.f74835d);
            }
            PagerSlidingTabStrip pagerSlidingTabStrip3 = this.f74833b;
            if (pagerSlidingTabStrip3 != null) {
                pagerSlidingTabStrip3.setViewPager(this.f74834c);
            }
            PageViewTracker.getInstance().observePageChange(this.f74834c);
        }
        if (p3() instanceof ChannelDetailActivity) {
            return;
        }
        setInitOffset((int) x.n(view.getContext()));
    }

    public final void setInitOffset(int i7) {
        r rVar = this.f74835d;
        if (rVar != null) {
            rVar.setInitOffset(i7);
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        r rVar = this.f74835d;
        Fragment fragmentB = rVar != null ? rVar.b(653829648) : null;
        if (fragmentB instanceof ChannelDetailFragment) {
        }
    }
}
