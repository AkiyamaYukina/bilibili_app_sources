package com.bilibili.tgwt.filmselection;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.ogvcommon.deprecated.EmptyStateView;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/filmselection/FilmSelectionFragment.class */
@StabilityInferred(parameters = 0)
public final class FilmSelectionFragment extends MovieCardListFragment {
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f111166i;

    @Override // com.bilibili.tgwt.filmselection.MovieCardListFragment
    public final void kf(int i7, @NotNull l lVar, @NotNull m mVar) {
        if (i7 == 1) {
            EmptyStateView emptyStateViewJf = jf();
            int i8 = EmptyStateView.f73157k;
            emptyStateViewJf.b(0, false);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new FilmSelectionFragment$loadDataImpl$1(this, i7, lVar, mVar, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    @Override // com.bilibili.tgwt.filmselection.MovieCardListFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lf(@org.jetbrains.annotations.NotNull com.bilibili.tgwt.api.MovieCardListVo.Item r7) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.filmselection.FilmSelectionFragment.lf(com.bilibili.tgwt.api.MovieCardListVo$Item):void");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.h = arguments.getString("type", "1");
        }
    }

    @Override // com.bilibili.tgwt.filmselection.MovieCardListFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        loadData();
    }
}
