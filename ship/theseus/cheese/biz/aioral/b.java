package com.bilibili.ship.theseus.cheese.biz.aioral;

import I.E;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.C3591b1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.opensource.svgaplayer.SVGAParser;
import fu0.C7179a;
import java.net.URL;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/b.class */
@StabilityInferred(parameters = 0)
public final class b extends com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c<C7179a> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f89010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C3591b1 f89011m;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/aioral/b$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f89012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f89013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f89014c;

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.f89012a = str;
            this.f89013b = str2;
            this.f89014c = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f89012a, aVar.f89012a) && Intrinsics.areEqual(this.f89013b, aVar.f89013b) && Intrinsics.areEqual(this.f89014c, aVar.f89014c);
        }

        public final int hashCode() {
            return this.f89014c.hashCode() + E.a(this.f89012a.hashCode() * 31, 31, this.f89013b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("GuideContent(url=");
            sb.append(this.f89012a);
            sb.append(", title=");
            sb.append(this.f89013b);
            sb.append(", content=");
            return C8770a.a(sb, this.f89014c, ")");
        }
    }

    public b(@NotNull a aVar, @NotNull C3591b1 c3591b1) {
        this.f89010l = aVar;
        this.f89011m = c3591b1;
        l(0.5625f);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final Object d(ViewBinding viewBinding, Continuation continuation) {
        C7179a c7179a = (C7179a) viewBinding;
        Context context = c7179a.f119520a.getContext();
        a aVar = this.f89010l;
        c7179a.f119524e.setText(aVar.f89013b);
        c7179a.f119522c.setText(aVar.f89014c);
        SVGAParser sVGAParser = new SVGAParser(context);
        String str = aVar.f89012a;
        if (str.length() > 0) {
            sVGAParser.parse(new URL(str), new c(c7179a));
        }
        c7179a.f119521b.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.ship.theseus.cheese.biz.aioral.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f89009a;

            {
                this.f89009a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.f89009a;
                bVar.f89011m.invoke();
                bVar.c();
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final ViewBinding e(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C7179a.inflate(layoutInflater, viewGroup, false);
    }

    @Override // com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.c
    public final boolean i() {
        return false;
    }
}
