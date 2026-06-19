package com.bilibili.ship.theseus.united.page.report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.united.page.report.FastPlayDataCheckService;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/FastPlayDataCheckService.class */
@StabilityInferred(parameters = 0)
public final class FastPlayDataCheckService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8043a f102475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f102476c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.report.FastPlayDataCheckService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/FastPlayDataCheckService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FastPlayDataCheckService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FastPlayDataCheckService fastPlayDataCheckService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fastPlayDataCheckService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(boolean z6) {
            return z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = this.this$0.f102476c.f102477a;
            if (StringsKt.isBlank(str)) {
                return Unit.INSTANCE;
            }
            String str2 = (String) ConfigManager.Companion.config().get("videodetail.track_tech_preload_sample", "5");
            Integer intOrNull = StringsKt.toIntOrNull(str2 != null ? str2 : "5");
            final boolean zA = th1.d.a(intOrNull != null ? intOrNull.intValue() : 5);
            HashMap map = new HashMap();
            map.put("from", this.this$0.f102475b.a().f123879a);
            map.put("from_spmid", this.this$0.f102475b.a().f123881c);
            map.put("biz", str);
            Neurons.trackT$default(false, "main.detail.tech.track.preload", map, 0, new Function0(zA) { // from class: com.bilibili.ship.theseus.united.page.report.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final boolean f102494a;

                {
                    this.f102494a = zA;
                }

                public final Object invoke() {
                    return Boolean.valueOf(FastPlayDataCheckService.AnonymousClass1.invokeSuspend$lambda$0(this.f102494a));
                }
            }, 8, (Object) null);
            BLog.i("FastPlayDataCheckService", "report invalid params, " + zA + " " + map);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/FastPlayDataCheckService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f102477a;

        public a(@NotNull String str) {
            this.f102477a = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f102477a, ((a) obj).f102477a);
        }

        public final int hashCode() {
            return this.f102477a.hashCode();
        }

        @NotNull
        public final String toString() {
            return C8770a.a(new StringBuilder("Initial(type="), this.f102477a, ")");
        }
    }

    @Inject
    public FastPlayDataCheckService(@NotNull CoroutineScope coroutineScope, @NotNull C8043a c8043a, @NotNull a aVar) {
        this.f102474a = coroutineScope;
        this.f102475b = c8043a;
        this.f102476c = aVar;
        BuildersKt.launch$default(coroutineScope, Dispatchers.getIO(), (CoroutineStart) null, new AnonymousClass1(this, null), 2, (Object) null);
    }
}
