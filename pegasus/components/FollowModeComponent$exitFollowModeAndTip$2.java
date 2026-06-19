package com.bilibili.pegasus.components;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.droid.StringFormatter;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.google.android.material.snackbar.Snackbar;
import java.util.LinkedHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$exitFollowModeAndTip$2.class */
final class FollowModeComponent$exitFollowModeAndTip$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final View $suitableParent;
    private Object L$0;
    int label;
    final FollowModeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowModeComponent$exitFollowModeAndTip$2(FollowModeComponent followModeComponent, View view, Continuation<? super FollowModeComponent$exitFollowModeAndTip$2> continuation) {
        super(2, continuation);
        this.this$0 = followModeComponent;
        this.$suitableParent = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FollowModeComponent$exitFollowModeAndTip$2 followModeComponent$exitFollowModeAndTip$2 = new FollowModeComponent$exitFollowModeAndTip$2(this.this$0, this.$suitableParent, continuation);
        followModeComponent$exitFollowModeAndTip$2.L$0 = obj;
        return followModeComponent$exitFollowModeAndTip$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            final StateFlow pageVisibleStateFlow = this.this$0.getPageVisibleStateFlow();
            Flow<Boolean> flow = new Flow<Boolean>(pageVisibleStateFlow) { // from class: com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final StateFlow f75780a;

                /* JADX INFO: renamed from: com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f75781a;

                    /* JADX INFO: renamed from: com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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
                        this.f75781a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1$2$1
                            r1 = r0
                            r2 = r5
                            r3 = r7
                            r1.<init>(r2, r3)
                            r7 = r0
                        L33:
                            r0 = r7
                            java.lang.Object r0 = r0.result
                            r9 = r0
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            r10 = r0
                            r0 = r7
                            int r0 = r0.label
                            r8 = r0
                            r0 = r8
                            if (r0 == 0) goto L5e
                            r0 = r8
                            r1 = 1
                            if (r0 != r1) goto L54
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L85
                        L54:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            r1 = r0
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r1.<init>(r2)
                            throw r0
                        L5e:
                            r0 = r9
                            kotlin.ResultKt.throwOnFailure(r0)
                            r0 = r6
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 == 0) goto L85
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f75781a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r10
                            if (r0 != r1) goto L85
                            r0 = r10
                            return r0
                        L85:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.components.FollowModeComponent$exitFollowModeAndTip$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f75780a = pageVisibleStateFlow;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f75780a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            this.L$0 = coroutineScope;
            this.label = 1;
            if (FlowKt.first(flow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        CoroutineScopeKt.ensureActive(coroutineScope);
        final Snackbar snackbarMake = Snackbar.make(this.$suitableParent, "", -2);
        Snackbar.SnackbarLayout view = snackbarMake.getView();
        view.setPadding(0, 0, 0, 0);
        view.removeAllViews();
        view.setBackgroundColor(0);
        View viewInflate = LayoutInflater.from(this.this$0.getContext()).inflate(2131498407, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = view.getResources().getDimensionPixelSize(2131166100);
        view.setLayoutParams(marginLayoutParams);
        view.addView(viewInflate);
        ((TintTextView) view.findViewById(2131308958)).setText(StringFormatter.format(this.this$0.getRequireContext().getString(2131845173), new Object[]{(String) ((LinkedHashMap) Lh.n.a()).get("recommend_pegasus_settint_key_title_follow")}));
        ((TintTextView) view.findViewById(2131299190)).setText(StringFormatter.format(this.this$0.getRequireContext().getString(2131845365), new Object[]{(String) ((LinkedHashMap) Lh.n.a()).get("recommend_pegasus_settint_key_title_normal")}));
        ((TintTextView) view.findViewById(2131297728)).setOnClickListener(new View.OnClickListener(snackbarMake) { // from class: com.bilibili.pegasus.components.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Snackbar f77245a;

            {
                this.f77245a = snackbarMake;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f77245a.dismiss();
            }
        });
        snackbarMake.show();
        return Unit.INSTANCE;
    }
}
