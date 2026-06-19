package com.bilibili.search2.result.bangumi;

import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.common.utils.share.IListShare;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.search2.api.SearchBangumiItem;

/* JADX INFO: renamed from: com.bilibili.search2.result.bangumi.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/m.class */
public final class C6073m implements IListShare {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchBangumiItem f87444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6072l f87445b;

    public C6073m(SearchBangumiItem searchBangumiItem, C6072l c6072l) {
        this.f87444a = searchBangumiItem;
        this.f87445b = c6072l;
    }

    public final String getAuthor() {
        return "";
    }

    public final long getAvId() {
        return 0L;
    }

    public final String getBvid() {
        return "";
    }

    public final String getCover() {
        String cover = this.f87444a.getCover();
        String str = cover;
        if (cover == null) {
            str = "";
        }
        return str;
    }

    public final String getDescription() {
        return "";
    }

    public final long getMid() {
        return 0L;
    }

    public final String getPlayNumber() {
        return "";
    }

    public final String getShareShortLink() {
        String uri = this.f87444a.getUri();
        String str = uri;
        if (uri == null) {
            str = "";
        }
        return str;
    }

    public final String getShareSubtitle() {
        return "";
    }

    public final String getTitle() {
        ExposeItem exposeItem = this.f87445b;
        CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(exposeItem.itemView.getContext(), ((SearchBangumiItem) exposeItem.getData()).getTitle(), 0, 4, (Object) null);
        CharSequence charSequence = charSequenceDecode$default;
        if (charSequenceDecode$default == null) {
            charSequence = "";
        }
        return charSequence.toString();
    }
}
