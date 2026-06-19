package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.A;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsPanelBottomSheetComponent$bindContent$4.class */
final class StaffsPanelBottomSheetComponent$bindContent$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final AppCompatImageView $close;
    final RecyclerView $recyclerView;
    private Object L$0;
    int label;
    final A this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsPanelBottomSheetComponent$bindContent$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsPanelBottomSheetComponent$bindContent$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AppCompatImageView $close;
        final RecyclerView $recyclerView;
        private Object L$0;
        int label;
        final A this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsPanelBottomSheetComponent$bindContent$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsPanelBottomSheetComponent$bindContent$4$1$1.class */
        public static final class C10591 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            final AppCompatImageView $close;
            final RecyclerView $recyclerView;
            int label;
            final A this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10591(CoroutineScope coroutineScope, A a7, RecyclerView recyclerView, AppCompatImageView appCompatImageView, Continuation<? super C10591> continuation) {
                super(2, continuation);
                this.$$this$launch = coroutineScope;
                this.this$0 = a7;
                this.$recyclerView = recyclerView;
                this.$close = appCompatImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10591(this.$$this$launch, this.this$0, this.$recyclerView, this.$close, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (CoroutineScopeKt.isActive(this.$$this$launch)) {
                    boolean z6 = this.this$0.f101745m.h() || this.this$0.f101745m.g();
                    RecyclerView recyclerView = this.$recyclerView;
                    recyclerView.setLayoutManager(z6 ? new GridLayoutManager(recyclerView.getContext(), 2) : new LinearLayoutManager(recyclerView.getContext()));
                }
                if (this.this$0.f101745m.f()) {
                    this.$close.setVisibility(0);
                } else {
                    this.$close.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(A a7, RecyclerView recyclerView, AppCompatImageView appCompatImageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = a7;
            this.$recyclerView = recyclerView;
            this.$close = appCompatImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$recyclerView, this.$close, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                A a7 = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = a7.f101745m.f102939c;
                C10591 c10591 = new C10591(coroutineScope, a7, this.$recyclerView, this.$close, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10591, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsPanelBottomSheetComponent$bindContent$4$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsPanelBottomSheetComponent$bindContent$4$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final AppCompatImageView $close;
        final RecyclerView $recyclerView;
        int label;
        final A this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RecyclerView recyclerView, A a7, AppCompatImageView appCompatImageView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$recyclerView = recyclerView;
            this.this$0 = a7;
            this.$close = appCompatImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$recyclerView, this.this$0, this.$close, continuation);
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
                this.$recyclerView.setAdapter(null);
                this.$recyclerView.setLayoutManager(null);
                A.a aVar = this.this$0.f101746n;
                List listEmptyList = CollectionsKt.emptyList();
                ((ArrayList) aVar.f101749a).clear();
                List<Staff> list = aVar.f101749a;
                ((ArrayList) list).addAll(listEmptyList);
                this.this$0.f101744l.f101857a.f101826A = null;
                this.$close.setOnClickListener(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsPanelBottomSheetComponent$bindContent$4(A a7, RecyclerView recyclerView, AppCompatImageView appCompatImageView, Continuation<? super StaffsPanelBottomSheetComponent$bindContent$4> continuation) {
        super(2, continuation);
        this.this$0 = a7;
        this.$recyclerView = recyclerView;
        this.$close = appCompatImageView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StaffsPanelBottomSheetComponent$bindContent$4 staffsPanelBottomSheetComponent$bindContent$4 = new StaffsPanelBottomSheetComponent$bindContent$4(this.this$0, this.$recyclerView, this.$close, continuation);
        staffsPanelBottomSheetComponent$bindContent$4.L$0 = obj;
        return staffsPanelBottomSheetComponent$bindContent$4;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$recyclerView, this.$close, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$recyclerView, this.this$0, this.$close, null), 3, (Object) null);
    }
}
