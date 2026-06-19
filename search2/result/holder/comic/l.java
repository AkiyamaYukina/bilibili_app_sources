package com.bilibili.search2.result.holder.comic;

import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.common.utils.share.IListShare;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchComicItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/comic/l.class */
public final class l implements IListShare {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseSearchItem f88108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f88109b;

    public l(BaseSearchItem baseSearchItem, k kVar) {
        this.f88108a = baseSearchItem;
        this.f88109b = kVar;
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
        String cover = this.f88108a.getCover();
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
        String uri = this.f88108a.getUri();
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
        ExposeItem exposeItem = this.f88109b;
        CharSequence charSequenceDecode$default = ColorTagHandler.decode$default(exposeItem.itemView.getContext(), ((SearchComicItem) exposeItem.getData()).getTitle(), 0, 4, (Object) null);
        CharSequence charSequence = charSequenceDecode$default;
        if (charSequenceDecode$default == null) {
            charSequence = "";
        }
        return charSequence.toString();
    }
}
