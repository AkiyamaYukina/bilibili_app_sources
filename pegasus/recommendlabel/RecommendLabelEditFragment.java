package com.bilibili.pegasus.recommendlabel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.app.comm.list.common.widget.PromoToast;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.pegasus.recommendlabel.InterfaceC5739h;
import com.bilibili.pegasus.recommendlabel.InterfaceC5755y;
import com.bilibili.pvtracker.IPvTracker;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelEditFragment.class */
@StabilityInferred(parameters = 0)
public final class RecommendLabelEditFragment extends BaseFragment implements IPvTracker, IBackPress {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KProperty<Object>[] f78623e = {new PropertyReference1Impl(RecommendLabelEditFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliAppFragmentKeywordBlockerBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f78624b = "KeywordBlockerFragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f78625c = ReflectionFragmentViewBindings.viewBindingFragment(this, gl.d.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f78626d;

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelEditFragment$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final RecommendLabelEditFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$onViewCreated$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelEditFragment$onViewCreated$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecommendLabelEditFragment f78627a;

            public a(RecommendLabelEditFragment recommendLabelEditFragment) {
                this.f78627a = recommendLabelEditFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC5755y interfaceC5755y = (InterfaceC5755y) obj;
                boolean z6 = interfaceC5755y instanceof InterfaceC5755y.a;
                RecommendLabelEditFragment recommendLabelEditFragment = this.f78627a;
                if (z6) {
                    PromoToast.showMidToast(recommendLabelEditFragment.requireContext(), ((InterfaceC5755y.a) interfaceC5755y).f78794a);
                } else {
                    BLog.e(recommendLabelEditFragment.f78624b, "unhandled event " + interfaceC5755y);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RecommendLabelEditFragment recommendLabelEditFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = recommendLabelEditFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<InterfaceC5755y> mutableSharedFlow = ((RecommendLabelViewModel) this.this$0.f78626d.getValue()).f78650c;
                a aVar = new a(this.this$0);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelEditFragment$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final RecommendLabelEditFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RecommendLabelEditFragment recommendLabelEditFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = recommendLabelEditFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((RecommendLabelViewModel) this.this$0.f78626d.getValue()).I0(new InterfaceC5739h.e(1));
            return Unit.INSTANCE;
        }
    }

    public RecommendLabelEditFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8186invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8187invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f78626d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RecommendLabelViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8188invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8189invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$special$$inlined$viewModels$default$4.m8189invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8190invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$special$$inlined$viewModels$default$5.m8190invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.recommend-label-set.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("from", null);
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        Op0.e.a(((f0) ((RecommendLabelViewModel) this.f78626d.getValue()).f78649b.getValue()).f78707c);
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return ((gl.d) this.f78625c.getValue(this, f78623e[0])).a;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && (window = fragmentActivityP3.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        ((gl.d) this.f78625c.getValue(this, f78623e[0])).b.setContent(ComposableLambdaKt.composableLambdaInstance(-2139027310, true, new Function2(this) { // from class: com.bilibili.pegasus.recommendlabel.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecommendLabelEditFragment f78744a;

            {
                this.f78744a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                KProperty<Object>[] kPropertyArr = RecommendLabelEditFragment.f78623e;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2139027310, iIntValue, -1, "com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment.onViewCreated.<anonymous> (RecommendLabelEditFragment.kt:41)");
                    }
                    final RecommendLabelEditFragment recommendLabelEditFragment = this.f78744a;
                    final f0 f0Var = (f0) SnapshotStateKt.collectAsState(((RecommendLabelViewModel) recommendLabelEditFragment.f78626d.getValue()).f78649b, null, composer, 0, 1).getValue();
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(100508122, true, new Function2(f0Var, recommendLabelEditFragment) { // from class: com.bilibili.pegasus.recommendlabel.k

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final f0 f78749a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final RecommendLabelEditFragment f78750b;

                        {
                            this.f78749a = f0Var;
                            this.f78750b = recommendLabelEditFragment;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
                            /*
                                r5 = this;
                                r0 = r6
                                androidx.compose.runtime.Composer r0 = (androidx.compose.runtime.Composer) r0
                                r10 = r0
                                r0 = r7
                                java.lang.Integer r0 = (java.lang.Integer) r0
                                int r0 = r0.intValue()
                                r8 = r0
                                kotlin.reflect.KProperty<java.lang.Object>[] r0 = com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment.f78623e
                                r6 = r0
                                r0 = r8
                                r1 = 3
                                r0 = r0 & r1
                                r1 = 2
                                if (r0 == r1) goto L1f
                                r0 = 1
                                r9 = r0
                                goto L22
                            L1f:
                                r0 = 0
                                r9 = r0
                            L22:
                                r0 = r10
                                r1 = r9
                                r2 = 1
                                r3 = r8
                                r2 = r2 & r3
                                boolean r0 = r0.shouldExecute(r1, r2)
                                if (r0 == 0) goto La3
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L40
                                r0 = 100508122(0x5fda1da, float:2.385146E-35)
                                r1 = r8
                                r2 = -1
                                java.lang.String r3 = "com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment.onViewCreated.<anonymous>.<anonymous> (RecommendLabelEditFragment.kt:43)"
                                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                            L40:
                                r0 = r5
                                com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment r0 = r0.f78750b
                                kotlin.Lazy r0 = r0.f78626d
                                java.lang.Object r0 = r0.getValue()
                                com.bilibili.pegasus.recommendlabel.RecommendLabelViewModel r0 = (com.bilibili.pegasus.recommendlabel.RecommendLabelViewModel) r0
                                r11 = r0
                                r0 = r10
                                r1 = r11
                                boolean r0 = r0.changedInstance(r1)
                                r9 = r0
                                r0 = r10
                                java.lang.Object r0 = r0.rememberedValue()
                                r7 = r0
                                r0 = r9
                                if (r0 != 0) goto L75
                                r0 = r7
                                r6 = r0
                                r0 = r7
                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                                java.lang.Object r1 = r1.getEmpty()
                                if (r0 != r1) goto L87
                            L75:
                                com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$onViewCreated$1$1$1$1 r0 = new com.bilibili.pegasus.recommendlabel.RecommendLabelEditFragment$onViewCreated$1$1$1$1
                                r1 = r0
                                r2 = r11
                                r1.<init>(r2)
                                r6 = r0
                                r0 = r10
                                r1 = r6
                                r0.updateRememberedValue(r1)
                            L87:
                                r0 = r6
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                r6 = r0
                                r0 = r5
                                com.bilibili.pegasus.recommendlabel.f0 r0 = r0.f78749a
                                r1 = r6
                                r2 = r10
                                r3 = 0
                                com.bilibili.pegasus.recommendlabel.C5754x.e(r0, r1, r2, r3)
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto Laa
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                goto Laa
                            La3:
                                r0 = r10
                                r0.skipToGroupEnd()
                            Laa:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.recommendlabel.C5742k.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        super.onViewCreated(view, bundle);
    }
}
