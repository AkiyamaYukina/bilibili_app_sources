package com.bilibili.ship.theseus.ugc.intro.videomentioned.dialog;

import com.bilibili.app.screen.adjust.widget.q;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardState;
import com.bilibili.playerbizcommonv2.videomentioned.e;
import com.bilibili.playerbizcommonv2.videomentioned.f;
import com.bilibili.playerbizcommonv2.videomentioned.y;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/dialog/VideoMentionedDialogService$showDialog$3.class */
public final class VideoMentionedDialogService$showDialog$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final q $dialog;
    final y $dialogComponent;
    int label;
    final VideoMentionedDialogService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/dialog/VideoMentionedDialogService$showDialog$3$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VideoMentionedDialogService f97859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f97860b;

        public a(VideoMentionedDialogService videoMentionedDialogService, q qVar) {
            this.f97859a = videoMentionedDialogService;
            this.f97860b = qVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            e eVar = (e) obj;
            boolean z6 = eVar instanceof e.c;
            VideoMentionedDialogService videoMentionedDialogService = this.f97859a;
            if (z6) {
                boolean z7 = ((e.c) eVar).f82011a;
                com.bilibili.ship.theseus.ugc.intro.videomentioned.b bVar = videoMentionedDialogService.f97852c;
                Iterator<T> it = bVar.b().iterator();
                while (it.hasNext()) {
                    MentionedCardItem mentionedCardItem = (MentionedCardItem) it.next();
                    Object aVar = z7 ? new MentionedCardState.a(mentionedCardItem.getDidHidden()) : new MentionedCardState.b(mentionedCardItem.getDidHidden());
                    MutableStateFlow<MentionedCardState> stateFlow = mentionedCardItem.getStateFlow();
                    if (stateFlow != null) {
                        stateFlow.tryEmit(aVar);
                    }
                }
                bVar.f97849l.tryEmit(new f.a(z7));
            } else if (eVar instanceof e.a) {
                e.a aVar2 = (e.a) eVar;
                videoMentionedDialogService.f97852c.a(aVar2.f82009a);
                if (!aVar2.f82009a) {
                    this.f97860b.a();
                }
            } else {
                if (!(eVar instanceof e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                videoMentionedDialogService.c(null, ((e.b) eVar).f82010a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMentionedDialogService$showDialog$3(y yVar, VideoMentionedDialogService videoMentionedDialogService, q qVar, Continuation<? super VideoMentionedDialogService$showDialog$3> continuation) {
        super(2, continuation);
        this.$dialogComponent = yVar;
        this.this$0 = videoMentionedDialogService;
        this.$dialog = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoMentionedDialogService$showDialog$3(this.$dialogComponent, this.this$0, this.$dialog, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow sharedFlowAsSharedFlow = FlowKt.asSharedFlow(this.$dialogComponent.f82065d);
            a aVar = new a(this.this$0, this.$dialog);
            this.label = 1;
            if (sharedFlowAsSharedFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
