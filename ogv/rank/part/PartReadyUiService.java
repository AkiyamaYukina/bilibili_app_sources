package com.bilibili.ogv.rank.part;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bilibili.ogv.operation3.module.followable.CreateFavorModel$invoke$1;
import com.bilibili.ogv.operation3.module.followable.CreateFollowableSeasonModel$invoke$1;
import com.bilibili.ogv.rank.api.a;
import it0.C7615a;
import java.util.List;
import javax.inject.Inject;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.toast.ToasterKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import ml0.C8011b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/PartReadyUiService.class */
@StabilityInferred(parameters = 0)
public final class PartReadyUiService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f72035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.rank.api.a f72036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final o f72037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<q> f72038d = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LazyListState f72039e = new LazyListState(0, 0, 3, null);

    /* JADX INFO: renamed from: com.bilibili.ogv.rank.part.PartReadyUiService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/part/PartReadyUiService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final KomponentHostScope $scope;
        int label;
        final PartReadyUiService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PartReadyUiService partReadyUiService, KomponentHostScope komponentHostScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = partReadyUiService;
            this.$scope = komponentHostScope;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$scope, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PartReadyUiService partReadyUiService = this.this$0;
            List<a.c> list = partReadyUiService.f72036b.f71908a;
            KomponentHostScope komponentHostScope = this.$scope;
            for (final a.c cVar : list) {
                final o oVar = partReadyUiService.f72037c;
                partReadyUiService.f72038d.add(new q(komponentHostScope.embed(KomponentKt.Komponent(new Function1(oVar, cVar) { // from class: com.bilibili.ogv.rank.part.m

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final o f72095a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final a.c f72096b;

                    {
                        this.f72095a = oVar;
                        this.f72096b = cVar;
                    }

                    public final Object invoke(Object obj2) {
                        KomponentScope komponentScope = (KomponentScope) obj2;
                        o oVar2 = this.f72095a;
                        C8011b c8011b = oVar2.f72109a;
                        a.c cVar2 = this.f72096b;
                        C7615a c7615aA = c8011b.a(komponentScope, cVar2, null);
                        CreateFollowableSeasonModel$invoke$1 createFollowableSeasonModel$invoke$1A = oVar2.f72110b.a(komponentScope, cVar2);
                        com.bilibili.ogv.operation3.module.followable.b bVar = oVar2.f72111c;
                        bVar.f71332a.b(cVar2.f71917a, cVar2.f71926k);
                        return komponentScope.__setContent(new n(Unit.INSTANCE, komponentScope.getContext(), komponentScope, cVar2, createFollowableSeasonModel$invoke$1A, new CreateFavorModel$invoke$1(komponentScope, bVar, cVar2, (Toaster) komponentScope.getContext().getCompositionLocal(ToasterKt.getLocalToaster())), c7615aA));
                    }
                })), komponentHostScope, C5512a.f72040a));
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public PartReadyUiService(@NotNull KomponentScope<? super Unit> komponentScope, @NotNull com.bilibili.ogv.rank.api.a aVar, @NotNull o oVar) {
        this.f72035a = komponentScope;
        this.f72036b = aVar;
        this.f72037c = oVar;
        KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, KomponentHostScope.__sub$default(komponentScope, (Function0) null, 1, (Object) null), null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.Nullable androidx.compose.ui.Modifier r15, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r16, int r17) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.rank.part.PartReadyUiService.a(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
