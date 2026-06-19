package com.bilibili.ship.theseus.united.page.comment;

import c6.Q;
import com.bilibili.app.comment3.CommentFloatingWebViewType;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.playerbizcommonv2.utils.k;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.h;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2.class */
final class TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CommentFloatingWebViewType $type;
    final String $url;
    Object L$0;
    Object L$1;
    int label;
    final TheseusCommentService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f99256a;

        static {
            int[] iArr = new int[CommentFloatingWebViewType.values().length];
            try {
                iArr[CommentFloatingWebViewType.COIN_GUESS_EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[CommentFloatingWebViewType.COIN_GUESS_PARTICIPATE.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[CommentFloatingWebViewType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f99256a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2(CommentFloatingWebViewType commentFloatingWebViewType, TheseusCommentService theseusCommentService, String str, Continuation<? super TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2> continuation) {
        super(2, continuation);
        this.$type = commentFloatingWebViewType;
        this.this$0 = theseusCommentService;
        this.$url = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2(this.$type, this.this$0, this.$url, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws Throwable {
        TheseusCommentService theseusCommentService;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            int i8 = a.f99256a[this.$type.ordinal()];
            if (i8 == 1) {
                h hVar = this.this$0.f99216B;
                String strA = hVar.a(this.$url);
                TheseusV3WebRepository theseusV3WebRepository = hVar.f104257a;
                theseusV3WebRepository.getClass();
                theseusV3WebRepository.a(strA, TheseusV3WebRepository.DisplayMode.AUTO_HEIGHT, null, true);
            } else if (i8 == 2) {
                h hVar2 = this.this$0.f99216B;
                String str = this.$url;
                Integer numBoxInt = Boxing.boxInt(423);
                String strA2 = hVar2.a(str);
                TheseusV3WebRepository theseusV3WebRepository2 = hVar2.f104257a;
                theseusV3WebRepository2.getClass();
                theseusV3WebRepository2.a(strA2, TheseusV3WebRepository.DisplayMode.FIXED_HEIGHT, numBoxInt, false);
            } else {
                if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean zB = k.b(this.$url);
                boolean zA = k.a(this.$url);
                String str2 = this.$url;
                StringBuilder sbA = Q.a("showFloatingWebView default navBarEnabled=", " iconVisible=", " ", zB, zA);
                sbA.append(str2);
                defpackage.a.b("[theseus-united-TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2-invokeSuspend] ", sbA.toString(), "TheseusCommentService$TheseusCommentExternalHandler$showFloatingWebView$2-invokeSuspend");
                theseusCommentService = this.this$0;
                gVar = theseusCommentService.f99247t;
                String str3 = this.$url;
                gVar.f(theseusCommentService);
                try {
                    WebFloatLayerService webFloatLayerService = theseusCommentService.f99240m;
                    TheseusWebUIComponent.a aVar = new TheseusWebUIComponent.a(zB, "", 0, 0, 0, !zB && k.a(str3), 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(theseusCommentService.f99251x.b(), 0, 1, (Object) null)), false, false, null, 1015740);
                    this.L$0 = gVar;
                    this.L$1 = theseusCommentService;
                    this.label = 1;
                    if (webFloatLayerService.d(str3, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gVar.j(theseusCommentService);
                } catch (Throwable th) {
                    th = th;
                    gVar.j(theseusCommentService);
                    throw th;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TheseusCommentService theseusCommentService2 = (TheseusCommentService) this.L$1;
            gVar = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                theseusCommentService = theseusCommentService2;
                gVar.j(theseusCommentService);
            } catch (Throwable th2) {
                th = th2;
                theseusCommentService = theseusCommentService2;
                gVar.j(theseusCommentService);
                throw th;
            }
        }
        return Unit.INSTANCE;
    }
}
