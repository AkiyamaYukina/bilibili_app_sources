package com.bilibili.search2.result.pages;

import G0.b;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import com.alipay.alipaysecuritysdk.rds.constant.DictionaryKeys;
import e4.c;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/pages/BiliMainSearchResultPage.class */
@StabilityInferred(parameters = 0)
public final class BiliMainSearchResultPage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f88505a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f88506b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f88507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Bundle f88509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f88510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Integer f88511g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/pages/BiliMainSearchResultPage$PageTypes.class */
    public static final class PageTypes {
        private static final EnumEntries $ENTRIES;
        private static final PageTypes[] $VALUES;

        @NotNull
        public static final a Companion;

        @NotNull
        private String pageProviderUri;
        private int pageType;

        @NotNull
        private String reportTitle;
        public static final PageTypes PAGE_ALL = new PageTypes("PAGE_ALL", 0, "bilibili://search-result/all", 0, "all");
        public static final PageTypes PAGE_USER = new PageTypes("PAGE_USER", 1, "bilibili://search-result/upuser", 2, DictionaryKeys.V2_USER);
        public static final PageTypes PAGE_LIVE = new PageTypes("PAGE_LIVE", 2, "bilibili://search-result/live2", 4, "live");
        public static final PageTypes PAGE_COLUME = new PageTypes("PAGE_COLUME", 3, "bilibili://search-result/column2", 6, "read");
        public static final PageTypes PAGE_BANGUMI = new PageTypes("PAGE_BANGUMI", 4, "bilibili://search-result/new-bangumi", 7, "bangumi");
        public static final PageTypes PAGE_MOVIE = new PageTypes("PAGE_MOVIE", 5, "bilibili://search-result/new-movie", 8, "media");

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/pages/BiliMainSearchResultPage$PageTypes$a.class */
        public static final class a {
        }

        private static final /* synthetic */ PageTypes[] $values() {
            return new PageTypes[]{PAGE_ALL, PAGE_USER, PAGE_LIVE, PAGE_COLUME, PAGE_BANGUMI, PAGE_MOVIE};
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.search2.result.pages.BiliMainSearchResultPage$PageTypes$a, java.lang.Object] */
        static {
            PageTypes[] pageTypesArr$values = $values();
            $VALUES = pageTypesArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(pageTypesArr$values);
            Companion = new Object();
        }

        private PageTypes(String str, int i7, String str2, int i8, String str3) {
            this.pageProviderUri = str2;
            this.pageType = i8;
            this.reportTitle = str3;
        }

        @NotNull
        public static EnumEntries<PageTypes> getEntries() {
            return $ENTRIES;
        }

        public static PageTypes valueOf(String str) {
            return (PageTypes) Enum.valueOf(PageTypes.class, str);
        }

        public static PageTypes[] values() {
            return (PageTypes[]) $VALUES.clone();
        }

        @NotNull
        public final String getPageProviderUri() {
            return this.pageProviderUri;
        }

        public final int getPageType() {
            return this.pageType;
        }

        @NotNull
        public final String getReportTitle() {
            return this.reportTitle;
        }

        public final void setPageProviderUri(@NotNull String str) {
            this.pageProviderUri = str;
        }

        public final void setPageType(int i7) {
            this.pageType = i7;
        }

        public final void setReportTitle(@NotNull String str) {
            this.reportTitle = str;
        }
    }

    @NotNull
    public final String toString() {
        String str = this.f88505a;
        String str2 = this.f88506b;
        int i7 = this.f88507c;
        int i8 = this.f88508d;
        Bundle bundle = this.f88509e;
        String str3 = this.f88510f;
        Integer num = this.f88511g;
        StringBuilder sbA = b.a("BiliMainSearchResultPage(pageTitle='", str, "', fragmentProviderUri='", str2, "', itemCount=");
        C4690e.a(i7, i8, ", pageTabIndex=", ", pageBundle=", sbA);
        sbA.append(bundle);
        sbA.append(", pageReportTitle=");
        sbA.append(str3);
        sbA.append(", type=");
        return c.a(sbA, num, ")");
    }
}
