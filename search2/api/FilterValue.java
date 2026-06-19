package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.polymer.app.search.v1.CategorySort;
import com.bapis.bilibili.polymer.app.search.v1.FilterValue;
import com.bapis.bilibili.polymer.app.search.v1.Sort;
import com.bapis.bilibili.polymer.app.search.v1.UserSort;
import com.bapis.bilibili.polymer.app.search.v1.UserType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/FilterValue.class */
@StabilityInferred(parameters = 0)
@Keep
public final class FilterValue {
    public static final int $stable = 8;

    @Nullable
    private CategorySort categorySort;

    @Nullable
    private String param;

    @Nullable
    private Sort sort;

    @Nullable
    private String subModuleForNeuron;

    @Nullable
    private UserSort userSort;

    @Nullable
    private UserType userType;

    @Nullable
    private String value;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/FilterValue$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f86277a;

        static {
            int[] iArr = new int[FilterValue.FilterParamCase.values().length];
            try {
                iArr[FilterValue.FilterParamCase.PARAM.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[FilterValue.FilterParamCase.SORT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[FilterValue.FilterParamCase.USER_SORT.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[FilterValue.FilterParamCase.CATEGORY_SORT.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[FilterValue.FilterParamCase.USER_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f86277a = iArr;
        }
    }

    public FilterValue() {
        this(null, null, null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public FilterValue(@NotNull com.bapis.bilibili.polymer.app.search.v1.FilterValue filterValue) {
        this(null, null, null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
        this.value = filterValue.getValue();
        this.subModuleForNeuron = filterValue.getSubModuleForNeuron();
        FilterValue.FilterParamCase filterParamCase = filterValue.getFilterParamCase();
        int i7 = filterParamCase == null ? -1 : a.f86277a[filterParamCase.ordinal()];
        if (i7 == 1) {
            this.param = filterValue.getParam();
            return;
        }
        if (i7 == 2) {
            this.sort = filterValue.getSort();
            return;
        }
        if (i7 == 3) {
            this.userSort = filterValue.getUserSort();
        } else if (i7 == 4) {
            this.categorySort = filterValue.getCategorySort();
        } else {
            if (i7 != 5) {
                return;
            }
            this.userType = filterValue.getUserType();
        }
    }

    public FilterValue(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Sort sort, @Nullable UserSort userSort, @Nullable CategorySort categorySort, @Nullable UserType userType) {
        this.value = str;
        this.param = str2;
        this.subModuleForNeuron = str3;
        this.sort = sort;
        this.userSort = userSort;
        this.categorySort = categorySort;
        this.userType = userType;
    }

    public /* synthetic */ FilterValue(String str, String str2, String str3, Sort sort, UserSort userSort, CategorySort categorySort, UserType userType, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : sort, (i7 & 16) != 0 ? null : userSort, (i7 & 32) != 0 ? null : categorySort, (i7 & 64) != 0 ? null : userType);
    }

    public static /* synthetic */ FilterValue copy$default(FilterValue filterValue, String str, String str2, String str3, Sort sort, UserSort userSort, CategorySort categorySort, UserType userType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = filterValue.value;
        }
        if ((i7 & 2) != 0) {
            str2 = filterValue.param;
        }
        if ((i7 & 4) != 0) {
            str3 = filterValue.subModuleForNeuron;
        }
        if ((i7 & 8) != 0) {
            sort = filterValue.sort;
        }
        if ((i7 & 16) != 0) {
            userSort = filterValue.userSort;
        }
        if ((i7 & 32) != 0) {
            categorySort = filterValue.categorySort;
        }
        if ((i7 & 64) != 0) {
            userType = filterValue.userType;
        }
        return filterValue.copy(str, str2, str3, sort, userSort, categorySort, userType);
    }

    @Nullable
    public final String component1() {
        return this.value;
    }

    @Nullable
    public final String component2() {
        return this.param;
    }

    @Nullable
    public final String component3() {
        return this.subModuleForNeuron;
    }

    @Nullable
    public final Sort component4() {
        return this.sort;
    }

    @Nullable
    public final UserSort component5() {
        return this.userSort;
    }

    @Nullable
    public final CategorySort component6() {
        return this.categorySort;
    }

    @Nullable
    public final UserType component7() {
        return this.userType;
    }

    @NotNull
    public final FilterValue copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Sort sort, @Nullable UserSort userSort, @Nullable CategorySort categorySort, @Nullable UserType userType) {
        return new FilterValue(str, str2, str3, sort, userSort, categorySort, userType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterValue)) {
            return false;
        }
        FilterValue filterValue = (FilterValue) obj;
        return Intrinsics.areEqual(this.value, filterValue.value) && Intrinsics.areEqual(this.param, filterValue.param) && Intrinsics.areEqual(this.subModuleForNeuron, filterValue.subModuleForNeuron) && this.sort == filterValue.sort && this.userSort == filterValue.userSort && this.categorySort == filterValue.categorySort && this.userType == filterValue.userType;
    }

    @Nullable
    public final CategorySort getCategorySort() {
        return this.categorySort;
    }

    @Nullable
    public final String getParam() {
        return this.param;
    }

    @Nullable
    public final Sort getSort() {
        return this.sort;
    }

    @Nullable
    public final String getSubModuleForNeuron() {
        return this.subModuleForNeuron;
    }

    @Nullable
    public final UserSort getUserSort() {
        return this.userSort;
    }

    @Nullable
    public final UserType getUserType() {
        return this.userType;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.param;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.subModuleForNeuron;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Sort sort = this.sort;
        int iHashCode5 = sort == null ? 0 : sort.hashCode();
        UserSort userSort = this.userSort;
        int iHashCode6 = userSort == null ? 0 : userSort.hashCode();
        CategorySort categorySort = this.categorySort;
        int iHashCode7 = categorySort == null ? 0 : categorySort.hashCode();
        UserType userType = this.userType;
        if (userType != null) {
            iHashCode = userType.hashCode();
        }
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
    }

    public final void setCategorySort(@Nullable CategorySort categorySort) {
        this.categorySort = categorySort;
    }

    public final void setParam(@Nullable String str) {
        this.param = str;
    }

    public final void setSort(@Nullable Sort sort) {
        this.sort = sort;
    }

    public final void setSubModuleForNeuron(@Nullable String str) {
        this.subModuleForNeuron = str;
    }

    public final void setUserSort(@Nullable UserSort userSort) {
        this.userSort = userSort;
    }

    public final void setUserType(@Nullable UserType userType) {
        this.userType = userType;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.param;
        String str3 = this.subModuleForNeuron;
        Sort sort = this.sort;
        UserSort userSort = this.userSort;
        CategorySort categorySort = this.categorySort;
        UserType userType = this.userType;
        StringBuilder sbA = G0.b.a("FilterValue(value=", str, ", param=", str2, ", subModuleForNeuron=");
        sbA.append(str3);
        sbA.append(", sort=");
        sbA.append(sort);
        sbA.append(", userSort=");
        sbA.append(userSort);
        sbA.append(", categorySort=");
        sbA.append(categorySort);
        sbA.append(", userType=");
        sbA.append(userType);
        sbA.append(")");
        return sbA.toString();
    }
}
