package com.bilibili.studio.editor.frame.net;

import G0.d;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.room.B;
import bilibili.live.app.service.resolver.a;
import cf.l;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/frame/net/Predict.class */
@Keep
public final class Predict implements Serializable, Cloneable {

    @NotNull
    private List<Children> children;
    private int copy_right;

    @NotNull
    private String desc;

    @NotNull
    private String description;

    @Nullable
    private HumanType human_type;
    private long id;

    @NotNull
    private String intro_copy;

    @NotNull
    private String intro_original;
    private int max_video_count;

    @NotNull
    private String name;

    @NotNull
    private String notice;
    private int parent;

    @NotNull
    private String parent_name;
    private int rank;

    @NotNull
    private String request_id;
    private boolean show;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/frame/net/Predict$Children.class */
    @Keep
    public static final class Children implements Serializable, Cloneable {
        private int copy_right;

        @NotNull
        private String desc;

        @NotNull
        private String description;
        private long id;

        @NotNull
        private String intro_copy;

        @NotNull
        private String intro_original;
        private int max_video_count;

        @NotNull
        private String name;

        @NotNull
        private String notice;
        private int parent;

        @NotNull
        private String parent_name;
        private int rank;
        private boolean show;

        public Children() {
            this(0, null, null, 0L, null, null, 0, null, null, 0, null, 0, false, 8191, null);
        }

        public Children(int i7, @NotNull String str, @NotNull String str2, long j7, @NotNull String str3, @NotNull String str4, int i8, @NotNull String str5, @NotNull String str6, int i9, @NotNull String str7, int i10, boolean z6) {
            this.copy_right = i7;
            this.desc = str;
            this.description = str2;
            this.id = j7;
            this.intro_copy = str3;
            this.intro_original = str4;
            this.max_video_count = i8;
            this.name = str5;
            this.notice = str6;
            this.parent = i9;
            this.parent_name = str7;
            this.rank = i10;
            this.show = z6;
        }

        public /* synthetic */ Children(int i7, String str, String str2, long j7, String str3, String str4, int i8, String str5, String str6, int i9, String str7, int i10, boolean z6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i7, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0L : j7, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? 0 : i8, (i11 & 128) != 0 ? "" : str5, (i11 & 256) != 0 ? "" : str6, (i11 & 512) != 0 ? 0 : i9, (i11 & 1024) != 0 ? "" : str7, (i11 & 2048) != 0 ? 0 : i10, (i11 & 4096) != 0 ? false : z6);
        }

        public static /* synthetic */ Children copy$default(Children children, int i7, String str, String str2, long j7, String str3, String str4, int i8, String str5, String str6, int i9, String str7, int i10, boolean z6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i7 = children.copy_right;
            }
            if ((i11 & 2) != 0) {
                str = children.desc;
            }
            if ((i11 & 4) != 0) {
                str2 = children.description;
            }
            if ((i11 & 8) != 0) {
                j7 = children.id;
            }
            if ((i11 & 16) != 0) {
                str3 = children.intro_copy;
            }
            if ((i11 & 32) != 0) {
                str4 = children.intro_original;
            }
            if ((i11 & 64) != 0) {
                i8 = children.max_video_count;
            }
            if ((i11 & 128) != 0) {
                str5 = children.name;
            }
            if ((i11 & 256) != 0) {
                str6 = children.notice;
            }
            if ((i11 & 512) != 0) {
                i9 = children.parent;
            }
            if ((i11 & 1024) != 0) {
                str7 = children.parent_name;
            }
            if ((i11 & 2048) != 0) {
                i10 = children.rank;
            }
            if ((i11 & 4096) != 0) {
                z6 = children.show;
            }
            return children.copy(i7, str, str2, j7, str3, str4, i8, str5, str6, i9, str7, i10, z6);
        }

        @NotNull
        public /* bridge */ Object clone() {
            return super.clone();
        }

        public final int component1() {
            return this.copy_right;
        }

        public final int component10() {
            return this.parent;
        }

        @NotNull
        public final String component11() {
            return this.parent_name;
        }

        public final int component12() {
            return this.rank;
        }

        public final boolean component13() {
            return this.show;
        }

        @NotNull
        public final String component2() {
            return this.desc;
        }

        @NotNull
        public final String component3() {
            return this.description;
        }

        public final long component4() {
            return this.id;
        }

        @NotNull
        public final String component5() {
            return this.intro_copy;
        }

        @NotNull
        public final String component6() {
            return this.intro_original;
        }

        public final int component7() {
            return this.max_video_count;
        }

        @NotNull
        public final String component8() {
            return this.name;
        }

        @NotNull
        public final String component9() {
            return this.notice;
        }

        @NotNull
        public final Children copy(int i7, @NotNull String str, @NotNull String str2, long j7, @NotNull String str3, @NotNull String str4, int i8, @NotNull String str5, @NotNull String str6, int i9, @NotNull String str7, int i10, boolean z6) {
            return new Children(i7, str, str2, j7, str3, str4, i8, str5, str6, i9, str7, i10, z6);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Children)) {
                return false;
            }
            Children children = (Children) obj;
            return this.copy_right == children.copy_right && Intrinsics.areEqual(this.desc, children.desc) && Intrinsics.areEqual(this.description, children.description) && this.id == children.id && Intrinsics.areEqual(this.intro_copy, children.intro_copy) && Intrinsics.areEqual(this.intro_original, children.intro_original) && this.max_video_count == children.max_video_count && Intrinsics.areEqual(this.name, children.name) && Intrinsics.areEqual(this.notice, children.notice) && this.parent == children.parent && Intrinsics.areEqual(this.parent_name, children.parent_name) && this.rank == children.rank && this.show == children.show;
        }

        public final int getCopy_right() {
            return this.copy_right;
        }

        @NotNull
        public final String getDesc() {
            return this.desc;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getIntro_copy() {
            return this.intro_copy;
        }

        @NotNull
        public final String getIntro_original() {
            return this.intro_original;
        }

        public final int getMax_video_count() {
            return this.max_video_count;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getNotice() {
            return this.notice;
        }

        public final int getParent() {
            return this.parent;
        }

        @NotNull
        public final String getParent_name() {
            return this.parent_name;
        }

        public final int getRank() {
            return this.rank;
        }

        public final boolean getShow() {
            return this.show;
        }

        public int hashCode() {
            return Boolean.hashCode(this.show) + I.a(this.rank, E.a(I.a(this.parent, E.a(E.a(I.a(this.max_video_count, E.a(E.a(C3554n0.a(E.a(E.a(Integer.hashCode(this.copy_right) * 31, 31, this.desc), 31, this.description), 31, this.id), 31, this.intro_copy), 31, this.intro_original), 31), 31, this.name), 31, this.notice), 31), 31, this.parent_name), 31);
        }

        public final void setCopy_right(int i7) {
            this.copy_right = i7;
        }

        public final void setDesc(@NotNull String str) {
            this.desc = str;
        }

        public final void setDescription(@NotNull String str) {
            this.description = str;
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setIntro_copy(@NotNull String str) {
            this.intro_copy = str;
        }

        public final void setIntro_original(@NotNull String str) {
            this.intro_original = str;
        }

        public final void setMax_video_count(int i7) {
            this.max_video_count = i7;
        }

        public final void setName(@NotNull String str) {
            this.name = str;
        }

        public final void setNotice(@NotNull String str) {
            this.notice = str;
        }

        public final void setParent(int i7) {
            this.parent = i7;
        }

        public final void setParent_name(@NotNull String str) {
            this.parent_name = str;
        }

        public final void setRank(int i7) {
            this.rank = i7;
        }

        public final void setShow(boolean z6) {
            this.show = z6;
        }

        @NotNull
        public String toString() {
            int i7 = this.copy_right;
            String str = this.desc;
            String str2 = this.description;
            long j7 = this.id;
            String str3 = this.intro_copy;
            String str4 = this.intro_original;
            int i8 = this.max_video_count;
            String str5 = this.name;
            String str6 = this.notice;
            int i9 = this.parent;
            String str7 = this.parent_name;
            int i10 = this.rank;
            boolean z6 = this.show;
            StringBuilder sbB = a.b(i7, "Children(copy_right=", ", desc=", str, ", description=");
            v.a(j7, str2, ", id=", sbB);
            B.a(", intro_copy=", str3, ", intro_original=", str4, sbB);
            l.a(i8, ", max_video_count=", ", name=", str5, sbB);
            bf.a.a(i9, ", notice=", str6, ", parent=", sbB);
            bf.a.a(i10, ", parent_name=", str7, ", rank=", sbB);
            sbB.append(", show=");
            sbB.append(z6);
            sbB.append(")");
            return sbB.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/frame/net/Predict$HumanType.class */
    @Keep
    public static final class HumanType implements Serializable, Cloneable {
        private long id;

        @NotNull
        private String name;

        public HumanType() {
            this(0L, null, 3, null);
        }

        public HumanType(long j7, @NotNull String str) {
            this.id = j7;
            this.name = str;
        }

        public /* synthetic */ HumanType(long j7, String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? "" : str);
        }

        public static /* synthetic */ HumanType copy$default(HumanType humanType, long j7, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j7 = humanType.id;
            }
            if ((i7 & 2) != 0) {
                str = humanType.name;
            }
            return humanType.copy(j7, str);
        }

        @NotNull
        public /* bridge */ Object clone() {
            return super.clone();
        }

        public final long component1() {
            return this.id;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final HumanType copy(long j7, @NotNull String str) {
            return new HumanType(j7, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HumanType)) {
                return false;
            }
            HumanType humanType = (HumanType) obj;
            return this.id == humanType.id && Intrinsics.areEqual(this.name, humanType.name);
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (Long.hashCode(this.id) * 31);
        }

        public final void setId(long j7) {
            this.id = j7;
        }

        public final void setName(@NotNull String str) {
            this.name = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sbA = n.a(this.id, "HumanType(id=", ", name=", this.name);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public Predict() {
        this(null, 0, null, null, 0L, null, null, 0, null, null, null, 0, null, 0, false, null, 65535, null);
    }

    public Predict(@NotNull List<Children> list, int i7, @NotNull String str, @NotNull String str2, long j7, @NotNull String str3, @NotNull String str4, int i8, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i9, @NotNull String str8, int i10, boolean z6, @Nullable HumanType humanType) {
        this.children = list;
        this.copy_right = i7;
        this.desc = str;
        this.description = str2;
        this.id = j7;
        this.intro_copy = str3;
        this.intro_original = str4;
        this.max_video_count = i8;
        this.request_id = str5;
        this.name = str6;
        this.notice = str7;
        this.parent = i9;
        this.parent_name = str8;
        this.rank = i10;
        this.show = z6;
        this.human_type = humanType;
    }

    public /* synthetic */ Predict(List list, int i7, String str, String str2, long j7, String str3, String str4, int i8, String str5, String str6, String str7, int i9, String str8, int i10, boolean z6, HumanType humanType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? 0L : j7, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? "" : str4, (i11 & 128) != 0 ? 0 : i8, (i11 & 256) != 0 ? "" : str5, (i11 & 512) != 0 ? "" : str6, (i11 & 1024) != 0 ? "" : str7, (i11 & 2048) != 0 ? 0 : i9, (i11 & 4096) != 0 ? "" : str8, (i11 & 8192) != 0 ? 0 : i10, (i11 & 16384) != 0 ? false : z6, (i11 & 32768) != 0 ? null : humanType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Predict copy$default(Predict predict, List list, int i7, String str, String str2, long j7, String str3, String str4, int i8, String str5, String str6, String str7, int i9, String str8, int i10, boolean z6, HumanType humanType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = predict.children;
        }
        if ((i11 & 2) != 0) {
            i7 = predict.copy_right;
        }
        if ((i11 & 4) != 0) {
            str = predict.desc;
        }
        if ((i11 & 8) != 0) {
            str2 = predict.description;
        }
        if ((i11 & 16) != 0) {
            j7 = predict.id;
        }
        if ((i11 & 32) != 0) {
            str3 = predict.intro_copy;
        }
        if ((i11 & 64) != 0) {
            str4 = predict.intro_original;
        }
        if ((i11 & 128) != 0) {
            i8 = predict.max_video_count;
        }
        if ((i11 & 256) != 0) {
            str5 = predict.request_id;
        }
        if ((i11 & 512) != 0) {
            str6 = predict.name;
        }
        if ((i11 & 1024) != 0) {
            str7 = predict.notice;
        }
        if ((i11 & 2048) != 0) {
            i9 = predict.parent;
        }
        if ((i11 & 4096) != 0) {
            str8 = predict.parent_name;
        }
        if ((i11 & 8192) != 0) {
            i10 = predict.rank;
        }
        if ((i11 & 16384) != 0) {
            z6 = predict.show;
        }
        if ((i11 & 32768) != 0) {
            humanType = predict.human_type;
        }
        return predict.copy(list, i7, str, str2, j7, str3, str4, i8, str5, str6, str7, i9, str8, i10, z6, humanType);
    }

    @NotNull
    public /* bridge */ Object clone() {
        return super.clone();
    }

    @NotNull
    public final List<Children> component1() {
        return this.children;
    }

    @NotNull
    public final String component10() {
        return this.name;
    }

    @NotNull
    public final String component11() {
        return this.notice;
    }

    public final int component12() {
        return this.parent;
    }

    @NotNull
    public final String component13() {
        return this.parent_name;
    }

    public final int component14() {
        return this.rank;
    }

    public final boolean component15() {
        return this.show;
    }

    @Nullable
    public final HumanType component16() {
        return this.human_type;
    }

    public final int component2() {
        return this.copy_right;
    }

    @NotNull
    public final String component3() {
        return this.desc;
    }

    @NotNull
    public final String component4() {
        return this.description;
    }

    public final long component5() {
        return this.id;
    }

    @NotNull
    public final String component6() {
        return this.intro_copy;
    }

    @NotNull
    public final String component7() {
        return this.intro_original;
    }

    public final int component8() {
        return this.max_video_count;
    }

    @NotNull
    public final String component9() {
        return this.request_id;
    }

    @NotNull
    public final Predict copy(@NotNull List<Children> list, int i7, @NotNull String str, @NotNull String str2, long j7, @NotNull String str3, @NotNull String str4, int i8, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i9, @NotNull String str8, int i10, boolean z6, @Nullable HumanType humanType) {
        return new Predict(list, i7, str, str2, j7, str3, str4, i8, str5, str6, str7, i9, str8, i10, z6, humanType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Predict)) {
            return false;
        }
        Predict predict = (Predict) obj;
        return Intrinsics.areEqual(this.children, predict.children) && this.copy_right == predict.copy_right && Intrinsics.areEqual(this.desc, predict.desc) && Intrinsics.areEqual(this.description, predict.description) && this.id == predict.id && Intrinsics.areEqual(this.intro_copy, predict.intro_copy) && Intrinsics.areEqual(this.intro_original, predict.intro_original) && this.max_video_count == predict.max_video_count && Intrinsics.areEqual(this.request_id, predict.request_id) && Intrinsics.areEqual(this.name, predict.name) && Intrinsics.areEqual(this.notice, predict.notice) && this.parent == predict.parent && Intrinsics.areEqual(this.parent_name, predict.parent_name) && this.rank == predict.rank && this.show == predict.show && Intrinsics.areEqual(this.human_type, predict.human_type);
    }

    @NotNull
    public final List<Children> getChildren() {
        return this.children;
    }

    public final int getCopy_right() {
        return this.copy_right;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final HumanType getHuman_type() {
        return this.human_type;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getIntro_copy() {
        return this.intro_copy;
    }

    @NotNull
    public final String getIntro_original() {
        return this.intro_original;
    }

    public final int getMax_video_count() {
        return this.max_video_count;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNotice() {
        return this.notice;
    }

    public final int getParent() {
        return this.parent;
    }

    @NotNull
    public final String getParent_name() {
        return this.parent_name;
    }

    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final String getRequest_id() {
        return this.request_id;
    }

    public final boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        int iA = z.a(I.a(this.rank, E.a(I.a(this.parent, E.a(E.a(E.a(I.a(this.max_video_count, E.a(E.a(C3554n0.a(E.a(E.a(I.a(this.copy_right, this.children.hashCode() * 31, 31), 31, this.desc), 31, this.description), 31, this.id), 31, this.intro_copy), 31, this.intro_original), 31), 31, this.request_id), 31, this.name), 31, this.notice), 31), 31, this.parent_name), 31), 31, this.show);
        HumanType humanType = this.human_type;
        return iA + (humanType == null ? 0 : humanType.hashCode());
    }

    public final void setChildren(@NotNull List<Children> list) {
        this.children = list;
    }

    public final void setCopy_right(int i7) {
        this.copy_right = i7;
    }

    public final void setDesc(@NotNull String str) {
        this.desc = str;
    }

    public final void setDescription(@NotNull String str) {
        this.description = str;
    }

    public final void setHuman_type(@Nullable HumanType humanType) {
        this.human_type = humanType;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setIntro_copy(@NotNull String str) {
        this.intro_copy = str;
    }

    public final void setIntro_original(@NotNull String str) {
        this.intro_original = str;
    }

    public final void setMax_video_count(int i7) {
        this.max_video_count = i7;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    public final void setNotice(@NotNull String str) {
        this.notice = str;
    }

    public final void setParent(int i7) {
        this.parent = i7;
    }

    public final void setParent_name(@NotNull String str) {
        this.parent_name = str;
    }

    public final void setRank(int i7) {
        this.rank = i7;
    }

    public final void setRequest_id(@NotNull String str) {
        this.request_id = str;
    }

    public final void setShow(boolean z6) {
        this.show = z6;
    }

    @NotNull
    public String toString() {
        List<Children> list = this.children;
        int i7 = this.copy_right;
        String str = this.desc;
        String str2 = this.description;
        long j7 = this.id;
        String str3 = this.intro_copy;
        String str4 = this.intro_original;
        int i8 = this.max_video_count;
        String str5 = this.request_id;
        String str6 = this.name;
        String str7 = this.notice;
        int i9 = this.parent;
        String str8 = this.parent_name;
        int i10 = this.rank;
        boolean z6 = this.show;
        HumanType humanType = this.human_type;
        StringBuilder sb = new StringBuilder("Predict(children=");
        sb.append(list);
        sb.append(", copy_right=");
        sb.append(i7);
        sb.append(", desc=");
        B.a(str, ", description=", str2, ", id=", sb);
        d.a(j7, ", intro_copy=", str3, sb);
        bf.a.a(i8, ", intro_original=", str4, ", max_video_count=", sb);
        B.a(", request_id=", str5, ", name=", str6, sb);
        bf.a.a(i9, ", notice=", str7, ", parent=", sb);
        bf.a.a(i10, ", parent_name=", str8, ", rank=", sb);
        sb.append(", show=");
        sb.append(z6);
        sb.append(", human_type=");
        sb.append(humanType);
        sb.append(")");
        return sb.toString();
    }
}
