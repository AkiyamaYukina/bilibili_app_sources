package com.bilibili.pegasus.channelv3.movie.relation;

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
import com.bilibili.ad.adview.pegasus.banner.topview.res.q;
import com.bilibili.app.comm.list.common.channel.detail.IChannelDetailPage;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.arch.lifecycle.Resource;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pegasus.api.model.BasicIndexItem;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/ChannelMovieRelationFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelMovieRelationFragment extends BaseFragment implements IChannelDetailPage, m, IPvTracker {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KProperty<Object>[] f75452f = {new PropertyReference1Impl(ChannelMovieRelationFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliPegasusChannelMovieFeedFragmentBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f75453b = "ChannelMovieRelationFragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f75454c = ReflectionFragmentViewBindings.viewBindingFragment(this, s.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f75455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C8744a f75456e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/ChannelMovieRelationFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75457a;

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
            f75457a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/relation/ChannelMovieRelationFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f75458a;

        public b(q qVar) {
            this.f75458a = qVar;
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
            return this.f75458a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75458a.invoke(obj);
        }
    }

    public ChannelMovieRelationFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7972invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7973invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f75455d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(e.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7974invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m7975invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment$special$$inlined$viewModels$default$4.m7975invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m7976invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment$special$$inlined$viewModels$default$5.m7976invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // uo0.m
    public final void g2() {
        e eVarKf = kf();
        Resource<Pair<Boolean, List<BasicIndexItem>>> value = eVarKf.f75478m.getValue();
        if ((value != null ? value.getStatus() : null) != Status.LOADING) {
            d dVar = eVarKf.f75476k;
            if (dVar.f75466f) {
                dVar.f75465e = false;
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(eVarKf), (CoroutineContext) null, (CoroutineStart) null, new ChannelMovieRelationVM$load$1(eVarKf, null), 3, (Object) null);
                return;
            }
        }
        BLog.i(eVarKf.f75467a, "can not load more.");
    }

    public final Fragment getFragment() {
        return this;
    }

    @NotNull
    public final String getPageId() {
        return "";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return kf().f75469c.getPv();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        e eVarKf = kf();
        Bundle bundle = new Bundle();
        bundle.putString("channel_id", String.valueOf(eVarKf.f75470d));
        bundle.putString("from", eVarKf.f75471e);
        bundle.putString("page_entity_id", eVarKf.f75473g);
        bundle.putString("page_entity_name", eVarKf.f75472f);
        bundle.putString("tab_name", eVarKf.h);
        return bundle;
    }

    public final s jf() {
        return (s) this.f75454c.getValue(this, f75452f[0]);
    }

    public final e kf() {
        return (e) this.f75455d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r6) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.relation.ChannelMovieRelationFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return jf().a;
    }

    public final void onDetailRefresh() {
        ListExtentionsKt.smoothScrollToTop(jf().d);
        kf().refresh();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C8744a c8744a = this.f75456e;
        C8744a c8744a2 = c8744a;
        if (c8744a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c8744a2 = null;
        }
        c8744a2.S(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C8744a c8744a = this.f75456e;
        C8744a c8744a2 = c8744a;
        if (c8744a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c8744a2 = null;
        }
        c8744a2.S(true);
        if (kf().f75474i) {
            return;
        }
        kf().refresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewGroup, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
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
        ?? r02 = jf().d;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(r02.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new com.bilibili.pegasus.channelv3.movie.relation.b(this));
        r02.setLayoutManager(gridLayoutManager);
        C8744a c8744a = this.f75456e;
        C8744a c8744a2 = c8744a;
        if (c8744a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            c8744a2 = null;
        }
        r02.setAdapter(c8744a2);
        r02.addOnChildAttachStateChangeListener(new Ch.a(new ChannelMovieRelationFragment$initView$1$2(this)));
        r02.addItemDecoration(new vo0.b());
        r02.setBackgroundColor(ContextCompat.getColor(r02.getContext(), R$color.Ga1));
        r02.setItemAnimator(null);
        TintSwipeRefreshLayout tintSwipeRefreshLayout = jf().c;
        tintSwipeRefreshLayout.setColorSchemeColors(ListExtentionsKt.toColorInt(kf().f75475j, ContextCompat.getColor(tintSwipeRefreshLayout.getContext(), R$color.Brand_pink)));
        tintSwipeRefreshLayout.setOnRefreshListener(new com.bilibili.pegasus.channelv3.movie.relation.a(this));
        kf().f75478m.observe(getViewLifecycleOwner(), new b(new q(this, 2)));
    }

    public final void setInitOffset(int i7) {
    }

    public final void setPageId(@NotNull String str) {
    }

    public final void setRefreshCallback(@NotNull Fh.a aVar) {
    }
}
