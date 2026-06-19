package com.bilibili.pegasus.components.customreporter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.pegasus.Action;
import com.bilibili.pegasus.data.request.LoadMoreCompleteAction;
import com.bilibili.pegasus.data.request.RefreshCompleteAction;
import com.bilibili.pegasus.vm.C5770e;
import com.bilibili.pegasus.vm.LoadMoreAction;
import com.bilibili.pegasus.vm.PegasusViewModel;
import com.bilibili.pegasus.vm.RefreshAction;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/e.class */
@StabilityInferred(parameters = 0)
public final class e implements com.bilibili.pegasus.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<d> f75940a = StateFlowKt.MutableStateFlow((Object) null);

    public e(@NotNull PegasusViewModel pegasusViewModel) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(pegasusViewModel), (CoroutineContext) null, (CoroutineStart) null, new OfflineLogMiddleware$1(this, null), 3, (Object) null);
    }

    @Nullable
    public final Object a(@NotNull Action action, @NotNull Continuation<? super Action> continuation) {
        boolean z6 = action instanceof RefreshAction;
        MutableStateFlow<d> mutableStateFlow = this.f75940a;
        if (z6) {
            mutableStateFlow.setValue(new d(System.currentTimeMillis(), ((RefreshAction) action).f79048a.f123311c.getValue()));
        } else if (action instanceof LoadMoreAction) {
            mutableStateFlow.setValue(new d(System.currentTimeMillis(), ((LoadMoreAction) action).f79007a.f123311c.getValue()));
        } else {
            d dVarA = null;
            if (action instanceof C5770e) {
                d dVar = (d) mutableStateFlow.getValue();
                d dVarA2 = null;
                if (dVar != null) {
                    dVarA2 = d.a(dVar, Boxing.boxLong(System.currentTimeMillis()), Boxing.boxBoolean(false));
                }
                mutableStateFlow.setValue(dVarA2);
            } else if ((action instanceof RefreshCompleteAction) || (action instanceof LoadMoreCompleteAction)) {
                d dVar2 = (d) mutableStateFlow.getValue();
                if (dVar2 != null) {
                    dVarA = d.a(dVar2, Boxing.boxLong(System.currentTimeMillis()), Boxing.boxBoolean(true));
                }
                mutableStateFlow.setValue(dVarA);
            }
        }
        return action;
    }
}
