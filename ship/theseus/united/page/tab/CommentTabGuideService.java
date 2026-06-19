package com.bilibili.ship.theseus.united.page.tab;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import com.bilibili.ship.theseus.united.page.popupwindow.PopupWindowRepository;
import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService;
import javax.inject.Inject;
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
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabGuideService.class */
@StabilityInferred(parameters = 0)
public final class CommentTabGuideService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<TheseusTabPagerService.c> f103116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PopupWindowRepository f103117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f103118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f103119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final TheseusCommentService.b f103120f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.tab.CommentTabGuideService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabGuideService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CommentTabGuideService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CommentTabGuideService commentTabGuideService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = commentTabGuideService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            CommentTabGuideService commentTabGuideService = this.this$0;
            TheseusCommentService.b bVar = commentTabGuideService.f103120f;
            this.label = 2;
            if (commentTabGuideService.a(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public CommentTabGuideService(@NotNull CoroutineScope coroutineScope, @NotNull Flow<TheseusTabPagerService.c> flow, @NotNull PopupWindowRepository popupWindowRepository, @NotNull i iVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @Nullable TheseusCommentService.b bVar) {
        this.f103115a = coroutineScope;
        this.f103116b = flow;
        this.f103117c = popupWindowRepository;
        this.f103118d = iVar;
        this.f103119e = aVar;
        this.f103120f = bVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.Nullable com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.b r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.tab.CommentTabGuideService.a(com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
