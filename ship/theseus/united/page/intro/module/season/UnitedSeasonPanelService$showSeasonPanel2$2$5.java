package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$5.class */
final class UnitedSeasonPanelService$showSeasonPanel2$2$5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<UnitedSeasonActivity> $seasonActivityFlow;
    final C6353o $seasonData;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$2$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<UpdateVideoDetailState.CheckInState, Continuation<? super Unit>, Object> {
        final MutableStateFlow<UnitedSeasonActivity> $seasonActivityFlow;
        final C6353o $seasonData;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$2$5$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$5$1$a.class */
        public static final class a extends TypeToken<UnitedSeasonActivity> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6353o c6353o, MutableStateFlow<UnitedSeasonActivity> mutableStateFlow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$seasonData = c6353o;
            this.$seasonActivityFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seasonData, this.$seasonActivityFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(UpdateVideoDetailState.CheckInState checkInState, Continuation<? super Unit> continuation) {
            return create(checkInState, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
        public final Object invokeSuspend(Object obj) {
            Object json;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String activity = ((UpdateVideoDetailState.CheckInState) this.L$0).getActivity();
            if (activity != null) {
                try {
                    json = JsonUtilKt.parseJson(activity, new a().getType());
                } catch (JsonSyntaxException e7) {
                    com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-UnitedSeasonPanelService$showSeasonPanel2$2$5$1-invokeSuspend] ", "safelyParseJson, " + e7, "UnitedSeasonPanelService$showSeasonPanel2$2$5$1-invokeSuspend", (Throwable) null);
                    json = null;
                }
                UnitedSeasonActivity unitedSeasonActivity = (UnitedSeasonActivity) json;
                if (unitedSeasonActivity != null) {
                    UnitedSeasonActivity unitedSeasonActivity2 = this.$seasonData.f101678k;
                    if (unitedSeasonActivity2 != null && unitedSeasonActivity.b() == unitedSeasonActivity2.b()) {
                        this.$seasonData.f101678k = unitedSeasonActivity;
                        this.$seasonActivityFlow.setValue(unitedSeasonActivity);
                    }
                    return Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$2$5(UnitedSeasonPanelService unitedSeasonPanelService, C6353o c6353o, MutableStateFlow<UnitedSeasonActivity> mutableStateFlow, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$2$5> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$seasonData = c6353o;
        this.$seasonActivityFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$2$5(this.this$0, this.$seasonData, this.$seasonActivityFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<UpdateVideoDetailState.CheckInState> sharedFlow = this.this$0.f101595e.f101464n;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$seasonData, this.$seasonActivityFlow, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
