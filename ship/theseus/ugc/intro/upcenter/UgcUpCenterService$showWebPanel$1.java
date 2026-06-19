package com.bilibili.ship.theseus.ugc.intro.upcenter;

import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterService$showWebPanel$1.class */
final class UgcUpCenterService$showWebPanel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $tabTitle;
    final String $url;
    Object L$0;
    Object L$1;
    int label;
    final UgcUpCenterService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpCenterService$showWebPanel$1(UgcUpCenterService ugcUpCenterService, String str, String str2, Continuation<? super UgcUpCenterService$showWebPanel$1> continuation) {
        super(2, continuation);
        this.this$0 = ugcUpCenterService;
        this.$url = str;
        this.$tabTitle = str2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcUpCenterService$showWebPanel$1(this.this$0, this.$url, this.$tabTitle, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar3;
                gVar.j(str);
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                gVar2 = gVar3;
                gVar2.j(str);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        UgcUpCenterService ugcUpCenterService = this.this$0;
        gVar = ugcUpCenterService.f97510d;
        String str2 = this.$url;
        String str3 = this.$tabTitle;
        gVar.f("UgcUpCenterService");
        try {
            WebFloatLayerService webFloatLayerService = ugcUpCenterService.f97511e;
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            this.L$0 = gVar;
            this.L$1 = "UgcUpCenterService";
            this.label = 1;
            if (webFloatLayerService.e(str2, str4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "UgcUpCenterService";
            gVar.j(str);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            str = "UgcUpCenterService";
            gVar2 = gVar;
            th = th3;
            gVar2.j(str);
            throw th;
        }
    }
}
