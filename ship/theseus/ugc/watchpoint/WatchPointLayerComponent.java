package com.bilibili.ship.theseus.ugc.watchpoint;

import Vu0.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.n;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerComponent.class */
@StabilityInferred(parameters = 0)
public final class WatchPointLayerComponent implements UIComponent<n<t>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f98566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f98567b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f98568c = new c(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerComponent$a.class */
    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f98569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WatchPointLayerComponent f98570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinearLayoutManager f98571c;

        public a(ImageView imageView, WatchPointLayerComponent watchPointLayerComponent, LinearLayoutManager linearLayoutManager) {
            this.f98569a = imageView;
            this.f98570b = watchPointLayerComponent;
            this.f98571c = linearLayoutManager;
        }

        @Override // com.bilibili.ship.theseus.ugc.watchpoint.b
        public final void a(int i7) {
            if (this.f98570b.f98567b) {
                this.f98571c.scrollToPositionWithOffset(i7, 0);
            }
        }

        @Override // com.bilibili.ship.theseus.ugc.watchpoint.b
        public final void b() {
            this.f98569a.setSelected(this.f98570b.f98566a.a());
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final WatchPointLayerComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WatchPointLayerComponent watchPointLayerComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = watchPointLayerComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    public WatchPointLayerComponent(@NotNull g gVar) {
        this.f98566a = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v103, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.widget.ImageView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.n<Vu0.t> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.watchpoint.WatchPointLayerComponent.bindToView(com.bilibili.app.gemini.ui.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        return new n(t.inflate(LayoutInflater.from(context), viewGroup, false));
    }
}
