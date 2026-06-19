package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.framework.exposure.core.ExposureLayoutInfoReceiver;
import com.bilibili.framework.exposure.core.collecter.ViewExposureLayoutInfoCollectorKt;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.m;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5.class */
final class UgcHeadlineComponent$bindToView$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final ImageView $arrow;
    final Vu0.y $binding;
    final ConstraintLayout $root;
    final ExpandableTextView $title;
    private Object L$0;
    int label;
    final m this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineComponent$bindToView$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        int label;
        final m this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineComponent$bindToView$5$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5$1$1.class */
        public static final class C08531 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            final ConstraintLayout $root;
            int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08531(ConstraintLayout constraintLayout, Continuation<? super C08531> continuation) {
                super(2, continuation);
                this.$root = constraintLayout;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08531 c08531 = new C08531(this.$root, continuation);
                c08531.I$0 = ((Number) obj).intValue();
                return c08531;
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
        public AnonymousClass1(m mVar, ConstraintLayout constraintLayout, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mVar;
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
                StateFlow<Integer> stateFlow = this.this$0.f97356d;
                C08531 c08531 = new C08531(this.$root, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08531, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineComponent$bindToView$5$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ImageView $arrow;
        final ExpandableTextView $title;
        int label;
        final m this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineComponent$bindToView$5$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<m.a, Continuation<? super Unit>, Object> {
            final ImageView $arrow;
            final ExpandableTextView $title;
            Object L$0;
            int label;
            final m this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExpandableTextView expandableTextView, m mVar, ImageView imageView, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$title = expandableTextView;
                this.this$0 = mVar;
                this.$arrow = imageView;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$title, this.this$0, this.$arrow, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(m.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                m.a aVar = (m.a) this.L$0;
                if (aVar.f97365a) {
                    this.$title.M();
                } else {
                    this.$title.Q();
                }
                m mVar = this.this$0;
                boolean z6 = mVar.f97359g;
                boolean z7 = aVar.f97365a;
                boolean z8 = aVar.f97366b;
                boolean z9 = aVar.f97367c;
                if (z8 != z6 || z9 != mVar.h) {
                    mVar.f97359g = z8;
                    mVar.h = z9;
                    if (z7) {
                        this.$title.expand();
                    } else {
                        this.$title.P();
                    }
                }
                this.this$0.f97362k = z7;
                ImageView imageView = this.$arrow;
                if (z9 || z8) {
                    imageView.setRotation(z7 ? 180.0f : 0.0f);
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
                AX.g.b(imageView, z7 ? "收起简介" : "展开更多");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(m mVar, ExpandableTextView expandableTextView, ImageView imageView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = mVar;
            this.$title = expandableTextView;
            this.$arrow = imageView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$title, this.$arrow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                m mVar = this.this$0;
                Flow<m.a> flow = mVar.f97354b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$title, mVar, this.$arrow, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineComponent$bindToView$5$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Vu0.y $binding;
        int label;
        final m this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Vu0.y yVar, m mVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$binding = yVar;
            this.this$0 = mVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$binding, this.this$0, continuation);
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
                    ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f25991a, this.this$0.f97364m);
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
                ViewExposureLayoutInfoCollectorKt.setExposureLayoutInfoReceiver(this.$binding.f25991a, (ExposureLayoutInfoReceiver) null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineComponent$bindToView$5$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ConstraintLayout $root;
        final ExpandableTextView $title;
        Object L$0;
        int label;
        final m this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcheadline.UgcHeadlineComponent$bindToView$5$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcHeadlineComponent$bindToView$5$4$a.class */
        public static final class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ConstraintLayout f97235a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final m f97236b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ExpandableTextView f97237c;

            public a(ConstraintLayout constraintLayout, m mVar, ExpandableTextView expandableTextView) {
                this.f97235a = constraintLayout;
                this.f97236b = mVar;
                this.f97237c = expandableTextView;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                int i15 = i9 - i7;
                int i16 = i13 - i11;
                if (i15 == i16 || i16 <= i15) {
                    return;
                }
                defpackage.a.b("[theseus-ugc-UgcHeadlineComponent$bindToView$5$4$listener$1-onLayoutChange] ", G.f.a(i16, i15, "Title width changed: ", " -> "), "UgcHeadlineComponent$bindToView$5$4$listener$1-onLayoutChange");
                this.f97235a.post(new O2.d(1, this.f97236b, this.f97237c));
                this.f97235a.removeOnLayoutChangeListener(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(m mVar, ConstraintLayout constraintLayout, ExpandableTextView expandableTextView, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = mVar;
            this.$root = constraintLayout;
            this.$title = expandableTextView;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$root, this.$title, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            Throwable th;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                m mVar = this.this$0;
                if (!mVar.f97357e.f97255e) {
                    return Unit.INSTANCE;
                }
                ConstraintLayout constraintLayout = this.$root;
                aVar = new a(constraintLayout, mVar, this.$title);
                constraintLayout.addOnLayoutChangeListener(aVar);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    this.$root.removeOnLayoutChangeListener(aVar2);
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
                    this.$root.removeOnLayoutChangeListener(aVar2);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcHeadlineComponent$bindToView$5(m mVar, ConstraintLayout constraintLayout, ExpandableTextView expandableTextView, ImageView imageView, Vu0.y yVar, Continuation<? super UgcHeadlineComponent$bindToView$5> continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$root = constraintLayout;
        this.$title = expandableTextView;
        this.$arrow = imageView;
        this.$binding = yVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcHeadlineComponent$bindToView$5 ugcHeadlineComponent$bindToView$5 = new UgcHeadlineComponent$bindToView$5(this.this$0, this.$root, this.$title, this.$arrow, this.$binding, continuation);
        ugcHeadlineComponent$bindToView$5.L$0 = obj;
        return ugcHeadlineComponent$bindToView$5;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$title, this.$arrow, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$binding, this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$root, this.$title, null), 3, (Object) null);
    }
}
