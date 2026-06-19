package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.droid.DimenUtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/d.class */
public interface InterfaceC6308d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f101173a = a.f101174a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/d$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f101174a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f101175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f101176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f101177d;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ship.theseus.united.page.intro.module.relate.d$a, java.lang.Object] */
        static {
            DimenUtilsKt.dpToPx(35);
            f101175b = DimenUtilsKt.dpToPx(52);
            f101176c = DimenUtilsKt.dpToPx(69);
            f101177d = DimenUtilsKt.dpToPx(86);
        }

        @NotNull
        public static C6306c a(@NotNull Context context) {
            return new C6306c(com.bilibili.playerbizcommonv2.utils.g.a(context.getResources().getDimension(2131165764)), com.bilibili.playerbizcommonv2.utils.g.a(context.getResources().getDimension(2131165763)));
        }

        public static boolean b(View view, List list) {
            boolean z6 = false;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    z6 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (view.findViewById(((Number) it.next()).intValue()).getVisibility() == 0) {
                        z6 = true;
                        break;
                    }
                }
            }
            return z6;
        }

        public static void c(View view, List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    View viewFindViewById = view.findViewById(((Number) it.next()).intValue());
                    if (viewFindViewById != null) {
                        Lazy lazy = com.bilibili.playerbizcommonv2.utils.p.f81943a;
                        viewFindViewById.setVisibility(8);
                    }
                }
            }
        }

        public static void d(@NotNull View view, @NotNull C6306c c6306c) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            float f7 = c6306c.f101144a;
            if (f7 > 0.0f) {
                layoutParams.width = DimenUtilsKt.dpToPx(f7);
            }
            float f8 = c6306c.f101145b;
            if (f8 > 0.0f) {
                layoutParams.height = RangesKt.coerceAtLeast(DimenUtilsKt.dpToPx(f8), f101175b);
            }
            view.setLayoutParams(layoutParams);
        }
    }
}
