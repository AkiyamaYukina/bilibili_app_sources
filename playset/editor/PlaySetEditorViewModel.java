package com.bilibili.playset.editor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import javax.inject.Inject;
import js0.C7722d;
import js0.InterfaceC7720b;
import js0.InterfaceC7721c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/PlaySetEditorViewModel.class */
@StabilityInferred(parameters = 0)
public final class PlaySetEditorViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final J f84794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<C7722d> f84795b;

    @Inject
    public PlaySetEditorViewModel(@NotNull J j7) {
        this.f84794a = j7;
        this.f84795b = FlowKt.stateIn(j7.getState(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), new C7722d(InterfaceC7720b.d.f122575a));
    }

    public final void I0(@NotNull InterfaceC7721c interfaceC7721c) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PlaySetEditorViewModel$dispatch$1(this, interfaceC7721c, null), 3, (Object) null);
    }
}
