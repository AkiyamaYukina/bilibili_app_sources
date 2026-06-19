package com.bilibili.ship.theseus.united.page.comment;

import android.view.View;
import android.view.ViewGroup;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2.class */
final class TheseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2 extends SuspendLambda implements Function2<TheseusCommentService.e, Continuation<? super Unit>, Object> {
    final View $view;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2(View view, Continuation<? super TheseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2> continuation) {
        super(2, continuation);
        this.$view = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2 theseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2 = new TheseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2(this.$view, continuation);
        theseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2.L$0 = obj;
        return theseusCommentService$TheseusCommentExternalHandler$keepPinInputBar$2;
    }

    public final Object invoke(TheseusCommentService.e eVar, Continuation<? super Unit> continuation) {
        return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        ViewGroup viewGroup;
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehaviorB;
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior;
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusCommentService.e eVar = (TheseusCommentService.e) this.L$0;
            if (eVar != null && (viewGroup = eVar.f99288a) != null) {
                pinnedBottomScrollingBehaviorB = com.bilibili.ship.theseus.united.utils.b.b(viewGroup);
                if (pinnedBottomScrollingBehaviorB != null) {
                    pinnedBottomScrollingBehaviorB.addPinnedView(this.$view);
                    try {
                        this.L$0 = pinnedBottomScrollingBehaviorB;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        pinnedBottomScrollingBehavior = pinnedBottomScrollingBehaviorB;
                        pinnedBottomScrollingBehavior.removePinnedView(this.$view);
                        throw th;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior3 = (PinnedBottomScrollingBehavior) this.L$0;
        pinnedBottomScrollingBehavior2 = pinnedBottomScrollingBehavior3;
        try {
            ResultKt.throwOnFailure(obj);
            pinnedBottomScrollingBehaviorB = pinnedBottomScrollingBehavior3;
        } catch (Throwable th2) {
            pinnedBottomScrollingBehavior = pinnedBottomScrollingBehavior2;
            th = th2;
            pinnedBottomScrollingBehavior.removePinnedView(this.$view);
            throw th;
        }
        PinnedBottomScrollingBehavior pinnedBottomScrollingBehavior4 = pinnedBottomScrollingBehaviorB;
        pinnedBottomScrollingBehavior2 = pinnedBottomScrollingBehaviorB;
        throw new KotlinNothingValueException();
    }
}
