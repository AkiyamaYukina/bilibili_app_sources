package com.bilibili.search2.result.bangumi;

import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.common.utils.share.IListShare;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchOgvChannelItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/M.class */
public final class M implements IListShare {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseSearchItem f87354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f87355b;

    public M(BaseSearchItem baseSearchItem, L l7) {
        this.f87354a = baseSearchItem;
        this.f87355b = l7;
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
        String cover = this.f87354a.getCover();
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
        String uri = this.f87354a.getUri();
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
        ExposeItem exposeItem = this.f87355b;
        CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(exposeItem.itemView.getContext(), ((SearchOgvChannelItem) exposeItem.getData()).getTitle(), 0, 4, (Object) null);
        CharSequence charSequence = charSequenceDecode$default;
        if (charSequenceDecode$default == null) {
            charSequence = "";
        }
        return charSequence.toString();
    }
}
