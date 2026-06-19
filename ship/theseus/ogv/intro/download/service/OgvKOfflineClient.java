package com.bilibili.ship.theseus.ogv.intro.download.service;

import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.download.ui.e0;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import video.biz.offline.base.model.entity.OfflineVideoEntity;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvKOfflineClient.class */
@StabilityInferred(parameters = 0)
public final class OgvKOfflineClient implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f92391b = StateFlowKt.MutableStateFlow(new c(0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f92392c = StateFlowKt.MutableStateFlow(0L);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.service.OgvKOfflineClient$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvKOfflineClient$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvKOfflineClient this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.service.OgvKOfflineClient$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvKOfflineClient$1$1.class */
        public static final class C06931 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            long J$0;
            int label;
            final OgvKOfflineClient this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.service.OgvKOfflineClient$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/service/OgvKOfflineClient$1$1$1.class */
            public static final class C06941 extends SuspendLambda implements Function2<List<? extends OfflineVideoEntity>, Continuation<? super Unit>, Object> {
                Object L$0;
                int label;
                final OgvKOfflineClient this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06941(OgvKOfflineClient ogvKOfflineClient, Continuation<? super C06941> continuation) {
                    super(2, continuation);
                    this.this$0 = ogvKOfflineClient;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C06941 c06941 = new C06941(this.this$0, continuation);
                    c06941.L$0 = obj;
                    return c06941;
                }

                public final Object invoke(List<OfflineVideoEntity> list, Continuation<? super Unit> continuation) {
                    return create(list, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object value;
                    c cVar;
                    e0 cVar2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List<OfflineVideoEntity> list = (List) this.L$0;
                    MutableStateFlow<c> mutableStateFlow = this.this$0.f92391b;
                    do {
                        value = mutableStateFlow.getValue();
                        int i7 = 0;
                        cVar = new c(0);
                        HashMap<String, LongSparseArray<b>> map = cVar.f92403a;
                        for (OfflineVideoEntity offlineVideoEntity : list) {
                            String strValueOf = String.valueOf(offlineVideoEntity.e);
                            OfflineVideoEntity.c.b bVarG = offlineVideoEntity.g();
                            if (Intrinsics.areEqual(bVarG, OfflineVideoEntity.c.a.a)) {
                                cVar2 = e0.a.f92550a;
                            } else if (bVarG instanceof OfflineVideoEntity.c.c) {
                                cVar2 = e0.b.f92551a;
                            } else {
                                if (bVarG instanceof OfflineVideoEntity.c.b) {
                                    OfflineVideoEntity.c.b bVar = bVarG;
                                    long j7 = bVar.b;
                                    cVar2 = j7 == 0 ? new e0.c(0) : new e0.c((int) ((bVar.a * ((long) 100)) / j7));
                                } else if (bVarG instanceof OfflineVideoEntity.c.e) {
                                    OfflineVideoEntity.c.e eVar = (OfflineVideoEntity.c.e) bVarG;
                                    long j8 = eVar.b;
                                    cVar2 = j8 == 0 ? new e0.c(0) : new e0.c((int) ((eVar.a * ((long) 100)) / j8));
                                } else {
                                    i7 = 0;
                                    cVar2 = new e0.c(0);
                                }
                                i7 = 0;
                            }
                            long j9 = offlineVideoEntity.f;
                            b bVar2 = new b(strValueOf, j9, cVar2);
                            if (!map.containsKey(strValueOf)) {
                                map.put(strValueOf, new LongSparseArray<>(i7, 1, null));
                            }
                            LongSparseArray<b> longSparseArray = map.get(strValueOf);
                            if (longSparseArray != null) {
                                longSparseArray.put(j9, bVar2);
                            }
                        }
                    } while (!mutableStateFlow.compareAndSet(value, cVar));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06931(OgvKOfflineClient ogvKOfflineClient, Continuation<? super C06931> continuation) {
                super(2, continuation);
                this.this$0 = ogvKOfflineClient;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06931 c06931 = new C06931(this.this$0, continuation);
                c06931.J$0 = ((Number) obj).longValue();
                return c06931;
            }

            public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowM = video.biz.offline.base.facade.b.a.m(this.J$0, "");
                    C06941 c06941 = new C06941(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowM, c06941, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvKOfflineClient ogvKOfflineClient, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvKOfflineClient;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvKOfflineClient ogvKOfflineClient = this.this$0;
                MutableStateFlow<Long> mutableStateFlow = ogvKOfflineClient.f92392c;
                C06931 c06931 = new C06931(ogvKOfflineClient, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c06931, this) == coroutine_suspended) {
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

    public OgvKOfflineClient(@NotNull CoroutineScope coroutineScope) {
        this.f92390a = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    @NotNull
    public final StateFlow<c> a() {
        return FlowKt.asStateFlow(this.f92391b);
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    public final void d(@NotNull String str) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            this.f92392c.setValue(longOrNull);
        }
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    public final boolean e() {
        return true;
    }

    @Override // com.bilibili.ship.theseus.ogv.intro.download.service.d
    public final void g(@NotNull List<a> list) {
        BuildersKt.launch$default(this.f92390a, (CoroutineContext) null, (CoroutineStart) null, new OgvKOfflineClient$startDownload$1(list, null), 3, (Object) null);
    }
}
