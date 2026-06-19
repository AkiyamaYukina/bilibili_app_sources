package com.bilibili.pegasus.channelv2.home.center;

import Wn0.g;
import Wn0.i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.s;
import com.bilibili.biligame.ui.update.f;
import com.bilibili.bus.Violet;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.homepage.startdust.OnPageSelectChangeListener;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.pegasus.channelv2.home.utils.FragmentShowHideLifecycleWrapper;
import com.bilibili.pegasus.utils.AbstractC5763g;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pvtracker.IPvTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import mo0.C8023c;
import mo0.C8024d;
import mo0.C8025e;
import oo0.C8248a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import po0.C8336a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelHomeCenterFragment extends BaseToolbarFragment implements SwipeRefreshLayout.OnRefreshListener, OnPageSelectChangeListener, PassportObserver, IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public gl.a f75248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C8025e f75249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<? extends C8336a<?>> f75250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8248a f75251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final eg.a f75252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f75253g;

    @NotNull
    public final com.bilibili.pegasus.channelv2.home.center.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f75254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.pegasus.channelv2.home.center.b f75255j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final FragmentShowHideLifecycleWrapper f75256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Xr0.c f75257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final e f75258m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.bilibili.pegasus.channelv2.home.center.c f75259n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75260a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f75260a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterFragment$b.class */
    public static final class b extends AbstractC5763g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelHomeCenterFragment f75261a;

        public b(ChannelHomeCenterFragment channelHomeCenterFragment) {
            this.f75261a = channelHomeCenterFragment;
        }

        public final void b(Map<Long, gg.b> map) {
            i iVar;
            ArrayList<g> arrayList;
            ChannelHomeCenterViewModel channelHomeCenterViewModelMf = this.f75261a.mf();
            if (!channelHomeCenterViewModelMf.f75266c.containsKey("rcmd")) {
                return;
            }
            Iterator<T> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(channelHomeCenterViewModelMf), (CoroutineContext) null, (CoroutineStart) null, new ChannelHomeCenterViewModel$updateChannel$2(channelHomeCenterViewModelMf, null), 3, (Object) null);
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                long jLongValue = ((Number) entry.getKey()).longValue();
                gg.b bVar = (gg.b) entry.getValue();
                Xn0.b bVar2 = channelHomeCenterViewModelMf.f75266c.get("rcmd");
                Xn0.d dVar = bVar2 instanceof Xn0.d ? (Xn0.d) bVar2 : null;
                if (dVar != null && (iVar = dVar.f28260f) != null && (arrayList = iVar.f26979c) != null) {
                    for (g gVar : arrayList) {
                        if (gVar.f26963d == jLongValue) {
                            gVar.f26970l = bVar.b;
                        }
                    }
                }
            }
        }

        @Override // com.bilibili.pegasus.utils.AbstractC5763g
        public final Context c() {
            return this.f75261a.getContext();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterFragment$c.class */
    public static final class c extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelHomeCenterFragment f75262a;

        public c(ChannelHomeCenterFragment channelHomeCenterFragment) {
            this.f75262a = channelHomeCenterFragment;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int getSpanSize(int r4) {
            /*
                r3 = this;
                r0 = r3
                com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment r0 = r0.f75262a
                mo0.e r0 = r0.f75249c
                r1 = r4
                int r0 = r0.getItemViewType(r1)
                r4 = r0
                r0 = r4
                r1 = 100
                if (r0 == r1) goto L66
                r0 = r4
                r1 = 101(0x65, float:1.42E-43)
                if (r0 == r1) goto L61
                r0 = r4
                r1 = 300(0x12c, float:4.2E-43)
                if (r0 == r1) goto L66
                r0 = r4
                r1 = 301(0x12d, float:4.22E-43)
                if (r0 == r1) goto L66
                r0 = r4
                r1 = 505(0x1f9, float:7.08E-43)
                if (r0 == r1) goto L66
                r0 = r4
                r1 = 600(0x258, float:8.41E-43)
                if (r0 == r1) goto L66
                r0 = r4
                r1 = 601(0x259, float:8.42E-43)
                if (r0 == r1) goto L66
                r0 = r4
                switch(r0) {
                    case 500: goto L66;
                    case 501: goto L61;
                    case 502: goto L66;
                    case 503: goto L66;
                    default: goto L5c;
                }
            L5c:
                r0 = 0
                r4 = r0
                goto L68
            L61:
                r0 = 1
                r4 = r0
                goto L68
            L66:
                r0 = 5
                r4 = r0
            L68:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment.c.getSpanSize(int):int");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterFragment$d.class */
    public static final class d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChannelHomeCenterFragment f75263a;

        public d(ChannelHomeCenterFragment channelHomeCenterFragment) {
            this.f75263a = channelHomeCenterFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            int childCount = recyclerView.getChildCount();
            if (childCount > 0) {
                ChannelHomeCenterFragment channelHomeCenterFragment = this.f75263a;
                if (channelHomeCenterFragment.mf().f75264a.hasMore()) {
                    if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) >= recyclerView.getAdapter().getItemCount() - 1) {
                        channelHomeCenterFragment.mf().L0(false, false);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterFragment$onViewCreated$4.class */
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass4(Object obj) {
            super(0, obj, ChannelHomeCenterFragment.class, "onThemeChanged", "onThemeChanged()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m7934invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7934invoke() {
            ((ChannelHomeCenterFragment) ((CallableReference) this).receiver).of();
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [com.bilibili.pegasus.channelv2.home.center.a] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.bilibili.pegasus.channelv2.home.center.b] */
    public ChannelHomeCenterFragment() {
        C8025e c8025e = new C8025e(this);
        this.f75249c = c8025e;
        this.f75251e = new C8248a(c8025e);
        this.f75252f = new eg.a(101, (String) null);
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7935invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7936invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f75253g = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ChannelHomeCenterViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7937invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m7938invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$special$$inlined$viewModels$default$4.m7938invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m7939invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.home.center.ChannelHomeCenterFragment$special$$inlined$viewModels$default$5.m7939invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.h = new Observer(this) { // from class: com.bilibili.pegasus.channelv2.home.center.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelHomeCenterFragment f75271a;

            {
                this.f75271a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<gg.b> list = (List) obj;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                for (gg.b bVar : list) {
                    if (bVar.c == Status.SUCCESS) {
                        ChannelHomeCenterFragment channelHomeCenterFragment = this.f75271a;
                        if (!channelHomeCenterFragment.f75252f.a(bVar)) {
                            BLog.i("HomeChannelPage", "Received message from other page, refresh channel home");
                            if (channelHomeCenterFragment.f75254i) {
                                return;
                            }
                            channelHomeCenterFragment.pf(true);
                            return;
                        }
                    }
                }
            }
        };
        this.f75255j = new Observer(this) { // from class: com.bilibili.pegasus.channelv2.home.center.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChannelHomeCenterFragment f75272a;

            {
                this.f75272a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                List<gg.b> list = (List) obj;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                for (gg.b bVar : list) {
                    if (bVar.c == Status.SUCCESS) {
                        ChannelHomeCenterFragment channelHomeCenterFragment = this.f75272a;
                        if (channelHomeCenterFragment.f75252f.a(bVar)) {
                            BLog.i("HomeChannelPage", "Received message from self, refresh channel home at next time");
                            channelHomeCenterFragment.f75254i = true;
                            return;
                        }
                    }
                }
            }
        };
        this.f75256k = new FragmentShowHideLifecycleWrapper(this);
        this.f75257l = new Xr0.c(this, 1);
        this.f75258m = new e();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return Op0.b.b("traffic.channel-square-channel.0.0");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    @Nullable
    public final View getViewRecyclable() {
        gl.a aVar = this.f75248b;
        return aVar != null ? aVar.c : null;
    }

    @NotNull
    public final ChannelHomeCenterViewModel mf() {
        return (ChannelHomeCenterViewModel) this.f75253g.getValue();
    }

    public final void nf() {
        View view;
        com.bilibili.pegasus.channelv2.home.center.c cVar = this.f75259n;
        if (cVar != null && (view = getView()) != null) {
            view.removeCallbacks(cVar);
        }
        this.f75259n = null;
        gl.a aVar = this.f75248b;
        if (aVar != null) {
            aVar.d.setVisibility(8);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public final void of() {
        gl.a aVar;
        Context context = getContext();
        if (context != null && (aVar = this.f75248b) != null) {
            aVar.c.setBackgroundColor(ThemeUtils.getColorById(context, R$color.f64616Wh0));
        }
        C8025e c8025e = this.f75249c;
        Iterator it = SequencesKt.map(SequencesKt.filter(SequencesKt.mapIndexed(CollectionsKt.asSequence(c8025e.f123825b), (Function2) new Object()), new f(new int[]{300}, 4)), (Function1) new Object()).iterator();
        while (it.hasNext()) {
            c8025e.notifyItemChanged(((Number) it.next()).intValue());
        }
    }

    public final void onChange(@Nullable Topic topic) {
        pf(false);
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f75252f.c(this, new b(this));
        if (bundle == null) {
            mf().f75264a = new ChannelHomeCenterLoadModel("traffic.channel-square-channel.0.0");
        }
        mf().K0().observe(this, this.f75257l);
        mf().f75270g.observe(this, new Xr0.d(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        gl.a aVarInflate = gl.a.inflate(layoutInflater);
        this.f75248b = aVarInflate;
        return aVarInflate.getRoot();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Context context = getContext();
        if (context != null) {
            BiliAccounts.get(context).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        }
        this.f75248b = null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        this.f75256k.onFragmentVisible(false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        this.f75256k.onFragmentVisible(true);
    }

    public final void onPageReSelected() {
        pf(false);
    }

    public final void onPageSelected(@Nullable Map<String, Object> map) {
    }

    public final void onPageUnselected() {
    }

    public final void onRefresh() {
        pf(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f75254i) {
            BLog.i("HomeChannelPage", "Refresh channel home");
            this.f75254i = false;
            pf(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$LayoutManager, com.bilibili.pegasus.channelv2.home.report.ReportGridLayoutManager] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        gl.a aVar = this.f75248b;
        if (aVar == null) {
            return;
        }
        ?? gridLayoutManager = new GridLayoutManager(view.getContext(), 5);
        gridLayoutManager.f75281a = this;
        gridLayoutManager.setSpanSizeLookup(new c(this));
        RecyclerView recyclerView = aVar.c;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f75249c);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.setAddDuration(50L);
            itemAnimator.setRemoveDuration(50L);
            itemAnimator.setMoveDuration(200L);
            itemAnimator.setChangeDuration(200L);
        }
        recyclerView.addItemDecoration(this.f75258m);
        recyclerView.addOnScrollListener(this.f75251e);
        recyclerView.addOnScrollListener(new d(this));
        recyclerView.setClipToPadding(false);
        BiliAccounts.get(view.getContext()).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        of();
        Resource<List<C8336a<?>>> value = mf().K0().getValue();
        List<? extends C8336a<?>> list = value != null ? (List) value.getData() : null;
        this.f75250d = list;
        if (x.q(list)) {
            pf(false);
        } else {
            C8025e c8025e = this.f75249c;
            List<? extends C8336a<?>> list2 = this.f75250d;
            List<? extends C8336a<?>> list3 = c8025e.f123825b;
            List<? extends C8336a<?>> listEmptyList = list2;
            if (list2 == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            c8025e.f123825b = listEmptyList;
            DiffUtil.calculateDiff(new C8024d(list3, c8025e)).dispatchUpdatesTo(c8025e);
        }
        Violet violet = Violet.INSTANCE;
        violet.ofChannel(gg.b.class).observeCachedInactive(this, this.h);
        violet.ofChannel(gg.b.class).observeCachedInactive(this, this.f75255j);
        setTitle(2131845363);
        TextView textView = aVar.b;
        Integer toolbarTitleColor = getToolbarTitleColor(GarbManager.getCurGarb());
        textView.setTextColor(toolbarTitleColor != null ? toolbarTitleColor.intValue() : ThemeUtils.getColorById(requireContext(), 2131103914));
        SwipeRefreshLayout swipeRefreshLayout = aVar.g;
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(new int[]{2131103271});
        of();
        s.c(getViewLifecycleOwner(), new AnonymousClass4(this));
    }

    public final void pf(boolean z6) {
        RecyclerView recyclerView;
        SwipeRefreshLayout swipeRefreshLayout;
        if (getView() != null) {
            gl.a aVar = this.f75248b;
            if (aVar != null && (swipeRefreshLayout = aVar.g) != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            gl.a aVar2 = this.f75248b;
            if (aVar2 != null && (recyclerView = aVar2.c) != null) {
                recyclerView.scrollToPosition(0);
            }
        }
        mf().L0(true, z6);
    }

    public final void qf() {
        C8025e c8025e = this.f75249c;
        c8025e.getClass();
        DiffUtil.calculateDiff(new C8023c(c8025e, true)).dispatchUpdatesTo(c8025e);
        ChannelHomeCenterViewModel channelHomeCenterViewModelMf = mf();
        MediatorLiveData<Resource<List<C8336a<?>>>> mediatorLiveDataK0 = channelHomeCenterViewModelMf.K0();
        Resource.Companion.getClass();
        mediatorLiveDataK0.setValue(Resource.a.b((Object) null));
        channelHomeCenterViewModelMf.f75268e = BuildersKt.launch$default(ViewModelKt.getViewModelScope(channelHomeCenterViewModelMf), (CoroutineContext) null, (CoroutineStart) null, new ChannelHomeCenterViewModel$refreshRcmdData$1(channelHomeCenterViewModelMf, null), 3, (Object) null);
    }

    public final void rf() {
        SwipeRefreshLayout swipeRefreshLayout;
        gl.a aVar = this.f75248b;
        if (aVar == null || (swipeRefreshLayout = aVar.g) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }
}
