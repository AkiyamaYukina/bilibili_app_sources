package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.okretro.ServiceGenerator;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zu0.AbstractC9229g;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment.class */
@StabilityInferred(parameters = 0)
public final class OgvActorInfoFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f92815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f92816c = (e) ServiceGenerator.createService(e.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f92817d = StateFlowKt.MutableStateFlow(12);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f92818e = StateFlowKt.MutableStateFlow(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final d f92819f = new d();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment$onCreateView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$onCreateView$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActorInfoFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment$onCreateView$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$onCreateView$1$1.class */
        public static final class C06971 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final OgvActorInfoFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06971(OgvActorInfoFragment ogvActorInfoFragment, Continuation<? super C06971> continuation) {
                super(2, continuation);
                this.this$0 = ogvActorInfoFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06971 c06971 = new C06971(this.this$0, continuation);
                c06971.I$0 = ((Number) obj).intValue();
                return c06971;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                d dVar = this.this$0.f92819f;
                if (i7 != dVar.f92910c) {
                    dVar.f92910c = i7;
                    dVar.notifyPropertyChanged(285);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvActorInfoFragment ogvActorInfoFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvActorInfoFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvActorInfoFragment ogvActorInfoFragment = this.this$0;
                MutableStateFlow<Integer> mutableStateFlow = ogvActorInfoFragment.f92817d;
                C06971 c06971 = new C06971(ogvActorInfoFragment, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c06971, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment$onCreateView$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$onCreateView$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final GridLayoutManager $layoutManager;
        int label;
        final OgvActorInfoFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment$onCreateView$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$onCreateView$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final GridLayoutManager $layoutManager;
            int I$0;
            int label;
            final OgvActorInfoFragment this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment$onCreateView$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$onCreateView$2$1$a.class */
            public static final class a extends GridLayoutManager.SpanSizeLookup {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvActorInfoFragment f92820a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final GridLayoutManager f92821b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f92822c;

                public a(OgvActorInfoFragment ogvActorInfoFragment, GridLayoutManager gridLayoutManager, int i7) {
                    this.f92820a = ogvActorInfoFragment;
                    this.f92821b = gridLayoutManager;
                    this.f92822c = i7;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public final int getSpanSize(int i7) {
                    Nj0.c cVar = this.f92820a.f92819f.f92908a.get(i7);
                    boolean z6 = cVar instanceof n;
                    GridLayoutManager gridLayoutManager = this.f92821b;
                    int spanCount = (z6 || (cVar instanceof o) || (cVar instanceof p) || (cVar instanceof t) || !(cVar instanceof q)) ? gridLayoutManager.getSpanCount() : this.f92822c;
                    return spanCount;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(GridLayoutManager gridLayoutManager, OgvActorInfoFragment ogvActorInfoFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$layoutManager = gridLayoutManager;
                this.this$0 = ogvActorInfoFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutManager, this.this$0, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                GridLayoutManager gridLayoutManager = this.$layoutManager;
                gridLayoutManager.setSpanSizeLookup(new a(this.this$0, gridLayoutManager, i7));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvActorInfoFragment ogvActorInfoFragment, GridLayoutManager gridLayoutManager, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvActorInfoFragment;
            this.$layoutManager = gridLayoutManager;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$layoutManager, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvActorInfoFragment ogvActorInfoFragment = this.this$0;
                MutableStateFlow<Integer> mutableStateFlow = ogvActorInfoFragment.f92818e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutManager, ogvActorInfoFragment, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/OgvActorInfoFragment$onViewCreated$1.class */
    public static final class C61891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActorInfoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61891(OgvActorInfoFragment ogvActorInfoFragment, Continuation<? super C61891> continuation) {
            super(2, continuation);
            this.this$0 = ogvActorInfoFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C61891(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvActorInfoFragment ogvActorInfoFragment = this.this$0;
                long j7 = ogvActorInfoFragment.f92815b;
                this.label = 1;
                if (OgvActorInfoFragment.jf(ogvActorInfoFragment, j7, this) == coroutine_suspended) {
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
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object jf(com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment r5, long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment.jf(com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object kf(long r10, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1075
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment.kf(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        AbstractC9229g abstractC9229gInflate = AbstractC9229g.inflate(layoutInflater, viewGroup, false);
        abstractC9229gInflate.q(this.f92819f);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 6);
        abstractC9229gInflate.f130706y.setLayoutManager(gridLayoutManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, gridLayoutManager, null), 3, (Object) null);
        return abstractC9229gInflate.getRoot();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment$onViewCreated$2, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f92815b = requireArguments().getLong("roleId");
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new C61891(this, null), 3, (Object) null);
        d dVar = this.f92819f;
        ?? r02 = new RecyclerView.OnScrollListener(this) { // from class: com.bilibili.ship.theseus.ogv.intro.floatlayer.OgvActorInfoFragment.onViewCreated.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvActorInfoFragment f92823a;

            {
                this.f92823a = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                if (recyclerView.canScrollVertically(1)) {
                    return;
                }
                OgvActorInfoFragment ogvActorInfoFragment = this.f92823a;
                if (ogvActorInfoFragment.f92819f.f92913f) {
                    BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ogvActorInfoFragment), (CoroutineContext) null, (CoroutineStart) null, new OgvActorInfoFragment$onViewCreated$2$onScrolled$1(ogvActorInfoFragment, null), 3, (Object) null);
                }
            }
        };
        if (Intrinsics.areEqual((Object) r02, dVar.f92915i)) {
            return;
        }
        dVar.f92915i = r02;
        dVar.notifyPropertyChanged(527);
    }
}
