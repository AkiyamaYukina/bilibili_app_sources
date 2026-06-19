package com.bilibili.upper.module.partitionTag.partitiontopicv2;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.FlowLiveDataConversions;
import com.bilibili.upper.api.bean.Child;
import com.bilibili.upper.api.bean.TypeMeta;
import com.bilibili.upper.api.bean.archive.UpperRcmdTagBean;
import com.bilibili.upper.api.bean.topic.UpperPublishTopicBean;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.RecTagResponse;
import com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import zG0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiFragment$reportExposure$2.class */
final class UpperFenquBiaoqianHuatiFragment$reportExposure$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UpperFenquBiaoqianHuatiFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiFragment$reportExposure$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<RecTagResponse, UpperTopicResponse, Continuation<? super Pair<? extends RecTagResponse, ? extends UpperTopicResponse>>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        public final Object invoke(RecTagResponse recTagResponse, UpperTopicResponse upperTopicResponse, Continuation<? super Pair<RecTagResponse, UpperTopicResponse>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = recTagResponse;
            anonymousClass1.L$1 = upperTopicResponse;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return TuplesKt.to((RecTagResponse) this.L$0, (UpperTopicResponse) this.L$1);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiFragment$reportExposure$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Pair<? extends RecTagResponse, ? extends UpperTopicResponse>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UpperFenquBiaoqianHuatiFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = upperFenquBiaoqianHuatiFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence invokeSuspend$lambda$0(UpperRcmdTagBean upperRcmdTagBean) {
            String str = upperRcmdTagBean.tag;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            return str2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(Pair<RecTagResponse, UpperTopicResponse> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        public final Object invokeSuspend(Object obj) {
            String strA;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UpperTopicResponse upperTopicResponse = (UpperTopicResponse) ((Pair) this.L$0).component2();
            AI0.f fVarKf = this.this$0.kf();
            long childTypeId = fVarKf.f246m.getChildTypeId();
            Iterator<T> it = fVarKf.f242i.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    strA = "";
                    break;
                }
                TypeMeta typeMeta = (TypeMeta) it.next();
                List<Child> list = typeMeta.children;
                if (list != null) {
                    for (Child child : list) {
                        if (childTypeId == child.id) {
                            strA = B0.a.a(typeMeta.name, "-", child.name);
                            break loop0;
                        }
                    }
                }
            }
            String str = strA;
            if (strA == null) {
                str = "";
            }
            RecTagResponse recTagResponse = this.this$0.kf().f237c;
            List<UpperRcmdTagBean> data = recTagResponse != null ? recTagResponse.getData() : null;
            List<UpperRcmdTagBean> listEmptyList = data;
            if (data == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String strP = CollectionsKt.p(CollectionsKt.filterNotNull(listEmptyList), ",", (CharSequence) null, (CharSequence) null, (Function1) new Object(), 30);
            long topicId = this.this$0.kf().f246m.getTopicId();
            String topicName = this.this$0.kf().f246m.getTopicName();
            if (topicName == null) {
                topicName = "";
            }
            zG0.a.a.getClass();
            a.a aVar = a.a.a;
            List<UpperPublishTopicBean.Topic> addedSection = upperTopicResponse.getAddedSection();
            List<UpperPublishTopicBean.Topic> listEmptyList2 = addedSection;
            if (addedSection == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment = this.this$0;
            Iterator<UpperPublishTopicBean.Topic> it2 = listEmptyList2.iterator();
            int i7 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i7 = -1;
                    break;
                }
                if (it2.next().topicId == upperFenquBiaoqianHuatiFragment.kf().f246m.getTopicId()) {
                    break;
                }
                i7++;
            }
            zG0.h.k(RangesKt.coerceAtLeast(0, i7), str, strP, String.valueOf(topicId), topicName);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperFenquBiaoqianHuatiFragment$reportExposure$2(UpperFenquBiaoqianHuatiFragment upperFenquBiaoqianHuatiFragment, Continuation<? super UpperFenquBiaoqianHuatiFragment$reportExposure$2> continuation) {
        super(2, continuation);
        this.this$0 = upperFenquBiaoqianHuatiFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperFenquBiaoqianHuatiFragment$reportExposure$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final Flow flowCombine = FlowKt.combine(FlowLiveDataConversions.a(this.this$0.kf().f239e), FlowLiveDataConversions.a(this.this$0.jf().f258d), new AnonymousClass1(null));
            Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(new Flow<Pair<? extends RecTagResponse, ? extends UpperTopicResponse>>(flowCombine) { // from class: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f113910a;

                /* JADX INFO: renamed from: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f113911a;

                    /* JADX INFO: renamed from: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partitiontopicv2/UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1$2$1.class */
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
                        this.f113911a = flowCollector;
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
                            boolean r0 = r0 instanceof com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L29
                            r0 = r7
                            com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                            com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1$2$1
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
                            goto Lbb
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
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            r11 = r0
                            r0 = r11
                            java.lang.Object r0 = r0.component1()
                            com.bilibili.upper.module.partitionTag.partitionTopic.bean.RecTagResponse r0 = (com.bilibili.upper.module.partitionTag.partitionTopic.bean.RecTagResponse) r0
                            r10 = r0
                            r0 = r11
                            java.lang.Object r0 = r0.component2()
                            com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicResponse r0 = (com.bilibili.upper.module.partitionTag.partitionTopic.bean.UpperTopicResponse) r0
                            r11 = r0
                            r0 = r10
                            if (r0 == 0) goto Lbb
                            r0 = r11
                            if (r0 == 0) goto Lbb
                            r0 = r11
                            java.util.List r0 = r0.getAddedSection()
                            r10 = r0
                            r0 = r10
                            if (r0 == 0) goto Lbb
                            r0 = r10
                            java.util.Collection r0 = (java.util.Collection) r0
                            boolean r0 = r0.isEmpty()
                            r1 = 1
                            r0 = r0 ^ r1
                            r1 = 1
                            if (r0 != r1) goto Lbb
                            r0 = r7
                            r1 = 1
                            r0.label = r1
                            r0 = r5
                            kotlinx.coroutines.flow.FlowCollector r0 = r0.f113911a
                            r1 = r6
                            r2 = r7
                            java.lang.Object r0 = r0.emit(r1, r2)
                            r1 = r9
                            if (r0 != r1) goto Lbb
                            r0 = r9
                            return r0
                        Lbb:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.partitionTag.partitiontopicv2.UpperFenquBiaoqianHuatiFragment$reportExposure$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f113910a = flowCombine;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f113910a.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, this.this$0.getViewLifecycleOwner().getLifecycle(), null, 2, null), new AnonymousClass3(this.this$0, null));
            this.label = 1;
            if (FlowKt.collect(flowOnEach, this) == coroutine_suspended) {
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
