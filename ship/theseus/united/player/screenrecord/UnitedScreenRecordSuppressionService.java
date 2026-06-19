package com.bilibili.ship.theseus.united.player.screenrecord;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.coroutineextension.j;
import com.bilibili.ship.theseus.united.utils.TheseusPlayContainerXKt;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/screenrecord/UnitedScreenRecordSuppressionService.class */
@StabilityInferred(parameters = 0)
public final class UnitedScreenRecordSuppressionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f104788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f104789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f104790d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.screenrecord.UnitedScreenRecordSuppressionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/screenrecord/UnitedScreenRecordSuppressionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UnitedScreenRecordSuppressionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnitedScreenRecordSuppressionService unitedScreenRecordSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unitedScreenRecordSuppressionService;
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
                UnitedScreenRecordSuppressionService unitedScreenRecordSuppressionService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(FlowKt.combine(TheseusPlayContainerXKt.b(unitedScreenRecordSuppressionService.f104789c), TheseusPlayContainerXKt.a(unitedScreenRecordSuppressionService.f104790d), UnitedScreenRecordSuppressionService$collectScreenRecordState$4.INSTANCE), new UnitedScreenRecordSuppressionService$collectScreenRecordState$5(unitedScreenRecordSuppressionService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.screenrecord.UnitedScreenRecordSuppressionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/screenrecord/UnitedScreenRecordSuppressionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final UnitedScreenRecordSuppressionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.screenrecord.UnitedScreenRecordSuppressionService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/screenrecord/UnitedScreenRecordSuppressionService$2$a.class */
        public static final class a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UnitedScreenRecordSuppressionService f104791a;

            public a(UnitedScreenRecordSuppressionService unitedScreenRecordSuppressionService) {
                this.f104791a = unitedScreenRecordSuppressionService;
            }

            public final void invoke() {
                UnitedScreenRecordSuppressionService.a(this.f104791a, true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UnitedScreenRecordSuppressionService unitedScreenRecordSuppressionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = unitedScreenRecordSuppressionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            j aVar;
            Throwable th;
            j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = new a(this.this$0);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    jVar = aVar;
                    jVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j jVar2 = (j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = jVar2;
                } catch (Throwable th3) {
                    th = th3;
                    jVar.invoke();
                    throw th;
                }
            }
            j jVar3 = aVar;
            jVar = aVar;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public UnitedScreenRecordSuppressionService(@NotNull CoroutineScope coroutineScope, @NotNull Activity activity, @NotNull IControlContainerService iControlContainerService, @NotNull IPlayerSettingService iPlayerSettingService) {
        this.f104787a = coroutineScope;
        this.f104788b = activity;
        this.f104789c = iControlContainerService;
        this.f104790d = iPlayerSettingService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public static final void a(UnitedScreenRecordSuppressionService unitedScreenRecordSuppressionService, boolean z6) {
        Activity activity = unitedScreenRecordSuppressionService.f104788b;
        if (z6) {
            activity.getWindow().clearFlags(8192);
        } else {
            activity.getWindow().addFlags(8192);
        }
    }
}
