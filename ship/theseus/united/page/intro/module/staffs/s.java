package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.ship.theseus.united.page.intro.module.staffs.StaffsNewComponent;
import tv.danmaku.bili.videopage.common.widget.view.FlashTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/s.class */
public final class s implements FlashTextView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StaffsNewComponent.b f101894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101895b;

    public s(StaffsNewComponent.b bVar, int i7) {
        this.f101894a = bVar;
        this.f101895b = i7;
    }

    public final void onStart() {
        this.f101894a.f101819a.add(Integer.valueOf(this.f101895b));
    }
}
