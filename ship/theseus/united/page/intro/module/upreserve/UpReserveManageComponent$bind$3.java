package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.lib.theme.R$color;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageComponent$bind$3.class */
final class UpReserveManageComponent$bind$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Context $context;
    final ConstraintLayout $manageGroup;
    final TextView $manageTitle;
    final ImageView $plusIcon;
    final ConstraintLayout $root;
    final TextView $title;
    private Object L$0;
    int label;
    final e this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.upreserve.UpReserveManageComponent$bind$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageComponent$bind$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.upreserve.UpReserveManageComponent$bind$3$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageComponent$bind$3$1$1.class */
        public static final class C10671 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10671(ConstraintLayout constraintLayout, Continuation<? super C10671> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10671 c10671 = new C10671(this.$root, continuation);
                c10671.I$0 = ((Number) obj).intValue();
                return c10671;
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
                ConstraintLayout constraintLayout = this.$root;
                constraintLayout.setPadding(iDpToPx, constraintLayout.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(e eVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$root = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$root, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f101990b;
                C10671 c10671 = new C10671(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10671, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.upreserve.UpReserveManageComponent$bind$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageComponent$bind$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final ConstraintLayout $manageGroup;
        final TextView $manageTitle;
        final ImageView $plusIcon;
        final TextView $title;
        int label;
        final e this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.upreserve.UpReserveManageComponent$bind$3$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageComponent$bind$3$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<d, Continuation<? super Unit>, Object> {
            final Context $context;
            final ConstraintLayout $manageGroup;
            final TextView $manageTitle;
            final ImageView $plusIcon;
            final TextView $title;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ImageView imageView, TextView textView, Context context, TextView textView2, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$plusIcon = imageView;
                this.$title = textView;
                this.$context = context;
                this.$manageTitle = textView2;
                this.$manageGroup = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$plusIcon, this.$title, this.$context, this.$manageTitle, this.$manageGroup, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(d dVar, Continuation<? super Unit> continuation) {
                return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                d dVar = (d) this.L$0;
                if (dVar.f101987d.length() == 0) {
                    this.$plusIcon.setVisibility(8);
                    this.$title.setTextColor(ContextCompat.getColor(this.$context, R$color.Text1));
                    this.$manageTitle.setTextColor(ContextCompat.getColor(this.$context, R$color.Text3));
                    this.$manageGroup.setClickable(false);
                } else if (dVar.f101988e.length() == 0) {
                    this.$plusIcon.setVisibility(8);
                    this.$title.setTextColor(ContextCompat.getColor(this.$context, R$color.Text1));
                    this.$manageTitle.setTextColor(ContextCompat.getColor(this.$context, R$color.Brand_pink));
                    this.$manageGroup.setClickable(true);
                } else {
                    this.$plusIcon.setVisibility(0);
                    this.$title.setTextColor(ContextCompat.getColor(this.$context, R$color.Text2));
                    this.$manageTitle.setTextColor(ContextCompat.getColor(this.$context, R$color.Brand_pink));
                    this.$manageGroup.setClickable(true);
                }
                this.$title.setText(dVar.f101985b);
                this.$manageTitle.setText(dVar.f101986c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(e eVar, ImageView imageView, TextView textView, Context context, TextView textView2, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = eVar;
            this.$plusIcon = imageView;
            this.$title = textView;
            this.$context = context;
            this.$manageTitle = textView2;
            this.$manageGroup = constraintLayout;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$plusIcon, this.$title, this.$context, this.$manageTitle, this.$manageGroup, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<d> stateFlow = this.this$0.f101989a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$plusIcon, this.$title, this.$context, this.$manageTitle, this.$manageGroup, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public UpReserveManageComponent$bind$3(e eVar, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, Context context, TextView textView2, ConstraintLayout constraintLayout2, Continuation<? super UpReserveManageComponent$bind$3> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$root = constraintLayout;
        this.$plusIcon = imageView;
        this.$title = textView;
        this.$context = context;
        this.$manageTitle = textView2;
        this.$manageGroup = constraintLayout2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpReserveManageComponent$bind$3 upReserveManageComponent$bind$3 = new UpReserveManageComponent$bind$3(this.this$0, this.$root, this.$plusIcon, this.$title, this.$context, this.$manageTitle, this.$manageGroup, continuation);
        upReserveManageComponent$bind$3.L$0 = obj;
        return upReserveManageComponent$bind$3;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$plusIcon, this.$title, this.$context, this.$manageTitle, this.$manageGroup, null), 3, (Object) null);
    }
}
