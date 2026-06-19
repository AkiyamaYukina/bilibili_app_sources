package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import android.content.Context;
import android.graphics.pdf.PdfRenderer;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import eu0.C6991j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/i.class */
@StabilityInferred(parameters = 0)
public final class i implements UIComponent<UIComponent.b<ComposeView>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f89218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89219b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/i$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6991j f89220a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public PdfRenderer f89222c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final MutableState<Status> f89221b = SnapshotStateKt.mutableStateOf$default(Status.Loading, null, 2, null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f89223d = "";

        public a(@NotNull C6991j c6991j) {
            this.f89220a = c6991j;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/i$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f89224a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Status.Error.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[Status.Finished.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f89224a = iArr;
        }
    }

    public i(@NotNull a aVar) {
        this.f89218a = aVar;
    }

    public final Object bindToView(UIComponent.ViewEntry viewEntry, Continuation continuation) {
        final UIComponent.b bVar = (UIComponent.b) viewEntry;
        final Context context = ((ComposeView) bVar.a).getContext();
        ((ComposeView) bVar.a).setContent(ComposableLambdaKt.composableLambdaInstance(-1157708159, true, new Function2(this, bVar, context) { // from class: com.bilibili.ship.theseus.cheese.biz.catalog.panels.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final i f89215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UIComponent.b f89216b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Context f89217c;

            {
                this.f89215a = this;
                this.f89216b = bVar;
                this.f89217c = context;
            }

            public final Object invoke(Object obj, Object obj2) {
                Context context2 = this.f89217c;
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1157708159, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.catalog.panels.CheeseCoursewarePreviewPanel.bindToView.<anonymous> (CheeseCoursewarePreviewPanel.kt:141)");
                    }
                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-895100871, true, new Function2(this.f89215a, this.f89216b, context2) { // from class: com.bilibili.ship.theseus.cheese.biz.catalog.panels.e

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final i f89207a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final UIComponent.b f89208b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final Context f89209c;

                        {
                            this.f89207a = iVar;
                            this.f89208b = bVar;
                            this.f89209c = context2;
                        }

                        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                        /* JADX WARN: Removed duplicated region for block: B:45:0x0315  */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x0382  */
                        /* JADX WARN: Removed duplicated region for block: B:80:0x057c  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) throws kotlin.NoWhenBranchMatchedException {
                            /*
                                Method dump skipped, instruction units count: 1659
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.panels.e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, composer, 54), composer, 384, 3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }
        }));
        return Unit.INSTANCE;
    }

    public final UIComponent.ViewEntry createViewEntry(Context context, ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        this.f89219b = viewGroup != null ? viewGroup.getHeight() : 0;
        return new UIComponent.b(composeView);
    }
}
