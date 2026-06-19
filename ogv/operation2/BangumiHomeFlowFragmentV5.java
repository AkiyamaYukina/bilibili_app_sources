package com.bilibili.ogv.operation2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.app.comm.list.common.utils.ListDeviceInfoKt;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.homepage.startdust.OnPageSelectChangeListener;
import com.bilibili.lib.homepage.startdust.PageReSelectedParams;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.ogv.bpf.lifecycle.SkeletonViewModel;
import com.bilibili.ogv.kmm.operation.banner.C5440d;
import com.bilibili.ogv.kmm.operation.banner.InterfaceC5439c;
import com.bilibili.ogv.kmm.operation.page.p;
import com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5;
import com.bilibili.ogv.operation2.banner.BannerHdrVideoConfigHelperImpl;
import com.bilibili.ogv.operation2.inlinevideo.C;
import com.bilibili.ogv.operation2.inlinevideo.OgvInlineStatusHelper;
import com.bilibili.ogv.operation2.viptask.a;
import com.bilibili.ogv.target.reach.TargetReachInteractService;
import com.bilibili.pvtracker.IPvTracker;
import io.ktor.client.HttpClient;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k.InterfaceC7728a;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.base.router.Router;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.UiComposableLike;
import kntr.common.router.GlobalRouterKt;
import kntr.common.router.RouterKt;
import kntr.common.trio.toast.ToasterKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowFragmentV5.class */
@StabilityInferred(parameters = 0)
public final class BangumiHomeFlowFragmentV5 extends BaseFragment implements ha0.c, aa0.a, OnPageSelectChangeListener, IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.bilibili.ogv.operation2.viptask.a f70797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f70798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public PinnedBottomScrollingBehavior f70799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f70800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f70801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f70802g;

    @NotNull
    public final Mj0.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f70803i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowFragmentV5$HomeFlowType.class */
    public static final class HomeFlowType {
        private static final EnumEntries $ENTRIES;
        private static final HomeFlowType[] $VALUES;
        public static final HomeFlowType BANGUMI = new HomeFlowType("BANGUMI", 0, 1);
        public static final HomeFlowType CINEMA = new HomeFlowType("CINEMA", 1, 2);
        private final int type;

        private static final /* synthetic */ HomeFlowType[] $values() {
            return new HomeFlowType[]{BANGUMI, CINEMA};
        }

        static {
            HomeFlowType[] homeFlowTypeArr$values = $values();
            $VALUES = homeFlowTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(homeFlowTypeArr$values);
        }

        private HomeFlowType(String str, int i7, int i8) {
            this.type = i8;
        }

        @NotNull
        public static EnumEntries<HomeFlowType> getEntries() {
            return $ENTRIES;
        }

        public static HomeFlowType valueOf(String str) {
            return (HomeFlowType) Enum.valueOf(HomeFlowType.class, str);
        }

        public static HomeFlowType[] values() {
            return (HomeFlowType[]) $VALUES.clone();
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowFragmentV5$PageModelHolder.class */
    @StabilityInferred(parameters = 0)
    public static final class PageModelHolder extends SkeletonViewModel<UiComposableLike<? extends com.bilibili.ogv.kmm.operation.page.a>> {
        public static final int $stable = SkeletonViewModel.$stable;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [Tk0.a, java.lang.Object] */
        public static final UiComposableLike init$lambda$0(final PageModelHolder pageModelHolder, String str, final ViewModelStore viewModelStore) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Xj0.a aVar = new Xj0.a(str, pageModelHolder.getToaster(), pageModelHolder.getLifecycle(), new Object(), new BannerHdrVideoConfigHelperImpl(pageModelHolder.getLifecycle()), new Pd.b(pageModelHolder, 1, objectRef, str), new Vn.g(pageModelHolder, 3));
            objectRef.element = new com.bilibili.ogv.operation3.module.operable.delivery.a((HttpClient) aVar.a().get());
            yW0.b bVar = aVar.f28225l;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pageModelProvider");
                bVar = null;
            }
            final com.bilibili.ogv.kmm.operation.page.o oVar = (com.bilibili.ogv.kmm.operation.page.o) bVar.get();
            oVar.getClass();
            Komponent Komponent = KomponentKt.Komponent(new Function1(oVar) { // from class: com.bilibili.ogv.kmm.operation.page.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final o f68567a;

                {
                    this.f68567a = oVar;
                }

                public final Object invoke(Object obj) {
                    KomponentScope komponentScope = (KomponentScope) obj;
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    q91.i.Companion.getClass();
                    objectRef2.element = q91.i.b;
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.HOURS);
                    MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(p.c.f68644a, null, 2, null);
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    o oVar2 = this.f68567a;
                    oVar2.f68639c.addObserver(new c(objectRef2, duration, objectRef3, booleanRef, komponentScope, mutableStateMutableStateOf$default, oVar2));
                    KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new PageModel$komponent$1$2(oVar2, komponentScope, objectRef2, objectRef3, mutableStateMutableStateOf$default, null), 3, (Object) null);
                    return komponentScope.__setContent(new n(new d(komponentScope, objectRef2, oVar2, objectRef3, mutableStateMutableStateOf$default), komponentScope.getContext(), komponentScope, mutableStateMutableStateOf$default, objectRef3, booleanRef, komponentScope, KomponentKt.embedFlow(komponentScope, new Flow<Komponent<? extends Unit>>(SnapshotStateKt.snapshotFlow(new Rd.g(mutableStateMutableStateOf$default, 2)), oVar2, komponentScope, objectRef2, objectRef3, mutableStateMutableStateOf$default) { // from class: com.bilibili.ogv.kmm.operation.page.PageModel$komponent$lambda$0$$inlined$map$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final Flow f68555a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final o f68556b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final KomponentScope f68557c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final Ref.ObjectRef f68558d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final Ref.ObjectRef f68559e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final MutableState f68560f;

                        /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.page.PageModel$komponent$lambda$0$$inlined$map$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$lambda$0$$inlined$map$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f68561a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final o f68562b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final KomponentScope f68563c;

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            public final Ref.ObjectRef f68564d;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            public final Ref.ObjectRef f68565e;

                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                            public final MutableState f68566f;

                            /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.page.PageModel$komponent$lambda$0$$inlined$map$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/PageModel$komponent$lambda$0$$inlined$map$1$2$1.class */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;
                                Object result;
                                final AnonymousClass2 this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                    super(continuation);
                                    this.this$0 = anonymousClass2;
                                }

                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return this.this$0.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, o oVar, KomponentScope komponentScope, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, MutableState mutableState) {
                                this.f68561a = flowCollector;
                                this.f68562b = oVar;
                                this.f68563c = komponentScope;
                                this.f68564d = objectRef;
                                this.f68565e = objectRef2;
                                this.f68566f = mutableState;
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) throws kotlin.NoWhenBranchMatchedException {
                                /*
                                    Method dump skipped, instruction units count: 341
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.kmm.operation.page.PageModel$komponent$lambda$0$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f68555a = flow;
                            this.f68556b = oVar2;
                            this.f68557c = komponentScope;
                            this.f68558d = objectRef2;
                            this.f68559e = objectRef3;
                            this.f68560f = mutableStateMutableStateOf$default;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f68555a.collect(new AnonymousClass2(flowCollector, this.f68556b, this.f68557c, this.f68558d, this.f68559e, this.f68560f), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), objectRef2, oVar2));
                }
            });
            ProvidedValue providedValueProvides = ToasterKt.getLocalToaster().provides(pageModelHolder.getToaster());
            ProvidableCompositionLocal localRouter = RouterKt.getLocalRouter();
            Router.a aVarNewBuilder = GlobalRouterKt.getGlobalRouter().newBuilder();
            aVarNewBuilder.a(Reflection.typeOf(InterfaceC7728a.class), new c50.e(pageModelHolder, 3));
            final List listListOf = CollectionsKt.listOf(new ProvidedValue[]{providedValueProvides, localRouter.provides(aVarNewBuilder.c())});
            return KomponentKt.actIn(Komponent, new kntr.common.trio.vertex.a(pageModelHolder, viewModelStore, listListOf) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$PageModelHolder$init$1$4
                private final CoroutineScope coroutineScope;
                private final Lifecycle lifecycle;
                final BangumiHomeFlowFragmentV5.PageModelHolder this$0;
                private final ViewModelStore viewModelStore;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(listListOf);
                    this.this$0 = pageModelHolder;
                    this.coroutineScope = ViewModelKt.getViewModelScope(pageModelHolder);
                    this.lifecycle = pageModelHolder.getLifecycle();
                    this.viewModelStore = viewModelStore;
                }

                public CoroutineScope getCoroutineScope() {
                    return this.coroutineScope;
                }

                public Lifecycle getLifecycle() {
                    return this.lifecycle;
                }

                public L2.b getNavigationEventDispatcher() {
                    return this.this$0.getNavigationEventDispatcher();
                }

                public ViewModelStore getViewModelStore() {
                    return this.viewModelStore;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InterfaceC5439c init$lambda$0$0(PageModelHolder pageModelHolder, Ref.ObjectRef objectRef, String str, C5440d c5440d) {
            com.bilibili.ogv.operation3.module.operable.delivery.a aVar;
            com.bilibili.ogv.bpf.lifecycle.e uiEnvironmentHolder = pageModelHolder.getUiEnvironmentHolder();
            Lifecycle lifecycle = pageModelHolder.getLifecycle();
            Object obj = objectRef.element;
            if (obj == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pgcAppEventApi");
                aVar = null;
            } else {
                aVar = (com.bilibili.ogv.operation3.module.operable.delivery.a) obj;
            }
            return new j(uiEnvironmentHolder, c5440d, lifecycle, aVar, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit init$lambda$0$1(PageModelHolder pageModelHolder, boolean z6) {
            if (Build.VERSION.SDK_INT >= 34) {
                BuildersKt.launch$default(LifecycleKt.getCoroutineScope(pageModelHolder.getLifecycle()), (CoroutineContext) null, (CoroutineStart) null, new BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1(pageModelHolder, z6, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        public final void init(@NotNull final String str, @NotNull final ViewModelStore viewModelStore) {
            initIfNotInitialized(new Function0(this, str, viewModelStore) { // from class: com.bilibili.ogv.operation2.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BangumiHomeFlowFragmentV5.PageModelHolder f71007a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f71008b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final ViewModelStore f71009c;

                {
                    this.f71007a = this;
                    this.f71008b = str;
                    this.f71009c = viewModelStore;
                }

                public final Object invoke() {
                    return BangumiHomeFlowFragmentV5.PageModelHolder.init$lambda$0(this.f71007a, this.f71008b, this.f71009c);
                }
            });
        }
    }

    public BangumiHomeFlowFragmentV5() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7510invoke() {
                return this.$this_viewModels;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7512invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f70801f = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PageModelHolder.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7513invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m7514invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$4.m7514invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m7515invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$5.m7515invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f70802g = HomeFlowType.BANGUMI.getType();
        this.h = new Mj0.b(this);
        final Function0<Fragment> function03 = new Function0<Fragment>(this) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$6
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m7516invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>(function03) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$7
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function03;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m7517invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function04 = null;
        this.f70803i = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C.class), new Function0<ViewModelStore>(lazy2) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$8
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy2;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m7518invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function04, lazy2) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$9
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function04;
                this.$owner$delegate = lazy2;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m7519invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$9.m7519invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy2) { // from class: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$10
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m7511invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$special$$inlined$viewModels$default$10.m7511invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return android.support.v4.media.a.a("pgc.", jf(), ".0.0.pv");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        if (ListDeviceInfoKt.isHdApp()) {
            bundle.putString("version", "1");
        }
        return bundle;
    }

    public final String jf() {
        return this.f70802g == HomeFlowType.CINEMA.getType() ? "cinema-tab" : "bangumi-tab";
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Integer numC = Fj0.a.c(getArguments(), "home_flow_type", null);
        this.f70802g = numC != null ? numC.intValue() : HomeFlowType.BANGUMI.getType();
        super.onCreate(bundle);
        ((PageModelHolder) this.f70801f.getValue()).init(jf(), getViewModelStore());
        com.bilibili.ogv.bpf.lifecycle.e uiEnvironmentHolder = ((PageModelHolder) this.f70801f.getValue()).getUiEnvironmentHolder();
        LifecycleRegistry lifecycleRegistry = this.h.f16201d;
        uiEnvironmentHolder.getClass();
        uiEnvironmentHolder.f67498a.setValue(new com.bilibili.ogv.bpf.lifecycle.c(requireContext(), lifecycleRegistry, requireActivity().getNavigationEventDispatcher()));
        lifecycleRegistry.addObserver(new com.bilibili.ogv.bpf.lifecycle.d(uiEnvironmentHolder));
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        TargetReachInteractService targetReachInteractService = TargetReachInteractService.f73134a;
        View viewInflate = layoutInflater.inflate(2131501408, viewGroup, false);
        ComposeView composeView = (ComposeView) viewInflate.findViewById(2131317955);
        this.f70798c = viewInflate.findViewById(2131316345);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-345734086, true, new Wy0.f(this, 1)));
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior;
        super.onDestroyView();
        if (!EntryPointKt.getMemleakOptEnable() || (pinnedBottomScrollingBehavior = this.f70799d) == null) {
            return;
        }
        View view = this.f70798c;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipPendantView");
            view2 = null;
        }
        pinnedBottomScrollingBehavior.removePinnedView(view2);
    }

    public final void onNewIntent(@NotNull Intent intent) {
        if (this.f70800e) {
            int iC = com.bilibili.ogv.infra.util.i.c(intent.getStringExtra("vip_task_countdown"));
            String stringExtra = intent.getStringExtra("win_id");
            String str = stringExtra;
            if (stringExtra == null) {
                str = "";
            }
            com.bilibili.ogv.operation2.viptask.a aVar = this.f70797b;
            com.bilibili.ogv.operation2.viptask.a aVar2 = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vipPendantViewHelper");
                aVar2 = null;
            }
            aVar2.c(iC, str);
            String stringExtra2 = intent.getStringExtra("action");
            String str2 = null;
            if (Intrinsics.areEqual(stringExtra2, "refresh")) {
                str2 = stringExtra2;
            }
            if (str2 != null) {
                String stringExtra3 = intent.getStringExtra("request_params");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                if (StringsKt.isBlank(stringExtra3)) {
                    return;
                }
                ((com.bilibili.ogv.kmm.operation.page.a) ((PageModelHolder) this.f70801f.getValue()).getModel().getState()).a(stringExtra3);
            }
        }
    }

    public final void onPageReSelected(@Nullable PageReSelectedParams pageReSelectedParams) {
        ((com.bilibili.ogv.kmm.operation.page.a) ((PageModelHolder) this.f70801f.getValue()).getModel().getState()).a(null);
    }

    public final void onPageSelected(@Nullable Map<String, Object> map) {
    }

    public final void onPageUnselected() {
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.bilibili.ogv.operation2.viptask.a aVar = this.f70797b;
        com.bilibili.ogv.operation2.viptask.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipPendantViewHelper");
            aVar2 = null;
        }
        aVar2.getClass();
        if (Intrinsics.areEqual(BiliContext.topActivity(), ContextUtilKt.requireActivity(aVar2.f71012a.getContext()))) {
            return;
        }
        Job job = aVar2.f71021k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        aVar2.f71012a.setVisibility(8);
        aVar2.h = a.InterfaceC0437a.c.f71024a;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = this.f70798c;
        View view3 = view2;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vipPendantView");
            view3 = null;
        }
        this.f70797b = new com.bilibili.ogv.operation2.viptask.a(view3, jf(), this.h.f16201d);
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorA = Ll0.a.a(view);
        this.f70799d = pinnedBottomScrollingBehaviorA;
        if (pinnedBottomScrollingBehaviorA != null) {
            View view4 = this.f70798c;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vipPendantView");
                view4 = null;
            }
            pinnedBottomScrollingBehaviorA.addPinnedView(view4);
        }
        C c7 = (C) this.f70803i.getValue();
        c7.N0(new com.bilibili.ogv.operation2.inlinevideo.l(this));
        c7.R0(this.f70802g == HomeFlowType.CINEMA.getType() ? "pgc.cinema-tab.0.0" : "pgc.bangumi-tab.0.0");
        c7.Q0(jf());
        c7.O0(new OgvInlineStatusHelper(this.h.f16201d));
        c7.P0(new com.bilibili.ad.adview.videodetail.pausedpage.m(this, 2));
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        Mj0.b bVar = this.h;
        bVar.getClass();
        Lifecycle.State state = z6 ? Lifecycle.State.RESUMED : Lifecycle.State.STARTED;
        bVar.f16200c = state;
        bVar.f16198a.setCurrentState((Lifecycle.State) ComparisonsKt.minOf(bVar.f16199b, state));
        this.f70800e = z6;
    }
}
