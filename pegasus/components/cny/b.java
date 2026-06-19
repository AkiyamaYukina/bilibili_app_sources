package com.bilibili.pegasus.components.cny;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.BasePegasusComponent;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/cny/b.class */
@StabilityInferred(parameters = 0)
public final class b extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75909k = "tab_patch_report_component";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f75910l;

    @NotNull
    public final String getComponentName() {
        return this.f75909k;
    }

    public final void onVisibleStateChangedSimplified(boolean z6) {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleCoroutineScope lifecycleScope2;
        super.onVisibleStateChangedSimplified(z6);
        if (!z6 || this.f75910l) {
            return;
        }
        this.f75910l = true;
        Fragment fragment = getFragment();
        if (fragment != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
            BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new TabPatchReportComponent$reportTabPatch$1(null), 3, (Object) null);
        }
        Fragment fragment2 = getFragment();
        if (fragment2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment2)) == null) {
            return;
        }
        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new TabPatchReportComponent$reportTabPatch$2(null), 3, (Object) null);
    }
}
