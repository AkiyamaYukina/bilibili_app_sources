package com.bilibili.upper.module.manuscript.activity;

import androidx.fragment.app.DialogFragment;
import kntr.app.game.gamebind.bean.RoleItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/activity/q.class */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f113554a;

    public final Object invoke(Object obj) {
        switch (this.f113554a) {
            case 0:
                int i7 = ManuscriptProgressDetailsActivity.f113427E1;
                ((DialogFragment) obj).dismissAllowingStateLoss();
                return Unit.INSTANCE;
            default:
                return String.valueOf(((RoleItem) obj).getGameBaseId());
        }
    }
}
