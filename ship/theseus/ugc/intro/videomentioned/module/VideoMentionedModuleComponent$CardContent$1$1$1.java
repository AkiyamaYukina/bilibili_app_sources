package com.bilibili.ship.theseus.ugc.intro.videomentioned.module;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/module/VideoMentionedModuleComponent$CardContent$1$1$1.class */
public final class VideoMentionedModuleComponent$CardContent$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: Incorrect field signature: TE; */
    final UIComponent.ViewEntry $entry;
    final MentionedCardItem<E> $mentioned;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/bilibili/playerbizcommonv2/videomentioned/MentionedCardItem<TE;>;TE;Lkotlin/coroutines/Continuation<-Lcom/bilibili/ship/theseus/ugc/intro/videomentioned/module/VideoMentionedModuleComponent$CardContent$1$1$1;>;)V */
    public VideoMentionedModuleComponent$CardContent$1$1$1(MentionedCardItem mentionedCardItem, UIComponent.ViewEntry viewEntry, Continuation continuation) {
        super(2, continuation);
        this.$mentioned = mentionedCardItem;
        this.$entry = viewEntry;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoMentionedModuleComponent$CardContent$1$1$1(this.$mentioned, this.$entry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UIComponent component = this.$mentioned.getComponent();
            UIComponent.ViewEntry viewEntry = this.$entry;
            this.label = 1;
            if (component.bindToView(viewEntry, this) == coroutine_suspended) {
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
