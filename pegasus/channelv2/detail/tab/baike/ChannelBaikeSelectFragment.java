package com.bilibili.pegasus.channelv2.detail.tab.baike;

import C60.X;
import WS0.o;
import WS0.s;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import ao0.t;
import com.bilibili.app.comm.list.common.channel.detail.IChannelDetailPage;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.app.comm.list.common.inlineshare.PageObscuredListener;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.bilifeed.card.FeedItem;
import com.bilibili.biligame.ui.widget.C;
import com.bilibili.bililive.room.ui.roomv3.player.controller.widget.C1;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.pegasus.api.model.ChannelV2;
import com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.LoadListStatus;
import com.bilibili.pegasus.channelv2.detail.tab.baike.inline.ChannelBaikeInlineSwitchState;
import com.bilibili.pegasus.channelv2.detail.tab.baike.model.ChannelBaikeNavigationItem;
import com.bilibili.pegasus.channelv2.detail.tab.baike.widget.BaikeNavigationLayout;
import com.bilibili.pegasus.utils.E;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.pvtracker.IPvTracker;
import gl.q;
import go0.C7369g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/ChannelBaikeSelectFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelBaikeSelectFragment extends BaseFragment implements IChannelDetailPage, IPvTracker, InlinePage, com.bilibili.pegasus.promo.f, PageObscuredListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final KProperty<Object>[] f75056t = {new MutablePropertyReference1Impl(ChannelBaikeSelectFragment.class, "mInlineCapacity", "getMInlineCapacity()Lcom/bilibili/pegasus/channelv2/detail/tab/baike/inline/ChannelBaikeInlineCapacity;", 0), new PropertyReference1Impl(ChannelBaikeSelectFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliPegasusChannelBaikeFragmentBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f75057b = new com.bilibili.app.comm.list.common.widget.a(new com.bilibili.app.comm.list.common.widget.l(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f75058c = ReflectionFragmentViewBindings.viewBindingFragment(this, q.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f75059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f75060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f75061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75062g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f75063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ChannelBaikeInlineSwitchState f75064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f75065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f75066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f75067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final l f75068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final m f75069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final n f75070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C1 f75071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.biligame.ui.widget.f f75072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final j f75073s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/ChannelBaikeSelectFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75074a;

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
            f75074a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/ChannelBaikeSelectFragment$b.class */
    public static final class b extends com.bilibili.pegasus.utils.k<VideoStatusMessage, Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelBaikeSelectFragment f75075a;

        public b(ChannelBaikeSelectFragment channelBaikeSelectFragment) {
            this.f75075a = channelBaikeSelectFragment;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.a] */
        @Override // com.bilibili.pegasus.utils.k
        public final void a(Map<Long, VideoStatusMessage> map) {
            KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
            ?? Lf = this.f75075a.lf();
            int i7 = 0;
            for (Object obj : Lf.h) {
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Fn0.g gVar = (FeedItem) obj;
                Fn0.g gVar2 = gVar instanceof Fn0.g ? gVar : null;
                if (gVar2 != null) {
                    VideoStatusMessage videoStatusMessage = (VideoStatusMessage) ((HashMap) map).get(Long.valueOf(gVar2.getAid()));
                    if (videoStatusMessage != null) {
                        gVar2.updateByMsg(videoStatusMessage);
                        Lf.notifyItemChanged(i7);
                    }
                }
                i7++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.bilibili.pegasus.channelv2.detail.tab.baike.l] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.bilibili.pegasus.channelv2.detail.tab.baike.m] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.bilibili.pegasus.channelv2.detail.tab.baike.n] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.bilibili.pegasus.channelv2.detail.tab.baike.j] */
    public ChannelBaikeSelectFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7910invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7911invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f75059d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ChannelBaikeViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7912invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m7913invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment$special$$inlined$viewModels$default$4.m7913invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m7914invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment$special$$inlined$viewModels$default$5.m7914invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f75060e = "";
        this.h = LazyKt.lazy(new Gj.d(7));
        this.f75063i = ListExtentionsKt.lazyUnsafe(new Mh1.a(this, 4));
        this.f75064j = new ChannelBaikeInlineSwitchState(this);
        this.f75065k = ListExtentionsKt.lazyUnsafe(new R01.i(this, 5));
        this.f75066l = ListExtentionsKt.lazyUnsafe(new X(this, 6));
        this.f75067m = ListExtentionsKt.lazyUnsafe(new C(this, 3));
        this.f75068n = new Observer(this) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelBaikeSelectFragment f75174a;

            {
                this.f75174a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws NoWhenBranchMatchedException {
                long nid;
                Resource resource = (Resource) obj;
                KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
                int i7 = ChannelBaikeSelectFragment.a.f75074a[resource.getStatus().ordinal()];
                ChannelBaikeSelectFragment channelBaikeSelectFragment = this.f75174a;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        channelBaikeSelectFragment.jf().d.setRefreshing(true);
                        return;
                    } else {
                        channelBaikeSelectFragment.jf().d.setRefreshing(false);
                        channelBaikeSelectFragment.jf().c.setVisibility(8);
                        channelBaikeSelectFragment.jf().b.setVisibility(8);
                        channelBaikeSelectFragment.pf();
                        return;
                    }
                }
                List list = (List) resource.getData();
                List list2 = list;
                if (list2 == null || list2.isEmpty() || list.size() <= 1) {
                    channelBaikeSelectFragment.jf().c.setVisibility(8);
                    channelBaikeSelectFragment.jf().b.setVisibility(8);
                } else {
                    channelBaikeSelectFragment.jf().c.setVisibility(0);
                    channelBaikeSelectFragment.jf().b.setVisibility(0);
                    BaikeNavigationLayout baikeNavigationLayout = channelBaikeSelectFragment.jf().c;
                    List list3 = list;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ChannelBaikeNavigationItem) it.next()).getTitle());
                    }
                    baikeNavigationLayout.a(arrayList);
                    if (channelBaikeSelectFragment.of().f75078c) {
                        channelBaikeSelectFragment.rf();
                    }
                    if (channelBaikeSelectFragment.of().f75080e && channelBaikeSelectFragment.of().f75079d > 0) {
                        BaikeNavigationLayout baikeNavigationLayout2 = channelBaikeSelectFragment.jf().c;
                        Integer numJ0 = channelBaikeSelectFragment.of().J0(Long.valueOf(channelBaikeSelectFragment.of().f75079d));
                        baikeNavigationLayout2.setSelectPosition(numJ0 != null ? numJ0.intValue() : -1);
                    }
                }
                ChannelBaikeViewModel channelBaikeViewModelOf = channelBaikeSelectFragment.of();
                if (!channelBaikeSelectFragment.of().f75080e || channelBaikeSelectFragment.of().f75079d <= 0) {
                    nid = 0;
                    if (list != null) {
                        ChannelBaikeNavigationItem channelBaikeNavigationItem = (ChannelBaikeNavigationItem) CollectionsKt.firstOrNull(list);
                        nid = 0;
                        if (channelBaikeNavigationItem != null) {
                            nid = channelBaikeNavigationItem.getNid();
                        }
                    }
                } else {
                    nid = channelBaikeSelectFragment.of().f75079d;
                }
                channelBaikeViewModelOf.N0(nid);
            }
        };
        this.f75069o = new Observer(this) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.m

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelBaikeSelectFragment f75175a;

            {
                this.f75175a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
            /* JADX WARN: Type inference failed for: r0v32, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.a, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onChanged(java.lang.Object r7) throws kotlin.NoWhenBranchMatchedException {
                /*
                    Method dump skipped, instruction units count: 688
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.m.onChanged(java.lang.Object):void");
            }
        };
        this.f75070p = new Observer(this) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelBaikeSelectFragment f75176a;

            {
                this.f75176a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            /* JADX WARN: Type inference failed for: r0v25, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.a, java.lang.Object] */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws NoWhenBranchMatchedException {
                Resource resource = (Resource) obj;
                KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
                int i7 = ChannelBaikeSelectFragment.a.f75074a[resource.getStatus().ordinal()];
                ChannelBaikeSelectFragment channelBaikeSelectFragment = this.f75176a;
                if (i7 != 1) {
                    if (i7 == 2) {
                        channelBaikeSelectFragment.jf().e.setNestedScrollingEnabled(false);
                        com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.e eVarMf = channelBaikeSelectFragment.mf();
                        eVarMf.f75120b = LoadListStatus.ERROR;
                        eVarMf.notifyItemChanged(0);
                        return;
                    }
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    channelBaikeSelectFragment.jf().e.setNestedScrollingEnabled(false);
                    com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.e eVarMf2 = channelBaikeSelectFragment.mf();
                    eVarMf2.f75120b = LoadListStatus.LOADING;
                    eVarMf2.notifyItemChanged(0);
                    return;
                }
                channelBaikeSelectFragment.jf().e.setNestedScrollingEnabled(true);
                com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.e eVarMf3 = channelBaikeSelectFragment.mf();
                eVarMf3.f75120b = LoadListStatus.SUCCESS;
                eVarMf3.notifyItemChanged(0);
                RecyclerView.Adapter adapter = channelBaikeSelectFragment.jf().e.getAdapter();
                ConcatAdapter concatAdapter = null;
                if (adapter != null) {
                    concatAdapter = (ConcatAdapter) (adapter instanceof ConcatAdapter ? adapter : null);
                }
                if (concatAdapter != null) {
                    concatAdapter.Q(channelBaikeSelectFragment.mf());
                }
                ?? Lf = channelBaikeSelectFragment.lf();
                List list = (List) resource.getData();
                Lf.getClass();
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    Lf.h.addAll(0, list2);
                    Lf.notifyItemRangeInserted(0, list.size());
                }
                if (!Intrinsics.areEqual(channelBaikeSelectFragment.of().f75091q.getValue(), Boolean.TRUE) || concatAdapter == null) {
                    return;
                }
                concatAdapter.f52223a.a(0, channelBaikeSelectFragment.mf());
            }
        };
        this.f75071q = new C1(1, this);
        this.f75072r = new com.bilibili.biligame.ui.widget.f(this, 2);
        this.f75073s = new Observer(this) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelBaikeSelectFragment f75173a;

            {
                this.f75173a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
                if (zBooleanValue) {
                    return;
                }
                com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.d dVar = (com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.d) this.f75173a.f75067m.getValue();
                dVar.f75118b = LoadListStatus.NO_MORE;
                dVar.notifyItemChanged(0);
            }
        };
    }

    @Override // com.bilibili.pegasus.promo.e
    public final boolean e7() {
        return true;
    }

    public final int getBottomClip() {
        return 0;
    }

    public final Fragment getFragment() {
        return this;
    }

    @Nullable
    public final IInlineControl getInlineControl() {
        com.bilibili.pegasus.channelv2.detail.tab.baike.inline.e eVarNf = nf();
        return eVarNf != null ? eVarNf.f75157e : null;
    }

    @NotNull
    public final String getPageId() {
        return this.f75060e;
    }

    public final boolean getPageSwitchState() {
        return PegasusInlineConfigKt.isAutoPlayEnable(of().f75081f);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "traffic.new-channel-detail-baike.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putString("channel_id", String.valueOf(of().f75076a));
        ChannelV2 channelV2 = ((t) this.f75063i.getValue()).f53619a;
        bundle.putString("channel_name", channelV2 != null ? channelV2.name : null);
        String version = of().f75084j.getVersion();
        String str = version;
        if (version == null) {
            str = "";
        }
        bundle.putString("version_id", str);
        return bundle;
    }

    @NotNull
    public final Rect getViewVisibleRect() {
        Rect rect = new Rect();
        jf().e.getGlobalVisibleRect(rect);
        return rect;
    }

    public final q jf() {
        return (q) this.f75058c.getValue(this, f75056t[1]);
    }

    public final int kf() {
        return ListExtentionsKt.toColorInt(((t) this.f75063i.getValue()).f53627j, ResourcesCompat.getColor(getResources(), R$color.Brand_pink, null));
    }

    public final com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.a lf() {
        return (com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.a) this.f75065k.getValue();
    }

    public final com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.e mf() {
        return (com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.e) this.f75066l.getValue();
    }

    public final com.bilibili.pegasus.channelv2.detail.tab.baike.inline.e nf() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f75057b;
        KProperty<Object> kProperty = f75056t[0];
        return (com.bilibili.pegasus.channelv2.detail.tab.baike.inline.e) aVar.b;
    }

    public final ChannelBaikeViewModel of() {
        return (ChannelBaikeViewModel) this.f75059d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return jf().a;
    }

    public final void onDetailRefresh() {
        of().L0();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        qf(false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        qf(true);
    }

    public final void onObscureStateChanged(boolean z6) {
        IInlineControl iInlineControl;
        this.f75061f = z6;
        if (of().f75078c) {
            if (!z6) {
                sf();
                return;
            }
            com.bilibili.pegasus.channelv2.detail.tab.baike.inline.e eVarNf = nf();
            if (eVarNf == null || (iInlineControl = eVarNf.f75157e) == null) {
                return;
            }
            iInlineControl.stopPlay();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ListExtentionsKt.onNextDrawOver(jf().e, new o(this, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008e  */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[], int[][]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r16, @org.jetbrains.annotations.Nullable android.os.Bundle r17) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.baike.ChannelBaikeSelectFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void pf() {
        if (((Z7.a) lf()).a.size() > 0) {
            PromoToast.showBottomToast(getApplicationContext(), 2131845224);
            return;
        }
        jf().e.setVisibility(8);
        LoadingImageView loadingImageView = jf().f;
        loadingImageView.setImageResource(2131232151);
        loadingImageView.setRefreshError(loadingImageView.getResources().getString(2131841503));
    }

    public final void qf(boolean z6) {
        IInlineControl iInlineControl;
        of().f75078c = z6;
        for (do0.h hVar : ((Z7.a) lf()).c) {
            if (!(hVar instanceof do0.h)) {
                hVar = null;
            }
            do0.h hVar2 = hVar;
            if (hVar2 != null) {
                hVar2.onPageVisibleStateChanged(z6);
            }
        }
        if (z6) {
            rf();
            sf();
            return;
        }
        com.bilibili.pegasus.channelv2.detail.tab.baike.inline.e eVarNf = nf();
        if (eVarNf == null || (iInlineControl = eVarNf.f75157e) == null) {
            return;
        }
        iInlineControl.stopPlay();
    }

    public final void rf() {
        Resource<List<ChannelBaikeNavigationItem>> value;
        List list;
        if (this.f75062g || (value = of().f75085k.getValue()) == null || (list = (List) value.getData()) == null || list.size() <= 1) {
            return;
        }
        this.f75062g = true;
        int i7 = 0;
        for (Object obj : list) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            C7369g.f((ChannelBaikeNavigationItem) obj, true, of(), i7);
            i7++;
        }
        C7369g.f(new ChannelBaikeNavigationItem("all", 0L, 2, null), true, of(), list.size());
    }

    public final void setInitOffset(int i7) {
    }

    public final void setPageId(@NotNull String str) {
        this.f75060e = str;
    }

    public final void setRefreshCallback(@NotNull Fh.a aVar) {
    }

    public final void sf() {
        if (this.f75061f || !isAdded()) {
            return;
        }
        if (((E) this.h.getValue()).f78853a != 0) {
            ((E) this.h.getValue()).f78854b = new WS0.q(this, 3);
            return;
        }
        RecyclerView recyclerView = jf().e;
        if (recyclerView.isAttachedToWindow()) {
            HandlerThreads.postDelayed(0, new Runnable(this) { // from class: com.bilibili.pegasus.channelv2.detail.tab.baike.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChannelBaikeSelectFragment f75140a;

                {
                    this.f75140a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IInlineControl iInlineControl;
                    ChannelBaikeSelectFragment channelBaikeSelectFragment = this.f75140a;
                    KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
                    com.bilibili.pegasus.channelv2.detail.tab.baike.inline.e eVarNf = channelBaikeSelectFragment.nf();
                    if (eVarNf == null || (iInlineControl = eVarNf.f75157e) == null) {
                        return;
                    }
                    IInlineControl.startAutoPlay$default(iInlineControl, false, 1, (Object) null);
                }
            }, 200L);
        } else {
            ListExtentionsKt.onNextDrawOver(recyclerView, new s(this, 3));
        }
    }
}
