package com.bilibili.pegasus.verticaltab;

import HS0.G;
import OS0.U;
import OS0.W;
import Up0.C2912a;
import Vp0.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.app.comm.list.common.inline.config.pegasus.PegasusInlineConfigKt;
import com.bilibili.app.comm.list.common.inlineshare.PageObscuredListener;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.comm.opus.lightpublish.compose.y0;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.bililive.room.ui.roomv3.gift.v;
import com.bilibili.bililive.room.ui.roomv3.gift.w;
import com.bilibili.bus.Violet;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.inline.control.IInlineControl;
import com.bilibili.inline.page.InlinePage;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.accounts.subscribe.PassportObserver;
import com.bilibili.lib.accounts.subscribe.Topic;
import com.bilibili.lib.homepage.startdust.OnPageSelectChangeListener;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.mini.player.common.manager.MiniScreenPlayerCloseEvent;
import com.bilibili.moduleservice.list.PegasusInlineSwitchState;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.utils.E;
import com.bilibili.pegasus.utils.x;
import com.bilibili.pegasus.verticaltab.api.model.EmptyItem;
import com.bilibili.pegasus.verticaltab.api.model.FooterLoadingItem;
import com.bilibili.pegasus.verticaltab.api.model.VerticalTabConfig;
import com.bilibili.playerbizcommon.message.VideoStatusMessage;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.relation.FollowStateEvent;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/VerticalTabFragment.class */
@StabilityInferred(parameters = 0)
public final class VerticalTabFragment extends BaseFragment implements ThemeWatcher.Observer, OnPageSelectChangeListener, com.bilibili.pegasus.promo.e, SwipeRefreshLayout.OnRefreshListener, InlinePage, com.bilibili.pegasus.promo.f, IPvTracker, PassportObserver, PageObscuredListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final KProperty<Object>[] f78919k = {new PropertyReference1Impl(VerticalTabFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliAppVerticalTabLayoutBinding;", 0), new MutablePropertyReference1Impl(VerticalTabFragment.class, "mInlineCapacity", "getMInlineCapacity()Lcom/bilibili/pegasus/verticaltab/InlineCapacity;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f78920b = ReflectionFragmentViewBindings.viewBindingFragment(this, gl.i.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f78921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f78922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public p f78925g;

    @NotNull
    public final com.bilibili.app.comm.list.common.widget.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f78926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f78927j;

    public VerticalTabFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.verticaltab.VerticalTabFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8228invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.verticaltab.VerticalTabFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8229invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f78921c = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(l.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.verticaltab.VerticalTabFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8230invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.verticaltab.VerticalTabFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8231invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.verticaltab.VerticalTabFragment$special$$inlined$viewModels$default$4.m8231invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.verticaltab.VerticalTabFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8232invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.verticaltab.VerticalTabFragment$special$$inlined$viewModels$default$5.m8232invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f78922d = new b(this);
        this.h = new com.bilibili.app.comm.list.common.widget.a(new com.bilibili.app.comm.list.common.widget.l(this));
        this.f78926i = LazyKt.lazy(new B21.a(10));
    }

    @Override // com.bilibili.pegasus.promo.e
    public final boolean e7() {
        VerticalTabConfig value = lf().f78978e.getValue();
        boolean z6 = false;
        if (value != null) {
            z6 = false;
            if (value.column == 1) {
                z6 = true;
            }
        }
        return z6;
    }

    public final int getBottomClip() {
        Resources resources;
        Context context = getContext();
        return (context == null || (resources = context.getResources()) == null) ? 0 : resources.getDimensionPixelSize(2131166100);
    }

    @Nullable
    public final IInlineControl getInlineControl() {
        a aVarKf = kf();
        return aVarKf != null ? aVarKf.f78929b : null;
    }

    public final boolean getPageSwitchState() {
        VerticalTabConfig value = lf().f78978e.getValue();
        boolean z6 = false;
        if (value != null) {
            int i7 = value.autoplayCard;
            x.a aVar = x.f78893a;
            PegasusInlineSwitchState pegasusInlineSwitchState = i7 != 1 ? i7 != 2 ? i7 != 11 ? null : PegasusInlineSwitchState.ALL_NETWORK : PegasusInlineSwitchState.OFF : PegasusInlineSwitchState.WIFI_ONLY;
            z6 = false;
            if (pegasusInlineSwitchState != null) {
                z6 = false;
                if (PegasusInlineConfigKt.isAutoPlayEnable(pegasusInlineSwitchState)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.composite-tab.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("page_content_type", "all");
        bundleM.putString("page_content_id", String.valueOf(this.f78927j));
        return bundleM;
    }

    @NotNull
    public final Rect getViewVisibleRect() {
        Rect rect = new Rect();
        RecyclerView recyclerView = jf().b;
        recyclerView.getGlobalVisibleRect(rect);
        rect.bottom -= recyclerView.getContext().getResources().getDimensionPixelSize(2131166100);
        return rect;
    }

    public final gl.i jf() {
        return (gl.i) this.f78920b.getValue(this, f78919k[0]);
    }

    public final a kf() {
        com.bilibili.app.comm.list.common.widget.a aVar = this.h;
        KProperty<Object> kProperty = f78919k[1];
        return (a) aVar.b;
    }

    public final l lf() {
        return (l) this.f78921c.getValue();
    }

    public final void mf(boolean z6) {
        IInlineControl iInlineControl;
        this.f78923e = z6;
        for (C2912a c2912a : ((Z7.a) this.f78922d).c) {
            c2912a.f24827d = z6;
            if (z6) {
                Vp0.e.b(c2912a);
            }
        }
        if (z6) {
            nf();
            return;
        }
        a aVarKf = kf();
        if (aVarKf == null || (iInlineControl = aVarKf.f78929b) == null) {
            return;
        }
        iInlineControl.stopPlay();
    }

    public final void nf() {
        if (this.f78924f || !isAdded()) {
            return;
        }
        if (((E) this.f78926i.getValue()).f78853a != 0) {
            ((E) this.f78926i.getValue()).f78854b = new U(this, 1);
            return;
        }
        RecyclerView recyclerView = jf().b;
        if (recyclerView.isAttachedToWindow()) {
            HandlerThreads.postDelayed(0, new com.bilibili.ad.adview.widget.bottomsheetdialog.panel.f(this, 2), 100L);
        } else {
            ListExtentionsKt.onNextDrawOver(recyclerView, new W(this, 2));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void of() {
        RecyclerView recyclerView = jf().b;
        recyclerView.setBackgroundColor(ThemeUtils.getColorById(p3(), R$color.Ga1));
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getResources().getDimensionPixelSize(2131167277) + getBottomClip());
        p pVar = this.f78925g;
        if (pVar != null) {
            recyclerView.removeItemDecoration(pVar);
        }
        p pVar2 = new p(new y0(this, 2));
        recyclerView.addItemDecoration(pVar2);
        this.f78925g = pVar2;
    }

    public final void onChange(@Nullable Topic topic) {
        lf().refresh();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        String string;
        Integer intOrNull;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f78927j = (arguments == null || (string = arguments.getString("channel_id")) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue();
        l lVarLf = lf();
        Bundle arguments2 = getArguments();
        int iIntValue = 0;
        if (arguments2 != null) {
            lVarLf.getClass();
            String string2 = arguments2.getString("channel_id");
            iIntValue = 0;
            if (string2 != null) {
                Integer intOrNull2 = StringsKt.toIntOrNull(string2);
                iIntValue = 0;
                if (intOrNull2 != null) {
                    iIntValue = intOrNull2.intValue();
                }
            }
        }
        lVarLf.f78975b.f24218c = iIntValue;
        lVarLf.refresh();
        Violet violet = Violet.INSTANCE;
        violet.ofChannel(VideoStatusMessage.class).observeCachedInactive(this, lf().f78983k);
        violet.ofChannel(Mq0.e.class).observeCachedInactive(this, lf().f78984l);
        violet.ofChannel(FollowStateEvent.class).observeCachedInactive(this, lf().f78982j);
        BiliAccounts.get(getContext()).subscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return jf().a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        BiliAccounts.get(getContext()).unsubscribe(this, new Topic[]{Topic.SIGN_IN, Topic.SIGN_OUT});
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ThemeWatcher.getInstance().unSubscribe(this);
        View view = getView();
        ViewPager viewPager = null;
        ViewParent parent = view != null ? view.getParent() : null;
        if (parent instanceof ViewPager) {
            viewPager = (ViewPager) parent;
        }
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener((E) this.f78926i.getValue());
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        super.onFragmentHide(flag);
        mf(false);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        super.onFragmentShow(flag);
        mf(true);
    }

    public final void onObscureStateChanged(boolean z6) {
        IInlineControl iInlineControl;
        this.f78924f = z6;
        if (this.f78923e) {
            if (!z6) {
                nf();
                return;
            }
            a aVarKf = kf();
            if (aVarKf == null || (iInlineControl = aVarKf.f78929b) == null) {
                return;
            }
            iInlineControl.stopPlay();
        }
    }

    public final void onPageReSelected() {
        if (isAdded()) {
            ListExtentionsKt.smoothScrollToTop(jf().b);
            lf().refresh();
        }
    }

    public final void onPageSelected(@Nullable Map<String, Object> map) {
        if (isAdded()) {
            nf();
        }
    }

    public final void onPageUnselected() {
        mf(false);
    }

    public final void onRefresh() {
        lf().refresh();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ListExtentionsKt.onNextDrawOver(jf().b, new G(this, 3));
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        of();
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
        jf().c.setLegacyRequestDisallowInterceptTouchEventEnabled(false);
        RecyclerView recyclerView = jf().b;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new g(this));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.f78922d);
        ListExtentionsKt.onReachBottom(recyclerView, 2, new Function0(this) { // from class: com.bilibili.pegasus.verticaltab.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalTabFragment f78965a;

            {
                this.f78965a = this;
            }

            public final Object invoke() {
                KProperty<Object>[] kPropertyArr = VerticalTabFragment.f78919k;
                l lVarLf = this.f78965a.lf();
                Job job = lVarLf.f78981i;
                if (job == null || true != job.isActive()) {
                    Tp0.b bVar = lVarLf.f78975b;
                    if (bVar.f24219d) {
                        MutableLiveData<List<BasicIndexItem>> mutableLiveData = lVarLf.f78976c;
                        List<BasicIndexItem> value = mutableLiveData.getValue();
                        if (!((value != null ? (BasicIndexItem) CollectionsKt.getOrNull(value, 0) : null) instanceof EmptyItem)) {
                            bVar.f24216a = false;
                            List<BasicIndexItem> value2 = mutableLiveData.getValue();
                            if (!((value2 != null ? (BasicIndexItem) CollectionsKt.last(value2) : null) instanceof FooterLoadingItem)) {
                                List<BasicIndexItem> value3 = mutableLiveData.getValue();
                                if (value3 != null) {
                                    value3.add((FooterLoadingItem) lVarLf.f78980g.getValue());
                                }
                                lVarLf.J0();
                            }
                            lVarLf.f78981i = BuildersKt.launch$default(ViewModelKt.getViewModelScope(lVarLf), (CoroutineContext) null, (CoroutineStart) null, new VerticalTabViewModel$load$1(lVarLf, null), 3, (Object) null);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        });
        recyclerView.setItemAnimator(null);
        SwipeRefreshLayout swipeRefreshLayout = jf().c;
        swipeRefreshLayout.setStyle(1);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeResources(new int[]{2131103284});
        l lVarLf = lf();
        lVarLf.f78976c.observe(getViewLifecycleOwner(), new h(new Sa.f(this, 1)));
        lVarLf.f78978e.observe(getViewLifecycleOwner(), new h(new f(this, 0)));
        lVarLf.f78979f.observe(getViewLifecycleOwner(), new h(new v(1, this)));
        lVarLf.f78977d.observe(getViewLifecycleOwner(), new h(new w(this, 1)));
        of();
        this.h.a(new a(this), f78919k[1]);
        a aVarKf = kf();
        if (aVarKf != null) {
            RecyclerView recyclerView2 = jf().b;
            IInlineControl.Companion companion = IInlineControl.Companion;
            IInlineControl.Builder builder = new IInlineControl.Builder(aVarKf.f78928a, recyclerView2);
            builder.setAutoPlayControl((Hp0.a) aVarKf.f78930c.getValue());
            builder.setFetcher((Hp0.c) aVarKf.f78932e.getValue());
            builder.setDelegate((Yp0.b) aVarKf.f78931d.getValue());
            builder.setIdentity("main.composite-tab.0.0.pv");
            aVarKf.f78929b = builder.build();
        }
        ThemeWatcher.getInstance().subscribe(this);
        ViewParent parent = view.getParent();
        ViewPager viewPager = null;
        if (parent instanceof ViewPager) {
            viewPager = (ViewPager) parent;
        }
        if (viewPager != null) {
            viewPager.removeOnPageChangeListener((E) this.f78926i.getValue());
            viewPager.addOnPageChangeListener((E) this.f78926i.getValue());
        }
        Violet.INSTANCE.ofChannel(MiniScreenPlayerCloseEvent.class).observeUnSticky(getViewLifecycleOwner(), new Observer(this) { // from class: com.bilibili.pegasus.verticaltab.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final VerticalTabFragment f78964a;

            {
                this.f78964a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                VerticalTabFragment verticalTabFragment = this.f78964a;
                if (verticalTabFragment.f78923e) {
                    verticalTabFragment.nf();
                }
            }
        });
    }
}
