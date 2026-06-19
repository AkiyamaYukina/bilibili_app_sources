package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.floatlayer.video.TransparentVideoCoverFloatLayerComponent;
import java.util.concurrent.CancellationException;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1$keyBoardShow$1.class */
public final class NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1$keyBoardShow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<Job> $coverJob;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1$keyBoardShow$1(NoteFloatLayerService noteFloatLayerService, Ref.ObjectRef<Job> objectRef, Continuation<? super NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1$keyBoardShow$1> continuation) {
        super(2, continuation);
        this.this$0 = noteFloatLayerService;
        this.$coverJob = objectRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Ref.ObjectRef objectRef) {
        Job job = (Job) objectRef.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NoteFloatLayerService$showNoteEditPanel$2$softKeyBoardChangeListener$1$keyBoardShow$1(this.this$0, this.$coverJob, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f98610p;
                TransparentVideoCoverFloatLayerComponent transparentVideoCoverFloatLayerComponent = new TransparentVideoCoverFloatLayerComponent(new o(this.$coverJob));
                this.label = 1;
                if (theseusFloatLayerService.i(transparentVideoCoverFloatLayerComponent, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            InputMethodManagerHelper.tryHideSoftInput(this.this$0.f98597b);
            throw th;
        }
    }
}
