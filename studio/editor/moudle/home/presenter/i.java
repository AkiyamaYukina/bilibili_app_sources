package com.bilibili.studio.editor.moudle.home.presenter;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import com.mall.ui.composePage.circlePublish.CirclePublishViewModel;
import com.mall.ui.composePage.circlePublish.view.ImageUploadKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/home/presenter/i.class */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f107247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f107248c;

    public /* synthetic */ i(int i7, Object obj, Object obj2) {
        this.f107246a = i7;
        this.f107247b = obj;
        this.f107248c = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f107246a) {
            case 0:
                ((j) this.f107247b).b((EditVideoInfo) this.f107248c, ((Boolean) obj).booleanValue(), (String) obj2, (String) obj3);
                break;
            default:
                Context context = (Context) this.f107248c;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1667943584, iIntValue, -1, "com.mall.ui.composePage.circlePublish.view.ImageUpload.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ImageUpload.kt:100)");
                    }
                    CirclePublishViewModel circlePublishViewModel = (CirclePublishViewModel) this.f107247b;
                    if (circlePublishViewModel.H.size() < 18) {
                        composer.startReplaceGroup(-1230612864);
                        ImageUploadKt.a(context, circlePublishViewModel, composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-1230549438);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
