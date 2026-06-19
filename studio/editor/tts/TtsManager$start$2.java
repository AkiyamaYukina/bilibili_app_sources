package com.bilibili.studio.editor.tts;

import OC0.h;
import android.content.Context;
import com.bilibili.commons.security.DigestUtils;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import com.bilibili.studio.material.util.UtilsKt;
import com.bilibili.studio.videoeditor.extension.CoroutineScopeExtKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$start$2.class */
public final class TtsManager$start$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<Pair<TtsInputBean, String>> $finishList;
    final g $request;
    private Object L$0;
    int label;
    final TtsManager this$0;

    /* JADX INFO: renamed from: com.bilibili.studio.editor.tts.TtsManager$start$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$start$2$3.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$start$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Pair<TtsInputBean, String>> f108320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f108321b;

        public a(List<Pair<TtsInputBean, String>> list, g gVar) {
            this.f108320a = list;
            this.f108321b = gVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f108320a.add((Pair) obj);
            int size = this.f108320a.size();
            g gVar = this.f108321b;
            List<String> list = gVar.f108352b;
            if (size == (list != null ? list.size() : 0)) {
                gVar.f108356f.invoke(this.f108320a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$start$2(TtsManager ttsManager, g gVar, List<Pair<TtsInputBean, String>> list, Continuation<? super TtsManager$start$2> continuation) {
        super(2, continuation);
        this.this$0 = ttsManager;
        this.$request = gVar;
        this.$finishList = list;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TtsManager$start$2 ttsManager$start$2 = new TtsManager$start$2(this.this$0, this.$request, this.$finishList, continuation);
        ttsManager$start$2.L$0 = obj;
        return ttsManager$start$2;
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
            TtsManager ttsManager = this.this$0;
            g gVar = this.$request;
            ttsManager.getClass();
            ArrayList arrayList = new ArrayList();
            Long l7 = (Long) gVar.f108354d.get("request_id");
            long jLongValue = l7 != null ? l7.longValue() : -1L;
            List<String> list = gVar.f108352b;
            if (list != null) {
                int i8 = 0;
                for (Object obj2 : list) {
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj2;
                    Object obj3 = gVar.f108354d.get("encode_type");
                    Object obj4 = obj3;
                    if (obj3 == null) {
                        obj4 = "wav";
                    }
                    String strA = B0.a.a(TtsManager.e(gVar.f108354d), "text=", str);
                    String strMd5 = DigestUtils.md5(strA);
                    BLog.i("TtsManager", "ttsFileName keyMd5=" + strMd5 + ",string=" + strA);
                    String str2 = "task_" + strMd5 + UtilsKt.DOT + obj4;
                    Context context = gVar.f108351a;
                    if (h.f17803E == null) {
                        h.f17803E = h.y(context, "/tts");
                    }
                    arrayList.add(new TtsInputBean(B0.a.a(h.f17803E, File.separator, str2), null, str, jLongValue, 2, null));
                    i8++;
                }
            }
            Long l8 = (Long) this.$request.f108354d.get("request_id");
            long jLongValue2 = l8 != null ? l8.longValue() : -1L;
            ArrayList arrayList2 = new ArrayList();
            TtsManager ttsManager2 = this.this$0;
            g gVar2 = this.$request;
            int i9 = 0;
            for (Object obj5 : arrayList) {
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(new TtsManager$start$2$1$1(i9, ttsManager2, gVar2, (TtsInputBean) obj5, null));
                i9++;
            }
            final Flow flowA = CoroutineScopeExtKt.a(coroutineScope, 3, arrayList2);
            final TtsManager ttsManager3 = this.this$0;
            final g gVar3 = this.$request;
            Flow flowCatch = FlowKt.catch(new Flow<Pair<? extends TtsInputBean, ? extends String>>(flowA, coroutineScope, ttsManager3, gVar3) { // from class: com.bilibili.studio.editor.tts.TtsManager$start$2$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Flow f108322a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CoroutineScope f108323b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final TtsManager f108324c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final g f108325d;

                /* JADX INFO: renamed from: com.bilibili.studio.editor.tts.TtsManager$start$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$start$2$invokeSuspend$$inlined$map$1$2.class */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final FlowCollector f108326a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CoroutineScope f108327b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final TtsManager f108328c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final g f108329d;

                    /* JADX INFO: renamed from: com.bilibili.studio.editor.tts.TtsManager$start$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$start$2$invokeSuspend$$inlined$map$1$2$1.class */
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

                    public AnonymousClass2(FlowCollector flowCollector, CoroutineScope coroutineScope, TtsManager ttsManager, g gVar) {
                        this.f108326a = flowCollector;
                        this.f108327b = coroutineScope;
                        this.f108328c = ttsManager;
                        this.f108329d = gVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 509
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.tts.TtsManager$start$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                {
                    this.f108322a = flowA;
                    this.f108323b = coroutineScope;
                    this.f108324c = ttsManager3;
                    this.f108325d = gVar3;
                }

                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = this.f108322a.collect(new AnonymousClass2(flowCollector, this.f108323b, this.f108324c, this.f108325d), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, new AnonymousClass3(gVar3, jLongValue2, null));
            a aVar = new a(this.$finishList, this.$request);
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
