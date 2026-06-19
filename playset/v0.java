package com.bilibili.playset;

import androidx.annotation.Nullable;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.PlaySet;
import com.bilibili.playset.api.PlaySetGroups;
import com.bilibili.playset.api.PlaySetPageData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/v0.class */
public final class v0 extends BiliApiDataCallback<PlaySetPageData> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5996p f85662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlaySetGroups.OtherFolderGroup f85663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f85664d;

    public v0(x0 x0Var, C5996p c5996p, PlaySetGroups.OtherFolderGroup otherFolderGroup) {
        this.f85664d = x0Var;
        this.f85662b = c5996p;
        this.f85663c = otherFolderGroup;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final boolean isCancel() {
        x0 x0Var = this.f85664d;
        PlaySetFragment playSetFragment = x0Var.f85829c;
        return playSetFragment == null || playSetFragment.p3() == null || x0Var.f85829c.isDetached();
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(@Nullable PlaySetPageData playSetPageData) {
        List<PlaySet> list;
        PlaySetPageData playSetPageData2 = playSetPageData;
        PlaySetGroups.OtherFolderGroup otherFolderGroup = this.f85663c;
        C5996p c5996p = this.f85662b;
        if (playSetPageData2 == null || (list = playSetPageData2.list) == null || list.isEmpty()) {
            c5996p.f85185e.f84073a = 3;
            c5996p.r0();
        } else {
            otherFolderGroup.pageData.hasMore = playSetPageData2.hasMore;
            otherFolderGroup.addItems(new ArrayList(playSetPageData2.list));
            this.f85664d.notifyItemRangeInserted(c5996p.getAdapterPosition(), playSetPageData2.list.size());
            if (playSetPageData2.hasMore) {
                c5996p.f85185e.f84073a = 1;
                c5996p.s0();
            } else {
                c5996p.f85185e.f84073a = 3;
                c5996p.r0();
            }
        }
        otherFolderGroup.isLoading = false;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        PlaySetGroups.OtherFolderGroup otherFolderGroup = this.f85663c;
        otherFolderGroup.curPage--;
        C5996p c5996p = this.f85662b;
        c5996p.f85185e.f84073a = 1;
        c5996p.s0();
        otherFolderGroup.isLoading = false;
    }
}
