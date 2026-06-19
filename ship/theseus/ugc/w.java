package com.bilibili.ship.theseus.ugc;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.ugcanymodel.ElecRank;
import com.bapis.bilibili.app.viewunite.ugcanymodel.ElecRankItem;
import com.bapis.bilibili.app.viewunite.ugcanymodel.UgcSeasonConf;
import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/w.class */
@StabilityInferred(parameters = 0)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<String> f98560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<String> f98561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f98562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<a> f98563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<x> f98564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SharedFlow<x> f98565g;

    @Inject
    public w(@NotNull CoroutineScope coroutineScope, @Nullable ViewUgcAny viewUgcAny, @NotNull E e7) {
        a aVar;
        ElecRank elecRank;
        this.f98559a = coroutineScope;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.f98560b = MutableStateFlow;
        this.f98561c = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<a> MutableStateFlow2 = StateFlowKt.MutableStateFlow((Object) null);
        this.f98562d = MutableStateFlow2;
        this.f98563e = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<x> MutableStateFlow3 = StateFlowKt.MutableStateFlow((Object) null);
        this.f98564f = MutableStateFlow3;
        this.f98565g = FlowKt.asSharedFlow(MutableStateFlow3);
        String shortLink = "";
        if (viewUgcAny != null) {
            shortLink = viewUgcAny.getShortLink();
            if (shortLink == null) {
                shortLink = "";
            }
        }
        MutableStateFlow.setValue(shortLink);
        if (viewUgcAny == null || (elecRank = viewUgcAny.getElecRank()) == null) {
            aVar = null;
        } else {
            long count = elecRank.getCount();
            List<ElecRankItem> listList = elecRank.getListList();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listList, 10));
            for (ElecRankItem elecRankItem : listList) {
                arrayList.add(new b(elecRankItem.getAvatar(), elecRankItem.getNickname(), elecRankItem.getMessage(), elecRankItem.getMid()));
            }
            aVar = new a(count, elecRank.getText(), arrayList, elecRank.getHideCount());
        }
        MutableStateFlow2.setValue(aVar);
        e7.f101467q = (String) this.f98560b.getValue();
        MutableStateFlow<x> mutableStateFlow = this.f98564f;
        x xVar = null;
        if (viewUgcAny != null) {
            UgcSeasonConf ugcSeasonConf = viewUgcAny.getUgcSeasonConf();
            xVar = null;
            if (ugcSeasonConf != null) {
                xVar = new x(ugcSeasonConf.getSeasonUnfold(), ugcSeasonConf.getFoldTime());
            }
        }
        mutableStateFlow.setValue(xVar);
    }
}
