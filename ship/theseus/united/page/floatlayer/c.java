package com.bilibili.ship.theseus.united.page.floatlayer;

import Vu0.p;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponent.ViewEntry;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.app.gemini.ui.n;
import dv0.C6884v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/c.class */
@StabilityInferred(parameters = 0)
public abstract class c<V extends UIComponent.ViewEntry> extends m<C6884v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f99729a = new a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public n f99730b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/c$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Drawable f99731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99733c;

        public a() {
            this(0);
        }

        public a(int i7) {
            this.f99731a = new ColorDrawable(2130706432);
            this.f99732b = 2130772366;
            this.f99733c = 2130772367;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f99731a, aVar.f99731a) && this.f99732b == aVar.f99732b && this.f99733c == aVar.f99733c;
        }

        public final int hashCode() {
            Drawable drawable = this.f99731a;
            return Integer.hashCode(this.f99733c) + I.a(this.f99732b, (drawable == null ? 0 : drawable.hashCode()) * 31, 31);
        }

        @NotNull
        public final String toString() {
            Drawable drawable = this.f99731a;
            StringBuilder sb = new StringBuilder("Config(background=");
            sb.append(drawable);
            sb.append(", enterAnimation=");
            sb.append(this.f99732b);
            sb.append(", exitAnimation=");
            return C4277b.a(this.f99733c, ")", sb);
        }
    }

    public final Object a(ViewBinding viewBinding, Continuation continuation) {
        C6884v c6884v = (C6884v) viewBinding;
        Context context = c6884v.f117155a.getContext();
        c6884v.f117155a.setBackground(this.f99729a.f99731a);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new FloatLayerUIComponentWithBackground$bind$2(this, context, null), continuation);
        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCoroutineScope = Unit.INSTANCE;
        }
        return objCoroutineScope;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C6884v c6884vInflate = C6884v.inflate(layoutInflater, viewGroup, false);
        Context context2 = c6884vInflate.f117155a.getContext();
        this.f99730b = new n(p.inflate(LayoutInflater.from(context2), c6884vInflate.f117155a, true));
        return c6884vInflate;
    }
}
