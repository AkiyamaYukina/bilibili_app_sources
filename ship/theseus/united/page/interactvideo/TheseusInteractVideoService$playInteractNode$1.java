package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$playInteractNode$1.class */
public final class TheseusInteractVideoService$playInteractNode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $canResume;
    final com.bilibili.app.gemini.ugc.feature.interactivevideo.j $interactPointer;
    final GeminiCommonPlayableParams $nextPlayableParams;
    final PlayViewUniteReply $preloadedPlayViewUniteReply;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$playInteractNode$1(TheseusInteractVideoService theseusInteractVideoService, boolean z6, GeminiCommonPlayableParams geminiCommonPlayableParams, com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar, PlayViewUniteReply playViewUniteReply, Continuation<? super TheseusInteractVideoService$playInteractNode$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusInteractVideoService;
        this.$canResume = z6;
        this.$nextPlayableParams = geminiCommonPlayableParams;
        this.$interactPointer = jVar;
        this.$preloadedPlayViewUniteReply = playViewUniteReply;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$playInteractNode$1(this.this$0, this.$canResume, this.$nextPlayableParams, this.$interactPointer, this.$preloadedPlayViewUniteReply, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        TheseusInteractVideoService theseusInteractVideoService;
        Mutex mutex;
        boolean z6;
        GeminiCommonPlayableParams geminiCommonPlayableParams;
        com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar;
        PlayViewUniteReply playViewUniteReply;
        Mutex mutex2;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            theseusInteractVideoService = this.this$0;
            mutex = theseusInteractVideoService.f99884U;
            z6 = this.$canResume;
            geminiCommonPlayableParams = this.$nextPlayableParams;
            jVar = this.$interactPointer;
            playViewUniteReply = this.$preloadedPlayViewUniteReply;
            this.L$0 = mutex;
            this.L$1 = theseusInteractVideoService;
            this.L$2 = geminiCommonPlayableParams;
            this.L$3 = jVar;
            this.L$4 = playViewUniteReply;
            this.Z$0 = z6;
            this.label = 1;
            if (mutex.lock((Object) null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex3 = (Mutex) this.L$0;
                mutex2 = mutex3;
                try {
                    ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                    mutex2 = mutex;
                    throw new KotlinNothingValueException();
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock((Object) null);
                    throw th;
                }
            }
            z6 = this.Z$0;
            playViewUniteReply = (PlayViewUniteReply) this.L$4;
            jVar = (com.bilibili.app.gemini.ugc.feature.interactivevideo.j) this.L$3;
            geminiCommonPlayableParams = (GeminiCommonPlayableParams) this.L$2;
            theseusInteractVideoService = (TheseusInteractVideoService) this.L$1;
            Mutex mutex4 = (Mutex) this.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex4;
        }
        if (z6) {
            try {
                theseusInteractVideoService.f99894k.p();
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.unlock((Object) null);
                throw th;
            }
        }
        MutableSharedFlow<TheseusInteractVideoService.a> mutableSharedFlow = theseusInteractVideoService.f99909z;
        com.bilibili.ship.theseus.keel.player.j jVar2 = theseusInteractVideoService.f99881R.get(Boxing.boxLong(jVar.b));
        this.L$0 = mutex;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
        if (TheseusInteractVideoService.g(theseusInteractVideoService, geminiCommonPlayableParams, jVar, mutableSharedFlow, jVar2, playViewUniteReply, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutex2 = mutex;
        throw new KotlinNothingValueException();
    }
}
