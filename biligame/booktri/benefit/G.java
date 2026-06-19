package com.bilibili.biligame.booktri.benefit;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bilibili.biligame.api.BiligameGiftDetail;
import com.bilibili.ship.theseus.united.page.playviewextra.PromptBarVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/G.class */
public final /* synthetic */ class G implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f62277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f62278d;

    public /* synthetic */ G(int i7, int i8, Object obj, Object obj2) {
        this.f62275a = i8;
        this.f62277c = obj;
        this.f62278d = obj2;
        this.f62276b = i7;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62275a) {
            case 0:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f62276b | 1);
                g0.j((Context) this.f62277c, (BiligameGiftDetail) this.f62278d, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f62276b | 1);
                ((com.bilibili.ship.theseus.united.page.intro.module.promptbar.w) this.f62277c).j((PromptBarVo) this.f62278d, (Composer) obj, iUpdateChangedFlags2);
                break;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.f62276b | 1);
                ((kntr.app.digital.preview.wallpaper.x) this.f62277c).a((Function0) this.f62278d, (Composer) obj, iUpdateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }
}
