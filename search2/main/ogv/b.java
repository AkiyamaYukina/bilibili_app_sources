package com.bilibili.search2.main.ogv;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import com.bilibili.search2.main.ogv.a;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/ogv/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f86861a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f86862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f86863c;

    public static void a(@NotNull Canvas canvas, @NotNull View view, @NotNull a aVar, @NotNull Paint paint) {
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (bVar.f86858b > 0) {
                int[] iArr = f86861a;
                view.getLocationOnScreen(iArr);
                float f7 = iArr[1];
                float f8 = -f7;
                float f9 = bVar.f86858b - f7;
                if (f9 <= 0.0f || f8 >= view.getHeight()) {
                    int i7 = f86863c;
                    if (i7 < 20) {
                        f86863c = i7 + 1;
                        return;
                    }
                    return;
                }
                int i8 = f86862b;
                if (i8 < 40) {
                    f86862b = i8 + 1;
                }
                float fCoerceIn = RangesKt.coerceIn(bVar.f86859c, 0.0f, 1.0f);
                float f10 = 255;
                int iRoundToInt = MathKt.roundToInt(fCoerceIn * f10);
                int i9 = bVar.f86857a;
                paint.setShader(new LinearGradient(0.0f, f8, 0.0f, f9, (iRoundToInt << 24) | (i9 & ViewCompat.MEASURED_SIZE_MASK), (i9 & ViewCompat.MEASURED_SIZE_MASK) | (MathKt.roundToInt(RangesKt.coerceIn(bVar.f86860d, 0.0f, 1.0f) * f10) << 24), Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), paint);
                paint.setShader(null);
                return;
            }
        }
        int i10 = f86863c;
        if (i10 < 20) {
            f86863c = i10 + 1;
        }
    }
}
