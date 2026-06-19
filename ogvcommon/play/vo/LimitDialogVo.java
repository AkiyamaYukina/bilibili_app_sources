package com.bilibili.ogvcommon.play.vo;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import c6.N;
import com.bapis.bilibili.pgc.gateway.player.v2.BadgeInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.BottomDisplay;
import com.bapis.bilibili.pgc.gateway.player.v2.ButtonInfo;
import com.bapis.bilibili.pgc.gateway.player.v2.Dialog;
import com.bapis.bilibili.pgc.gateway.player.v2.Playlist;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.util.i;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.bilibili.ogvcommon.play.vo.base.ImageVo;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.d;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class LimitDialogVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LimitDialogType f73303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("style_type")
    @Nullable
    private final DialogStyleType f73304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ConfigVo f73305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final TextVo f73306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("sub_title")
    @Nullable
    private final TextVo f73307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final TextVo f73308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("image")
    @Nullable
    private final ImageVo f73309g;

    @NotNull
    public final List<TextVo> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final ReportVo f73310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("bottom_display")
    @NotNull
    private final List<BottomDisplayVo> f73311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<PlayListVo> f73312k;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$BottomDisplayVo.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class BottomDisplayVo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TextVo f73313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f73314b;

        public BottomDisplayVo(@NotNull TextVo textVo, @NotNull String str) {
            this.f73313a = textVo;
            this.f73314b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomDisplayVo)) {
                return false;
            }
            BottomDisplayVo bottomDisplayVo = (BottomDisplayVo) obj;
            return Intrinsics.areEqual(this.f73313a, bottomDisplayVo.f73313a) && Intrinsics.areEqual(this.f73314b, bottomDisplayVo.f73314b);
        }

        public final int hashCode() {
            return this.f73314b.hashCode() + (this.f73313a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "BottomDisplayVo(title=" + this.f73313a + ", icon=" + this.f73314b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$ConfigVo.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class ConfigVo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("is_show_cover")
        private final boolean f73315a;

        public ConfigVo() {
            this(false, 1);
        }

        public ConfigVo(boolean z6) {
            this.f73315a = z6;
        }

        public /* synthetic */ ConfigVo(boolean z6, int i7) {
            this((i7 & 1) != 0 ? false : z6);
        }

        public final boolean a() {
            return this.f73315a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$DialogStyleType.class */
    @JsonAdapter(DialogStyleTypeSerializer.class)
    public static final class DialogStyleType {
        private static final EnumEntries $ENTRIES;
        private static final DialogStyleType[] $VALUES;
        public static final DialogStyleType HORIZONTAL_IMAGE = new DialogStyleType("HORIZONTAL_IMAGE", 0);
        public static final DialogStyleType VERTICAL_TEXT = new DialogStyleType("VERTICAL_TEXT", 1);
        public static final DialogStyleType SIMPLE_TEXT = new DialogStyleType("SIMPLE_TEXT", 2);

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$DialogStyleType$DialogStyleTypeSerializer.class */
        @StabilityInferred(parameters = 1)
        public static final class DialogStyleTypeSerializer implements g<DialogStyleType>, e<DialogStyleType> {
            public final JsonElement b(Object obj, f fVar) {
                return new JsonPrimitive(String.valueOf((DialogStyleType) obj).toLowerCase(Locale.ROOT));
            }

            public final Object c(JsonElement jsonElement, Type type, d dVar) {
                return DialogStyleType.valueOf(jsonElement.getAsString().toUpperCase(Locale.ROOT));
            }
        }

        private static final /* synthetic */ DialogStyleType[] $values() {
            return new DialogStyleType[]{HORIZONTAL_IMAGE, VERTICAL_TEXT, SIMPLE_TEXT};
        }

        static {
            DialogStyleType[] dialogStyleTypeArr$values = $values();
            $VALUES = dialogStyleTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(dialogStyleTypeArr$values);
        }

        private DialogStyleType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<DialogStyleType> getEntries() {
            return $ENTRIES;
        }

        public static DialogStyleType valueOf(String str) {
            return (DialogStyleType) Enum.valueOf(DialogStyleType.class, str);
        }

        public static DialogStyleType[] values() {
            return (DialogStyleType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$LimitDialogType.class */
    @JsonAdapter(LimitDialogTypeTypeAdapter.class)
    public static final class LimitDialogType {
        private static final EnumEntries $ENTRIES;
        private static final LimitDialogType[] $VALUES;

        @NotNull
        private final String value;
        public static final LimitDialogType NONE = new LimitDialogType("NONE", 0, "");
        public static final LimitDialogType EMPTY_EPISODE = new LimitDialogType("EMPTY_EPISODE", 1, "empty_episode");
        public static final LimitDialogType AREA_LIMIT = new LimitDialogType("AREA_LIMIT", 2, "area_limit");
        public static final LimitDialogType VERSION_LIMIT = new LimitDialogType("VERSION_LIMIT", 3, "version_limit");
        public static final LimitDialogType START_LIMIT = new LimitDialogType("START_LIMIT", 4, "start_limit");
        public static final LimitDialogType PAY = new LimitDialogType("PAY", 5, "pay");
        public static final LimitDialogType WHITE_CAN_WATCH = new LimitDialogType("WHITE_CAN_WATCH", 6, "white_can_watch");

        private static final /* synthetic */ LimitDialogType[] $values() {
            return new LimitDialogType[]{NONE, EMPTY_EPISODE, AREA_LIMIT, VERSION_LIMIT, START_LIMIT, PAY, WHITE_CAN_WATCH};
        }

        static {
            LimitDialogType[] limitDialogTypeArr$values = $values();
            $VALUES = limitDialogTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(limitDialogTypeArr$values);
        }

        private LimitDialogType(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<LimitDialogType> getEntries() {
            return $ENTRIES;
        }

        public static LimitDialogType valueOf(String str) {
            return (LimitDialogType) Enum.valueOf(LimitDialogType.class, str);
        }

        public static LimitDialogType[] values() {
            return (LimitDialogType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$LimitDialogTypeTypeAdapter.class */
    public static final class LimitDialogTypeTypeAdapter implements g<LimitDialogType>, e<LimitDialogType> {
        public final JsonElement b(Object obj, f fVar) {
            LimitDialogType limitDialogType = (LimitDialogType) obj;
            return limitDialogType == null ? JsonNull.INSTANCE : new JsonPrimitive(limitDialogType.getValue());
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(com.google.gson.JsonElement r4, java.lang.reflect.Type r5, com.google.gson.d r6) {
            /*
                r3 = this;
                r0 = r4
                boolean r0 = r0.isJsonNull()
                if (r0 == 0) goto Le
                com.bilibili.ogvcommon.play.vo.LimitDialogVo$LimitDialogType r0 = com.bilibili.ogvcommon.play.vo.LimitDialogVo.LimitDialogType.NONE
                r4 = r0
                goto L56
            Le:
                r0 = r4
                boolean r0 = r0.isJsonPrimitive()
                if (r0 == 0) goto L52
                r0 = r4
                java.lang.String r0 = r0.getAsString()
                r5 = r0
                kotlin.enums.EnumEntries r0 = com.bilibili.ogvcommon.play.vo.LimitDialogVo.LimitDialogType.getEntries()
                java.util.Iterator r0 = r0.iterator()
                r6 = r0
            L23:
                r0 = r6
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L44
                r0 = r6
                java.lang.Object r0 = r0.next()
                r4 = r0
                r0 = r5
                r1 = r4
                com.bilibili.ogvcommon.play.vo.LimitDialogVo$LimitDialogType r1 = (com.bilibili.ogvcommon.play.vo.LimitDialogVo.LimitDialogType) r1
                java.lang.String r1 = r1.getValue()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L23
                goto L46
            L44:
                r0 = 0
                r4 = r0
            L46:
                r0 = r4
                com.bilibili.ogvcommon.play.vo.LimitDialogVo$LimitDialogType r0 = (com.bilibili.ogvcommon.play.vo.LimitDialogVo.LimitDialogType) r0
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L52
                goto L56
            L52:
                com.bilibili.ogvcommon.play.vo.LimitDialogVo$LimitDialogType r0 = com.bilibili.ogvcommon.play.vo.LimitDialogVo.LimitDialogType.PAY
                r4 = r0
            L56:
                r0 = r4
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogvcommon.play.vo.LimitDialogVo.LimitDialogTypeTypeAdapter.c(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.d):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$PlayListVo.class */
    @StabilityInferred(parameters = 0)
    @Bson
    public static final class PlayListVo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f73316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f73317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f73318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f73319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final BangumiBadgeInfo f73320e;

        public PlayListVo(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull BangumiBadgeInfo bangumiBadgeInfo) {
            this.f73316a = j7;
            this.f73317b = str;
            this.f73318c = str2;
            this.f73319d = str3;
            this.f73320e = bangumiBadgeInfo;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlayListVo)) {
                return false;
            }
            PlayListVo playListVo = (PlayListVo) obj;
            return this.f73316a == playListVo.f73316a && Intrinsics.areEqual(this.f73317b, playListVo.f73317b) && Intrinsics.areEqual(this.f73318c, playListVo.f73318c) && Intrinsics.areEqual(this.f73319d, playListVo.f73319d) && Intrinsics.areEqual(this.f73320e, playListVo.f73320e);
        }

        public final int hashCode() {
            return this.f73320e.hashCode() + E.a(E.a(E.a(Long.hashCode(this.f73316a) * 31, 31, this.f73317b), 31, this.f73318c), 31, this.f73319d);
        }

        @NotNull
        public final String toString() {
            return "PlayListVo(seasonId=" + this.f73316a + ", title=" + this.f73317b + ", cover=" + this.f73318c + ", link=" + this.f73319d + ", badgeInfo=" + this.f73320e + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ogvcommon.play.vo.LimitDialogVo$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$a$a.class */
        public static final class C0463a extends TypeToken<LimitDialogType> {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/LimitDialogVo$a$b.class */
        public static final class b extends TypeToken<DialogStyleType> {
        }

        @Nullable
        public static LimitDialogVo a(@NotNull Dialog dialog) {
            ReportVo reportVo;
            LimitDialogVo limitDialogVo;
            BottomDisplayVo bottomDisplayVo;
            String text;
            TextVo textVo;
            if (dialog.getDefaultInstanceForType() == dialog) {
                limitDialogVo = null;
            } else {
                String styleType = dialog.getStyleType();
                if (styleType == null || styleType.length() == 0) {
                    return null;
                }
                String type = dialog.getType();
                LimitDialogType limitDialogType = (type == null || type.length() == 0) ? LimitDialogType.NONE : (LimitDialogType) JsonUtilKt.parseJson(dialog.getType(), new C0463a().getType());
                String styleType2 = dialog.getStyleType();
                DialogStyleType dialogStyleType = (styleType2 == null || styleType2.length() == 0) ? null : (DialogStyleType) JsonUtilKt.parseJson(dialog.getStyleType(), new b().getType());
                ConfigVo configVo = new ConfigVo(dialog.getConfig().getIsShowCover());
                TextVo textVoB = TextVo.a.b(dialog.getTitle());
                TextVo textVoB2 = TextVo.a.b(dialog.getSubtitle());
                TextVo textVoA = TextVo.a.a(dialog.getBottomDesc());
                String str = (String) i.a(dialog.getImage().getUrl());
                ImageVo imageVo = str != null ? new ImageVo(str) : null;
                List buttonList = dialog.getButtonList();
                ArrayList arrayList = new ArrayList();
                Iterator it = buttonList.iterator();
                while (it.hasNext()) {
                    TextVo textVoA2 = TextVo.a.a((ButtonInfo) it.next());
                    if (textVoA2 != null) {
                        arrayList.add(textVoA2);
                    }
                }
                GeneratedMessageLite report = dialog.getReport();
                if (report.getDefaultInstanceForType() == report) {
                    reportVo = null;
                } else {
                    String str2 = (String) i.a(report.getShowEventId());
                    String str3 = (String) i.a(report.getClickEventId());
                    String str4 = (String) i.a(report.getExtends());
                    reportVo = new ReportVo(str2, str3, str4 != null ? (Map) JsonUtilKt.parseJson(str4, new Rl0.a().getType()) : null);
                }
                List<BottomDisplay> bottomDisplayList = dialog.getBottomDisplayList();
                ArrayList arrayList2 = new ArrayList();
                for (BottomDisplay bottomDisplay : bottomDisplayList) {
                    String text2 = bottomDisplay.getTitle().getText();
                    if (text2 == null || text2.length() == 0) {
                        bottomDisplayVo = null;
                    } else {
                        GeneratedMessageLite title = bottomDisplay.getTitle();
                        if (title.getDefaultInstanceForType() == title || (text = title.getText()) == null || text.length() == 0) {
                            textVo = null;
                        } else {
                            String text3 = title.getText();
                            Integer numB = Uj0.a.b(title.getTextColor());
                            textVo = new TextVo(text3, numB != null ? numB.intValue() : 0, Uj0.a.b(title.getTextColorNight()), null, null, null, null, null, null, null, null, null, null, 8184);
                        }
                        bottomDisplayVo = new BottomDisplayVo(textVo, bottomDisplay.getIcon());
                    }
                    if (bottomDisplayVo != null) {
                        arrayList2.add(bottomDisplayVo);
                    }
                }
                List<Playlist> playListList = dialog.getPlayListList();
                ArrayList arrayList3 = new ArrayList();
                for (Playlist playlist : playListList) {
                    String title2 = playlist.getTitle();
                    PlayListVo playListVo = (title2 == null || title2.length() == 0 || playlist.getBadgeInfo() == BadgeInfo.getDefaultInstance()) ? null : new PlayListVo(playlist.getSeasonId(), playlist.getTitle(), playlist.getCover(), playlist.getLink(), new BangumiBadgeInfo(playlist.getBadgeInfo().getText(), Uj0.a.b(playlist.getBadgeInfo().getTextColor()), 0, Uj0.a.b(playlist.getBadgeInfo().getBgColor()), Uj0.a.b(playlist.getBadgeInfo().getBgColorNight()), playlist.getBadgeInfo().getImg(), 4));
                    if (playListVo != null) {
                        arrayList3.add(playListVo);
                    }
                }
                limitDialogVo = new LimitDialogVo(limitDialogType, dialogStyleType, configVo, textVoB, textVoB2, textVoA, imageVo, arrayList, reportVo, arrayList2, arrayList3);
            }
            return limitDialogVo;
        }
    }

    public LimitDialogVo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047);
    }

    public LimitDialogVo(@NotNull LimitDialogType limitDialogType, @Nullable DialogStyleType dialogStyleType, @NotNull ConfigVo configVo, @Nullable TextVo textVo, @Nullable TextVo textVo2, @Nullable TextVo textVo3, @Nullable ImageVo imageVo, @NotNull List<TextVo> list, @Nullable ReportVo reportVo, @NotNull List<BottomDisplayVo> list2, @NotNull List<PlayListVo> list3) {
        this.f73303a = limitDialogType;
        this.f73304b = dialogStyleType;
        this.f73305c = configVo;
        this.f73306d = textVo;
        this.f73307e = textVo2;
        this.f73308f = textVo3;
        this.f73309g = imageVo;
        this.h = list;
        this.f73310i = reportVo;
        this.f73311j = list2;
        this.f73312k = list3;
    }

    public /* synthetic */ LimitDialogVo(LimitDialogType limitDialogType, DialogStyleType dialogStyleType, ConfigVo configVo, TextVo textVo, TextVo textVo2, TextVo textVo3, ImageVo imageVo, List list, ReportVo reportVo, List list2, List list3, int i7) {
        this((i7 & 1) != 0 ? LimitDialogType.NONE : limitDialogType, (i7 & 2) != 0 ? null : dialogStyleType, (i7 & 4) != 0 ? new ConfigVo(false, 1) : configVo, (i7 & 8) != 0 ? null : textVo, (i7 & 16) != 0 ? null : textVo2, (i7 & 32) != 0 ? null : textVo3, (i7 & 64) != 0 ? null : imageVo, (i7 & 128) != 0 ? CollectionsKt.emptyList() : list, (i7 & 256) != 0 ? null : reportVo, (i7 & 512) != 0 ? CollectionsKt.emptyList() : list2, (i7 & 1024) != 0 ? CollectionsKt.emptyList() : list3);
    }

    @NotNull
    public final List<BottomDisplayVo> a() {
        return this.f73311j;
    }

    @Nullable
    public final DialogStyleType b() {
        return this.f73304b;
    }

    @Nullable
    public final ImageVo c() {
        return this.f73309g;
    }

    @Nullable
    public final TextVo d() {
        return this.f73307e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitDialogVo)) {
            return false;
        }
        LimitDialogVo limitDialogVo = (LimitDialogVo) obj;
        return this.f73303a == limitDialogVo.f73303a && this.f73304b == limitDialogVo.f73304b && Intrinsics.areEqual(this.f73305c, limitDialogVo.f73305c) && Intrinsics.areEqual(this.f73306d, limitDialogVo.f73306d) && Intrinsics.areEqual(this.f73307e, limitDialogVo.f73307e) && Intrinsics.areEqual(this.f73308f, limitDialogVo.f73308f) && Intrinsics.areEqual(this.f73309g, limitDialogVo.f73309g) && Intrinsics.areEqual(this.h, limitDialogVo.h) && Intrinsics.areEqual(this.f73310i, limitDialogVo.f73310i) && Intrinsics.areEqual(this.f73311j, limitDialogVo.f73311j) && Intrinsics.areEqual(this.f73312k, limitDialogVo.f73312k);
    }

    public final int hashCode() {
        int iHashCode = this.f73303a.hashCode();
        DialogStyleType dialogStyleType = this.f73304b;
        int iHashCode2 = dialogStyleType == null ? 0 : dialogStyleType.hashCode();
        int iHashCode3 = this.f73305c.hashCode();
        TextVo textVo = this.f73306d;
        int iHashCode4 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f73307e;
        int iHashCode5 = textVo2 == null ? 0 : textVo2.hashCode();
        TextVo textVo3 = this.f73308f;
        int iHashCode6 = textVo3 == null ? 0 : textVo3.hashCode();
        ImageVo imageVo = this.f73309g;
        int iA = e0.a((((((((((iHashCode3 + (((iHashCode * 31) + iHashCode2) * 31)) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (imageVo == null ? 0 : imageVo.f73342a.hashCode())) * 31, 31, this.h);
        ReportVo reportVo = this.f73310i;
        return this.f73312k.hashCode() + e0.a((iA + (reportVo == null ? 0 : reportVo.hashCode())) * 31, 31, this.f73311j);
    }

    @NotNull
    public final String toString() {
        DialogStyleType dialogStyleType = this.f73304b;
        TextVo textVo = this.f73307e;
        ImageVo imageVo = this.f73309g;
        List<TextVo> list = this.h;
        List<BottomDisplayVo> list2 = this.f73311j;
        List<PlayListVo> list3 = this.f73312k;
        StringBuilder sb = new StringBuilder("LimitDialogVo(type=");
        sb.append(this.f73303a);
        sb.append(", dialogStyleType=");
        sb.append(dialogStyleType);
        sb.append(", config=");
        sb.append(this.f73305c);
        sb.append(", title=");
        sb.append(this.f73306d);
        sb.append(", subtitle=");
        sb.append(textVo);
        sb.append(", desc=");
        sb.append(this.f73308f);
        sb.append(", icon=");
        sb.append(imageVo);
        sb.append(", buttons=");
        sb.append(list);
        sb.append(", report=");
        sb.append(this.f73310i);
        sb.append(", bottomDisplay=");
        sb.append(list2);
        sb.append(", playList=");
        return N.a(sb, ")", list3);
    }
}
