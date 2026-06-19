package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import com.bilibili.bilifeed.card.FeedItem;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelBaikeTitleItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/c.class */
@StabilityInferred(parameters = 0)
public final class c extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<FeedItem> f75114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<FeedItem> f75115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SparseArray<String> f75116c = new SparseArray<>();

    public c(@NotNull List<? extends FeedItem> list, @NotNull List<? extends FeedItem> list2) {
        this.f75114a = list;
        this.f75115b = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i7, int i8) {
        BasicIndexItem basicIndexItem = (FeedItem) this.f75114a.get(i7);
        BasicIndexItem basicIndexItem2 = (FeedItem) this.f75115b.get(i8);
        boolean z6 = false;
        if (Intrinsics.areEqual(basicIndexItem.getClass(), basicIndexItem2.getClass())) {
            if ((basicIndexItem instanceof BasicIndexItem) && (basicIndexItem2 instanceof BasicIndexItem)) {
                String uniqueIdentity = basicIndexItem.getUniqueIdentity();
                BasicIndexItem basicIndexItem3 = basicIndexItem2;
                boolean zAreEqual = Intrinsics.areEqual(uniqueIdentity, basicIndexItem3.getUniqueIdentity());
                boolean zHasPendingUpdate = basicIndexItem3.hasPendingUpdate();
                if (zAreEqual && zHasPendingUpdate) {
                    this.f75116c.put(i8, "PAYLOAD_PENDING_UPDATE");
                }
                boolean z7 = false;
                if (zAreEqual) {
                    z7 = false;
                    if (!zHasPendingUpdate) {
                        z7 = true;
                    }
                }
                return z7;
            }
            z6 = false;
            if (basicIndexItem instanceof ChannelBaikeTitleItem) {
                z6 = false;
                if (basicIndexItem2 instanceof ChannelBaikeTitleItem) {
                    ChannelBaikeTitleItem channelBaikeTitleItem = (ChannelBaikeTitleItem) basicIndexItem;
                    long navNid = channelBaikeTitleItem.getNavNid();
                    ChannelBaikeTitleItem channelBaikeTitleItem2 = (ChannelBaikeTitleItem) basicIndexItem2;
                    z6 = false;
                    if (navNid == channelBaikeTitleItem2.getNavNid()) {
                        z6 = false;
                        if (Intrinsics.areEqual(channelBaikeTitleItem.getTitle(), channelBaikeTitleItem2.getTitle())) {
                            z6 = true;
                        }
                    }
                }
            }
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i7, int i8) {
        return Intrinsics.areEqual(this.f75114a.get(i7), this.f75115b.get(i8));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    @Nullable
    public final Object getChangePayload(int i7, int i8) {
        String str = this.f75116c.get(i8);
        Object changePayload = str;
        if (str == null) {
            changePayload = super.getChangePayload(i7, i8);
        }
        return changePayload;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f75115b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f75114a.size();
    }
}
