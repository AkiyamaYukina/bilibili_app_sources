package com.bilibili.playerbizcommonv2.danmaku.feedback;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.screen.adjust.widget.G;
import com.bilibili.app.screen.adjust.widget.a;
import java.util.List;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8.class */
final class DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final IInteractLayerService $danmakuService;
    final MutableStateFlow<Boolean> $dismissFlow;
    final List<RunningUIComponent> $list;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.feedback.DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FragmentActivity $activity;
        final MutableStateFlow<Boolean> $dismissFlow;
        final List<RunningUIComponent> $list;
        private Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FragmentActivity fragmentActivity, List<RunningUIComponent> list, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = fragmentActivity;
            this.$list = list;
            this.$dismissFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, this.$list, this.$dismissFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FragmentActivity fragmentActivity = this.$activity;
                com.bilibili.app.screen.adjust.widget.q qVar = new com.bilibili.app.screen.adjust.widget.q(fragmentActivity, com.bilibili.playerbizcommonv2.widget.setting.channel.m.a(fragmentActivity, coroutineScope, this.$list), G.b.a, (String) null, 0.0f, false, false, 0, a.b.a, this.$dismissFlow, 0, 13304);
                this.label = 1;
                if (com.bilibili.app.screen.adjust.widget.t.b(qVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.feedback.DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IInteractLayerService $danmakuService;
        final MutableStateFlow<Boolean> $dismissFlow;
        int label;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.danmaku.feedback.DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/feedback/DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final IInteractLayerService $danmakuService;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(IInteractLayerService iInteractLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$danmakuService = iInteractLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$danmakuService, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                if (this.Z$0) {
                    BLog.i("DanmakuFeedbackDialogHelper", " DanmakuFeedbackDialog dismissed, notifying interaction resume");
                    IRemoteHandler remoteHandler = this.$danmakuService.getRemoteHandler();
                    if (remoteHandler != null) {
                        IRemoteHandler.onBusinessDataChanged$default(remoteHandler, "interaction_resume", (Object) null, 2, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableStateFlow<Boolean> mutableStateFlow, IInteractLayerService iInteractLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$dismissFlow = mutableStateFlow;
            this.$danmakuService = iInteractLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$dismissFlow, this.$danmakuService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.$dismissFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$danmakuService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8(FragmentActivity fragmentActivity, List<RunningUIComponent> list, MutableStateFlow<Boolean> mutableStateFlow, IInteractLayerService iInteractLayerService, Continuation<? super DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$list = list;
        this.$dismissFlow = mutableStateFlow;
        this.$danmakuService = iInteractLayerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8 danmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8 = new DanmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8(this.$activity, this.$list, this.$dismissFlow, this.$danmakuService, continuation);
        danmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8.L$0 = obj;
        return danmakuFeedbackDialogHelperKt$showDanmakuFeedbackDialog$8;
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
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$activity, this.$list, this.$dismissFlow, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$dismissFlow, this.$danmakuService, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
