package com.bilibili.ship.theseus.ogv;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.bapis.bilibili.app.viewunite.pgcanymodel.Skin;
import com.bapis.bilibili.app.viewunite.pgcanymodel.ViewPgcAny;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuInputMode;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/o.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.DetailBizCoroutineScope"})
public final class o implements Factory<com.bilibili.ship.theseus.united.page.danmaku.r> {
    public static com.bilibili.ship.theseus.united.page.danmaku.r a(ViewReply viewReply, com.bilibili.ship.theseus.united.page.tab.u uVar, ViewPgcAny viewPgcAny, Context context, CoroutineScope coroutineScope) {
        final com.bilibili.ship.theseus.united.di.j jVar = new com.bilibili.ship.theseus.united.di.j(viewReply);
        Skin skin = viewPgcAny.getOgvData().getSkin();
        final long jA = n.a(Cj0.a.a(context) ? skin.getDmInputFrameBgNightColor() : skin.getDmInputFrameBgColor());
        final long jA2 = n.a(Cj0.a.a(context) ? skin.getDmInputFrameNightColor() : skin.getDmInputFrameColor());
        final long jA3 = n.a(Cj0.a.a(context) ? skin.getDmBtnBgNightColor() : skin.getDmBtnBgColor());
        final long jA4 = n.a(Cj0.a.a(context) ? skin.getDmBtnIconNightColor() : skin.getDmBtnIconColor());
        final long jA5 = n.a(Cj0.a.a(context) ? skin.getDmInputTextNightColor() : skin.getDmInputTextColor());
        final MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        FlowKt.launchIn(FlowKt.onEach(uVar.f103214d, new OgvDanmakuInputColorsModule$provide$1(mutableStateMutableStateOf$default, null)), coroutineScope);
        return (com.bilibili.ship.theseus.united.page.danmaku.r) Preconditions.checkNotNullFromProvides(new com.bilibili.ship.theseus.united.page.danmaku.r(jVar, mutableStateMutableStateOf$default, jA, jA2, jA3, jA4, jA5) { // from class: com.bilibili.ship.theseus.ogv.l

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.di.j f93960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final MutableState f93961b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f93962c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f93963d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final long f93964e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final long f93965f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final long f93966g;

            {
                this.f93960a = jVar;
                this.f93961b = mutableStateMutableStateOf$default;
                this.f93962c = jA;
                this.f93963d = jA2;
                this.f93964e = jA3;
                this.f93965f = jA4;
                this.f93966g = jA5;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bilibili.ship.theseus.united.page.danmaku.r
            public final com.bilibili.ship.theseus.united.page.danmaku.n a(DanmakuInputMode danmakuInputMode) {
                com.bilibili.ship.theseus.united.page.danmaku.n nVarA = this.f93960a.a(danmakuInputMode);
                com.bilibili.ship.theseus.united.page.danmaku.n c6209m = nVarA;
                if (((Boolean) this.f93961b.getValue()).booleanValue()) {
                    c6209m = new C6209m(nVarA, this.f93962c, this.f93963d, this.f93964e, this.f93965f, this.f93966g);
                }
                return c6209m;
            }
        });
    }
}
