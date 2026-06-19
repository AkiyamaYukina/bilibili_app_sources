package com.bilibili.ship.theseus.united.player.mediaplay.network;

import I.E;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.animation.C3357h;
import androidx.compose.animation.z;
import androidx.compose.material.C3840f1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.search2.api.SearchBangumiItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/d.class */
@StabilityInferred(parameters = 0)
public final class d implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow f104540a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/d$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f104541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f104543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f104544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f104545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f104546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final String f104547g;

        public a() {
            this(SearchBangumiItem.TYPE_FULLNET_BANGUMI, null, null, null, false, false);
        }

        public /* synthetic */ a(int i7, String str, String str2, String str3, boolean z6, boolean z7) {
            this((i7 & 4) != 0 ? FoundationAlias.getFapp().getString(2131845638) : str, FoundationAlias.getFapp().getString(2131846789), (i7 & 16) != 0 ? FoundationAlias.getFapp().getString(2131846944) : str2, (i7 & 32) != 0 ? "" : str3, "", (i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? true : z7);
        }

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z6, boolean z7) {
            this.f104541a = z6;
            this.f104542b = z7;
            this.f104543c = str;
            this.f104544d = str2;
            this.f104545e = str3;
            this.f104546f = str4;
            this.f104547g = str5;
        }

        public static a a(a aVar, String str, String str2, String str3, int i7) {
            boolean z6 = aVar.f104541a;
            boolean z7 = aVar.f104542b;
            String str4 = aVar.f104543c;
            if ((i7 & 8) != 0) {
                str = aVar.f104544d;
            }
            String str5 = aVar.f104545e;
            if ((i7 & 32) != 0) {
                str2 = aVar.f104546f;
            }
            if ((i7 & 64) != 0) {
                str3 = aVar.f104547g;
            }
            aVar.getClass();
            return new a(str4, str, str5, str2, str3, z6, z7);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f104541a == aVar.f104541a && this.f104542b == aVar.f104542b && Intrinsics.areEqual(this.f104543c, aVar.f104543c) && Intrinsics.areEqual(this.f104544d, aVar.f104544d) && Intrinsics.areEqual(this.f104545e, aVar.f104545e) && Intrinsics.areEqual(this.f104546f, aVar.f104546f) && Intrinsics.areEqual(this.f104547g, aVar.f104547g);
        }

        public final int hashCode() {
            return this.f104547g.hashCode() + E.a(E.a(E.a(E.a(z.a(Boolean.hashCode(this.f104541a) * 31, 31, this.f104542b), 31, this.f104543c), 31, this.f104544d), 31, this.f104545e), 31, this.f104546f);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(showCheckBox=");
            sb.append(this.f104541a);
            sb.append(", isLeftVisible=");
            sb.append(this.f104542b);
            sb.append(", tipText=");
            sb.append(this.f104543c);
            sb.append(", leftText=");
            sb.append(this.f104544d);
            sb.append(", rightText=");
            sb.append(this.f104545e);
            sb.append(", bottomText=");
            sb.append(this.f104546f);
            sb.append(", coverUrl=");
            return C8770a.a(sb, this.f104547g, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/d$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/d$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f104548a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f104549b = 105;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f104550c = 30;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f104551d = 14;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final boolean f104552e = true;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final boolean f104553f = true;

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final boolean a() {
                return f104552e;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final boolean b() {
                return f104553f;
            }

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof a);
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final int getHeight() {
                return f104550c;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final int getMinWidth() {
                return f104549b;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final int getTextSize() {
                return f104551d;
            }

            public final int hashCode() {
                return 314147429;
            }

            @NotNull
            public final String toString() {
                return "Big";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/d$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C1169b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f104554a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f104555b;

            public C1169b(boolean z6, boolean z7) {
                this.f104554a = z6;
                this.f104555b = z7;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final boolean a() {
                return this.f104554a;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final boolean b() {
                return this.f104555b;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1169b)) {
                    return false;
                }
                C1169b c1169b = (C1169b) obj;
                return this.f104554a == c1169b.f104554a && this.f104555b == c1169b.f104555b;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final int getHeight() {
                return 30;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final int getMinWidth() {
                return 105;
            }

            @Override // com.bilibili.ship.theseus.united.player.mediaplay.network.d.b
            public final int getTextSize() {
                return 14;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f104555b) + (Boolean.hashCode(this.f104554a) * 31);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("Small(showCloseButton=");
                sb.append(this.f104554a);
                sb.append(", showErrorIcon=");
                return androidx.appcompat.app.i.a(sb, this.f104555b, ")");
            }
        }

        boolean a();

        boolean b();

        int getHeight();

        int getMinWidth();

        int getTextSize();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/d$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final a f104556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final b f104557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f104558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Function1<Boolean, Unit> f104559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Function0<Unit> f104560e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@NotNull a aVar, @NotNull b bVar, @NotNull Function0<Unit> function0, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function0<Unit> function02) {
            this.f104556a = aVar;
            this.f104557b = bVar;
            this.f104558c = function0;
            this.f104559d = function1;
            this.f104560e = function02;
        }

        public static c a(c cVar, a aVar, b bVar, Function0 function0, int i7) {
            if ((i7 & 1) != 0) {
                aVar = cVar.f104556a;
            }
            if ((i7 & 2) != 0) {
                bVar = cVar.f104557b;
            }
            Function0<Unit> function02 = cVar.f104558c;
            Function1<Boolean, Unit> function1 = cVar.f104559d;
            if ((i7 & 16) != 0) {
                function0 = cVar.f104560e;
            }
            cVar.getClass();
            return new c(aVar, bVar, function02, function1, function0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f104556a, cVar.f104556a) && Intrinsics.areEqual(this.f104557b, cVar.f104557b) && Intrinsics.areEqual(this.f104558c, cVar.f104558c) && Intrinsics.areEqual(this.f104559d, cVar.f104559d) && Intrinsics.areEqual(this.f104560e, cVar.f104560e);
        }

        public final int hashCode() {
            return this.f104560e.hashCode() + O4.b.a(C3357h.a((this.f104557b.hashCode() + (this.f104556a.hashCode() * 31)) * 31, 31, this.f104558c), 31, this.f104559d);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("State(content=");
            sb.append(this.f104556a);
            sb.append(", style=");
            sb.append(this.f104557b);
            sb.append(", closeClick=");
            sb.append(this.f104558c);
            sb.append(", continuePlay=");
            sb.append(this.f104559d);
            sb.append(", goToFreeCellular=");
            return Y0.c.a(sb, this.f104560e, ")");
        }
    }

    public d(@NotNull MutableStateFlow mutableStateFlow) {
        this.f104540a = mutableStateFlow;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final int i7 = 0;
        ((ComposeView) ((UIComponent.b) viewEntry).a).setContent(ComposableLambdaKt.composableLambdaInstance(-326135589, true, new Function2(this, i7) { // from class: com.bilibili.ship.theseus.united.player.mediaplay.network.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f104538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f104539b;

            {
                this.f104538a = i7;
                this.f104539b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                switch (this.f104538a) {
                    case 0:
                        Composer composer = (Composer) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-326135589, iIntValue, -1, "com.bilibili.ship.theseus.united.player.mediaplay.network.NetworkLimitedComponent.bindToView.<anonymous> (NetworkLimitedComponent.kt:44)");
                            }
                            BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-567001453, true, new C3840f1((d) this.f104539b, 1), composer, 54), composer, 384, 3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        break;
                    default:
                        if (!((Boolean) obj).booleanValue()) {
                            jD.i iVar = (jD.i) this.f104539b;
                            if (iVar.c) {
                                iVar.c = false;
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new UIComponent.b(new ComposeView(context, null, 0, 6, null));
    }
}
