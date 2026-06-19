package com.bilibili.ogv.review.detailpage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bilibili.ogv.review.data.ReviewTag;
import com.bilibili.ogv.review.data.ReviewType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/y.class */
@StabilityInferred(parameters = 0)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bplus.followingpublish.fragments.n f72427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<ReviewTag> f72428b = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableState f72429c = SnapshotStateKt.mutableStateOf$default(ReviewType.ALL, null, 2, null);

    public y(@NotNull com.bilibili.bplus.followingpublish.fragments.n nVar) {
        this.f72427a = nVar;
    }
}
