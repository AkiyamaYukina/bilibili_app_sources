package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ou0.C8266a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/H.class */
public final class H {
    public static final void a(@NotNull RecyclerView recyclerView, @Nullable TextView textView, @NotNull F f7, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Integer, Unit> function12) {
        if (((ArrayList) f7.f89842b).isEmpty()) {
            recyclerView.setVisibility(8);
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            recyclerView.setVisibility(0);
            if (textView != null) {
                String str = f7.f89841a;
                if (str.length() > 0) {
                    textView.setText(str);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (Object obj : f7.f89842b) {
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (((G) obj).f89845c) {
                i7 = i8;
            }
            i8++;
        }
        Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(new v(f7.f89842b, function1, function12));
        C8266a c8266a = new C8266a(context);
        c8266a.setTargetPosition(i7);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(c8266a);
        }
    }
}
