package com.bilibili.mini.player.biz;

import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import sh0.InterfaceC8592a;
import sh0.InterfaceC8593b;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mini/player/biz/c.class */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f66062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC8593b f66063b;

    public c(b bVar, InterfaceC8593b interfaceC8593b) {
        this.f66062a = bVar;
        this.f66063b = interfaceC8593b;
    }

    public final boolean a() {
        b bVar = this.f66062a;
        Integer num = bVar.f66049p;
        boolean z6 = false;
        int iIntValue = num != null ? num.intValue() : IPlayerSettingService.Companion.getMMainPlayerPreference().getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0);
        if (iIntValue == 0 || iIntValue == 1 ? bVar.f66035a.indexOf(bVar.f66042i) < bVar.f66035a.size() - 1 : !(iIntValue != 2 && iIntValue != 4)) {
            z6 = true;
        }
        return z6;
    }

    public final boolean b() {
        return b.k(this.f66062a);
    }

    public final boolean c(Video.PlayableParams playableParams) {
        boolean zA;
        InterfaceC8592a interfaceC8592aC = this.f66063b.c();
        if (interfaceC8592aC != null) {
            b bVar = this.f66062a;
            zA = interfaceC8592aC.a(bVar.h, playableParams, bVar.f66037c);
        } else {
            zA = false;
        }
        return zA;
    }
}
