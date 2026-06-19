package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1.class */
final class ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final wl0.c $param;
    private Object L$0;
    Object L$1;
    int label;
    final i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1(i iVar, wl0.c cVar, Continuation<? super ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1> continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$param = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(CoroutineScope coroutineScope) {
        CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1 showOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1 = new ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1(this.this$0, this.$param, continuation);
        showOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1.L$0 = obj;
        return showOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.bilibili.ship.theseus.ogv.intro.floatlayer.service.h] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
        String str2;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar3;
        String str3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            i iVar = this.this$0;
            gVar = iVar.h;
            wl0.c cVar = this.$param;
            str = "ShortReviewPublishLayer";
            gVar.f("ShortReviewPublishLayer");
            try {
                UIComponent<?> uIComponentA = iVar.f93006d.a(cVar, new Function0(coroutineScope) { // from class: com.bilibili.ship.theseus.ogv.intro.floatlayer.service.h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CoroutineScope f93002a;

                    {
                        this.f93002a = coroutineScope;
                    }

                    public final Object invoke() {
                        return ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1.invokeSuspend$lambda$0$0(this.f93002a);
                    }
                });
                gVar3 = gVar;
                if (uIComponentA != null) {
                    TheseusFloatLayerService theseusFloatLayerService = iVar.f93005c;
                    this.L$0 = gVar;
                    this.L$1 = "ShortReviewPublishLayer";
                    this.label = 1;
                    if (theseusFloatLayerService.h(uIComponentA, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = "ShortReviewPublishLayer";
                    str = str3;
                    gVar3 = gVar;
                }
            } catch (Throwable th) {
                th = th;
                gVar2 = gVar;
                str2 = "ShortReviewPublishLayer";
                gVar2.j(str2);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) this.L$1;
            gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                gVar = gVar2;
                str = str3;
                gVar3 = gVar;
            } catch (Throwable th2) {
                str2 = str3;
                th = th2;
                gVar2.j(str2);
                throw th;
            }
        }
        gVar3.j(str);
        return Unit.INSTANCE;
    }
}
