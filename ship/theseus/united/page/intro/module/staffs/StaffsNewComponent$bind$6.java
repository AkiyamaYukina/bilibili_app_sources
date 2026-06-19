package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C3259x;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent$bind$6;
import dv0.C6870i0;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$bind$6.class */
final class StaffsNewComponent$bind$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final TintImageView $arrow;
    final C6870i0 $binding;
    final TextView $title;
    private Object L$0;
    int label;
    final StaffsNewComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent$bind$6$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$bind$6$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TintImageView $arrow;
        final TextView $title;
        int label;
        final StaffsNewComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent$bind$6$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$bind$6$1$1.class */
        public static final class C10581 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final TintImageView $arrow;
            final TextView $title;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10581(TextView textView, TintImageView tintImageView, Continuation<? super C10581> continuation) {
                super(2, continuation);
                this.$title = textView;
                this.$arrow = tintImageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10581 c10581 = new C10581(this.$title, this.$arrow, continuation);
                c10581.I$0 = ((Number) obj).intValue();
                return c10581;
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
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0);
                TextView textView = this.$title;
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.leftMargin = iDpToPx;
                textView.setLayoutParams(marginLayoutParams);
                TintImageView tintImageView = this.$arrow;
                ViewGroup.LayoutParams layoutParams2 = tintImageView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.rightMargin = iDpToPx - DimenUtilsKt.dpToPx(12);
                tintImageView.setLayoutParams(marginLayoutParams2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StaffsNewComponent staffsNewComponent, TextView textView, TintImageView tintImageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = staffsNewComponent;
            this.$title = textView;
            this.$arrow = tintImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$title, this.$arrow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f101802b;
                C10581 c10581 = new C10581(this.$title, this.$arrow, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10581, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent$bind$6$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$bind$6$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final C6870i0 $binding;
        Object L$0;
        int label;
        final StaffsNewComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6870i0 c6870i0, StaffsNewComponent staffsNewComponent, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$binding = c6870i0;
            this.this$0 = staffsNewComponent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(C6870i0 c6870i0, StaffsNewComponent staffsNewComponent, View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            int width = c6870i0.f117017a.getWidth();
            defpackage.a.b("[theseus-united-StaffsNewComponent$bind$6$2-invokeSuspend$lambda$0] ", C3259x.a(width, "StaffsNewComponent onLayoutChange, refreshView, "), "StaffsNewComponent$bind$6$2-invokeSuspend$lambda$0");
            staffsNewComponent.f101811l.setValue(Integer.valueOf(width));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            View.OnLayoutChangeListener onLayoutChangeListener;
            View.OnLayoutChangeListener onLayoutChangeListener2;
            View.OnLayoutChangeListener onLayoutChangeListener3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final C6870i0 c6870i0 = this.$binding;
                final StaffsNewComponent staffsNewComponent = this.this$0;
                onLayoutChangeListener = new View.OnLayoutChangeListener(c6870i0, staffsNewComponent) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.u

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final C6870i0 f101898a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final StaffsNewComponent f101899b;

                    {
                        this.f101898a = c6870i0;
                        this.f101899b = staffsNewComponent;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                        StaffsNewComponent$bind$6.AnonymousClass2.invokeSuspend$lambda$0(this.f101898a, this.f101899b, view, i8, i9, i10, i11, i12, i13, i14, i15);
                    }
                };
                BLog.i("StaffsNewComponent$bind$6$2-invokeSuspend", "[theseus-united-StaffsNewComponent$bind$6$2-invokeSuspend] StaffsNewComponent addOnLayoutChangeListener");
                this.$binding.f117017a.addOnLayoutChangeListener(onLayoutChangeListener);
                try {
                    this.L$0 = onLayoutChangeListener;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    onLayoutChangeListener2 = onLayoutChangeListener;
                    BLog.i("StaffsNewComponent$bind$6$2-invokeSuspend", "[theseus-united-StaffsNewComponent$bind$6$2-invokeSuspend] StaffsNewComponent removeOnLayoutChangeListener");
                    this.$binding.f117017a.removeOnLayoutChangeListener(onLayoutChangeListener2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                View.OnLayoutChangeListener onLayoutChangeListener4 = (View.OnLayoutChangeListener) this.L$0;
                onLayoutChangeListener3 = onLayoutChangeListener4;
                try {
                    ResultKt.throwOnFailure(obj);
                    onLayoutChangeListener = onLayoutChangeListener4;
                } catch (Throwable th2) {
                    onLayoutChangeListener2 = onLayoutChangeListener3;
                    th = th2;
                    BLog.i("StaffsNewComponent$bind$6$2-invokeSuspend", "[theseus-united-StaffsNewComponent$bind$6$2-invokeSuspend] StaffsNewComponent removeOnLayoutChangeListener");
                    this.$binding.f117017a.removeOnLayoutChangeListener(onLayoutChangeListener2);
                    throw th;
                }
            }
            onLayoutChangeListener3 = onLayoutChangeListener;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent$bind$6$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsNewComponent$bind$6$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final StaffsNewComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(StaffsNewComponent staffsNewComponent, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = staffsNewComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                this.this$0.f101801a.f101860a.f101856z = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsNewComponent$bind$6(StaffsNewComponent staffsNewComponent, TextView textView, TintImageView tintImageView, C6870i0 c6870i0, Continuation<? super StaffsNewComponent$bind$6> continuation) {
        super(2, continuation);
        this.this$0 = staffsNewComponent;
        this.$title = textView;
        this.$arrow = tintImageView;
        this.$binding = c6870i0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StaffsNewComponent$bind$6 staffsNewComponent$bind$6 = new StaffsNewComponent$bind$6(this.this$0, this.$title, this.$arrow, this.$binding, continuation);
        staffsNewComponent$bind$6.L$0 = obj;
        return staffsNewComponent$bind$6;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$title, this.$arrow, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$binding, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
    }
}
