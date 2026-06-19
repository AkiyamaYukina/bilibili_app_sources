package com.bilibili.ship.theseus.united.page.interactvideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import com.bilibili.ship.theseus.united.page.toolbar.ToolbarRepository;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/x.class */
@StabilityInferred(parameters = 0)
public final class x implements TheseusInteractVideoService.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f100011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ToolbarRepository f100012b;

    @Inject
    public x(@NotNull rW0.a<InterfaceC7008a> aVar, @NotNull ToolbarRepository toolbarRepository) {
        this.f100011a = aVar;
        this.f100012b = toolbarRepository;
    }

    @Override // com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.c
    @Nullable
    public final Object a(@NotNull TheseusInteractVideoService theseusInteractVideoService, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    @Override // com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.c
    @Nullable
    public final Object b(boolean z6, @NotNull v vVar, @NotNull Continuation continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UnitedInteractVideoStrategy$keepToolbarAsOptionPanel$2(this, z6, vVar, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    @Override // com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.c
    public final void c() {
        ((InterfaceC7008a) this.f100011a.get()).a();
    }
}
