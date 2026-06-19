package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.ship.theseus.ugc.intro.uplikes.h;
import com.google.gson.reflect.TypeToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesRepository$Companion$loadUpLikesList$2.class */
final class UgcUpLikesRepository$Companion$loadUpLikesList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super h.a>, Object> {
    final long $aid;
    final long $indexMid;
    final boolean $onlyFans;
    final long $upMid;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesRepository$Companion$loadUpLikesList$2$a.class */
    public static final class a extends TypeToken<User> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcUpLikesRepository$Companion$loadUpLikesList$2(long j7, long j8, long j9, boolean z6, Continuation<? super UgcUpLikesRepository$Companion$loadUpLikesList$2> continuation) {
        super(2, continuation);
        this.$indexMid = j7;
        this.$aid = j8;
        this.$upMid = j9;
        this.$onlyFans = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcUpLikesRepository$Companion$loadUpLikesList$2(this.$indexMid, this.$aid, this.$upMid, this.$onlyFans, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h.a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066 A[Catch: MossException -> 0x0062, TRY_ENTER, TryCatch #0 {MossException -> 0x0062, blocks: (B:5:0x000f, B:7:0x0054, B:16:0x006e, B:20:0x007c, B:22:0x0097, B:24:0x009f, B:25:0x00cc, B:13:0x0066), top: B:31:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesRepository$Companion$loadUpLikesList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
