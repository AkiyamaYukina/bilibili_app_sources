package com.bilibili.pegasus.fakepegasus;

import android.content.Context;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.pegasus.api.modelv2.SmallCoverV2Item;
import com.bilibili.pegasus.utils.x;
import gl.J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u00.s;
import u00.y;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/i.class */
@StabilityInferred(parameters = 0)
public final class i extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final J f77459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ViewStub f77460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewStub f77461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SmallCoverV2Item f77462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Fragment f77463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77464f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/fakepegasus/i$a.class */
    public static final class a extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77465b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Lifecycle lifecycle, String str) {
            super(lifecycle);
            this.f77465b = str;
        }

        public final void b() {
            y yVar = (y) BLRouter.get$default(BLRouter.INSTANCE, y.class, (String) null, 2, (Object) null);
            if (yVar != null) {
                yVar.d(this);
            }
            e.a();
            BLRouter.routeTo$default(new RouteRequest.Builder(this.f77465b).extras(new RX0.g(1)).build(), (Context) null, 2, (Object) null);
        }
    }

    public i(@NotNull J j7) {
        super(j7.a);
        this.f77459a = j7;
        x.a aVar = x.f78893a;
        this.f77460b = (ViewStub) this.itemView.findViewById(2131299661);
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(2131312415);
        this.f77461c = viewStub;
        this.f77464f = -1;
        this.itemView.setOnClickListener(new PN.b(this, 1));
        if (androidx.appcompat.app.n.a(Thread.currentThread())) {
            return;
        }
        viewStub.inflate();
    }
}
