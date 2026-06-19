package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpRepository.class */
@StabilityInferred(parameters = 0)
public final class RecommendUpRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f97795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97796c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<LoadState> f97797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<LoadState> f97798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<List<RecommendUp>> f97799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f97800g;

    @Nullable
    public String h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpRepository$LoadState.class */
    public static final class LoadState {
        private static final EnumEntries $ENTRIES;
        private static final LoadState[] $VALUES;
        public static final LoadState NONE = new LoadState("NONE", 0);
        public static final LoadState LOADING = new LoadState("LOADING", 1);
        public static final LoadState NO_MORE = new LoadState("NO_MORE", 2);

        private static final /* synthetic */ LoadState[] $values() {
            return new LoadState[]{NONE, LOADING, NO_MORE};
        }

        static {
            LoadState[] loadStateArr$values = $values();
            $VALUES = loadStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(loadStateArr$values);
        }

        private LoadState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<LoadState> getEntries() {
            return $ENTRIES;
        }

        public static LoadState valueOf(String str) {
            return (LoadState) Enum.valueOf(LoadState.class, str);
        }

        public static LoadState[] values() {
            return (LoadState[]) $VALUES.clone();
        }
    }

    @Inject
    public RecommendUpRepository(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar) {
        this.f97794a = coroutineScope;
        this.f97795b = dVar;
        MutableStateFlow<LoadState> MutableStateFlow = StateFlowKt.MutableStateFlow(LoadState.NONE);
        this.f97797d = MutableStateFlow;
        this.f97798e = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<RecommendUp>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.f97799f = MutableStateFlow2;
        this.f97800g = MutableStateFlow2;
    }

    public static final void a(RecommendUpRepository recommendUpRepository, RecommendUpData recommendUpData) {
        MutableStateFlow<LoadState> mutableStateFlow = recommendUpRepository.f97797d;
        if (recommendUpData == null) {
            BLog.e("RecommendUpRepository-handleRecommendUpData", "[theseus-ugc-RecommendUpRepository-handleRecommendUpData] handleRecommendUpData, data is null", (Throwable) null);
            mutableStateFlow.setValue(LoadState.NO_MORE);
            return;
        }
        if (recommendUpData.a().size() < 2 && recommendUpRepository.f97796c > 1) {
            com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-ugc-RecommendUpRepository-handleRecommendUpData] ", C3259x.a(recommendUpData.a().size(), "handleRecommendUpData, data size "), "RecommendUpRepository-handleRecommendUpData", (Throwable) null);
            mutableStateFlow.setValue(LoadState.NO_MORE);
            return;
        }
        ArrayList arrayList = new ArrayList((List) recommendUpRepository.f97800g.getValue());
        int size = arrayList.size();
        BLog.i("RecommendUpRepository-handleRecommendUpData", "[theseus-ugc-RecommendUpRepository-handleRecommendUpData] " + G.f.a(size, recommendUpData.a().size(), "handleRecommendUpData, ", " "));
        int i7 = 0;
        for (Object obj : recommendUpData.a()) {
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RecommendUp recommendUp = (RecommendUp) obj;
            recommendUp.f97754i = i7 + size + 1;
            recommendUp.h = recommendUpData.b();
            i7++;
        }
        arrayList.addAll(recommendUpData.a());
        recommendUpRepository.f97796c++;
        recommendUpRepository.h = recommendUpData.c();
        recommendUpRepository.f97799f.setValue(arrayList);
        mutableStateFlow.setValue(LoadState.NONE);
    }

    public final void b() {
        LoadState loadState = (LoadState) this.f97798e.getValue();
        LoadState loadState2 = LoadState.LOADING;
        if (loadState == loadState2) {
            BLog.i("RecommendUpRepository-requestRecommendUp", "[theseus-ugc-RecommendUpRepository-requestRecommendUp] requestRecommendUps, requesting");
            return;
        }
        this.f97797d.setValue(loadState2);
        BuildersKt.launch$default(this.f97794a, (CoroutineContext) null, (CoroutineStart) null, new RecommendUpRepository$requestRecommendUp$1(this, null), 3, (Object) null);
    }
}
