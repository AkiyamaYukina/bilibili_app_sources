package com.bilibili.ship.theseus.keel.player;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.FragmentInfo;
import com.bapis.bilibili.playershared.FragmentVideo;
import com.bapis.bilibili.playershared.FragmentVideoInfo;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.ship.theseus.keel.player.c;
import com.google.protobuf.Any;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2.class */
final class TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final long $avid;
    final long $cid;
    final Object $legacy;
    final PlayViewUniteReply $reply;
    final f $runWithVideoPiece;
    final boolean $seeksAccurately;
    final long $targetPosition;
    final InterfaceC5778f $this_attachVideoPieceTask;
    private Object L$0;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Object $legacy;
        final boolean $seeksAccurately;
        final long $targetPosition;
        final InterfaceC5778f $this_attachVideoPieceTask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5778f interfaceC5778f, long j7, boolean z6, Object obj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_attachVideoPieceTask = interfaceC5778f;
            this.$targetPosition = j7;
            this.$seeksAccurately = z6;
            this.$legacy = obj;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_attachVideoPieceTask, this.$targetPosition, this.$seeksAccurately, this.$legacy, continuation);
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
                InterfaceC5778f interfaceC5778f = this.$this_attachVideoPieceTask;
                long j7 = this.$targetPosition;
                boolean z6 = this.$seeksAccurately;
                Object obj2 = this.$legacy;
                this.label = 1;
                if (interfaceC5778f.I(j7, z6, obj2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.keel.player.TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final long $avid;
        final long $cid;
        final PlayViewUniteReply $reply;
        final f $runWithVideoPiece;
        final InterfaceC5778f $this_attachVideoPieceTask;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f fVar, long j7, long j8, InterfaceC5778f interfaceC5778f, PlayViewUniteReply playViewUniteReply, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$runWithVideoPiece = fVar;
            this.$avid = j7;
            this.$cid = j8;
            this.$this_attachVideoPieceTask = interfaceC5778f;
            this.$reply = playViewUniteReply;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$runWithVideoPiece, this.$avid, this.$cid, this.$this_attachVideoPieceTask, this.$reply, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                f fVar = this.$runWithVideoPiece;
                long j7 = this.$avid;
                long j8 = this.$cid;
                InterfaceC5778f interfaceC5778f = this.$this_attachVideoPieceTask;
                PlayViewUniteReply playViewUniteReply = this.$reply;
                Integer numBoxInt = Boxing.boxInt(0);
                Any supplement = playViewUniteReply != null ? playViewUniteReply.getSupplement() : null;
                Any report = null;
                if (playViewUniteReply != null) {
                    FragmentVideo fragmentVideo = playViewUniteReply.getFragmentVideo();
                    report = null;
                    if (fragmentVideo != null) {
                        List videosList = fragmentVideo.getVideosList();
                        report = null;
                        if (videosList != null) {
                            FragmentVideoInfo fragmentVideoInfo = (FragmentVideoInfo) CollectionsKt.getOrNull(videosList, 0);
                            report = null;
                            if (fragmentVideoInfo != null) {
                                FragmentInfo fragmentInfo = fragmentVideoInfo.getFragmentInfo();
                                report = null;
                                if (fragmentInfo != null) {
                                    report = fragmentInfo.getReport();
                                }
                            }
                        }
                    }
                }
                q qVar = new q(0, j7, j8, false, interfaceC5778f, null, new c.C0674c(numBoxInt, supplement, report), 0, j7, j8);
                this.label = 1;
                if (fVar.a(qVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2(InterfaceC5778f interfaceC5778f, long j7, boolean z6, Object obj, f fVar, long j8, long j9, PlayViewUniteReply playViewUniteReply, Continuation<? super TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2> continuation) {
        super(2, continuation);
        this.$this_attachVideoPieceTask = interfaceC5778f;
        this.$targetPosition = j7;
        this.$seeksAccurately = z6;
        this.$legacy = obj;
        this.$runWithVideoPiece = fVar;
        this.$avid = j8;
        this.$cid = j9;
        this.$reply = playViewUniteReply;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2 theseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2 = new TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2(this.$this_attachVideoPieceTask, this.$targetPosition, this.$seeksAccurately, this.$legacy, this.$runWithVideoPiece, this.$avid, this.$cid, this.$reply, continuation);
        theseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2.L$0 = obj;
        return theseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.$this_attachVideoPieceTask, this.$targetPosition, this.$seeksAccurately, this.$legacy, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$runWithVideoPiece, this.$avid, this.$cid, this.$this_attachVideoPieceTask, this.$reply, null), 3, (Object) null);
    }
}
