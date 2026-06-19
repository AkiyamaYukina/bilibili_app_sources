package com.bilibili.search2.api;

import Ps0.C2780a;
import Ps0.C2781b;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.translation.v1.TranslationBusiness;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint2;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.InlineThreePointPanel;
import com.bilibili.app.comm.list.common.data.SharePlane;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.search2.inline.Args;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import h6.C7417v;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData.class */
@StabilityInferred(parameters = 0)
@Keep
public class BaseSearchInlineData implements com.bilibili.search2.api.oversea.a {
    public static final int $stable = 8;

    @JSONField(name = "args")
    @Nullable
    private Args args;

    @JSONField(name = "can_play")
    private int canPlay;

    @JSONField(name = "card_goto")
    @Nullable
    private String cardGoto;

    @JSONField(name = "card_type")
    @Nullable
    private String cardType;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @JSONField(name = "cover_left_icon_1")
    private int coverLeftIcon1;

    @JSONField(name = "cover_left_icon_2")
    private int coverLeftIcon2;

    @JSONField(name = "cover_left_text_1")
    @Nullable
    private String coverLeftText1;

    @JSONField(name = "cover_left_text_2")
    @Nullable
    private String coverLeftText2;

    @JSONField(name = "extra_uri")
    @Nullable
    private String extraUri;

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    @JSONField(name = "goto")
    @Nullable
    private String f36goto;

    @JSONField(name = "is_coin")
    private boolean isCoin;

    @JSONField(name = "is_fav")
    private boolean isFavorite;

    @JSONField(name = "player_args")
    @Nullable
    private PlayerArgs playerArgs;

    @Nullable
    private String reportFlowData;

    @JSONField(name = "share")
    @Nullable
    private Share share;

    @JSONField(name = "share_plane")
    @Nullable
    private SharePlane sharePlane;

    @JSONField(name = "three_point")
    @Nullable
    private ThreePointX threePoint;

    @JSONField(name = "three_point_meta")
    @Nullable
    private InlineThreePointPanel threePointMeta;

    @JSONField(name = "three_point_v2")
    @Nullable
    private List<ThreePointV2> threePointV2;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "translated_status")
    private long translatedStatus;

    @JSONField(name = "translated_title")
    @Nullable
    private String translatedTitle;

    @JSONField(name = "up_args")
    @Nullable
    private UpArgs upArgs;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$DislikeReason.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class DislikeReason {
        public static final int $stable = 8;

        @JSONField(name = "id")
        @Nullable
        private Integer id;

        @JSONField(name = "name")
        @Nullable
        private String name;

        public DislikeReason() {
            this(null, null, 3, null);
        }

        public DislikeReason(@Nullable Integer num, @Nullable String str) {
            this.id = num;
            this.name = str;
        }

        public /* synthetic */ DislikeReason(Integer num, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ DislikeReason copy$default(DislikeReason dislikeReason, Integer num, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = dislikeReason.id;
            }
            if ((i7 & 2) != 0) {
                str = dislikeReason.name;
            }
            return dislikeReason.copy(num, str);
        }

        @Nullable
        public final Integer component1() {
            return this.id;
        }

        @Nullable
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final DislikeReason copy(@Nullable Integer num, @Nullable String str) {
            return new DislikeReason(num, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DislikeReason)) {
                return false;
            }
            DislikeReason dislikeReason = (DislikeReason) obj;
            return Intrinsics.areEqual(this.id, dislikeReason.id) && Intrinsics.areEqual(this.name, dislikeReason.name);
        }

        @Nullable
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = 0;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            String str = this.name;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public final void setId(@Nullable Integer num) {
            this.id = num;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        @NotNull
        public String toString() {
            return "DislikeReason(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$Feedback.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Feedback {
        public static final int $stable = 8;

        @JSONField(name = "id")
        @Nullable
        private Integer id;

        @JSONField(name = "name")
        @Nullable
        private String name;

        public Feedback() {
            this(null, null, 3, null);
        }

        public Feedback(@Nullable Integer num, @Nullable String str) {
            this.id = num;
            this.name = str;
        }

        public /* synthetic */ Feedback(Integer num, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ Feedback copy$default(Feedback feedback, Integer num, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = feedback.id;
            }
            if ((i7 & 2) != 0) {
                str = feedback.name;
            }
            return feedback.copy(num, str);
        }

        @Nullable
        public final Integer component1() {
            return this.id;
        }

        @Nullable
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final Feedback copy(@Nullable Integer num, @Nullable String str) {
            return new Feedback(num, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feedback)) {
                return false;
            }
            Feedback feedback = (Feedback) obj;
            return Intrinsics.areEqual(this.id, feedback.id) && Intrinsics.areEqual(this.name, feedback.name);
        }

        @Nullable
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = 0;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            String str = this.name;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public final void setId(@Nullable Integer num) {
            this.id = num;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        @NotNull
        public String toString() {
            return "Feedback(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$Reason.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Reason {
        public static final int $stable = 8;

        @JSONField(name = "id")
        @Nullable
        private Integer id;

        @JSONField(name = "name")
        @Nullable
        private String name;

        public Reason() {
            this(null, null, 3, null);
        }

        public Reason(@Nullable Integer num, @Nullable String str) {
            this.id = num;
            this.name = str;
        }

        public /* synthetic */ Reason(Integer num, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : str);
        }

        public static /* synthetic */ Reason copy$default(Reason reason, Integer num, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = reason.id;
            }
            if ((i7 & 2) != 0) {
                str = reason.name;
            }
            return reason.copy(num, str);
        }

        @Nullable
        public final Integer component1() {
            return this.id;
        }

        @Nullable
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final Reason copy(@Nullable Integer num, @Nullable String str) {
            return new Reason(num, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) obj;
            return Intrinsics.areEqual(this.id, reason.id) && Intrinsics.areEqual(this.name, reason.name);
        }

        @Nullable
        public final Integer getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            Integer num = this.id;
            int iHashCode = 0;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            String str = this.name;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public final void setId(@Nullable Integer num) {
            this.id = num;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        @NotNull
        public String toString() {
            return "Reason(id=" + this.id + ", name=" + this.name + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$Share.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Share {
        public static final int $stable = 8;

        @JSONField(name = "type")
        @Nullable
        private String type;

        @JSONField(name = "video")
        @Nullable
        private Video video;

        public Share() {
            this(null, null, 3, null);
        }

        public Share(@NotNull com.bapis.bilibili.polymer.app.search.v1.Share share) {
            this(null, null, 3, null);
            this.type = share.getType();
            if (share.hasVideo()) {
                this.video = new Video(share.getVideo());
            }
        }

        public Share(@Nullable String str, @Nullable Video video) {
            this.type = str;
            this.video = video;
        }

        public /* synthetic */ Share(String str, Video video, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : video);
        }

        public static /* synthetic */ Share copy$default(Share share, String str, Video video, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = share.type;
            }
            if ((i7 & 2) != 0) {
                video = share.video;
            }
            return share.copy(str, video);
        }

        @Nullable
        public final String component1() {
            return this.type;
        }

        @Nullable
        public final Video component2() {
            return this.video;
        }

        @NotNull
        public final Share copy(@Nullable String str, @Nullable Video video) {
            return new Share(str, video);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Share)) {
                return false;
            }
            Share share = (Share) obj;
            return Intrinsics.areEqual(this.type, share.type) && Intrinsics.areEqual(this.video, share.video);
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final Video getVideo() {
            return this.video;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = 0;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Video video = this.video;
            if (video != null) {
                iHashCode = video.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setVideo(@Nullable Video video) {
            this.video = video;
        }

        @NotNull
        public String toString() {
            return "Share(type=" + this.type + ", video=" + this.video + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$ThreePoint.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ThreePoint {
        public static final int $stable = 8;

        @JSONField(name = "icon")
        @Nullable
        private String icon;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "type")
        @Nullable
        private String type;

        public ThreePoint() {
            this(null, null, null, 7, null);
        }

        public ThreePoint(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.icon = str;
            this.title = str2;
            this.type = str3;
        }

        public /* synthetic */ ThreePoint(String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ ThreePoint copy$default(ThreePoint threePoint, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = threePoint.icon;
            }
            if ((i7 & 2) != 0) {
                str2 = threePoint.title;
            }
            if ((i7 & 4) != 0) {
                str3 = threePoint.type;
            }
            return threePoint.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.icon;
        }

        @Nullable
        public final String component2() {
            return this.title;
        }

        @Nullable
        public final String component3() {
            return this.type;
        }

        @NotNull
        public final ThreePoint copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new ThreePoint(str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreePoint)) {
                return false;
            }
            ThreePoint threePoint = (ThreePoint) obj;
            return Intrinsics.areEqual(this.icon, threePoint.icon) && Intrinsics.areEqual(this.title, threePoint.title) && Intrinsics.areEqual(this.type, threePoint.type);
        }

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.icon;
            int iHashCode = 0;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.type;
            if (str3 != null) {
                iHashCode = str3.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        @NotNull
        public String toString() {
            String str = this.icon;
            String str2 = this.title;
            return C8770a.a(G0.b.a("ThreePoint(icon=", str, ", title=", str2, ", type="), this.type, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$ThreePointV2.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ThreePointV2 {
        public static final int $stable = 8;

        @JSONField(name = "reasons")
        @Nullable
        private List<Reason> reasons;

        @JSONField(name = "subtitle")
        @Nullable
        private String subtitle;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "type")
        @Nullable
        private String type;

        public ThreePointV2() {
            this(null, null, null, null, 15, null);
        }

        public ThreePointV2(@NotNull com.bapis.bilibili.polymer.app.search.v1.ThreePointV2 threePointV2) {
            Sequence sequenceAsSequence;
            Sequence map;
            this(null, null, null, null, 15, null);
            if (threePointV2.getReasonsCount() > 0) {
                List reasonsList = threePointV2.getReasonsList();
                this.reasons = (reasonsList == null || (sequenceAsSequence = CollectionsKt.asSequence(reasonsList)) == null || (map = SequencesKt.map(sequenceAsSequence, new C2780a(0))) == null) ? null : SequencesKt.toList(map);
            }
            this.subtitle = threePointV2.getSubtitle();
            this.title = threePointV2.getTitle();
            this.type = threePointV2.getType();
        }

        public ThreePointV2(@Nullable List<Reason> list, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.reasons = list;
            this.subtitle = str;
            this.title = str2;
            this.type = str3;
        }

        public /* synthetic */ ThreePointV2(List list, String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Reason _init_$lambda$0(com.bapis.bilibili.polymer.app.search.v1.DislikeReason dislikeReason) {
            return new Reason(Integer.valueOf(dislikeReason.getId()), dislikeReason.getName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ThreePointV2 copy$default(ThreePointV2 threePointV2, List list, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = threePointV2.reasons;
            }
            if ((i7 & 2) != 0) {
                str = threePointV2.subtitle;
            }
            if ((i7 & 4) != 0) {
                str2 = threePointV2.title;
            }
            if ((i7 & 8) != 0) {
                str3 = threePointV2.type;
            }
            return threePointV2.copy(list, str, str2, str3);
        }

        @Nullable
        public final List<Reason> component1() {
            return this.reasons;
        }

        @Nullable
        public final String component2() {
            return this.subtitle;
        }

        @Nullable
        public final String component3() {
            return this.title;
        }

        @Nullable
        public final String component4() {
            return this.type;
        }

        @NotNull
        public final ThreePointV2 copy(@Nullable List<Reason> list, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new ThreePointV2(list, str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreePointV2)) {
                return false;
            }
            ThreePointV2 threePointV2 = (ThreePointV2) obj;
            return Intrinsics.areEqual(this.reasons, threePointV2.reasons) && Intrinsics.areEqual(this.subtitle, threePointV2.subtitle) && Intrinsics.areEqual(this.title, threePointV2.title) && Intrinsics.areEqual(this.type, threePointV2.type);
        }

        @Nullable
        public final List<Reason> getReasons() {
            return this.reasons;
        }

        @Nullable
        public final String getSubtitle() {
            return this.subtitle;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            List<Reason> list = this.reasons;
            int iHashCode = 0;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            String str = this.subtitle;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.type;
            if (str3 != null) {
                iHashCode = str3.hashCode();
            }
            return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
        }

        public final void setReasons(@Nullable List<Reason> list) {
            this.reasons = list;
        }

        public final void setSubtitle(@Nullable String str) {
            this.subtitle = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        @NotNull
        public String toString() {
            List<Reason> list = this.reasons;
            String str = this.subtitle;
            String str2 = this.title;
            String str3 = this.type;
            StringBuilder sb = new StringBuilder("ThreePointV2(reasons=");
            sb.append(list);
            sb.append(", subtitle=");
            sb.append(str);
            sb.append(", title=");
            return A.a(str2, ", type=", str3, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$ThreePointX.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ThreePointX {
        public static final int $stable = 8;

        @JSONField(name = "dislike_reasons")
        @Nullable
        private List<DislikeReason> dislikeReasons;

        @JSONField(name = "feedbacks")
        @Nullable
        private List<Feedback> feedbacks;

        @JSONField(name = "watch_later")
        @Nullable
        private Integer watchLater;

        public ThreePointX() {
            this(null, null, null, 7, null);
        }

        public ThreePointX(@NotNull ThreePoint2 threePoint2) {
            Sequence sequenceAsSequence;
            Sequence map;
            this(null, null, null, 7, null);
            if (threePoint2.getDislikeReasonsCount() > 0) {
                List dislikeReasonsList = threePoint2.getDislikeReasonsList();
                this.dislikeReasons = (dislikeReasonsList == null || (sequenceAsSequence = CollectionsKt.asSequence(dislikeReasonsList)) == null || (map = SequencesKt.map(sequenceAsSequence, new Fq0.a(1))) == null) ? null : SequencesKt.toList(map);
            }
            if (threePoint2.getFeedbacksCount() > 0) {
                List feedbacksList = threePoint2.getFeedbacksList();
                List<Feedback> list = null;
                if (feedbacksList != null) {
                    Sequence sequenceAsSequence2 = CollectionsKt.asSequence(feedbacksList);
                    list = null;
                    if (sequenceAsSequence2 != null) {
                        Sequence map2 = SequencesKt.map(sequenceAsSequence2, new C2781b(0));
                        list = null;
                        if (map2 != null) {
                            list = SequencesKt.toList(map2);
                        }
                    }
                }
                this.feedbacks = list;
            }
            this.watchLater = Integer.valueOf(threePoint2.getWatchLater());
        }

        public ThreePointX(@Nullable List<DislikeReason> list, @Nullable List<Feedback> list2, @Nullable Integer num) {
            this.dislikeReasons = list;
            this.feedbacks = list2;
            this.watchLater = num;
        }

        public /* synthetic */ ThreePointX(List list, List list2, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : list, (i7 & 2) != 0 ? null : list2, (i7 & 4) != 0 ? null : num);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DislikeReason _init_$lambda$0(com.bapis.bilibili.polymer.app.search.v1.DislikeReason dislikeReason) {
            return new DislikeReason(Integer.valueOf(dislikeReason.getId()), dislikeReason.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Feedback _init_$lambda$1(com.bapis.bilibili.polymer.app.search.v1.DislikeReason dislikeReason) {
            return new Feedback(Integer.valueOf(dislikeReason.getId()), dislikeReason.getName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ThreePointX copy$default(ThreePointX threePointX, List list, List list2, Integer num, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = threePointX.dislikeReasons;
            }
            if ((i7 & 2) != 0) {
                list2 = threePointX.feedbacks;
            }
            if ((i7 & 4) != 0) {
                num = threePointX.watchLater;
            }
            return threePointX.copy(list, list2, num);
        }

        @Nullable
        public final List<DislikeReason> component1() {
            return this.dislikeReasons;
        }

        @Nullable
        public final List<Feedback> component2() {
            return this.feedbacks;
        }

        @Nullable
        public final Integer component3() {
            return this.watchLater;
        }

        @NotNull
        public final ThreePointX copy(@Nullable List<DislikeReason> list, @Nullable List<Feedback> list2, @Nullable Integer num) {
            return new ThreePointX(list, list2, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreePointX)) {
                return false;
            }
            ThreePointX threePointX = (ThreePointX) obj;
            return Intrinsics.areEqual(this.dislikeReasons, threePointX.dislikeReasons) && Intrinsics.areEqual(this.feedbacks, threePointX.feedbacks) && Intrinsics.areEqual(this.watchLater, threePointX.watchLater);
        }

        @Nullable
        public final List<DislikeReason> getDislikeReasons() {
            return this.dislikeReasons;
        }

        @Nullable
        public final List<Feedback> getFeedbacks() {
            return this.feedbacks;
        }

        @Nullable
        public final Integer getWatchLater() {
            return this.watchLater;
        }

        public int hashCode() {
            List<DislikeReason> list = this.dislikeReasons;
            int iHashCode = 0;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            List<Feedback> list2 = this.feedbacks;
            int iHashCode3 = list2 == null ? 0 : list2.hashCode();
            Integer num = this.watchLater;
            if (num != null) {
                iHashCode = num.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        }

        public final void setDislikeReasons(@Nullable List<DislikeReason> list) {
            this.dislikeReasons = list;
        }

        public final void setFeedbacks(@Nullable List<Feedback> list) {
            this.feedbacks = list;
        }

        public final void setWatchLater(@Nullable Integer num) {
            this.watchLater = num;
        }

        @NotNull
        public String toString() {
            List<DislikeReason> list = this.dislikeReasons;
            List<Feedback> list2 = this.feedbacks;
            return e4.c.a(C7417v.a("ThreePointX(dislikeReasons=", ", feedbacks=", ", watchLater=", list, list2), this.watchLater, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$UpArgs.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class UpArgs {
        public static final int $stable = 8;

        @JSONField(name = "selected")
        private int selected;

        @JSONField(name = "up_face")
        @Nullable
        private String upFace;

        @JSONField(name = "up_id")
        private long upId;

        @JSONField(name = "up_name")
        @Nullable
        private String upName;

        public UpArgs() {
            this(null, 0L, null, 0, 15, null);
        }

        public UpArgs(@NotNull com.bapis.bilibili.polymer.app.search.v1.UpArgs upArgs) {
            this(upArgs.getUpFace(), upArgs.getUpId(), upArgs.getUpName(), upArgs.getSelected());
        }

        public UpArgs(@Nullable String str, long j7, @Nullable String str2, int i7) {
            this.upFace = str;
            this.upId = j7;
            this.upName = str2;
            this.selected = i7;
        }

        public /* synthetic */ UpArgs(String str, long j7, String str2, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? 0L : j7, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? 0 : i7);
        }

        public static /* synthetic */ UpArgs copy$default(UpArgs upArgs, String str, long j7, String str2, int i7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = upArgs.upFace;
            }
            if ((i8 & 2) != 0) {
                j7 = upArgs.upId;
            }
            if ((i8 & 4) != 0) {
                str2 = upArgs.upName;
            }
            if ((i8 & 8) != 0) {
                i7 = upArgs.selected;
            }
            return upArgs.copy(str, j7, str2, i7);
        }

        @Nullable
        public final String component1() {
            return this.upFace;
        }

        public final long component2() {
            return this.upId;
        }

        @Nullable
        public final String component3() {
            return this.upName;
        }

        public final int component4() {
            return this.selected;
        }

        @NotNull
        public final UpArgs copy(@Nullable String str, long j7, @Nullable String str2, int i7) {
            return new UpArgs(str, j7, str2, i7);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpArgs)) {
                return false;
            }
            UpArgs upArgs = (UpArgs) obj;
            return Intrinsics.areEqual(this.upFace, upArgs.upFace) && this.upId == upArgs.upId && Intrinsics.areEqual(this.upName, upArgs.upName) && this.selected == upArgs.selected;
        }

        public final int getSelected() {
            return this.selected;
        }

        @Nullable
        public final String getUpFace() {
            return this.upFace;
        }

        public final long getUpId() {
            return this.upId;
        }

        @Nullable
        public final String getUpName() {
            return this.upName;
        }

        public int hashCode() {
            String str = this.upFace;
            int iA = C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.upId);
            String str2 = this.upName;
            return Integer.hashCode(this.selected) + ((iA + (str2 == null ? 0 : str2.hashCode())) * 31);
        }

        public final void setSelected(int i7) {
            this.selected = i7;
        }

        public final void setUpFace(@Nullable String str) {
            this.upFace = str;
        }

        public final void setUpId(long j7) {
            this.upId = j7;
        }

        public final void setUpName(@Nullable String str) {
            this.upName = str;
        }

        @NotNull
        public String toString() {
            String str = this.upFace;
            long j7 = this.upId;
            String str2 = this.upName;
            int i7 = this.selected;
            StringBuilder sbA = com.bilibili.playerbizcommon.features.background.b.a(j7, "UpArgs(upFace=", str, ", upId=");
            bf.a.a(i7, ", upName=", str2, ", selected=", sbA);
            sbA.append(")");
            return sbA.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchInlineData$Video.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Video {
        public static final int $stable = 8;

        @JSONField(name = "bvid")
        @Nullable
        private String bvid;

        @JSONField(name = "cid")
        @Nullable
        private Long cid;

        @JSONField(name = "is_hot_label")
        @Nullable
        private Boolean isHotLabel;

        @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
        @Nullable
        private Integer page;

        @JSONField(name = "page_count")
        @Nullable
        private Integer pageCount;

        @JSONField(name = "share_subtitle")
        @Nullable
        private String shareSubtitle;

        @JSONField(name = "short_link")
        @Nullable
        private String shortLink;

        public Video() {
            this(null, null, null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
        }

        public Video(@NotNull com.bapis.bilibili.polymer.app.search.v1.Video video) {
            this(video.getBvid(), Long.valueOf(video.getCid()), Boolean.valueOf(video.getIsHotLabel()), Integer.valueOf(video.getPage()), Integer.valueOf(video.getPageCount()), video.getShareSubtitle(), video.getShortLink());
        }

        public Video(@Nullable String str, @Nullable Long l7, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3) {
            this.bvid = str;
            this.cid = l7;
            this.isHotLabel = bool;
            this.page = num;
            this.pageCount = num2;
            this.shareSubtitle = str2;
            this.shortLink = str3;
        }

        public /* synthetic */ Video(String str, Long l7, Boolean bool, Integer num, Integer num2, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : l7, (i7 & 4) != 0 ? null : bool, (i7 & 8) != 0 ? null : num, (i7 & 16) != 0 ? null : num2, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? null : str3);
        }

        public static /* synthetic */ Video copy$default(Video video, String str, Long l7, Boolean bool, Integer num, Integer num2, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = video.bvid;
            }
            if ((i7 & 2) != 0) {
                l7 = video.cid;
            }
            if ((i7 & 4) != 0) {
                bool = video.isHotLabel;
            }
            if ((i7 & 8) != 0) {
                num = video.page;
            }
            if ((i7 & 16) != 0) {
                num2 = video.pageCount;
            }
            if ((i7 & 32) != 0) {
                str2 = video.shareSubtitle;
            }
            if ((i7 & 64) != 0) {
                str3 = video.shortLink;
            }
            return video.copy(str, l7, bool, num, num2, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.bvid;
        }

        @Nullable
        public final Long component2() {
            return this.cid;
        }

        @Nullable
        public final Boolean component3() {
            return this.isHotLabel;
        }

        @Nullable
        public final Integer component4() {
            return this.page;
        }

        @Nullable
        public final Integer component5() {
            return this.pageCount;
        }

        @Nullable
        public final String component6() {
            return this.shareSubtitle;
        }

        @Nullable
        public final String component7() {
            return this.shortLink;
        }

        @NotNull
        public final Video copy(@Nullable String str, @Nullable Long l7, @Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable String str3) {
            return new Video(str, l7, bool, num, num2, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return Intrinsics.areEqual(this.bvid, video.bvid) && Intrinsics.areEqual(this.cid, video.cid) && Intrinsics.areEqual(this.isHotLabel, video.isHotLabel) && Intrinsics.areEqual(this.page, video.page) && Intrinsics.areEqual(this.pageCount, video.pageCount) && Intrinsics.areEqual(this.shareSubtitle, video.shareSubtitle) && Intrinsics.areEqual(this.shortLink, video.shortLink);
        }

        @Nullable
        public final String getBvid() {
            return this.bvid;
        }

        @Nullable
        public final Long getCid() {
            return this.cid;
        }

        @Nullable
        public final Integer getPage() {
            return this.page;
        }

        @Nullable
        public final Integer getPageCount() {
            return this.pageCount;
        }

        @Nullable
        public final String getShareSubtitle() {
            return this.shareSubtitle;
        }

        @Nullable
        public final String getShortLink() {
            return this.shortLink;
        }

        public int hashCode() {
            String str = this.bvid;
            int iHashCode = 0;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Long l7 = this.cid;
            int iHashCode3 = l7 == null ? 0 : l7.hashCode();
            Boolean bool = this.isHotLabel;
            int iHashCode4 = bool == null ? 0 : bool.hashCode();
            Integer num = this.page;
            int iHashCode5 = num == null ? 0 : num.hashCode();
            Integer num2 = this.pageCount;
            int iHashCode6 = num2 == null ? 0 : num2.hashCode();
            String str2 = this.shareSubtitle;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.shortLink;
            if (str3 != null) {
                iHashCode = str3.hashCode();
            }
            return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
        }

        @Nullable
        public final Boolean isHotLabel() {
            return this.isHotLabel;
        }

        public final void setBvid(@Nullable String str) {
            this.bvid = str;
        }

        public final void setCid(@Nullable Long l7) {
            this.cid = l7;
        }

        public final void setHotLabel(@Nullable Boolean bool) {
            this.isHotLabel = bool;
        }

        public final void setPage(@Nullable Integer num) {
            this.page = num;
        }

        public final void setPageCount(@Nullable Integer num) {
            this.pageCount = num;
        }

        public final void setShareSubtitle(@Nullable String str) {
            this.shareSubtitle = str;
        }

        public final void setShortLink(@Nullable String str) {
            this.shortLink = str;
        }

        @NotNull
        public String toString() {
            String str = this.bvid;
            Long l7 = this.cid;
            Boolean bool = this.isHotLabel;
            Integer num = this.page;
            Integer num2 = this.pageCount;
            String str2 = this.shareSubtitle;
            String str3 = this.shortLink;
            StringBuilder sb = new StringBuilder("Video(bvid=");
            sb.append(str);
            sb.append(", cid=");
            sb.append(l7);
            sb.append(", isHotLabel=");
            sb.append(bool);
            sb.append(", page=");
            sb.append(num);
            sb.append(", pageCount=");
            y3.c.a(num2, ", shareSubtitle=", str2, ", shortLink=", sb);
            return C8770a.a(sb, str3, ")");
        }
    }

    public final boolean canPlay() {
        boolean z6 = true;
        if (this.canPlay != 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public /* bridge */ /* synthetic */ List getAllItems() {
        return super.getAllItems();
    }

    @Nullable
    public final Args getArgs() {
        return this.args;
    }

    public final int getCanPlay() {
        return this.canPlay;
    }

    @Nullable
    public final String getCardGoto() {
        return this.cardGoto;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final int getCoverLeftIcon1() {
        return this.coverLeftIcon1;
    }

    public final int getCoverLeftIcon2() {
        return this.coverLeftIcon2;
    }

    @Nullable
    public final String getCoverLeftText1() {
        return this.coverLeftText1;
    }

    @Nullable
    public final String getCoverLeftText2() {
        return this.coverLeftText2;
    }

    @Nullable
    public final String getExtraUri() {
        return this.extraUri;
    }

    @Nullable
    public final String getGoto() {
        return this.f36goto;
    }

    @Nullable
    public final PlayerArgs getPlayerArgs() {
        return this.playerArgs;
    }

    @Nullable
    public final String getReportFlowData() {
        return this.reportFlowData;
    }

    @Nullable
    public Share getShare() {
        return this.share;
    }

    @Nullable
    public final SharePlane getSharePlane() {
        return this.sharePlane;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public List getSubItems() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    public final ThreePointX getThreePoint() {
        return this.threePoint;
    }

    @Nullable
    public final InlineThreePointPanel getThreePointMeta() {
        return this.threePointMeta;
    }

    @Nullable
    public final List<ThreePointV2> getThreePointV2() {
        return this.threePointV2;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @NotNull
    public com.bilibili.search2.api.oversea.c getTranslateRequestParam() {
        return new com.bilibili.search2.api.oversea.c(TranslationBusiness.TRANS_BIZ_UNSPECIFIED, "");
    }

    @Override // com.bilibili.search2.api.oversea.a
    public long getTranslatedStatus() {
        return this.translatedStatus;
    }

    @Override // com.bilibili.search2.api.oversea.a
    @Nullable
    public String getTranslatedTitle() {
        return this.translatedTitle;
    }

    @Nullable
    public final UpArgs getUpArgs() {
        return this.upArgs;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public final boolean isCoin() {
        return this.isCoin;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setArgs(@Nullable Args args) {
        this.args = args;
    }

    public final void setCanPlay(int i7) {
        this.canPlay = i7;
    }

    public final void setCardGoto(@Nullable String str) {
        this.cardGoto = str;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setCoin(boolean z6) {
        this.isCoin = z6;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setCoverLeftIcon1(int i7) {
        this.coverLeftIcon1 = i7;
    }

    public final void setCoverLeftIcon2(int i7) {
        this.coverLeftIcon2 = i7;
    }

    public final void setCoverLeftText1(@Nullable String str) {
        this.coverLeftText1 = str;
    }

    public final void setCoverLeftText2(@Nullable String str) {
        this.coverLeftText2 = str;
    }

    public final void setExtraUri(@Nullable String str) {
        this.extraUri = str;
    }

    public final void setFavorite(boolean z6) {
        this.isFavorite = z6;
    }

    public final void setGoto(@Nullable String str) {
        this.f36goto = str;
    }

    public final void setPlayerArgs(@Nullable PlayerArgs playerArgs) {
        this.playerArgs = playerArgs;
    }

    public final void setReportFlowData(@Nullable String str) {
        this.reportFlowData = str;
    }

    public void setShare(@Nullable Share share) {
        this.share = share;
    }

    public final void setSharePlane(@Nullable SharePlane sharePlane) {
        this.sharePlane = sharePlane;
    }

    public final void setThreePoint(@Nullable ThreePointX threePointX) {
        this.threePoint = threePointX;
    }

    public final void setThreePointMeta(@Nullable InlineThreePointPanel inlineThreePointPanel) {
        this.threePointMeta = inlineThreePointPanel;
    }

    public final void setThreePointV2(@Nullable List<ThreePointV2> list) {
        this.threePointV2 = list;
    }

    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Override // com.bilibili.search2.api.oversea.a
    public void setTranslatedStatus(long j7) {
        this.translatedStatus = j7;
    }

    @Override // com.bilibili.search2.api.oversea.a
    public void setTranslatedTitle(@Nullable String str) {
        this.translatedTitle = str;
    }

    public final void setUpArgs(@Nullable UpArgs upArgs) {
        this.upArgs = upArgs;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }
}
