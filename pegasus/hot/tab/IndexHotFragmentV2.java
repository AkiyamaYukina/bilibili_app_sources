package com.bilibili.pegasus.hot.tab;

import Tc1.n;
import Tc1.t;
import Tc1.u;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.homepage.startdust.OnPageSelectChangeListener;
import com.bilibili.lib.homepage.startdust.PageReSelectedParams;
import com.bilibili.pvtracker.IPvTracker;
import dagger.hilt.android.AndroidEntryPoint;
import gl.h;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragmentV2.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class IndexHotFragmentV2 extends Hilt_IndexHotFragmentV2 implements IPvTracker, aa0.a, OnPageSelectChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final KProperty<Object>[] f78181k = {new PropertyReference1Impl(IndexHotFragmentV2.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliAppPromoHotLayoutV2Binding;", 0)};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f78182g = ReflectionFragmentViewBindings.viewBindingFragment(this, h.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    @NotNull
    public final Lazy h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Inject
    public tv.danmaku.bili.hottopic.compose.b f78183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f78184j;

    public IndexHotFragmentV2() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.hot.tab.IndexHotFragmentV2$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8135invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.hot.tab.IndexHotFragmentV2$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8136invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.h = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(tv.danmaku.bili.hottopic.viewModel.c.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.hot.tab.IndexHotFragmentV2$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8137invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.hot.tab.IndexHotFragmentV2$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8138invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.hot.tab.IndexHotFragmentV2$special$$inlined$viewModels$default$4.m8138invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.hot.tab.IndexHotFragmentV2$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8139invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.hot.tab.IndexHotFragmentV2$special$$inlined$viewModels$default$5.m8139invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    public static long kf() {
        Long longOrNull;
        String str = (String) Contract.get$default(ConfigManager.Companion.config(), "pegasus.hot_auto_refresh_second", (Object) null, 2, (Object) null);
        return (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? -1L : longOrNull.longValue() * 1000;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "creation.hot-tab.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @Nullable
    public final Bundle getPvExtra() {
        return null;
    }

    public final tv.danmaku.bili.hottopic.viewModel.c lf() {
        return (tv.danmaku.bili.hottopic.viewModel.c) this.h.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return ((h) this.f78182g.getValue(this, f78181k[0])).a;
    }

    public final void onNewIntent(@Nullable Intent intent) {
        Bundle extras;
        lf().I0(new n.e(false, (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("aid"), 1));
    }

    public final void onPageReSelected(@Nullable PageReSelectedParams pageReSelectedParams) {
        lf().I0(n.g.a);
    }

    public final void onPageSelected(@Nullable Map<String, ? extends Object> map) {
    }

    public final void onPageUnselected() {
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f78184j = System.currentTimeMillis();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        t tVar = (t) lf().b.getValue();
        if (!(tVar.b instanceof u.c)) {
            long jKf = kf();
            if (1 > jKf || jKf >= 21600000 || this.f78184j <= 0 || System.currentTimeMillis() - this.f78184j < kf() || tVar.c || !(tVar.b instanceof u.d)) {
                return;
            }
            lf().I0(new n.e(true, (String) null, 2));
            return;
        }
        tv.danmaku.bili.hottopic.viewModel.c cVarLf = lf();
        FragmentActivity fragmentActivityP3 = p3();
        String string = null;
        if (fragmentActivityP3 != null) {
            Intent intent = fragmentActivityP3.getIntent();
            string = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                string = null;
                if (extras != null) {
                    string = extras.getString("aid");
                }
            }
        }
        cVarLf.I0(new n.e(false, string, 1));
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        ((h) this.f78182g.getValue(this, f78181k[0])).b.setContent(ComposableLambdaKt.composableLambdaInstance(669132744, true, new Function2(this) { // from class: com.bilibili.pegasus.hot.tab.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IndexHotFragmentV2 f78187a;

            {
                this.f78187a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                KProperty<Object>[] kPropertyArr = IndexHotFragmentV2.f78181k;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(669132744, iIntValue, -1, "com.bilibili.pegasus.hot.tab.IndexHotFragmentV2.onViewCreated.<anonymous> (IndexHotFragmentV2.kt:115)");
                    }
                    IndexHotFragmentV2 indexHotFragmentV2 = this.f78187a;
                    tv.danmaku.bili.hottopic.viewModel.c cVarLf = indexHotFragmentV2.lf();
                    tv.danmaku.bili.hottopic.compose.b bVar = indexHotFragmentV2.f78183i;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardComposerRegistry");
                        bVar = null;
                    }
                    tv.danmaku.bili.hottopic.c.a(cVarLf, bVar, NestedScrollModifierKt.nestedScroll$default(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.Companion), NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1), null, 2, null), composer, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
    }
}
