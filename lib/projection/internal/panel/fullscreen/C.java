package com.bilibili.lib.projection.internal.panel.fullscreen;

import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import com.bilibili.lib.projection.internal.widget.e;
import he0.C7433b;
import ie0.C7564c;
import kotlin.text.StringsKt;
import le0.InterfaceC7845m;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/C.class */
public final class C implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f63339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.lib.projection.internal.widget.e f63340b;

    public C(w wVar, com.bilibili.lib.projection.internal.widget.e eVar) {
        this.f63339a = wVar;
        this.f63340b = eVar;
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final void a() {
        InterfaceC7845m client;
        com.bilibili.lib.projection.internal.reporter.a aVar = C7564c.f121634k;
        w wVar = this.f63339a;
        ProjectionOperationConfig.ThirdProjBubbleConfig thirdProjBubbleConfig = wVar.f63453r;
        String id = thirdProjBubbleConfig != null ? thirdProjBubbleConfig.getId() : null;
        InterfaceC7845m interfaceC7845m = wVar.f63441e;
        ProjectionDeviceInternal projectionDeviceInternalC = interfaceC7845m.i().c();
        com.bilibili.lib.projection.internal.device.a aVarS = interfaceC7845m.s();
        IProjectionItem iProjectionItemN = (aVarS == null || (client = aVarS.getClient()) == null) ? null : client.n(true);
        aVar.g(id, projectionDeviceInternalC, iProjectionItemN instanceof StandardProjectionItem ? (StandardProjectionItem) iProjectionItemN : null, null);
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final void b() {
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final boolean c() {
        ProjectionDeviceInternal projectionDeviceInternalC;
        w wVar = this.f63339a;
        wVar.getClass();
        boolean z6 = false;
        if (!Ie0.d.g() && wVar.f63453r != null && (projectionDeviceInternalC = wVar.f63441e.i().c()) != null) {
            z6 = !C7433b.b(projectionDeviceInternalC);
        }
        return z6;
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final void d() {
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final void e() {
        View contentView;
        BiliImageView biliImageViewFindViewById;
        w wVar = this.f63339a;
        com.bilibili.lib.projection.internal.widget.e eVar = wVar.f63454s;
        if (eVar == null || (contentView = eVar.getContentView()) == null || (biliImageViewFindViewById = contentView.findViewById(2131309479)) == null) {
            return;
        }
        ProjectionOperationConfig.ThirdProjBubbleConfig thirdProjBubbleConfig = wVar.f63453r;
        String pic = thirdProjBubbleConfig != null ? thirdProjBubbleConfig.getPic() : null;
        if (pic != null && !StringsKt.isBlank(pic)) {
            com.bilibili.ad.adview.videodetail.relate.card92.c.a(BiliImageLoader.INSTANCE, wVar.f63440d, pic, biliImageViewFindViewById);
        } else {
            com.bilibili.lib.projection.internal.widget.e eVar2 = this.f63340b;
            biliImageViewFindViewById.setBackground(ResourcesCompat.getDrawable(eVar2.getContentView().getResources(), 2131232594, eVar2.getContentView().getContext().getTheme()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    @Override // com.bilibili.lib.projection.internal.widget.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.lib.projection.internal.panel.fullscreen.w r0 = r0.f63339a
            r6 = r0
            r0 = r6
            com.bilibili.lib.projection.internal.widget.e r0 = r0.f63454s
            r5 = r0
            r0 = 0
            r4 = r0
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r5
            android.view.View r0 = r0.getContentView()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L26
            r0 = r5
            r1 = 2131309480(0x7f0933a8, float:1.8237245E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5 = r0
            goto L28
        L26:
            r0 = 0
            r5 = r0
        L28:
            r0 = r6
            com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig$ThirdProjBubbleConfig r0 = r0.f63453r
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L36
            r0 = r6
            java.lang.String r0 = r0.getDesc()
            r4 = r0
        L36:
            r0 = r4
            if (r0 == 0) goto L43
            r0 = r4
            r6 = r0
            r0 = r4
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L56
        L43:
            r0 = r3
            com.bilibili.lib.projection.internal.widget.e r0 = r0.f63340b
            android.view.View r0 = r0.getContentView()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131833721(0x7f113379, float:1.9300532E38)
            java.lang.String r0 = r0.getString(r1)
            r6 = r0
        L56:
            r0 = r5
            if (r0 == 0) goto L5f
            r0 = r5
            r1 = r6
            r0.setText(r1)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.panel.fullscreen.C.f():void");
    }
}
