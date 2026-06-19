package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.united.page.intro.module.staffs.C6369f;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvStaffsDataModule$provideStaffsData$$inlined$map$1.class */
public final class OgvStaffsDataModule$provideStaffsData$$inlined$map$1 implements Flow<C6369f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvCurrentEpisodeRepository$special$$inlined$map$1 f91332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6369f f91333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f91334c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvStaffsDataModule$provideStaffsData$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvStaffsDataModule$provideStaffsData$$inlined$map$1$2.class */
    public static final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FlowCollector f91335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C6369f f91336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f91337c;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvStaffsDataModule$provideStaffsData$$inlined$map$1$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvStaffsDataModule$provideStaffsData$$inlined$map$1$2$1.class */
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

        public AnonymousClass2(FlowCollector flowCollector, C6369f c6369f, Map map) {
            this.f91335a = flowCollector;
            this.f91336b = c6369f;
            this.f91337c = map;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                Method dump skipped, instruction units count: 436
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvStaffsDataModule$provideStaffsData$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public OgvStaffsDataModule$provideStaffsData$$inlined$map$1(OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1, C6369f c6369f, Map map) {
        this.f91332a = ogvCurrentEpisodeRepository$special$$inlined$map$1;
        this.f91333b = c6369f;
        this.f91334c = map;
    }

    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f91332a.collect(new AnonymousClass2(flowCollector, this.f91333b, this.f91334c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
