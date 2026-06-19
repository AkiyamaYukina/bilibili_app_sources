package com.bilibili.playerbizcommonv2.widget.setting;

import com.bapis.bilibili.community.service.dm.v1.SubtitleItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import tv.danmaku.biliplayerv2.service.interact.biz.ISubtitleChangedObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1.class */
final class PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
    final Ref.BooleanRef $disable;
    final int $switchCircleColor;
    final int $switchOffRectColor;
    final int $switchOnRectColor;
    int label;
    final PlayerSettingFunctionWidget2 this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
        final Ref.BooleanRef $disable;
        final int $switchCircleColor;
        final int $switchOffRectColor;
        final int $switchOnRectColor;
        private Object L$0;
        int label;
        final PlayerSettingFunctionWidget2 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1$1$1.class */
        public static final class C05501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> $component;
            final Ref.BooleanRef $disable;
            final int $switchCircleColor;
            final int $switchOffRectColor;
            final int $switchOnRectColor;
            Object L$0;
            int label;
            final PlayerSettingFunctionWidget2 this$0;

            /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1$1$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1$1$1$a.class */
            public static final class a implements ISubtitleChangedObserver {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PlayerSettingFunctionWidget2 f83133a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> f83134b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Ref.BooleanRef f83135c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final int f83136d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final int f83137e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f83138f;

                public a(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9) {
                    this.f83133a = playerSettingFunctionWidget2;
                    this.f83134b = objectRef;
                    this.f83135c = booleanRef;
                    this.f83136d = i7;
                    this.f83137e = i8;
                    this.f83138f = i9;
                }

                public final void onSubtitleChanged(SubtitleItem subtitleItem, SubtitleItem subtitleItem2) {
                    this.f83133a.f83129w.setValue(Boolean.valueOf(subtitleItem != null && subtitleItem.getLanDocBrief().length() > 0));
                    PlayerSettingFunctionWidget2.P(this.f83133a, this.f83135c, this.f83136d, this.f83137e, this.f83138f, (com.bilibili.playerbizcommonv2.widget.setting.channel.x) this.f83134b.element);
                }

                public final void onSubtitleDrawRectChanged(int i7) {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05501(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super C05501> continuation) {
                super(2, continuation);
                this.this$0 = playerSettingFunctionWidget2;
                this.$component = objectRef;
                this.$disable = booleanRef;
                this.$switchOnRectColor = i7;
                this.$switchOffRectColor = i8;
                this.$switchCircleColor = i9;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05501(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 216
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1.AnonymousClass1.C05501.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playerSettingFunctionWidget2;
            this.$component = objectRef;
            this.$disable = booleanRef;
            this.$switchOnRectColor = i7;
            this.$switchOffRectColor = i8;
            this.$switchCircleColor = i9;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
            BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C05501(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1(PlayerSettingFunctionWidget2 playerSettingFunctionWidget2, Ref.ObjectRef<com.bilibili.playerbizcommonv2.widget.setting.channel.x> objectRef, Ref.BooleanRef booleanRef, int i7, int i8, int i9, Continuation<? super PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1> continuation) {
        super(1, continuation);
        this.this$0 = playerSettingFunctionWidget2;
        this.$component = objectRef;
        this.$disable = booleanRef;
        this.$switchOnRectColor = i7;
        this.$switchOffRectColor = i8;
        this.$switchCircleColor = i9;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlayerSettingFunctionWidget2$createSubtitleSwitch$runningUIComponent$1(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$component, this.$disable, this.$switchOnRectColor, this.$switchOffRectColor, this.$switchCircleColor, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
