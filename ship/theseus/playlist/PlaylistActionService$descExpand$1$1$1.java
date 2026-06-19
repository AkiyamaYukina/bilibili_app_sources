package com.bilibili.ship.theseus.playlist;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$descExpand$1$1$1.class */
public final class PlaylistActionService$descExpand$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.united.page.intro.module.season.D $uiComponent;
    Object L$0;
    Object L$1;
    int label;
    final C6241f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistActionService$descExpand$1$1$1(C6241f c6241f, com.bilibili.ship.theseus.united.page.intro.module.season.D d7, Continuation<? super PlaylistActionService$descExpand$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c6241f;
        this.$uiComponent = d7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0$0(C6241f c6241f) {
        return c6241f.f95754k.f() ? 3 : 1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PlaylistActionService$descExpand$1$1$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            cVar2 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                cVar = cVar2;
                cVar.j(str2, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                str = str2;
                cVar2.j(str, false);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final C6241f c6241f = this.this$0;
        cVar = c6241f.f95752i;
        UIComponent<?> uIComponent = this.$uiComponent;
        cVar.j("PlaylistActionService", true);
        try {
            uIComponent.j(!c6241f.f95754k.f());
            TheseusFloatLayerService theseusFloatLayerService = c6241f.f95751g;
            TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, new Function0(c6241f) { // from class: com.bilibili.ship.theseus.playlist.g

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C6241f f95756a;

                {
                    this.f95756a = c6241f;
                }

                public final Object invoke() {
                    return Integer.valueOf(PlaylistActionService$descExpand$1$1$1.invokeSuspend$lambda$0$0(this.f95756a));
                }
            }, 12);
            this.L$0 = cVar;
            this.L$1 = "PlaylistActionService";
            this.label = 1;
            if (theseusFloatLayerService.e(uIComponent, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = "PlaylistActionService";
            cVar.j(str2, false);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            cVar2 = cVar;
            str = "PlaylistActionService";
            cVar2.j(str, false);
            throw th;
        }
    }
}
