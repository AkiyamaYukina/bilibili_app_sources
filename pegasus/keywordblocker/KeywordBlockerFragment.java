package com.bilibili.pegasus.keywordblocker;

import android.content.Intent;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.base.viewbinding.ViewBindingProperty;
import com.bilibili.base.viewbinding.full.CreateMethod;
import com.bilibili.base.viewbinding.full.ReflectionFragmentViewBindings;
import com.bilibili.base.viewbinding.internal.UtilsKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.pegasus.kmm.keywordblocker.KeywordBlockPageStatus;
import com.bilibili.pegasus.kmm.keywordblocker.b;
import com.bilibili.pegasus.kmm.keywordblocker.c;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerFragment.class */
@StabilityInferred(parameters = 0)
public final class KeywordBlockerFragment extends BaseFragment implements IPvTracker, IBackPress {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KProperty<Object>[] f78197f = {new PropertyReference1Impl(KeywordBlockerFragment.class, "binding", "getBinding()Lcom/bilibili/app/pegasus/databinding/BiliAppFragmentKeywordBlockerBinding;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f78198b = "KeywordBlockerFragment";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewBindingProperty f78199c = ReflectionFragmentViewBindings.viewBindingFragment(this, gl.d.class, CreateMethod.INFLATE, UtilsKt.emptyVbCallback());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f78200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f78201e;

    /* JADX INFO: renamed from: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerFragment$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final KeywordBlockerFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$onViewCreated$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/keywordblocker/KeywordBlockerFragment$onViewCreated$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KeywordBlockerFragment f78202a;

            public a(KeywordBlockerFragment keywordBlockerFragment) {
                this.f78202a = keywordBlockerFragment;
            }

            public final Object emit(Object obj, Continuation continuation) {
                com.bilibili.pegasus.kmm.keywordblocker.c cVar = (com.bilibili.pegasus.kmm.keywordblocker.c) obj;
                boolean z6 = cVar instanceof c.a;
                KeywordBlockerFragment keywordBlockerFragment = this.f78202a;
                if (z6) {
                    ToastHelper.showToastShort(keywordBlockerFragment.requireContext(), ((c.a) cVar).f78260a);
                } else {
                    BLog.d(keywordBlockerFragment.f78198b, "unhandled event " + cVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(KeywordBlockerFragment keywordBlockerFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = keywordBlockerFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                MutableSharedFlow<com.bilibili.pegasus.kmm.keywordblocker.c> mutableSharedFlow = this.this$0.jf().f78206d;
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

    public KeywordBlockerFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m8146invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m8147invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f78200d = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(KeywordBlockerViewModel.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m8148invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$special$$inlined$viewModels$default$4
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
            public final androidx.lifecycle.viewmodel.CreationExtras m8149invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$special$$inlined$viewModels$default$4.m8149invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$special$$inlined$viewModels$default$5
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
            public final androidx.lifecycle.ViewModelProvider.Factory m8150invoke() {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$special$$inlined$viewModels$default$5.m8150invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "main.recommend-shield.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        bundle.putString("from", this.f78201e);
        return bundle;
    }

    @NotNull
    public final KeywordBlockerViewModel jf() {
        return (KeywordBlockerViewModel) this.f78200d.getValue();
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        boolean z6;
        KeywordBlockPageStatus keywordBlockPageStatus = ((com.bilibili.pegasus.kmm.keywordblocker.d) jf().f78205c.getValue()).f78262b;
        if (keywordBlockPageStatus == KeywordBlockPageStatus.Adding || keywordBlockPageStatus == KeywordBlockPageStatus.AddingEmpty) {
            jf().I0(b.d.f78255a);
            z6 = true;
        } else {
            z6 = false;
        }
        return z6;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Intent intent;
        Bundle extras;
        Bundle bundle2;
        String string;
        super.onCreate(bundle);
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 == null || (intent = fragmentActivityP3.getIntent()) == null || (extras = intent.getExtras()) == null || (bundle2 = extras.getBundle("fragment_args")) == null || (string = bundle2.getString("from")) == null) {
            return;
        }
        this.f78201e = string;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return ((gl.d) this.f78199c.getValue(this, f78197f[0])).a;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && (window = fragmentActivityP3.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        ViewBindingProperty viewBindingProperty = this.f78199c;
        KProperty<Object>[] kPropertyArr = f78197f;
        ((gl.d) viewBindingProperty.getValue(this, kPropertyArr[0])).b.setContent(ComposableLambdaKt.composableLambdaInstance(727901019, true, new Function2(this) { // from class: com.bilibili.pegasus.keywordblocker.o

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KeywordBlockerFragment f78242a;

            {
                this.f78242a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                KProperty<Object>[] kPropertyArr2 = KeywordBlockerFragment.f78197f;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(727901019, iIntValue, -1, "com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment.onViewCreated.<anonymous> (KeywordBlockerFragment.kt:56)");
                    }
                    final KeywordBlockerFragment keywordBlockerFragment = this.f78242a;
                    final com.bilibili.pegasus.kmm.keywordblocker.d dVar = (com.bilibili.pegasus.kmm.keywordblocker.d) SnapshotStateKt.collectAsState(keywordBlockerFragment.jf().f78205c, null, composer, 0, 1).getValue();
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(496059555, true, new Function2(dVar, keywordBlockerFragment) { // from class: com.bilibili.pegasus.keywordblocker.r

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final com.bilibili.pegasus.kmm.keywordblocker.d f78246a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final KeywordBlockerFragment f78247b;

                        {
                            this.f78246a = dVar;
                            this.f78247b = keywordBlockerFragment;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
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
                                kotlin.reflect.KProperty<java.lang.Object>[] r0 = com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment.f78197f
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
                                if (r0 == 0) goto L9b
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L40
                                r0 = 496059555(0x1d9144a3, float:3.845215E-21)
                                r1 = r8
                                r2 = -1
                                java.lang.String r3 = "com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment.onViewCreated.<anonymous>.<anonymous> (KeywordBlockerFragment.kt:58)"
                                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r1, r2, r3)
                            L40:
                                r0 = r5
                                com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment r0 = r0.f78247b
                                com.bilibili.pegasus.keywordblocker.KeywordBlockerViewModel r0 = r0.jf()
                                r11 = r0
                                r0 = r10
                                r1 = r11
                                boolean r0 = r0.changedInstance(r1)
                                r9 = r0
                                r0 = r10
                                java.lang.Object r0 = r0.rememberedValue()
                                r7 = r0
                                r0 = r9
                                if (r0 != 0) goto L6d
                                r0 = r7
                                r6 = r0
                                r0 = r7
                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
                                java.lang.Object r1 = r1.getEmpty()
                                if (r0 != r1) goto L7f
                            L6d:
                                com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$onViewCreated$1$1$1$1 r0 = new com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment$onViewCreated$1$1$1$1
                                r1 = r0
                                r2 = r11
                                r1.<init>(r2)
                                r6 = r0
                                r0 = r10
                                r1 = r6
                                r0.updateRememberedValue(r1)
                            L7f:
                                r0 = r6
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                r6 = r0
                                r0 = r5
                                com.bilibili.pegasus.kmm.keywordblocker.d r0 = r0.f78246a
                                r1 = r6
                                r2 = r10
                                r3 = 0
                                com.bilibili.pegasus.keywordblocker.k.a(r0, r1, r2, r3)
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto La2
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                goto La2
                            L9b:
                                r0 = r10
                                r0.skipToGroupEnd()
                            La2:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.keywordblocker.r.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
        ((gl.d) this.f78199c.getValue(this, kPropertyArr[0])).c.setContent(ComposableLambdaKt.composableLambdaInstance(-798381820, true, new Function2(this) { // from class: com.bilibili.pegasus.keywordblocker.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final KeywordBlockerFragment f78243a;

            {
                this.f78243a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                KProperty<Object>[] kPropertyArr2 = KeywordBlockerFragment.f78197f;
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-798381820, iIntValue, -1, "com.bilibili.pegasus.keywordblocker.KeywordBlockerFragment.onViewCreated.<anonymous> (KeywordBlockerFragment.kt:62)");
                    }
                    final KeywordBlockerFragment keywordBlockerFragment = this.f78243a;
                    final com.bilibili.pegasus.kmm.keywordblocker.d dVar = (com.bilibili.pegasus.kmm.keywordblocker.d) SnapshotStateKt.collectAsState(keywordBlockerFragment.jf().f78205c, null, composer, 0, 1).getValue();
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-259729332, true, new Function2(dVar, keywordBlockerFragment) { // from class: com.bilibili.pegasus.keywordblocker.q

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final com.bilibili.pegasus.kmm.keywordblocker.d f78244a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final KeywordBlockerFragment f78245b;

                        {
                            this.f78244a = dVar;
                            this.f78245b = keywordBlockerFragment;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
                            /*
                                Method dump skipped, instruction units count: 226
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.keywordblocker.q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        super.onViewCreated(view, bundle);
    }
}
