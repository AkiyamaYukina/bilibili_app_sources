package com.bilibili.ship.theseus.playlist.uicomponent;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/o.class */
@StabilityInferred(parameters = 0)
public final class o implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final t f96068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f96069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.F f96070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.bplus.followinglist.page.opus.share.j f96071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.G f96072e;

    public o(@NotNull t tVar, @NotNull Context context, @NotNull com.bilibili.ship.theseus.playlist.F f7, @NotNull com.bilibili.bplus.followinglist.page.opus.share.j jVar, @NotNull com.bilibili.ship.theseus.playlist.G g7) {
        this.f96068a = tVar;
        this.f96069b = context;
        this.f96070c = f7;
        this.f96071d = jVar;
        this.f96072e = g7;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final UIComponent.b bVar = (UIComponent.b) viewEntry;
        ((ComposeView) bVar.a).setContent(ComposableLambdaKt.composableLambdaInstance(-1048326000, true, new Function2(this, bVar) { // from class: com.bilibili.ship.theseus.playlist.uicomponent.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f96066a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UIComponent.b f96067b;

            {
                this.f96066a = this;
                this.f96067b = bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
                /*
                    Method dump skipped, instruction units count: 215
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.uicomponent.n.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
