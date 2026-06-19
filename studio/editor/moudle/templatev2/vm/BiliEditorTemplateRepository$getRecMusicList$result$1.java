package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$getRecMusicList$result$1.class */
final class BiliEditorTemplateRepository$getRecMusicList$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BiliEditorTemplateRepository.a>, Object> {
    final String $sids;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateRepository$getRecMusicList$result$1(String str, Continuation<? super BiliEditorTemplateRepository$getRecMusicList$result$1> continuation) {
        super(2, continuation);
        this.$sids = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateRepository$getRecMusicList$result$1(this.$sids, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BiliEditorTemplateRepository.a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        BiliEditorTemplateRepository.a aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                final MutableSharedFlow<BiliEditorTemplateRepository.a> mutableSharedFlow = BiliEditorTemplateRepository.f108128d;
                if (mutableSharedFlow != null) {
                    final String str = this.$sids;
                    Flow<BiliEditorTemplateRepository.a> flow = new Flow<BiliEditorTemplateRepository.a>(str, mutableSharedFlow) { // from class: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final MutableSharedFlow f108145a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final String f108146b;

                        /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1$2.class */
                        public static final class AnonymousClass2<T> implements FlowCollector {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final FlowCollector f108147a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f108148b;

                            /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1$2$1.class */
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

                            public AnonymousClass2(FlowCollector flowCollector, String str) {
                                this.f108147a = flowCollector;
                                this.f108148b = str;
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
                                    boolean r0 = r0 instanceof com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                    if (r0 == 0) goto L29
                                    r0 = r7
                                    com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                                    com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1$2$1
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
                                    goto L89
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
                                    com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$a r0 = (com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository.a) r0
                                    r1 = r5
                                    java.lang.String r1 = r1.f108148b
                                    boolean r0 = r0.a(r1)
                                    if (r0 == 0) goto L89
                                    r0 = r7
                                    r1 = 1
                                    r0.label = r1
                                    r0 = r5
                                    kotlinx.coroutines.flow.FlowCollector r0 = r0.f108147a
                                    r1 = r6
                                    r2 = r7
                                    java.lang.Object r0 = r0.emit(r1, r2)
                                    r1 = r10
                                    if (r0 != r1) goto L89
                                    r0 = r10
                                    return r0
                                L89:
                                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$getRecMusicList$result$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }
                        }

                        {
                            this.f108145a = mutableSharedFlow;
                            this.f108146b = str;
                        }

                        public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                            Object objCollect = this.f108145a.collect(new AnonymousClass2(flowCollector, this.f108146b), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object objFirstOrNull = FlowKt.firstOrNull(flow, this);
                    obj = objFirstOrNull;
                    if (objFirstOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    aVar = null;
                }
            } else {
                aVar = new BiliEditorTemplateRepository.a(this.$sids, CollectionsKt.emptyList());
            }
            return aVar;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        aVar = (BiliEditorTemplateRepository.a) obj;
        return aVar;
    }
}
