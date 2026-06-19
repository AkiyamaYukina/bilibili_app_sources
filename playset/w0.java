package com.bilibili.playset;

import androidx.annotation.Nullable;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.playset.api.MultitypeMedia;
import com.bilibili.playset.api.PlaySetGroups;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/w0.class */
public final class w0 extends BiliApiDataCallback<PlaySetGroups.DefaultFolderGroup> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlaySetGroups.DefaultFolderGroup f85666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5996p f85667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f85668d;

    public w0(x0 x0Var, PlaySetGroups.DefaultFolderGroup defaultFolderGroup, C5996p c5996p) {
        this.f85668d = x0Var;
        this.f85666b = defaultFolderGroup;
        this.f85667c = c5996p;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(@Nullable PlaySetGroups.DefaultFolderGroup defaultFolderGroup) {
        PlaySetGroups.DefaultFolderGroup defaultFolderGroup2 = defaultFolderGroup;
        if (defaultFolderGroup2 == null) {
            onError(null);
            return;
        }
        PlaySetGroups.DefaultFolderGroup defaultFolderGroup3 = this.f85666b;
        defaultFolderGroup3.curPage++;
        List<MultitypeMedia> list = defaultFolderGroup2.medias;
        C5996p c5996p = this.f85667c;
        if (list == null || list.isEmpty()) {
            c5996p.f85185e.f84073a = 3;
            c5996p.r0();
        } else {
            defaultFolderGroup3.hasMore = defaultFolderGroup2.hasMore;
            defaultFolderGroup3.addItems(new ArrayList(list));
            this.f85668d.notifyItemRangeInserted(c5996p.getAdapterPosition(), list.size());
            if (defaultFolderGroup2.hasMore) {
                c5996p.f85185e.f84073a = 1;
                c5996p.s0();
            } else {
                c5996p.f85185e.f84073a = 3;
                c5996p.r0();
            }
        }
        defaultFolderGroup3.isLoading = false;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        C5996p c5996p = this.f85667c;
        c5996p.f85185e.f84073a = 1;
        c5996p.s0();
        this.f85666b.isLoading = false;
    }
}
