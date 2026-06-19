package com.bilibili.pegasus.channelv3.movie.detail;

import GS0.S;
import Gr.j;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.arch.lifecycle.Status;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pegasus.channelv3.movie.ChannelMoviePV;
import com.bilibili.pvtracker.IPvTracker;
import gl.l;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/ChannelMovieDetailFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelMovieDetailFragment extends BaseFragment implements IPvTracker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final KProperty<Object>[] f75342g = {new PropertyReference1Impl(ChannelMovieDetailFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliChannelV3DetailFragmentBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f75343b = "ChannelMovieDetailFragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f75344c = ReflectionFragmentViewBindings.viewBindingFragment(this, l.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f75345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f75346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Hi.c f75347f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/ChannelMovieDetailFragment$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f75348a;

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
            f75348a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/detail/ChannelMovieDetailFragment$b.class */
    public static final /* synthetic */ class b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f75349a;

        public b(j jVar) {
            this.f75349a = jVar;
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
            return this.f75349a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75349a.invoke(obj);
        }
    }

    public ChannelMovieDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7960invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7961invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f75345d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ChannelMovieDetailVM.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7962invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m7963invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment$special$$inlined$viewModels$default$4.m7963invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m7964invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment$special$$inlined$viewModels$default$5.m7964invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f75347f = new Hi.c(new ChannelMovieDetailFragment$mCardShowScrollListener$1(this), (Function1) null, (S) null, 6);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return ChannelMoviePV.CHANNEL_MOVIE_DETAIL_PV.getPv();
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        ChannelMovieDetailVM channelMovieDetailVMKf = kf();
        Bundle bundle = new Bundle();
        bundle.putString("channel_id", String.valueOf(channelMovieDetailVMKf.f75351b));
        bundle.putString("from", channelMovieDetailVMKf.f75352c);
        bundle.putString("page_entity_id", String.valueOf(channelMovieDetailVMKf.f75353d));
        bundle.putString("page_entity_name", channelMovieDetailVMKf.f75354e);
        return bundle;
    }

    public final l jf() {
        return (l) this.f75344c.getValue(this, f75342g[0]);
    }

    public final ChannelMovieDetailVM kf() {
        return (ChannelMovieDetailVM) this.f75345d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r5) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.movie.detail.ChannelMovieDetailFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return jf().a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (kf().h) {
            return;
        }
        kf().I0();
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Context context;
        Resources resources;
        super.onViewCreated(view, bundle);
        int iCoerceAtLeast = 0;
        jf().c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        View view2 = getView();
        int dimensionPixelSize = (view2 == null || (context = view2.getContext()) == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131165609);
        View view3 = getView();
        if (view3 != null) {
            Resources resources2 = view3.getContext().getResources();
            int i7 = resources2.getDisplayMetrics().widthPixels;
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(2131165612);
            iCoerceAtLeast = RangesKt.coerceAtLeast(((i7 - resources2.getDimensionPixelSize(2131165609)) - (dimensionPixelSize2 * 4)) - ((dimensionPixelSize2 / 8) * 5), 0) / 4;
        }
        this.f75346e = new c(dimensionPixelSize, iCoerceAtLeast);
        RecyclerView recyclerView = jf().c;
        c cVar = this.f75346e;
        c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            cVar2 = null;
        }
        recyclerView.setAdapter(cVar2);
        jf().c.addOnScrollListener(this.f75347f);
        kf().f75357i.observe(getViewLifecycleOwner(), new b(new j(this, 2)));
    }
}
