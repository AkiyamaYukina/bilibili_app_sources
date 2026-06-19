package com.bilibili.pegasus.utils;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.utils.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/utils/a.class */
@StabilityInferred(parameters = 0)
public final class C5757a extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<BasicIndexItem> f78864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<BasicIndexItem> f78865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SparseArray<String> f78866c = new SparseArray<>();

    public C5757a(@NotNull List<? extends BasicIndexItem> list, @NotNull List<? extends BasicIndexItem> list2) {
        this.f78864a = list;
        this.f78865b = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        boolean zAreEqual = Intrinsics.areEqual(this.f78864a.get(i7).getUniqueIdentity(), this.f78865b.get(i8).getUniqueIdentity());
        boolean zHasPendingUpdate = this.f78865b.get(i8).hasPendingUpdate();
        if (zAreEqual && zHasPendingUpdate) {
            this.f78866c.put(i8, "PAYLOAD_PENDING_UPDATE");
        }
        return zAreEqual && !zHasPendingUpdate;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return Intrinsics.areEqual(this.f78864a.get(i7), this.f78865b.get(i8));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    @Nullable
    public final Object getChangePayload(int i7, int i8) {
        String str = this.f78866c.get(i8);
        Object changePayload = str;
        if (str == null) {
            changePayload = super.getChangePayload(i7, i8);
        }
        return changePayload;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f78865b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f78864a.size();
    }
}
