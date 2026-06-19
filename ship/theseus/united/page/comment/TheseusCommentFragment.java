package com.bilibili.ship.theseus.united.page.comment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.app.comment3.CommentV3Fragment;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import dv0.C6861e;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentFragment.class */
@StabilityInferred(parameters = 0)
public final class TheseusCommentFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusCommentService f99207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f99208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C6861e f99209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Fragment f99210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final b f99211f = new b(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a f99212g = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentFragment$a.class */
    public static final class a extends FragmentManager.FragmentLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusCommentFragment f99213a;

        public a(TheseusCommentFragment theseusCommentFragment) {
            this.f99213a = theseusCommentFragment;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
            if (fragment instanceof CommentV3Fragment) {
                ((CommentV3Fragment) fragment).setUserVisibleHint(this.f99213a.f99208c);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
            if (fragment instanceof CommentV3Fragment) {
                ((CommentV3Fragment) fragment).setUserVisibleHint(this.f99213a.f99208c);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentFragment$b.class */
    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusCommentFragment f99214a;

        public b(TheseusCommentFragment theseusCommentFragment) {
            this.f99214a = theseusCommentFragment;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            TheseusCommentFragment theseusCommentFragment = this.f99214a;
            theseusCommentFragment.getChildFragmentManager().registerFragmentLifecycleCallbacks(theseusCommentFragment.f99212g, false);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            TheseusCommentFragment theseusCommentFragment = this.f99214a;
            theseusCommentFragment.getChildFragmentManager().unregisterFragmentLifecycleCallbacks(theseusCommentFragment.f99212g);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentFragment$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentFragment$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusCommentFragment this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.comment.TheseusCommentFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentFragment$onViewCreated$1$1.class */
        public static final class C09591 extends SuspendLambda implements Function2<TheseusCommentService.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusCommentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09591(TheseusCommentFragment theseusCommentFragment, Continuation<? super C09591> continuation) {
                super(2, continuation);
                this.this$0 = theseusCommentFragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09591 c09591 = new C09591(this.this$0, continuation);
                c09591.L$0 = obj;
                return c09591;
            }

            public final Object invoke(TheseusCommentService.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TheseusCommentService.a aVar = (TheseusCommentService.a) this.L$0;
                if (aVar instanceof TheseusCommentService.a.c) {
                    TheseusCommentFragment.jf(this.this$0, true);
                } else if (aVar instanceof TheseusCommentService.a.b) {
                    TheseusCommentFragment.jf(this.this$0, false);
                } else {
                    if (!(aVar instanceof TheseusCommentService.a.C0961a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C6861e c6861e = this.this$0.f99209d;
                    C6861e c6861e2 = c6861e;
                    if (c6861e == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6861e2 = null;
                    }
                    c6861e2.f116961d.setVisibility(8);
                    C6861e c6861e3 = this.this$0.f99209d;
                    C6861e c6861e4 = c6861e3;
                    if (c6861e3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6861e4 = null;
                    }
                    c6861e4.f116960c.setVisibility(8);
                    C6861e c6861e5 = this.this$0.f99209d;
                    if (c6861e5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        c6861e5 = null;
                    }
                    c6861e5.f116959b.setVisibility(0);
                    TheseusCommentFragment theseusCommentFragment = this.this$0;
                    TheseusCommentService.a.C0961a c0961a = (TheseusCommentService.a.C0961a) aVar;
                    theseusCommentFragment.f99210e = c0961a.f99257a;
                    if (theseusCommentFragment.isAdded() && !this.this$0.getChildFragmentManager().isDestroyed()) {
                        this.this$0.getChildFragmentManager().beginTransaction().replace(2131299194, c0961a.f99257a, "TheseusDetailCommentFragment").commitNowAllowingStateLoss();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusCommentFragment theseusCommentFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusCommentFragment;
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
                TheseusCommentFragment theseusCommentFragment = this.this$0;
                MutableStateFlow mutableStateFlow = theseusCommentFragment.f99207b.f99218D;
                C09591 c09591 = new C09591(theseusCommentFragment, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c09591, this) == coroutine_suspended) {
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
    public TheseusCommentFragment(@NotNull TheseusCommentService theseusCommentService) {
        this.f99207b = theseusCommentService;
    }

    public static final void jf(TheseusCommentFragment theseusCommentFragment, boolean z6) {
        C6861e c6861e = theseusCommentFragment.f99209d;
        C6861e c6861e2 = c6861e;
        if (c6861e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6861e2 = null;
        }
        c6861e2.f116961d.setVisibility(0);
        C6861e c6861e3 = theseusCommentFragment.f99209d;
        C6861e c6861e4 = c6861e3;
        if (c6861e3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6861e4 = null;
        }
        c6861e4.f116960c.setVisibility(0);
        C6861e c6861e5 = theseusCommentFragment.f99209d;
        C6861e c6861e6 = c6861e5;
        if (c6861e5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6861e6 = null;
        }
        c6861e6.f116959b.setVisibility(8);
        C6861e c6861e7 = theseusCommentFragment.f99209d;
        if (c6861e7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6861e7 = null;
        }
        c6861e7.f116961d.setText(theseusCommentFragment.getString(z6 ? 2131851616 : 2131851583));
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.f99209d = C6861e.inflate(layoutInflater, viewGroup, false);
        getLifecycle().addObserver(this.f99211f);
        C6861e c6861e = this.f99209d;
        C6861e c6861e2 = c6861e;
        if (c6861e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c6861e2 = null;
        }
        return c6861e2.f116958a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getLifecycle().removeObserver(this.f99211f);
        if (EntryPointKt.getMemleakOptEnable()) {
            this.f99210e = null;
        }
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), (CoroutineStart) null, new AnonymousClass1(this, null), 2, (Object) null);
    }

    @Override // com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        super.setUserVisibleCompat(z6);
        this.f99208c = z6;
        Fragment fragment = this.f99210e;
        if (fragment != null) {
            fragment.setUserVisibleHint(z6);
        }
    }
}
