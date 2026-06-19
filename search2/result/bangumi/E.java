package com.bilibili.search2.result.bangumi;

import Bl.q0;
import Ps0.X;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.bilibili.app.comm.list.common.utils.ColorTagHandler;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.droid.TypeFaceHelper;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.api.SearchOgvChannelItem;
import com.bilibili.search2.api.Tag;
import com.bilibili.search2.utils.CoverAspectRatio;
import dt0.AbstractC6843f;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/E.class */
@StabilityInferred(parameters = 0)
public final class E extends AbstractC6843f<SearchOgvChannelItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final q0 f87337a;

    /* JADX WARN: Multi-variable type inference failed */
    public E(@NotNull q0 q0Var) {
        super(q0Var.a);
        this.f87337a = q0Var;
        this.itemView.setOnClickListener(new com.bilibili.ad.adview.widget.E(this, 2));
        q0Var.f.setOnClickListener(new com.bilibili.bililive.biz.rights.fansprivileges.buttons.a(this, 1));
        q0Var.g.setOnClickListener(new JI0.a(this, 2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dt0.AbstractC6839b
    public final void bind() throws NoWhenBranchMatchedException {
        String text;
        Tag tag;
        Float floatOrNull;
        q0 q0Var = this.f87337a;
        com.bilibili.search2.utils.s.c(q0Var.d, this.itemView.getContext(), CoverAspectRatio.RATIO_3_4, false, true, true, 10);
        com.bilibili.search2.utils.extension.c.a(q0Var.d, ((SearchOgvChannelItem) getData()).getCover(), null, false, null, null, 0, 0, 254);
        int i7 = 0;
        q0Var.m.setText(ColorTagHandler.decode$default(this.itemView.getContext(), ((SearchOgvChannelItem) getData()).getTitle(), 0, 4, (Object) null));
        X watchButton = ((SearchOgvChannelItem) getData()).getWatchButton();
        com.bilibili.search2.utils.B.A(q0Var.f, watchButton != null ? watchButton.g() : null);
        SearchBangumiItem.PurchaseButton purchaseButton = ((SearchOgvChannelItem) getData()).getPurchaseButton();
        com.bilibili.search2.utils.B.A(q0Var.g, purchaseButton != null ? purchaseButton.getText() : null);
        String rating = ((SearchOgvChannelItem) getData()).getRating();
        float fFloatValue = (rating == null || (floatOrNull = StringsKt.toFloatOrNull(rating)) == null) ? 0.0f : floatOrNull.floatValue();
        final X bikanDegree = ((SearchOgvChannelItem) getData()).getBikanDegree();
        Group group = q0Var.i;
        ComposeView composeView = q0Var.b;
        if (bikanDegree != null && bikanDegree.h()) {
            group.setVisibility(8);
            composeView.setVisibility(0);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(2029354, true, new Function2(bikanDegree, this) { // from class: com.bilibili.search2.result.bangumi.B

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final X f87330a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final E f87331b;

                {
                    this.f87330a = bikanDegree;
                    this.f87331b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2029354, iIntValue, -1, "com.bilibili.search2.result.bangumi.SearchOgvChannelNewHolder.bind.<anonymous>.<anonymous> (SearchOgvChannelNewHolder.kt:100)");
                        }
                        final int i8 = 0;
                        final X x6 = this.f87330a;
                        final E e7 = this.f87331b;
                        BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-2130892062, true, new Function2(i8, x6, e7) { // from class: com.bilibili.search2.result.bangumi.C

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final int f87332a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final Object f87333b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final Object f87334c;

                            {
                                this.f87332a = i8;
                                this.f87333b = x6;
                                this.f87334c = e7;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:31:0x011b  */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
                            /* JADX WARN: Removed duplicated region for block: B:41:0x015f  */
                            /* JADX WARN: Removed duplicated region for block: B:44:0x01ab  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x01ba  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
                                /*
                                    Method dump skipped, instruction units count: 548
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.C.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
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
        } else if (fFloatValue > 0.0f) {
            Typeface typefaceCreateFromAsset = TypeFaceHelper.createFromAsset(this.itemView.getContext(), "xx-DIN-Regular.ttf");
            group.setVisibility(0);
            composeView.setVisibility(8);
            TintTextView tintTextView = q0Var.h;
            tintTextView.setTypeface(typefaceCreateFromAsset);
            tintTextView.setText(this.itemView.getResources().getString(2131834295, Float.valueOf(fFloatValue)));
            q0Var.c.setText(((SearchOgvChannelItem) getData()).getDesc());
        } else {
            group.setVisibility(8);
            composeView.setVisibility(8);
        }
        List<Tag> badgesV2 = ((SearchOgvChannelItem) getData()).getBadgesV2();
        if (badgesV2 != null && (tag = badgesV2.get(0)) != null) {
            String text2 = tag.getText();
            TagView tagView = q0Var.e;
            if (text2 == null || StringsKt.isBlank(text2)) {
                ListExtentionsKt.gone(tagView);
            } else {
                tagView.tagBuilder().setTagText(tag.getText()).setTagTextColor(tag.getTextColor()).setTagNightTextColor(tag.getTextColorNight()).setTagBackgroundColor(tag.getBgColor()).setTagNightBackgroundColor(tag.getBgColorNight()).setTagBorderColor(tag.getBorderColor()).setTagNightBorderColor(tag.getBorderColorNight()).setTagBackgroundStyle(tag.getBgStyle()).applyToView();
                ListExtentionsKt.visible(tagView);
            }
        }
        String stylesV2 = ((SearchOgvChannelItem) getData()).getStylesV2();
        SpannableString spannableString = null;
        if (stylesV2 != null) {
            if (!StringsKt.isBlank(stylesV2)) {
                SpannableString spannableString2 = new SpannableString(stylesV2);
                int color = ContextCompat.getColor(this.itemView.getContext(), R$color.Ga3);
                int i8 = 0;
                while (true) {
                    int i9 = i8;
                    spannableString = spannableString2;
                    if (i7 >= stylesV2.length()) {
                        break;
                    }
                    char cCharAt = stylesV2.charAt(i7);
                    int i10 = i9 + 1;
                    if (cCharAt == '|') {
                        spannableString2.setSpan(new ForegroundColorSpan(color), i9, i10, 17);
                    }
                    i7++;
                    i8 = i10;
                }
            } else {
                spannableString = null;
            }
        }
        q0Var.k.setText(spannableString);
        q0Var.l.setText(((SearchOgvChannelItem) getData()).getStaff());
        Tag styleLabel = ((SearchOgvChannelItem) getData()).getStyleLabel();
        TagView tagView2 = q0Var.j;
        if (styleLabel == null || (text = styleLabel.getText()) == null || StringsKt.isBlank(text)) {
            ListExtentionsKt.gone(tagView2);
        } else {
            tagView2.tagBuilder().setTagText(styleLabel.getText()).setTagTextColor(styleLabel.getTextColor()).setTagNightTextColor(styleLabel.getTextColorNight()).setTagBackgroundColor(styleLabel.getBgColor()).setTagNightBackgroundColor(styleLabel.getBgColorNight()).setTagBorderColor(styleLabel.getBorderColor()).setTagNightBorderColor(styleLabel.getBorderColorNight()).setTagBackgroundStyle(styleLabel.getBgStyle()).applyToView();
            ListExtentionsKt.visible(tagView2);
        }
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View getClickStatusView() {
        return this.f87337a.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
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
            if (r0 != 0) goto L37
            r0 = r11
            java.lang.Object r0 = r0.getData()
            com.bilibili.search2.api.SearchOgvChannelItem r0 = (com.bilibili.search2.api.SearchOgvChannelItem) r0
            r15 = r0
            r0 = r11
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            r14 = r0
            r0 = 0
            r13 = r0
            r0 = r14
            if (r0 == 0) goto L29
            r0 = r14
            int r0 = r0.computeVerticalScrollOffset()
            r12 = r0
            goto L2b
        L29:
            r0 = 0
            r12 = r0
        L2b:
            r0 = r12
            if (r0 != 0) goto L31
            r0 = 1
            r13 = r0
        L31:
            r0 = r15
            r1 = r13
            r0.setAtFirstScreen(r1)
        L37:
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
            if (r0 == 0) goto L69
            r0 = r14
            java.util.Map r0 = r0.d()
            r15 = r0
            r0 = r15
            r14 = r0
            r0 = r15
            if (r0 != 0) goto L66
            goto L69
        L66:
            goto L70
        L69:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r14 = r0
            goto L66
        L70:
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.bangumi.E.onCardExpose():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(String str, String str2, Map<String, String> map) {
        if (str2 != null && (!StringsKt.isBlank(str2))) {
            Os0.e.g(Os0.e.f18030a, this.itemView.getContext(), str2);
        }
        Xs0.b.i("search.search-result.search-card.all.click", null, ((SearchOgvChannelItem) getData()).getLinkType(), (SearchOgvChannelItem) getData(), null, null, str, null, null, map, false, null, 7088);
        clickWithRefreshStatus();
    }
}
