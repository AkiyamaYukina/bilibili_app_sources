package com.bilibili.ship.theseus.united.page.danmaku;

import com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.OpenUrlScheme;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$openWebContainer$2.class */
final class ChronosBusinessService$openWebContainer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OpenUrlScheme.BizParams $extra;
    final boolean $needCloseIcon;
    final boolean $needKeyBoardListener;
    final boolean $needVerticalScrollbar;
    final String $url;
    int label;
    final ChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChronosBusinessService$openWebContainer$2(OpenUrlScheme.BizParams bizParams, ChronosBusinessService chronosBusinessService, String str, boolean z6, boolean z7, boolean z8, Continuation<? super ChronosBusinessService$openWebContainer$2> continuation) {
        super(2, continuation);
        this.$extra = bizParams;
        this.this$0 = chronosBusinessService;
        this.$url = str;
        this.$needCloseIcon = z6;
        this.$needVerticalScrollbar = z7;
        this.$needKeyBoardListener = z8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ChronosBusinessService chronosBusinessService) {
        IRemoteHandler remoteHandler = chronosBusinessService.f99336g.getRemoteHandler();
        if (remoteHandler != null) {
            IRemoteHandler.onBusinessDataChanged$default(remoteHandler, "interaction_resume", (Object) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChronosBusinessService$openWebContainer$2(this.$extra, this.this$0, this.$url, this.$needCloseIcon, this.$needVerticalScrollbar, this.$needKeyBoardListener, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [com.bilibili.ship.theseus.united.page.danmaku.f] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OpenUrlScheme.BizParams bizParams = this.$extra;
            if (!(bizParams != null ? Intrinsics.areEqual(bizParams.getUseV3WebContainer(), Boxing.boxBoolean(true)) : false)) {
                final ChronosBusinessService chronosBusinessService = this.this$0;
                com.bilibili.ship.theseus.united.page.weblayer.e eVar = chronosBusinessService.f99344p;
                String str = this.$url;
                boolean z6 = this.$needCloseIcon;
                boolean z7 = this.$needVerticalScrollbar;
                boolean z8 = this.$needKeyBoardListener;
                ?? r02 = new Function0(chronosBusinessService) { // from class: com.bilibili.ship.theseus.united.page.danmaku.f

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final ChronosBusinessService f99529a;

                    {
                        this.f99529a = chronosBusinessService;
                    }

                    public final Object invoke() {
                        return ChronosBusinessService$openWebContainer$2.invokeSuspend$lambda$0(this.f99529a);
                    }
                };
                eVar.getClass();
                eVar.f104249a.tryEmit(new com.bilibili.ship.theseus.united.page.weblayer.g(str, z6, z7, z8, r02));
                return Unit.INSTANCE;
            }
            this.label = 1;
            if (YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TheseusV3WebRepository theseusV3WebRepository = this.this$0.f99345q;
        String str2 = this.$url;
        Integer height = this.$extra.getHeight();
        theseusV3WebRepository.getClass();
        theseusV3WebRepository.a(str2, TheseusV3WebRepository.DisplayMode.FIXED_HEIGHT, height, false);
        return Unit.INSTANCE;
    }
}
