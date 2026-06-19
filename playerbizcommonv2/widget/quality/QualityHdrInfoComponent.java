package com.bilibili.playerbizcommonv2.widget.quality;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.lib.config.BLRemoteConfig;
import com.bilibili.lib.mod.ModResource;
import com.bilibili.mediautils.FileUtils;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityHdrInfoComponent.class */
@StabilityInferred(parameters = 0)
public final class QualityHdrInfoComponent implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<HDRType, Unit> f82714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<String, Unit> f82715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<ScreenModeType> f82717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f82718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public HDRType f82719f;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.QualityHdrInfoComponent$bindToView$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityHdrInfoComponent$bindToView$1.class */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;
        final QualityHdrInfoComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(QualityHdrInfoComponent qualityHdrInfoComponent, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = qualityHdrInfoComponent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindToView(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QualityHdrInfoComponent(@NotNull Function1<? super HDRType, Unit> function1, @NotNull Function1<? super String, Unit> function12, @NotNull Function0<Unit> function0, @NotNull Function0<? extends ScreenModeType> function02) {
        this.f82714a = function1;
        this.f82715b = function12;
        this.f82716c = function0;
        this.f82717d = function02;
        String string = BLRemoteConfig.getInstance().getString("HDR_entrance_url");
        this.f82718e = string == null ? "" : string;
        this.f82719f = HDRType.UNKNOW;
    }

    public static final String b(ModResource modResource, String str) {
        File fileRetrieveFile = modResource.retrieveFile(str);
        String path = fileRetrieveFile != null ? fileRetrieveFile.getPath() : null;
        String str2 = path;
        if (path == null) {
            str2 = "";
        }
        return FileUtils.SCHEME_FILE.concat(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindToView(@org.jetbrains.annotations.NotNull com.bilibili.app.gemini.ui.UIComponent.b<androidx.compose.ui.platform.ComposeView> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.quality.QualityHdrInfoComponent.bindToView(com.bilibili.app.gemini.ui.UIComponent$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final UIComponent.b<ComposeView> createViewEntry(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new UIComponent.b<>(composeView);
    }
}
