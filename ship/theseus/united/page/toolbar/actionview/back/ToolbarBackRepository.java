package com.bilibili.ship.theseus.united.page.toolbar.actionview.back;

import ZI.h;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/back/ToolbarBackRepository.class */
@StabilityInferred(parameters = 0)
public final class ToolbarBackRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BaseAppCompatActivity f103317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f103318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f103319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f103320e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.actionview.back.ToolbarBackRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/actionview/back/ToolbarBackRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ToolbarBackRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ToolbarBackRepository toolbarBackRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = toolbarBackRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ToolbarBackRepository toolbarBackRepository = this.this$0;
                ToolbarRepository toolbarRepository = toolbarBackRepository.f103318c;
                List listListOf = CollectionsKt.listOf(toolbarBackRepository.f103320e);
                this.label = 1;
                if (toolbarRepository.d(listListOf, this) == coroutine_suspended) {
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

    @Inject
    public ToolbarBackRepository(@NotNull CoroutineScope coroutineScope, @NotNull BaseAppCompatActivity baseAppCompatActivity, @NotNull ToolbarRepository toolbarRepository, @NotNull BackActionRepository backActionRepository) {
        this.f103316a = coroutineScope;
        this.f103317b = baseAppCompatActivity;
        this.f103318c = toolbarRepository;
        this.f103319d = backActionRepository;
        a aVar = new a(baseAppCompatActivity);
        this.f103320e = aVar;
        aVar.setOnClickListener(new h(this, 2));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(this, null), 1, (Object) null);
    }
}
