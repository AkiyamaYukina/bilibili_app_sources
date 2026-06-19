package com.bilibili.ship.theseus.united.page.comment;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import h51.q;
import java.util.List;
import java.util.Map;
import kntr.app.ad.biz.comment.CommentAdLinkExternalInterceptor;
import kntr.common.comment.richtext.AdLink;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import uv0.C8768a;
import uv0.C8769b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$createNewState$kntrFragment$3.class */
public final class TheseusCommentService$createNewState$kntrFragment$3 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommentAdLinkExternalInterceptor f99273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TheseusCommentService f99274b;

    public TheseusCommentService$createNewState$kntrFragment$3(CommentAdLinkExternalInterceptor commentAdLinkExternalInterceptor, TheseusCommentService theseusCommentService) {
        this.f99274b = theseusCommentService;
        this.f99273a = commentAdLinkExternalInterceptor;
    }

    public final Object a(AdLink adLink, q.a aVar, h51.d dVar, Map<String, String> map, Continuation<? super q.b<Boolean>> continuation) {
        return this.f99273a.a(adLink, aVar, dVar, map, continuation);
    }

    public final Unit b(long j7) {
        TheseusCommentService theseusCommentService = this.f99274b;
        if (theseusCommentService.f99234f.j() == null || theseusCommentService.f99234f.f91107a.k() == PlayerAvailability.FORBIDDEN) {
            return Unit.INSTANCE;
        }
        BuildersKt.launch$default(theseusCommentService.f99243p, (CoroutineContext) null, (CoroutineStart) null, new TheseusCommentService$createNewState$kntrFragment$3$seek$2(theseusCommentService, j7, null), 3, (Object) null);
        return Unit.INSTANCE;
    }

    public final void c(String str) {
        this.f99274b.f99241n.f127996a.tryEmit(str);
    }

    public final Object d(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public final q.b e(String str) {
        if (StringsKt.isBlank(str)) {
            return new q.b(Boxing.boxBoolean(false));
        }
        C8769b c8769b = this.f99274b.f99241n;
        c8769b.f127998c.tryEmit(new C8768a(str));
        return new q.b(Boxing.boxBoolean(true));
    }

    public final q.b f(String str) {
        if (StringsKt.isBlank(str)) {
            return new q.b(Boxing.boxBoolean(false));
        }
        TheseusCommentService theseusCommentService = this.f99274b;
        BuildersKt.launch$default(theseusCommentService.f99243p, (CoroutineContext) null, (CoroutineStart) null, new TheseusCommentService$createNewState$kntrFragment$3$showWebFloatLayer$2(str, theseusCommentService, null), 3, (Object) null);
        return new q.b(Boxing.boxBoolean(true));
    }

    public final q.b<Boolean> g(String str) {
        return new q.b<>(Boolean.valueOf(this.f99274b.f99215A.a(str)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(boolean r6, kotlin.coroutines.Continuation<? super h51.q.b<kotlin.Pair<java.lang.Integer, java.lang.String>>> r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1 r0 = (com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1 r0 = new com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$kntrFragment$3$snapshotToFile$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L61
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L57
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r7 = r0
            goto L83
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L61:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            com.bilibili.ship.theseus.united.page.comment.TheseusCommentService r0 = r0.f99274b
            r1 = r6
            r2 = r7
            java.lang.Object r0 = com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.a(r0, r1, r2)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L83
            r0 = r10
            return r0
        L83:
            h51.q$b r0 = new h51.q$b
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$createNewState$kntrFragment$3.h(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i() {
    }

    public final Object j(List<AdLink> list, q.a aVar, h51.d dVar, Continuation<? super q.b<Boolean>> continuation) {
        return this.f99273a.j(list, aVar, dVar, continuation);
    }

    public final void k(boolean z6) {
    }
}
