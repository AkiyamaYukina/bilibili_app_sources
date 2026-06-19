package com.bilibili.search2.result.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/SearchColorModel.class */
@StabilityInferred(parameters = 0)
public final class SearchColorModel extends ViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f88296f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f88302m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88291a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f88292b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<a> f88293c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f88294d = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f88297g = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<Boolean> h = new MutableLiveData<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f88298i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f88299j = new MutableLiveData<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<DestroyOgvData> f88300k = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f88301l = new MutableLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f88303n = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<com.bilibili.search2.main.ogv.a> f88304o = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f88305p = new MutableLiveData<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/SearchColorModel$DestroyOgvData.class */
    public static final class DestroyOgvData {
        private static final EnumEntries $ENTRIES;
        private static final DestroyOgvData[] $VALUES;
        public static final DestroyOgvData DESTROY = new DestroyOgvData("DESTROY", 0);

        private static final /* synthetic */ DestroyOgvData[] $values() {
            return new DestroyOgvData[]{DESTROY};
        }

        static {
            DestroyOgvData[] destroyOgvDataArr$values = $values();
            $VALUES = destroyOgvDataArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(destroyOgvDataArr$values);
        }

        private DestroyOgvData(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<DestroyOgvData> getEntries() {
            return $ENTRIES;
        }

        public static DestroyOgvData valueOf(String str) {
            return (DestroyOgvData) Enum.valueOf(DestroyOgvData.class, str);
        }

        public static DestroyOgvData[] values() {
            return (DestroyOgvData[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/SearchColorModel$StateSource.class */
    public static final class StateSource {
        private static final EnumEntries $ENTRIES;
        private static final StateSource[] $VALUES;
        public static final StateSource SLIDE = new StateSource("SLIDE", 0);
        public static final StateSource LOADING = new StateSource("LOADING", 1);
        public static final StateSource DRAW = new StateSource("DRAW", 2);

        private static final /* synthetic */ StateSource[] $values() {
            return new StateSource[]{SLIDE, LOADING, DRAW};
        }

        static {
            StateSource[] stateSourceArr$values = $values();
            $VALUES = stateSourceArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateSourceArr$values);
        }

        private StateSource(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<StateSource> getEntries() {
            return $ENTRIES;
        }

        public static StateSource valueOf(String str) {
            return (StateSource) Enum.valueOf(StateSource.class, str);
        }

        public static StateSource[] values() {
            return (StateSource[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/SearchColorModel$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f88306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f88307b;

        public a(float f7, int i7) {
            this.f88306a = f7;
            this.f88307b = i7;
        }
    }
}
