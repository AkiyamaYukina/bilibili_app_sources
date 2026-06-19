package com.bilibili.search2.result.bangumi;

import Ps0.InterfaceC2789j;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/u.class */
@StabilityInferred(parameters = 0)
public class u<T extends InterfaceC2789j> extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T f87462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TagView f87463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TintTextView f87464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f87465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function2<? super T, ? super Integer, Unit> f87466e;

    public u(@NotNull View view) {
        super(view);
        this.f87463b = view.findViewById(2131308551);
        this.f87464c = (TintTextView) view.findViewById(2131308958);
        this.f87465d = (ImageView) view.findViewById(2131304345);
        view.setOnClickListener(new OS0.J(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p0(@org.jetbrains.annotations.NotNull T r7, boolean r8, int r9) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.u.p0(Ps0.j, boolean, int):void");
    }
}
