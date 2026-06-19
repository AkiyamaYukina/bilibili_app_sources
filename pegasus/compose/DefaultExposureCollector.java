package com.bilibili.pegasus.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/DefaultExposureCollector.class */
@StabilityInferred(parameters = 0)
public final class DefaultExposureCollector implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f77248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<i> f77249b = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f77250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77251d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/DefaultExposureCollector$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DefaultExposureCollector f77252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0<Unit> f77253b;

        public a(DefaultExposureCollector defaultExposureCollector, Function0<Unit> function0) {
            this.f77252a = defaultExposureCollector;
            this.f77253b = function0;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Unit unit;
            DefaultExposureCollector defaultExposureCollector = this.f77252a;
            if (defaultExposureCollector.f77251d) {
                unit = Unit.INSTANCE;
            } else {
                defaultExposureCollector.f77251d = true;
                if (!defaultExposureCollector.f77250c || defaultExposureCollector.f77248a.f77267a) {
                    defaultExposureCollector.f77250c = true;
                    this.f77253b.invoke();
                }
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    public DefaultExposureCollector(@NotNull e eVar) {
        this.f77248a = eVar;
    }

    @Override // com.bilibili.pegasus.compose.f
    @Nullable
    public final Object a(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        this.f77251d = false;
        final MutableStateFlow<i> mutableStateFlow = this.f77249b;
        Object objCollect = FlowKt.filterNotNull(FlowKt.mapLatest(new Flow<Boolean>(mutableStateFlow, this) { // from class: com.bilibili.pegasus.compose.DefaultExposureCollector$start$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f77254a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DefaultExposureCollector f77255b;

            /* JADX INFO: renamed from: com.bilibili.pegasus.compose.DefaultExposureCollector$start$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/DefaultExposureCollector$start$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f77256a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DefaultExposureCollector f77257b;

                /* JADX INFO: renamed from: com.bilibili.pegasus.compose.DefaultExposureCollector$start$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/DefaultExposureCollector$start$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, DefaultExposureCollector defaultExposureCollector) {
                    this.f77256a = flowCollector;
                    this.f77257b = defaultExposureCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 263
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.compose.DefaultExposureCollector$start$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f77254a = mutableStateFlow;
                this.f77255b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation2) {
                Object objCollect2 = this.f77254a.collect(new AnonymousClass2(flowCollector, this.f77255b), continuation2);
                return objCollect2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect2 : Unit.INSTANCE;
            }
        }, new DefaultExposureCollector$start$3(this, null))).collect(new a(this, function0), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    @Override // com.bilibili.pegasus.compose.f
    public final void b(@Nullable i iVar) {
        this.f77249b.setValue(iVar);
    }
}
