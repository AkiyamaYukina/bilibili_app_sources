package com.bilibili.ship.theseus.ugc.weblayer;

import android.content.res.Configuration;
import androidx.core.util.Consumer;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.playerbizcommon.note.NoteEditTimeInfoDialog;
import com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteEditPanel$2$1$1$4.class */
public final class NoteFloatLayerService$showNoteEditPanel$2$1$1$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Consumer<Configuration> $configurationChangeListener;
    final Ref.ObjectRef<Job> $coverJob;
    final Runnable $multiWindowNotifyRunnable;
    final com.bilibili.playerbizcommon.utils.l $ugcSoftKeyBoardHelper;
    final boolean $useWindowInsetsKeyboardHeight;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFloatLayerService$showNoteEditPanel$2$1$1$4(Runnable runnable, NoteFloatLayerService noteFloatLayerService, Consumer<Configuration> consumer, boolean z6, com.bilibili.playerbizcommon.utils.l lVar, Ref.ObjectRef<Job> objectRef, Continuation<? super NoteFloatLayerService$showNoteEditPanel$2$1$1$4> continuation) {
        super(1, continuation);
        this.$multiWindowNotifyRunnable = runnable;
        this.this$0 = noteFloatLayerService;
        this.$configurationChangeListener = consumer;
        this.$useWindowInsetsKeyboardHeight = z6;
        this.$ugcSoftKeyBoardHelper = lVar;
        this.$coverJob = objectRef;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NoteFloatLayerService$showNoteEditPanel$2$1$1$4(this.$multiWindowNotifyRunnable, this.this$0, this.$configurationChangeListener, this.$useWindowInsetsKeyboardHeight, this.$ugcSoftKeyBoardHelper, this.$coverJob, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            HandlerThreads.remove(0, this.$multiWindowNotifyRunnable);
            this.this$0.f98597b.removeOnConfigurationChangedListener(this.$configurationChangeListener);
            NoteFloatLayerService.a aVar = this.this$0.f98618x;
            if (aVar != null && (str = aVar.f98621a) != null) {
                JSONObject jSONObject = new JSONObject();
                pl.h.a(0, jSONObject, "code", "message", "");
                aVar.callbackToJs(new Object[]{str, jSONObject});
            }
            if (!this.$useWindowInsetsKeyboardHeight) {
                this.$ugcSoftKeyBoardHelper.c();
            }
            Job job = (Job) this.$coverJob.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            NoteFloatLayerService noteFloatLayerService = this.this$0;
            NoteEditTimeInfoDialog noteEditTimeInfoDialog = noteFloatLayerService.f98620z;
            if (noteEditTimeInfoDialog != null) {
                if (noteEditTimeInfoDialog.isVisible()) {
                    noteEditTimeInfoDialog.dismiss();
                }
                noteFloatLayerService.f98620z = null;
            }
            NoteFloatLayerService noteFloatLayerService2 = this.this$0;
            noteFloatLayerService2.f98616v = true;
            noteFloatLayerService2.f98618x = null;
            noteFloatLayerService2.f98613s = null;
            throw th;
        }
    }
}
