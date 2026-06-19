package com.bilibili.search2.result;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.pages.BiliMainSearchResultPage;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/w.class */
@StabilityInferred(parameters = 0)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f88592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SearchResultAllViewModel f88593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f88595d;

    public w(@NotNull View view, @NotNull SearchResultAllViewModel searchResultAllViewModel) {
        this.f88592a = view;
        this.f88593b = searchResultAllViewModel;
    }

    public final void a() {
        SearchResultAllViewModel searchResultAllViewModel = this.f88593b;
        Integer num = searchResultAllViewModel.f87251o;
        if (num != null && num.intValue() == 0) {
            StateFlow<SearchState> stateFlow = searchResultAllViewModel.f87499f;
            if (((SearchState) stateFlow.getValue()).isTeenagersMode() || ((SearchState) stateFlow.getValue()).getHasImmerseCard() || !(((SearchState) stateFlow.getValue()).getExtraWords().isEmpty() || this.f88594c)) {
                ListExtentionsKt.gone(this.f88592a);
                return;
            } else {
                ListExtentionsKt.visible(this.f88592a);
                return;
            }
        }
        Integer num2 = this.f88595d;
        int pageType = BiliMainSearchResultPage.PageTypes.PAGE_LIVE.getPageType();
        if (num2 == null || num2.intValue() != pageType) {
            int pageType2 = BiliMainSearchResultPage.PageTypes.PAGE_BANGUMI.getPageType();
            if (num2 == null || num2.intValue() != pageType2) {
                int pageType3 = BiliMainSearchResultPage.PageTypes.PAGE_MOVIE.getPageType();
                if (num2 == null || num2.intValue() != pageType3) {
                    ListExtentionsKt.gone(this.f88592a);
                    return;
                }
            }
        }
        ListExtentionsKt.visible(this.f88592a);
    }
}
