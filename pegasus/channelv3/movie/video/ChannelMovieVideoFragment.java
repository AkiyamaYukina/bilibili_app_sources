package com.bilibili.pegasus.channelv3.movie.video;

import I3.H2;
import Td.p;
import ZS0.B;
import ZS0.I;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.channel.detail.IChannelDetailPage;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.app.comm.list.common.inlineshare.PageObscuredListener;
import com.bilibili.app.comm.list.common.widget.l;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.bus.Violet;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.mini.player.common.manager.MiniScreenPlayerCloseEvent;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.channelv3.feed.inline.ChannelMovieInlineSwitchState;
import com.bilibili.pegasus.channelv3.movie.ChannelMoviePV;
import com.bilibili.pegasus.utils.E;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.pvtracker.IPvTracker;
import gl.s;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.swiperefresh.TintSwipeRefreshLayout;
import uo0.C8744a;
import uo0.m;
import vo0.C8839a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/ChannelMovieVideoFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelMovieVideoFragment extends BaseFragment implements IChannelDetailPage, m, IPvTracker, InlinePage, com.bilibili.pegasus.promo.f, PageObscuredListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final KProperty<Object>[] f75479j = {new PropertyReference1Impl(ChannelMovieVideoFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliPegasusChannelMovieFeedFragmentBinding;", 0), new MutablePropertyReference1Impl(ChannelMovieVideoFragment.class, "mInlineCapacity", "getMInlineCapacity()Lcom/bilibili/pegasus/channelv3/feed/inline/ChannelMovieInlineCapacity;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f75480b = "ChannelMovieVideoFragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f75482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f75483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C8744a f75484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a f75485g;

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ChannelMovieInlineSwitchState f75486i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/ChannelMovieVideoFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75487a;

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
            f75487a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/video/ChannelMovieVideoFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.bilibili.biligame.history.e f75488a;

        public b(com.bilibili.biligame.history.e eVar) {
            this.f75488a = eVar;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f75488a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75488a.invoke(obj);
        }
    }

    public ChannelMovieVideoFragment() {
        l lVar = new l(this);
        this.f75482d = ReflectionFragmentViewBindings.viewBindingFragment(this, s.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7980invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7981invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f75483e = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(f.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7982invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m7983invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment$special$$inlined$viewModels$default$4.m7983invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m7984invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment$special$$inlined$viewModels$default$5.m7984invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f75484f = new C8744a(this);
        this.f75485g = new com.bilibili.app.comm.list.common.widget.a(lVar);
        this.h = LazyKt.lazy(new H2(8));
        this.f75486i = new ChannelMovieInlineSwitchState(this);
    }

    @Override // com.bilibili.pegasus.promo.e
    public final boolean e7() {
        return true;
    }

    @Override // uo0.m
    public final void g2() {
        f fVarLf = lf();
        Resource<Pair<Boolean, List<BasicIndexItem>>> value = fVarLf.f75508k.getValue();
        if ((value != null ? value.getStatus() : null) != Status.LOADING) {
            com.bilibili.pegasus.channelv3.movie.video.a aVar = fVarLf.f75506i;
            if (aVar.f75494f) {
                aVar.f75493e = false;
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(fVarLf), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieVideoVM$load$1(fVarLf, null), 3, (Object) null);
                return;
            }
        }
        BLog.i(fVarLf.f75499a, "can not start load more.");
    }

    public final int getBottomClip() {
        return 0;
    }

    public final Fragment getFragment() {
        return this;
    }

    @Nullable
    public final IInlineControl getInlineControl() {
        com.bilibili.pegasus.channelv3.feed.inline.b bVarKf = kf();
        return bVarKf != null ? bVarKf.f75325e : null;
    }

    @NotNull
    public final String getPageId() {
        return "";
    }

    public final boolean getPageSwitchState() {
        return PegasusInlineConfigKt.isAutoPlayEnable(lf().h);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return ChannelMoviePV.CHANNEL_MOVIE_VIDEO_PV.getPv();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        f fVarLf = lf();
        Bundle bundle = new Bundle();
        bundle.putString("channel_id", String.valueOf(fVarLf.f75500b));
        bundle.putString("from", fVarLf.f75501c);
        bundle.putString("page_entity_id", fVarLf.f75503e);
        bundle.putString("page_entity_name", fVarLf.f75502d);
        return bundle;
    }

    @NotNull
    public final Rect getViewVisibleRect() {
        Rect rect = new Rect();
        jf().d.getGlobalVisibleRect(rect);
        return rect;
    }

    public final s jf() {
        return (s) this.f75482d.getValue(this, f75479j[0]);
    }

    public final com.bilibili.pegasus.channelv3.feed.inline.b kf() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.f75485g;
        KProperty<Object> kProperty = f75479j[1];
        return (com.bilibili.pegasus.channelv3.feed.inline.b) aVar.b;
    }

    public final f lf() {
        return (f) this.f75483e.getValue();
    }

    public final void mf(boolean z6) {
        IInlineControl iInlineControl;
        lf().f75505g = z6;
        this.f75484f.S(z6);
        if (z6) {
            ListExtentionsKt.onNextDrawOver(jf().d, new CB.f(this, 2));
            return;
        }
        com.bilibili.pegasus.channelv3.feed.inline.b bVarKf = kf();
        if (bVarKf == null || (iInlineControl = bVarKf.f75325e) == null) {
            return;
        }
        iInlineControl.stopPlay();
    }

    @Override // uo0.m
    @NotNull
    public final PegasusInlineSwitchState n1() {
        return lf().h;
    }

    public final void nf() {
        if (this.f75481c || !isAdded()) {
            return;
        }
        if (((E) this.h.getValue()).f78853a != 0) {
            ((E) this.h.getValue()).f78854b = new p(this, 4);
            return;
        }
        RecyclerView recyclerView = jf().d;
        if (recyclerView.isAttachedToWindow()) {
            HandlerThreads.postDelayed(0, new CB.d(this, 2), 200L);
        } else {
            ListExtentionsKt.onNextDrawOver(recyclerView, new B(this, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.video.ChannelMovieVideoFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f75485g.a(new com.bilibili.pegasus.channelv3.feed.inline.b(this), f75479j[1]);
        com.bilibili.pegasus.channelv3.feed.inline.b bVarKf = kf();
        if (bVarKf != null) {
            RecyclerView recyclerView = jf().d;
            IInlineControl.Companion companion = IInlineControl.Companion;
            IInlineControl.Builder builder = new IInlineControl.Builder(bVarKf.f75321a, recyclerView);
            builder.setAutoPlayControl((Hp0.a) bVarKf.f75322b.getValue());
            builder.setFetcher((Hp0.c) bVarKf.f75324d.getValue());
            builder.setDelegate((com.bilibili.pegasus.channelv3.feed.inline.c) bVarKf.f75323c.getValue());
            builder.setIdentity(ChannelMoviePV.CHANNEL_MOVIE_VIDEO_PV.getPv());
            bVarKf.f75325e = builder.build();
        }
        return jf().a;
    }

    public final void onDetailRefresh() {
        ListExtentionsKt.smoothScrollToTop(jf().d);
        lf().refresh();
    }

    public final void onObscureStateChanged(boolean z6) {
        IInlineControl iInlineControl;
        this.f75481c = z6;
        if (lf().f75505g) {
            if (!z6) {
                nf();
                return;
            }
            com.bilibili.pegasus.channelv3.feed.inline.b bVarKf = kf();
            if (bVarKf == null || (iInlineControl = bVarKf.f75325e) == null) {
                return;
            }
            iInlineControl.stopPlay();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        mf(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        mf(true);
        if (lf().f75504f) {
            return;
        }
        lf().refresh();
    }

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
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = jf().d;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new c(this));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f75484f);
        recyclerView.addOnChildAttachStateChangeListener(new Ch.a(new ChannelMovieVideoFragment$initView$1$2(this)));
        recyclerView.addItemDecoration(new C8839a());
        recyclerView.setBackgroundColor(ContextCompat.getColor(recyclerView.getContext(), R$color.f64616Wh0));
        recyclerView.setItemAnimator(null);
        TintSwipeRefreshLayout tintSwipeRefreshLayout = jf().c;
        tintSwipeRefreshLayout.setColorSchemeColors(ContextCompat.getColor(tintSwipeRefreshLayout.getContext(), R$color.Brand_pink));
        tintSwipeRefreshLayout.setOnRefreshListener(new I(this));
        jf().e.setChildScrollFirst(true);
        lf().f75508k.observe(getViewLifecycleOwner(), new b(new com.bilibili.biligame.history.e(this, 3)));
        Violet violet = Violet.INSTANCE;
        violet.ofChannel(VideoStatusMessage.class).observeCachedInactive(this, new d(this));
        violet.ofChannel(MiniScreenPlayerCloseEvent.class).observeUnSticky(getViewLifecycleOwner(), new com.bilibili.bililive.room.biz.shopping.view.goodslist.b(1, this));
    }

    public final void setInitOffset(int i7) {
    }

    public final void setPageId(@NotNull String str) {
    }

    public final void setRefreshCallback(@NotNull Fh.a aVar) {
    }
}
