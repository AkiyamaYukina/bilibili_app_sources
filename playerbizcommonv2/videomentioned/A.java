package com.bilibili.playerbizcommonv2.videomentioned;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/videomentioned/A.class */
@StabilityInferred(parameters = 0)
public final class A<E extends UIComponent.ViewEntry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f81979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f81980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final h f81981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public List<MentionedCardItem<E>> f81982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f81983e;

    public A() {
        throw null;
    }

    public A(String str, h hVar, String str2) {
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        List<MentionedCardItem<E>> listEmptyList = CollectionsKt.emptyList();
        this.f81979a = str;
        this.f81980b = MutableStateFlow;
        this.f81981c = hVar;
        this.f81982d = listEmptyList;
        this.f81983e = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return Intrinsics.areEqual(this.f81979a, a7.f81979a) && Intrinsics.areEqual(this.f81980b, a7.f81980b) && Intrinsics.areEqual(this.f81981c, a7.f81981c) && Intrinsics.areEqual(this.f81982d, a7.f81982d) && Intrinsics.areEqual(this.f81983e, a7.f81983e);
    }

    public final int hashCode() {
        int iHashCode = this.f81979a.hashCode();
        int iHashCode2 = this.f81980b.hashCode();
        h hVar = this.f81981c;
        return this.f81983e.hashCode() + e0.a((((iHashCode2 + (iHashCode * 31)) * 31) + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.f81982d);
    }

    @NotNull
    public final String toString() {
        List<MentionedCardItem<E>> list = this.f81982d;
        StringBuilder sb = new StringBuilder("VideoMentionedModule(title=");
        sb.append(this.f81979a);
        sb.append(", selectIdxFlow=");
        sb.append(this.f81980b);
        sb.append(", button=");
        sb.append(this.f81981c);
        sb.append(", cards=");
        sb.append(list);
        sb.append(", videoReq=");
        return C8770a.a(sb, this.f81983e, ")");
    }
}
