package com.bilibili.ship.theseus.united.page.intro.module.relate.footer;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent;
import com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent$bind$2;
import kotlin.NoWhenBranchMatchedException;
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
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$bind$2.class */
final class DetailFooterComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Context $context;
    final ProgressBar $loading;
    final ConstraintLayout $root;
    final View $space;
    final TextView $text;
    private Object L$0;
    int label;
    final DetailFooterComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent$bind$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$bind$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final ProgressBar $loading;
        final ConstraintLayout $root;
        final TextView $text;
        int label;
        final DetailFooterComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent$bind$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$bind$2$1$1.class */
        public static final class C10461 extends SuspendLambda implements Function2<DetailFooterComponent.FooterType, Continuation<? super Unit>, Object> {
            final Context $context;
            final ProgressBar $loading;
            final ConstraintLayout $root;
            final TextView $text;
            Object L$0;
            int label;
            final DetailFooterComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent$bind$2$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$bind$2$1$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f101196a;

                static {
                    int[] iArr = new int[DetailFooterComponent.FooterType.values().length];
                    try {
                        iArr[DetailFooterComponent.FooterType.None.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[DetailFooterComponent.FooterType.Loading.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[DetailFooterComponent.FooterType.ReachEnd.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    try {
                        iArr[DetailFooterComponent.FooterType.Error.ordinal()] = 4;
                    } catch (NoSuchFieldError e10) {
                    }
                    f101196a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10461(DetailFooterComponent detailFooterComponent, ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView, Context context, Continuation<? super C10461> continuation) {
                super(2, continuation);
                this.this$0 = detailFooterComponent;
                this.$root = constraintLayout;
                this.$loading = progressBar;
                this.$text = textView;
                this.$context = context;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(DetailFooterComponent detailFooterComponent, View view) {
                detailFooterComponent.f101192b.invoke();
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10461 c10461 = new C10461(this.this$0, this.$root, this.$loading, this.$text, this.$context, continuation);
                c10461.L$0 = obj;
                return c10461;
            }

            public final Object invoke(DetailFooterComponent.FooterType footerType, Continuation<? super Unit> continuation) {
                return create(footerType, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = a.f101196a[((DetailFooterComponent.FooterType) this.L$0).ordinal()];
                if (i7 == 1) {
                    DetailFooterComponent detailFooterComponent = this.this$0;
                    DetailFooterComponent.c(detailFooterComponent, this.$root, detailFooterComponent.f101191a.f101195c, NewPlayerUtilsKt.toPx(30.0f), NewPlayerUtilsKt.toPx(90.0f));
                    this.$loading.setVisibility(8);
                    this.$text.setVisibility(8);
                } else if (i7 == 2) {
                    DetailFooterComponent detailFooterComponent2 = this.this$0;
                    DetailFooterComponent.c(detailFooterComponent2, this.$root, detailFooterComponent2.f101191a.f101195c, NewPlayerUtilsKt.toPx(15.0f), NewPlayerUtilsKt.toPx(60.0f));
                    this.$loading.setVisibility(0);
                    this.$text.setVisibility(8);
                } else if (i7 == 3) {
                    DetailFooterComponent detailFooterComponent3 = this.this$0;
                    DetailFooterComponent.c(detailFooterComponent3, this.$root, detailFooterComponent3.f101191a.f101195c, NewPlayerUtilsKt.toPx(15.0f), NewPlayerUtilsKt.toPx(60.0f));
                    this.$loading.setVisibility(8);
                    this.$text.setVisibility(0);
                    this.$text.setText(this.$context.getString(2131847382));
                    this.$text.setOnClickListener(null);
                } else {
                    if (i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DetailFooterComponent detailFooterComponent4 = this.this$0;
                    DetailFooterComponent.c(detailFooterComponent4, this.$root, detailFooterComponent4.f101191a.f101195c, NewPlayerUtilsKt.toPx(15.0f), NewPlayerUtilsKt.toPx(60.0f));
                    this.$loading.setVisibility(8);
                    this.$text.setVisibility(0);
                    TextView textView = this.$text;
                    DetailFooterComponent detailFooterComponent5 = this.this$0;
                    Context context = this.$context;
                    detailFooterComponent5.getClass();
                    String string = context.getString(2131846211);
                    SpannableString spannableString = new SpannableString(string);
                    spannableString.setSpan(new b(context), string.length() - 4, string.length(), 33);
                    textView.setText(spannableString);
                    TextView textView2 = this.$text;
                    final DetailFooterComponent detailFooterComponent6 = this.this$0;
                    textView2.setOnClickListener(new View.OnClickListener(detailFooterComponent6) { // from class: com.bilibili.ship.theseus.united.page.intro.module.relate.footer.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final DetailFooterComponent f101197a;

                        {
                            this.f101197a = detailFooterComponent6;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DetailFooterComponent$bind$2.AnonymousClass1.C10461.invokeSuspend$lambda$0(this.f101197a, view);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DetailFooterComponent detailFooterComponent, ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView, Context context, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = detailFooterComponent;
            this.$root = constraintLayout;
            this.$loading = progressBar;
            this.$text = textView;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$root, this.$loading, this.$text, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                DetailFooterComponent detailFooterComponent = this.this$0;
                StateFlow<DetailFooterComponent.FooterType> stateFlow = detailFooterComponent.f101191a.f101193a;
                C10461 c10461 = new C10461(detailFooterComponent, this.$root, this.$loading, this.$text, this.$context, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10461, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent$bind$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$bind$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final View $space;
        int label;
        final DetailFooterComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.footer.DetailFooterComponent$bind$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/footer/DetailFooterComponent$bind$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
            final View $space;
            float F$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(View view, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$space = view;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$space, continuation);
                anonymousClass1.F$0 = ((Number) obj).floatValue();
                return anonymousClass1;
            }

            public final Object invoke(float f7, Continuation<? super Unit> continuation) {
                return create(Float.valueOf(f7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).floatValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                float f7 = this.F$0;
                View view = this.$space;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = DimenUtilsKt.dpToPx(f7);
                view.setLayoutParams(layoutParams);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DetailFooterComponent detailFooterComponent, View view, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = detailFooterComponent;
            this.$space = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$space, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Float> stateFlow = this.this$0.f101191a.f101194b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$space, null);
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
    public DetailFooterComponent$bind$2(DetailFooterComponent detailFooterComponent, ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView, Context context, View view, Continuation<? super DetailFooterComponent$bind$2> continuation) {
        super(2, continuation);
        this.this$0 = detailFooterComponent;
        this.$root = constraintLayout;
        this.$loading = progressBar;
        this.$text = textView;
        this.$context = context;
        this.$space = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailFooterComponent$bind$2 detailFooterComponent$bind$2 = new DetailFooterComponent$bind$2(this.this$0, this.$root, this.$loading, this.$text, this.$context, this.$space, continuation);
        detailFooterComponent$bind$2.L$0 = obj;
        return detailFooterComponent$bind$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$root, this.$loading, this.$text, this.$context, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$space, null), 3, (Object) null);
    }
}
