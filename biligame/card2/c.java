package com.bilibili.biligame.card2;

import com.bilibili.biligame.utils.IFollowListener;
import com.bilibili.droid.ToastHelper;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/c.class */
public final class c implements IFollowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameCardButtonPresentImpV2 f62909a;

    public c(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2) {
        this.f62909a = gameCardButtonPresentImpV2;
    }

    public final void onFollowFailure(int i7) {
    }

    public final void onFollowSuccess(int i7) {
        ToastHelper.showToastLong(this.f62909a.f62865a, "已关注游戏，可在“我的-我的我关注的游戏”中查看");
    }
}
