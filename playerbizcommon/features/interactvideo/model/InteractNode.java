package com.bilibili.playerbizcommon.features.interactvideo.model;

import W60.F;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/InteractNode.class */
@Keep
public final class InteractNode implements Parcelable {

    @NotNull
    public static final a CREATOR = new Object();

    @JSONField(name = "edges")
    @Nullable
    private String edges;

    @JSONField(name = "hidden_vars")
    @Nullable
    private List<HiddenVar> hiddenvars;

    @JSONField(name = "is_leaf")
    private int mIsLeafNode;

    @JSONField(name = "story_list")
    @Nullable
    private List<Story> mStorys;

    @JSONField(name = "no_backtracking")
    private int noBacktracking;

    @JSONField(name = "no_evaluation")
    private int noEvaluation;

    @JSONField(name = "no_tutorial")
    private int noTutorial;

    @JSONField(name = "edge_id")
    private long nodeid;

    @JSONField(name = "preload")
    @Nullable
    private PreloadInfo preloadInfo;

    @JSONField(name = "title")
    @Nullable
    private String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/model/InteractNode$a.class */
    public static final class a implements Parcelable.Creator<InteractNode> {
        @Override // android.os.Parcelable.Creator
        public final InteractNode createFromParcel(Parcel parcel) {
            return new InteractNode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InteractNode[] newArray(int i7) {
            return new InteractNode[i7];
        }
    }

    public InteractNode() {
        this(null, 0L, null, null, null, null, 0, 0, 0, 0, 1023, null);
    }

    public InteractNode(@NotNull Parcel parcel) {
        this(parcel.createTypedArrayList(Story.CREATOR), parcel.readLong(), (PreloadInfo) parcel.readParcelable(PreloadInfo.class.getClassLoader()), parcel.createTypedArrayList(HiddenVar.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public InteractNode(@Nullable List<Story> list, long j7, @Nullable PreloadInfo preloadInfo, @Nullable List<HiddenVar> list2, @Nullable String str, @Nullable String str2, int i7, int i8, int i9, int i10) {
        this.mStorys = list;
        this.nodeid = j7;
        this.preloadInfo = preloadInfo;
        this.hiddenvars = list2;
        this.title = str;
        this.edges = str2;
        this.mIsLeafNode = i7;
        this.noBacktracking = i8;
        this.noTutorial = i9;
        this.noEvaluation = i10;
    }

    public /* synthetic */ InteractNode(List list, long j7, PreloadInfo preloadInfo, List list2, String str, String str2, int i7, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? 0L : j7, (i11 & 4) != 0 ? null : preloadInfo, (i11 & 8) != 0 ? null : list2, (i11 & 16) != 0 ? "" : str, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? 1 : i7, (i11 & 128) != 0 ? 0 : i8, (i11 & 256) != 0 ? 0 : i9, (i11 & 512) != 0 ? 0 : i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractNode copy$default(InteractNode interactNode, List list, long j7, PreloadInfo preloadInfo, List list2, String str, String str2, int i7, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = interactNode.mStorys;
        }
        if ((i11 & 2) != 0) {
            j7 = interactNode.nodeid;
        }
        if ((i11 & 4) != 0) {
            preloadInfo = interactNode.preloadInfo;
        }
        if ((i11 & 8) != 0) {
            list2 = interactNode.hiddenvars;
        }
        if ((i11 & 16) != 0) {
            str = interactNode.title;
        }
        if ((i11 & 32) != 0) {
            str2 = interactNode.edges;
        }
        if ((i11 & 64) != 0) {
            i7 = interactNode.mIsLeafNode;
        }
        if ((i11 & 128) != 0) {
            i8 = interactNode.noBacktracking;
        }
        if ((i11 & 256) != 0) {
            i9 = interactNode.noTutorial;
        }
        if ((i11 & 512) != 0) {
            i10 = interactNode.noEvaluation;
        }
        return interactNode.copy(list, j7, preloadInfo, list2, str, str2, i7, i8, i9, i10);
    }

    @Nullable
    public final List<Story> component1() {
        return this.mStorys;
    }

    public final int component10() {
        return this.noEvaluation;
    }

    public final long component2() {
        return this.nodeid;
    }

    @Nullable
    public final PreloadInfo component3() {
        return this.preloadInfo;
    }

    @Nullable
    public final List<HiddenVar> component4() {
        return this.hiddenvars;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    @Nullable
    public final String component6() {
        return this.edges;
    }

    public final int component7() {
        return this.mIsLeafNode;
    }

    public final int component8() {
        return this.noBacktracking;
    }

    public final int component9() {
        return this.noTutorial;
    }

    @NotNull
    public final InteractNode copy(@Nullable List<Story> list, long j7, @Nullable PreloadInfo preloadInfo, @Nullable List<HiddenVar> list2, @Nullable String str, @Nullable String str2, int i7, int i8, int i9, int i10) {
        return new InteractNode(list, j7, preloadInfo, list2, str, str2, i7, i8, i9, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractNode)) {
            return false;
        }
        InteractNode interactNode = (InteractNode) obj;
        return Intrinsics.areEqual(this.mStorys, interactNode.mStorys) && this.nodeid == interactNode.nodeid && Intrinsics.areEqual(this.preloadInfo, interactNode.preloadInfo) && Intrinsics.areEqual(this.hiddenvars, interactNode.hiddenvars) && Intrinsics.areEqual(this.title, interactNode.title) && Intrinsics.areEqual(this.edges, interactNode.edges) && this.mIsLeafNode == interactNode.mIsLeafNode && this.noBacktracking == interactNode.noBacktracking && this.noTutorial == interactNode.noTutorial && this.noEvaluation == interactNode.noEvaluation;
    }

    @Nullable
    public final String getEdges() {
        return this.edges;
    }

    @Nullable
    public final List<HiddenVar> getHiddenvars() {
        return this.hiddenvars;
    }

    public final int getMIsLeafNode() {
        return this.mIsLeafNode;
    }

    @Nullable
    public final List<Story> getMStorys() {
        return this.mStorys;
    }

    public final int getNoBacktracking() {
        return this.noBacktracking;
    }

    public final int getNoEvaluation() {
        return this.noEvaluation;
    }

    public final int getNoTutorial() {
        return this.noTutorial;
    }

    public final long getNodeid() {
        return this.nodeid;
    }

    @Nullable
    public final PreloadInfo getPreloadInfo() {
        return this.preloadInfo;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        List<Story> list = this.mStorys;
        int iHashCode = 0;
        int iA = C3554n0.a((list == null ? 0 : list.hashCode()) * 31, 31, this.nodeid);
        PreloadInfo preloadInfo = this.preloadInfo;
        int iHashCode2 = preloadInfo == null ? 0 : preloadInfo.hashCode();
        List<HiddenVar> list2 = this.hiddenvars;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        String str = this.title;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.edges;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Integer.hashCode(this.noEvaluation) + I.a(this.noTutorial, I.a(this.noBacktracking, I.a(this.mIsLeafNode, (((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31, 31), 31), 31);
    }

    public final void setEdges(@Nullable String str) {
        this.edges = str;
    }

    public final void setHiddenvars(@Nullable List<HiddenVar> list) {
        this.hiddenvars = list;
    }

    public final void setMIsLeafNode(int i7) {
        this.mIsLeafNode = i7;
    }

    public final void setMStorys(@Nullable List<Story> list) {
        this.mStorys = list;
    }

    public final void setNoBacktracking(int i7) {
        this.noBacktracking = i7;
    }

    public final void setNoEvaluation(int i7) {
        this.noEvaluation = i7;
    }

    public final void setNoTutorial(int i7) {
        this.noTutorial = i7;
    }

    public final void setNodeid(long j7) {
        this.nodeid = j7;
    }

    public final void setPreloadInfo(@Nullable PreloadInfo preloadInfo) {
        this.preloadInfo = preloadInfo;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        List<Story> list = this.mStorys;
        long j7 = this.nodeid;
        PreloadInfo preloadInfo = this.preloadInfo;
        List<HiddenVar> list2 = this.hiddenvars;
        String str = this.title;
        String str2 = this.edges;
        int i7 = this.mIsLeafNode;
        int i8 = this.noBacktracking;
        int i9 = this.noTutorial;
        int i10 = this.noEvaluation;
        StringBuilder sb = new StringBuilder("InteractNode(mStorys=");
        sb.append(list);
        sb.append(", nodeid=");
        sb.append(j7);
        sb.append(", preloadInfo=");
        sb.append(preloadInfo);
        sb.append(", hiddenvars=");
        sb.append(list2);
        B.a(", title=", str, ", edges=", str2, sb);
        F.b(i7, i8, ", mIsLeafNode=", ", noBacktracking=", sb);
        F.b(i9, i10, ", noTutorial=", ", noEvaluation=", sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeTypedList(this.mStorys);
        parcel.writeLong(this.nodeid);
        parcel.writeParcelable(this.preloadInfo, i7);
        parcel.writeTypedList(this.hiddenvars);
        parcel.writeString(this.title);
        parcel.writeString(this.edges);
        parcel.writeInt(this.mIsLeafNode);
        parcel.writeInt(this.noBacktracking);
        parcel.writeInt(this.noTutorial);
        parcel.writeInt(this.noEvaluation);
    }
}
