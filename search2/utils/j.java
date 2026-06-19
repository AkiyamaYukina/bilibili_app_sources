package com.bilibili.search2.utils;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.common.search.SearchCardCoverType;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.SearchState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/j.class */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Pair<Integer, Integer> f88830a = new Pair<>(Integer.valueOf(ListExtentionsKt.toPx(172)), Integer.valueOf(ListExtentionsKt.toPx(97)));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/j$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88831a;

        static {
            int[] iArr = new int[SearchCardCoverType.values().length];
            try {
                iArr[SearchCardCoverType.COVER_BEYOND_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchCardCoverType.COVER_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchCardCoverType.COVER_NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[SearchCardCoverType.COVER_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[SearchCardCoverType.COVER_BEYOND_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f88831a = iArr;
        }
    }

    public static final int a(@Nullable Fragment fragment) {
        SearchResultAllViewModel searchResultAllViewModel;
        StateFlow<SearchState> stateFlow;
        SearchState searchState;
        SearchResultAll data;
        SearchResultAllFragment searchResultAllFragment = fragment instanceof SearchResultAllFragment ? (SearchResultAllFragment) fragment : null;
        return (searchResultAllFragment == null || (searchResultAllViewModel = (SearchResultAllViewModel) searchResultAllFragment.rf()) == null || (stateFlow = searchResultAllViewModel.f87499f) == null || (searchState = (SearchState) stateFlow.getValue()) == null || (data = searchState.getData()) == null) ? 0 : data.getCoverExp();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final double b(@Nullable Context context, @Nullable Fragment fragment) throws NoWhenBranchMatchedException {
        double coverExpSmall = 0.0d;
        if (fragment != null) {
            if (context == null) {
                coverExpSmall = 0.0d;
            } else {
                SearchResultAllFragment searchResultAllFragment = fragment instanceof SearchResultAllFragment ? (SearchResultAllFragment) fragment : null;
                coverExpSmall = 0.0d;
                if (searchResultAllFragment != null) {
                    SearchResultAllViewModel searchResultAllViewModel = (SearchResultAllViewModel) searchResultAllFragment.rf();
                    coverExpSmall = 0.0d;
                    if (searchResultAllViewModel != null) {
                        StateFlow<SearchState> stateFlow = searchResultAllViewModel.f87499f;
                        coverExpSmall = 0.0d;
                        if (stateFlow != null) {
                            SearchState searchState = (SearchState) stateFlow.getValue();
                            coverExpSmall = 0.0d;
                            if (searchState != null) {
                                SearchResultAll data = searchState.getData();
                                coverExpSmall = 0.0d;
                                if (data != null) {
                                    int i7 = a.f88831a[c(context).ordinal()];
                                    coverExpSmall = 0.0d;
                                    if (i7 != 1) {
                                        if (i7 == 2) {
                                            coverExpSmall = data.getCoverExpSmall();
                                        } else if (i7 == 3) {
                                            coverExpSmall = data.getCoverExpNormal();
                                        } else if (i7 == 4) {
                                            coverExpSmall = data.getCoverExpLarge();
                                        } else {
                                            if (i7 != 5) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            coverExpSmall = 0.0d;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return coverExpSmall;
    }

    @NotNull
    public static final SearchCardCoverType c(@Nullable Context context) {
        if (context == null) {
            return SearchCardCoverType.COVER_NORMAL;
        }
        int i7 = context.getResources().getConfiguration().screenWidthDp;
        return (i7 < 0 || i7 >= 360) ? (360 > i7 || i7 >= 390) ? (390 > i7 || i7 >= 430) ? (430 > i7 || i7 >= 480) ? SearchCardCoverType.COVER_BEYOND_LARGE : SearchCardCoverType.COVER_LARGE : SearchCardCoverType.COVER_NORMAL : SearchCardCoverType.COVER_SMALL : SearchCardCoverType.COVER_BEYOND_SMALL;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final Pair d(@Nullable Context context, @Nullable Fragment fragment) throws NoWhenBranchMatchedException {
        Pair<Integer, Integer> pair;
        if (fragment == null || context == null) {
            return new Pair(Integer.valueOf(ListExtentionsKt.toPx(172)), Integer.valueOf(ListExtentionsKt.toPx(97)));
        }
        SearchCardCoverType searchCardCoverTypeC = c(context);
        int i7 = context.getResources().getDisplayMetrics().widthPixels;
        int i8 = a.f88831a[searchCardCoverTypeC.ordinal()];
        Pair<Integer, Integer> pair2 = f88830a;
        if (i8 == 1) {
            int iA = a(fragment);
            pair = (iA == 1 || iA == 2 || iA == 3 || iA == 100) ? new Pair<>(Integer.valueOf(ListExtentionsKt.toPx(160)), Integer.valueOf(ListExtentionsKt.toPx(120))) : pair2;
        } else if (i8 == 2 || i8 == 3 || i8 == 4) {
            int iA2 = a(fragment);
            if (iA2 == 1) {
                pair = new Pair<>(Integer.valueOf(ListExtentionsKt.toPx(129)), Integer.valueOf(ListExtentionsKt.toPx(97)));
            } else if (iA2 == 2) {
                pair = new Pair<>(Integer.valueOf(ListExtentionsKt.toPx(150)), Integer.valueOf(ListExtentionsKt.toPx(113)));
            } else if (iA2 == 3) {
                pair = new Pair<>(Integer.valueOf(ListExtentionsKt.toPx(172)), Integer.valueOf(ListExtentionsKt.toPx(129)));
            } else if (iA2 != 100) {
                pair = pair2;
            } else {
                double dB = b(context, fragment) * ((double) i7);
                pair = new Pair<>(Integer.valueOf((int) dB), Integer.valueOf((int) ((dB * 3.0d) / 4.0d)));
            }
        } else {
            if (i8 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int iA3 = a(fragment);
            if (iA3 == 1 || iA3 == 2 || iA3 == 3 || iA3 == 100) {
                Pair<Integer, Integer> pairA = s.a(context, CoverAspectRatio.RATIO_4_3, true, false, 18);
                pair = pairA;
                if (pairA == null) {
                    pair = new Pair<>(Integer.valueOf(ListExtentionsKt.toPx(172)), Integer.valueOf(ListExtentionsKt.toPx(129)));
                }
            } else {
                pair = s.a(context, CoverAspectRatio.RATIO_16_9, true, false, 18);
                if (pair == null) {
                    pair = pair2;
                }
            }
        }
        return pair;
    }
}
