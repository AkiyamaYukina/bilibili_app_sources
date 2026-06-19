package com.bilibili.ship.theseus.united.page.floatlayer;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FragmentUIComponent$bindToView$2.class */
final class FragmentUIComponent$bindToView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Fragment $fragment;
    final UIComponent.b<View> $viewEntry;
    private Object L$0;
    int label;
    final e<Fragment> this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.FragmentUIComponent$bindToView$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FragmentUIComponent$bindToView$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        int label;
        final e<Fragment> this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.FragmentUIComponent$bindToView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FragmentUIComponent$bindToView$2$1$1.class */
        public static final class C09861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Fragment $fragment;
            int label;
            final e<Fragment> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09861(e<Fragment> eVar, Fragment fragment, Continuation<? super C09861> continuation) {
                super(2, continuation);
                this.this$0 = eVar;
                this.$fragment = fragment;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C09861(this.this$0, this.$fragment, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<T, Continuation<? super Unit>, Object> function2 = this.this$0.f99753d;
                    Fragment fragment = this.$fragment;
                    this.label = 1;
                    if (function2.invoke(fragment, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Fragment fragment, e<Fragment> eVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$fragment = fragment;
            this.this$0 = eVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$fragment, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Lifecycle lifecycle = this.$fragment.getLifecycle();
                Lifecycle.State state = Lifecycle.State.CREATED;
                C09861 c09861 = new C09861(this.this$0, this.$fragment, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) c09861, (Continuation<? super Unit>) this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.floatlayer.FragmentUIComponent$bindToView$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/FragmentUIComponent$bindToView$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Fragment $fragment;
        final UIComponent.b<View> $viewEntry;
        int label;
        final e<Fragment> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e<Fragment> eVar, UIComponent.b<View> bVar, Fragment fragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$viewEntry = bVar;
            this.$fragment = fragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$viewEntry, this.$fragment, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f99750a.beginTransaction().add(this.$viewEntry.a.getId(), this.$fragment, (String) null).commitAllowingStateLoss();
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f99750a.beginTransaction().remove(this.$fragment).commitAllowingStateLoss();
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentUIComponent$bindToView$2(e<Fragment> eVar, Fragment fragment, UIComponent.b<View> bVar, Continuation<? super FragmentUIComponent$bindToView$2> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$fragment = fragment;
        this.$viewEntry = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FragmentUIComponent$bindToView$2 fragmentUIComponent$bindToView$2 = new FragmentUIComponent$bindToView$2(this.this$0, this.$fragment, this.$viewEntry, continuation);
        fragmentUIComponent$bindToView$2.L$0 = obj;
        return fragmentUIComponent$bindToView$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        e<Fragment> eVar = this.this$0;
        if (eVar.f99753d != 0) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$fragment, eVar, null), 3, (Object) null);
        }
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$viewEntry, this.$fragment, null), 3, (Object) null);
    }
}
