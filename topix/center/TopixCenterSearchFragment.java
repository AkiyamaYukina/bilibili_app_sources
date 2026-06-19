package com.bilibili.topix.center;

import PD0.C2772n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.magicasakura.widgets.TintView;
import java.util.List;
import java.util.Map;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterSearchFragment.class */
@StabilityInferred(parameters = 0)
public final class TopixCenterSearchFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C2772n f112378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f112379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f112380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f112381e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterSearchFragment$a.class */
    public static final class a extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TopixCenterSearchFragment f112382c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TopixCenterSearchFragment topixCenterSearchFragment, Jq.g gVar) {
            super(gVar);
            this.f112382c = topixCenterSearchFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            v vVar = (v) viewHolder;
            super.onViewAttachedToWindow(vVar);
            Object tag = vVar.itemView.getTag();
            if (tag != null) {
                if (!(tag instanceof com.bilibili.topix.model.TopicItem)) {
                    tag = null;
                }
                com.bilibili.topix.model.TopicItem topicItem = (com.bilibili.topix.model.TopicItem) tag;
                if (topicItem != null) {
                    String str = this.f112382c.kf().f112389f;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    Neurons.reportExposure$default(false, "dt.topic-search.legend-list.topic-card.show", TopixCenterSearchFragment.jf(topicItem.d, str2), (List) null, 8, (Object) null);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterSearchFragment$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopixCenterSearchFragment f112383a;

        public b(TopixCenterSearchFragment topixCenterSearchFragment) {
            this.f112383a = topixCenterSearchFragment;
        }

        @Override // java.lang.Runnable
        public final void run() {
            EditText editText;
            C2772n c2772n = this.f112383a.f112378b;
            if (c2772n == null || (editText = c2772n.f18775c) == null) {
                return;
            }
            editText.requestFocus();
            editText.setCursorVisible(true);
            InputMethodManagerHelper.showSoftInput(editText.getContext(), editText, 0);
        }
    }

    public TopixCenterSearchFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.topix.center.TopixCenterSearchFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m10617invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.topix.center.TopixCenterSearchFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m10618invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f112379c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TopixCenterSearchViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.topix.center.TopixCenterSearchFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m10619invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.topix.center.TopixCenterSearchFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m10620invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterSearchFragment$special$$inlined$viewModels$default$4.m10620invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.topix.center.TopixCenterSearchFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m10621invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterSearchFragment$special$$inlined$viewModels$default$5.m10621invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f112380d = LazyKt.lazy(new com.bilibili.app.comment.ext.compose.t(this, 3));
        this.f112381e = LazyKt.lazy(new L11.z(this, 2));
    }

    public static Map jf(long j7, String str) {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("page_entity", "query"), TuplesKt.to("page_entity_name", str), TuplesKt.to("card_entity", "topic"), TuplesKt.to("card_entity_id", String.valueOf(j7))});
    }

    public final TopixCenterSearchViewModel kf() {
        return (TopixCenterSearchViewModel) this.f112379c.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2772n c2772nInflate = C2772n.inflate(layoutInflater);
        this.f112378b = c2772nInflate;
        if (c2772nInflate != null) {
            c2772nInflate.f18781j.setOnClickListener(new com.bilibili.biligame.cloudgame.v2.ui.fragment.n(this, 2));
            c2772nInflate.f18778f.setOnClickListener(new Ol0.a(2, this));
            c2772nInflate.f18775c.addTextChangedListener(new t(this));
            c2772nInflate.f18776d.setOnClickListener(new Jq.j(c2772nInflate, 3));
            ConcatAdapter concatAdapter = new ConcatAdapter((s) this.f112381e.getValue(), (ND0.a) this.f112380d.getValue());
            RecyclerView recyclerView = c2772nInflate.f18779g;
            recyclerView.setAdapter(concatAdapter);
            ListExtentionsKt.onReachBottom(recyclerView, 3, new M8.f(this, 5));
        }
        kf().f112384a.observe(getViewLifecycleOwner(), new u(new GO.g(this, 3)));
        kf().f112385b.observe(getViewLifecycleOwner(), new u(new Hx0.e(this, 1)));
        kf().f112386c.observe(getViewLifecycleOwner(), new u(new com.bilibili.bplus.followinglist.detail.favour.f(this, 1)));
        c2772nInflate.f18775c.postDelayed(new b(this), 150L);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new TopixCenterSearchFragment$onCreateView$1$5(this, c2772nInflate, null));
        return c2772nInflate.f18773a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f112378b = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        EditText editText;
        super.onPause();
        C2772n c2772n = this.f112378b;
        if (c2772n == null || (editText = c2772n.f18775c) == null) {
            return;
        }
        InputMethodManagerHelper.hideSoftInput(editText.getContext(), editText, 0);
        editText.clearFocus();
        editText.setCursorVisible(false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        EditText editText;
        super.onResume();
        C2772n c2772n = this.f112378b;
        if (c2772n == null || (editText = c2772n.f18775c) == null) {
            return;
        }
        editText.requestFocus();
        editText.setCursorVisible(true);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        TintView tintView;
        TintTextView tintTextView;
        TintView tintView2;
        TintTextView tintTextView2;
        super.onViewCreated(view, bundle);
        Garb curGarb = GarbManager.getCurGarb();
        if (curGarb.isWhite() || !curGarb.isPure()) {
            C2772n c2772n = this.f112378b;
            if (c2772n != null && (tintTextView = c2772n.f18781j) != null) {
                tintTextView.setTextColor(getResources().getColor(R$color.Text2));
            }
            C2772n c2772n2 = this.f112378b;
            if (c2772n2 == null || (tintView = c2772n2.f18774b) == null) {
                return;
            }
            tintView.setBackgroundResource(R$color.Bg1);
            return;
        }
        C2772n c2772n3 = this.f112378b;
        if (c2772n3 != null && (tintTextView2 = c2772n3.f18781j) != null) {
            tintTextView2.setTextColor(getResources().getColor(R$color.Wh0_u));
        }
        C2772n c2772n4 = this.f112378b;
        if (c2772n4 == null || (tintView2 = c2772n4.f18774b) == null) {
            return;
        }
        tintView2.setBackgroundResource(2131103971);
    }
}
