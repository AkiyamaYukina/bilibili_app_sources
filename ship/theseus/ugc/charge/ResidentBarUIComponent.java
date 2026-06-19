package com.bilibili.ship.theseus.ugc.charge;

import Vu0.K;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.bilibili.app.gemini.ui.m;
import com.bilibili.bililive.room.ui.input.view.d0;
import com.bilibili.lib.theme.R$color;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.videopage.common.widget.view.ExpandableTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ResidentBarUIComponent.class */
@StabilityInferred(parameters = 0)
public final class ResidentBarUIComponent extends m<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ResidentBar f96428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d0 f96429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final b f96430c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ResidentBarUIComponent$a.class */
    public static final class a extends ExpandableTextView.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f96431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f96432c;

        public a(String str, Context context) {
            this.f96431b = str;
            this.f96432c = context;
        }

        public final CharSequence a() {
            String str = this.f96431b;
            if (StringsKt.isBlank(str)) {
                return "";
            }
            int color = ContextCompat.getColor(this.f96432c, R$color.Wh0_u);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 18);
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 18);
            return spannableString;
        }

        public final float c(Paint paint) {
            CharSequence charSequenceB = b();
            if (charSequenceB == null || StringsKt.isBlank(charSequenceB) || paint == null) {
                return 0.0f;
            }
            return paint.measureText(charSequenceB, 0, charSequenceB.length());
        }
    }

    public ResidentBarUIComponent(@NotNull ResidentBar residentBar, @NotNull d0 d0Var, @NotNull b bVar) {
        this.f96428a = residentBar;
        this.f96429b = d0Var;
        this.f96430c = bVar;
    }

    public final ViewBinding b(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return K.inflate(LayoutInflater.from(context), viewGroup, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull Vu0.K r15, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r16) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.charge.ResidentBarUIComponent.a(Vu0.K, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
