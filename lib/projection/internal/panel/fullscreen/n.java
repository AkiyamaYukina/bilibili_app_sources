package com.bilibili.lib.projection.internal.panel.fullscreen;

import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig;
import com.bilibili.lib.projection.internal.widget.e;
import he0.C7433b;
import kotlin.text.StringsKt;
import le0.C7838f;
import le0.InterfaceC7845m;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/panel/fullscreen/n.class */
public final class n implements e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProjectionFullScreenActivity f63425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.lib.projection.internal.widget.e f63426b;

    public n(ProjectionFullScreenActivity projectionFullScreenActivity, com.bilibili.lib.projection.internal.widget.e eVar) {
        this.f63425a = projectionFullScreenActivity;
        this.f63426b = eVar;
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final void a() {
        this.f63425a.f63374W = true;
        BLog.d("ProjectionFullScreenActivity", "ProjectionFullScreenActivity-onBubbleShowSuccess");
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final void b() {
    }

    @Override // com.bilibili.lib.projection.internal.widget.e.b
    public final boolean c() {
        boolean z6;
        int i7 = ProjectionFullScreenActivity.f63352c1;
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63425a;
        projectionFullScreenActivity.getClass();
        if (Ie0.d.g() || projectionFullScreenActivity.f63373V == null) {
            z6 = false;
        } else {
            InterfaceC7845m interfaceC7845m = projectionFullScreenActivity.f63357F;
            z6 = false;
            if (interfaceC7845m != null) {
                C7838f.a aVarI = interfaceC7845m.i();
                z6 = false;
                if (aVarI != null) {
                    z6 = aVarI.c() == null ? false : !C7433b.b(r0);
                }
            }
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
        ProjectionFullScreenActivity projectionFullScreenActivity = this.f63425a;
        com.bilibili.lib.projection.internal.widget.e eVar = projectionFullScreenActivity.f63362K;
        if (eVar == null || (contentView = eVar.getContentView()) == null || (biliImageViewFindViewById = contentView.findViewById(2131309479)) == null) {
            return;
        }
        ProjectionOperationConfig.ThirdProjBubbleConfig thirdProjBubbleConfig = projectionFullScreenActivity.f63373V;
        String pic = thirdProjBubbleConfig != null ? thirdProjBubbleConfig.getPic() : null;
        if (pic == null || StringsKt.isBlank(pic)) {
            biliImageViewFindViewById.setBackground(ResourcesCompat.getDrawable(projectionFullScreenActivity.getResources(), 2131232594, projectionFullScreenActivity.getTheme()));
        } else {
            BiliImageLoader.INSTANCE.with(projectionFullScreenActivity).url(pic).into(biliImageViewFindViewById);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    @Override // com.bilibili.lib.projection.internal.widget.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.lib.projection.internal.panel.fullscreen.ProjectionFullScreenActivity r0 = r0.f63425a
            r4 = r0
            r0 = r4
            com.bilibili.lib.projection.internal.widget.e r0 = r0.f63362K
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L60
            r0 = r5
            android.view.View r0 = r0.getContentView()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L60
            r0 = r5
            r1 = 2131309480(0x7f0933a8, float:1.8237245E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L28
            goto L60
        L28:
            r0 = r4
            com.bilibili.lib.projection.internal.api.model.ProjectionOperationConfig$ThirdProjBubbleConfig r0 = r0.f63373V
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L39
            r0 = r4
            java.lang.String r0 = r0.getDesc()
            r4 = r0
            goto L3b
        L39:
            r0 = 0
            r4 = r0
        L3b:
            r0 = r4
            if (r0 == 0) goto L48
            r0 = r4
            r5 = r0
            r0 = r4
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L5b
        L48:
            r0 = r3
            com.bilibili.lib.projection.internal.widget.e r0 = r0.f63426b
            android.view.View r0 = r0.getContentView()
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131833721(0x7f113379, float:1.9300532E38)
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
        L5b:
            r0 = r6
            r1 = r5
            r0.setText(r1)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.panel.fullscreen.n.f():void");
    }
}
