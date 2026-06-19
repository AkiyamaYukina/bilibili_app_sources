package com.bilibili.search2.main;

import Bl.i1;
import Bl.j1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.bilibili.base.BiliContext;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.pageview.model.PageViewsEvent;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.SearchSquareType;
import com.bilibili.search2.discover.SquareTypes;
import com.bilibili.search2.main.data.SearchUserActManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.section.adapter.BaseSectionAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/I.class */
@StabilityInferred(parameters = 0)
public final class I extends BaseSectionAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MainSearchViewModel f86714e;

    public I(@NotNull MainSearchViewModel mainSearchViewModel) {
        this.f86714e = mainSearchViewModel;
    }

    public static void O(I i7) {
        MainSearchViewModel mainSearchViewModel = i7.f86714e;
        mainSearchViewModel.getClass();
        String accessKey = BiliAccounts.get(BiliContext.application()).getAccessKey();
        PageViewsEvent lastEndPv = PageViewTracker.getInstance().getLastEndPv();
        String str = lastEndPv != null ? lastEndPv.eventId : null;
        Map map = lastEndPv != null ? lastEndPv.extra : null;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(mainSearchViewModel), (CoroutineContext) null, (CoroutineStart) null, new MainSearchViewModel$requestUpdateGuess$1(mainSearchViewModel, accessKey, 2, 1, str, map != null ? (String) map.get(GameCardButton.extraAvid) : null, map != null ? (String) map.get("query") : null, SearchUserActManager.b(), "", null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Type inference failed for: r0v14, types: [Vt0.C, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [Ut0.h, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bindHolder(@org.jetbrains.annotations.NotNull tv.danmaku.bili.widget.section.holder.BaseViewHolder r9, int r10, @org.jetbrains.annotations.Nullable android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.I.bindHolder(tv.danmaku.bili.widget.section.holder.BaseViewHolder, int, android.view.View):void");
    }

    @Nullable
    public final BaseViewHolder createHolder(@NotNull ViewGroup viewGroup, int i7) {
        return i7 != 1 ? i7 != 2 ? null : new Vt0.C(i1.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this) : new Ut0.h(j1.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this);
    }

    public final void fillSectionList(@NotNull BaseSectionAdapter.SectionManager sectionManager) {
        List<SearchSquareType> list = ((com.bilibili.search2.main.data.i) this.f86714e.f86734g.getValue()).f86820a;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    SearchSquareType searchSquareType = (SearchSquareType) obj;
                    if (Intrinsics.areEqual(searchSquareType.getType(), SquareTypes.TRENDING.getType()) || Intrinsics.areEqual(searchSquareType.getType(), SquareTypes.RECOMMEND.getType())) {
                        arrayList.add(obj);
                    }
                }
                int i7 = 0;
                for (Object obj2 : arrayList) {
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SearchSquareType searchSquareType2 = (SearchSquareType) obj2;
                    List<?> list2 = searchSquareType2.getList();
                    int i8 = 1;
                    int i9 = (list2 == null || list2.isEmpty()) ? 0 : 1;
                    String type = searchSquareType2.getType();
                    if (!Intrinsics.areEqual(SquareTypes.TRENDING.getType(), type)) {
                        i8 = Intrinsics.areEqual(SquareTypes.RECOMMEND.getType(), type) ? 2 : -1;
                    }
                    addSection(i7, new BaseSectionAdapter.Section(i9, i8, -1, -1));
                    i7++;
                }
            }
        }
    }
}
