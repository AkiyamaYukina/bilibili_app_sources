package com.bilibili.ship.theseus.ugc.pages;

import Vu0.w;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.analytics.U;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.ship.theseus.ugc.pages.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesPanelComponent$bind$2.class */
final class UgcPagesPanelComponent$bind$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final w $binding;
    private Object L$0;
    int label;
    final n this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesPanelComponent$bind$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesPanelComponent$bind$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final RecyclerView $recyclerView;
        int label;
        final n this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesPanelComponent$bind$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesPanelComponent$bind$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final GridLayoutManager $layoutManager;
            final RecyclerView $recyclerView;
            Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(GridLayoutManager gridLayoutManager, RecyclerView recyclerView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$layoutManager = gridLayoutManager;
                this.$recyclerView = recyclerView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutManager, this.$recyclerView, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                this.$layoutManager.setSpanCount((com.bilibili.ship.theseus.united.page.screensize.b.c(windowSizeClass) || com.bilibili.ship.theseus.united.page.screensize.b.b(windowSizeClass)) ? 3 : 2);
                RecyclerView.ItemAnimator itemAnimator = this.$recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.endAnimations();
                }
                this.$recyclerView.stopScroll();
                this.$recyclerView.setLayoutManager(this.$layoutManager);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, n nVar, RecyclerView recyclerView, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = nVar;
            this.$recyclerView = recyclerView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$context, this.this$0, this.$recyclerView, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this.$context, 2);
                StateFlow<WindowSizeClass> stateFlow = this.this$0.f98046b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(gridLayoutManager, this.$recyclerView, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesPanelComponent$bind$2$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesPanelComponent$bind$2$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final w $binding;
        int label;
        final n this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesPanelComponent$bind$2$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesPanelComponent$bind$2$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final w $binding;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(w wVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$binding = wVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, continuation);
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
                LinearLayout linearLayout = this.$binding.f25982a;
                int iDpToPx = DimenUtilsKt.dpToPx(i7 - 12);
                linearLayout.setPadding(iDpToPx, linearLayout.getPaddingTop(), iDpToPx, iDpToPx);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(n nVar, w wVar, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = nVar;
            this.$binding = wVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f98047c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$binding, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesPanelComponent$bind$2$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesPanelComponent$bind$2$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TintImageView $close;
        final RecyclerView $recyclerView;
        int label;
        final n this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(RecyclerView recyclerView, n nVar, TintImageView tintImageView, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$recyclerView = recyclerView;
            this.this$0 = nVar;
            this.$close = tintImageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$recyclerView, this.this$0, this.$close, continuation);
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
                n.a aVar = this.this$0.f98048d;
                List listEmptyList = CollectionsKt.emptyList();
                ((ArrayList) aVar.f98049a).clear();
                List<Av0.a> list = aVar.f98049a;
                ((ArrayList) list).addAll(listEmptyList);
                this.this$0.f98048d.f98050b = null;
                this.$close.setOnClickListener(null);
                this.this$0.f98045a.f98016a.f98011n = null;
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesPanelComponent$bind$2$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f97997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RecyclerView f97998b;

        public a(RecyclerView recyclerView, n nVar) {
            this.f97997a = nVar;
            this.f97998b = recyclerView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcPagesPanelComponent$bind$2(w wVar, n nVar, Continuation<? super UgcPagesPanelComponent$bind$2> continuation) {
        super(2, continuation);
        this.$binding = wVar;
        this.this$0 = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$refreshPage(final n nVar, final RecyclerView recyclerView, Av0.a aVar) {
        nVar.f98048d.f98050b = aVar;
        if (recyclerView.isComputingLayout()) {
            recyclerView.post(new Runnable(nVar) { // from class: com.bilibili.ship.theseus.ugc.pages.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final n f98053a;

                {
                    this.f98053a = nVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UgcPagesPanelComponent$bind$2.invokeSuspend$refreshPage$lambda$0(this.f98053a);
                }
            });
        } else {
            nVar.f98048d.notifyDataSetChanged();
        }
        recyclerView.post(new Runnable(recyclerView, nVar) { // from class: com.bilibili.ship.theseus.ugc.pages.p

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RecyclerView f98054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final n f98055b;

            {
                this.f98054a = recyclerView;
                this.f98055b = nVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                UgcPagesPanelComponent$bind$2.invokeSuspend$refreshPage$lambda$1(this.f98054a, this.f98055b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$refreshPage$lambda$0(n nVar) {
        nVar.f98048d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$refreshPage$lambda$1(RecyclerView recyclerView, n nVar) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            n.a aVar = nVar.f98048d;
            Av0.a aVar2 = aVar.f98050b;
            int i7 = 0;
            if (!((ArrayList) aVar.f98049a).isEmpty()) {
                if (aVar2 == null) {
                    i7 = 0;
                } else {
                    int size = ((ArrayList) aVar.f98049a).size();
                    int i8 = 0;
                    while (true) {
                        i7 = 0;
                        if (i8 >= size) {
                            break;
                        }
                        if (((Av0.a) ((ArrayList) aVar.f98049a).get(i8)).f591b == aVar2.f591b) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (Math.abs(i7 - iFindFirstVisibleItemPosition) > 10) {
                recyclerView.scrollToPosition(i7);
            } else {
                recyclerView.smoothScrollToPosition(i7);
            }
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcPagesPanelComponent$bind$2 ugcPagesPanelComponent$bind$2 = new UgcPagesPanelComponent$bind$2(this.$binding, this.this$0, continuation);
        ugcPagesPanelComponent$bind$2.L$0 = obj;
        return ugcPagesPanelComponent$bind$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View$OnClickListener, java.lang.Object] */
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
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Context context = this.$binding.f25982a.getContext();
        w wVar = this.$binding;
        TextView textView = wVar.f25985d;
        RecyclerView recyclerView = wVar.f25984c;
        TintImageView tintImageView = wVar.f25983b;
        recyclerView.setAdapter(this.this$0.f98048d);
        List<Av0.a> list = this.this$0.f98045a.f98016a.f98001c;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        U.a(new Object[]{Boxing.boxInt(list.size())}, 1, context.getString(2131837668), textView);
        n.a aVar = this.this$0.f98048d;
        ((ArrayList) aVar.f98049a).clear();
        ((ArrayList) aVar.f98049a).addAll(list);
        n nVar = this.this$0;
        n.a aVar2 = nVar.f98048d;
        Av0.a aVar3 = nVar.f98045a.f98016a.f98009l;
        aVar2.f98050b = aVar3;
        if (aVar3 != null) {
            invokeSuspend$refreshPage(nVar, recyclerView, aVar3);
        }
        tintImageView.setOnClickListener(new Object());
        n nVar2 = this.this$0;
        nVar2.f98045a.f98016a.f98011n = new a(recyclerView, nVar2);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(context, nVar2, recyclerView, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this.this$0, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(recyclerView, this.this$0, tintImageView, null), 3, (Object) null);
    }
}
