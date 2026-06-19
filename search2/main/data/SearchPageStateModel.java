package com.bilibili.search2.main.data;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bilibili.search2.api.DefaultKeyword;
import com.bilibili.search2.main.data.h;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel.class */
@StabilityInferred(parameters = 0)
public final class SearchPageStateModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ShowFragmentState> f86754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<c> f86755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l<b> f86756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f86757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<DefaultKeyword> f86758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f86759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final l<a> f86760g;

    @NotNull
    public final MutableLiveData<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f86765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86766n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86767o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86768p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86770r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f86771s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<e> f86772t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MediatorLiveData f86773u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<DisplayPage> f86774v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final SharedFlow<DisplayPage> f86775w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f86776x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final d f86777y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$DisplayPage.class */
    public static final class DisplayPage {
        private static final EnumEntries $ENTRIES;
        private static final DisplayPage[] $VALUES;
        public static final DisplayPage DISCOVER = new DisplayPage("DISCOVER", 0);
        public static final DisplayPage SUGGEST = new DisplayPage("SUGGEST", 1);
        public static final DisplayPage RESULT = new DisplayPage("RESULT", 2);

        private static final /* synthetic */ DisplayPage[] $values() {
            return new DisplayPage[]{DISCOVER, SUGGEST, RESULT};
        }

        static {
            DisplayPage[] displayPageArr$values = $values();
            $VALUES = displayPageArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(displayPageArr$values);
        }

        private DisplayPage(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<DisplayPage> getEntries() {
            return $ENTRIES;
        }

        public static DisplayPage valueOf(String str) {
            return (DisplayPage) Enum.valueOf(DisplayPage.class, str);
        }

        public static DisplayPage[] values() {
            return (DisplayPage[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$ElevationValue.class */
    public static final class ElevationValue {
        private static final EnumEntries $ENTRIES;
        private static final ElevationValue[] $VALUES;
        public static final ElevationValue DISCOVER_ELEVATION = new ElevationValue("DISCOVER_ELEVATION", 0, 2);
        public static final ElevationValue RESULT_ELEVATION = new ElevationValue("RESULT_ELEVATION", 1, 0);
        private int value;

        private static final /* synthetic */ ElevationValue[] $values() {
            return new ElevationValue[]{DISCOVER_ELEVATION, RESULT_ELEVATION};
        }

        static {
            ElevationValue[] elevationValueArr$values = $values();
            $VALUES = elevationValueArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(elevationValueArr$values);
        }

        private ElevationValue(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<ElevationValue> getEntries() {
            return $ENTRIES;
        }

        public static ElevationValue valueOf(String str) {
            return (ElevationValue) Enum.valueOf(ElevationValue.class, str);
        }

        public static ElevationValue[] values() {
            return (ElevationValue[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public final void setValue(int i7) {
            this.value = i7;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$SearchPageState.class */
    public static final class SearchPageState {
        private static final EnumEntries $ENTRIES;
        private static final SearchPageState[] $VALUES;
        public static final SearchPageState DISCOVER = new SearchPageState("DISCOVER", 0);
        public static final SearchPageState RESULT = new SearchPageState("RESULT", 1);
        public static final SearchPageState SUG = new SearchPageState("SUG", 2);

        private static final /* synthetic */ SearchPageState[] $values() {
            return new SearchPageState[]{DISCOVER, RESULT, SUG};
        }

        static {
            SearchPageState[] searchPageStateArr$values = $values();
            $VALUES = searchPageStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(searchPageStateArr$values);
        }

        private SearchPageState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<SearchPageState> getEntries() {
            return $ENTRIES;
        }

        public static SearchPageState valueOf(String str) {
            return (SearchPageState) Enum.valueOf(SearchPageState.class, str);
        }

        public static SearchPageState[] values() {
            return (SearchPageState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$ShowFragmentState.class */
    public static final class ShowFragmentState {
        private static final EnumEntries $ENTRIES;
        private static final ShowFragmentState[] $VALUES;
        public static final ShowFragmentState DISCOVER = new ShowFragmentState("DISCOVER", 0);
        public static final ShowFragmentState RESULT = new ShowFragmentState("RESULT", 1);

        private static final /* synthetic */ ShowFragmentState[] $values() {
            return new ShowFragmentState[]{DISCOVER, RESULT};
        }

        static {
            ShowFragmentState[] showFragmentStateArr$values = $values();
            $VALUES = showFragmentStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(showFragmentStateArr$values);
        }

        private ShowFragmentState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ShowFragmentState> getEntries() {
            return $ENTRIES;
        }

        public static ShowFragmentState valueOf(String str) {
            return (ShowFragmentState) Enum.valueOf(ShowFragmentState.class, str);
        }

        public static ShowFragmentState[] values() {
            return (ShowFragmentState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f86778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Uri f86779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f86780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f86781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f86782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f86783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final Integer f86784g;

        @Nullable
        public final Integer h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f86785i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final Long f86786j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final Long f86787k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f86788l;

        public a(@Nullable String str, @Nullable Uri uri, @Nullable String str2, @Nullable String str3, int i7, boolean z6, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable Long l7, @Nullable Long l8, boolean z7) {
            this.f86778a = str;
            this.f86779b = uri;
            this.f86780c = str2;
            this.f86781d = str3;
            this.f86782e = i7;
            this.f86783f = z6;
            this.f86784g = num;
            this.h = num2;
            this.f86785i = str4;
            this.f86786j = l7;
            this.f86787k = l8;
            this.f86788l = z7;
        }

        public /* synthetic */ a(String str, Uri uri, String str2, String str3, boolean z6, Integer num, Integer num2, String str4, Long l7, Long l8, int i7) {
            this(str, uri, str2, (i7 & 8) != 0 ? null : str3, 0, (i7 & 32) != 0 ? false : z6, (i7 & 64) != 0 ? null : num, (i7 & 128) != 0 ? null : num2, (i7 & 256) != 0 ? null : str4, (i7 & 512) != 0 ? null : l7, (i7 & 1024) != 0 ? null : l8, true);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86790b;

        public b(boolean z6, boolean z7, int i7) {
            z7 = (i7 & 2) != 0 ? false : z7;
            this.f86789a = z6;
            this.f86790b = z7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f86791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f86792b;

        public /* synthetic */ c() {
            this(false, false);
        }

        public c(boolean z6, boolean z7) {
            this.f86791a = z6;
            this.f86792b = z7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/SearchPageStateModel$d.class */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchPageStateModel f86793a;

        public d(SearchPageStateModel searchPageStateModel) {
            this.f86793a = searchPageStateModel;
        }

        public final void a(DefaultKeyword defaultKeyword) {
            this.f86793a.f86758e.setValue(defaultKeyword);
        }
    }

    public SearchPageStateModel() {
        MutableLiveData<ShowFragmentState> mutableLiveData = new MutableLiveData<>();
        this.f86754a = mutableLiveData;
        this.f86755b = new MutableLiveData<>();
        l<b> lVar = new l<>();
        this.f86756c = lVar;
        this.f86757d = new MutableLiveData<>();
        this.f86758e = new MutableLiveData<>();
        this.f86759f = new MutableLiveData<>();
        this.f86760g = new l<>();
        this.h = new MutableLiveData<>();
        this.f86761i = new MutableLiveData<>();
        this.f86762j = new MutableLiveData<>();
        this.f86763k = new MutableLiveData<>();
        this.f86764l = new MutableLiveData<>();
        this.f86765m = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f86766n = new MutableLiveData<>();
        this.f86767o = new MutableLiveData<>();
        this.f86768p = new MutableLiveData<>();
        this.f86769q = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        this.f86770r = new MutableLiveData<>(bool);
        this.f86771s = new MutableLiveData<>(bool);
        this.f86772t = new MutableLiveData<>(new e(0));
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        mediatorLiveData.addSource(lVar, new h.a(new W.i(booleanRef, 1, mediatorLiveData, this)));
        mediatorLiveData.addSource(mutableLiveData, new h.a(new KJ0.f(1, mediatorLiveData, booleanRef)));
        this.f86773u = mediatorLiveData;
        MutableSharedFlow<DisplayPage> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f86774v = mutableSharedFlowMutableSharedFlow$default;
        this.f86775w = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.f86777y = new d(this);
    }
}
