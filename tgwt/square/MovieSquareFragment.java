package com.bilibili.tgwt.square;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.accounts.BiliAccountsKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.tgwt.api.ChatRoomOperationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.recycler.DividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment.class */
@StabilityInferred(parameters = 0)
public final class MovieSquareFragment extends BaseToolbarFragment implements IPvTracker, SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f112044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f112045w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public EmptyStateView f112046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RecyclerView f112047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView f112048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ImageView f112049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TextView f112050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public View f112051g;
    public SwipeRefreshLayout h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f112054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f112055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f112056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f112057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f112058o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f112061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f112062s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h f112064u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.app.gemini.ui.f f112052i = new com.bilibili.app.gemini.ui.f(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ArrayList<UIComponent<?>> f112053j = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f112059p = "0.0.0.0";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public String f112060q = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ChatRoomOperationService f112063t = (ChatRoomOperationService) ServiceGenerator.createService(ChatRoomOperationService.class);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$a.class */
    public static final class a extends Nl0.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MovieSquareFragment f112065b;

        public a(MovieSquareFragment movieSquareFragment) {
            this.f112065b = movieSquareFragment;
        }

        @Override // Nl0.e
        public final void onLastItemVisible() {
            MovieSquareFragment.nf(this.f112065b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$b.class */
    public static final class b extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MovieSquareFragment f112066a;

        public b(MovieSquareFragment movieSquareFragment) {
            this.f112066a = movieSquareFragment;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            UIComponent<?> uIComponent = this.f112066a.f112053j.get(i7);
            return ((uIComponent instanceof i) || (uIComponent instanceof u) || (uIComponent instanceof y) || (uIComponent instanceof com.bilibili.tgwt.square.b) || (uIComponent instanceof n) || (uIComponent instanceof l)) ? 2 : 1;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$c.class */
    public static final class c extends DividerDecoration {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final MovieSquareFragment f112067f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final RecyclerView f112068g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MovieSquareFragment movieSquareFragment, RecyclerView recyclerView, int i7) {
            super(i7);
            this.f112067f = movieSquareFragment;
            this.f112068g = recyclerView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i7;
            int i8;
            super/*androidx.recyclerview.widget.RecyclerView.ItemDecoration*/.getItemOffsets(rect, view, recyclerView, state);
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            RecyclerView recyclerView2 = this.f112068g;
            int iB = Uj0.c.b(12.0f, recyclerView2.getContext());
            MovieSquareFragment movieSquareFragment = this.f112067f;
            UIComponent<?> uIComponent = movieSquareFragment.f112053j.get(childViewHolder.getBindingAdapterPosition());
            int i9 = 0;
            if ((uIComponent instanceof f) || (uIComponent instanceof d)) {
                int bindingAdapterPosition = childViewHolder.getBindingAdapterPosition();
                Iterator<UIComponent<?>> it = movieSquareFragment.f112053j.iterator();
                int i10 = 0;
                while (true) {
                    i7 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(it.next().getClass(), uIComponent.getClass())) {
                        i7 = i10;
                        break;
                    }
                    i10++;
                }
                if ((bindingAdapterPosition - i7) % 2 == 0) {
                    rect.left = iB;
                    rect.right = iB / 2;
                    return;
                } else {
                    rect.left = iB / 2;
                    rect.right = iB;
                    return;
                }
            }
            if (!(uIComponent instanceof r)) {
                if (uIComponent instanceof i) {
                    rect.top = Uj0.c.b(24.0f, recyclerView2.getContext());
                    rect.bottom = Uj0.c.b(86.0f, recyclerView2.getContext());
                    return;
                }
                return;
            }
            int iB2 = Uj0.c.b(4.0f, recyclerView2.getContext());
            rect.top = Uj0.c.b(12.0f, recyclerView2.getContext());
            rect.bottom = iB2 * (-1);
            int bindingAdapterPosition2 = childViewHolder.getBindingAdapterPosition();
            Iterator<UIComponent<?>> it2 = movieSquareFragment.f112053j.iterator();
            while (true) {
                i8 = -1;
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(it2.next().getClass(), uIComponent.getClass())) {
                    i8 = i9;
                    break;
                }
                i9++;
            }
            if ((bindingAdapterPosition2 - i8) % 2 == 0) {
                rect.left = iB;
                rect.right = iB2;
            } else {
                rect.left = iB2;
                rect.right = iB;
            }
        }

        public final boolean needDrawDivider(RecyclerView.ViewHolder viewHolder) {
            UIComponent<?> uIComponent = this.f112067f.f112053j.get(viewHolder.getBindingAdapterPosition());
            return (uIComponent instanceof d) || (uIComponent instanceof n);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.square.MovieSquareFragment$onCreate$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$onCreate$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MovieSquareFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MovieSquareFragment movieSquareFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = movieSquareFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MovieSquareFragment movieSquareFragment = this.this$0;
                this.label = 1;
                if (MovieSquareFragment.mf(movieSquareFragment, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.tgwt.square.MovieSquareFragment$onViewCreated$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$onViewCreated$2.class */
    public static final class C66622 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MovieSquareFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.tgwt.square.MovieSquareFragment$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/square/MovieSquareFragment$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MovieSquareFragment f112069a;

            public a(MovieSquareFragment movieSquareFragment) {
                this.f112069a = movieSquareFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((Boolean) obj).booleanValue()) {
                    MovieSquareFragment movieSquareFragment = this.f112069a;
                    if (movieSquareFragment.f112058o) {
                        movieSquareFragment.f112058o = false;
                        com.bapis.bilibili.account.interfaces.v1.g.a(null, "bilibili://pgc/theater/choose", 2, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66622(MovieSquareFragment movieSquareFragment, Continuation<? super C66622> continuation) {
            super(2, continuation);
            this.this$0 = movieSquareFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C66622(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDrop = FlowKt.drop(BiliAccountsKt.a(com.bilibili.ogv.infra.account.a.f67852b), 1);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowDrop.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object mf(com.bilibili.tgwt.square.MovieSquareFragment r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.square.MovieSquareFragment.mf(com.bilibili.tgwt.square.MovieSquareFragment, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void nf(MovieSquareFragment movieSquareFragment) {
        if (!movieSquareFragment.f112055l || movieSquareFragment.f112054k) {
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = movieSquareFragment.h;
        SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
            swipeRefreshLayout2 = null;
        }
        swipeRefreshLayout2.setEnabled(false);
        movieSquareFragment.f112054k = true;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(movieSquareFragment), (CoroutineContext) null, (CoroutineStart) null, new MovieSquareFragment$loadNextPage$1(movieSquareFragment, null), 3, (Object) null);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.watch-together-plaza.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    public final void of(boolean z6) {
        EmptyStateView emptyStateView;
        if (this.f112054k) {
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.h;
        SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
            swipeRefreshLayout2 = null;
        }
        swipeRefreshLayout2.setEnabled(false);
        if (z6 && (emptyStateView = this.f112046b) != null) {
            int i7 = EmptyStateView.f73157k;
            emptyStateView.b(0, false);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new MovieSquareFragment$getSquareFirstScreenData$1(this, null), 3, (Object) null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        int id = view.getId();
        if (id == 2131302849) {
            FragmentActivity fragmentActivityP3 = p3();
            if (fragmentActivityP3 != null) {
                fragmentActivityP3.onBackPressed();
                return;
            }
            return;
        }
        if (id == 2131303197) {
            Neurons.reportClick$default(false, "pgc.watch-together-plaza.top-bar.search.click", (Map) null, 4, (Object) null);
            com.bapis.bilibili.account.interfaces.v1.g.a(null, "bilibili://pgc/theater/search", 2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.square.MovieSquareFragment.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), 2131888041)).inflate(2131500509, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(2131303590);
        this.h = swipeRefreshLayout;
        SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
        if (swipeRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
            swipeRefreshLayout2 = null;
        }
        swipeRefreshLayout2.setOnRefreshListener(this);
        SwipeRefreshLayout swipeRefreshLayout3 = this.h;
        if (swipeRefreshLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSwipeRefreshLayout");
            swipeRefreshLayout3 = null;
        }
        swipeRefreshLayout3.setColorSchemeResources(R$color.Pi5);
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        f112045w = false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        this.f112055l = false;
        this.f112056m = null;
        this.f112057n = 0L;
        of(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f112058o = false;
        if (f112044v) {
            onRefresh();
            f112044v = false;
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            mToolbar.setNavigationIcon((Drawable) null);
        }
        this.f112048d = (ImageView) view.findViewById(2131302849);
        this.f112049e = (ImageView) view.findViewById(2131303197);
        this.f112050f = (TextView) view.findViewById(2131310619);
        this.f112051g = view.findViewById(2131305529);
        this.f112046b = (EmptyStateView) view.findViewById(2131301025);
        ImageView imageView = this.f112048d;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        ImageView imageView2 = this.f112049e;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        View view2 = this.f112051g;
        if (view2 != null) {
            view2.setOnClickListener(new Jk.b(this, 4));
        }
        Context context = view.getContext();
        Garb curGarb = GarbManager.getCurGarb();
        int color = curGarb.isPure() ? ContextCompat.getColor(context, 2131103911) : curGarb.getFontColor();
        int color2 = curGarb.isPure() ? ContextCompat.getColor(context, 2131103914) : curGarb.getFontColor();
        ImageView imageView3 = this.f112048d;
        if (imageView3 != null) {
            ImageViewCompat.setImageTintList(imageView3, ColorStateList.valueOf(color));
        }
        ImageView imageView4 = this.f112049e;
        if (imageView4 != null) {
            ImageViewCompat.setImageTintList(imageView4, ColorStateList.valueOf(color));
        }
        TextView textView = this.f112050f;
        if (textView != null) {
            textView.setTextColor(color2);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(2131306580);
        this.f112047c = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new a(this));
            GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
            gridLayoutManager.setSpanSizeLookup(new b(this));
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.addItemDecoration(new c(this, recyclerView, R$color.Ga2));
            recyclerView.setAdapter(this.f112052i);
        }
        of(true);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new C66622(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
    }
}
