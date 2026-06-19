package com.bilibili.ship.theseus.united.page.intro.module.relate.ad;

import android.content.Context;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.gripper.api.ad.biz.GAdBizKt;
import com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateService$createCMComponent$contract$1;
import com.bilibili.ship.theseus.united.page.intro.module.relate.z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/ad/RelateCMComponent.class */
@StabilityInferred(parameters = 0)
public final class RelateCMComponent implements UIComponent<a<IAdRelateViewEntry>>, z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DetailRelateService$createCMComponent$contract$1 f101100a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.ad.RelateCMComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/ad/RelateCMComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        Object result;
        final RelateCMComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RelateCMComponent relateCMComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = relateCMComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    public RelateCMComponent(@NotNull DetailRelateService$createCMComponent$contract$1 detailRelateService$createCMComponent$contract$1) {
        this.f101100a = detailRelateService$createCMComponent$contract$1;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Type inference failed for: r0v10, types: [V extends com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry, com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry] */
    /* JADX WARN: Type inference failed for: r0v14, types: [V extends com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry, com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry] */
    /* JADX WARN: Type inference failed for: r0v25, types: [V extends com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry, com.bilibili.adcommon.basic.IAdViewEntry, com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bilibili.ship.theseus.united.page.intro.module.relate.ad.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.intro.module.relate.ad.a<com.bilibili.gripper.api.ad.biz.videodetail.relate.IAdRelateViewEntry> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.intro.module.relate.ad.RelateCMComponent.bindToView(com.bilibili.ship.theseus.united.page.intro.module.relate.ad.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        IAdRelateViewEntry adRelateView = viewGroup != null ? GAdBizKt.getGAdVideoDetail().getRelate().getAdRelateView(viewGroup, GAdBizKt.getGAdVideoDetail().getRelate().getAdViewType(this.f101100a.f100928c.getCm()), true) : null;
        IAdRelateViewEntry aVar = adRelateView;
        if (adRelateView == null) {
            aVar = new jZ.a(new Space(context));
        }
        return new a(aVar);
    }

    @NotNull
    public final Object viewReusingKey() {
        return new Pair(super.viewReusingKey(), Integer.valueOf(GAdBizKt.getGAdVideoDetail().getRelate().getAdViewType(this.f101100a.f100928c.getCm())));
    }
}
