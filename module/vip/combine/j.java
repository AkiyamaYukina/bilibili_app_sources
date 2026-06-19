package com.bilibili.module.vip.combine;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bili.rvext.ThreadLayoutInflater;
import com.bilibili.video.story.player.M;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/j.class */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66184a;

    public /* synthetic */ j(int i7) {
        this.f66184a = i7;
    }

    public final Object invoke(Object obj) {
        switch (this.f66184a) {
            case 0:
                FrameLayout frameLayout = new FrameLayout((Context) obj);
                frameLayout.setId(ViewCompat.generateViewId());
                return frameLayout;
            case 1:
                return Unit.INSTANCE;
            default:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i7 = ia.e.P;
                return new ia.e(M.a(viewGroup, ThreadLayoutInflater.Companion, 2131493584, viewGroup, false));
        }
    }
}
