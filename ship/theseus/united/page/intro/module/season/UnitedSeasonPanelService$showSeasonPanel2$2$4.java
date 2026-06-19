package com.bilibili.ship.theseus.united.page.intro.module.season;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$4.class */
final class UnitedSeasonPanelService$showSeasonPanel2$2$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final List<C6353o> $allSeasonData;
    final MutableStateFlow<Long> $currentFlow;
    final Ref.ObjectRef<String> $currentSectionId;
    final C6353o $seasonData;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$2$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
        final List<C6353o> $allSeasonData;
        final MutableStateFlow<Long> $currentFlow;
        final Ref.ObjectRef<String> $currentSectionId;
        final C6353o $seasonData;
        Object L$0;
        int label;
        final UnitedSeasonPanelService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableStateFlow<Long> mutableStateFlow, List<C6353o> list, UnitedSeasonPanelService unitedSeasonPanelService, Ref.ObjectRef<String> objectRef, C6353o c6353o, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentFlow = mutableStateFlow;
            this.$allSeasonData = list;
            this.this$0 = unitedSeasonPanelService;
            this.$currentSectionId = objectRef;
            this.$seasonData = c6353o;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentFlow, this.$allSeasonData, this.this$0, this.$currentSectionId, this.$seasonData, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
            return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$2$4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$2$4(UnitedSeasonPanelService unitedSeasonPanelService, MutableStateFlow<Long> mutableStateFlow, List<C6353o> list, Ref.ObjectRef<String> objectRef, C6353o c6353o, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$2$4> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$currentFlow = mutableStateFlow;
        this.$allSeasonData = list;
        this.$currentSectionId = objectRef;
        this.$seasonData = c6353o;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$2$4(this.this$0, this.$currentFlow, this.$allSeasonData, this.$currentSectionId, this.$seasonData, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UnitedSeasonPanelService unitedSeasonPanelService = this.this$0;
            StateFlow<C7893a.C1318a> stateFlow = unitedSeasonPanelService.f101594d.f123393f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentFlow, this.$allSeasonData, unitedSeasonPanelService, this.$currentSectionId, this.$seasonData, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
