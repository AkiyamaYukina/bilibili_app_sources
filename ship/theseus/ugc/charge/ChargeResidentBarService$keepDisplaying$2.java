package com.bilibili.ship.theseus.ugc.charge;

import Vu0.K;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$keepDisplaying$2.class */
final class ChargeResidentBarService$keepDisplaying$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final K $binding;
    final ResidentBarUIComponent $component;
    final ResidentBar $residentBar;
    private Object L$0;
    int label;
    final ChargeResidentBarService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$keepDisplaying$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$keepDisplaying$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final K $binding;
        final ResidentBarUIComponent $component;
        final ResidentBar $residentBar;
        int label;
        final ChargeResidentBarService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChargeResidentBarService chargeResidentBarService, ResidentBar residentBar, ResidentBarUIComponent residentBarUIComponent, K k7, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chargeResidentBarService;
            this.$residentBar = residentBar;
            this.$component = residentBarUIComponent;
            this.$binding = k7;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$residentBar, this.$component, this.$binding, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChargeResidentBarService chargeResidentBarService = this.this$0;
                ResidentBar residentBar = this.$residentBar;
                chargeResidentBarService.getClass();
                ReportVo reportVoE = residentBar.e();
                if (reportVoE != null) {
                    if (StringsKt.w(reportVoE.d(), "show")) {
                        Map mutableMap = MapsKt.toMutableMap(reportVoE.c());
                        String str = chargeResidentBarService.h.f98946j;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        mutableMap.put("ad_track_id", str2);
                        PageReportService.i(chargeResidentBarService.f96415f, reportVoE.d(), mutableMap, 4);
                    } else {
                        e.a("[theseus-ugc-ChargeResidentBarService-reportResidentBarExposure] ", C4496a.a("eventId should end with show ", reportVoE.b()), "ChargeResidentBarService-reportResidentBarExposure", (Throwable) null);
                    }
                }
                ResidentBarUIComponent residentBarUIComponent = this.$component;
                K k7 = this.$binding;
                this.label = 1;
                if (residentBarUIComponent.a(k7, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$keepDisplaying$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$keepDisplaying$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ResidentBar $residentBar;
        int label;
        final ChargeResidentBarService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.charge.ChargeResidentBarService$keepDisplaying$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$keepDisplaying$2$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ResidentBar f96420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ChargeResidentBarService f96421b;

            public a(ResidentBar residentBar, ChargeResidentBarService chargeResidentBarService) {
                this.f96420a = residentBar;
                this.f96421b = chargeResidentBarService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                ChargeResidentBarService.b(this.f96420a, this.f96421b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChargeResidentBarService chargeResidentBarService, ResidentBar residentBar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chargeResidentBarService;
            this.$residentBar = residentBar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$residentBar, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ChargeResidentBarService chargeResidentBarService = this.this$0;
                SharedFlow<Unit> sharedFlow = chargeResidentBarService.f96412c.f99165s;
                a aVar = new a(this.$residentBar, chargeResidentBarService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeResidentBarService$keepDisplaying$2(ChargeResidentBarService chargeResidentBarService, ResidentBar residentBar, ResidentBarUIComponent residentBarUIComponent, K k7, Continuation<? super ChargeResidentBarService$keepDisplaying$2> continuation) {
        super(2, continuation);
        this.this$0 = chargeResidentBarService;
        this.$residentBar = residentBar;
        this.$component = residentBarUIComponent;
        this.$binding = k7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChargeResidentBarService$keepDisplaying$2 chargeResidentBarService$keepDisplaying$2 = new ChargeResidentBarService$keepDisplaying$2(this.this$0, this.$residentBar, this.$component, this.$binding, continuation);
        chargeResidentBarService$keepDisplaying$2.L$0 = obj;
        return chargeResidentBarService$keepDisplaying$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$residentBar, this.$component, this.$binding, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$residentBar, null), 3, (Object) null);
    }
}
