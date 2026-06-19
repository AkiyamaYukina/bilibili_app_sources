package com.bilibili.playerbizcommon;

import com.bilibili.app.history.ui.HistoryContentFragment;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoShareRouteService.class */
public interface IVideoShareRouteService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoShareRouteService$ShareCountParams.class */
    public static final class ShareCountParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f79540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f79541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f79542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f79543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f79544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public String f79545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public String f79546g;

        @Nullable
        public String h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoShareRouteService$ShareCountParams$ShareType.class */
        public static final class ShareType {
            private static final EnumEntries $ENTRIES;
            private static final ShareType[] $VALUES;
            public static final ShareType LIVE = new ShareType(SocializeMedia.BILI_LIVE, 0);
            public static final ShareType VIDEO = new ShareType("VIDEO", 1);

            private static final /* synthetic */ ShareType[] $values() {
                return new ShareType[]{LIVE, VIDEO};
            }

            static {
                ShareType[] shareTypeArr$values = $values();
                $VALUES = shareTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(shareTypeArr$values);
            }

            private ShareType(String str, int i7) {
            }

            @NotNull
            public static EnumEntries<ShareType> getEntries() {
                return $ENTRIES;
            }

            public static ShareType valueOf(String str) {
                return (ShareType) Enum.valueOf(ShareType.class, str);
            }

            public static ShareType[] values() {
                return (ShareType[]) $VALUES.clone();
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IVideoShareRouteService$ShareCountParams$a.class */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final ShareCountParams f79547a = new Object();

            @NotNull
            public final ShareCountParams a() {
                ShareCountParams shareCountParams = this.f79547a;
                String str = shareCountParams.f79540a;
                if (str == null || str.length() == 0) {
                    throw new IllegalArgumentException("share oid can not be null");
                }
                String str2 = shareCountParams.f79541b;
                if (str2 == null || str2.length() == 0) {
                    throw new IllegalArgumentException("share type can not be null");
                }
                String str3 = shareCountParams.f79542c;
                if (str3 == null || str3.length() == 0) {
                    throw new IllegalArgumentException("share sessionId can not be null");
                }
                String str4 = shareCountParams.f79543d;
                if (str4 == null || str4.length() == 0) {
                    throw new IllegalArgumentException("share channel can not be null");
                }
                return shareCountParams;
            }

            @NotNull
            public final void b(@NotNull ShareType shareType) {
                ShareType shareType2 = ShareType.VIDEO;
                ShareCountParams shareCountParams = this.f79547a;
                if (shareType == shareType2) {
                    shareCountParams.f79541b = "av";
                } else if (shareType == ShareType.LIVE) {
                    shareCountParams.f79541b = "live";
                }
            }
        }
    }

    void a(@NotNull ShareCountParams shareCountParams, @Nullable HistoryContentFragment.e eVar);

    void b(@NotNull ShareCountParams shareCountParams, @Nullable HistoryContentFragment.e eVar);

    @NotNull
    String c();
}
