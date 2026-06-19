package com.bilibili.studio.editor.tts;

import OC0.h;
import android.content.Context;
import com.bapis.bilibili.app.home.v1.l;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import com.bilibili.studio.material.util.UtilsKt;
import java.io.File;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2.class */
public final class TtsManager$startLongTts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final g $request;
    private Object L$0;
    int label;
    final TtsManager this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.tts.TtsManager$startLongTts$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Result<? extends Triple<? extends TtsInputBean, ? extends String, ? extends String>>>, Continuation<? super Unit>, Object> {
        final g $request;
        final String $taskId;
        final TtsInputBean $ttsInputBean;
        private Object L$0;
        int label;
        final TtsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TtsManager ttsManager, g gVar, String str, TtsInputBean ttsInputBean, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ttsManager;
            this.$request = gVar;
            this.$taskId = str;
            this.$ttsInputBean = ttsInputBean;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, this.$taskId, this.$ttsInputBean, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(FlowCollector<? super Result<Triple<TtsInputBean, String, String>>> flowCollector, Continuation<? super Unit> continuation) {
            return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.L$0;
                TtsManager ttsManager = this.this$0;
                g gVar = this.$request;
                String str = this.$taskId;
                TtsInputBean ttsInputBean = this.$ttsInputBean;
                this.L$0 = flowCollector;
                this.label = 1;
                Object objC = TtsManager.c(ttsManager, gVar, str, ttsInputBean, this);
                obj2 = objC;
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                Object obj3 = ((Result) obj).unbox-impl();
                flowCollector = flowCollector2;
                obj2 = obj3;
            }
            Result result = Result.box-impl(obj2);
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit(result, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.studio.editor.tts.TtsManager$startLongTts$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends TtsInputBean, ? extends String>>, Throwable, Continuation<? super Unit>, Object> {
        final g $request;
        final long $requestId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(g gVar, long j7, Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
            this.$request = gVar;
            this.$requestId = j7;
        }

        public final Object invoke(FlowCollector<? super Pair<TtsInputBean, String>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$request, this.$requestId, continuation);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$request.f108357g.invoke(Boxing.boxLong(this.$requestId), (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f108330a;

        public a(g gVar) {
            this.f108330a = gVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f108330a.f108356f.invoke(CollectionsKt.listOf((Pair) obj));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$startLongTts$2(g gVar, TtsManager ttsManager, Continuation<? super TtsManager$startLongTts$2> continuation) {
        super(2, continuation);
        this.$request = gVar;
        this.this$0 = ttsManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TtsManager$startLongTts$2 ttsManager$startLongTts$2 = new TtsManager$startLongTts$2(this.$request, this.this$0, continuation);
        ttsManager$startLongTts$2.L$0 = obj;
        return ttsManager$startLongTts$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Long l7 = (Long) this.$request.f108354d.get("request_id");
            long jLongValue = l7 != null ? l7.longValue() : -1L;
            String str = this.$request.f108353c;
            if (str == null || str.length() == 0) {
                this.$request.f108357g.invoke(Boxing.boxLong(jLongValue), new IllegalStateException("longContent isNullOrEmpty"));
                return Unit.INSTANCE;
            }
            String strA = l.a(this.$request.hashCode(), System.currentTimeMillis(), "task_", "_");
            TtsManager ttsManager = this.this$0;
            g gVar = this.$request;
            ttsManager.getClass();
            Object obj2 = gVar.f108354d.get("encode_type");
            Object obj3 = obj2;
            if (obj2 == null) {
                obj3 = "wav";
            }
            StringBuilder sbB = O4.c.b(gVar.hashCode(), System.currentTimeMillis(), "task_", "_");
            sbB.append(UtilsKt.DOT);
            sbB.append(obj3);
            String string = sbB.toString();
            Context context = gVar.f108351a;
            if (h.f17803E == null) {
                h.f17803E = h.y(context, "/tts");
            }
            String str2 = h.f17803E;
            String str3 = File.separator;
            String strA2 = B0.a.a(str2, str3, string);
            StringBuilder sbB2 = O4.c.b(gVar.hashCode(), System.currentTimeMillis(), "task_", "_");
            sbB2.append(".txt");
            String string2 = sbB2.toString();
            Context context2 = gVar.f108351a;
            if (h.f17803E == null) {
                h.f17803E = h.y(context2, "/tts");
            }
            String strA3 = B0.a.a(h.f17803E, str3, string2);
            Long l8 = (Long) gVar.f108354d.get("request_id");
            long jLongValue2 = l8 != null ? l8.longValue() : -1L;
            String str4 = gVar.f108353c;
            String str5 = str4;
            if (str4 == null) {
                str5 = "";
            }
            final TtsInputBean ttsInputBean = new TtsInputBean(strA2, strA3, str5, jLongValue2);
            final Flow flow = FlowKt.flow(new AnonymousClass1(this.this$0, this.$request, strA, ttsInputBean, null));
            final TtsManager ttsManager2 = this.this$0;
            final g gVar2 = this.$request;
            Flow flowCatch = FlowKt.catch(new Flow<Pair<? extends TtsInputBean, ? extends String>>(flow, ttsInputBean, coroutineScope, ttsManager2, gVar2) { // from class: com.bilibili.studio.editor.tts.TtsManager$startLongTts$2$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f108331a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TtsInputBean f108332b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final CoroutineScope f108333c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final TtsManager f108334d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final g f108335e;

                /* JADX INFO: renamed from: com.bilibili.studio.editor.tts.TtsManager$startLongTts$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f108336a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final TtsInputBean f108337b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final CoroutineScope f108338c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final TtsManager f108339d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final g f108340e;

                    /* JADX INFO: renamed from: com.bilibili.studio.editor.tts.TtsManager$startLongTts$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2$invokeSuspend$$inlined$map$1$2$1.class */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        Object L$2;
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

                    public AnonymousClass2(FlowCollector flowCollector, TtsInputBean ttsInputBean, CoroutineScope coroutineScope, TtsManager ttsManager, g gVar) {
                        this.f108336a = flowCollector;
                        this.f108337b = ttsInputBean;
                        this.f108338c = coroutineScope;
                        this.f108339d = ttsManager;
                        this.f108340e = gVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:50:0x01f9  */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x02ec  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 768
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.tts.TtsManager$startLongTts$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f108331a = flow;
                    this.f108332b = ttsInputBean;
                    this.f108333c = coroutineScope;
                    this.f108334d = ttsManager2;
                    this.f108335e = gVar2;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f108331a.collect(new AnonymousClass2(flowCollector, this.f108332b, this.f108333c, this.f108334d, this.f108335e), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, new AnonymousClass3(gVar2, jLongValue, null));
            a aVar = new a(this.$request);
            this.label = 1;
            if (flowCatch.collect(aVar, this) == coroutine_suspended) {
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
