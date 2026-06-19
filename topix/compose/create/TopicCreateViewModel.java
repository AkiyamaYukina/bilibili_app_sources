package com.bilibili.topix.compose.create;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.topix.utils.IntervalQuerySubmitter;
import java.lang.Character;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o0.b0;
import o0.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel.class */
@StabilityInferred(parameters = 0)
public final class TopicCreateViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SavedStateHandle f112482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IntervalQuerySubmitter<String> f112483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Job f112484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C> f112485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Flow<C> f112486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Flow<E> f112487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Regex f112488g;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: com.bilibili.topix.compose.create.TopicCreateViewModel$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C1223a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f112489a;

            public C1223a(boolean z6) {
                this.f112489a = z6;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b extends a {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final androidx.compose.ui.text.input.G f112490a;

            public c(@NotNull androidx.compose.ui.text.input.G g7) {
                this.f112490a = g7;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$a$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final androidx.compose.ui.text.input.G f112491a;

            public d(@NotNull androidx.compose.ui.text.input.G g7) {
                this.f112491a = g7;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$a$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final TopicType f112492a;

            public e(@NotNull TopicType topicType) {
                this.f112492a = topicType;
            }
        }
    }

    public TopicCreateViewModel(@NotNull SavedStateHandle savedStateHandle) {
        this.f112482a = savedStateHandle;
        IntervalQuerySubmitter<String> intervalQuerySubmitter = new IntervalQuerySubmitter<>(new TopicCreateViewModel$timer$1(this), ViewModelKt.getViewModelScope(this));
        this.f112483b = intervalQuerySubmitter;
        intervalQuerySubmitter.a();
        MutableStateFlow<C> MutableStateFlow = StateFlowKt.MutableStateFlow(new C(null, null, null, null, false, 255));
        this.f112485d = MutableStateFlow;
        final Flow<C> flowOnEach = FlowKt.onEach(MutableStateFlow, new TopicCreateViewModel$uiState$1(this, null));
        this.f112486e = flowOnEach;
        this.f112487f = FlowKt.distinctUntilChanged(new Flow<E>(flowOnEach) { // from class: com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f112493a;

            /* JADX INFO: renamed from: com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f112494a;

                /* JADX INFO: renamed from: com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$special$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f112494a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1$2$1 r0 = (com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1$2$1 r0 = new com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L83
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        com.bilibili.topix.compose.create.C r0 = (com.bilibili.topix.compose.create.C) r0
                        com.bilibili.topix.compose.create.E r0 = r0.h
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f112494a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L83
                        r0 = r9
                        return r0
                    L83:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.compose.create.TopicCreateViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f112493a = flowOnEach;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f112493a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
        this.f112488g = new Regex("[\\n\\r]");
    }

    public static final androidx.compose.ui.text.input.G I0(final TopicCreateViewModel topicCreateViewModel, androidx.compose.ui.text.input.G g7, double d7) {
        androidx.compose.ui.text.input.G g8;
        topicCreateViewModel.getClass();
        final double dJ0 = J0(g7.f45498a.getText(), false) - d7;
        if (dJ0 <= 0.0d) {
            g8 = g7;
        } else {
            int i7 = b0.f124435c;
            long j7 = g7.f45499b;
            int i8 = (int) (4294967295L & j7);
            AnnotatedString annotatedString = g7.f45498a;
            final AnnotatedString annotatedStringSubSequence = annotatedString.subSequence(0, i8);
            final AnnotatedString annotatedStringSubSequence2 = annotatedString.subSequence(i8, annotatedString.length());
            final double dJ02 = J0(annotatedStringSubSequence, false);
            if (dJ02 > dJ0) {
                Integer num = (Integer) SequencesKt.firstOrNull(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.downTo(annotatedStringSubSequence.length() - 1, 0)), new Function1(topicCreateViewModel, annotatedStringSubSequence, dJ02, dJ0) { // from class: com.bilibili.topix.compose.create.F

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TopicCreateViewModel f112463a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final AnnotatedString f112464b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final double f112465c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final double f112466d;

                    {
                        this.f112463a = topicCreateViewModel;
                        this.f112464b = annotatedStringSubSequence;
                        this.f112465c = dJ02;
                        this.f112466d = dJ0;
                    }

                    public final Object invoke(Object obj) {
                        boolean z6 = false;
                        if (TopicCreateViewModel.K0(this.f112463a, this.f112464b.subSequence(0, ((Integer) obj).intValue())) <= this.f112465c - this.f112466d) {
                            z6 = true;
                        }
                        return Boolean.valueOf(z6);
                    }
                }));
                AnnotatedString annotatedStringSubSequence3 = annotatedStringSubSequence.subSequence(0, num != null ? num.intValue() : 0);
                g8 = new androidx.compose.ui.text.input.G(annotatedStringSubSequence3.plus(annotatedStringSubSequence2), c0.a(RangesKt.coerceIn((int) (j7 >> 32), 0, annotatedStringSubSequence3.length()), RangesKt.coerceIn(i8 - MathKt.roundToInt(dJ0), 0, annotatedStringSubSequence3.length())), (b0) null);
            } else {
                final double dJ03 = J0(annotatedStringSubSequence2, false);
                final double d8 = dJ0 - dJ02;
                Integer num2 = (Integer) SequencesKt.firstOrNull(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.downTo(annotatedStringSubSequence2.length() - 1, 0)), new Function1(topicCreateViewModel, annotatedStringSubSequence2, dJ03, d8) { // from class: com.bilibili.topix.compose.create.G

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TopicCreateViewModel f112467a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final AnnotatedString f112468b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final double f112469c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final double f112470d;

                    {
                        this.f112467a = topicCreateViewModel;
                        this.f112468b = annotatedStringSubSequence2;
                        this.f112469c = dJ03;
                        this.f112470d = d8;
                    }

                    public final Object invoke(Object obj) {
                        boolean z6 = false;
                        if (TopicCreateViewModel.K0(this.f112467a, this.f112468b.subSequence(0, ((Integer) obj).intValue())) <= this.f112469c - this.f112470d) {
                            z6 = true;
                        }
                        return Boolean.valueOf(z6);
                    }
                }));
                g8 = new androidx.compose.ui.text.input.G(annotatedStringSubSequence2.subSequence(0, num2 != null ? num2.intValue() : 0).toString(), 0L, 6);
            }
        }
        return g8;
    }

    public static double J0(CharSequence charSequence, boolean z6) {
        CharSequence charSequenceTrimEnd = charSequence;
        if (z6) {
            charSequenceTrimEnd = charSequence != null ? StringsKt.trimEnd(charSequence) : null;
        }
        double d7 = 0.0d;
        double d8 = 0.0d;
        if (charSequenceTrimEnd != null) {
            int i7 = 0;
            while (true) {
                d8 = d7;
                if (i7 >= charSequenceTrimEnd.length()) {
                    break;
                }
                char cCharAt = charSequenceTrimEnd.charAt(i7);
                double d9 = 1.0d;
                if (cCharAt != '\n') {
                    if (cCharAt == '\r') {
                        d9 = 1.0d;
                    } else {
                        d9 = 1.0d;
                        if (Intrinsics.areEqual(Character.UnicodeBlock.BASIC_LATIN, Character.UnicodeBlock.of(cCharAt))) {
                            d9 = 1.0d;
                            if (!Character.isUpperCase(cCharAt)) {
                                d9 = 0.5d;
                            }
                        }
                    }
                }
                d7 += d9;
                i7++;
            }
        }
        return d8;
    }

    public static /* synthetic */ double K0(TopicCreateViewModel topicCreateViewModel, CharSequence charSequence) {
        topicCreateViewModel.getClass();
        return J0(charSequence, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void L0(@NotNull a aVar) throws NoWhenBranchMatchedException {
        if (aVar instanceof a.d) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new TopicCreateViewModel$updateTopicName$1(this, ((a.d) aVar).f112491a, false, null), 3, (Object) null);
            return;
        }
        if (aVar instanceof a.c) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new TopicCreateViewModel$updateTopicDesc$1(this, ((a.c) aVar).f112490a, null), 3, (Object) null);
            return;
        }
        if (aVar instanceof a.b) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new TopicCreateViewModel$createTopic$1(this, null), 3, (Object) null);
        } else if (aVar instanceof a.e) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new TopicCreateViewModel$setTopicType$1(this, ((a.e) aVar).f112492a, null), 3, (Object) null);
        } else {
            if (!(aVar instanceof a.C1223a)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new TopicCreateViewModel$checkCoCreation$1(this, ((a.C1223a) aVar).f112489a, null), 3, (Object) null);
        }
    }
}
