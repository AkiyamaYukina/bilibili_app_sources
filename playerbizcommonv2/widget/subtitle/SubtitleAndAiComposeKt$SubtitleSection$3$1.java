package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.MutableState;
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
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.ISubtitleChangedObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$SubtitleSection$3$1.class */
public final class SubtitleAndAiComposeKt$SubtitleSection$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $bilingualSwitchChecked$delegate;
    final MutableState<String> $currentMainSubtitleKey$delegate;
    final MutableState<String> $currentViceSubtitleKey$delegate;
    final IInteractLayerService $interactLayerService;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$SubtitleSection$3$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$SubtitleSection$3$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableState<Boolean> $bilingualSwitchChecked$delegate;
        final MutableState<String> $currentMainSubtitleKey$delegate;
        final MutableState<String> $currentViceSubtitleKey$delegate;
        final IInteractLayerService $interactLayerService;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$SubtitleSection$3$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$SubtitleSection$3$1$1$a.class */
        public static final class a implements ISubtitleChangedObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableState<String> f83578a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MutableState<Boolean> f83579b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MutableState<String> f83580c;

            public a(MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3) {
                this.f83578a = mutableState;
                this.f83579b = mutableState2;
                this.f83580c = mutableState3;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onSubtitleChanged(com.bapis.bilibili.community.service.dm.v1.SubtitleItem r4, com.bapis.bilibili.community.service.dm.v1.SubtitleItem r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "nodisplay"
                    r6 = r0
                    r0 = r4
                    if (r0 == 0) goto L15
                    r0 = r4
                    java.lang.String r0 = r0.getLan()
                    r7 = r0
                    r0 = r7
                    r4 = r0
                    r0 = r7
                    if (r0 != 0) goto L18
                L15:
                    java.lang.String r0 = "nodisplay"
                    r4 = r0
                L18:
                    r0 = r3
                    androidx.compose.runtime.MutableState<java.lang.String> r0 = r0.f83578a
                    r1 = r4
                    r0.setValue(r1)
                    r0 = r3
                    androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r0.f83579b
                    r4 = r0
                    r0 = r5
                    if (r0 != 0) goto L37
                    r0 = r4
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    r0.setValue(r1)
                    goto L40
                L37:
                    r0 = r4
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.setValue(r1)
                L40:
                    r0 = r6
                    r4 = r0
                    r0 = r5
                    if (r0 == 0) goto L54
                    r0 = r5
                    java.lang.String r0 = r0.getLan()
                    r4 = r0
                    r0 = r4
                    if (r0 != 0) goto L54
                    r0 = r6
                    r4 = r0
                    goto L54
                L54:
                    r0 = r3
                    androidx.compose.runtime.MutableState<java.lang.String> r0 = r0.f83580c
                    r1 = r4
                    r0.setValue(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$SubtitleSection$3$1.AnonymousClass1.a.onSubtitleChanged(com.bapis.bilibili.community.service.dm.v1.SubtitleItem, com.bapis.bilibili.community.service.dm.v1.SubtitleItem):void");
            }

            public final void onSubtitleDrawRectChanged(int i7) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IInteractLayerService iInteractLayerService, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$interactLayerService = iInteractLayerService;
            this.$currentMainSubtitleKey$delegate = mutableState;
            this.$bilingualSwitchChecked$delegate = mutableState2;
            this.$currentViceSubtitleKey$delegate = mutableState3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$interactLayerService, this.$currentMainSubtitleKey$delegate, this.$bilingualSwitchChecked$delegate, this.$currentViceSubtitleKey$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = new a(this.$currentMainSubtitleKey$delegate, this.$bilingualSwitchChecked$delegate, this.$currentViceSubtitleKey$delegate);
                try {
                    this.$interactLayerService.addSubtitleChangedObserver(aVar);
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                    this.$interactLayerService.removeSubtitleChangedObserver(aVar2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) this.L$0;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th2) {
                    th = th2;
                    this.$interactLayerService.removeSubtitleChangedObserver(aVar2);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleAndAiComposeKt$SubtitleSection$3$1(IInteractLayerService iInteractLayerService, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, Continuation<? super SubtitleAndAiComposeKt$SubtitleSection$3$1> continuation) {
        super(2, continuation);
        this.$interactLayerService = iInteractLayerService;
        this.$currentMainSubtitleKey$delegate = mutableState;
        this.$bilingualSwitchChecked$delegate = mutableState2;
        this.$currentViceSubtitleKey$delegate = mutableState3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SubtitleAndAiComposeKt$SubtitleSection$3$1 subtitleAndAiComposeKt$SubtitleSection$3$1 = new SubtitleAndAiComposeKt$SubtitleSection$3$1(this.$interactLayerService, this.$currentMainSubtitleKey$delegate, this.$bilingualSwitchChecked$delegate, this.$currentViceSubtitleKey$delegate, continuation);
        subtitleAndAiComposeKt$SubtitleSection$3$1.L$0 = obj;
        return subtitleAndAiComposeKt$SubtitleSection$3$1;
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
        BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$interactLayerService, this.$currentMainSubtitleKey$delegate, this.$bilingualSwitchChecked$delegate, this.$currentViceSubtitleKey$delegate, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
