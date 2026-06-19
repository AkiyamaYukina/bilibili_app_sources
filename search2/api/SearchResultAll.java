package com.bilibili.search2.api;

import Ps0.C;
import Ps0.C2792m;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.z;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.Nav;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchResultAll.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchResultAll {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int REFRESH_EXP_1 = 1;
    public static final int REFRESH_EXP_2 = 2;
    public static final int REFRESH_EXP_3 = 3;
    private int alienationCardCount;
    private int alienationFoldCount;
    private long allDoubleColumn;
    private int comment43Exp;
    private int coverExp;
    private double coverExpLarge;
    private double coverExpNormal;
    private double coverExpSmall;

    @JvmField
    @JSONField(name = "easter_egg")
    @Nullable
    public EasterEgg easterEgg;

    @JvmField
    @JSONField(name = "exp_str")
    @Nullable
    public String expStr;

    @JvmField
    @JSONField(name = "select_bar_type")
    public long filterType;
    private boolean hasWideAutoFill;
    private int isNewUser;

    @JvmField
    @JSONField(name = "item")
    @Nullable
    public List<BaseSearchItem> items;

    @JvmField
    @JSONField(name = "nav")
    @Nullable
    public ArrayList<NavInfo> nav;

    @JvmField
    @JSONField(name = "new_search_exp_num")
    public long newSearchExpFlag;

    @JvmField
    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    public long page;

    @Nullable
    private C2792m pageReplyInfo;
    private int pureBackgroundExp;
    private int pureCommenterExp;
    private int pureLikeExp;
    private int pureLineExp;

    @JvmField
    @JSONField(deserialize = false, serialize = false)
    @Nullable
    public String query;

    @JvmField
    @JSONField(name = "qv_id")
    @Nullable
    public String qvId;

    @JvmField
    @JSONField(name = "refresh_opti")
    @Nullable
    public Integer refreshExp;

    @JvmField
    @JSONField(name = "refresh_opti")
    @Nullable
    public Integer refreshOption;
    private long responseTime;

    @Nullable
    private C searchFilter;
    private int tagHighlightOption;

    @JvmField
    @JSONField(name = "trackid")
    @Nullable
    public String trackId;

    @Nullable
    private com.bilibili.search2.main.data.c userActQuery;

    @JvmField
    @JSONField(name = "extra_word_list")
    @NotNull
    public List<String> extraWords = new ArrayList();
    private double realExposureRatio = 0.8d;

    @Nullable
    private Integer filterExp = 0;

    @NotNull
    private List<BaseSearchItem> foldedItems = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchResultAll$EasterEgg.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class EasterEgg implements Parcelable {
        public static final int $stable = 8;

        @NotNull
        private static String BFS_STYLE_ANIMATED = "search-android-egggif";

        @NotNull
        private static String BFS_STYLE_STATIC = "search-android-eggsingle";

        @JvmField
        @NotNull
        public static final Parcelable.Creator<EasterEgg> CREATOR;

        @NotNull
        public static final b Companion = new Object();

        @JvmField
        public static long preFetchSize;

        @Nullable
        private String abtestId;

        @JSONField(name = "close_count")
        private int closeCount;
        private int eggType;

        @JSONField(name = "id")
        private int id;

        @JSONField(name = "mask_transparency")
        private int maskTransparency;

        @JSONField(name = "mask_color")
        @Nullable
        private String mask_color;

        @JSONField(name = "pic_type")
        private int picType;

        @Nullable
        private String query;

        @JSONField(name = "show_count")
        private int showCount;

        @JSONField(name = "show_time")
        private int showTime;

        @JSONField(name = "source_md5")
        @Nullable
        private String sourceMd5;

        @JSONField(name = "source_size")
        private int sourceSize;

        @JSONField(name = "source_url")
        @Nullable
        private String sourceUrl;

        @Nullable
        private String trackId;

        @JSONField(name = "type")
        private int type;

        @JSONField(name = "url")
        @Nullable
        private String url;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchResultAll$EasterEgg$a.class */
        public static final class a implements Parcelable.Creator<EasterEgg> {
            @Override // android.os.Parcelable.Creator
            public final EasterEgg createFromParcel(Parcel parcel) {
                return new EasterEgg(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final EasterEgg[] newArray(int i7) {
                return new EasterEgg[i7];
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchResultAll$EasterEgg$b.class */
        public static final class b {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.search2.api.SearchResultAll$EasterEgg$b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v7, types: [android.os.Parcelable$Creator<com.bilibili.search2.api.SearchResultAll$EasterEgg>, java.lang.Object] */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0038
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                java.lang.Object r0 = new java.lang.Object
                r1 = r0
                r1.<init>()
                com.bilibili.search2.api.SearchResultAll.EasterEgg.Companion = r0
                com.bilibili.lib.blconfig.ConfigManager$Companion r0 = com.bilibili.lib.blconfig.ConfigManager.Companion
                com.bilibili.lib.blconfig.Contract r0 = r0.config()
                java.lang.String r1 = "search.search_egg_4g_load_size"
                r2 = 0
                java.lang.Object r0 = r0.get(r1, r2)
                java.lang.String r0 = (java.lang.String) r0
                r4 = r0
                r0 = 2097152(0x200000, double:1.036131E-317)
                com.bilibili.search2.api.SearchResultAll.EasterEgg.preFetchSize = r0
                r0 = r4
                if (r0 == 0) goto L2d
                r0 = r4
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L38
                com.bilibili.search2.api.SearchResultAll.EasterEgg.preFetchSize = r0     // Catch: java.lang.Exception -> L38
            L2d:
                java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Exception -> L38
                r1 = r0
                r1.<init>()
                com.bilibili.search2.api.SearchResultAll.EasterEgg.CREATOR = r0
                return
            L38:
                r4 = move-exception
                goto L2d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchResultAll.EasterEgg.m8649clinit():void");
        }

        public EasterEgg() {
        }

        public EasterEgg(@NotNull Parcel parcel) {
            this.id = parcel.readInt();
            this.showCount = parcel.readInt();
            this.closeCount = parcel.readInt();
            this.type = parcel.readInt();
            this.url = parcel.readString();
            this.maskTransparency = parcel.readInt();
            this.mask_color = parcel.readString();
            this.picType = parcel.readInt();
            this.showTime = parcel.readInt();
            this.sourceUrl = parcel.readString();
            this.sourceMd5 = parcel.readString();
            this.sourceSize = parcel.readInt();
            this.trackId = parcel.readString();
            this.query = parcel.readString();
            this.abtestId = parcel.readString();
        }

        public EasterEgg(@NotNull com.bapis.bilibili.polymer.app.search.v1.EasterEgg easterEgg) {
            this.id = easterEgg.getId();
            this.showCount = easterEgg.getShowCount();
            this.closeCount = easterEgg.getCloseCount();
            this.type = easterEgg.getType();
            this.url = easterEgg.getUrl();
            this.maskTransparency = easterEgg.getMaskTransparency();
            this.mask_color = easterEgg.getMaskColor();
            this.picType = easterEgg.getPicType();
            this.showTime = easterEgg.getShowTime();
            this.sourceUrl = easterEgg.getSourceUrl();
            this.sourceMd5 = easterEgg.getSourceMd5();
            this.sourceSize = easterEgg.getSourceSize();
            this.eggType = easterEgg.getEggType();
        }

        private final String bfsStyle() {
            int i7 = this.picType;
            return i7 == 1 ? BFS_STYLE_STATIC : i7 == 2 ? BFS_STYLE_ANIMATED : "";
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final java.lang.String styledUrl(android.content.Context r10) {
            /*
                r9 = this;
                r0 = r10
                if (r0 != 0) goto Lc
                r0 = r9
                java.lang.String r0 = r0.sourceUrl
                r10 = r0
                goto L73
            Lc:
                r0 = r9
                java.lang.String r0 = r0.sourceUrl
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L6e
                r0 = r14
                boolean r0 = kotlin.text.StringsKt.isBlank(r0)
                if (r0 != 0) goto L22
            L1f:
                goto L28
            L22:
                r0 = 0
                r14 = r0
                goto L1f
            L28:
                r0 = r14
                if (r0 == 0) goto L6e
                r0 = r9
                java.lang.String r0 = r0.bfsStyle()
                r15 = r0
                r0 = r10
                r1 = 1133248512(0x438c0000, float:280.0)
                int r0 = com.bilibili.droid.ScreenUtil.dip2px(r0, r1)
                r12 = r0
                r0 = r10
                r1 = 1136525312(0x43be0000, float:380.0)
                int r0 = com.bilibili.droid.ScreenUtil.dip2px(r0, r1)
                r11 = r0
                r0 = r9
                int r0 = r0.picType
                r1 = 2
                if (r0 == r1) goto L4f
                r0 = 1
                r13 = r0
            L4c:
                goto L55
            L4f:
                r0 = 0
                r13 = r0
                goto L4c
            L55:
                r0 = r15
                r1 = r14
                r2 = r12
                r3 = r11
                r4 = r13
                r5 = 0
                r6 = 32
                r7 = 0
                java.lang.String r0 = com.bilibili.lib.image2.BiliImageLoaderHelper.concatStyleUrl$default(r0, r1, r2, r3, r4, r5, r6, r7)
                r14 = r0
                r0 = r14
                r10 = r0
                r0 = r14
                if (r0 != 0) goto L73
            L6e:
                r0 = r9
                java.lang.String r0 = r0.sourceUrl
                r10 = r0
            L73:
                r0 = r10
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchResultAll.EasterEgg.styledUrl(android.content.Context):java.lang.String");
        }

        public final boolean canPrefetch() {
            return ((long) this.sourceSize) <= preFetchSize;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String getAbtestId() {
            return this.abtestId;
        }

        public final int getCloseCount() {
            return this.closeCount;
        }

        public final int getEggType() {
            return this.eggType;
        }

        public final int getId() {
            return this.id;
        }

        public final int getMaskTransparency() {
            return this.maskTransparency;
        }

        @Nullable
        public final String getMask_color() {
            return this.mask_color;
        }

        public final int getPicType() {
            return this.picType;
        }

        @Nullable
        public final String getQuery() {
            return this.query;
        }

        @Nullable
        public final String getResUrl(@Nullable Context context) {
            return isImage() ? styledUrl(context) : this.sourceUrl;
        }

        public final int getShowCount() {
            return this.showCount;
        }

        public final int getShowTime() {
            return this.showTime;
        }

        @Nullable
        public final String getSourceMd5() {
            return this.sourceMd5;
        }

        public final int getSourceSize() {
            return this.sourceSize;
        }

        @Nullable
        public final String getSourceUrl() {
            return this.sourceUrl;
        }

        @Nullable
        public final String getTrackId() {
            return this.trackId;
        }

        public final int getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final boolean isImage() {
            return this.type == 3;
        }

        public final void setAbtestId(@Nullable String str) {
            this.abtestId = str;
        }

        public final void setCloseCount(int i7) {
            this.closeCount = i7;
        }

        public final void setEggType(int i7) {
            this.eggType = i7;
        }

        public final void setId(int i7) {
            this.id = i7;
        }

        public final void setMaskTransparency(int i7) {
            this.maskTransparency = i7;
        }

        public final void setMask_color(@Nullable String str) {
            this.mask_color = str;
        }

        public final void setPicType(int i7) {
            this.picType = i7;
        }

        public final void setQuery(@Nullable String str) {
            this.query = str;
        }

        public final void setShowCount(int i7) {
            this.showCount = i7;
        }

        public final void setShowTime(int i7) {
            this.showTime = i7;
        }

        public final void setSourceMd5(@Nullable String str) {
            this.sourceMd5 = str;
        }

        public final void setSourceSize(int i7) {
            this.sourceSize = i7;
        }

        public final void setSourceUrl(@Nullable String str) {
            this.sourceUrl = str;
        }

        public final void setTrackId(@Nullable String str) {
            this.trackId = str;
        }

        public final void setType(int i7) {
            this.type = i7;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        @NotNull
        public String toString() {
            return this.id + " , " + this.type + " , " + this.sourceUrl;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.search2.api.SearchEasterEggItem transform2SearchEasterItem() {
            /*
                r4 = this;
                com.bilibili.search2.api.SearchEasterEggItem r0 = new com.bilibili.search2.api.SearchEasterEggItem
                r1 = r0
                r1.<init>()
                r7 = r0
                r0 = r7
                r1 = r4
                int r1 = r1.id
                r0.setId(r1)
                r0 = r4
                int r0 = r0.type
                r5 = r0
                r0 = r5
                r1 = 1
                if (r0 == r1) goto L45
                r0 = r5
                r1 = 3
                if (r0 == r1) goto L22
                goto L3f
            L22:
                r0 = r4
                int r0 = r0.picType
                r5 = r0
                r0 = r5
                r1 = 1
                if (r0 != r1) goto L33
                java.lang.String r0 = "static"
                r6 = r0
                goto L49
            L33:
                r0 = r5
                r1 = 2
                if (r0 != r1) goto L3f
                java.lang.String r0 = "dynamic"
                r6 = r0
                goto L49
            L3f:
                java.lang.String r0 = ""
                r6 = r0
                goto L49
            L45:
                java.lang.String r0 = "mov"
                r6 = r0
            L49:
                r0 = r7
                r1 = r6
                r0.setType(r1)
                r0 = r7
                r1 = r4
                java.lang.String r1 = r1.sourceUrl
                r0.setUrl(r1)
                r0 = r7
                r1 = r4
                java.lang.String r1 = r1.sourceMd5
                r0.setHash(r1)
                r0 = r7
                r1 = r4
                int r1 = r1.sourceSize
                long r1 = (long) r1
                r0.setSize(r1)
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchResultAll.EasterEgg.transform2SearchEasterItem():com.bilibili.search2.api.SearchEasterEggItem");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeInt(this.id);
            parcel.writeInt(this.showCount);
            parcel.writeInt(this.closeCount);
            parcel.writeInt(this.type);
            parcel.writeString(this.url);
            parcel.writeInt(this.maskTransparency);
            parcel.writeString(this.mask_color);
            parcel.writeInt(this.picType);
            parcel.writeInt(this.showTime);
            parcel.writeString(this.sourceUrl);
            parcel.writeString(this.sourceMd5);
            parcel.writeInt(this.sourceSize);
            parcel.writeString(this.trackId);
            parcel.writeString(this.query);
            parcel.writeString(this.abtestId);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchResultAll$NavInfo.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class NavInfo implements Parcelable {

        @Nullable
        private String name;
        private int pages;
        private int total;
        private int type;

        @NotNull
        public static final a CREATOR = new Object();
        public static final int $stable = 8;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchResultAll$NavInfo$a.class */
        public static final class a implements Parcelable.Creator<NavInfo> {
            @Override // android.os.Parcelable.Creator
            public final NavInfo createFromParcel(Parcel parcel) {
                return new NavInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final NavInfo[] newArray(int i7) {
                return new NavInfo[i7];
            }
        }

        public NavInfo() {
        }

        public NavInfo(@NotNull Parcel parcel) {
            this.name = parcel.readString();
            this.total = parcel.readInt();
            this.pages = parcel.readInt();
            this.type = parcel.readInt();
        }

        public NavInfo(@NotNull Nav nav) {
            this.name = nav.getName();
            this.total = nav.getTotal();
            this.pages = nav.getPages();
            this.type = nav.getType();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final int getPages() {
            return this.pages;
        }

        public final int getTotal() {
            return this.total;
        }

        public final int getType() {
            return this.type;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setPages(int i7) {
            this.pages = i7;
        }

        public final void setTotal(int i7) {
            this.total = i7;
        }

        public final void setType(int i7) {
            this.type = i7;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i7) {
            parcel.writeString(this.name);
            parcel.writeInt(this.total);
            parcel.writeInt(this.pages);
            parcel.writeInt(this.type);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchResultAll$a.class */
    public static final class a {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean comment43ExpEnable() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.coverExp
            if (r0 <= 0) goto L16
            r0 = r3
            int r0 = r0.comment43Exp
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L16
            goto L18
        L16:
            r0 = 0
            r5 = r0
        L18:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchResultAll.comment43ExpEnable():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean enableRefresh() {
        /*
            r3 = this;
            r0 = r3
            java.lang.Integer r0 = r0.refreshOption
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lc
            goto L1b
        Lc:
            r0 = r6
            int r0 = r0.intValue()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r0 = 0
            r5 = r0
        L1d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchResultAll.enableRefresh():boolean");
    }

    public final int getAlienationCardCount() {
        return this.alienationCardCount;
    }

    public final int getAlienationFoldCount() {
        return this.alienationFoldCount;
    }

    public final long getAllDoubleColumn() {
        return this.allDoubleColumn;
    }

    public final int getComment43Exp() {
        return this.comment43Exp;
    }

    public final int getCoverExp() {
        return this.coverExp;
    }

    public final double getCoverExpLarge() {
        return this.coverExpLarge;
    }

    public final double getCoverExpNormal() {
        return this.coverExpNormal;
    }

    public final double getCoverExpSmall() {
        return this.coverExpSmall;
    }

    @Nullable
    public final Integer getFilterExp() {
        return this.filterExp;
    }

    @NotNull
    public final List<BaseSearchItem> getFoldedItems() {
        return this.foldedItems;
    }

    public final boolean getHasWideAutoFill() {
        return this.hasWideAutoFill;
    }

    @Nullable
    public final C2792m getPageReplyInfo() {
        return this.pageReplyInfo;
    }

    public final int getPureBackgroundExp() {
        return this.pureBackgroundExp;
    }

    public final int getPureCommenterExp() {
        return this.pureCommenterExp;
    }

    public final int getPureLikeExp() {
        return this.pureLikeExp;
    }

    public final int getPureLineExp() {
        return this.pureLineExp;
    }

    public final double getRealExposureRatio() {
        return this.realExposureRatio;
    }

    public final long getResponseTime() {
        return this.responseTime;
    }

    @Nullable
    public final C getSearchFilter() {
        return this.searchFilter;
    }

    public final int getTagHighlightOption() {
        return this.tagHighlightOption;
    }

    @Nullable
    public final com.bilibili.search2.main.data.c getUserActQuery() {
        return this.userActQuery;
    }

    public final boolean hasExtraWords() {
        return !this.extraWords.isEmpty();
    }

    @JSONField(deserialize = false, serialize = false)
    public final boolean isEmpty() {
        List<BaseSearchItem> list = this.items;
        return list == null || list.isEmpty();
    }

    public final int isNewUser() {
        return this.isNewUser;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean refreshFunctionOneEnable() {
        /*
            r3 = this;
            r0 = r3
            java.lang.Integer r0 = r0.refreshExp
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L28
            r0 = r7
            int r0 = r0.intValue()
            r4 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L26
            r0 = r4
            r1 = 2
            if (r0 == r1) goto L26
            r0 = r6
            r5 = r0
            r0 = r4
            r1 = 3
            if (r0 != r1) goto L28
        L26:
            r0 = 1
            r5 = r0
        L28:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.SearchResultAll.refreshFunctionOneEnable():boolean");
    }

    public final boolean refreshFunctionTwoEnable() {
        Integer num = this.refreshExp;
        boolean z6 = false;
        if (num != null) {
            z6 = false;
            if (num.intValue() == 2) {
                z6 = true;
            }
        }
        return z6;
    }

    public final void setAlienationCardCount(int i7) {
        this.alienationCardCount = i7;
    }

    public final void setAlienationFoldCount(int i7) {
        this.alienationFoldCount = i7;
    }

    public final void setAllDoubleColumn(long j7) {
        this.allDoubleColumn = j7;
    }

    public final void setComment43Exp(int i7) {
        this.comment43Exp = i7;
    }

    public final void setCoverExp(int i7) {
        this.coverExp = i7;
    }

    public final void setCoverExpLarge(double d7) {
        this.coverExpLarge = d7;
    }

    public final void setCoverExpNormal(double d7) {
        this.coverExpNormal = d7;
    }

    public final void setCoverExpSmall(double d7) {
        this.coverExpSmall = d7;
    }

    public final void setFilterExp(@Nullable Integer num) {
        this.filterExp = num;
    }

    public final void setFoldedItems(@NotNull List<BaseSearchItem> list) {
        this.foldedItems = list;
    }

    public final void setHasWideAutoFill(boolean z6) {
        this.hasWideAutoFill = z6;
    }

    public final void setNewUser(int i7) {
        this.isNewUser = i7;
    }

    public final void setPageReplyInfo(@Nullable C2792m c2792m) {
        this.pageReplyInfo = c2792m;
    }

    public final void setPureBackgroundExp(int i7) {
        this.pureBackgroundExp = i7;
    }

    public final void setPureCommenterExp(int i7) {
        this.pureCommenterExp = i7;
    }

    public final void setPureLikeExp(int i7) {
        this.pureLikeExp = i7;
    }

    public final void setPureLineExp(int i7) {
        this.pureLineExp = i7;
    }

    public final void setRealExposureRatio(double d7) {
        this.realExposureRatio = d7;
    }

    public final void setResponseTime(long j7) {
        this.responseTime = j7;
    }

    public final void setSearchFilter(@Nullable C c7) {
        this.searchFilter = c7;
    }

    public final void setTagHighlightOption(int i7) {
        this.tagHighlightOption = i7;
    }

    public final void setUserActQuery(@Nullable com.bilibili.search2.main.data.c cVar) {
        this.userActQuery = cVar;
    }

    @NotNull
    public String toString() {
        List<BaseSearchItem> list = this.items;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        String str = this.query;
        long j7 = this.page;
        StringBuilder sbB = z.b("items:", numValueOf, " , ", str, " , ");
        sbB.append(j7);
        return sbB.toString();
    }
}
