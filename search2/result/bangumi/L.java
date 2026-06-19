package com.bilibili.search2.result.bangumi;

import Bl.r0;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.image2.bean.ImageInfo;
import com.bilibili.lib.image2.bean.ImageLoadingListener;
import com.bilibili.search2.api.SearchOgvChannelItem;
import dt0.AbstractC6843f;
import java.util.Map;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/L.class */
@StabilityInferred(parameters = 0)
public final class L extends AbstractC6843f<SearchOgvChannelItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final r0 f87350a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/L$a.class */
    public static final class a implements com.bilibili.search2.share.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final L f87351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FragmentActivity f87352b;

        public a(L l7, FragmentActivity fragmentActivity) {
            this.f87351a = l7;
            this.f87352b = fragmentActivity;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
        /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
        @Override // com.bilibili.search2.share.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instruction units count: 570
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.L.a.a():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/L$b.class */
    public static final class b implements ImageLoadingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0 f87353a;

        public b(r0 r0Var) {
            this.f87353a = r0Var;
        }

        public final void onImageSet(ImageInfo imageInfo) {
            super.onImageSet(imageInfo);
            this.f87353a.e.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public L(@NotNull r0 r0Var) {
        super(r0Var.a);
        this.f87350a = r0Var;
        this.itemView.setOnClickListener(new F(this, 0));
        r0Var.h.setOnClickListener(new G(this, 0));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x033e  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.L.bind():void");
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View getClickStatusView() {
        return this.f87350a.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    @Override // dt0.AbstractC6843f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCardExpose() {
        /*
            r11 = this;
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchOgvChannelItem r0 = (com.bilibili.search2.api.SearchOgvChannelItem) r0
            boolean r0 = r0.isExposed()
            if (r0 != 0) goto L38
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchOgvChannelItem r0 = (com.bilibili.search2.api.SearchOgvChannelItem) r0
            r14 = r0
            r0 = r11
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            r15 = r0
            r0 = 0
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L2b
            r0 = r15
            int r0 = r0.computeVerticalScrollOffset()
            r12 = r0
            goto L2d
        L2b:
            r0 = 0
            r12 = r0
        L2d:
            r0 = r12
            if (r0 != 0) goto L33
            r0 = 1
            r13 = r0
        L33:
            r0 = r14
            r1 = r13
            r0.setAtFirstScreen(r1)
        L38:
            r0 = r11
            java.lang.String r0 = r0.getModuleType()
            r16 = r0
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.BaseSearchItem r0 = (com.bilibili.search2.api.BaseSearchItem) r0
            r17 = r0
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchOgvChannelItem r0 = (com.bilibili.search2.api.SearchOgvChannelItem) r0
            Ps0.X r0 = r0.getBikanDegree()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L6a
            r0 = r14
            java.util.Map r0 = r0.d()
            r15 = r0
            r0 = r15
            r14 = r0
            r0 = r15
            if (r0 != 0) goto L67
            goto L6a
        L67:
            goto L71
        L6a:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r14 = r0
            goto L67
        L71:
            java.lang.String r0 = "search.search-result.search-card.all.show"
            r1 = r16
            r2 = r17
            r3 = 0
            r4 = r14
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1000(0x3e8, float:1.401E-42)
            Xs0.b.k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.L.onCardExpose():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(String str, String str2, Map<String, String> map) {
        if (str2 != null && !StringsKt.isBlank(str2)) {
            Os0.e.g(Os0.e.f18030a, this.itemView.getContext(), str2);
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchOgvChannelItem) getData()).getLinkType(), (SearchOgvChannelItem) getData(), null, null, str, null, null, map, false, null, 7088);
        clickWithRefreshStatus();
    }
}
