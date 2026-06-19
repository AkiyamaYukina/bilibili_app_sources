package com.bilibili.ship.theseus.united.page.videopiece;

import Hr0.a;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.ship.theseus.keel.player.c;
import com.bilibili.ship.theseus.keel.player.q;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.LongRange;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/MasterPieceSectionService$1.class */
final class MasterPieceSectionService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final b $pieceRepository;
    int label;
    final com.bilibili.ship.theseus.united.page.videopiece.a this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videopiece/MasterPieceSectionService$1$a.class */
    public static final class a implements Hr0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LongRange f103672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f103673b;

        public a(LongRange longRange, b bVar) {
            this.f103672a = longRange;
            this.f103673b = bVar;
        }

        @Override // Hr0.a
        public final Long h() {
            q qVar = (q) this.f103673b.f103683b.getValue();
            Long lH = null;
            if (qVar == null) {
                return null;
            }
            if (qVar.f91146g instanceof c.C0674c) {
                lH = qVar.f91144e.h();
            }
            return lH;
        }

        @Override // Hr0.a
        public final LongRange i() {
            return this.f103672a;
        }

        @Override // Hr0.a
        public final Long j() {
            q qVar = (q) this.f103673b.f103683b.getValue();
            Long lValueOf = null;
            if (qVar == null) {
                return null;
            }
            if (qVar.f91146g instanceof c.C0674c) {
                lValueOf = Long.valueOf(qVar.f91144e.L());
            }
            return lValueOf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterPieceSectionService$1(com.bilibili.ship.theseus.united.page.videopiece.a aVar, b bVar, Continuation<? super MasterPieceSectionService$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pieceRepository = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MasterPieceSectionService$1(this.this$0, this.$pieceRepository, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        LongRange longRange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        a.C0051a c0051a = a.C0051a.f8745a;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.ship.theseus.united.page.videopiece.a aVar = this.this$0;
                PlayViewUniteReply playViewUniteReply = aVar.f103679a;
                if (playViewUniteReply.getFragmentVideo().getVideosList().isEmpty()) {
                    longRange = null;
                } else {
                    long j7 = Duration.getInWholeMilliseconds-impl(aVar.f103680b.f104512a);
                    longRange = new LongRange(j7, playViewUniteReply.getVodInfo().getTimelength() + j7);
                }
                this.this$0.f103681c.put(c0051a, new a(longRange, this.$pieceRepository));
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
            this.this$0.f103681c.put(c0051a, null);
            throw th;
        }
    }
}
