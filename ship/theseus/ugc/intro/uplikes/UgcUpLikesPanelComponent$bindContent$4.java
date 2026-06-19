package com.bilibili.ship.theseus.ugc.intro.uplikes;

import Vu0.q;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.alipay.alipaysecuritysdk.common.exception.ErrorCode;
import com.bilibili.app.gemini.ui.UIComponentExtKt;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.utils.p;
import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4.class */
final class UgcUpLikesPanelComponent$bindContent$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final q $binding;
    final Context $context;
    private Object L$0;
    int label;
    final UgcUpLikesPanelComponent this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final q $binding;
        int label;
        final UgcUpLikesPanelComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$1$1.class */
        public static final class C08851 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcUpLikesPanelComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08851(UgcUpLikesPanelComponent ugcUpLikesPanelComponent, Continuation<? super C08851> continuation) {
                super(2, continuation);
                this.this$0 = ugcUpLikesPanelComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08851(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UgcUpLikesPanelComponent ugcUpLikesPanelComponent = this.this$0;
                ugcUpLikesPanelComponent.f97644o.tryEmit(new UgcUpLikesPanelComponent.a.d(ugcUpLikesPanelComponent.f97643n));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, UgcUpLikesPanelComponent ugcUpLikesPanelComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$binding = qVar;
            this.this$0 = ugcUpLikesPanelComponent;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$binding, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = UIComponentExtKt.a(this.$binding.f25956d);
                C08851 c08851 = new C08851(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c08851, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final q $binding;
        final Context $context;
        private Object L$0;
        int label;
        final UgcUpLikesPanelComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            final q $binding;
            final Context $context;
            int label;
            final UgcUpLikesPanelComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$2$1$a.class */
            public static final class a extends GridLayoutManager.SpanSizeLookup {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UgcUpLikesPanelComponent f97660a;

                public a(UgcUpLikesPanelComponent ugcUpLikesPanelComponent) {
                    this.f97660a = ugcUpLikesPanelComponent;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public final int getSpanSize(int i7) {
                    int itemViewType = this.f97660a.f97646q.getItemViewType(i7);
                    int i8 = 2;
                    if (itemViewType != 2) {
                        i8 = 1;
                    }
                    return i8;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoroutineScope coroutineScope, UgcUpLikesPanelComponent ugcUpLikesPanelComponent, q qVar, Context context, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$launch = coroutineScope;
                this.this$0 = ugcUpLikesPanelComponent;
                this.$binding = qVar;
                this.$context = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$$this$launch, this.this$0, this.$binding, this.$context, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend(Object obj) {
                RecyclerView.LayoutManager linearLayoutManager;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (CoroutineScopeKt.isActive(this.$$this$launch)) {
                    boolean z6 = this.this$0.f97642m.h() || this.this$0.f97642m.g();
                    RecyclerView recyclerView = this.$binding.f25957e;
                    if (z6) {
                        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.$context, 2);
                        gridLayoutManager.setSpanSizeLookup(new a(this.this$0));
                        linearLayoutManager = gridLayoutManager;
                    } else {
                        linearLayoutManager = new LinearLayoutManager(this.$context);
                    }
                    recyclerView.setLayoutManager(linearLayoutManager);
                    UgcUpLikesPanelComponent.c cVar = this.this$0.f97646q;
                    if (cVar.f97667f != z6) {
                        cVar.f97667f = z6;
                        cVar.notifyDataSetChanged();
                    }
                    if (this.this$0.f97642m.f()) {
                        AppCompatImageView appCompatImageView = this.$binding.f25954b;
                        Lazy lazy = p.f81943a;
                        appCompatImageView.setVisibility(0);
                    } else {
                        AppCompatImageView appCompatImageView2 = this.$binding.f25954b;
                        Lazy lazy2 = p.f81943a;
                        appCompatImageView2.setVisibility(8);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcUpLikesPanelComponent ugcUpLikesPanelComponent, q qVar, Context context, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcUpLikesPanelComponent;
            this.$binding = qVar;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$binding, this.$context, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
                UgcUpLikesPanelComponent ugcUpLikesPanelComponent = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = ugcUpLikesPanelComponent.f97642m.f102939c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coroutineScope, ugcUpLikesPanelComponent, this.$binding, this.$context, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final q $binding;
        int label;
        final UgcUpLikesPanelComponent this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UgcUpLikesPanelComponent.b, Continuation<? super Unit>, Object> {
            final q $binding;
            Object L$0;
            int label;
            final UgcUpLikesPanelComponent this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$3$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f97661a;

                static {
                    int[] iArr = new int[UgcUpLikesPanelComponent.LoadingState.values().length];
                    try {
                        iArr[UgcUpLikesPanelComponent.LoadingState.LOADING.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[UgcUpLikesPanelComponent.LoadingState.EMPTY.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[UgcUpLikesPanelComponent.LoadingState.ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    try {
                        iArr[UgcUpLikesPanelComponent.LoadingState.SUCCEED.ordinal()] = 4;
                    } catch (NoSuchFieldError e10) {
                    }
                    f97661a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(q qVar, UgcUpLikesPanelComponent ugcUpLikesPanelComponent, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = qVar;
                this.this$0 = ugcUpLikesPanelComponent;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(UgcUpLikesPanelComponent.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UgcUpLikesPanelComponent.b bVar = (UgcUpLikesPanelComponent.b) this.L$0;
                defpackage.a.b("[theseus-ugc-UgcUpLikesPanelComponent$bindContent$4$3$1-invokeSuspend] ", "loadingState -> " + bVar, "UgcUpLikesPanelComponent$bindContent$4$3$1-invokeSuspend");
                RecyclerView recyclerView = this.$binding.f25957e;
                Lazy lazy = p.f81943a;
                recyclerView.setVisibility(4);
                UgcUpLikesPanelComponent ugcUpLikesPanelComponent = this.this$0;
                ConstraintLayout constraintLayout = this.$binding.f25953a;
                int i7 = UgcUpLikesPanelComponent.f97640r;
                ugcUpLikesPanelComponent.getClass();
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int iDpToPx = DimenUtilsKt.dpToPx(ErrorCode.E_SIGN_ERROR);
                if (constraintLayout.getMeasuredHeight() >= iDpToPx) {
                    iDpToPx = constraintLayout.getMeasuredHeight();
                }
                layoutParams.height = iDpToPx;
                constraintLayout.setLayoutParams(layoutParams);
                int i8 = a.f97661a[bVar.f97657d.ordinal()];
                boolean z6 = false;
                if (i8 == 1) {
                    UgcUpLikesPanelComponent.m(this.$binding, true, false, false);
                } else if (i8 == 2) {
                    UgcUpLikesPanelComponent ugcUpLikesPanelComponent2 = this.this$0;
                    ConstraintLayout constraintLayout2 = this.$binding.f25953a;
                    ugcUpLikesPanelComponent2.getClass();
                    ViewGroup.LayoutParams layoutParams2 = constraintLayout2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.height = -1;
                    constraintLayout2.setLayoutParams(layoutParams2);
                    UgcUpLikesPanelComponent.m(this.$binding, false, false, true);
                } else if (i8 == 3) {
                    UgcUpLikesPanelComponent.m(this.$binding, false, true, false);
                } else {
                    if (i8 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.$binding.f25957e.setVisibility(0);
                    UgcUpLikesPanelComponent ugcUpLikesPanelComponent3 = this.this$0;
                    ConstraintLayout constraintLayout3 = this.$binding.f25953a;
                    ugcUpLikesPanelComponent3.getClass();
                    ViewGroup.LayoutParams layoutParams3 = constraintLayout3.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams3.height = -1;
                    constraintLayout3.setLayoutParams(layoutParams3);
                    UgcUpLikesPanelComponent.m(this.$binding, false, false, false);
                }
                q qVar = this.$binding;
                TextView textView = qVar.h;
                String str = bVar.f97659f;
                String string = str;
                if (str.length() == 0) {
                    string = qVar.f25953a.getResources().getString(2131837767);
                }
                textView.setText(string);
                UgcUpLikesPanelComponent.c cVar = this.this$0.f97646q;
                List<User> list = bVar.f97654a;
                if (!Intrinsics.areEqual(list, cVar.f97662a)) {
                    cVar.f97662a.clear();
                    cVar.f97666e.clear();
                    cVar.f97662a.addAll(list);
                    if (list.size() >= 100) {
                        z6 = true;
                    }
                    cVar.f97663b = z6;
                    cVar.f97664c = !list.isEmpty();
                    cVar.notifyDataSetChanged();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcUpLikesPanelComponent ugcUpLikesPanelComponent, q qVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcUpLikesPanelComponent;
            this.$binding = qVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcUpLikesPanelComponent ugcUpLikesPanelComponent = this.this$0;
                StateFlow<UgcUpLikesPanelComponent.b> stateFlow = ugcUpLikesPanelComponent.f97641l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, ugcUpLikesPanelComponent, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesPanelComponent$bindContent$4$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesPanelComponent$bindContent$4$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final q $binding;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(q qVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$binding = qVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$binding, continuation);
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
                this.$binding.f25954b.setOnClickListener(null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesPanelComponent$bindContent$4(q qVar, UgcUpLikesPanelComponent ugcUpLikesPanelComponent, Context context, Continuation<? super UgcUpLikesPanelComponent$bindContent$4> continuation) {
        super(2, continuation);
        this.$binding = qVar;
        this.this$0 = ugcUpLikesPanelComponent;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcUpLikesPanelComponent$bindContent$4 ugcUpLikesPanelComponent$bindContent$4 = new UgcUpLikesPanelComponent$bindContent$4(this.$binding, this.this$0, this.$context, continuation);
        ugcUpLikesPanelComponent$bindContent$4.L$0 = obj;
        return ugcUpLikesPanelComponent$bindContent$4;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$binding, this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$binding, this.$context, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$binding, null), 3, (Object) null);
    }
}
