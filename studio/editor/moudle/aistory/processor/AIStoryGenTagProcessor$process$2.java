package com.bilibili.studio.editor.moudle.aistory.processor;

import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryFrameBean;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryProcessorBean;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2.class */
final class AIStoryGenTagProcessor$process$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final AIStoryProcessorBean $bean;
    final Function1<AIStoryProcessorBean, Unit> $onCached;
    final Function1<Result<AIStoryProcessorBean>, Unit> $onNext;
    int label;
    final AIStoryGenTagProcessor this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$process$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends AIStoryFrameBean>>, Continuation<? super Unit>, Object> {
        final List<AIStoryFrameBean> $uploadList;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<AIStoryFrameBean> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$uploadList = list;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$uploadList, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(FlowCollector<? super List<AIStoryFrameBean>> flowCollector, Continuation<? super Unit> continuation) {
            return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                List<AIStoryFrameBean> list = this.$uploadList;
                this.label = 1;
                if (flowCollector.emit(list, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/processor/AIStoryGenTagProcessor$process$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AIStoryGenTagProcessor f105713a;

        public a(AIStoryGenTagProcessor aIStoryGenTagProcessor) {
            this.f105713a = aIStoryGenTagProcessor;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Iterator<T> it = ((List) obj).iterator();
            while (it.hasNext()) {
                AIStoryGenTagProcessor.a(this.f105713a, (AIStoryFrameBean) it.next());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AIStoryGenTagProcessor$process$2(AIStoryProcessorBean aIStoryProcessorBean, AIStoryGenTagProcessor aIStoryGenTagProcessor, Function1<? super AIStoryProcessorBean, Unit> function1, Function1<? super Result<AIStoryProcessorBean>, Unit> function12, Continuation<? super AIStoryGenTagProcessor$process$2> continuation) {
        super(2, continuation);
        this.$bean = aIStoryProcessorBean;
        this.this$0 = aIStoryGenTagProcessor;
        this.$onCached = function1;
        this.$onNext = function12;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIStoryGenTagProcessor$process$2(this.$bean, this.this$0, this.$onCached, this.$onNext, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:62:0x0175, B:64:0x017f, B:13:0x002e, B:33:0x00bf, B:36:0x00ca, B:37:0x00d2, B:37:0x00d2, B:38:0x00d5, B:43:0x0143, B:48:0x0151, B:53:0x015f, B:56:0x0168, B:51:0x015a, B:46:0x014c, B:41:0x013e, B:15:0x0039, B:17:0x0045, B:19:0x0053, B:21:0x0068, B:23:0x0072, B:25:0x007b, B:28:0x008a), top: B:70:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:62:0x0175, B:64:0x017f, B:13:0x002e, B:33:0x00bf, B:36:0x00ca, B:37:0x00d2, B:37:0x00d2, B:38:0x00d5, B:43:0x0143, B:48:0x0151, B:53:0x015f, B:56:0x0168, B:51:0x015a, B:46:0x014c, B:41:0x013e, B:15:0x0039, B:17:0x0045, B:19:0x0053, B:21:0x0068, B:23:0x0072, B:25:0x007b, B:28:0x008a), top: B:70:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:62:0x0175, B:64:0x017f, B:13:0x002e, B:33:0x00bf, B:36:0x00ca, B:37:0x00d2, B:37:0x00d2, B:38:0x00d5, B:43:0x0143, B:48:0x0151, B:53:0x015f, B:56:0x0168, B:51:0x015a, B:46:0x014c, B:41:0x013e, B:15:0x0039, B:17:0x0045, B:19:0x0053, B:21:0x0068, B:23:0x0072, B:25:0x007b, B:28:0x008a), top: B:70:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168 A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:62:0x0175, B:64:0x017f, B:13:0x002e, B:33:0x00bf, B:36:0x00ca, B:37:0x00d2, B:37:0x00d2, B:38:0x00d5, B:43:0x0143, B:48:0x0151, B:53:0x015f, B:56:0x0168, B:51:0x015a, B:46:0x014c, B:41:0x013e, B:15:0x0039, B:17:0x0045, B:19:0x0053, B:21:0x0068, B:23:0x0072, B:25:0x007b, B:28:0x008a), top: B:70:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f A[Catch: Exception -> 0x001f, TRY_LEAVE, TryCatch #0 {Exception -> 0x001f, blocks: (B:8:0x0018, B:62:0x0175, B:64:0x017f, B:13:0x002e, B:33:0x00bf, B:36:0x00ca, B:37:0x00d2, B:37:0x00d2, B:38:0x00d5, B:43:0x0143, B:48:0x0151, B:53:0x015f, B:56:0x0168, B:51:0x015a, B:46:0x014c, B:41:0x013e, B:15:0x0039, B:17:0x0045, B:19:0x0053, B:21:0x0068, B:23:0x0072, B:25:0x007b, B:28:0x008a), top: B:70:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.aistory.processor.AIStoryGenTagProcessor$process$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
