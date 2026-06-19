package com.bilibili.ship.theseus.ugc.pages;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.DimenUtilsKt;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesComponent$bindToView$5.class */
final class UgcPagesComponent$bindToView$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final Context $context;
    final RecyclerView $recyclerView;
    final ConstraintLayout $root;
    private Object L$0;
    int label;
    final k this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesComponent$bindToView$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesComponent$bindToView$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesComponent$bindToView$5$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesComponent$bindToView$5$1$1.class */
        public static final class C09011 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09011(ConstraintLayout constraintLayout, Continuation<? super C09011> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09011 c09011 = new C09011(this.$root, continuation);
                c09011.I$0 = ((Number) obj).intValue();
                return c09011;
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
                int iDpToPx = DimenUtilsKt.dpToPx(this.I$0 - 12);
                ConstraintLayout constraintLayout = this.$root;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), this.$root.getPaddingTop(), iDpToPx, this.$root.getPaddingBottom());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(k kVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
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
                StateFlow<Integer> stateFlow = this.this$0.f98030b;
                C09011 c09011 = new C09011(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c09011, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesComponent$bindToView$5$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesComponent$bindToView$5$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Context $context;
        final RecyclerView $recyclerView;
        int label;
        final k this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesComponent$bindToView$5$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesComponent$bindToView$5$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final Context $context;
            final RecyclerView $recyclerView;
            int I$0;
            Object L$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesComponent$bindToView$5$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesComponent$bindToView$5$2$1$a.class */
            public static final class a extends DividerItemDecoration {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f97995e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f97996f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Context context, int i7, int i8) {
                    super(context, 0);
                    this.f97995e = i7;
                    this.f97996f = i8;
                }

                @Override // androidx.recyclerview.widget.DividerItemDecoration, androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    int itemCount = layoutManager != null ? layoutManager.getItemCount() : 0;
                    rect.left = childAdapterPosition == 0 ? this.f97995e : 0;
                    int i7 = 0;
                    if (childAdapterPosition == itemCount - 1) {
                        i7 = this.f97996f;
                    }
                    rect.right = i7;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecyclerView recyclerView, Context context, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$recyclerView = recyclerView;
                this.$context = context;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$recyclerView, this.$context, continuation);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                a aVar;
                Throwable th;
                a aVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    aVar = new a(this.$context, DimenUtilsKt.dpToPx(this.I$0), DimenUtilsKt.dpToPx(27.0f));
                    aVar.setDrawable(new ColorDrawable(0));
                    this.$recyclerView.addItemDecoration(aVar);
                    try {
                        this.L$0 = aVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        this.$recyclerView.removeItemDecoration(aVar2);
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a aVar3 = (a) this.L$0;
                    aVar2 = aVar3;
                    try {
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar3;
                    } catch (Throwable th3) {
                        th = th3;
                        this.$recyclerView.removeItemDecoration(aVar2);
                        throw th;
                    }
                }
                aVar2 = aVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(k kVar, RecyclerView recyclerView, Context context, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
            this.$recyclerView = recyclerView;
            this.$context = context;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$recyclerView, this.$context, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Integer> stateFlow = this.this$0.f98030b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$recyclerView, this.$context, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.pages.UgcPagesComponent$bindToView$5$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/pages/UgcPagesComponent$bindToView$5$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(k kVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = kVar;
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
                this.this$0.f98029a.f98013a.element = null;
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcPagesComponent$bindToView$5(k kVar, ConstraintLayout constraintLayout, RecyclerView recyclerView, Context context, Continuation<? super UgcPagesComponent$bindToView$5> continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$root = constraintLayout;
        this.$recyclerView = recyclerView;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcPagesComponent$bindToView$5 ugcPagesComponent$bindToView$5 = new UgcPagesComponent$bindToView$5(this.this$0, this.$root, this.$recyclerView, this.$context, continuation);
        ugcPagesComponent$bindToView$5.L$0 = obj;
        return ugcPagesComponent$bindToView$5;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$recyclerView, this.$context, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
    }
}
