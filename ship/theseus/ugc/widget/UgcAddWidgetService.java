package com.bilibili.ship.theseus.ugc.widget;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/widget/UgcAddWidgetService.class */
@StabilityInferred(parameters = 0)
public final class UgcAddWidgetService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98720a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.widget.UgcAddWidgetService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/widget/UgcAddWidgetService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final FragmentActivity $activity;
        final com.bilibili.ship.theseus.united.page.view.a $archiveRepository;
        final TheseusFloatLayerService $floatLayerService;
        final a $initial;
        final c $screenStateRepository;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusFloatLayerService theseusFloatLayerService, FragmentActivity fragmentActivity, c cVar, a aVar, com.bilibili.ship.theseus.united.page.view.a aVar2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$floatLayerService = theseusFloatLayerService;
            this.$activity = fragmentActivity;
            this.$screenStateRepository = cVar;
            this.$initial = aVar;
            this.$archiveRepository = aVar2;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$floatLayerService, this.$activity, this.$screenStateRepository, this.$initial, this.$archiveRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x010a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.widget.UgcAddWidgetService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/widget/UgcAddWidgetService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98721a;

        public a(boolean z6) {
            this.f98721a = z6;
        }
    }

    @Inject
    public UgcAddWidgetService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull FragmentActivity fragmentActivity, @NotNull a aVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull c cVar) {
        this.f98720a = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(theseusFloatLayerService, fragmentActivity, cVar, aVar, aVar2, null), 3, (Object) null);
    }
}
