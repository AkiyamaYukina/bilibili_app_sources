package com.bilibili.ship.theseus.united.page;

import Ps0.C2780a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroFloatingViewService;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.widget.UnitedRecyclerView;
import dv0.F;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment.class */
@StabilityInferred(parameters = 0)
public final class TheseusIntroductionFragment extends androidx_fragment_app_Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final yW0.a f98799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f98801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntroFloatingViewService f98802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public F f98804g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final F $binding;
        int label;
        final TheseusIntroductionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusIntroductionFragment theseusIntroductionFragment, F f7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusIntroductionFragment;
            this.$binding = f7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) this.this$0.f98799b.get();
                UnitedRecyclerView unitedRecyclerView = this.$binding.f116762e;
                this.label = 1;
                if (introRecycleViewService.b(unitedRecyclerView, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final F $binding;
        int label;
        final TheseusIntroductionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusIntroductionFragment theseusIntroductionFragment, F f7, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusIntroductionFragment;
            this.$binding = f7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f98800c;
                FrameLayout frameLayout = this.$binding.f116760c;
                this.label = 1;
                if (theseusFloatLayerService.a(frameLayout, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final F $binding;
        Object L$0;
        Object L$1;
        int label;
        final TheseusIntroductionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(F f7, TheseusIntroductionFragment theseusIntroductionFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = f7;
            this.this$0 = theseusIntroductionFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final F $binding;
        final View $view;
        int label;
        final TheseusIntroductionFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$4, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$4$4.class */
        public static final /* synthetic */ class C09344 extends AdaptedFunctionReference implements Function3<Boolean, Boolean, Continuation<? super Pair<? extends Boolean, ? extends Boolean>>, Object>, SuspendFunction {
            public static final C09344 INSTANCE = new C09344();

            public C09344() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<Boolean, Boolean>>) obj3);
            }

            public final Object invoke(boolean z6, boolean z7, Continuation<? super Pair<Boolean, Boolean>> continuation) {
                return AnonymousClass4.invokeSuspend$lambda$1(z6, z7, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final F f98806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f98807b;

            public a(F f7, View view) {
                this.f98806a = f7;
                this.f98807b = view;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
            public final Object emit(Object obj, Continuation continuation) {
                Pair pair = (Pair) obj;
                boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair.component2()).booleanValue();
                boolean z6 = false;
                this.f98806a.f116759b.setVisibility(!zBooleanValue2 ? 0 : 8);
                View view = this.f98807b;
                if (!zBooleanValue || zBooleanValue2) {
                    z6 = true;
                }
                Iterator it = SequencesKt.take(SequencesKt.b(SequencesKt.mapNotNull(ViewKt.getAncestors(view), (Function1) new Object()), new C2780a(1)), 2).iterator();
                while (it.hasNext()) {
                    ((ViewGroup) it.next()).setClipChildren(z6);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusIntroductionFragment theseusIntroductionFragment, View view, F f7, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusIntroductionFragment;
            this.$view = view;
            this.$binding = f7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$1(boolean z6, boolean z7, Continuation continuation) {
            return new Pair(Boxing.boxBoolean(z6), Boxing.boxBoolean(z7));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$view, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusIntroductionFragment theseusIntroductionFragment = this.this$0;
                View view = this.$view;
                theseusIntroductionFragment.getClass();
                Flow flowCallbackFlow = FlowKt.callbackFlow(new TheseusIntroductionFragment$attachStateFlow$1(view, null));
                final TheseusIntroductionFragment theseusIntroductionFragment2 = this.this$0;
                final StateFlow<WindowSizeClass> stateFlow = theseusIntroductionFragment2.f98803f.f102939c;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(flowCallbackFlow, new Flow<Boolean>(stateFlow, theseusIntroductionFragment2) { // from class: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f98808a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final TheseusIntroductionFragment f98809b;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f98810a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final TheseusIntroductionFragment f98811b;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
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

                        public AnonymousClass2(FlowCollector flowCollector, TheseusIntroductionFragment theseusIntroductionFragment) {
                            this.f98810a = flowCollector;
                            this.f98811b = theseusIntroductionFragment;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L8e
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                androidx.window.core.layout.WindowSizeClass r0 = (androidx.window.core.layout.WindowSizeClass) r0
                                r6 = r0
                                r0 = r5
                                com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment r0 = r0.f98811b
                                com.bilibili.ship.theseus.united.page.screensize.a r0 = r0.f98803f
                                boolean r0 = r0.f()
                                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                                r6 = r0
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f98810a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L8e
                                r0 = r9
                                return r0
                            L8e:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.TheseusIntroductionFragment$onViewCreated$4$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f98808a = stateFlow;
                        this.f98809b = theseusIntroductionFragment2;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f98808a.collect(new AnonymousClass2(flowCollector, this.f98809b), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, C09344.INSTANCE));
                a aVar = new a(this.$binding, this.$view);
                this.label = 1;
                if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public TheseusIntroductionFragment(@NotNull yW0.a aVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @Nullable String str, @NotNull IntroFloatingViewService introFloatingViewService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f98799b = aVar;
        this.f98800c = theseusFloatLayerService;
        this.f98801d = str;
        this.f98802e = introFloatingViewService;
        this.f98803f = aVar2;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        F fInflate = F.inflate(layoutInflater);
        this.f98804g = fInflate;
        fInflate.f116762e.setItemAnimator(null);
        return fInflate.f116758a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f98804g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        F f7 = this.f98804g;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, f7, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, f7, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(f7, this, null), 3, (Object) null);
        String str = this.f98801d;
        if (str == null || str.length() == 0) {
            return;
        }
        f7.f116759b.setTranslationY(-getResources().getDimension(2131167364));
        BiliImageView biliImageView = f7.f116759b;
        biliImageView.setVisibility(0);
        BiliImageLoader.INSTANCE.with(this).url(this.f98801d).into(biliImageView);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        UnitedRecyclerView unitedRecyclerView = f7.f116762e;
        unitedRecyclerView.addOnScrollListener(new e(floatRef, Uj0.c.a(100, unitedRecyclerView.getContext()), biliImageView));
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, view, f7, null), 3, (Object) null);
    }
}
