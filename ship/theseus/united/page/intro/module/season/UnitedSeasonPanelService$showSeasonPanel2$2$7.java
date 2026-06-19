package com.bilibili.ship.theseus.united.page.intro.module.season;

import com.bilibili.ship.theseus.united.page.videolist.c;
import com.bilibili.ship.theseus.united.page.videolist.m;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$7.class */
final class UnitedSeasonPanelService$showSeasonPanel2$2$7 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final C6353o $seasonData;
    final MutableStateFlow<List<c.a>> $selectsFlow;
    final MutableStateFlow<List<m.a>> $tabsFlow;
    int label;
    final UnitedSeasonPanelService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonPanelService$showSeasonPanel2$2$7$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/UnitedSeasonPanelService$showSeasonPanel2$2$7$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final Ref.BooleanRef $reverse;
        final C6353o $seasonData;
        final MutableStateFlow<List<c.a>> $selectsFlow;
        final MutableStateFlow<List<m.a>> $tabsFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.BooleanRef booleanRef, MutableStateFlow<List<m.a>> mutableStateFlow, C6353o c6353o, MutableStateFlow<List<c.a>> mutableStateFlow2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$reverse = booleanRef;
            this.$tabsFlow = mutableStateFlow;
            this.$seasonData = c6353o;
            this.$selectsFlow = mutableStateFlow2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$reverse, this.$tabsFlow, this.$seasonData, this.$selectsFlow, continuation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.BooleanRef booleanRef = this.$reverse;
            boolean z6 = !booleanRef.element;
            booleanRef.element = z6;
            this.$tabsFlow.setValue(U.b(this.$seasonData, z6));
            this.$selectsFlow.setValue(U.a(this.$seasonData, this.$reverse.element));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedSeasonPanelService$showSeasonPanel2$2$7(UnitedSeasonPanelService unitedSeasonPanelService, MutableStateFlow<List<m.a>> mutableStateFlow, C6353o c6353o, MutableStateFlow<List<c.a>> mutableStateFlow2, Continuation<? super UnitedSeasonPanelService$showSeasonPanel2$2$7> continuation) {
        super(1, continuation);
        this.this$0 = unitedSeasonPanelService;
        this.$tabsFlow = mutableStateFlow;
        this.$seasonData = c6353o;
        this.$selectsFlow = mutableStateFlow2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UnitedSeasonPanelService$showSeasonPanel2$2$7(this.this$0, this.$tabsFlow, this.$seasonData, this.$selectsFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.BooleanRef booleanRefA = androidx.paging.Y.a(obj);
            Flow flowDrop = FlowKt.drop(this.this$0.f101597g.f101701b, 1);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(booleanRefA, this.$tabsFlow, this.$seasonData, this.$selectsFlow, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDrop, anonymousClass1, this) == coroutine_suspended) {
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
