package com.bilibili.ship.theseus.ogv.toolbar;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/toolbar/ToolbarTogetherWatchRepository$insertIntoToolbar$2.class */
final class ToolbarTogetherWatchRepository$insertIntoToolbar$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ToolbarTogetherWatchRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarTogetherWatchRepository$insertIntoToolbar$2(ToolbarTogetherWatchRepository toolbarTogetherWatchRepository, Continuation<? super ToolbarTogetherWatchRepository$insertIntoToolbar$2> continuation) {
        super(2, continuation);
        this.this$0 = toolbarTogetherWatchRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final Unit invokeSuspend$lambda$0(ToolbarTogetherWatchRepository toolbarTogetherWatchRepository, Composer composer, int i7) {
        if (composer.shouldExecute((i7 & 3) != 2, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(780381884, i7, -1, "com.bilibili.ship.theseus.ogv.toolbar.ToolbarTogetherWatchRepository.insertIntoToolbar.<anonymous>.<anonymous> (ToolbarTogetherWatchRepository.kt:59)");
            }
            toolbarTogetherWatchRepository.a(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ToolbarTogetherWatchRepository$insertIntoToolbar$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final ToolbarTogetherWatchRepository toolbarTogetherWatchRepository = this.this$0;
            toolbarTogetherWatchRepository.f94580f.setContent(ComposableLambdaKt.composableLambdaInstance(780381884, true, new Function2(toolbarTogetherWatchRepository) { // from class: com.bilibili.ship.theseus.ogv.toolbar.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ToolbarTogetherWatchRepository f94584a;

                {
                    this.f94584a = toolbarTogetherWatchRepository;
                }

                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return ToolbarTogetherWatchRepository$insertIntoToolbar$2.invokeSuspend$lambda$0(this.f94584a, (Composer) obj2, iIntValue);
                }
            }));
            ToolbarTogetherWatchRepository toolbarTogetherWatchRepository2 = this.this$0;
            ToolbarRepository toolbarRepository = toolbarTogetherWatchRepository2.f94576b;
            List listListOf = CollectionsKt.listOf(toolbarTogetherWatchRepository2.f94580f);
            this.label = 1;
            if (toolbarRepository.e(listListOf, this) == coroutine_suspended) {
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
