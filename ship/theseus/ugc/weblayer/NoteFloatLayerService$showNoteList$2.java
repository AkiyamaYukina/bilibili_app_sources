package com.bilibili.ship.theseus.ugc.weblayer;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.concurrent.CancellationException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteList$2.class */
final class NoteFloatLayerService$showNoteList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final NoteFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$showNoteList$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$showNoteList$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final NoteFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoteFloatLayerService noteFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = noteFloatLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            NoteFloatLayerService noteFloatLayerService = this.this$0;
            gVar = noteFloatLayerService.f98608n;
            gVar.f("note_list");
            try {
                this.L$0 = gVar;
                this.L$1 = "note_list";
                this.label = 1;
                NoteListFloatLayerComponent noteListFloatLayerComponent = new NoteListFloatLayerComponent(new p(noteFloatLayerService));
                TheseusFloatLayerService theseusFloatLayerService = noteFloatLayerService.f98610p;
                Object objH = theseusFloatLayerService.h(noteListFloatLayerComponent, theseusFloatLayerService.f99664n, this);
                if (objH != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objH = Unit.INSTANCE;
                }
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = "note_list";
                gVar.j(str);
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                str = "note_list";
                gVar2 = gVar;
                th = th3;
                gVar2.j(str);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFloatLayerService$showNoteList$2(NoteFloatLayerService noteFloatLayerService, Continuation<? super NoteFloatLayerService$showNoteList$2> continuation) {
        super(2, continuation);
        this.this$0 = noteFloatLayerService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NoteFloatLayerService$showNoteList$2 noteFloatLayerService$showNoteList$2 = new NoteFloatLayerService$showNoteList$2(this.this$0, continuation);
        noteFloatLayerService$showNoteList$2.L$0 = obj;
        return noteFloatLayerService$showNoteList$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Job job = this.this$0.f98615u;
            if (job != null && job.isActive()) {
                return Unit.INSTANCE;
            }
            Job job2 = this.this$0.f98613s;
            if (job2 != null && job2.isActive()) {
                com.bilibili.ship.theseus.united.utils.q.b(2131845604);
                return Unit.INSTANCE;
            }
            Job job3 = this.this$0.f98614t;
            if (job3 != null) {
                Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
        }
        NoteFloatLayerService noteFloatLayerService = this.this$0;
        noteFloatLayerService.f98615u = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(noteFloatLayerService, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
